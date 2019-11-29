package com.injured.web.api.controller;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.injured.commons.PageBean;
import com.injured.commons.qiniu.QiniuUtils;
import com.injured.server.api.contract.AviatorFormulaContract;
import com.injured.server.api.contract.CeDictContract;
import com.injured.server.api.contract.FastCompensatProcessContract;
import com.injured.server.api.contract.FileContract;
import com.injured.server.api.entity.CeDictionaries;
import com.injured.server.api.entity.City;
import com.injured.server.api.enums.ResultEnum;
import com.injured.server.api.enums.SendDoctorTypeEnum;
import com.injured.server.api.model.query.FastCompensatQuery;
import com.injured.server.api.model.query.FastCompensatQueryRes;
import com.injured.server.api.model.query.FastCompensatRegistRes;
import com.injured.server.api.model.query.FastCompensatfoldTransfer;
import com.injured.server.api.model.query.FastInsuranceInfoRes;
import com.injured.server.api.model.query.InjuredFastCompensatInfoDetail;
import com.injured.server.api.model.response.BaseResponse;
import com.injured.server.api.model.response.ResponseUtil;

import com.qiniu.common.Zone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.beans.BeanInfo;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

/**
 * 
 * @author cli
 *
 */
@RestController
@RequestMapping("/h5")
public class FastCompensatController{

    @Reference(timeout = 60000)
    private FastCompensatProcessContract fastCompensatProcessContract;
    
    @Reference(timeout = 60000)
    private CeDictContract ceDictContract;

    @Reference(timeout = 60000)
    private FileContract fileContract;

    @Reference(timeout = 60000)
    private AviatorFormulaContract aviatorFormulaContract;

    @Autowired
    private QiniuUtils qiniuUtils;

    /**
     * 快赔定损处理列表
     * @param fastCompensatQuery
     * @return
     */
    @PostMapping("/getFastCompensats")
    public BaseResponse getFastCompensats(@RequestBody FastCompensatQuery fastCompensatQuery){
    	PageBean<FastCompensatQueryRes> fastCompensatQueryRess = fastCompensatProcessContract.queryFastCompensats(fastCompensatQuery);
		return ResponseUtil.success(fastCompensatQueryRess);
    }
    
    /**
     * 修改快赔定损状态
     * @param fastCompensatId
     * @param status
     * @return
     */
    @PostMapping("/update/fastCompensatStatus")
    public BaseResponse updateFastCompensatStatus(Long fastCompensatId,Integer status){
    	int index = fastCompensatProcessContract.updateFastCompensatStatus(fastCompensatId, status);
    	if(index != 1) {
    		return ResponseUtil.error(ResultEnum.FAILED);
    	}
		return ResponseUtil.success(null);
    }
    
    /**
     * 查看快赔定损详情
     * @param id
     * @return
     */
    @GetMapping("/getFastCompensat")
    public BaseResponse getFastCompensatInfoDetail(Long id) {
    	InjuredFastCompensatInfoDetail injuredFastCompensatInfoDetail = fastCompensatProcessContract.getFastCompensatInfoDetail(id);
		return ResponseUtil.success(injuredFastCompensatInfoDetail);
    }
    
    /**
     * 查看报案查询详情
     * @param registId
     * @return
     */
    @GetMapping("/getFastCompensat/regist")
    public BaseResponse getRegistSurvey(Long registId) {
    	FastCompensatRegistRes fastCompensatRegistRes = fastCompensatProcessContract.getRegistSurvey(registId);
    	return ResponseUtil.success(fastCompensatRegistRes);
    }
    
    /**
     * 查查看保单信息
     * @param registId
     * @return
     */
    @GetMapping("/getFastCompensat/insurance")
    public BaseResponse getInsuranceInfo(Long registId) {
    	FastInsuranceInfoRes fastInsuranceInfoRes = fastCompensatProcessContract.getInsuranceInfo(registId);
    	return ResponseUtil.success(fastInsuranceInfoRes);
    }


    /**
     * 图片上传
     * @param file 文件对象
     * @param fileType 图片类型 1医院名称 2科室名称 3伤者全貌 4受伤部位 5发票原件 6费用清单 7病历资料 8伤者证件 9检查资料 10误工资料 11法医报告 12其他资料
     * @param businessId 业务ID
     * @param businessType 业务类型 1快赔案件 2普通案件
     * @param uploadName 业务员名字
     * @param uploadNumber 业务员工号
     * @return BaseResponse
     */
    @PostMapping("/fileUpload")
    public BaseResponse fileUpLoad(@RequestParam(value="file") MultipartFile file,
                                   @RequestParam(value="fileType") Integer fileType,
                                   @RequestParam(value="businessId") Long businessId,
                                   @RequestParam(value = "businessType") Integer businessType,
                                   @RequestParam(value = "uploadName") String uploadName,
                                   @RequestParam(value = "uploadNumber") String uploadNumber) throws Exception {
        BaseResponse baseResponse = new BaseResponse();
        String filUrl = qiniuUtils.saveImageObjToCloud(file.getInputStream(),null, Zone.zone1());
        if(StringUtils.isBlank(filUrl)){
            baseResponse = ResponseUtil.error(ResultEnum.FILE_UPLOAD_ERROR);
            return baseResponse;
        }
        baseResponse = fileContract.insertFileData(filUrl,fileType,businessId,businessType,uploadName,uploadNumber);
        return baseResponse;
    }

    /**
    　　* @description: 获取图片列表
    　　* @param [registId, businessId]
    　　* @return com.injured.server.api.model.response.BaseResponse
    　　* @throws
    　　* @author LZX
    　　* @date 2019/7/26 14:44
    　　*/
    @GetMapping("/fileList")
    public BaseResponse fileList(@RequestParam(value ="registId") Long registId,
                                 @RequestParam(value ="businessId",required = false) Long businessId) {
        return fileContract.fileList(registId,businessId);
    }


    /**
    　　* @description: 计算公式运算接口
    　　* @param infoId 快赔案件ID
        * @param cityCode 城市ID（二级市ID）
        * @param damageSiteCodes 伤情最后一级code,多个逗号分隔
        * @param sendDoctorType  就诊类型
        * @param incomeStatus  收入类型
        * @param medicalExpensesFee  已发生费用(只有在就诊类型为门诊治疗时候传递)
    　　* @return com.injured.server.api.model.response.BaseResponse
    　　* @throws
    　　* @author LZX
    　　* @date 2019/7/30 9:17
    　　*/
    @GetMapping("/formula")
    public BaseResponse formula(@RequestParam("infoId") Long infoId,
                                @RequestParam("cityCode") String cityCode,
                                @RequestParam(value = "damageSiteCodes")String damageSiteCodes,
                                @RequestParam(value = "sendDoctorType")Integer sendDoctorType,
                                @RequestParam(value = "incomeStatus")Integer incomeStatus,
                                @RequestParam(value = "medicalExpensesFee",required = false) BigDecimal medicalExpensesFee){

        if(sendDoctorType == SendDoctorTypeEnum.RENEWAL_FEE.getCode() && medicalExpensesFee == null){
            return ResponseUtil.error(ResultEnum.PARAM_NULL);
        }

        return aviatorFormulaContract.formula(infoId,cityCode,damageSiteCodes,sendDoctorType,incomeStatus,medicalExpensesFee);
    }


    /**
     * 保存快赔定损信息
     * @param injuredFastCompensatInfoDetail
     * @return
     */
    @PostMapping("/save/fastCompensat")
    public BaseResponse saveFastCompensat(@RequestBody InjuredFastCompensatInfoDetail injuredFastCompensatInfoDetail) {
    	int index = fastCompensatProcessContract.saveFastCompensat(injuredFastCompensatInfoDetail);
    	if(index != 1) {
    		return ResponseUtil.error(ResultEnum.FAILED);
    	}
		return ResponseUtil.success(null);
    }

    /**
     * 提交快赔定损信息
     * @param injuredFastCompensatInfoDetail
     * @return
     */
    @PostMapping("/submit/fastCompensat")
    public BaseResponse submitFastCompensat(@RequestBody InjuredFastCompensatInfoDetail injuredFastCompensatInfoDetail) {
    	int index = fastCompensatProcessContract.submitFastCompensat(injuredFastCompensatInfoDetail);
    	if(index != 1) {
    		return ResponseUtil.error(ResultEnum.FAILED);
    	}
		return ResponseUtil.success(null);
    }

    /**
     * 快赔处理转派
     * @param fastCompensatfoldTransfer
     * @return
     */
    @PostMapping("/transfer/fastCompensat")
    public BaseResponse fastCompensatTransfer(@RequestBody FastCompensatfoldTransfer fastCompensatfoldTransfer) {
    	int index = fastCompensatProcessContract.fastCompensatTransfer(fastCompensatfoldTransfer);
    	if(index != 1) {
    		return ResponseUtil.error(ResultEnum.FAILED);
    	}
		return ResponseUtil.success(null);
    }
    
    /**
     * 根据字典类型获取字典值
     * @param dictType
     * @return
     */
    @GetMapping("/dict/type")
    public BaseResponse getDictByType(String dictType) {
    	List<CeDictionaries> ceDictionaries = ceDictContract.selectDictByType(dictType);
    	return ResponseUtil.success(ceDictionaries);
    }
    
    /**
     * 根据父类id获取子类字典
     * @param parenId
     * @return
     */
    @GetMapping("/dict/parentId")
    public BaseResponse getDictByPid(Integer parentId) {
    	List<CeDictionaries> ceDictionaries = ceDictContract.selectDictByParentId(parentId);
    	return ResponseUtil.success(ceDictionaries);
    }
    
    @GetMapping("/city")
    public BaseResponse getCityAll(){
        List<City> all = ceDictContract.selectCityAll();
        return ResponseUtil.success(all);
    }
    
    /**
     * 所有一二级城市列表
     * @return
     */
    @GetMapping("/city/two")
    public BaseResponse getProvinceCitys(){
        List<City> all = ceDictContract.selectProvinceCitys();
        return ResponseUtil.success(all);
    }

    /**
     * 获取所有省
     * @return
     */
    @GetMapping("/city/provinces")
    public BaseResponse getProvinces() {
    	List<City> provinces = ceDictContract.selectProvinces();
    	return ResponseUtil.success(provinces);
    }
    
    /**
     * 根据pid获取所有城市信息
     * @param parenId
     * @return
     */
    @GetMapping("/city/parentId")
    public BaseResponse getCityByPid(String parentId) {
    	List<City> citys = ceDictContract.selectCityByParentId(parentId);
    	return ResponseUtil.success(citys);
    }


}
