package com.test;


import com.alibaba.dubbo.config.annotation.Reference;
import com.injured.InjuredApplication;
import com.injured.common.utils.bean.BeanUtils;
import com.injured.common.utils.poi.ExcelUtil;
import com.injured.commons.IdCardUtil;
import com.injured.project.system.role.domain.RoleMenu;
import com.injured.project.system.role.domain.SysUserAgnecyPrice;
import com.injured.project.system.role.domain.UserMenuVo;
import com.injured.project.system.role.service.IRoleService;
import com.injured.project.system.user.domain.User;
import com.injured.project.system.user.domain.UserVo;
import com.injured.project.system.user.service.IUserService;
import com.injured.server.api.contract.CompanyAgencyContract;
import com.injured.server.api.model.request.fast.CompanyAgencyReq;
import com.injured.server.api.model.response.BaseResponse;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = InjuredApplication.class)
public class UserExcelUploadTest {

	@Reference(url="dubbo://127.0.0.1:20880")
    private CompanyAgencyContract companyAgencyContract;
	
	@Autowired
    private IUserService userService;
	
	@Autowired
    private IRoleService roleService;
	
    @Test
    public void contextLoads() throws Exception {
    	//Excel 父级机构要在子机构前面
    	ExcelUtil<UserVo> util = new ExcelUtil<UserVo>(UserVo.class);
    	String fullFileName = "D:/user.xlsx";
		InputStream is = new FileInputStream(fullFileName);
		List<UserVo> userList = util.importExcel(is);
		
		//保险公司id
		Long companyId = 523l;
		String errorMessage = addUser(userList, companyId);
		
		System.out.println("错误信息=================="+errorMessage);
    }
    
	private String addUser(List<UserVo> userList, Long companyId) {
		
		//导入失败数量 
		int failureNum = 0; 
		StringBuilder msg = new StringBuilder();
		  
		for(int i=0;i<userList.size();i++) {
		  UserVo uVo = userList.get(i);
		  
		  //判断用户工号是否 在数据库中 已存在
		  User userEmp = userService.selectUserByUserNo(uVo.getUserNo(),companyId);
		  if(userEmp!=null && userEmp.getUserId()!=null) {
			  failureNum++;
			  msg.append("<br/>第"+(i+1)+"行 -用户工号在数据库中已存在-"+uVo.getUserNo()); 
			  continue;
		  }else {
			  uVo.setLoginName(uVo.getUserNo()); 
		  }
		  
		  //用户状态：0有效 1无效
		  if("无效".equals(uVo.getStatusString())) {
			  uVo.setStatus("1");
		  }else if("有效".equals(uVo.getStatusString())) {
			  uVo.setStatus("0");
		  }else {
			  failureNum++;
			  msg.append("<br/>第"+(i+1)+"行 -用户状态表格中格式错误-"+uVo.getStatus()); 
			  continue;
		  }
			  
		  
		  //是否锁定：0=正常,1=锁定
		  if("正常".equals(uVo.getUserLockString())) {
			  uVo.setUserLock("0");
		  }else if("锁定".equals(uVo.getUserLockString())) {
			  uVo.setUserLock("1");
		  }else {
			  failureNum++;
			  msg.append("<br/>第"+(i+1)+"行 -是否锁定表格中格式错误-"+uVo.getUserLock()); 
			  continue;
		  }
		  
		  
		  //是否锁定：0=内部,1=外部
		  if("内部".equals(uVo.getUserTypeString())) {
			  uVo.setUserLock("0");
		  }else if("外部".equals(uVo.getUserTypeString())) {
			  uVo.setUserLock("1");
		  }else {
			  failureNum++;
			  msg.append("<br/>第"+(i+1)+"行 -用户类型表格中格式错误-"+uVo.getUserType()); 
			  continue;
		  }
		  
		  //验证身份证号是否正确
		  if(!IdCardUtil.isValidatedAllIdcard(uVo.getIdentifyNumber())) {
			  failureNum++;
			  msg.append("<br/>第"+(i+1)+"行 -身份证号格式错误-"+uVo.getIdentifyNumber()); 
			  continue;
		  }
		  
		  //验证手机号码
		  if(StringUtils.isEmpty(uVo.getPhonenumber()) ||(StringUtils.isNotEmpty(uVo.getPhonenumber()) && uVo.getPhonenumber().length()!=11) ) {
			  failureNum++;
			  msg.append("<br/>第"+(i+1)+"行 -手机号码错误-"+uVo.getPhonenumber()); 
			  continue;
		  }
		  
		  //所属机构代码
		  if(uVo.getAgencyCode()!=null && !"".equals(uVo.getAgencyCode())) {
			  //根据机构代码 查询机构信息
			  BaseResponse baseResponse = companyAgencyContract.findAgencyByCodeOrName(uVo.getAgencyCode(),null,companyId);
			  CompanyAgencyReq agen = (CompanyAgencyReq)baseResponse.getData();
			  if(!(agen!=null && agen.getId()!=null)) {
				  failureNum++;
				  msg.append("<br/>第"+(i+1)+"行 -所属机构代码在数据库中没有找到对应详细信息！-"+uVo.getAgencyCode()); 
				  continue;
				} /*
					 * else if(!agen.getAgencyName().equals(uVo.getAgencyName())) { failureNum++;
					 * msg.append("<br/>第"+(i+1)+"行 -所属机构代码在数据库中对应的机构名称 与 excel中 所属机构名称不对应-"+uVo.
					 * getAgencyCode()); continue; }
					 */
			  uVo.setAgencyId(agen.getId());
		  }else {
			  failureNum++;
			  msg.append("<br/>第"+(i+1)+"行 -所属机构代码错误-"+uVo.getAgencyCode()); 
			  continue;
		  }
		  
		  //快赔审核审核级别
		  if(!(uVo.getUnderLevel()!=null && (uVo.getUnderLevel()==1 || uVo.getUnderLevel()==2))) {
			  failureNum++;
			  msg.append("<br/>第"+(i+1)+"行 -快赔审核审核级别填写错误！-"+uVo.getUnderLevel()); 
			  continue;
		  }
		  
		  List<SysUserAgnecyPrice> priceList = new ArrayList<>();
		  List<RoleMenu> roleMenuList = new ArrayList<>();
		  //快赔审核机构编码  -- 快赔审核金额
		  if(uVo.getCompensatAgencyCodes()!=null && uVo.getCompensatAgencyMoney()!=null) {
			  SysUserAgnecyPrice agencyPrice = null;
			  //机构编码
			  String[] agencyCodes = uVo.getCompensatAgencyCodes().split(",");
			  //金额
			  String[] moneys = uVo.getCompensatAgencyMoney().split(",");
			  if(agencyCodes.length != moneys.length) {
				  failureNum++;
				  msg.append("<br/>第"+(i+1)+"行 -【快赔审核机构编码】和【快赔审核金额】数量不对应！-"+uVo.getCompensatAgencyCodes()+"--"+uVo.getCompensatAgencyMoney()); 
				  continue;
			  }
			  
			  Boolean flag = true;
			  for(int j=0; j<agencyCodes.length; j++) {
				  flag = true;
				  //根据机构代码 查询机构信息
				  BaseResponse baseResponse = companyAgencyContract.findAgencyByCodeOrName(agencyCodes[j],null,companyId);
				  CompanyAgencyReq agencyReq = (CompanyAgencyReq)baseResponse.getData();
				  if(!(agencyReq!=null && agencyReq.getId()!=null)) {
					  failureNum++;
					  msg.append("<br/>第"+(i+1)+"行,第"+(j+1)+"个 -快赔审核机构编码在数据库中没有找到对应详细信息！-"+uVo.getCompensatAgencyCodes()); 
					  flag = false;
					  break;
				  }
				 
				  agencyPrice = new SysUserAgnecyPrice();
				  agencyPrice.setMenuId(2007L);
				  agencyPrice.setAgencyId(agencyReq.getId());
				  agencyPrice.setUnderLevel(uVo.getUnderLevel());
				  agencyPrice.setPriceScope(moneys[j]);
				  priceList.add(agencyPrice);
			  }
			  if(!flag) {
				 continue;
			  }
			  
			  RoleMenu roleMenu = new RoleMenu();
			  roleMenu.setMenuId(2007L);
			  roleMenu.setUnderLevel(uVo.getUnderLevel());
			  roleMenuList.add(roleMenu);
		  }
		  
		  //初始密码 abc.123
		  uVo.setPassword("abc.123");
		  uVo.setCompanyId(companyId);
		  uVo.setIsInitialPassword(1);//是否是初始密码
		  
		  //添加用户
		  User userNew = new User();
		  BeanUtils.copyBeanProp(userNew, uVo);
		  userNew.setIsMoveIn(0);//是否排队
		  int rows = userService.importUserTest(userNew);
		  
		  if(rows<=0 ) {
			  failureNum++;
			  msg.append("<br/> 第"+(i+1)+"行 ，新增失败！");
		  }else {
			  Long roleId = roleService.selectRoleId(userNew.getUserId());
			  for(SysUserAgnecyPrice price :priceList) {
				  price.setUserId(userNew.getUserId());
			  }
			  for(RoleMenu roleMenu : roleMenuList) {
				  roleMenu.setRoleId(roleId);
			  }
			  UserMenuVo userMenuVo = new UserMenuVo();
			  userMenuVo.setUserId(userNew.getUserId());
			  userMenuVo.setMenuList(roleMenuList);
			  userMenuVo.setPriceList(priceList);
			  userMenuVo.setCompanyId(companyId);
			  
			  userMenuVo.setRemark("导入用户权限");
			  
			  int menuRows = roleService.updateRoleMenuTest(userMenuVo);
			  if(menuRows<=0) {
				  //删除用户表和角色表以及角色关系表
				  userService.deleteUserById(userNew.getUserId(),roleId);
				  failureNum++;
				  msg.append("<br/> 第"+(i+1)+"行 ，导入权限失败，新增失败！");
			  }
		  }
		}
		if(failureNum>0) {
    		msg.insert(0,"导入失败："+failureNum + " 条，数据信息如下：");
    	}else {
    		msg.append("导入成功！");
    	}
		return  msg.toString();
	}
}
