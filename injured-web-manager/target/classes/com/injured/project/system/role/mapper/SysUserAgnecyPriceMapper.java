package com.injured.project.system.role.mapper;

import com.injured.project.system.role.domain.SysUserAgnecyPrice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUserAgnecyPriceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUserAgnecyPrice record);

    int insertSelective(SysUserAgnecyPrice record);

    SysUserAgnecyPrice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUserAgnecyPrice record);

    int updateByPrimaryKey(SysUserAgnecyPrice record);

    List<SysUserAgnecyPrice> selectByUserIdAndMenuId(@Param(value = "userId")Long userId,@Param(value = "menuId")Long menuId);
    
    /**
     * 批量新增菜单权限信息
     * 
     * @param userAgnecyPriceList 用户权限列表
     * @return 结果
     */
    public int batchAgencyPrice(List<SysUserAgnecyPrice> userAgnecyPriceList);
    /**
     * 根据用户id 删除该用户权限信息
     * @param userId
     * @return
     */
    public int deleteByUserId(@Param(value = "userId")Long userId);
    
    /**
     * 根据userId 查询用户权限信息
     * @param userId
     * @return
     */
    public List<SysUserAgnecyPrice> selectByUserId(@Param(value = "userId")Long userId);
}