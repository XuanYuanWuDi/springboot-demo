package com.injured.server.provider.service.impl;
import java.math.BigDecimal;
import java.util.*;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.injured.commons.DateUtil;
import com.injured.commons.PageBean;
import com.injured.commons.string.StringUtils;
import com.injured.server.api.annotations.DataPowers;
import com.injured.server.api.contract.CompensatContract;
import com.injured.server.api.contract.FastDispatchedWorkerContract;
import com.injured.server.api.entity.*;
import com.injured.server.api.enums.ResultEnum;
import com.injured.server.api.enums.ReviewStatusEnum;
import com.injured.server.api.enums.TaskType;
import com.injured.server.api.enums.UnderLevelEnum;
import com.injured.server.api.exception.BusinessException;
import com.injured.server.api.model.compensat.Compensatlist;
import com.injured.server.api.model.compensat.FastCompensationReviewDetail;
import com.injured.server.api.model.compensat.FastCompensationReviewQuery;
import com.injured.server.api.model.response.BaseResponse;
import com.injured.server.api.model.response.ResponseUtil;
import com.injured.server.api.model.response.fast.*;
import com.injured.server.provider.mapper.*;
import com.injured.server.provider.mq.MQProducerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.stream.Collectors;

/**
 * @author cm
 * @title: CompensatServiceImpl
 * @projectName injured
 * @description: TODO
 * @date 2019/7/24
 */
@Service(timeout = 60000)
public class CompensatServiceImpl implements CompensatContract {

    private static Logger logger = LogManager.getLogger(CompensatServiceImpl.class);

    @Autowired
    private InjuredFastCompensatInfoMapper injuredFastCompensatInfoMapper;

    @Autowired
    private InjuredFixedLossListMapper injuredFixedLossListMapper;

    @Autowired
    private InjuredImgMapper injuredImgMapper;

    @Autowired
    private InjuredFastCompensatReviewOpinionMapper injuredFastCompensatReviewOpinionMapper;

    @Autowired
    private InjuredStaffOperatLogMapper injuredStaffOperatLogMapper;

    @Autowired
    private InjuredNotifyTaskMapper injuredNotifyTaskMapper;

    @Autowired
    private InjuredTreatDiagnosisInfoMapper injuredTreatDiagnosisInfoMapper;

    @Autowired
    private CompanyAgencyMapper companyAgencyMapper;

    @Autowired
    private MQProducerService mQProducerService;



    @Override
    @DataPowers(region="company_agency_id",quota="fixed_loss_amount")
    public BaseResponse selectlist(FastCompensationReviewQuery query){

        BaseResponse response =   new BaseResponse();

        List<Compensatlist> resultList = new ArrayList<>();

        Boolean isExample = false;

        InjuredFastCompensatInfoExample example = new InjuredFastCompensatInfoExample();
        InjuredFastCompensatInfoExample.Criteria criteria = example.createCriteria();
        if(StringUtils.isNotBlank(query.getClaimNotificationNo())){
            criteria.andClaimNotificationNoEqualTo(query.getClaimNotificationNo().trim());
            isExample = true;
        }
        if(query.getCompanyAgencyId() != -1){
            criteria.andCompanyAgencyIdEqualTo(query.getCompanyAgencyId());
            isExample = true;
        }
        if(query.getHumanInjury() != null){
            criteria.andHumanInjuryEqualTo(query.getHumanInjury().byteValue());
            isExample = true;
        }
        if(query.getReviewStatus() != null){
            criteria.andReviewStatusEqualTo(query.getReviewStatus());
            isExample = true;
        }
        if(query.getFixedLossAmountBegin() != null && query.getFixedLossAmountEnd() != null){
            criteria.andFixedLossAmountBetween(query.getFixedLossAmountBegin(),query.getFixedLossAmountEnd());
            isExample = true;
        }else if(query.getFixedLossAmountBegin() != null){
            criteria.andFixedLossAmountGreaterThanOrEqualTo(query.getFixedLossAmountBegin());
            isExample = true;
        }else if(query.getFixedLossAmountEnd() != null){
            criteria.andFixedLossAmountLessThanOrEqualTo(query.getFixedLossAmountEnd());
            isExample = true;
        }
        if(StringUtils.isNotBlank(query.getPowersScope())){
            example.setPowersScope(query.getPowersScope());
        }
        if(query.getLossTimeBegin() != null && query.getLossTimeEnd() != null){
            criteria.andLossTimeBetween(query.getLossTimeBegin(),query.getLossTimeEnd());
            isExample = true;
        }else if(query.getLossTimeBegin() != null){
            criteria.andLossTimeGreaterThanOrEqualTo(query.getLossTimeBegin());
            isExample = true;
        }else if(query.getLossTimeEnd() != null){
            criteria.andLossTimeLessThanOrEqualTo(query.getLossTimeEnd());
            isExample = true;
        }
        if(StringUtils.isNotBlank(query.getTheInsuredName())){
            criteria.andTheInsuredNameLike("%".concat(query.getTheInsuredName().trim()).concat("%"));
            isExample = true;
        }
        if(StringUtils.isNotBlank(query.getTaskTypeFirst())){
            criteria.andTaskTypeFirstEqualTo(query.getTaskTypeFirst());
            isExample = true;
        }
        if(StringUtils.isNotBlank(query.getTaskTypeSecond())){
            criteria.andTaskTypeSecondEqualTo(query.getTaskTypeSecond());
            isExample = true;
        }
        if(query.getIsYourSelf()) {
            criteria.andReviewerIdEqualTo(query.getReviewerId());
        }
        if(StringUtils.isNotBlank(query.getOrderByColumn())) {
            example.setOrderByClause(query.getOrderByColumn());
        }
        if(StringUtils.isNotBlank(query.getReviewStatusInit())){
            List<Integer> list = Arrays.asList(query.getReviewStatusInit().split(","))
                    .stream().map(status -> Integer.valueOf(status)).collect(Collectors.toList());
            criteria.andReviewStatusIn(list);
            isExample = true;
        }

        if(!isExample){
            example.setOredCriteria(new ArrayList<>());
        }
        Page<InjuredFastCompensatInfo> page = PageHelper.startPage(query.getPageNum(), query.getPageSize(),"fixed_loss_receiv_time,claim_notification_no desc")
                .doSelectPage(()-> injuredFastCompensatInfoMapper.selectByExample(example));

        for (InjuredFastCompensatInfo injuredFastCompensatInfo:page.getResult()) {
             if(ReviewStatusEnum.PRIMARY_REVIEWING.getCode() == injuredFastCompensatInfo.getReviewStatus() ||
                     ReviewStatusEnum.UITIMATE_REVIEWING.getCode() == injuredFastCompensatInfo.getReviewStatus()) {
                 injuredFastCompensatInfo.setRemark(DateUtil.getTimeUntil(injuredFastCompensatInfo.getUpdtaeTime(), new Date()));
                 if (DateUtil.getDaysBetweenHour(injuredFastCompensatInfo.getUpdtaeTime(), new Date()) >= 24) {
                     injuredFastCompensatInfo.setTimeOut(System.currentTimeMillis() - injuredFastCompensatInfo.getUpdtaeTime().getTime());
                 }
             }
        }
        page.getResult().sort((info1,info2) -> info2.getTimeOut().compareTo(info1.getTimeOut()));

        PageBean<InjuredFastCompensatInfo> pageBean = new PageBean<InjuredFastCompensatInfo>(page);
        return ResponseUtil.success(pageBean);
    }

    /**
    　　* @description: 查询快赔审核任务详情
    　　* @param [fastInfoId]
    　　* @return com.injured.server.api.model.response.BaseResponse
    　　* @throws
    　　* @author LZX
    　　* @date 2019/7/29 11:27
    　　*/
    @Override
    public BaseResponse detail(Long fastInfoId) {

        FastCompensationReviewDetail detail = selectDetailByFastInfoId(fastInfoId);

        if(detail == null){
            return ResponseUtil.error(ResultEnum.NULL);
        }
        return ResponseUtil.success(detail);
    }

    @Override
    public InjuredFastCompensatInfo selectById(Long fastInfoId) {

        InjuredFastCompensatInfo injuredFastCompensatInfo = injuredFastCompensatInfoMapper.selectByPrimaryKey(fastInfoId);

        return injuredFastCompensatInfo;
    }


    private FastCompensationReviewDetail selectDetailByFastInfoId(Long fastInfoId){
        FastCompensationReviewDetail detail = new FastCompensationReviewDetail();
        //查询基本信息
        InjuredFastCompensatInfo injuredFastCompensatInfo = injuredFastCompensatInfoMapper.selectByPrimaryKey(fastInfoId);
        if(injuredFastCompensatInfo == null){
            return null;
        }

        //查询伤情诊断信息
        InjuredTreatDiagnosisInfoExample injuredTreatDiagnosisInfoExample = new InjuredTreatDiagnosisInfoExample();
        injuredTreatDiagnosisInfoExample.createCriteria().andInfoIdEqualTo(fastInfoId);
        List<InjuredTreatDiagnosisInfo> diagnosisInfos = injuredTreatDiagnosisInfoMapper.
                selectByExample(injuredTreatDiagnosisInfoExample);
        detail.setInjuredTreatDiagnosisInfo(diagnosisInfos);

        //查询项目损失信息
        InjuredFixedLossListExample injuredFixedLossListExample = new InjuredFixedLossListExample();
        injuredFixedLossListExample.createCriteria().andInfoIdEqualTo(fastInfoId);
        List<InjuredFixedLossList> lossList = injuredFixedLossListMapper.selectByExample(injuredFixedLossListExample);

        //查询照片信息
        InjuredImgExample injuredImgExample = new InjuredImgExample();
        injuredImgExample.createCriteria().andBusinessIdEqualTo(fastInfoId);
        injuredImgExample.setOrderByClause("img_type asc");
        List<InjuredImg> imgs = injuredImgMapper.selectByExample(injuredImgExample);

        for(InjuredImg img:imgs){
            if(StringUtils.isNotBlank(img.getImgUrl())){
                String url  = img.getImgUrl();
                img.setUploadName(url.concat("?imageView2"));
                url = url.concat("?imageView2/2/h/400/w/400");
                img.setImgUrl(url);
            }
        }

        //审核意见
        InjuredFastCompensatReviewOpinionExample injuredFastCompensatReviewOpinionExample
                = new InjuredFastCompensatReviewOpinionExample();

        injuredFastCompensatReviewOpinionExample.createCriteria().andFastInfoIdEqualTo(fastInfoId);
        injuredFastCompensatReviewOpinionExample.setOrderByClause("create_time desc");

        List<InjuredFastCompensatReviewOpinion> reviewOpinionins =
                injuredFastCompensatReviewOpinionMapper.selectByExample(injuredFastCompensatReviewOpinionExample);
        if(reviewOpinionins != null && reviewOpinionins.size() != 0) {
            InjuredFastCompensatReviewOpinion option = reviewOpinionins.get(0);
            detail.setReviewOpinion(option);
        }else{
            detail.setReviewOpinion(new InjuredFastCompensatReviewOpinion());
        }

        //日志
        InjuredStaffOperatLogExample injuredStaffOperatLogExample = new InjuredStaffOperatLogExample();
        injuredStaffOperatLogExample.createCriteria().andMedBasicInfoIdEqualTo(fastInfoId);
        injuredStaffOperatLogExample.setOrderByClause("create_time asc");
        List<InjuredStaffOperatLog> logs = injuredStaffOperatLogMapper.selectByExample(injuredStaffOperatLogExample);

        detail.setFastCompensatInfo(injuredFastCompensatInfo);
        detail.setImgs(imgs);
        detail.setInjuredFixedLossList(lossList);
        detail.setLogs(logs);

        return detail;
    }

    /**
    　　* @description: 修改快赔审核详情
    　　* @param [detail]
    　　* @return com.injured.server.api.model.response.BaseResponse
    　　* @throws
    　　* @author LZX
    　　* @date 2019/7/30 13:41
    　　*/
    @Override
    @Transactional
    public BaseResponse edit(FastCompensationReviewDetail detail,Integer type,Long userId) {
        BaseResponse response = editTransactional(detail,type,userId);
    	return response;
    }
    
    
    @Transactional
    public BaseResponse editTransactional(FastCompensationReviewDetail detail,Integer type,Long userId) {
        //更新快赔表信息
        InjuredFastCompensatInfo injuredFastCompensatInfo = injuredFastCompensatInfoMapper.selectByPrimaryKey(
        detail.getFastCompensatInfo().getId());

        if(injuredFastCompensatInfo == null || injuredFastCompensatInfo.getId() == null){
            logger.info("修改快赔审核信息获取请求快赔数据失败");
            return ResponseUtil.error(ResultEnum.NULL);
        }
        if(injuredFastCompensatInfo.getReviewStatus() != ReviewStatusEnum.PRIMARY_REVIEWING.getCode()
           &&injuredFastCompensatInfo.getReviewStatus() != ReviewStatusEnum.UITIMATE_REVIEWING.getCode()){
            logger.info("修改快赔审核信息案件状态异常");
            return ResponseUtil.error(ResultEnum.REVIEW_STATUS_ERROR);
        }

        if(!injuredFastCompensatInfo.getReviewerId().equals(userId)){
            logger.info("当前处理人无处理权限");
            return ResponseUtil.error(ResultEnum.REVIEW_STATUS_NOT_PERMISSION);
        }

        //更新损失项目信息
        //BigDecimal lossAmount = new BigDecimal(0.00);
        BigDecimal damageAmount = new BigDecimal(0.00);
        List<InjuredFixedLossList> lossList = detail.getInjuredFixedLossList();

        if(lossList != null) {
            for (InjuredFixedLossList injuredFixedLossList : lossList) {
                 //lossAmount = injuredFixedLossList.getFixedLossAmount().add(lossAmount);
                 damageAmount =injuredFixedLossList.getDamageAmount().add(damageAmount);
                 injuredFixedLossList.setUpdateTime(new Date());
                 int lossResult = injuredFixedLossListMapper.updateByPrimaryKeySelective(injuredFixedLossList);
                 if(lossResult != 1){
                     logger.info("修改快赔审核信息更新项目信息失败,快赔ID为{}",injuredFastCompensatInfo.getId());
                     TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                     return ResponseUtil.error(ResultEnum.UPDATE_TABLES_ERROR);
                 }
            }
        }
        //injuredFastCompensatInfo.setFixedLossAmount(lossAmount);
        injuredFastCompensatInfo.setFixedLossSubmitTime(new Date());
        injuredFastCompensatInfo.setDamageAmount(damageAmount);
        injuredFastCompensatInfo.setLossFirstType(detail.getFastCompensatInfo().getLossFirstType());
        injuredFastCompensatInfo.setLossSecondType(detail.getFastCompensatInfo().getLossSecondType());
        
        Integer reviewStatus = injuredFastCompensatInfo.getReviewStatus();
        if(type == 1) {
            if (reviewStatus == ReviewStatusEnum.PRIMARY_REVIEWING.getCode()) {
                injuredFastCompensatInfo.setReviewStatus(ReviewStatusEnum.PRIMARY_REVIEWED.getCode());
            } else if (reviewStatus == ReviewStatusEnum.UITIMATE_REVIEWING.getCode()) {
                injuredFastCompensatInfo.setReviewStatus(ReviewStatusEnum.REVIEWED.getCode());
            }
        }

        int fastInfoResult = injuredFastCompensatInfoMapper.updateByPrimaryKeySelective(injuredFastCompensatInfo);
        if(fastInfoResult != 1){
            logger.info("修改快赔审核信息更新快赔信息失败,快赔ID为{}",injuredFastCompensatInfo.getId());
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return ResponseUtil.error(ResultEnum.UPDATE_TABLES_ERROR);
        }

        //更新审核意见
        InjuredFastCompensatReviewOpinion opinion = detail.getReviewOpinion();
        if(opinion != null && StringUtils.isNotBlank(opinion.getAuditOpinion())
                           && opinion.getIsQualificatSurvey() != null){
            opinion.setRegistId(injuredFastCompensatInfo.getRegistId());
            opinion.setUpdateTime(new Date());
            opinion.setFastInfoId(injuredFastCompensatInfo.getId());
            opinion.setCompantCode(injuredFastCompensatInfo.getCompantCode());
            opinion.setCompanyId(injuredFastCompensatInfo.getCompanyId());
            opinion.setReviewerSubmitTime(new Date());
            opinion.setCreateTime(new Date());
            opinion.setReviewerTime(injuredFastCompensatInfo.getUpdtaeTime());
            opinion.setId(null);
            //区分保存和提交的数据
            if(type == 0){
                opinion.setIsDeleted(1);
            }else{
                opinion.setIsDeleted(0);
            }
            int opinionResult = injuredFastCompensatReviewOpinionMapper.insertSelective(opinion);
            if(opinionResult != 1){
                logger.info("插入快赔审核信息更新审核意见信息失败,快赔ID为{}",injuredFastCompensatInfo.getId());
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return ResponseUtil.error(ResultEnum.UPDATE_TABLES_ERROR);
            }
        }
        if(type == 1) {
            //插入日志信息
            InjuredFastCompensatInfo queryInfo = injuredFastCompensatInfoMapper.selectByPrimaryKey(injuredFastCompensatInfo.getId());

            InjuredStaffOperatLog injuredStaffOperatLog = new InjuredStaffOperatLog();
            injuredStaffOperatLog.setClaimNotificationNo(queryInfo.getClaimNotificationNo());
            injuredStaffOperatLog.setCompanyId(queryInfo.getCompanyId());
            injuredStaffOperatLog.setMedBasicInfoId(queryInfo.getId());
            injuredStaffOperatLog.setRegistId(queryInfo.getRegistId());
            injuredStaffOperatLog.setSubmitTime(new Date());
            injuredStaffOperatLog.setSubmitName(opinion.getReviewerName());
            injuredStaffOperatLog.setSubmitAmount(damageAmount);
            injuredStaffOperatLog.setSubmitOpinion(opinion.getAuditOpinion());
            injuredStaffOperatLog.setOpinionDesc(opinion.getIsQualificatSurvey() == 0 ? "不同意" : "同意");
            injuredStaffOperatLog.setSubmitNo(opinion.getReviewerNo());
            injuredStaffOperatLog.setSubmitTask(TaskType.FAST_REVIEW.getCode());
            injuredStaffOperatLog.setCreateTime(new Date());

            int logResult = injuredStaffOperatLogMapper.insertSelective(injuredStaffOperatLog);

            if (logResult != 1) {
                logger.info("修改快赔审核信息插入日志信息失败,快赔ID为{}", injuredFastCompensatInfo.getId());
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return ResponseUtil.error(ResultEnum.INSERT_TALBLE_ERROR);
            }
        }

        return ResponseUtil.success(reviewStatus);
    }

    @Override
    public BaseResponse submit(FastCompensationReviewDetail detail,Long userId) {
        Long fastInfoId = detail.getFastCompensatInfo().getId();

        BaseResponse response =
                ((CompensatServiceImpl) AopContext.currentProxy()).edit(detail,1,userId);
        if(!ResultEnum.SUCCESS.getCode().equals(response.getCode())){
            logger.info("修改快赔审核信息失败,快赔ID为{}",fastInfoId);
            return response;
        }
        FastCompensationReviewResponse fastCompensationReviewResponse = fastInfoToCompany(fastInfoId);
        //只有终极审核完成才发送数据到保险公司
        InjuredFastCompensatInfo injuredFastCompensatInfo =
                injuredFastCompensatInfoMapper.selectByPrimaryKey(fastInfoId);

        if(ReviewStatusEnum.PRIMARY_REVIEWED.getCode() == injuredFastCompensatInfo.getReviewStatus()) {
            logger.info("修改快赔信息发送终审MQ消息BEGIN,任务ID为{}",injuredFastCompensatInfo.getId());
            mQProducerService.sendDispatchedWorkerMessage(detail.getFastCompensatInfo().getId().toString());
        }
        if(ReviewStatusEnum.REVIEWED.getCode() ==
                injuredFastCompensatInfo.getReviewStatus()) {

            InjuredNotifyTask task = new InjuredNotifyTask();
            task.setBizType(TaskType.FAST_REVIEW.getCode() + "");
            task.setBusinessId(fastInfoId);
            task.setCreateTime(new Date());
            task.setNotifyParam(JSONObject.toJSONString(fastCompensationReviewResponse));
            task.setNotifyUrl(detail.getFastCompensatInfo().getNotifyUrl());
            task.setUpdateTime(new Date());
            int result = injuredNotifyTaskMapper.insertSelective(task);
            if (result != 1) {
                logger.info("提交快赔审核信息到异步通知任务表中失败,快赔ID为{}", fastInfoId);
                return ResponseUtil.error(ResultEnum.INSERT_TALBLE_ERROR);
            }
        }
        return ResponseUtil.success(null);
    }




    @Override
    @Transactional
    public BaseResponse reassSubmit(Long fastInfoId, Long userId,String userName,InjuredStaffOperatLog log,Integer underLevel){
        InjuredFastCompensatInfoExample example = new InjuredFastCompensatInfoExample();
        InjuredFastCompensatInfoExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(fastInfoId);

        List<InjuredFastCompensatInfo> infos = injuredFastCompensatInfoMapper.selectByExample(example);

        for (InjuredFastCompensatInfo injuredFastCompensatInfo:infos) {
            injuredFastCompensatInfo.setReviewerId(userId);
            injuredFastCompensatInfo.setReviewerName(userName);

            if(injuredFastCompensatInfo.getReviewStatus() == ReviewStatusEnum.PRIMARY_REVIEWING.getCode() && underLevel == UnderLevelEnum.TWO.getCode()){
                injuredFastCompensatInfo.setReviewStatus(ReviewStatusEnum.UITIMATE_REVIEWING.getCode());
                //手动改派,如果初审案件直接改派给终审人,则更新updatetime
                injuredFastCompensatInfo.setUpdtaeTime(new Date());
            }
            int result = injuredFastCompensatInfoMapper.updateByPrimaryKey(injuredFastCompensatInfo);
            if(result != 1){
                throw  new BusinessException(ResultEnum.UPDATE_TABLES_ERROR);
            }

            log.setRegistId(injuredFastCompensatInfo.getRegistId());
            log.setClaimNotificationNo(injuredFastCompensatInfo.getClaimNotificationNo());
            log.setMedBasicInfoId(injuredFastCompensatInfo.getId());

            int logResult = injuredStaffOperatLogMapper.insertSelective(log);

            if(logResult != 1){
                throw  new BusinessException(ResultEnum.INSERT_TALBLE_ERROR);
            }
        }
        return ResponseUtil.success(null);
    }



    private FastCompensationReviewResponse fastInfoToCompany(Long fastInfoId){
        FastCompensationReviewResponse detail = new FastCompensationReviewResponse();
        //查询基本信息
        InjuredFastCompensatInfo injuredFastCompensatInfo = injuredFastCompensatInfoMapper.selectByPrimaryKey(fastInfoId);
        if(injuredFastCompensatInfo == null){
            return null;
        }

        InjuredFastCompensatInfoResponse infoResponse = new InjuredFastCompensatInfoResponse();
        BeanUtils.copyProperties(injuredFastCompensatInfo,infoResponse);

        //初诊时间转换
        if(injuredFastCompensatInfo.getVisitTime() != null) {
            infoResponse.setVisitTime(DateUtil.formatDate(injuredFastCompensatInfo.getVisitTime(),"yyyy-MM-dd HH:mm:ss"));
        }

        //就诊时间转换
        if(injuredFastCompensatInfo.getSendDoctorTime() != null) {
            infoResponse.setSendDoctorTime(DateUtil.formatDate(injuredFastCompensatInfo.getSendDoctorTime(),"yyyy-MM-dd HH:mm:ss"));
        }


        //定损接收时间转换
        if(injuredFastCompensatInfo.getFixedLossReceivTime() != null) {
            infoResponse.setFixedLossReceivTime(DateUtil.formatDate(injuredFastCompensatInfo.getFixedLossReceivTime(),"yyyy-MM-dd HH:mm:ss"));
        }


        //定损提交时间转换
        if(injuredFastCompensatInfo.getFixedLossSubmitTime() != null) {
            infoResponse.setFixedLossSubmitTime(DateUtil.formatDate(injuredFastCompensatInfo.getFixedLossSubmitTime(),"yyyy-MM-dd HH:mm:ss"));
        }


        detail.setFastCompensatInfoResponse(infoResponse);
        detail.setTaskNo(injuredFastCompensatInfo.getTaskNo());
        detail.setBusinessType(injuredFastCompensatInfo.getTaskTypeFirst());
        detail.setClaimNotificationNo(injuredFastCompensatInfo.getClaimNotificationNo());

        //查询伤情诊断信息
        InjuredTreatDiagnosisInfoExample injuredTreatDiagnosisInfoExample = new InjuredTreatDiagnosisInfoExample();
        injuredTreatDiagnosisInfoExample.createCriteria().andInfoIdEqualTo(fastInfoId);
        List<InjuredTreatDiagnosisInfo> diagnosisInfos = injuredTreatDiagnosisInfoMapper.
                selectByExample(injuredTreatDiagnosisInfoExample);

        List<InjuredTreatDiagnosisInfoResponse> dagnosisInfoResponses = new ArrayList<>();

        for(InjuredTreatDiagnosisInfo injuredTreatDiagnosisInfo:diagnosisInfos) {
            InjuredTreatDiagnosisInfoResponse dagnosisInfoResponse = new InjuredTreatDiagnosisInfoResponse();
            BeanUtils.copyProperties(injuredTreatDiagnosisInfo, dagnosisInfoResponse);
            dagnosisInfoResponses.add(dagnosisInfoResponse);
        }
        detail.setInjuredTreatDiagnosisInfoResponse(dagnosisInfoResponses);

        //查询项目损失信息
        InjuredFixedLossListExample injuredFixedLossListExample = new InjuredFixedLossListExample();
        injuredFixedLossListExample.createCriteria().andInfoIdEqualTo(fastInfoId);
        List<InjuredFixedLossList> lossList = injuredFixedLossListMapper.selectByExample(injuredFixedLossListExample);

        List<InjuredFixedLossListResponse> lossResponseList = new ArrayList<>();

        for (InjuredFixedLossList injuredFixedLossList:lossList){
            InjuredFixedLossListResponse lossListResponse = new InjuredFixedLossListResponse();
            BeanUtils.copyProperties(injuredFixedLossList, lossListResponse);
            lossResponseList.add(lossListResponse);
        }
        detail.setInjuredFixedLossListResponse(lossResponseList);

        //查询照片信息
        InjuredImgExample injuredImgExample = new InjuredImgExample();
        injuredImgExample.createCriteria().andBusinessIdEqualTo(fastInfoId);
        injuredImgExample.setOrderByClause("img_type desc");
        List<InjuredImg> imgs = injuredImgMapper.selectByExample(injuredImgExample);

        List<InjuredImgResponse> imgsResponse = new ArrayList<>();

        for (InjuredImg injuredImg:imgs){
            InjuredImgResponse injuredImgResponse = new InjuredImgResponse();
            BeanUtils.copyProperties(injuredImg, injuredImgResponse);
            imgsResponse.add(injuredImgResponse);
        }
        detail.setImgsResponse(imgsResponse);


        //审核意见
        InjuredFastCompensatReviewOpinionExample injuredFastCompensatReviewOpinionExample
                = new InjuredFastCompensatReviewOpinionExample();

        injuredFastCompensatReviewOpinionExample.createCriteria().andFastInfoIdEqualTo(fastInfoId).andIsDeletedEqualTo(new Integer(0).byteValue());
        injuredFastCompensatReviewOpinionExample.setOrderByClause("create_time desc");

        List<InjuredFastCompensatReviewOpinion> reviewOpinionins =
                injuredFastCompensatReviewOpinionMapper.selectByExample(injuredFastCompensatReviewOpinionExample);

        List<InjuredFastCompensatOpinionResponse> opinionResponse = new ArrayList<>();

        for (InjuredFastCompensatReviewOpinion injuredFastCompensatReviewOpinion:reviewOpinionins){
            InjuredFastCompensatOpinionResponse reviewOpinionResponse = new InjuredFastCompensatOpinionResponse();
            BeanUtils.copyProperties(injuredFastCompensatReviewOpinion, reviewOpinionResponse);

            //审核提交时间
            reviewOpinionResponse.setReviewerSubmitTime(DateUtil.formatDate(
                    injuredFastCompensatReviewOpinion.getReviewerSubmitTime(),"yyyy-MM-dd HH:mm:ss"));

            //审核接收时间
            reviewOpinionResponse.setReviewerTime(DateUtil.formatDate(
                    injuredFastCompensatReviewOpinion.getReviewerTime(),"yyyy-MM-dd HH:mm:ss"));

            opinionResponse.add(reviewOpinionResponse);
        }
        detail.setReviewOpinionResponse(opinionResponse);

        return detail;
    }
}
