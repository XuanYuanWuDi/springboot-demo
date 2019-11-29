package com.injured.project.system.user.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.dubbo.config.annotation.Reference;
import com.injured.common.utils.StringUtils;
import com.injured.common.utils.bean.BeanUtils;
import com.injured.common.utils.poi.ExcelUtil;
import com.injured.common.utils.security.ShiroUtils;
import com.injured.commons.IdCardUtil;
import com.injured.framework.aspectj.lang.annotation.Log;
import com.injured.framework.aspectj.lang.enums.BusinessType;
import com.injured.framework.web.controller.BaseController;
import com.injured.framework.web.domain.AjaxResult;
import com.injured.framework.web.page.TableDataInfo;
import com.injured.project.system.role.service.IRoleService;
import com.injured.project.system.user.domain.ReformSchoolUser;
import com.injured.project.system.user.domain.User;
import com.injured.project.system.user.domain.UserVo;
import com.injured.project.system.user.service.IUserService;
import com.injured.server.api.contract.CompanyAgencyContract;
import com.injured.server.api.entity.CompanyAgency;
import com.injured.server.api.model.request.fast.CompanyAgencyReq;
import com.injured.server.api.model.response.BaseResponse;

/**
 * 用户信息
 * 
 * @author lzx
 */
@Controller
@RequestMapping("/system/user")
public class UserController extends BaseController
{
	
    private String prefix = "system/user";

    @Autowired
    private IUserService userService;
    @Reference
    private CompanyAgencyContract companyAgencyContract;
    @Autowired
    private IRoleService roleService;



    @RequiresPermissions("system:user:view")
    @GetMapping()
    public String user(ModelMap mmap)
    {
    	
        return prefix + "/user";
    }

    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(UserVo user)
    {
    	
    	if(user.getPageStatus() == -1) {
    		return getDataTable(new ArrayList());
    	}
    	
    	// 获取当前的用户
        User currentUser = ShiroUtils.getSysUser();
        //赋值保险公司id  
        user.setCompanyId(currentUser.getCompanyId());
        List<User> list = userService.selectUserList(user);
        
        //获取机构名称
        for(User userNow:list) {
        	BaseResponse baseResponse = companyAgencyContract.findAgencyById(userNow.getAgencyId(),currentUser.getCompanyId());
            CompanyAgencyReq conpany = (CompanyAgencyReq)baseResponse.getData();
            if(conpany!=null) {
            	userNow.setAgencyName(conpany.getAgencyName());
            	userNow.setAgencyCode(conpany.getAgencyCode());
            }
        }
        return getDataTable(list);
    }
    
    @PostMapping("/getUser")
    @ResponseBody
    public AjaxResult getUser(String userNo) {
    	// 获取当前的用户
        User currentUser = ShiroUtils.getSysUser();
    	return AjaxResult.success(userService.selectUserByUserNo(userNo, currentUser.getCompanyId()));
    }
    
    
    @PostMapping("/getAgency")
    @ResponseBody
    public AjaxResult  getAgency(Long agencyId)
    {
    	// 获取当前的用户
        User currentUser = ShiroUtils.getSysUser();
    	 BaseResponse baseResponse = companyAgencyContract.findAgencyByPid(agencyId,currentUser.getCompanyId());
    	 List<CompanyAgency> conpany = (List<CompanyAgency>)baseResponse.getData();
         
        return AjaxResult.success(conpany);
    }
    
    
    @PostMapping("/getOneAgency")
    @ResponseBody
    public AjaxResult getOneAgency(int level)
    {
    	// 获取当前的用户
        User currentUser = ShiroUtils.getSysUser();
    	 BaseResponse baseResponse = companyAgencyContract.findAgencyByLevel(level,currentUser.getCompanyId());
    	 List<CompanyAgencyReq> conpany = (List<CompanyAgencyReq>)baseResponse.getData();
         
        return AjaxResult.success(conpany);
    }
    
    @PostMapping("/saveIsMoceIn")
    @ResponseBody
    public AjaxResult  saveIsMoceIn(Integer isMoveIn)
    {
    	User currentUser = ShiroUtils.getSysUser();
        int row = userService.updateIsMoveIn(isMoveIn);
        setSysUser(userService.selectUserById(currentUser.getUserId()));
        return AjaxResult.success(row);
    }
    
    /**
     * 修改用户
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
    	User currentUser = ShiroUtils.getSysUser();
    	//用户信息
    	User user = userService.selectUserInfoById(id,currentUser.getCompanyId());
    	UserVo userVo = new UserVo();
    	BeanUtils.copyProperties(user, userVo);
    	BaseResponse baseResponse = companyAgencyContract.findAgencyById(user.getAgencyId(),currentUser.getCompanyId());
    	
    	if(baseResponse.getData()!=null) {
    		userVo.setCompanyAgency((CompanyAgencyReq)baseResponse.getData());
    		CompanyAgencyReq conAgnecy = (CompanyAgencyReq)baseResponse.getData();
    		userVo.setAgencyName(conAgnecy.getAgencyName());
    	}
    	
        mmap.put("user", userVo);
        return prefix + "/edit";
    }
    
    /**
     * 修改保存用户
     */
    @Log(title = "用户管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(UserVo userVo)
    {
    	
    	User user = new User();
    	BeanUtils.copyProperties(userVo, user);
    	//不是初始密码
    	user.setIsInitialPassword(0);
        return toAjax(userService.updateUser(user));
    }
    
    
    /**
     * 新增用户
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }
    
    /**
     * 新增保存用户
     */
    @Log(title = "用户管理", businessType = BusinessType.INSERT)
    @PostMapping("/addSave")
    @ResponseBody
    public AjaxResult addSave(UserVo userVo)
    {
    	//登录名称是用户工号
        userVo.setLoginName(userVo.getUserNo());
        
        User user = new User();
    	BeanUtils.copyProperties(userVo, user);
    	user.setIsInitialPassword(1);
        return toAjax(userService.insertUser(user));
    }
    
    @PostMapping("/deleteUser")
    @ResponseBody
    public AjaxResult deleteUser(User user) {
    	Long roleId = roleService.selectRoleId(user.getUserId());
    	return toAjax(userService.deleteUserById(user.getUserId(),roleId));
    }
    


    @Log(title = "用户管理", businessType = BusinessType.IMPORT)
    @PostMapping("/importData")
    @ResponseBody
    public AjaxResult importData(MultipartFile file, boolean updateSupport) throws Exception
    {
        ExcelUtil<User> util = new ExcelUtil<User>(User.class);
        List<User> userList = util.importExcel(file.getInputStream());
        String message = userService.importUser(userList, updateSupport);
        return AjaxResult.success(message);
    }

    @RequiresPermissions("system:user:view")
    @GetMapping("/importTemplate")
    @ResponseBody
    public AjaxResult importTemplate()
    {
        ExcelUtil<User> util = new ExcelUtil<User>(User.class);
        return util.importTemplateExcel("用户数据");
    }

    
    /**
     * 校验用户名
     */
    @PostMapping("/checkLoginNameUnique")
    @ResponseBody
    public String checkLoginNameUnique(User user)
    {
    	//获取当前用户
    	User currentUser = ShiroUtils.getSysUser();
        return userService.checkLoginNameUnique(user.getUserNo(),currentUser.getCompanyId());
    }
    
    /**
     * 校验用户名
     */
    @PostMapping("/checkIdentify")
    @ResponseBody
    public String checkIdentify(User user)
    {
    	if(IdCardUtil.isValidatedAllIdcard(user.getIdentifyNumber())) {
    		return "1";
    	}else {
    		return "0";
    	}
    }
    
    /**
     * 校验身份证号是否重复
     */
    @PostMapping("/checkIdUnique")
    @ResponseBody
    public String checkIdUnique(User user)
    {
    	//获取当前用户
    	User currentUser = ShiroUtils.getSysUser();
    	return userService.checkIdUnique(user.getIdentifyNumber(),currentUser.getCompanyId());
    }
    
    /**
     * 校验密码 必须包含数字 英文 符号
     */
    @PostMapping("/checkPassWorld")
    @ResponseBody
    public String checkPassWorld(User user)
    {
    	String flag = "1";
    	if(StringUtils.isEmpty(user.getPassword())) {
    		return flag;
    	}
    	if(user.getPassword()!=null && user.getPassword().matches(".*[0-9]+.*")
    			&& user.getPassword().matches(".*[A-Za-z]+.*")
    			&& user.getPassword().matches(".*[~!@#$%^&*()_+|<>,.?/:;'\\[\\]{}\"]+.*")) {
	    	
	    	for(int i=0; i<user.getPassword().length();i++) {
	    		String charP = user.getPassword().substring(i, i+1);
	    		if(!(charP.matches(".*[0-9]+.*")|| charP.matches(".*[A-Za-z]+.*") || charP.matches(".*[~!@#$%^&*()_+|<>,.?/:;'\\[\\]{}\"]+.*"))) {
	    			flag = "0";
	    			break;
	    		}
	    	}
    	
    		return flag;
    	}
    	return "0";
    }
    

    @Log(title = "重置密码", businessType = BusinessType.UPDATE)
    @GetMapping("/resetPwd/{userId}")
    public String resetPwd(@PathVariable("userId") Long userId, ModelMap mmap)
    {
        mmap.put("user", userService.selectUserById(userId));
        return prefix + "/resetPwd";
    }

    @Log(title = "重置密码", businessType = BusinessType.UPDATE)
    @PostMapping("/resetPwd")
    @ResponseBody
    public AjaxResult resetPwd(User user)
    {
        return toAjax(userService.resetUserPwd(user));
    }

//    @RequiresPermissions("system:user:remove")
    @Log(title = "用户管理", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        try
        {
            return toAjax(userService.deleteUserByIds(ids));
        }
        catch (Exception e)
        {
            return error(e.getMessage());
        }
    }

    

    /**
     * 校验手机号码
     */
    @PostMapping("/checkPhoneUnique")
    @ResponseBody
    public String checkPhoneUnique(User user)
    {
        return userService.checkPhoneUnique(user);
    }

    /**
     * 用户状态修改
     */
    @Log(title = "用户管理", businessType = BusinessType.UPDATE)
//    @RequiresPermissions("system:user:edit")
    @PostMapping("/changeStatus")
    @ResponseBody
    public AjaxResult changeStatus(User user)
    {
        return toAjax(userService.changeStatus(user));
    }



    /**
    　　* @description: 根据用户工号模糊匹配用户信息
    　　* @param []
    　　* @return java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
    　　* @throws
    　　* @author LZX
    　　* @date 2019/8/5 17:06
    　　*/
    @GetMapping("/searchUserByNo")
    @ResponseBody
    public List<User> searchUserByNo(String userNo){
        User user = getSysUser();
        Long companyId = user.getCompanyId();
        List<User> result = userService.searchUserByNo(userNo,companyId);
        result.removeIf(u ->u.getUserId().equals(user.getUserId()));
        return result;
    }
}