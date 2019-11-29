package com.injured.project.system.role.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.injured.common.utils.security.ShiroUtils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.injured.common.utils.poi.ExcelUtil;
import com.injured.framework.aspectj.lang.annotation.Log;
import com.injured.framework.aspectj.lang.enums.BusinessType;
import com.injured.framework.web.controller.BaseController;
import com.injured.framework.web.domain.AjaxResult;
import com.injured.framework.web.page.TableDataInfo;
import com.injured.project.system.menu.domain.Menu;
import com.injured.project.system.menu.service.IMenuService;
import com.injured.project.system.role.domain.Role;
import com.injured.project.system.role.domain.RoleMenu;
import com.injured.project.system.role.domain.SysUserAgnecyPrice;
import com.injured.project.system.role.domain.SysUserAgencyPriceVo;
import com.injured.project.system.role.domain.UserMenuVo;
import com.injured.project.system.role.service.IRoleService;
import com.injured.project.system.role.service.RoleServiceImpl;
import com.injured.project.system.user.domain.User;
import com.injured.project.system.user.domain.UserRole;
import com.injured.project.system.user.service.IUserService;

/**
 * 角色信息
 * 
 * @author lzx
 */
@Controller
@RequestMapping("/system/role")
public class RoleController extends BaseController
{
	
    
    private static Logger logger = LogManager.getLogger(RoleController.class);
    
    private String prefix = "system/role";

    @Autowired
    private IRoleService roleService;

    @Autowired
    private IUserService userService;

    @Autowired
    private IMenuService menuService;
    
    @RequiresPermissions("system:role:view")
    @GetMapping()
    public String role()
    {
        return prefix + "/role";
    }

//    @RequiresPermissions("system:role:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Role role)
    {
        startPage();
        List<Role> list = roleService.selectRoleList(role);
        return getDataTable(list);
    }

    @Log(title = "角色管理", businessType = BusinessType.EXPORT)
    @RequiresPermissions("system:role:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Role role)
    {
        List<Role> list = roleService.selectRoleList(role);
        ExcelUtil<Role> util = new ExcelUtil<Role>(Role.class);
        return util.exportExcel(list, "角色数据");
    }

    /**
     * 新增角色
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存角色
     */
    @Log(title = "角色管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Role role)
    {
        return toAjax(roleService.insertRole(role));

    }

    /**
     * 修改角色
     */
    @GetMapping("/edit/{userId}/{flag}")
    public String edit(@PathVariable("userId") Long userId, @PathVariable("flag") String flag, ModelMap mmap)
    {
        mmap.put("userId", userId);
        mmap.put("flag", flag);
        mmap.put("roleId", roleService.selectRoleId(userId));
        // 获取当前的用户
        User currentUser = ShiroUtils.getSysUser();
        User user = userService.selectUserInfoById(userId,currentUser.getCompanyId());
        mmap.put("user",user);
        return prefix + "/edit";
    }

    @GetMapping("/menuList")
    @ResponseBody
    public AjaxResult getUserRole(){
        //作业权限
        List<Menu> bizMenus = new LinkedList<>();

        //审批权限
        List<Menu> spMenus = menuService.selectMenuByRemark("1");

        Map<String, List> data = new HashMap<>();
        data.put("biz", bizMenus);
        data.put("sp", spMenus);

        return success(data);
    }
    @GetMapping("/agencyLevelList/{userId}/{roleId}")
    @ResponseBody
    public AjaxResult getAgencyLevel(@PathVariable("userId") Long userId,@PathVariable("roleId") Long roleId){
    	long beginTimeA = System.currentTimeMillis();
    	long beginTime = System.currentTimeMillis();
    	List<SysUserAgnecyPrice>  agencyPriceList = roleService.selectByUserId(userId);
    	long endTime = System.currentTimeMillis();
    	logger.info("查询用户金额权限列表耗时为{}毫秒",(endTime-beginTime));
    	
    	
    	beginTime = System.currentTimeMillis();
    	List<RoleMenu>  roleMenuList = roleService.selectMenuByRoleId(roleId);
    	endTime = System.currentTimeMillis();
    	logger.info("查询用户菜单权限列表耗时为{}毫秒",(endTime-beginTime));
    	
    	beginTime = System.currentTimeMillis();
    	List<SysUserAgencyPriceVo> sysList = roleService.selectUserPrice(roleMenuList, agencyPriceList, userId);
    	endTime = System.currentTimeMillis();
    	logger.info("查询用户金额权限列表2耗时为{}毫秒",(endTime-beginTime));
    	
        Map<String, List> data = new HashMap<>();
        data.put("roleMenuList", roleMenuList);
        data.put("sysList", sysList);
        long endTimeA = System.currentTimeMillis();
    	logger.info("构建机构权限总耗时为{}毫秒",(endTimeA-beginTimeA));
        return success(data);
    }
    
    /**
     * 修改保存角色
     */
    @Log(title = "角色管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(@RequestBody String jsonData)
    {
    	UserMenuVo userMenuVo = JSON.parseObject(jsonData, UserMenuVo.class);
        return toAjax(roleService.updateRoleMenu(userMenuVo));
    }

    /**
     * 角色分配数据权限
     */
    @GetMapping("/authDataScope/{roleId}")
    public String authDataScope(@PathVariable("roleId") Long roleId, ModelMap mmap)
    {
        mmap.put("role", roleService.selectRoleById(roleId));
        return prefix + "/dataScope";
    }

    /**
     * 保存角色分配数据权限
     */
    @Log(title = "角色管理", businessType = BusinessType.UPDATE)
    @PostMapping("/authDataScope")
    @ResponseBody
    public AjaxResult authDataScopeSave(Role role)
    {
        if (roleService.authDataScope(role) > 0)
        {
            setSysUser(userService.selectUserById(getSysUser().getUserId()));
            return success();
        }
        return error();
    }

//    @RequiresPermissions("system:role:remove")
    @Log(title = "角色管理", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        try
        {
            return toAjax(roleService.deleteRoleByIds(ids));
        }
        catch (Exception e)
        {
            return error(e.getMessage());
        }
    }

    /**
     * 校验角色名称
     */
    @PostMapping("/checkRoleNameUnique")
    @ResponseBody
    public String checkRoleNameUnique(Role role)
    {
        return roleService.checkRoleNameUnique(role);
    }

    /**
     * 校验角色权限
     */
    @PostMapping("/checkRoleKeyUnique")
    @ResponseBody
    public String checkRoleKeyUnique(Role role)
    {
        return roleService.checkRoleKeyUnique(role);
    }

    /**
     * 选择菜单树
     */
    @GetMapping("/selectMenuTree")
    public String selectMenuTree()
    {
        return prefix + "/tree";
    }

    /**
     * 角色状态修改
     */
    @Log(title = "角色管理", businessType = BusinessType.UPDATE)
    @PostMapping("/changeStatus")
    @ResponseBody
    public AjaxResult changeStatus(Role role)
    {
        return toAjax(roleService.changeStatus(role));
    }

    /**
     * 分配用户
     */
//    @RequiresPermissions("system:role:edit")
    @GetMapping("/authUser/{roleId}")
    public String authUser(@PathVariable("roleId") Long roleId, ModelMap mmap)
    {
        mmap.put("role", roleService.selectRoleById(roleId));
        return prefix + "/authUser";
    }

    /**
     * 查询已分配用户角色列表
     */
    @RequiresPermissions("system:role:list")
    @PostMapping("/authUser/allocatedList")
    @ResponseBody
    public TableDataInfo allocatedList(User user)
    {
        startPage();
        List<User> list = userService.selectAllocatedList(user);
        return getDataTable(list);
    }

    /**
     * 取消授权
     */
    @Log(title = "角色管理", businessType = BusinessType.GRANT)
    @PostMapping("/authUser/cancel")
    @ResponseBody
    public AjaxResult cancelAuthUser(UserRole userRole)
    {
        return toAjax(roleService.deleteAuthUser(userRole));
    }

    /**
     * 批量取消授权
     */
    @Log(title = "角色管理", businessType = BusinessType.GRANT)
    @PostMapping("/authUser/cancelAll")
    @ResponseBody
    public AjaxResult cancelAuthUserAll(Long roleId, String userIds)
    {
        return toAjax(roleService.deleteAuthUsers(roleId, userIds));
    }

    /**
     * 选择用户
     */
    @GetMapping("/authUser/selectUser/{roleId}")
    public String selectUser(@PathVariable("roleId") Long roleId, ModelMap mmap)
    {
        mmap.put("role", roleService.selectRoleById(roleId));
        return prefix + "/selectUser";
    }

    /**
     * 查询未分配用户角色列表
     */
    @RequiresPermissions("system:role:list")
    @PostMapping("/authUser/unallocatedList")
    @ResponseBody
    public TableDataInfo unallocatedList(User user)
    {
        startPage();
        List<User> list = userService.selectUnallocatedList(user);
        return getDataTable(list);
    }

    /**
     * 批量选择用户授权
     */
    @Log(title = "角色管理", businessType = BusinessType.GRANT)
    @PostMapping("/authUser/selectAll")
    @ResponseBody
    public AjaxResult selectAuthUserAll(Long roleId, String userIds)
    {
        return toAjax(roleService.insertAuthUsers(roleId, userIds));
    }
}