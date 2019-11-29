package com.injured.server.provider.service.impl;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONObject;
import com.injured.commons.redis.RedisUtil;
import com.injured.server.api.contract.CompanyAgencyContract;
import com.injured.server.api.contract.InjuredStaffOperatLogContract;
import com.injured.server.api.entity.CompanyAgency;
import com.injured.server.api.entity.InjuredStaffOperatLog;
import com.injured.server.api.enums.Constant;
import com.injured.server.api.enums.ResultEnum;
import com.injured.server.api.enums.TaskType;
import com.injured.server.api.model.request.fast.CompanyAgencyReq;
import com.injured.server.api.model.response.BaseResponse;
import com.injured.server.api.model.response.ResponseUtil;
import com.injured.server.provider.mapper.CompanyAgencyMapper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * @author zlu
 * @title: CompanyAgencyServiceImpl
 * @projectName injured
 * @description: 保险公司机构
 * @date 2019/7/318:04
 */
@Service(timeout = 60000)
public class CompanyAgencyServiceImpl implements CompanyAgencyContract {

    private static Logger logger = LogManager.getLogger(CompanyAgencyServiceImpl.class);

	private static Map<Long,List<CompanyAgencyReq>> AGENCY_CACHE = new ConcurrentHashMap();

	private static Map<Long,List<CompanyAgencyReq>> AGENCY_ALL_CACHE = new ConcurrentHashMap();



	@Autowired
    private CompanyAgencyMapper companyAgencyMapper;
    @Autowired
    private InjuredStaffOperatLogContract injuredStaffOperatLogContract;

    @Autowired
    private RedisUtil redisUtil;

    private static final String KEY = "COMPANY_AGENCY_LIST";

    @Override
    public List<CompanyAgency> findChildNode(CompanyAgency agency) {
        if (agency == null) {
            logger.info("CompanyAgencyServiceImpl-findChildNode-请求参数不能为空");
            return null;
        }
        //先查询REDIS中存在缓存数据
        List<CompanyAgency> result = new ArrayList<>();
        List<Object> redisData = redisUtil.lGet(KEY+"_"+agency.getCompanyId(),0,-1);
        if(redisData != null && redisData.size() > 0){
           List<CompanyAgencyReq> allData = (List<CompanyAgencyReq>) redisData.get(0);
           findChildNodeByRedis(agency,result,allData);
           result.add(agency);
       }else {
            getChildNodeList(agency, result);
            if (result.size() != 0) {
                result.add(agency);
            }
            List<CompanyAgencyReq> list = companyAgencyMapper.findAllNode(agency.getCompanyId());
            redisUtil.lSet(KEY+"_"+agency.getCompanyId(),list);
       }
        return result;
    }

    private void findChildNodeByRedis(CompanyAgency agency, List<CompanyAgency> result, List<CompanyAgencyReq> redisData) {
        logger.info("CompanyAgencyServiceImpl-findChildNodeByRedis-BEGIN");
        for (CompanyAgencyReq companyAgencyReq:redisData) {
             if(agency.getId().equals(companyAgencyReq.getPid())){
				 CompanyAgency companyAgency = new CompanyAgency();
				 BeanUtils.copyProperties(companyAgencyReq,companyAgency);
                 result.add(companyAgency);
                 if(Constant.YES.equals(companyAgencyReq.getHavingChildNode())){
                     findChildNodeByRedis(companyAgency,result,redisData);
                 }
             }
        }
    }


    private void getChildNodeList(CompanyAgency agency,List<CompanyAgency> result){
        logger.info("CompanyAgencyServiceImpl-getChildNodeList-BEGIN");
        List<CompanyAgency> agencys = companyAgencyMapper.findChildNodeByPidAndCompanyId(agency.getId(),agency.getCompanyId());
        for (CompanyAgency companyAgency:agencys) {
             result.add(companyAgency);
             if(Constant.YES.equals(companyAgency.getHavingChildNode())) {
                 getChildNodeList(companyAgency, result);
             }
        }
    }

    @Override
    public BaseResponse findAllList(CompanyAgencyReq agency){
    	//先查询REDIS中存在缓存数据
        List<CompanyAgencyReq> result = new ArrayList<>();
        //redis中结果
        List<CompanyAgencyReq> resultAll = new ArrayList<>();
		
		try {
	        	//根据查询条件查询机构
	        	resultAll = companyAgencyMapper.findNodeByQuery(agency.getFuzzy(),agency.getAgencyName(),agency.getIsClaim(),agency.getCompanyId());
	        	
	        	//查询条件：是否包含下级机构 1-是
				if(agency.getHavingChildNode()!=null && agency.getHavingChildNode() == 1) {
					//获取所有机构信息
		        	List<CompanyAgencyReq> resultA = companyAgencyMapper.findAllNode(agency.getCompanyId());
					for (CompanyAgencyReq companyAgency:resultAll) {
						//判断结果集中是否已包含，防止添加子集时重复添加
						if(!result.contains(companyAgency)) {
							result.add(companyAgency);
						}
						
						if(companyAgency.getHavingChildNode() == 1) {
							//查找子集机构
							for (CompanyAgencyReq comAgency:resultA) {
					             if(companyAgency.getId().equals(comAgency.getPid())){
					            	 //查询条件是否为理赔机构，若选择是或者否，子集机构也要符合条件
					            	 if(agency.getIsClaim() != 2 && agency.getIsClaim() == comAgency.getIsClaim()) {
					            		//判断结果集中是否已包含，防止添加子集时重复添加
						            	 if(!result.contains(comAgency)) {
						            		 result.add(comAgency);
						            	 }
					            	 }else if(agency.getIsClaim() == 2) {
					            		//判断结果集中是否已包含，防止添加子集时重复添加
						            	 if(!result.contains(comAgency)) {
						            		 result.add(comAgency);
						            	 }
					            	 }
					             }
					        }
						}
					}
				}else {
					result.addAll(resultAll);
				}
		}catch(Exception e) {
			logger.error("findAllList查询机构列表出现异常" , e);
			return ResponseUtil.error(ResultEnum.EXCEPTION);
		}
        return ResponseUtil.success(result);
    }
    
    private List<CompanyAgencyReq> findNodeByQuery(List<CompanyAgencyReq> resultAll,CompanyAgencyReq agency){
    	List<CompanyAgencyReq> result = new ArrayList<>();
		boolean flag = true;
		for (CompanyAgencyReq companyAgency:resultAll) {
			flag = true;
			//查询条件：组织机构名称
			if(StringUtils.isNotEmpty(agency.getAgencyName())) {
				//模糊查询
				if("1".equals(agency.getFuzzy())) {
					if(!companyAgency.getAgencyName().contains((agency.getAgencyName()))) {
						flag = false;
        			}
				}else {//全量查询
					if(!companyAgency.getAgencyName().equals((agency.getAgencyName()))) {
						flag = false;
        			}
				}
			}
			if(flag) {
				//查询条件：是否为理赔机构
				if(companyAgency.getIsClaim() == agency.getIsClaim() || agency.getIsClaim()==2) {
					if(!result.contains(companyAgency)) {
    					result.add(companyAgency);
    				}
    				//查询条件：是否包含下级机构 1-是
    				if(agency.getHavingChildNode() == 1) {
    					if(companyAgency.getHavingChildNode() == 1) {
    						
    						//查找子集机构
    						for (CompanyAgencyReq comAgency:resultAll) {
    				             if(companyAgency.getId().equals(comAgency.getPid())){
    				            	//判断结果集中是否已包含，防止添加子集时重复添加
    				            	 if(!result.contains(comAgency)) {
    				            		 result.add(comAgency);
    				            	 }
    				             }
    				        }
    					}
        			}
    				
    			}
			}
		}
		return result;
    }

    @Override
    public BaseResponse findAgencyById(Long id, Long companyId){
    	try {
    		CompanyAgencyReq agency = companyAgencyMapper.findAgencyById(id, companyId);
    		return ResponseUtil.success(agency);
    	}catch(Exception e) {
    		logger.error("findChildNodeById根据id查询机构详细信息出现异常" , e);
			return ResponseUtil.error(ResultEnum.EXCEPTION);
    	}

    }
	@Override
    public BaseResponse updateCompanyAgency(CompanyAgency agency,String userName,String userNo) {
    	try {
    		//修改机构信息
    		companyAgencyMapper.updateByPrimaryKeySelective(agency);
    		//修改机构子集
    		if(agency.getHavingChildNode() == 1) {
    			findChildByPidPri(agency.getId(),agency.getCompanyId(),agency.getIsClaim());
    		}
    		
    		//修改redis中信息
    		redisUtil.del(KEY+"_"+agency.getCompanyId());
    		//获取所有机构信息
        	List<CompanyAgencyReq> resultA = companyAgencyMapper.findAllNode(agency.getCompanyId());
        	redisUtil.lSet(KEY+"_"+agency.getCompanyId(), resultA);
        	
    		//记录修改操作日志
    		InjuredStaffOperatLog injuredStaff = new InjuredStaffOperatLog();
    		injuredStaff.setSubmitTask(TaskType.AGENCY_MANAGE.getCode());
    		injuredStaff.setSubmitName(userName);
    		injuredStaff.setSubmitNo(userNo);
    		injuredStaff.setSubmitOpinion("修改机构信息");
    		injuredStaff.setOpinionDesc(agency.getRemark());
    		injuredStaff.setCompanyId(agency.getCompanyId());
    		injuredStaff.setSurveyId(agency.getId());
    		injuredStaffOperatLogContract.addInjuredStaffLog(injuredStaff);
    		return ResponseUtil.success(null);
    	}catch(Exception e) {
    		logger.error("updateCompanyAgency修改机构异常" , e);
			return ResponseUtil.error(ResultEnum.EXCEPTION);
    	}
    }
	
	private void findChildByPidPri(Long pid, Long companyId,Integer isClaim){
		List<CompanyAgency> agencys = companyAgencyMapper.findChildNodeByPidAndCompanyId(pid,companyId);
		CompanyAgency companyTem = null;
        for (CompanyAgency companyAgency:agencys) {
        	companyTem = new CompanyAgency();
        	companyTem.setIsClaim(isClaim);
        	companyTem.setId(companyAgency.getId());
        	companyAgencyMapper.updateByPrimaryKeySelective(companyTem);
//             result.add(companyAgency);
             if(Constant.YES.equals(companyAgency.getHavingChildNode())) {
            	 findChildByPidPri(companyAgency.getId(), companyId,isClaim);
             }
        }
	}
	@Override
    public BaseResponse findAgencyByCodeOrName(String agencyCode,String agencyName, Long companyId){
    	try {
    		CompanyAgencyReq agency = companyAgencyMapper.findAgencyByCodeOrName(agencyCode, agencyName, companyId);
    		return ResponseUtil.success(agency);
    	}catch(Exception e) {
    		logger.error("findChildNodeById根据id查询机构详细信息出现异常" , e);
			return ResponseUtil.error(ResultEnum.EXCEPTION);
    	}
    }
	@Override
    public BaseResponse insertCompanyAgency(CompanyAgency agency,String userName,String userNo) {
    	try {
    		//新增机构
    		companyAgencyMapper.insertSelective(agency);
    		
    		//记录修改操作日志
    		InjuredStaffOperatLog injuredStaff = new InjuredStaffOperatLog();
    		injuredStaff.setSubmitTask(TaskType.AGENCY_MANAGE.getCode());
    		injuredStaff.setSubmitName(userName);
    		injuredStaff.setSubmitNo(userNo);
    		injuredStaff.setSubmitOpinion("导入机构信息");
    		injuredStaff.setOpinionDesc(agency.getRemark());
    		injuredStaff.setCompanyId(agency.getCompanyId());
    		injuredStaff.setSurveyId(agency.getId());
    		injuredStaffOperatLogContract.addInjuredStaffLog(injuredStaff);
    		
    		return ResponseUtil.success(null);
    	}catch(Exception e) {
    		logger.error("insertCompanyAgency新增机构出现异常" , e);
			return ResponseUtil.error(ResultEnum.EXCEPTION);
    	}
    }

    @Override
	public void updateRedis(Long companyId) {
		//修改redis中信息
		redisUtil.del(KEY+"_"+companyId);
		//获取所有机构信息
    	List<CompanyAgencyReq> resultA = companyAgencyMapper.findAllNode(companyId);
    	redisUtil.lSet(KEY+"_"+companyId, resultA);
	}
	@Override
	public BaseResponse findAgencyByLevel(Integer level, Long companyId){

        List<CompanyAgencyReq> result = new ArrayList<>();
		try {
	        result = companyAgencyMapper.findNodeByAgencyLevel(companyId,level);
	        return ResponseUtil.success(result);
		}catch(Exception e) {
			logger.error("findAgencyByLevel根据等级查询机构出现异常" , e);
			return ResponseUtil.error(ResultEnum.EXCEPTION);
		}
	}
	@Override
	public BaseResponse findAgencyByPid(Long pid, Long companyId){

        List<CompanyAgency> result = new ArrayList<>();
		try {
	        result = companyAgencyMapper.findChildNodeByPidAndCompanyId(pid,companyId);
	        return ResponseUtil.success(result);
		}catch(Exception e) {
			logger.error("findAgencyByPid根据父id查询机构列表 " , e);
			return ResponseUtil.error(ResultEnum.EXCEPTION);
		}
	}

	@Override
	public List<Long> findIdByPid(Long pid, Long companyId){
        List<Long> result = new ArrayList<>();
        result.add(pid);
        findIdByPidPri(pid,companyId,result);
        return result;
	}

	private void findIdByPidPri(Long pid, Long companyId,List<Long> result){
		List<CompanyAgency> agencys = companyAgencyMapper.findChildNodeByPidAndCompanyId(pid,companyId);
        for (CompanyAgency companyAgency:agencys) {
             result.add(companyAgency.getId());
             if(Constant.YES.equals(companyAgency.getHavingChildNode())) {
            	 findIdByPidPri(companyAgency.getId(), companyId,result);
             }
        }
	}
	@Override
	public BaseResponse findAllAgency(Long companyId){
    	try {
			List<CompanyAgencyReq> allData = null;
    		if(AGENCY_ALL_CACHE!= null) {
				allData = AGENCY_ALL_CACHE.get(companyId);
			}
    		if(allData==null){
				List<Object>  redisData = redisUtil.lGet(KEY+"_"+companyId,0,-1);
				if(redisData != null && redisData.size() > 0){
					allData = (List<CompanyAgencyReq>) redisData.get(0);
				}else {
					//获取所有机构信息
					allData = companyAgencyMapper.findAllNode(companyId);
				}
				if(AGENCY_ALL_CACHE != null) {
					AGENCY_ALL_CACHE.put(companyId, allData);
				}else{
					AGENCY_ALL_CACHE = new ConcurrentHashMap<>();
					AGENCY_ALL_CACHE.put(companyId,allData);
				}
			}

          return ResponseUtil.success(allData);
    	}catch(Exception e) {
    		logger.error("findAllAgency获取所有机构列表" , e);
			return ResponseUtil.error(ResultEnum.EXCEPTION);
    	}

    }
	
	@Override
	public BaseResponse findAllManagerAgency(Long companyId){
    	try {
    		List<CompanyAgencyReq> resultA = null;

    		if(AGENCY_CACHE != null) {
				resultA = AGENCY_CACHE.get(companyId);
			}
			if(resultA == null) {
				//先取redis缓存中的数值
				long beginTime = System.currentTimeMillis();
				logger.info("REDIS获取组织机构信息BEGIN");
				List<Object> redisData = redisUtil.lGet(KEY + "_" + companyId, 0, -1);
				logger.info("REDIS获取组织机构信息END");
				long endTime = System.currentTimeMillis();
				logger.info("REDIS获取组织机构信息耗时为{}毫秒", (endTime - beginTime));

				if(redisData != null && redisData.size() > 0){
					resultA = (List<CompanyAgencyReq>) redisData.get(0);
					logger.info("REDIS筛选组织机构信息BEGIN");
					beginTime  = System.currentTimeMillis();
					resultA = resultA.stream().filter(companyAgency -> companyAgency.getIsClaim() == 1)
							.collect(Collectors.toList());
					endTime  = System.currentTimeMillis();
					logger.info("REDIS筛选组织机构信息END");
					logger.info("REDIS筛选组织机构信息耗时为{}毫秒",(endTime-beginTime));
				}else{
					//获取所有机构信息
					logger.info("MYSQL获取组织机构信息BEGIN");
					resultA = companyAgencyMapper.findAllisClaimNode(companyId,1);
					logger.info("MYSQL获取组织机构信息END");
					logger.info("MYSQL获取组织机构信息耗时为{}毫秒",(endTime-beginTime));
				}
				if(AGENCY_CACHE != null) {
					AGENCY_CACHE.put(companyId, resultA);
				}else{
					AGENCY_CACHE = new ConcurrentHashMap<>();
					AGENCY_CACHE.put(companyId,resultA);
				}
			}

    		return ResponseUtil.success(resultA);
    	}catch(Exception e) {
    		logger.error("findAllAgency获取所有机构列表" , e);
			return ResponseUtil.error(ResultEnum.EXCEPTION);
    	}

    }

	@Override
	public BaseResponse findAgencyOfLevel(Long id,Long companyId){
    	try {
    		//获取机构信息
    		Long agencyId = findFenId(id,companyId);
    		return ResponseUtil.success(agencyId);
    	}catch(Exception e) {
    		logger.error("findAgencyOfLevel根据机构id 查询 父级2级机构id" , e);
			return ResponseUtil.error(ResultEnum.EXCEPTION);
    	}

    }
	//根据id 查询父级2级机构id
	private Long findFenId(Long id,Long companyId) {
		Long agencyId;
		//获取机构信息
    	CompanyAgencyReq resultA = companyAgencyMapper.findAgencyOfLevel(id,companyId);
    	if(resultA.getAgencyLevel()==2) {
    		agencyId = resultA.getId();
    	}else if(resultA.getAgencyLevel()!=1){//三级或者四级机构 查询上级机构
    		agencyId = findFenId(resultA.getPid(),companyId);
    	}else {//如果是一级机构 直接返回id
    		agencyId = resultA.getId();
    	}
    	return agencyId;
	}

	@Override
	public List<Long> findByChildId(Long id, Long companyId,List<Long> result) {
		result.add(id);
		CompanyAgencyReq req = companyAgencyMapper.findAgencyById(id,companyId);
		if(req.getPid() == null){
			return result;
		}
		return findByChildId(req.getPid(),companyId,result);
	}
	
	
	  @Override 
	  public BaseResponse findAgencyByLevel(Long companyId, int agencyLevel){
		  try { 
			  //获取所有机构信息 
			  List<CompanyAgencyReq> resultA = companyAgencyMapper.findAgencyByLevel(companyId,agencyLevel); 
			  return ResponseUtil.success(resultA); 
		  }catch(Exception e) {
			  logger.error("findAgencyByLevel根据机构等级查询机构信息" , e); return
			  ResponseUtil.error(ResultEnum.EXCEPTION); 
		  }
	  }
	  
	  @Override 
	  public BaseResponse findAgencyByIdLevel(Long id, Integer agencyLevel, Long comapnyId){
		  try {
			  
			  List<CompanyAgencyReq> resultA = new ArrayList<>();
			  if(agencyLevel == 1){
			  	  resultA = (List<CompanyAgencyReq>)findAllAgency(comapnyId).getData();
			  }else if(agencyLevel == 2) {
				  resultA = companyAgencyMapper.findAllAgencyByTwoId(id);
			  }else if(agencyLevel == 3){
				  resultA = companyAgencyMapper.findAllAgencyByThreeId(id);
			  }else if(agencyLevel == 4) {
				  resultA = companyAgencyMapper.findAllAgencyByFourId(id);
			  }
			  return ResponseUtil.success(resultA); 
		  }catch(Exception e) {
			  logger.error("findAgencyByIdLevel根据机构id查询机构树信息出现异常" , e); return
			  ResponseUtil.error(ResultEnum.EXCEPTION); 
		  }
	  }
	 
}
