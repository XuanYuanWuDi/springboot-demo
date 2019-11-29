package com.injured.project.system.agencyLevel.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.injured.common.utils.StringUtils;
import com.injured.common.utils.security.ShiroUtils;
import com.injured.framework.web.controller.BaseController;
import com.injured.framework.web.domain.AjaxResult;
import com.injured.framework.web.domain.Ztree;
import com.injured.project.system.agencyLevel.domain.CompanyAgencyUnder;
import com.injured.project.system.agencyLevel.domain.CompanyAgencyUnderVo;
import com.injured.project.system.agencyLevel.service.AgencyUnderService;
import com.injured.project.system.menu.domain.Menu;
import com.injured.project.system.menu.service.IMenuService;
import com.injured.project.system.user.domain.User;
import com.injured.server.api.contract.CompanyAgencyContract;
import com.injured.server.api.model.request.fast.CompanyAgencyReq;
import com.injured.server.api.model.response.BaseResponse;

/**
 * 角色信息
 * 
 * @author lzx
 */
@Controller
@RequestMapping("/system/agencyLevel")
public class AgencyLevelController extends BaseController
{
    private String prefix = "system/agencyLevel";

    @Autowired
    private AgencyUnderService agencyUnderService;
    
    @Autowired
    private IMenuService menuService;
    
    @Reference
    private CompanyAgencyContract companyAgencyContract;

    @RequiresPermissions("system:level:view")
    @GetMapping()
    public String role(ModelMap mmap)
    {
        return prefix + "/agencyLevel";
    }

    /**
     * 加载部门列表树
     */
    @GetMapping("/treeData")
    @ResponseBody
    public List<Ztree> treeData()
    {
    	//审批权限
        List<Menu> spMenus = menuService.selectPermissionsMenu("1");
    	
    	// 获取当前的用户
        User currentUser = ShiroUtils.getSysUser();
    	BaseResponse baseResponse = companyAgencyContract.findAgencyByLevel(currentUser.getCompanyId(),2);
    	List<Ztree> ztrees = initZtree((List<CompanyAgencyReq>)baseResponse.getData(),null,spMenus,currentUser.getCompanyId());
        return ztrees;
    }
    
    /**
     * 对象转部门树
     *
     * @param roleDeptList 角色已存在菜单列表
     * @return 树结构列表
     */
    private List<Ztree> initZtree(List<CompanyAgencyReq> agencyList, List<String> roleDeptList,List<Menu> spMenus,Long companyId)
    {
    	List<Ztree> ztrees = new ArrayList<Ztree>();
        boolean isCheck = StringUtils.isNotNull(roleDeptList);
    	for(Menu menu: spMenus) {
    		Ztree ztreeMenu = new Ztree();
    		ztreeMenu.setId(menu.getMenuId());
    		ztreeMenu.setName(menu.getMenuName());
    		ztreeMenu.setTitle(menu.getMenuName());
    		ztreeMenu.setpId(0L);
    		ztreeMenu.setMenuId(menu.getMenuId());
    		Map extInfoMenu = new HashMap();
    		extInfoMenu.put("level", 1);
            ztreeMenu.setExtInfo(extInfoMenu);
            ztrees.add(ztreeMenu);
            
    		for (CompanyAgencyReq agency : agencyList)
            {
                List<Long> menuIds = new ArrayList<>();
                menuIds.add(menu.getMenuId());
    			Integer level = agencyUnderService.selectAgencyLevel(agency.getId(),menuIds);
            	Ztree ztree = new Ztree();
            	ztree.setId(agency.getId());
                ztree.setpId(agency.getPid());
                ztree.setName(agency.getAgencyName());
                ztree.setTitle(agency.getAgencyName());
                ztree.setMenuId(menu.getMenuId());
                ztree.setUnderLevel(level);//机构审核等级
            	if(agency.getPid()==null) {
            		ztree.setpId(menu.getMenuId());
            	}

                Map extInfo = new HashMap();
                extInfo.put("level", (agency.getAgencyLevel()+1));
                ztree.setExtInfo(extInfo);

                if (isCheck)
                {
                    ztree.setChecked(roleDeptList.contains(agency.getId() + agency.getAgencyName()));
                }
                ztrees.add(ztree);
            }
    	}
        
        
        return ztrees;
    }
    
    /**
     *保存
     */
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editList(@RequestBody String jsonData)
    {
    	CompanyAgencyUnderVo underVo = JSON.parseObject(jsonData, CompanyAgencyUnderVo.class);
    	return toAjax(agencyUnderService.updateAgencyLevel(underVo));
    }
}