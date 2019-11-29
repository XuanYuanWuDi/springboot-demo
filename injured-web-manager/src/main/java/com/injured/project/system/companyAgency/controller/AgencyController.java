package com.injured.project.system.companyAgency.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.injured.framework.web.page.TableDataInfo;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.injured.common.utils.StringUtils;
import com.injured.common.utils.security.ShiroUtils;
import com.injured.framework.aspectj.lang.annotation.Log;
import com.injured.framework.aspectj.lang.enums.BusinessType;
import com.injured.framework.web.controller.BaseController;
import com.injured.framework.web.domain.AjaxResult;
import com.injured.framework.web.domain.Ztree;
import com.injured.project.system.user.domain.User;
import com.injured.server.api.contract.CompanyAgencyContract;
import com.injured.server.api.contract.InjuredStaffOperatLogContract;
import com.injured.server.api.entity.CompanyAgency;
import com.injured.server.api.entity.InjuredStaffOperatLog;
import com.injured.server.api.enums.ResultEnum;
import com.injured.server.api.enums.TaskType;
import com.injured.server.api.model.request.fast.CompanyAgencyReq;
import com.injured.server.api.model.response.BaseResponse;

/**
 * 机构信息
 * 
 * @author lzx
 */
@Controller
@RequestMapping("/system/agency")
public class AgencyController extends BaseController
{
    private String prefix = "system/companyAgency";

    @Reference(timeout = 60000)
    private CompanyAgencyContract companyAgencyContract;
    @Reference(timeout = 60000)
    private InjuredStaffOperatLogContract injuredStaffOperatLogContract;

    @RequiresPermissions("system:agency:view")
    @GetMapping()
    public String dept()
    {
        return prefix + "/agency";
    }

    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CompanyAgencyReq agency)
    {	
    	
    	if(agency.getStatus() == -1) {
    		return getDataTable(new ArrayList());
    	}
		// 获取当前的用户
        User currentUser = ShiroUtils.getSysUser();
        agency.setCompanyId(currentUser.getCompanyId());
        //只有总管理员才有 机构管理菜单
        BaseResponse baseResponse = companyAgencyContract.findAllList(agency);
        return getDataTable((List<CompanyAgencyReq>)baseResponse.getData());
    }

    /**
     * 修改
     */
    @GetMapping("/edit/{agencyId}")
    public String edit(@PathVariable("agencyId") Long agencyId, ModelMap mmap)
    {
    	// 获取当前的用户
        User currentUser = ShiroUtils.getSysUser();
        BaseResponse baseResponse = companyAgencyContract.findAgencyById(agencyId,currentUser.getCompanyId());
        CompanyAgencyReq conpany = (CompanyAgencyReq)baseResponse.getData();
        if(conpany!=null && conpany.getAgencyCodeUp()!=null) {
        	conpany.setAgencyNameUp("("+conpany.getAgencyCodeUp()+")"+conpany.getAgencyNameUp());
        }
        mmap.put("companyAgency", baseResponse.getData());
        return prefix + "/edit";
    }
    
    /**
     * 查询修改历史记录
     */
    @PostMapping("/editList/{agencyId}")
    @ResponseBody
    public TableDataInfo editList(@PathVariable("agencyId") Long agencyId)
    {
    	// 获取当前的用户
        User currentUser = ShiroUtils.getSysUser();
        BaseResponse baseResponse = injuredStaffOperatLogContract.logListByTaskId(TaskType.AGENCY_MANAGE.getCode(),agencyId,currentUser.getCompanyId());
        return getDataTable((List<InjuredStaffOperatLog>)baseResponse.getData());
    }

    /**
     * 保存
     */
    @Log(title = "机构管理", businessType = BusinessType.UPDATE)
    @PostMapping("/save")
    @ResponseBody
    public AjaxResult editSave(CompanyAgency agency)
    {
    	// 获取当前的用户
        User currentUser = ShiroUtils.getSysUser();
		BaseResponse baseResponse = companyAgencyContract.updateCompanyAgency(agency,currentUser.getUserName(),currentUser.getUserNo());
		if(ResultEnum.SUCCESS.getCode().equals(baseResponse.getCode())) {
			return toAjax(true);
		}
        return toAjax(false);
    }
    
    /**
     * 选择部门树
     */
    @GetMapping("/selectDeptTree/{agencyId}")
    public String selectDeptTree(@PathVariable("agencyId") Long agencyId, ModelMap mmap)
    {
    	// 获取当前的用户
        User currentUser = ShiroUtils.getSysUser();
    	BaseResponse baseResponse = companyAgencyContract.findAgencyById(agencyId,currentUser.getCompanyId());
    	if(baseResponse.getData() == null) {
    		mmap.put("agency", new CompanyAgencyReq());
    	}else {
    		mmap.put("agency", (CompanyAgencyReq)baseResponse.getData());
    	}
        return prefix + "/tree";
    }
    
    /**
     * 加载部门列表树
     */
    @GetMapping("/treeData")
    @ResponseBody
    public List<Ztree> treeData()
    {
    	// 获取当前的用户
        User currentUser = ShiroUtils.getSysUser();
    	BaseResponse baseResponse = companyAgencyContract.findAllAgency(currentUser.getCompanyId());
    	List<Ztree> ztrees = initZtree((List<CompanyAgencyReq>)baseResponse.getData(),null);
        return ztrees;
    }
    
    /**
     * 加载部门列表树
     */
    @GetMapping("/managerTreeData")
    @ResponseBody
    public List<Ztree> managerTreeData()
    {
    	// 获取当前的用户
        User currentUser = ShiroUtils.getSysUser();
    	BaseResponse baseResponse = companyAgencyContract.findAllManagerAgency(currentUser.getCompanyId());
    	List<Ztree> ztrees = initZtree((List<CompanyAgencyReq>)baseResponse.getData(),null);
        return ztrees;
    }
    
    /**
     * 对象转部门树
     *
     * @param deptList 部门列表
     * @param roleDeptList 角色已存在菜单列表
     * @return 树结构列表
     */
    private List<Ztree> initZtree(List<CompanyAgencyReq> agencyList, List<String> roleDeptList)
    {
        List<Ztree> ztrees = new ArrayList<Ztree>();
        boolean isCheck = StringUtils.isNotNull(roleDeptList);
        for (CompanyAgencyReq agency : agencyList)
        {
            Ztree ztree = new Ztree();
            ztree.setId(agency.getId());
            ztree.setpId(agency.getPid());
            ztree.setName(agency.getAgencyName());
            ztree.setTitle(agency.getAgencyName());


            Map extInfo = new HashMap();
            extInfo.put("level", agency.getAgencyLevel());
            ztree.setExtInfo(extInfo);

            if (isCheck)
            {
                ztree.setChecked(roleDeptList.contains(agency.getId() + agency.getAgencyName()));
            }
            ztrees.add(ztree);
        }
        return ztrees;
    }

    /**
     * 根据父id查询机构列表
     * @param pid
     * @return
     */
    @GetMapping("/findAgencyByPid")
    @ResponseBody
    public List<CompanyAgency> findAgencyByPid(Long pid){
        User user = getSysUser();
        Long companyId = user.getCompanyId();
        BaseResponse response= companyAgencyContract.findAgencyByPid(pid,companyId);
        return (List<CompanyAgency>) response.getData();
    }
}
