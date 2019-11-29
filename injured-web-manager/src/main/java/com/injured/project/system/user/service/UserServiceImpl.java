package com.injured.project.system.user.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Reference;
import com.injured.common.constant.UserConstants;
import com.injured.common.exception.BusinessException;
import com.injured.common.utils.StringUtils;
import com.injured.common.utils.security.ShiroUtils;
import com.injured.common.utils.text.Convert;
import com.injured.framework.aspectj.lang.annotation.DataScope;
import com.injured.framework.shiro.service.PasswordService;
import com.injured.project.compensat.service.DispatchedWorkerService;
import com.injured.project.system.agencyLevel.service.AgencyUnderService;
import com.injured.project.system.config.service.IConfigService;
import com.injured.project.system.post.domain.Post;
import com.injured.project.system.post.mapper.PostMapper;
import com.injured.project.system.role.domain.Role;
import com.injured.project.system.role.domain.RoleMenu;
import com.injured.project.system.role.mapper.RoleMapper;
import com.injured.project.system.role.mapper.RoleMenuMapper;
import com.injured.project.system.user.domain.ReformSchoolUser;
import com.injured.project.system.user.domain.User;
import com.injured.project.system.user.domain.UserPost;
import com.injured.project.system.user.domain.UserRole;
import com.injured.project.system.user.domain.UserVo;
import com.injured.project.system.user.mapper.UserMapper;
import com.injured.project.system.user.mapper.UserPostMapper;
import com.injured.project.system.user.mapper.UserRoleMapper;
import com.injured.server.api.contract.CaseDetailsContract;
import com.injured.server.api.contract.CompanyAgencyContract;
import com.injured.server.api.contract.InjuredStaffOperatLogContract;
import com.injured.server.api.entity.InjuredFastCompensatInfo;
import com.injured.server.api.entity.InjuredStaffOperatLog;
import com.injured.server.api.enums.ReviewStatusEnum;
import com.injured.server.api.enums.TaskType;
import com.injured.server.api.enums.UnderLevelEnum;

/**
 * 用户 业务层处理
 * 
 * @author lzx
 */
@Service
public class UserServiceImpl implements IUserService
{
    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;
    
    @Reference
    private CompanyAgencyContract companyAgencyContract;
    
    @Reference
    private InjuredStaffOperatLogContract injuredStaffOperatLogContract;
    
    @Reference
    private CaseDetailsContract caseDetailsContract;
    
    @Autowired
	private AgencyUnderService agencyUnderService;
    
    @Autowired
    private DispatchedWorkerService dispatchedWorkerService;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private PostMapper postMapper;

    @Autowired
    private UserPostMapper userPostMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private IConfigService configService;

    @Autowired
    private PasswordService passwordService;
    
    @Autowired
    private RoleMenuMapper roleMenuMapper;

    /**
     * 根据条件分页查询已分配用户角色列表
     * 
     * @param user 用户信息
     * @return 用户信息集合信息
     */
    @Override
    @DataScope(tableAlias = "u")
    public List<User> selectAllocatedList(User user)
    {
        return userMapper.selectAllocatedList(user);
    }

    /**
     * 根据条件分页查询未分配用户角色列表
     * 
     * @param user 用户信息
     * @return 用户信息集合信息
     */
    @Override
    @DataScope(tableAlias = "u")
    public List<User> selectUnallocatedList(User user)
    {
        return userMapper.selectUnallocatedList(user);
    }

    /**
     * 通过用户名查询用户
     * 
     * @param userName 用户名
     * @return 用户对象信息
     */
    @Override
    public User selectUserByLoginName(String userName)
    {
        return userMapper.selectUserByLoginName(userName);
    }

    /**
     * 通过手机号码查询用户
     * 
     * @param phoneNumber 手机号码
     * @return 用户对象信息
     */
    @Override
    public User selectUserByPhoneNumber(String phoneNumber)
    {
        return userMapper.selectUserByPhoneNumber(phoneNumber);
    }
    /**
     * 通过用户ID查询用户
     * 
     * @param userId 用户ID
     * @return 用户对象信息
     */
    @Override
    public User selectUserById(Long userId)
    {
        return userMapper.selectUserById(userId);
    }

    /**
     * 通过用户ID删除用户
     * 
     * @param userId 用户ID
     * @return 结果
     */
    @Override
    public int deleteUserById(Long userId,Long roleId)
    {
    	//删除角色信息
    	roleMapper.deleteRoleById(roleId);
        // 删除用户与角色关联
        userRoleMapper.deleteUserRoleByUserId(userId);
        return userMapper.deleteUserById(userId);
    }

    /**
     * 批量删除用户信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteUserByIds(String ids) throws BusinessException
    {
        Long[] userIds = Convert.toLongArray(ids);
        for (Long userId : userIds)
        {
            if (User.isAdmin(userId))
            {
                throw new BusinessException("不允许删除超级管理员用户");
            }
        }
        return userMapper.deleteUserByIds(userIds);
    }

    /**
     * 修改用户个人详细信息
     * 
     * @param user 用户信息
     * @return 结果
     */
    @Override
    public int updateUserInfo(User user)
    {
        return userMapper.updateUser(user);
    }

    /**
     * 修改用户密码
     * 
     * @param user 用户信息
     * @return 结果
     */
    @Override
    public int resetUserPwd(User user)
    {
        user.randomSalt();
        user.setPassword(passwordService.encryptPassword(user.getLoginName(), user.getPassword(), user.getSalt()));
        return updateUserInfo(user);
    }


    /**
     * 新增用户岗位信息
     * 
     * @param user 用户对象
     */
    public void insertUserPost(User user)
    {
        Long[] posts = user.getPostIds();
        if (StringUtils.isNotNull(posts))
        {
            // 新增用户与岗位管理
            List<UserPost> list = new ArrayList<UserPost>();
            for (Long postId : user.getPostIds())
            {
                UserPost up = new UserPost();
                up.setUserId(user.getUserId());
                up.setPostId(postId);
                list.add(up);
            }
            if (list.size() > 0)
            {
                userPostMapper.batchUserPost(list);
            }
        }
    }

    /**
     * 校验登录名称是否唯一
     * 
     * @param loginName 用户名
     * @return
     */
    @Override
    public String checkLoginNameUnique(String loginName,Long companyId)
    {
        int count = userMapper.checkLoginNameUnique(loginName,companyId);
        if (count > 0)
        {
            return UserConstants.USER_NAME_NOT_UNIQUE;
        }
        return UserConstants.USER_NAME_UNIQUE;
    }

    /**
     * 校验用户名称是否唯一
     *
     * @param user 用户信息
     * @return
     */
    @Override
    public String checkPhoneUnique(User user)
    {
        Long userId = StringUtils.isNull(user.getUserId()) ? -1L : user.getUserId();
        User info = userMapper.checkPhoneUnique(user.getPhonenumber());
        if (StringUtils.isNotNull(info) && info.getUserId().longValue() != userId.longValue())
        {
            return UserConstants.USER_PHONE_NOT_UNIQUE;
        }
        return UserConstants.USER_PHONE_UNIQUE;
    }
    
    /**
     * 校验身份证号是否唯一
     * 
     * @param loginName 用户名
     * @return
     */
    @Override
    public String checkIdUnique(String identifyNumber,Long companyId)
    {
        int count = userMapper.checkIdUnique(identifyNumber,companyId);
        if (count > 0)
        {
            return UserConstants.USER_NAME_NOT_UNIQUE;
        }
        return UserConstants.USER_NAME_UNIQUE;
    }

    /**
     * 查询用户所属角色组
     * 
     * @param userId 用户ID
     * @return 结果
     */
    @Override
    public String selectUserRoleGroup(Long userId)
    {
        List<Role> list = roleMapper.selectRolesByUserId(userId);
        StringBuffer idsStr = new StringBuffer();
        for (Role role : list)
        {
            idsStr.append(role.getRoleName()).append(",");
        }
        if (StringUtils.isNotEmpty(idsStr.toString()))
        {
            return idsStr.substring(0, idsStr.length() - 1);
        }
        return idsStr.toString();
    }

    /**
     * 查询用户所属岗位组
     * 
     * @param userId 用户ID
     * @return 结果
     */
    @Override
    public String selectUserPostGroup(Long userId)
    {
        List<Post> list = postMapper.selectPostsByUserId(userId);
        StringBuffer idsStr = new StringBuffer();
        for (Post post : list)
        {
            idsStr.append(post.getPostName()).append(",");
        }
        if (StringUtils.isNotEmpty(idsStr.toString()))
        {
            return idsStr.substring(0, idsStr.length() - 1);
        }
        return idsStr.toString();
    }

    /**
     * 导入用户数据
     * 
     * @param userList 用户数据列表
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     * @return 结果
     */
    @Override
    public String importUser(List<User> userList, Boolean isUpdateSupport)
    {
        if (StringUtils.isNull(userList) || userList.size() == 0)
        {
            throw new BusinessException("导入用户数据不能为空！");
        }
        int successNum = 0;
        int failureNum = 0;
        StringBuilder successMsg = new StringBuilder();
        StringBuilder failureMsg = new StringBuilder();
        String operName = ShiroUtils.getLoginName();
        String password = configService.selectConfigByKey("sys.user.initPassword");
        for (User user : userList)
        {
            try
            {
                // 验证是否存在这个用户
                User u = userMapper.selectUserByLoginName(user.getLoginName());
                if (StringUtils.isNull(u))
                {
                    user.setPassword(password);
                    user.setCreateBy(operName);
                    this.insertUser(user);
                    successNum++;
                    successMsg.append("<br/>" + successNum + "、账号 " + user.getLoginName() + " 导入成功");
                }
                else if (isUpdateSupport)
                {
                    user.setUpdateBy(operName);
                    this.updateUser(user);
                    successNum++;
                    successMsg.append("<br/>" + successNum + "、账号 " + user.getLoginName() + " 更新成功");
                }
                else
                {
                    failureNum++;
                    failureMsg.append("<br/>" + failureNum + "、账号 " + user.getLoginName() + " 已存在");
                }
            }
            catch (Exception e)
            {
                failureNum++;
                String msg = "<br/>" + failureNum + "、账号 " + user.getLoginName() + " 导入失败：";
                failureMsg.append(msg + e.getMessage());
                log.error(msg, e);
            }
        }
        if (failureNum > 0)
        {
            failureMsg.insert(0, "很抱歉，导入失败！共 " + failureNum + " 条数据格式不正确，错误如下：");
            throw new BusinessException(failureMsg.toString());
        }
        else
        {
            successMsg.insert(0, "恭喜您，数据已全部导入成功！共 " + successNum + " 条，数据如下：");
        }
        return successMsg.toString();
    }

    /**
     * 用户状态修改
     * 
     * @param user 用户信息
     * @return 结果
     */
    @Override
    public int changeStatus(User user)
    {
        if (User.isAdmin(user.getUserId()))
        {
            throw new BusinessException("不允许修改超级管理员用户");
        }
        return userMapper.updateUser(user);
    }
    
    
    
    
//    新====================
    
    /**
     * 根据条件分页查询用户列表
     * 
     * @param user 用户信息
     * @return 用户信息集合信息
     */
    @Override
    public List<User> selectUserList(UserVo user)
    {
    	//判断搜索的是几级机构，如果只选择上级机构，则所属下级机构全部查询
    	List<Long> agencyList = null;
    	List<Long> childId = null;
    	if(user.getFourAgency()!=null) {
    		agencyList = new ArrayList<>();
    		agencyList.add(user.getFourAgency());
    	}else if(user.getThreeAgency()!=null) {
    		agencyList = new ArrayList<>();
    		childId = companyAgencyContract.findIdByPid(user.getThreeAgency(),user.getCompanyId());
    		agencyList.add(user.getThreeAgency());
    		agencyList.addAll(childId);
    	}else if(user.getTwoAgency()!=null) {
    		agencyList = new ArrayList<>();
    		childId = companyAgencyContract.findIdByPid(user.getTwoAgency(),user.getCompanyId());
    		agencyList.add(user.getTwoAgency());
    		agencyList.addAll(childId);
    	}else if(user.getOneAgency()!=null){
    		agencyList = new ArrayList<>();
    		childId = companyAgencyContract.findIdByPid(user.getOneAgency(),user.getCompanyId());
    		agencyList.add(user.getOneAgency());
    		agencyList.addAll(childId);
    	}
    	user.setAgencyList(agencyList);
        // 生成数据权限过滤条件
        return userMapper.selectUserList(user);
    }
    
    /**
     * 通过用户ID查询用户
     * 
     * @param userId 用户ID
     * @return 用户对象信息
     */
    @Override
    public User selectUserInfoById(Long id,Long companyId)
    {
        return userMapper.selectUserInfoById(id,companyId);
    }

    /**
     * 修改保存用户信息
     * 
     * @param user 用户信息
     * @return 结果
     */
    @Override
    @Transactional
    public int updateUser(User user)
    {
    	// 获取当前的用户
        User currentUser = ShiroUtils.getSysUser();
        
        user.setCompanyId(currentUser.getCompanyId());
    	
    	if(StringUtils.isNotEmpty(user.getPassword())) {
    		user.randomSalt();
    		user.setPassword(passwordService.encryptPassword(user.getLoginName(), user.getPassword(), user.getSalt()));
    	}
        user.setUpdateBy(ShiroUtils.getLoginName());
        user.setUpdateTime(new Date());
        
        //记录修改操作日志
		InjuredStaffOperatLog injuredStaff = new InjuredStaffOperatLog();
		injuredStaff.setSubmitTask(TaskType.USER_MANAGE.getCode());
		injuredStaff.setSubmitName(currentUser.getUserName());
		injuredStaff.setSubmitNo(currentUser.getLoginName());
		injuredStaff.setSubmitOpinion("修改用户信息");
		injuredStaff.setOpinionDesc(user.getRemark());
		injuredStaff.setCompanyId(user.getCompanyId());
		injuredStaff.setSurveyId(user.getUserId());
		injuredStaffOperatLogContract.addInjuredStaffLog(injuredStaff);
        int row = userMapper.updateUser(user);
        
        //根据用户id查询角色信息
        Long roleId = userRoleMapper.selectRoleId(user.getUserId());
        //若修改为外部用户，则删除菜单【任务改派 、任务查询】
        if(user.getUserType() == 1) {
        	//删除任务改派
        	roleMenuMapper.deleteByRoleIdAndMenu(roleId,2009L);
        	//删除任务查询
        	roleMenuMapper.deleteByRoleIdAndMenu(roleId,2008L);
        }else {
        	//查询数据库中 是否有菜单 【任务改派 、任务查询】，若无，则新增
        	int menuRow = roleMenuMapper.selectCountByRoleIdMenuId(roleId, 2008L);
        	if(menuRow == 0) {
        		RoleMenu roleMenu = null;
            	List<RoleMenu> meneList = new ArrayList<>();
    	       	 //任务查询
    	       	 roleMenu = new RoleMenu();
    	       	 roleMenu.setRoleId(roleId);
    	       	 roleMenu.setMenuId(2008L);
    	       	 meneList.add(roleMenu);
    	       	 
    	       	 //任务改派
    	       	 roleMenu = new RoleMenu();
    	       	 roleMenu.setRoleId(roleId);
    	       	 roleMenu.setMenuId(2009L);
    	       	 meneList.add(roleMenu);
           	 
    	       	 //新增
        		roleMenuMapper.batchRoleMenu(meneList);
        	}
        }
        
        return row;
    }
    
    /**
     * 新增保存用户信息
     * 
     * @param user 用户信息
     * @return 结果
     */
    @Override
    @Transactional
    public int insertUser(User user)
    {
    	// 获取当前的用户
        User currentUser = ShiroUtils.getSysUser();
    	//保险公司id
    	user.setCompanyId(currentUser.getCompanyId());
    	user.setDelFlag("0");
        user.randomSalt();
        user.setPassword(passwordService.encryptPassword(user.getLoginName(), user.getPassword(), user.getSalt()));
        user.setCreateBy(ShiroUtils.getLoginName());
        user.setCreateTime(new Date());
        user.setIsMoveIn(1);
        
        
        // 新增用户信息
        int rows = userMapper.insertUser(user);
        // 新增用户与角色管理
        insertUserRole(user,"update");
        
      //记录修改操作日志
		InjuredStaffOperatLog injuredStaff = new InjuredStaffOperatLog();
		injuredStaff.setSubmitTask(TaskType.USER_MANAGE.getCode());
		injuredStaff.setSubmitName(currentUser.getUserName());
		injuredStaff.setSubmitNo(currentUser.getLoginName());
		injuredStaff.setSubmitOpinion("新增用户");
		injuredStaff.setOpinionDesc(user.getRemark());
		injuredStaff.setCompanyId(user.getCompanyId());
		injuredStaff.setSurveyId(user.getUserId());
		injuredStaffOperatLogContract.addInjuredStaffLog(injuredStaff);
        return rows;
    }
    
    /**
     * 新增用户角色信息
     * 
     * @param user 用户对象
     */
    private void insertUserRole(User user,String flag)
    {
    	Role role = new Role();
    	role.setRoleName(user.getUserName());
    	role.setRoleKey(user.getLoginName());
    	role.setRoleSort("1");
    	role.setStatus("0");
    	role.setDelFlag("0");
    	role.setDataScope("1");
    	role.setCreateBy(user.getCreateBy());
    	role.setCreateTime(new Date());
         // 新增角色信息
    	 roleMapper.insertRole(role);
    	 if("update".equals(flag)) {
    		 ShiroUtils.clearCachedAuthorizationInfo();
    	 }
         
         //用户角色关系表
         UserRole ur = new UserRole();
         ur.setRoleId(role.getRoleId());
         ur.setUserId(user.getUserId());
         userRoleMapper.insertUserRole(ur);
         
         //内部用户-自动配置菜单【任务改派 、任务查询】
         RoleMenu roleMenu = null;
         if(user.getUserType() == 0) {
        	 List<RoleMenu> meneList = new ArrayList<>();
        	 //任务查询
        	 roleMenu = new RoleMenu();
        	 roleMenu.setRoleId(role.getRoleId());
        	 roleMenu.setMenuId(2008L);
        	 meneList.add(roleMenu);
        	 
        	 //任务改派
        	 roleMenu = new RoleMenu();
        	 roleMenu.setRoleId(role.getRoleId());
        	 roleMenu.setMenuId(2009L);
        	 meneList.add(roleMenu);
        	 
        	//新增
     		roleMenuMapper.batchRoleMenu(meneList);
         }
    }
    
    /**
     *导入新增用户信息
     * 
     * @param user 用户信息
     * @return 结果
     */
    @Override
    @Transactional
    public int importUserTest(User user)
    {
    	//保险公司id
    	user.setCompanyId(user.getCompanyId());
    	user.setDelFlag("0");
        user.randomSalt();
        user.setPassword(passwordService.encryptPassword(user.getLoginName(), user.getPassword(), user.getSalt()));
        user.setCreateBy("admin");
        user.setCreateTime(new Date());
        user.setIsMoveIn(1);//新增未排队
        // 新增用户信息
        int rows = userMapper.insertUser(user);
        // 新增用户与角色管理
        insertUserRole(user,"import");
        
      //记录修改操作日志
		InjuredStaffOperatLog injuredStaff = new InjuredStaffOperatLog();
		injuredStaff.setSubmitTask(TaskType.USER_MANAGE.getCode());
		injuredStaff.setSubmitName("admin");
		injuredStaff.setSubmitNo("admin");
		injuredStaff.setSubmitOpinion("导入用户信息");
		injuredStaff.setOpinionDesc("导入用户信息");
		injuredStaff.setCompanyId(user.getCompanyId());
		injuredStaff.setSurveyId(user.getUserId());
		injuredStaffOperatLogContract.addInjuredStaffLog(injuredStaff);
        return rows;
    }



    @Override
    public List<User> searchUserByNo(String userNo, Long companyId) {
        List<User> users = userMapper.searchUserByNo(userNo,companyId);
        return users;
    }
    @Override
    public User selectUserByUserNo(String userNo,Long companyId) {
    	return userMapper.selectUserByUserNo(userNo, companyId);
    }

    @Override
    public int updateIsMoveIn(Integer isMoveIn) {
    	// 获取当前的用户
        User currentUser = ShiroUtils.getSysUser();
    	User user = new User();
    	user.setUserId(currentUser.getUserId());
    	user.setUpdateBy(currentUser.getLoginName());
    	user.setIsMoveIn(isMoveIn);
    	return userMapper.updateIsMoveIn(user);
    }

    public void updateIsMoveInLoginOut(User userDown) {
        userMapper.updateIsMoveIn(userDown);
    }

	@Override
	public List<ReformSchoolUser> getReformSchoolUsers(Long fastInfoId) {
		InjuredFastCompensatInfo injuredFastCompensatInfo = caseDetailsContract.getInjuredFastCompensatInfoDetial(fastInfoId);
    	BigDecimal amount = injuredFastCompensatInfo.getFixedLossAmount();
    	Long agencyId = injuredFastCompensatInfo.getCompanyAgencyId();
    	Long companyId = injuredFastCompensatInfo.getCompanyId();
    	Integer reviewStatus = injuredFastCompensatInfo.getReviewStatus();
    	/**
    	 * 获取案件所属机构及父机构
    	 */
    	List<Long> agencyResult = new ArrayList<>();
    	agencyResult = companyAgencyContract.findByChildId(agencyId,companyId,agencyResult);
    	
    	/**
    	 * 获取所有机构下用户
    	 */
    	List<ReformSchoolUser> reformSchoolUsers = userMapper.getReformSchoolUsers(agencyResult);
    	
    	/**
		 * 获取该机构下审核机制
		 */
		Integer underLevel = agencyUnderService.selectAllocatedList(companyId,agencyId, DispatchedWorkerService.FAST_REVIEW_MENU);
		if(underLevel != null && UnderLevelEnum.OEN.getCode() != underLevel && UnderLevelEnum.TWO.getCode() != underLevel) {
			log.info("机构下没有配置审核级别,机构：{}", agencyId);
			return null;
		}
		/**
		 * 判断案件是找初审 终审用户
		 */
		boolean isAll = true;
		if(UnderLevelEnum.OEN.getCode() == underLevel){
			isAll = false;
		}else if(UnderLevelEnum.TWO.getCode() == underLevel) {
			if(ReviewStatusEnum.UITIMATE_REVIEWING.getCode() == reviewStatus) {
				isAll = false;
			}
		}
    			
		List<ReformSchoolUser> reformUsers = new ArrayList<>();
		if(!isAll) {
			/**
			 * 只过滤终审用户
			 */
			for(ReformSchoolUser reformSchoolUser : reformSchoolUsers) {
				if(UnderLevelEnum.TWO.getCode() == reformSchoolUser.getUnderLevel()) {
					String priceScope = reformSchoolUser.getPriceScope();
					if(priceScope != null) {
						/**
						 * 判断金额
						 */
						if(dispatchedWorkerService.priceAnalysis(priceScope,amount)) {
							reformUsers.add(reformSchoolUser);
						}
					}
					
				}
			}
		}else {
			for(ReformSchoolUser reformSchoolUser : reformSchoolUsers) {
				String priceScope = reformSchoolUser.getPriceScope();
				if(priceScope != null) {
					/**
					 * 判断金额
					 */
					if(dispatchedWorkerService.priceAnalysis(priceScope,amount)) {
						reformUsers.add(reformSchoolUser);
					}
				}
			}
		}
		return reformUsers;		
	}
}
