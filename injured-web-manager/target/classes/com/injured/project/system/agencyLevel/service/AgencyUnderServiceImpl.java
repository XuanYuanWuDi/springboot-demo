package com.injured.project.system.agencyLevel.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.injured.common.utils.security.ShiroUtils;
import com.injured.project.system.agencyLevel.domain.CompanyAgencyUnder;
import com.injured.project.system.agencyLevel.domain.CompanyAgencyUnderVo;
import com.injured.project.system.agencyLevel.mapper.CompanyAgencyUnderMapper;
import com.injured.project.system.user.domain.User;
import com.injured.server.api.contract.CompanyAgencyContract;
import com.injured.server.api.contract.InjuredStaffOperatLogContract;
import com.injured.server.api.entity.InjuredStaffOperatLog;
import com.injured.server.api.enums.TaskType;
import com.injured.server.api.model.response.BaseResponse;
/**
 * 用户 业务层处理
 * 
 * @author lzx
 */
@Service
public class AgencyUnderServiceImpl implements AgencyUnderService
{
    private static final Logger log = LoggerFactory.getLogger(AgencyUnderServiceImpl.class);

    @Autowired
    private CompanyAgencyUnderMapper companyAgencyUnderMapper;
    
    @Reference
    private CompanyAgencyContract companyAgencyContract;
    @Reference
    private InjuredStaffOperatLogContract injuredStaffOperatLogContract;

    /**
     * 
     *根据机构id，菜单id查询 审核级别
     * 
     * @param agencyId 机构id
     * @return menuId 菜单id
     */
    @Override
    public Integer selectAllocatedList(Long companyId,Long agencyId, List<Long> menuIds)
    {
    	BaseResponse baseResponse = companyAgencyContract.findAgencyOfLevel(agencyId,companyId);
    	Long id = (Long)baseResponse.getData();
        return companyAgencyUnderMapper.selectAgencyLevel(id,menuIds);
    }
    
    /**
     * 
     *根据机构id，菜单id 修改 审核级别
     *
     * @return menuId 菜单id
     */
    @Override
    public int updateAgencyLevel(CompanyAgencyUnderVo  underVo)
    {
    	int row = 1;
    	List<CompanyAgencyUnder> underList = underVo.getUnderList();
    	//// 获取当前的用户
        User currentUser = ShiroUtils.getSysUser();
    	for(CompanyAgencyUnder under:underList) {
    		under.setCompanyId(currentUser.getCompanyId());
    		List<Long> menuIds = new ArrayList<>();
            menuIds.add(under.getMenuId());
    		Integer level = companyAgencyUnderMapper.selectAgencyLevel(under.getAgencyId(),menuIds);
    		if(level != null && (level==1 || level == 2)) {
    			row = companyAgencyUnderMapper.updateAgencyLevel(under);
    		}else {
    			row = companyAgencyUnderMapper.insertSelective(under);
    		}
    		
    	}
    	
    	//记录修改操作日志
		InjuredStaffOperatLog injuredStaff = new InjuredStaffOperatLog();
		injuredStaff.setCreateTime(new Date());
		injuredStaff.setSubmitName(currentUser.getUserName());
		injuredStaff.setSubmitNo(currentUser.getUserNo());
		injuredStaff.setCompanyId(currentUser.getCompanyId());
		injuredStaff.setOpinionDesc(underVo.getRemark());
		injuredStaff.setSubmitOpinion("修改机构任务审核等级");
		injuredStaff.setSubmitTask(TaskType.TASK_MANAGE.getCode());
		injuredStaffOperatLogContract.addInjuredStaffLog(injuredStaff);
    	return row;
    }

    @Override
    public List<CompanyAgencyUnder> selectAgencyLevelByCompany(Long companyId){
    	return companyAgencyUnderMapper.selectAgencyLevelByCompany(companyId);
    }
    
    /**
     * 
     *根据机构id，菜单id查询 审核级别
     *
     * @return menuId 菜单id
     */
    @Override
    public Integer selectAgencyLevel(Long id,List<Long> menuIds)
    {
        return companyAgencyUnderMapper.selectAgencyLevel(id,menuIds);
    }
}
