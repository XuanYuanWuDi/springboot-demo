package com.injured.project.system.role.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Reference;
import com.injured.common.constant.UserConstants;
import com.injured.common.exception.BusinessException;
import com.injured.common.utils.StringUtils;
import com.injured.common.utils.security.ShiroUtils;
import com.injured.common.utils.spring.SpringUtils;
import com.injured.common.utils.text.Convert;
import com.injured.framework.aspectj.lang.annotation.DataScope;
import com.injured.framework.web.domain.Ztree;
import com.injured.project.compensat.service.DispatchedWorkerService;
import com.injured.project.system.menu.domain.Menu;
import com.injured.project.system.menu.mapper.MenuMapper;
import com.injured.project.system.role.domain.Role;
import com.injured.project.system.role.domain.RoleDept;
import com.injured.project.system.role.domain.RoleMenu;
import com.injured.project.system.role.domain.UserMenuVo;
import com.injured.project.system.role.domain.SysUserAgnecyPrice;
import com.injured.project.system.role.domain.SysUserAgencyPriceVo;
import com.injured.project.system.role.mapper.RoleDeptMapper;
import com.injured.project.system.role.mapper.RoleMapper;
import com.injured.project.system.role.mapper.RoleMenuMapper;
import com.injured.project.system.role.mapper.SysUserAgnecyPriceMapper;
import com.injured.project.system.user.domain.User;
import com.injured.project.system.user.domain.UserRole;
import com.injured.project.system.user.mapper.UserRoleMapper;
import com.injured.server.api.contract.CompanyAgencyContract;
import com.injured.server.api.contract.InjuredStaffOperatLogContract;
import com.injured.server.api.entity.InjuredStaffOperatLog;
import com.injured.server.api.enums.TaskType;
import com.injured.server.api.model.request.fast.CompanyAgencyReq;
import com.injured.server.api.model.response.BaseResponse;

/**
 * 角色 业务层处理
 * 
 * @author lzx
 */
@Service
public class RoleServiceImpl implements IRoleService
{
    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private RoleMenuMapper roleMenuMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private RoleDeptMapper roleDeptMapper;
    
    @Autowired
    private SysUserAgnecyPriceMapper sysUserAgnecyPriceMapper;
    
    @Reference(timeout = 600000)
    private InjuredStaffOperatLogContract injuredStaffOperatLogContract;
    
    @Reference(timeout = 600000)
    private CompanyAgencyContract companyAgencyContract;
    
    @Autowired
    private MenuMapper menuMapper;
    
    private static Logger logger = LogManager.getLogger(RoleServiceImpl.class);
    

    /**
     * 根据条件分页查询角色数据
     * 
     * @param role 角色信息
     * @return 角色数据集合信息
     */
    @Override
    @DataScope(tableAlias = "u")
    public List<Role> selectRoleList(Role role)
    {
        return roleMapper.selectRoleList(role);
    }

    /**
     * 根据用户ID查询权限
     * 
     * @param userId 用户ID
     * @return 权限列表
     */
    @Override
    public Set<String> selectRoleKeys(Long userId)
    {
        List<Role> perms = roleMapper.selectRolesByUserId(userId);
        Set<String> permsSet = new HashSet<>();
        for (Role perm : perms)
        {
            if (StringUtils.isNotNull(perm))
            {
                permsSet.addAll(Arrays.asList(perm.getRoleKey().trim().split(",")));
            }
        }
        return permsSet;
    }

    /**
     * 根据用户ID查询角色
     * 
     * @param userId 用户ID
     * @return 角色列表
     */
    @Override
    public List<Role> selectRolesByUserId(Long userId)
    {
        List<Role> userRoles = roleMapper.selectRolesByUserId(userId);
        List<Role> roles = selectRoleAll();
        for (Role role : roles)
        {
            for (Role userRole : userRoles)
            {
                if (role.getRoleId().longValue() == userRole.getRoleId().longValue())
                {
                    role.setFlag(true);
                    break;
                }
            }
        }
        return roles;
    }

    /**
     * 查询所有角色
     * 
     * @return 角色列表
     */
    @Override
    public List<Role> selectRoleAll()
    {
        return SpringUtils.getAopProxy(this).selectRoleList(new Role());
    }

    /**
     * 通过角色ID查询角色
     * 
     * @param roleId 角色ID
     * @return 角色对象信息
     */
    @Override
    public Role selectRoleById(Long roleId)
    {
        return roleMapper.selectRoleById(roleId);
    }

    /**
     * 通过角色ID删除角色
     * 
     * @param roleId 角色ID
     * @return 结果
     */
    @Override
    public boolean deleteRoleById(Long roleId)
    {
        return roleMapper.deleteRoleById(roleId) > 0 ? true : false;
    }

    /**
     * 批量删除角色信息
     * 
     * @param ids 需要删除的数据ID
     * @throws Exception
     */
    @Override
    public int deleteRoleByIds(String ids) throws BusinessException
    {
        Long[] roleIds = Convert.toLongArray(ids);
        for (Long roleId : roleIds)
        {
            Role role = selectRoleById(roleId);
            if (countUserRoleByRoleId(roleId) > 0)
            {
                throw new BusinessException(String.format("%1$s已分配,不能删除", role.getRoleName()));
            }
        }
        return roleMapper.deleteRoleByIds(roleIds);
    }

    /**
     * 新增保存角色信息
     * 
     * @param role 角色信息
     * @return 结果
     */
    @Override
    @Transactional
    public int insertRole(Role role)
    {
        role.setCreateBy(ShiroUtils.getLoginName());
        // 新增角色信息
        roleMapper.insertRole(role);
        ShiroUtils.clearCachedAuthorizationInfo();
        return insertRoleMenu(role);
    }

    /**
     * 修改保存角色信息
     * 
     * @param role 角色信息
     * @return 结果
     */
    @Override
    @Transactional
    public int updateRole(Role role)
    {
        role.setUpdateBy(ShiroUtils.getLoginName());
        // 修改角色信息
        roleMapper.updateRole(role);
        ShiroUtils.clearCachedAuthorizationInfo();
        // 删除角色与菜单关联
        roleMenuMapper.deleteRoleMenuByRoleId(role.getRoleId());
        return insertRoleMenu(role);
    }

    /**
     * 修改数据权限信息
     * 
     * @param role 角色信息
     * @return 结果
     */
    @Override
    @Transactional
    public int authDataScope(Role role)
    {
        role.setUpdateBy(ShiroUtils.getLoginName());
        // 修改角色信息
        roleMapper.updateRole(role);
        // 删除角色与部门关联
        roleDeptMapper.deleteRoleDeptByRoleId(role.getRoleId());
        // 新增角色和部门信息（数据权限）
        return insertRoleDept(role);
    }

    /**
     * 新增角色菜单信息
     * 
     * @param role 角色对象
     */
    public int insertRoleMenu(Role role)
    {
        int rows = 1;
        // 新增用户与角色管理
        List<RoleMenu> list = new ArrayList<RoleMenu>();
        for (Long menuId : role.getMenuIds())
        {
            RoleMenu rm = new RoleMenu();
            rm.setRoleId(role.getRoleId());
            rm.setMenuId(menuId);
            list.add(rm);
        }
        if (list.size() > 0)
        {
            rows = roleMenuMapper.batchRoleMenu(list);
        }
        return rows;
    }

    /**
     * 新增角色部门信息(数据权限)
     *
     * @param role 角色对象
     */
    public int insertRoleDept(Role role)
    {
        int rows = 1;
        // 新增角色与部门（数据权限）管理
        List<RoleDept> list = new ArrayList<RoleDept>();
        for (Long deptId : role.getDeptIds())
        {
            RoleDept rd = new RoleDept();
            rd.setRoleId(role.getRoleId());
            rd.setDeptId(deptId);
            list.add(rd);
        }
        if (list.size() > 0)
        {
            rows = roleDeptMapper.batchRoleDept(list);
        }
        return rows;
    }

    /**
     * 校验角色名称是否唯一
     * 
     * @param role 角色信息
     * @return 结果
     */
    @Override
    public String checkRoleNameUnique(Role role)
    {
        Long roleId = StringUtils.isNull(role.getRoleId()) ? -1L : role.getRoleId();
        Role info = roleMapper.checkRoleNameUnique(role.getRoleName());
        if (StringUtils.isNotNull(info) && info.getRoleId().longValue() != roleId.longValue())
        {
            return UserConstants.ROLE_NAME_NOT_UNIQUE;
        }
        return UserConstants.ROLE_NAME_UNIQUE;
    }

    /**
     * 校验角色权限是否唯一
     * 
     * @param role 角色信息
     * @return 结果
     */
    @Override
    public String checkRoleKeyUnique(Role role)
    {
        Long roleId = StringUtils.isNull(role.getRoleId()) ? -1L : role.getRoleId();
        Role info = roleMapper.checkRoleKeyUnique(role.getRoleKey());
        if (StringUtils.isNotNull(info) && info.getRoleId().longValue() != roleId.longValue())
        {
            return UserConstants.ROLE_KEY_NOT_UNIQUE;
        }
        return UserConstants.ROLE_KEY_UNIQUE;
    }

    /**
     * 通过角色ID查询角色使用数量
     * 
     * @param roleId 角色ID
     * @return 结果
     */
    @Override
    public int countUserRoleByRoleId(Long roleId)
    {
        return userRoleMapper.countUserRoleByRoleId(roleId);
    }

    /**
     * 角色状态修改
     * 
     * @param role 角色信息
     * @return 结果
     */
    @Override
    public int changeStatus(Role role)
    {
        return roleMapper.updateRole(role);
    }

    /**
     * 取消授权用户角色
     * 
     * @param userRole 用户和角色关联信息
     * @return 结果
     */
    @Override
    public int deleteAuthUser(UserRole userRole)
    {
        return userRoleMapper.deleteUserRoleInfo(userRole);
    }

    /**
     * 批量取消授权用户角色
     * 
     * @param roleId 角色ID
     * @param userIds 需要删除的用户数据ID
     * @return 结果
     */
    public int deleteAuthUsers(Long roleId, String userIds)
    {
        return userRoleMapper.deleteUserRoleInfos(roleId, Convert.toLongArray(userIds));
    }

    /**
     * 批量选择授权用户角色
     * 
     * @param roleId 角色ID
     * @param userIds 需要删除的用户数据ID
     * @return 结果
     */
    public int insertAuthUsers(Long roleId, String userIds)
    {
        Long[] users = Convert.toLongArray(userIds);
        // 新增用户与角色管理
        List<UserRole> list = new ArrayList<UserRole>();
        for (Long userId : users)
        {
            UserRole ur = new UserRole();
            ur.setUserId(userId);
            ur.setRoleId(roleId);
            list.add(ur);
        }
        return userRoleMapper.batchUserRole(list);
    }
    
    /**
     * 根据用户id 查询权限信息
     * 
     * @param userId 用户id
     * @return 角色数据集合信息
     */
    @Override
    public List<RoleMenu> selectPermissionsByUserId(Long userId)
    {
        return roleMenuMapper.selectPermissionsByUserId(userId);
    }
    
    /**
     * 修改保存权限信息
     * 
     * @param role 角色信息
     * @return 结果
     */
    @Override
    @Transactional
    public int updateRoleMenu(UserMenuVo userMenuVo)
    {
    	
    	int rows = 1;
    	List<SysUserAgnecyPrice> agengcyPriceList = userMenuVo.getPriceList();
    	
    	List<RoleMenu> meneList = userMenuVo.getMenuList();
    	
    	if(meneList!=null && meneList.size()>0) {
    		//角色-菜单表 sys_role_menu
    		//// 删除角色与菜单权限关联
    		roleMenuMapper.deleteRoleMenuByRoleId(userMenuVo.getMenuList().get(0).getRoleId());
    		//新增
    		rows = roleMenuMapper.batchRoleMenu(meneList);
    		
    		//机构-金额权限
    		if(agengcyPriceList!=null && agengcyPriceList.size()>0) {
    			for(SysUserAgnecyPrice price : agengcyPriceList) {
    				Menu menu = menuMapper.selectChildMenu(price.getMenuId());
    				if(menu!=null) {
    					price.setMenuId(menu.getMenuId());
    				}
    			}
        		//派工专用表-sys_user_agnecy_price
        		// 删除角色与权限关联
        		sysUserAgnecyPriceMapper.deleteByUserId(agengcyPriceList.get(0).getUserId());
        		//新增
        		rows = sysUserAgnecyPriceMapper.batchAgencyPrice(agengcyPriceList);
        	}
    	}else {
    		// 删除角色与菜单权限关联
    		roleMenuMapper.deleteRoleMenuByRoleId(userMenuVo.getRoleId());
    		// 删除角色与权限关联
    		sysUserAgnecyPriceMapper.deleteByUserId(userMenuVo.getUserId());
    	}
    	
    	
    	// 获取当前的用户
        User currentUser = ShiroUtils.getSysUser();
    	//记录修改操作日志
		InjuredStaffOperatLog injuredStaff = new InjuredStaffOperatLog();
		injuredStaff.setCreateTime(new Date());
		injuredStaff.setSubmitName(currentUser.getUserName());
		injuredStaff.setSubmitNo(currentUser.getUserNo());
		injuredStaff.setCompanyId(currentUser.getCompanyId());
    	if(userMenuVo.getRemark()!=null && userMenuVo.getRemark()!="") {
    		injuredStaff.setSurveyId(userMenuVo.getUserId());
    		injuredStaff.setOpinionDesc(userMenuVo.getRemark());
    		injuredStaff.setSubmitOpinion("修改用户权限");
    		injuredStaff.setSubmitTask(TaskType.USER_PERMISSION.getCode());
    		injuredStaffOperatLogContract.addInjuredStaffLog(injuredStaff);
    	}
        
    	return rows;
    }
    
    
    private int updatePermissions(UserMenuVo userMenuVo) {
    	int rows = 1;
    	List<SysUserAgnecyPrice> agengcyPriceList = userMenuVo.getPriceList();
    	
    	List<RoleMenu> meneList = userMenuVo.getMenuList();
    	
    	if(meneList!=null && meneList.size()>0) {
    		//角色-菜单表 sys_role_menu
    		//// 删除角色与菜单权限关联
    		roleMenuMapper.deleteRoleMenuByRoleId(userMenuVo.getMenuList().get(0).getRoleId());
    		//新增
    		rows = roleMenuMapper.batchRoleMenu(meneList);
    		
    		//机构-金额权限
    		if(agengcyPriceList!=null && agengcyPriceList.size()>0) {
    			for(SysUserAgnecyPrice price : agengcyPriceList) {
    				Menu menu = menuMapper.selectChildMenu(price.getMenuId());
    				if(menu!=null) {
    					price.setMenuId(menu.getMenuId());
    				}
    			}
        		//派工专用表-sys_user_agnecy_price
        		// 删除角色与权限关联
        		sysUserAgnecyPriceMapper.deleteByUserId(agengcyPriceList.get(0).getUserId());
        		//新增
        		rows = sysUserAgnecyPriceMapper.batchAgencyPrice(agengcyPriceList);
        	}
    	}
    	return rows;
    }
    
    
    /**
     * 导入用户保存权限信息
     * 
     * @param role 角色信息
     * @return 结果
     */
    @Override
    @Transactional
    public int updateRoleMenuTest(UserMenuVo userMenuVo)
    {
    	int rows = updatePermissions(userMenuVo);
    	//记录修改操作日志
		InjuredStaffOperatLog injuredStaff = new InjuredStaffOperatLog();
		injuredStaff.setCreateTime(new Date());
		injuredStaff.setSubmitName("admin");
		injuredStaff.setSubmitNo("admin");
		injuredStaff.setCompanyId(userMenuVo.getCompanyId());
    	if(userMenuVo.getRemark()!=null && userMenuVo.getRemark()!="") {
    		injuredStaff.setSurveyId(userMenuVo.getUserId());
    		injuredStaff.setOpinionDesc(userMenuVo.getRemark());
    		injuredStaff.setSubmitOpinion("导入用户权限");
    		injuredStaff.setSubmitTask(TaskType.USER_PERMISSION.getCode());
    		injuredStaffOperatLogContract.addInjuredStaffLog(injuredStaff);
    	}
        
    	return rows;
    }
    
    @Override
    public Long selectRoleId(Long userId)
    {
        return userRoleMapper.selectRoleId(userId);
    }
    
    public List<SysUserAgnecyPrice> selectByUserId(Long userId){
    	return sysUserAgnecyPriceMapper.selectByUserId(userId);
    }
    
    /**
     * 根据角色id 查询用户菜单信息
     * 
     * @param roleId 用户id
     * @return 角色数据集合信息
     */
    @Override
    public List<RoleMenu> selectMenuByRoleId(Long roleId)
    {
        return roleMenuMapper.selectMenuByRoleId(roleId);
    }
    
    public List<SysUserAgnecyPrice> selectByUserIdAndMenuId(Long userId,Long menuId){
    	return sysUserAgnecyPriceMapper.selectByUserIdAndMenuId(userId,menuId);
    }
    
    public List<SysUserAgencyPriceVo> selectUserPrice(List<RoleMenu>  roleMenuList,List<SysUserAgnecyPrice>  agencyPriceList,Long userId){
    	// 获取当前的用户
        User currentUser = ShiroUtils.getSysUser();
    	List<SysUserAgnecyPrice>  agencyList = new ArrayList<>();
    	List<SysUserAgencyPriceVo> sPriceVoList = new ArrayList<>();
    	SysUserAgencyPriceVo sPriceVo = null;
    	List<Ztree> ztreeList = new ArrayList<>();
    	
    	List<String> nameList = new ArrayList<>();
    	List<Long> longList = new ArrayList<>();
    	
    	Ztree ztree = new Ztree();
    	long beginTime = System.currentTimeMillis();
    	//循环菜单列表，获取菜单中对应的所选机构
    	for(RoleMenu ruleMenu: roleMenuList) {
    		//根据菜单id查询权限使用的菜单id
    		Menu menu = menuMapper.selectChildMenu(ruleMenu.getMenuId());
    		long endTime = System.currentTimeMillis();
    		logger.info("获取菜单信息耗时为{}毫秒====="+(endTime - beginTime));
    		//获取机构权限list
    		beginTime = System.currentTimeMillis();
    		agencyList = this.selectByUserIdAndMenuId(userId, menu.getMenuId());
    		endTime = System.currentTimeMillis();
    		logger.info("获取机构权限信息耗时为{}毫秒====="+(endTime - beginTime));
    		
    		//menuId 对应 机构List
    		sPriceVo = new SysUserAgencyPriceVo();
			sPriceVo.setMenuId(ruleMenu.getMenuId());
			ztreeList = new ArrayList<>();
			
			nameList = new ArrayList<>();
			longList = new ArrayList<>();
			//循环权限list
    		for(SysUserAgnecyPrice agency:agencyList) {
    			//根据机构id查询机构详细信息
    			beginTime = System.currentTimeMillis();
    			BaseResponse baseResponse = companyAgencyContract.findAgencyById(agency.getAgencyId(), currentUser.getCompanyId());
    			endTime = System.currentTimeMillis();
        		logger.info("根据机构id查询机构详细信息耗时为{}毫秒====="+(endTime - beginTime));
    			CompanyAgencyReq req = (CompanyAgencyReq)baseResponse.getData();
    			ztree = getZtree(req);
    			//选中机构
    			ztree.setIsCheck("checked");
    			//金额范围
    			String[] ranges = agency.getPriceScope().split("&");
    			if(ranges.length == 2) {
    				ztree.setStartPrice(ranges[0].replaceAll(">", ""));
    				ztree.setEndPrice(ranges[1].replaceAll("<=", ""));
    			}
				
    			
    			ztreeList.add(ztree);
    			
    			nameList.add(req.getAgencyName());
    			longList.add(req.getId());
    			
    			//查询该机构树
    			beginTime = System.currentTimeMillis();
    			BaseResponse base = companyAgencyContract.findAgencyByIdLevel(agency.getAgencyId(), req.getAgencyLevel(),currentUser.getCompanyId());
    			
    			List<CompanyAgencyReq> reqList= (List<CompanyAgencyReq>)base.getData();
    			for(CompanyAgencyReq comReq:reqList) {
    				ztree = getZtree(comReq);
    				if(!ztreeList.contains(ztree)) {
    					ztreeList.add(ztree);
    				}
    			}
    			endTime = System.currentTimeMillis();
				logger.info("REDIS获取组织机构信息耗时为{}毫秒====="+(endTime - beginTime));
    		}
    		if(ztreeList.size()>0) {
    			sPriceVo.setZtreeList(ztreeList);
    			sPriceVo.setNameList(nameList);
    			sPriceVo.setIdList(longList);
    		}
    		sPriceVoList.add(sPriceVo);
    	}
    	return sPriceVoList;
    }
    
    private Ztree getZtree(CompanyAgencyReq comReq) {
    	Ztree ztree = new Ztree();
        ztree.setId(comReq.getId());
        ztree.setpId(comReq.getPid());
        ztree.setName(comReq.getAgencyName());
        ztree.setTitle(comReq.getAgencyName());

        Map extInfo = new HashMap();
        extInfo.put("level", comReq.getAgencyLevel());
        ztree.setExtInfo(extInfo);
        
        return ztree;
    }
    
}
