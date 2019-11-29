package com.injured.project.system.user.mapper;

import com.injured.project.system.user.domain.CompanyAgencyId;
import com.injured.project.system.user.domain.FastReviewedUser;
import com.injured.project.system.user.domain.ReformSchoolUser;
import com.injured.project.system.user.domain.User;
import com.injured.project.system.user.domain.UserVo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 用户表 数据层
 * 
 * @author lzx
 */
public interface UserMapper
{
    /**
     * 根据条件分页查询用户列表
     * 
     * @param user 用户信息
     * @return 用户信息集合信息
     */
    public List<User> selectUserList(UserVo user);

    /**
     * 根据条件分页查询未已配用户角色列表
     * 
     * @param user 用户信息
     * @return 用户信息集合信息
     */
    public List<User> selectAllocatedList(User user);

    /**
     * 根据条件分页查询未分配用户角色列表
     * 
     * @param user 用户信息
     * @return 用户信息集合信息
     */
    public List<User> selectUnallocatedList(User user);

    /**
     * 通过用户名查询用户
     * 
     * @param userName 用户名
     * @return 用户对象信息
     */
    public User selectUserByLoginName(String userName);

    /**
     * 通过手机号码查询用户
     * 
     * @param phoneNumber 手机号码
     * @return 用户对象信息
     */
    public User selectUserByPhoneNumber(String phoneNumber);

    /**
     * 通过用户ID查询用户
     * 
     * @param userId 用户ID
     * @return 用户对象信息
     */
    public User selectUserById(Long userId);

    /**
     * 通过用户ID删除用户
     * 
     * @param userId 用户ID
     * @return 结果
     */
    public int deleteUserById(Long userId);

    /**
     * 批量删除用户信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteUserByIds(Long[] ids);

    /**
     * 修改用户信息
     * 
     * @param user 用户信息
     * @return 结果
     */
    public int updateUser(User user);

    /**
     * 新增用户信息
     * 
     * @param user 用户信息
     * @return 结果
     */
    public int insertUser(User user);

    /**
     * 校验用户名称是否唯一
     * 
     * @param loginName 登录名称
     * @return 结果
     */
    public int checkLoginNameUnique(String loginName,Long companyId);

    /**
     * 校验手机号码是否唯一
     *
     * @param phonenumber 手机号码
     * @return 结果
     */
    public User checkPhoneUnique(String phonenumber);
    
    
    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    public User selectUserInfoById(
    		@Param("id")Long id,
    		@Param("companyId")Long companyId
    		);

    List<User> searchUserByNo(@Param("userNo")String userNo,@Param("companyId")Long companyId);
    
    /**
     * 
     * 
     * @param CompanyAgencyId
     * @return
     */
    List<FastReviewedUser> getAvailableUsers(CompanyAgencyId companyAgencyId);
    
    /**
     * 根据用户工号查询用户信息
     * @param userId
     * @param companyId
     * @return
     */
    public User selectUserByUserNo(
    		@Param("userNo")String userNo,
    		@Param("companyId")Long companyId
    		);
    
    /**
     * 修改用户是否排队
     * @param user
     * @return
     */
    public int updateIsMoveIn(User user);
    
    /**
     * 校验身份证号是否唯一
     * 
     * @param loginName 登录名称
     * @return 结果
     */
    public int checkIdUnique(@Param("identifyNumber")String identifyNumber,@Param("companyId")Long companyId);
    
    /**
     * 获取改派用户
     * @param userNo
     * @param underLevel
     * @param ids
     * @return
     */
    List<ReformSchoolUser> getReformSchoolUsers(@Param("ids")List<Long> ids);
}
