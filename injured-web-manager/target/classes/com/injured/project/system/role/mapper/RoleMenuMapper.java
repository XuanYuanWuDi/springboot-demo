package com.injured.project.system.role.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.injured.project.system.role.domain.RoleMenu;

/**
 * 角色与菜单关联表 数据层
 * 
 * @author lzx
 */
public interface RoleMenuMapper
{
    /**
     * 通过角色ID删除角色和菜单关联
     * 
     * @param roleId 角色ID
     * @return 结果
     */
    public int deleteRoleMenuByRoleId(Long roleId);
    
    /**
     * 批量删除角色菜单关联信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRoleMenu(Long[] ids);
    
    /**
     * 查询菜单使用数量
     * 
     * @param menuId 菜单ID
     * @return 结果
     */
    public int selectCountRoleMenuByMenuId(Long menuId);
    
    /**
     * 批量新增角色菜单信息
     * 
     * @param roleMenuList 角色菜单列表
     * @return 结果
     */
    public int batchRoleMenu(List<RoleMenu> roleMenuList);
    
    /**
     * 根据用户id 查询权限信息
     * @return
     */
    public List<RoleMenu> selectPermissionsByUserId(@Param("userId") Long userId);
    
    /**
     * 添加菜单权限信息 
     * @param roleMenu
     */
    public void insertRoleMenu(RoleMenu roleMenu);
    
    /**
     * 根据 角色id查询菜单列表
     * @param userId
     * @return
     */
    public List<RoleMenu> selectMenuByRoleId(@Param("roleId") Long roleId);
    
    public int deleteByRoleIdAndMenu(
    		@Param("roleId") Long roleId,
    		@Param("menuId") Long menuId
    		);
    
    public int selectCountByRoleIdMenuId(
    		@Param("roleId") Long roleId,
    		@Param("menuId") Long menuId);
}
