package com.test;


import com.alibaba.dubbo.config.annotation.Reference;
import com.injured.InjuredApplication;
import com.injured.common.utils.bean.BeanUtils;
import com.injured.common.utils.poi.ExcelUtil;
import com.injured.project.system.companyAgency.domain.CompanyAgencyVo;
import com.injured.server.api.contract.CompanyAgencyContract;
import com.injured.server.api.entity.CompanyAgency;
import com.injured.server.api.enums.ResultEnum;
import com.injured.server.api.model.request.fast.CompanyAgencyReq;
import com.injured.server.api.model.response.BaseResponse;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = InjuredApplication.class)
public class CompanyAgencyExcelUploadTests {

	@Reference(url="dubbo://127.0.0.1:20880")
    private CompanyAgencyContract companyAgencyContract;
	
    @Test
    public void contextLoads() throws Exception {
    	//Excel 父级机构要在子机构前面
    	ExcelUtil<CompanyAgencyVo> util = new ExcelUtil<CompanyAgencyVo>(CompanyAgencyVo.class);
    	String fullFileName = "D:/companyAjency.xlsx";
		InputStream is = new FileInputStream(fullFileName);
		List<CompanyAgencyVo> agencyList = util.importExcel(is);
		
		//保险公司code 保险公司id
		String companyCode = "AB";
		Long companyId = 523l;
		String errorMessage = addCompanyAgency(agencyList, companyId, companyCode);
		
		System.out.println(errorMessage);
    }
    
    private String addCompanyAgency(List<CompanyAgencyVo> agencyList,Long companyId,String companyCode) {
    	//导入失败数量
    	int failureNum = 0;
    	StringBuilder msg = new StringBuilder();
    	
    	CompanyAgency companyAgen = null;
    	for(int i=0;i<agencyList.size();i++) {
    		CompanyAgencyVo cVo = agencyList.get(i);
    		
    		 //验证机构代码在数据库中是否重复
			 BaseResponse  baseResponse = companyAgencyContract.findAgencyByCodeOrName(cVo.getAgencyCode(), null, companyId);
			 CompanyAgencyReq agen = (CompanyAgencyReq)baseResponse.getData();
			 if(agen!=null && agen.getId()!=null) {
				 failureNum++;
				 msg.append("<br/>第"+(i+1)+"行 -机构代码在数据库中已存在-"+cVo.getAgencyCode());
				 continue;
			 }
			 
			 //验证机构代码在数据库中是否重复
			 BaseResponse  baseResponseName = companyAgencyContract.findAgencyByCodeOrName(null, cVo.getAgencyName(), companyId);
			 CompanyAgencyReq agenName = (CompanyAgencyReq)baseResponseName.getData();
			 if(agenName!=null && agenName.getId()!=null) {
				 failureNum++;
				 msg.append("<br/>第"+(i+1)+"行 -机构名称在数据库中已存在-"+cVo.getAgencyName());
				 continue;
			 }
			 
			 //根据机构代码 查询父机构id
			 if(StringUtils.isNotEmpty(cVo.getAgencyCodeUp())) {
				 BaseResponse  baseResponseUp = companyAgencyContract.findAgencyByCodeOrName(cVo.getAgencyCodeUp(),null,companyId);
				 CompanyAgencyReq agenIdUp = (CompanyAgencyReq)baseResponseUp.getData();
				 if(agenIdUp==null) {
					 failureNum++;
					 msg.append("<br/>第"+(i+1)+"行 -父级机构在数据库中不存在，查询不到其id");
					 continue;
				 }
				 cVo.setPid(agenIdUp.getId());
			 }
			 
			 
			 cVo.setCompanyCode(companyCode);
			 cVo.setCompanyId(companyId);
			 
			 companyAgen = new CompanyAgency();
			 BeanUtils.copyBeanProp(companyAgen, cVo);
			 
			 BaseResponse insertResponse = companyAgencyContract.insertCompanyAgency(companyAgen,"测试","admin");
			 if(ResultEnum.EXCEPTION.getCode().equals(insertResponse.getCode())) {
				 failureNum++;
				 msg.append("<br/> 第"+(i+1)+"行 ，新增失败！");
			 }
    	}
    	if(failureNum>0) {
    		msg.insert(0,"导入失败："+failureNum + " 条，数据如下：");
    	}else {
    		msg.append("导入成功！");
    	}

    	if(failureNum<agencyList.size()) {
			//跟新redis中信息
			companyAgencyContract.updateRedis(companyId);
		}
    	
    	return msg.toString();
    }

}
