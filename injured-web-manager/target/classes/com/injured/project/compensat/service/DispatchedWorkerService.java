package com.injured.project.compensat.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.injured.project.system.agencyLevel.service.AgencyUnderService;
import com.injured.project.system.user.domain.CompanyAgencyId;
import com.injured.project.system.user.domain.FastReviewedUser;
import com.injured.project.system.user.domain.User;
import com.injured.project.system.user.mapper.UserMapper;
import com.injured.server.api.contract.FastDispatchedWorkerContract;
import com.injured.server.api.entity.CompanyAgency;
import com.injured.server.api.entity.InjuredFastCompensatInfo;
import com.injured.server.api.enums.ReviewStatusEnum;
import com.injured.server.api.enums.UnderLevelEnum;
import com.injured.server.api.model.query.DispatchedWorkerInfo;
import com.injured.server.api.model.query.FastDispatchedWorkerUserNum;

@Component
public class DispatchedWorkerService {
	
	private static Logger logger = LogManager.getLogger(DispatchedWorkerService.class);
	
	public static final List<Long> FAST_REVIEW_MENU = new ArrayList<>();

	static{
		FAST_REVIEW_MENU.add(2004L);
	}
	
	@Reference
	private FastDispatchedWorkerContract fastDispatchedWorkerContract;

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private AgencyUnderService agencyUnderService;
	
	/**
	 * 分配派工人员，并修改任务状态
	 */
	public void doBusiness(String infoIdStr) {
		Long infoId = Long.parseLong(infoIdStr);
		DispatchedWorkerInfo dispatchedWorkerInfo = dispatchedWorker(infoId);
		if(dispatchedWorkerInfo != null) {
			//获取用户名字
			User user = userMapper.selectUserById(dispatchedWorkerInfo.getUserId());
			fastDispatchedWorkerContract.updFastInfoToReviewerId(infoId,dispatchedWorkerInfo.getUserId(),user.getUserName(),dispatchedWorkerInfo.getStatus());
		}
	}
	
	/**
	 * 获取派工信息
	 * @param infoId
	 * @return
	 */
	public DispatchedWorkerInfo dispatchedWorker(Long infoId) {
		
		/**
		 * 查询快赔信息
		 */
		InjuredFastCompensatInfo injuredFastCompensatInfo = fastDispatchedWorkerContract.getDispatchedWorkerInfo(infoId);
		if(injuredFastCompensatInfo == null) {
			logger.info("根据ID获取快赔定损信息未空，ID:{}" , infoId);
			return null;
		}
		
		Long companyId = injuredFastCompensatInfo.getCompanyId();
		Long agencyId = injuredFastCompensatInfo.getCompanyAgencyId();
		if(companyId == null || agencyId == null) {
			logger.info("快赔定损信息不全");
			return null;
		}
		
		int reviewStatus = injuredFastCompensatInfo.getReviewStatus() == null ? 1 : injuredFastCompensatInfo.getReviewStatus();
		if(ReviewStatusEnum.TO_REVIEWED.getCode() != reviewStatus && ReviewStatusEnum.PRIMARY_REVIEWED.getCode() != reviewStatus) {
			logger.info("根据ID获取快赔定损信息审批状态不在派工状态，ID:{}" , infoId);
			return null;
		}
		
		/**
		 * 获取该机构下审核机制
		 */
		Integer underLevel = agencyUnderService.selectAllocatedList(companyId,agencyId, FAST_REVIEW_MENU);		
		logger.info("获取审核机制：{}，{}，{}", agencyId,underLevel);
		if(underLevel != null && UnderLevelEnum.OEN.getCode() != underLevel && UnderLevelEnum.TWO.getCode() != underLevel) {
			logger.info("机构下没有配置审核级别,机构：{}", agencyId);
			return null;
		}

		/**
		 * 初审 终审
		 */
		Integer underLevelParam = UnderLevelEnum.TWO.getCode();

		if(underLevel == UnderLevelEnum.TWO.getCode()){
           if(reviewStatus == ReviewStatusEnum.TO_REVIEWED.getCode()){
			   underLevelParam = UnderLevelEnum.OEN.getCode();
		   }
		}
		/**
		 * 获取保险公司机构下用户信息（用户审批机制）
		 */
		BigDecimal amount = injuredFastCompensatInfo.getFixedLossAmount() == null ? new BigDecimal(0) : injuredFastCompensatInfo.getFixedLossAmount();
		List<FastReviewedUser> fastReviewedUsers = new ArrayList<>();
		recursionAgency(companyId,agencyId,amount,underLevelParam,fastReviewedUsers);
		if(fastReviewedUsers == null || fastReviewedUsers.size() == 0) {
			if(underLevelParam == UnderLevelEnum.OEN.getCode()) {
				underLevelParam = UnderLevelEnum.TWO.getCode();
				List<FastReviewedUser> fastReviewedUsersTwo = new ArrayList<>();
				recursionAgency(companyId, agencyId, amount, underLevelParam, fastReviewedUsersTwo);
				if (fastReviewedUsersTwo == null || fastReviewedUsersTwo.size() == 0) {
					logger.info("初审变终审无可派工用户");
					return null;
				}
				fastReviewedUsers.addAll(fastReviewedUsersTwo);
			}else{
				logger.info("终审无可派工用户");
				return null;
			}
		}
		
		/**
		 * 初次审批人
		 */
		Long firstReviewedUserId = injuredFastCompensatInfo.getReviewerId() == null ? -1L : injuredFastCompensatInfo.getReviewerId();
		
		/**
		 * 获取对应用户下  正在审核数据
		 */
		List<Long> userIds = new ArrayList<>();
		for(FastReviewedUser fastReviewedUser : fastReviewedUsers) {
			if(firstReviewedUserId.longValue() != fastReviewedUser.getUserId().longValue()) {
				userIds.add(fastReviewedUser.getUserId());
			}		
		}
		
		if(userIds == null || userIds.size() == 0) {
			logger.info("一审用户和二审用户是同一个：{}",firstReviewedUserId);
			return null;
		}
		logger.info("派工适用用户：{}" , userIds);
		List<FastDispatchedWorkerUserNum> fastDispatchedWorkerUserNums = fastDispatchedWorkerContract.getUserNum(userIds);
		
		/**
		 * 派工后审批人
		 */
		Long reviewedUserId = null;	
		if(fastDispatchedWorkerUserNums != null && fastDispatchedWorkerUserNums.size() != 0) {
			/**
			 * 取出任务最少用户
			 */
			reviewedUserId = getReviewedUserId(fastDispatchedWorkerUserNums);
		}else {
			/**
			 * 随机取一个
			 */
			Random random = new Random();
			int n = random.nextInt(userIds.size());
			reviewedUserId = userIds.get(n);
		}
		
		/**
		 * 派工后审批状态
		 */
		Integer updReviewStatus = injuredFastCompensatInfo.getReviewStatus();
		if(UnderLevelEnum.OEN.getCode()== underLevelParam) {
			updReviewStatus = ReviewStatusEnum.PRIMARY_REVIEWING.getCode();
		}else if(UnderLevelEnum.TWO.getCode() == underLevelParam) {
			updReviewStatus = ReviewStatusEnum.UITIMATE_REVIEWING.getCode();
		}
		
		DispatchedWorkerInfo dispatchedWorkerInfo = new DispatchedWorkerInfo();
		dispatchedWorkerInfo.setStatus(updReviewStatus);
		dispatchedWorkerInfo.setUserId(reviewedUserId);
		dispatchedWorkerInfo.setInfoId(infoId);
		
		return dispatchedWorkerInfo;
	}
	
	/**
	 * 排序获取任务最少用户
	 * @param fastDispatchedWorkerUserNums
	 * @return
	 */
	public Long getReviewedUserId(List<FastDispatchedWorkerUserNum> fastDispatchedWorkerUserNums) {
		
		Collections.sort(fastDispatchedWorkerUserNums, new Comparator<FastDispatchedWorkerUserNum>() {
			public int compare(FastDispatchedWorkerUserNum o1, FastDispatchedWorkerUserNum o2) {
				return o2.getNum() - o1.getNum();
			}
		});
		
		return fastDispatchedWorkerUserNums.get(0).getUserId();		
	}
	
	/**
	 * 获取派工可用用户  递归
	 * @param companyId
	 * @param agencyId
	 * @param amount
	 * @param underLevel  审核机制
	 * @return
	 */
	public void recursionAgency(Long companyId,Long agencyId,BigDecimal amount,Integer underLevel,List<FastReviewedUser> availableUsers) {
		
		CompanyAgencyId companyAgencyId = new CompanyAgencyId();
		companyAgencyId.setAgencyId(agencyId);
		companyAgencyId.setCompanyId(companyId);
		companyAgencyId.setUnderLevel(underLevel);
		companyAgencyId.setMenuIds(FAST_REVIEW_MENU);
		List<FastReviewedUser> fastReviewedUsers = userMapper.getAvailableUsers(companyAgencyId);
		
		
		if(fastReviewedUsers == null || fastReviewedUsers.size() == 0) {
			
			Long agencyPid = getPidByagencyId(companyId,agencyId);
			if(agencyPid == null) {
				logger.info("最高机构无合适派工用户，保险公司ID:{}，机构ID:{}" , companyId , agencyId);
				return;
			}
			/**
			 * 递归
			 */
			recursionAgency(companyId,agencyPid,amount,underLevel,availableUsers);
		}else {
			/**
			 * 找到合适派工用户
			 * 判断机构审核金额是否在范围内
			 */
			for(FastReviewedUser fastReviewedUser : fastReviewedUsers) {
				String priceScope = fastReviewedUser.getPriceScope();
				if(priceScope != null) {
					if(priceAnalysis(priceScope,amount)) {
						availableUsers.add(fastReviewedUser);
					}
				}
			}
			
			/**
			 * 找到可用用户
			 */
			if(availableUsers != null && availableUsers.size() != 0) {
				return ;
			}
			
			/**
			 * 机构定损额度超过   重新递归
			 */
			Long agencyPid = getPidByagencyId(companyId,agencyId);
			if(agencyPid == null) {
				logger.info("机构定损额度超限，最高机构无合适派工用户，保险公司ID:{}，机构ID:{}" , agencyId , companyId);
				return ;
			}
			/**
			 * 递归
			 */
			recursionAgency(companyId,agencyPid,amount,underLevel,availableUsers);
			
		}		
	}
	
	/**
	 * 获取父机构
	 * @param companyId
	 * @param agencyId
	 * @return
	 */
	public Long getPidByagencyId(Long companyId,Long agencyId) {
		/**
		 * 该机构没有找到合适用户
		 */
		List<CompanyAgency> companyAgencys = fastDispatchedWorkerContract.getAgencys(companyId);
		if(companyAgencys == null || companyAgencys.size() == 0) {
			logger.info("保险公司下无机构，保险公司ID{}",companyId);
			return null;
		}
		
		/**
		 * 获取机构父id
		 */
		Long agencyPid = null;
		for(CompanyAgency companyAgency : companyAgencys) {
			if(agencyId.longValue() == companyAgency.getId().longValue()) {
				agencyPid = companyAgency.getPid();
				break;
			}
		}
		return agencyPid;
	}
	
	/**
	 * 
	 * ">1000,>1000&<=3000,>1000,>1000&<=5000"
	 * 金额解析
	 * @param amount
	 */
	public boolean priceAnalysis(String priceScope,BigDecimal amount) {
		try {
			if(priceScope.contains("&")) {
				String[] ranges = priceScope.split("&");
				String greater = ranges[0].replaceAll(">=", "");
				if(greater.contains(">")){
					greater =  ranges[0].replaceAll(">", "");
				}
				String less = ranges[1].replaceAll("<=", "");
				if(less.contains("<")){
					less =  ranges[1].replaceAll("<", "");
				}
				if(amount.compareTo(new BigDecimal(greater)) > 0 && amount.compareTo(new BigDecimal(less)) < 1) {
					return true;
				}
	 		}else {
	 			if(priceScope.contains(">=")) {
	 				String greater = priceScope.replaceAll(">=", "");
	 				if(amount.compareTo(new BigDecimal(greater)) > -1) {
	 					return true;
	 				}
	 			}else if(priceScope.contains("<=")) {
	 				String less = priceScope.replaceAll("<=", "");
	 				if(amount.compareTo(new BigDecimal(less)) < 1) {
	 					return true;
	 				}
	 			}else if(priceScope.contains(">")){
					String greater = priceScope.replaceAll(">", "");
					if(amount.compareTo(new BigDecimal(greater)) > 0) {
						return true;
					}
				}else if(priceScope.contains("<")) {
					String less = priceScope.replaceAll("<", "");
					if(amount.compareTo(new BigDecimal(less)) < 0) {
						return true;
					}
				}
	 		}
		}catch (Exception e) {
			logger.error("解析机构金额错误：{}",e);
		}		
		return false;
	}
	
	public static void main(String[] args) {
		DispatchedWorkerService d = new DispatchedWorkerService();
		System.out.println(d.priceAnalysis(">1000&<=5000", new BigDecimal(1000)));
	}
}
