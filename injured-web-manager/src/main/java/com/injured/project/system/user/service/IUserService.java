package com.injured.project.system.user.service;

import com.injured.project.system.user.domain.ReformSchoolUser;
import com.injured.project.system.user.domain.User;
import com.injured.project.system.user.domain.UserVo;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

/**
 * 用户 业务层
 * 
 * @author lzx
 */
public interface IUserService
{
    /**
     * 根据条件分页查询用户列表
     * 
     * @param user 用户信息
     * @return 用户信息集合信息
     */
    public List<User> selectUserList(UserVo user);

    /**
     * 根据条件分页查询已分配用户角色列表
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
    public int deleteUserById(Long userId,Long roleId);

    /**
     * 批量删除用户信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     * @throws Exception 异常
     */
    public int deleteUserByIds(String ids) throws Exception;

    /**
     * 保存用户信息
     * 
     * @param user 用户信息
     * @return 结果
     */
    public int insertUser(User user);

    /**
     * 保存用户信息
     * 
     * @param user 用户信息
     * @return 结果
     */
    public int updateUser(User user);

    /**
     * 修改用户详细信息
     * 
     * @param user 用户信息
     * @return 结果
     */
    public int updateUserInfo(User user);

    /**
     * 修改用户密码信息
     * 
     * @param user 用户信息
     * @return 结果
     */
    public int resetUserPwd(User user);

    /**
     * 校验用户名称是否唯一
     * 
     * @param loginName 登录名称
     * @return 结果
     */
    public String checkLoginNameUnique(String loginName,Long companyId);

    /**
     * 校验手机号码是否唯一
     *
     * @param user 用户信息
     * @return 结果
     */
    public String checkPhoneUnique(User user);

    /**
     * 根据用户ID查询用户所属角色组
     * 
     * @param userId 用户ID
     * @return 结果
     */
    public String selectUserRoleGroup(Long userId);

    /**
     * 根据用户ID查询用户所属岗位组
     * 
     * @param userId 用户ID
     * @return 结果
     */
    public String selectUserPostGroup(Long userId);

    /**
     * 导入用户数据
     * 
     * @param userList 用户数据列表
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     * @return 结果
     */
    public String importUser(List<User> userList, Boolean isUpdateSupport);

    /**
     * 用户状态修改
     * 
     * @param user 用户信息
     * @return 结果
     */
    public int changeStatus(User user);
    
    
    
    /**
     * 根据用户id查询用户信息
     * @param userId
     * @return
     */
    public User selectUserInfoById(Long userId,Long companyId);

    /**
    　　* @description: 根据用户工号模糊匹配用户信息
    　　* @param [keyword, companyId]
    　　* @return java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
    　　* @throws
    　　* @author LZX
    　　* @date 2019/8/5 17:09
    　　*/
    List<User> searchUserByNo(String userNo, Long companyId);
    
    List<ReformSchoolUser> getReformSchoolUsers(Long fastInfoId);
    
    /**
     * 根据用户工号 查询用户信息
     * @param userNo
     * @param companyId
     * @return
     */
    public User selectUserByUserNo(String userNo,Long companyId);
    
    /**
     * test方法导入用户角色信息
     * @param user
     * @return
     */
    public int importUserTest(User user);
    
    /**
     * 修改用户是否排队
     * @param isMoveIn
     * @return
     */
    public int updateIsMoveIn(Integer isMoveIn);
    
    /**
     *  校验身份证号是否唯一
     * @param identifyNumber 身份证号
     * @param companyId
     * @return
     */
    public String checkIdUnique(String identifyNumber,Long companyId);
    /**
     * 根据用户登录名和修理厂，修改用户是否排队
     * @param userDown
     * @return
     */
    public void updateIsMoveInLoginOut(User userDown);
}
