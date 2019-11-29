package com.injured.server.provider.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.injured.server.api.enums.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.injured.commons.PageBean;
import com.injured.server.api.annotations.CheckNull;
import com.injured.server.api.contract.FastCompensatProcessContract;
import com.injured.server.api.entity.CeInsurance;
import com.injured.server.api.entity.CeInsuranceExample;
import com.injured.server.api.entity.CeInsuranceItem;
import com.injured.server.api.entity.CeInsuranceSpecial;
import com.injured.server.api.entity.CeRegist;
import com.injured.server.api.entity.CeRegistSurvey;
import com.injured.server.api.entity.CeRegistSurveyCar;
import com.injured.server.api.entity.CeRegistSurveyCarDriver;
import com.injured.server.api.entity.CeRegistSurveyCarDriverExample;
import com.injured.server.api.entity.CeRegistSurveyCarExample;
import com.injured.server.api.entity.CeRegistSurveyExample;
import com.injured.server.api.entity.InjuredFastCompensatInfo;
import com.injured.server.api.entity.InjuredFastCompensatInfoExample;
import com.injured.server.api.entity.InjuredFixedLossList;
import com.injured.server.api.entity.InjuredFixedLossListExample;
import com.injured.server.api.entity.InjuredStaffOperatLog;
import com.injured.server.api.entity.InjuredTreatDiagnosisInfo;
import com.injured.server.api.entity.InjuredTreatDiagnosisInfoExample;
import com.injured.server.api.entity.InjuredFastCompensatInfoExample.Criteria;
import com.injured.server.api.model.query.CeInsuranceInfoDetail;
import com.injured.server.api.model.query.FastCompensatQuery;
import com.injured.server.api.model.query.FastCompensatQueryRes;
import com.injured.server.api.model.query.FastCompensatRegistRes;
import com.injured.server.api.model.query.FastCompensatfoldTransfer;
import com.injured.server.api.model.query.FastInsuranceInfoRes;
import com.injured.server.api.model.query.InjuredFastCompensatInfoDetail;
import com.injured.server.provider.mapper.CeInsuranceItemMapper;
import com.injured.server.provider.mapper.CeInsuranceMapper;
import com.injured.server.provider.mapper.CeInsuranceSpecialMapper;
import com.injured.server.provider.mapper.CeRegistMapper;
import com.injured.server.provider.mapper.CeRegistSurveyCarDriverMapper;
import com.injured.server.provider.mapper.CeRegistSurveyCarMapper;
import com.injured.server.provider.mapper.CeRegistSurveyMapper;
import com.injured.server.provider.mapper.InjuredFastCompensatInfoMapper;
import com.injured.server.provider.mapper.InjuredFixedLossListMapper;
import com.injured.server.provider.mapper.InjuredStaffOperatLogMapper;
import com.injured.server.provider.mapper.InjuredTreatDiagnosisInfoMapper;
import com.injured.server.provider.mode.ClaimCompanyId;
import com.injured.server.provider.mode.RegistInstanceInfo;
import com.injured.server.provider.mq.MQProducerService;

/**
 * 快赔定损处理
 * @author cli
 *
 */
@Service
public class FastCompensatProcessServiceImpl implements FastCompensatProcessContract {
	
	private static Logger logger = LogManager.getLogger(FastCompensatProcessServiceImpl.class);

	@Autowired
	private InjuredFastCompensatInfoMapper injuredFastCompensatInfoMapper;
	
	@Autowired
	private CeRegistMapper ceRegistMapper;
	
	@Autowired
	private CeRegistSurveyMapper ceRegistSurveyMapper;
	
	@Autowired
	private CeRegistSurveyCarMapper ceRegistSurveyCarMapper;
	
	@Autowired
	private CeRegistSurveyCarDriverMapper ceRegistSurveyCarDriverMapper;
	
	@Autowired
	private CeInsuranceMapper ceInsuranceMapper;
	
	@Autowired
	private CeInsuranceItemMapper ceInsuranceItemMapper;
	
	@Autowired
	private CeInsuranceSpecialMapper ceInsuranceSpecialMapper;
	
	@Autowired
	private InjuredFixedLossListMapper injuredFixedLossListMapper;
	
	@Autowired
	private InjuredTreatDiagnosisInfoMapper injuredTreatDiagnosisInfoMapper;
	
	@Autowired
    private InjuredStaffOperatLogMapper injuredStaffOperatLogMapper;
	
	@Autowired
	private MQProducerService mQProducerService;
	
	@Override
	public PageBean<FastCompensatQueryRes> queryFastCompensats(@CheckNull(group = "fastQuery") FastCompensatQuery fastCompensatQuery) {
		logger.info("FastCompensatProcessServiceImpl-queryFastCompensats-请求参数:{}", JSON.toJSONString(fastCompensatQuery));
		/**
		 * 查询定损员下的快赔定损列表
		 */
		InjuredFastCompensatInfoExample injuredFastCompensatInfoExample = new InjuredFastCompensatInfoExample();
		Criteria criteria = injuredFastCompensatInfoExample.createCriteria();
		criteria.andDamageNoEqualTo(fastCompensatQuery.getDamageNo())
			.andTaskStatusEqualTo(fastCompensatQuery.getTaskStatus()).andIsDeletedEqualTo(IsDeleteEnum.NO.getCode());
		
		if(fastCompensatQuery.getStartTime() == null && fastCompensatQuery.getEndTime() != null) {
			criteria.andFixedLossReceivTimeLessThan(fastCompensatQuery.getEndTime());
		}else if(fastCompensatQuery.getStartTime() != null && fastCompensatQuery.getEndTime() == null) {
			criteria.andFixedLossReceivTimeGreaterThanOrEqualTo(fastCompensatQuery.getStartTime());
		}else if(fastCompensatQuery.getStartTime() != null && fastCompensatQuery.getEndTime() != null) {
			criteria.andFixedLossReceivTimeGreaterThan(fastCompensatQuery.getStartTime()).andFixedLossReceivTimeLessThanOrEqualTo(fastCompensatQuery.getEndTime());
		}
		
		PageHelper.startPage(fastCompensatQuery.getPageNum(), fastCompensatQuery.getPageSize(),"create_time desc");
		List<InjuredFastCompensatInfo> injuredFastCompensatInfoPages = injuredFastCompensatInfoMapper.selectByExample(injuredFastCompensatInfoExample);
		PageBean<InjuredFastCompensatInfo> pageBean = new PageBean<>(injuredFastCompensatInfoPages);
		List<FastCompensatQueryRes> fastCompensats = new ArrayList<>();
		List<InjuredFastCompensatInfo> injuredFastCompensatInfos = pageBean.getList();
		if(injuredFastCompensatInfos != null && injuredFastCompensatInfos.size() != 0) {
			/**
			 * 获取案件id
			 */
			List<Long> registIds = new ArrayList<>();
			for(InjuredFastCompensatInfo injuredFastCompensatInfo : injuredFastCompensatInfos) {
				registIds.add(injuredFastCompensatInfo.getRegistId());
			}	
			List<RegistInstanceInfo> registInstanceInfos = ceRegistMapper.selectBatchRegists(registIds);
			for(InjuredFastCompensatInfo injuredFastCompensatInfo : injuredFastCompensatInfos) {
				FastCompensatQueryRes fastCompensatQueryRes = new FastCompensatQueryRes();
				fastCompensatQueryRes.setId(injuredFastCompensatInfo.getId());
				fastCompensatQueryRes.setClaimNotificationNo(injuredFastCompensatInfo.getClaimNotificationNo());
				fastCompensatQueryRes.setHumanName(injuredFastCompensatInfo.getHumanName());
				if(injuredFastCompensatInfo.getHumanType() != null) {
					fastCompensatQueryRes.setHumanType(HumanTypeEnum.getMsg(injuredFastCompensatInfo.getHumanType()));
				}
				if(registInstanceInfos != null && registInstanceInfos.size() != 0) {
					for(RegistInstanceInfo registInstanceInfo : registInstanceInfos) {
						if(registInstanceInfo.getRegistId().longValue() == injuredFastCompensatInfo.getRegistId().longValue()) {
							fastCompensatQueryRes.setRegistId(registInstanceInfo.getRegistId());
							fastCompensatQueryRes.setLossTime(registInstanceInfo.getDangerTime());
							
							/**
							 * 保单信息
							 */
							if("1".equals(registInstanceInfo.getInsuranceCategory())) {
								/**
								 * 交强险
								 */
								fastCompensatQueryRes.setInsuredName(registInstanceInfo.getInsuredName());
								fastCompensatQueryRes.setLicensePlateNo(registInstanceInfo.getLicensePlateNo());
							}else if("2".equals(registInstanceInfo.getInsuranceCategory())){
								/**
								 * 商业险
								 */
								if(fastCompensatQueryRes.getInsuredName() == null) {
									fastCompensatQueryRes.setInsuredName(registInstanceInfo.getInsuredName());
									fastCompensatQueryRes.setLicensePlateNo(registInstanceInfo.getLicensePlateNo());
								}
								
								if(fastCompensatQueryRes.getLicensePlateNo() == null) {
									fastCompensatQueryRes.setLicensePlateNo(registInstanceInfo.getLicensePlateNo());
								}
							}
						}
					}
				}
				fastCompensats.add(fastCompensatQueryRes);
			}
			
		}
		
		//转化分页
		PageBean<FastCompensatQueryRes> fastCompensatQueryResPageBean = new PageBean<>();
		fastCompensatQueryResPageBean.setPageNum(pageBean.getPageNum());
		fastCompensatQueryResPageBean.setPages(pageBean.getPages());
		fastCompensatQueryResPageBean.setPageSize(pageBean.getPageSize());
		fastCompensatQueryResPageBean.setSize(pageBean.getSize());
		fastCompensatQueryResPageBean.setTotal(pageBean.getTotal());
		fastCompensatQueryResPageBean.setList(fastCompensats);
		return fastCompensatQueryResPageBean;
	}

	@Override
	public int updateFastCompensatStatus(@CheckNull Long fastCompensatId,@CheckNull Integer status) {
		InjuredFastCompensatInfo record = new InjuredFastCompensatInfo();
		record.setId(fastCompensatId);
		record.setTaskStatus(status);
		return injuredFastCompensatInfoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public InjuredFastCompensatInfoDetail getFastCompensatInfoDetail(@CheckNull Long id) {
		
		InjuredFastCompensatInfoDetail injuredFastCompensatInfoDetail = new InjuredFastCompensatInfoDetail();
		/**
		 * 查询快赔详情
		 */
		InjuredFastCompensatInfo injuredFastCompensatInfo = injuredFastCompensatInfoMapper.selectByPrimaryKey(id);
		if(injuredFastCompensatInfo != null) {
			BeanUtils.copyProperties(injuredFastCompensatInfo, injuredFastCompensatInfoDetail);	
			InjuredFixedLossListExample injuredFixedLossListExample = new InjuredFixedLossListExample();
			injuredFixedLossListExample.createCriteria().andInfoIdEqualTo(id).andIsDeletedEqualTo(Byte.parseByte(String.valueOf(IsDeleteEnum.NO.getCode())));
			List<InjuredFixedLossList> injuredFixedLossList = injuredFixedLossListMapper.selectByExample(injuredFixedLossListExample);
			injuredFastCompensatInfoDetail.setInjuredFixedLossList(injuredFixedLossList);
			
			InjuredTreatDiagnosisInfoExample injuredTreatDiagnosisInfoExample = new InjuredTreatDiagnosisInfoExample();
			injuredTreatDiagnosisInfoExample.createCriteria().andInfoIdEqualTo(id).andIsDeletedEqualTo(Byte.parseByte(String.valueOf(IsDeleteEnum.NO.getCode())));
			List<InjuredTreatDiagnosisInfo> injuredTreatDiagnosisInfos = injuredTreatDiagnosisInfoMapper.selectByExample(injuredTreatDiagnosisInfoExample);
			injuredFastCompensatInfoDetail.setInjuredTreatDiagnosisInfo(injuredTreatDiagnosisInfos);
		}
		return injuredFastCompensatInfoDetail;
	}

	@Override
	public FastCompensatRegistRes getRegistSurvey(@CheckNull Long registId) {
		FastCompensatRegistRes fastCompensatRegistRes = new FastCompensatRegistRes();
		
		/**
		 * 查询报案信息
		 */
		CeRegist regist = ceRegistMapper.selectByPrimaryKey(registId);
		if(regist == null) {
			return fastCompensatRegistRes;
		}
		fastCompensatRegistRes.setClaimNotificationNo(regist.getClaimNotificationNo());
		fastCompensatRegistRes.setNotificationTime(regist.getNotificationTime());
		fastCompensatRegistRes.setReporter(regist.getReporter());
		fastCompensatRegistRes.setInformantMobilTel(regist.getInformantMobilTel());
		fastCompensatRegistRes.setLossTime(regist.getDangerTime());
		fastCompensatRegistRes.setFirstSceneInd(regist.getRegistSource());
		fastCompensatRegistRes.setIsPolice(regist.getIsPolice());
		fastCompensatRegistRes.setHurtNum(String.valueOf(regist.getHurtNum()));
		fastCompensatRegistRes.setDamageAddressType(regist.getDangerAddressType());
		fastCompensatRegistRes.setLossArea(regist.getDangerAddress());
		fastCompensatRegistRes.setLossDesc(regist.getDangerDesc());


		
		/**
		 * 查勘信息
		 */
		CeRegistSurveyExample ceRegistSurveyExample = new CeRegistSurveyExample();
		ceRegistSurveyExample.createCriteria().andRegistIdEqualTo(registId);
		List<CeRegistSurvey> ceRegistSurveys = ceRegistSurveyMapper.selectByExample(ceRegistSurveyExample);		
		if(ceRegistSurveys == null || ceRegistSurveys.size() == 0) {
			return fastCompensatRegistRes;
		}
		CeRegistSurvey survey = ceRegistSurveys.get(0);
		//fastCompensatRegistRes.setEventReasonType(survey.getEventReasonType());
		fastCompensatRegistRes.setCeAccidentType(survey.getEventType());
		fastCompensatRegistRes.setIsCarAnnual(survey.getIsCarAnnual());
		fastCompensatRegistRes.setOptionType(survey.getEventProcessMode());
		fastCompensatRegistRes.setDriverReview(survey.getDriverReview());
		fastCompensatRegistRes.setIsFirstScene(String.valueOf(survey.getIsFirstScene()));
		fastCompensatRegistRes.setAccidentLiability(survey.getEventAccidentLiability());
		fastCompensatRegistRes.setDangerCause(survey.getDangerCause());
		
		/**
		 * 查勘车信息
		 */
		CeRegistSurveyCarExample ceRegistSurveyCarExample = new CeRegistSurveyCarExample();
		ceRegistSurveyCarExample.createCriteria().andCeRegistSurveyIdEqualTo(survey.getId());
		List<CeRegistSurveyCar> ceRegistSurveyCars = ceRegistSurveyCarMapper.selectByExample(ceRegistSurveyCarExample);
		if(ceRegistSurveyCars == null || ceRegistSurveyCars.size() == 0) {
			return fastCompensatRegistRes;
		}
		
		CeRegistSurveyCar surveyCar = ceRegistSurveyCars.get(0);
		fastCompensatRegistRes.setLicensePlateNo(surveyCar.getLicensePlateNo());
		fastCompensatRegistRes.setBrandModel(surveyCar.getBrandModel());
		fastCompensatRegistRes.setVin(surveyCar.getVin());
		fastCompensatRegistRes.setEngineNo(surveyCar.getEngineNo());
		Long surveyCarId = surveyCar.getId();
		
		/**
		 * 查勘驾驶员信息
		 */
		if(surveyCarId == null) {
			return fastCompensatRegistRes;
		}
		CeRegistSurveyCarDriverExample ceRegistSurveyCarDriverExample = new CeRegistSurveyCarDriverExample();
		ceRegistSurveyCarDriverExample.createCriteria().andCeRegistSurveyCarIdEqualTo(surveyCarId);
		List<CeRegistSurveyCarDriver> surveyCarDrivers = ceRegistSurveyCarDriverMapper.selectByExample(ceRegistSurveyCarDriverExample);
		if(surveyCarDrivers == null || surveyCarDrivers.size() == 0) {
			return fastCompensatRegistRes;
		}
		CeRegistSurveyCarDriver surveyCarDriver = surveyCarDrivers.get(0);
		fastCompensatRegistRes.setDriverName(surveyCarDriver.getDriverName());
		fastCompensatRegistRes.setDriverPhone(surveyCarDriver.getDriverPhone());
		fastCompensatRegistRes.setAllowDrivingVehicle(surveyCarDriver.getAllowDrivingVehicle());
		fastCompensatRegistRes.setDriverBehavior(null);
		//是否酒后驾车
		if(surveyCarDriver.getIsDrinkingDriving() != null) {
			fastCompensatRegistRes.setIsDrinkingDriving(surveyCarDriver.getIsDrinkingDriving().toString());
		}
		return fastCompensatRegistRes;
	}

	@Override
	public FastInsuranceInfoRes getInsuranceInfo(@CheckNull Long registId) {
		FastInsuranceInfoRes fastInsuranceInfoRes = new FastInsuranceInfoRes();
		
		CeInsuranceExample ceInsuranceExample = new CeInsuranceExample();
		ceInsuranceExample.createCriteria().andRegistIdEqualTo(registId);
		List<CeInsurance> insurances = ceInsuranceMapper.selectByExample(ceInsuranceExample);
		if(insurances == null || insurances.size() == 0) {
			return fastInsuranceInfoRes;
		}
		List<Long> instanceIds = new ArrayList<>();
		CeInsuranceInfoDetail compulsoryInsurance = new CeInsuranceInfoDetail();
		CeInsuranceInfoDetail commercialInsurance = new CeInsuranceInfoDetail();
		for(CeInsurance insurance : insurances) {
			instanceIds.add(insurance.getId());
			if("1".equals(insurance.getInsuranceCategory())) {
				/**
				 * 交强险
				 */
				BeanUtils.copyProperties(insurance, compulsoryInsurance);
				if(insurance.getPassengerVolume() != null && insurance.getPayloadMass() != null) {
					compulsoryInsurance.setSeatsQualities(insurance.getPassengerVolume() + "人/" + insurance.getPayloadMass() +"千克");
				}
			}else if("2".equals(insurance.getInsuranceCategory())) {
				/**
				 * 商业险
				 */
				BeanUtils.copyProperties(insurance, commercialInsurance);
				if(insurance.getPassengerVolume() != null && insurance.getPayloadMass() != null) {
					commercialInsurance.setSeatsQualities(insurance.getPassengerVolume() + "人/" + insurance.getPayloadMass() +"千克");
				}
			}
		}
		
		/**
		 * 承保险种
		 */
		List<CeInsuranceItem> ceInsuranceItems = ceInsuranceItemMapper.selectByBatchInstanceId(instanceIds);
		if(ceInsuranceItems != null && ceInsuranceItems.size() != 0) {
			List<CeInsuranceItem> compulsory_ceInsuranceItems = new ArrayList<>();
			List<CeInsuranceItem> commercial_ceInsuranceItems = new ArrayList<>();
			for(CeInsuranceItem ceInsuranceItem : ceInsuranceItems) {
				Long insuranceId = ceInsuranceItem.getInsuranceId() == null ? -1L : ceInsuranceItem.getInsuranceId();
				if(compulsoryInsurance != null && compulsoryInsurance.getId() != null &&
						compulsoryInsurance.getId() != null && compulsoryInsurance.getId().longValue() == insuranceId.longValue()) {
					compulsory_ceInsuranceItems.add(ceInsuranceItem);
				}else if(commercialInsurance != null && commercialInsurance.getId() != null &&
						commercialInsurance.getId() != null && commercialInsurance.getId().longValue() == insuranceId.longValue()) {
					commercial_ceInsuranceItems.add(ceInsuranceItem);
				}
			}
			compulsoryInsurance.setCeInsuranceItems(compulsory_ceInsuranceItems);
			commercialInsurance.setCeInsuranceItems(commercial_ceInsuranceItems);
		}
		
		/**
		 * 特殊说明
		 */
		List<CeInsuranceSpecial> ceInsuranceSpecials = ceInsuranceSpecialMapper.selectByBatchInstanceId(instanceIds);
		if(ceInsuranceSpecials != null && ceInsuranceSpecials.size() != 0) {
			List<CeInsuranceSpecial> compulsory_ceInsuranceSpecial = new ArrayList<>();
			List<CeInsuranceSpecial> commercial_ceInsuranceSpecial = new ArrayList<>();
			for(CeInsuranceSpecial ceInsuranceSpecial : ceInsuranceSpecials) {
				if(compulsoryInsurance != null && compulsoryInsurance.getId() != null &&
						(compulsoryInsurance.getId().longValue() == ceInsuranceSpecial.getInsuranceId().longValue())) {
					compulsory_ceInsuranceSpecial.add(ceInsuranceSpecial);
				}else if(commercialInsurance != null && commercialInsurance.getId() != null &&
						(commercialInsurance.getId().longValue() == ceInsuranceSpecial.getInsuranceId().longValue())) {
					commercial_ceInsuranceSpecial.add(ceInsuranceSpecial);
				}
			}
			compulsoryInsurance.setSeInsuranceSpecials(compulsory_ceInsuranceSpecial);
			commercialInsurance.setSeInsuranceSpecials(commercial_ceInsuranceSpecial);
		}
		
		fastInsuranceInfoRes.setCommercialInsurance(commercialInsurance);
		fastInsuranceInfoRes.setCompulsoryInsurance(compulsoryInsurance);
		return fastInsuranceInfoRes;
	}

	@Override
	public int saveFastCompensat(@CheckNull InjuredFastCompensatInfoDetail injuredFastCompensatInfoDetail) {
		return updateFastCompensat(injuredFastCompensatInfoDetail,TaskStatusEnum.PROCESSING.getCode());
	}

	@Override
	@Transactional
	public int submitFastCompensat(@CheckNull InjuredFastCompensatInfoDetail injuredFastCompensatInfoDetail) {
		
		/**
		 * 处理完成后,把任务放入缓存
		 */
		int operation = 0;
		
		/**
		 * 操作数据库
		 */
		operation = updateFastCompensat(injuredFastCompensatInfoDetail,TaskStatusEnum.PROCESSED.getCode());
		
		/**
		 * 发送mq
		 */
		if(operation == 1) {
			mQProducerService.sendDispatchedWorkerMessage(String.valueOf(injuredFastCompensatInfoDetail.getId()));
		}
		
		return operation;
	}

	@Transactional
	public int updateFastCompensat(InjuredFastCompensatInfoDetail injuredFastCompensatInfoDetail,int status) {
		logger.info("FastCompensatProcessServiceImpl-updateFastCompensat-请求参数:{},状态:{}", JSON.toJSONString(injuredFastCompensatInfoDetail),status);
		
		if(injuredFastCompensatInfoDetail == null) {
			return 0;
		}
		InjuredFastCompensatInfo query = injuredFastCompensatInfoMapper.selectByPrimaryKey(injuredFastCompensatInfoDetail.getId());

		if(query != null && query.getReviewStatus() == ReviewStatusEnum.REVIEWED.getCode()){
			return 1;
		}
		/**
		 * 更新快赔定损信息
		 */
		InjuredFastCompensatInfo injuredFastCompensatInfo = new InjuredFastCompensatInfo();
		BeanUtils.copyProperties(injuredFastCompensatInfoDetail, injuredFastCompensatInfo);
		injuredFastCompensatInfo.setTaskStatus(status);
		injuredFastCompensatInfo.setFixedLossSubmitTime(new Date());
		int update = injuredFastCompensatInfoMapper.updateByPrimaryKeySelective(injuredFastCompensatInfo);
		if(update != 1) {
			return 0;
		}
		
		/**
		 * 先删除任务下所有损失项目，然后新增损失项目
		 */
		Byte isDelete = Byte.parseByte(String.valueOf(IsDeleteEnum.NO.getCode()));
		Date now = new Date();
		InjuredFixedLossListExample injuredFixedLossListExampleDel = new InjuredFixedLossListExample();
		injuredFixedLossListExampleDel.createCriteria().andInfoIdEqualTo(injuredFastCompensatInfoDetail.getId()).andIsDeletedEqualTo(isDelete);
		injuredFixedLossListMapper.deleteByExample(injuredFixedLossListExampleDel);
		
		List<InjuredFixedLossList> injuredFixedLossLists = injuredFastCompensatInfoDetail.getInjuredFixedLossList();
		if(injuredFixedLossLists != null && injuredFixedLossLists.size() != 0) {
			for(InjuredFixedLossList injuredFixedLossList : injuredFixedLossLists) {
				injuredFixedLossList.setClaimNotificationNo(injuredFastCompensatInfoDetail.getClaimNotificationNo());
				injuredFixedLossList.setRegistId(injuredFastCompensatInfoDetail.getRegistId());
				injuredFixedLossList.setInfoId(injuredFastCompensatInfoDetail.getId());
				injuredFixedLossList.setCompanyId(injuredFastCompensatInfoDetail.getCompanyId());
				injuredFixedLossList.setCompantCode(injuredFastCompensatInfoDetail.getCompantCode());
				injuredFixedLossList.setFixedLossTypeFirst(0L);
				injuredFixedLossList.setFixedLossTypeSecond(0L);
				injuredFixedLossList.setIsDeleted(isDelete);
				injuredFixedLossList.setUpdateTime(now);
				injuredFixedLossList.setCreateTime(now);			
			}
			injuredFixedLossListMapper.insertBatch(injuredFixedLossLists);
		}
		
		/**
		 * 先删除任务下的损失部位,然后新增
		 */
		InjuredTreatDiagnosisInfoExample injuredTreatDiagnosisInfoExample = new InjuredTreatDiagnosisInfoExample();
		injuredTreatDiagnosisInfoExample.createCriteria().andInfoIdEqualTo(injuredFastCompensatInfoDetail.getId()).andIsDeletedEqualTo(isDelete);
		injuredTreatDiagnosisInfoMapper.deleteByExample(injuredTreatDiagnosisInfoExample);
		
		List<InjuredTreatDiagnosisInfo> injuredTreatDiagnosisInfos = injuredFastCompensatInfoDetail.getInjuredTreatDiagnosisInfo();
		if(injuredTreatDiagnosisInfos != null && injuredTreatDiagnosisInfos.size() != 0) {
			for(InjuredTreatDiagnosisInfo injuredTreatDiagnosisInfo : injuredTreatDiagnosisInfos) {
				injuredTreatDiagnosisInfo.setClaimNotificationNo(injuredFastCompensatInfoDetail.getClaimNotificationNo());
				injuredTreatDiagnosisInfo.setRegistId(injuredFastCompensatInfoDetail.getRegistId());
				injuredTreatDiagnosisInfo.setInfoId(injuredFastCompensatInfoDetail.getId());
				injuredTreatDiagnosisInfo.setCompanyId(injuredFastCompensatInfoDetail.getCompanyId());
				injuredTreatDiagnosisInfo.setCompantCode(injuredFastCompensatInfoDetail.getCompantCode());
				injuredTreatDiagnosisInfo.setIsDeleted(isDelete);
				injuredTreatDiagnosisInfo.setUpdateTime(now);
				injuredTreatDiagnosisInfo.setCreateTime(now);
			}
			injuredTreatDiagnosisInfoMapper.insertBatch(injuredTreatDiagnosisInfos);
		}
		
		if(TaskStatusEnum.PROCESSED.getCode() == status) {
			InjuredStaffOperatLog injuredStaffOperatLog = new InjuredStaffOperatLog();
	        injuredStaffOperatLog.setClaimNotificationNo(injuredFastCompensatInfoDetail.getClaimNotificationNo());
	        injuredStaffOperatLog.setCompanyId(injuredFastCompensatInfoDetail.getCompanyId());
	        injuredStaffOperatLog.setMedBasicInfoId(injuredFastCompensatInfoDetail.getId());
	        injuredStaffOperatLog.setRegistId(injuredFastCompensatInfoDetail.getRegistId());
	        injuredStaffOperatLog.setSubmitTime(new Date());
	        injuredStaffOperatLog.setSubmitName(injuredFastCompensatInfoDetail.getDamageName());
	        injuredStaffOperatLog.setSubmitAmount(injuredFastCompensatInfoDetail.getFixedLossAmount());
	        injuredStaffOperatLog.setSubmitOpinion(injuredFastCompensatInfoDetail.getDamageDesc());
	        injuredStaffOperatLog.setOpinionDesc("处理完成");
	        injuredStaffOperatLog.setSubmitNo(injuredFastCompensatInfoDetail.getDamageNo());
	        injuredStaffOperatLog.setSubmitTask(TaskType.FAST_COMPENSAT.getCode());
	        injuredStaffOperatLog.setCreateTime(new Date());
	        injuredStaffOperatLogMapper.insertSelective(injuredStaffOperatLog);
		}
		
		return update;	
	}

	@Override
	@Transactional
	public int fastCompensatTransfer(@CheckNull(group = "fastTransfer") FastCompensatfoldTransfer fastCompensatfoldTransfer) {
		
		InjuredFastCompensatInfo injuredFastCompensatInfoDetail = injuredFastCompensatInfoMapper.selectByPrimaryKey(fastCompensatfoldTransfer.getId());
		int taskStatus = injuredFastCompensatInfoDetail.getTaskStatus() == null ? -1 : injuredFastCompensatInfoDetail.getTaskStatus();
		if(injuredFastCompensatInfoDetail == null || TaskStatusEnum.PROCESSING.getCode() != taskStatus) {
			logger.info("FastCompensatProcessServiceImpl-updateFastCompensat-转派案件状态不在处理中：{}",taskStatus);
			return 0;
		}
		
		/**
		 * 更新快赔定损信息
		 */
		InjuredFastCompensatInfo injuredFastCompensatInfo = new InjuredFastCompensatInfo();
		injuredFastCompensatInfo.setId(fastCompensatfoldTransfer.getId());
		injuredFastCompensatInfo.setDamageName(fastCompensatfoldTransfer.getDamageName());
		injuredFastCompensatInfo.setDamageNo(fastCompensatfoldTransfer.getDamageNo());
		injuredFastCompensatInfo.setTaskStatus(TaskStatusEnum.TO_PROCESSED.getCode());
		//除了任务自动派工和后台审核转派,不允许更新updatetime
		//injuredFastCompensatInfo.setUpdtaeTime(new Date());
		int update = injuredFastCompensatInfoMapper.updateByPrimaryKeySelective(injuredFastCompensatInfo);
		
		if(update == 1) {
			InjuredStaffOperatLog injuredStaffOperatLog = new InjuredStaffOperatLog();
	        injuredStaffOperatLog.setClaimNotificationNo(injuredFastCompensatInfoDetail.getClaimNotificationNo());
	        injuredStaffOperatLog.setCompanyId(injuredFastCompensatInfoDetail.getCompanyId());
	        injuredStaffOperatLog.setMedBasicInfoId(injuredFastCompensatInfoDetail.getId());
	        injuredStaffOperatLog.setRegistId(injuredFastCompensatInfoDetail.getRegistId());
	        injuredStaffOperatLog.setSubmitTime(new Date());
	        injuredStaffOperatLog.setSubmitName(injuredFastCompensatInfoDetail.getDamageName());
	        //injuredStaffOperatLog.setSubmitAmount(injuredFastCompensatInfoDetail.getDamageAmount());
	        injuredStaffOperatLog.setSubmitOpinion("快赔定损人工转派");
	        //injuredStaffOperatLog.setOpinionDesc("转派完成");
	        injuredStaffOperatLog.setSubmitNo(injuredFastCompensatInfoDetail.getDamageNo());
	        injuredStaffOperatLog.setSubmitTask(TaskType.TASK_REASSIGNMENT.getCode());
	        injuredStaffOperatLog.setCreateTime(new Date());
	        injuredStaffOperatLogMapper.insertSelective(injuredStaffOperatLog);
		}
		return update;
	}
}
