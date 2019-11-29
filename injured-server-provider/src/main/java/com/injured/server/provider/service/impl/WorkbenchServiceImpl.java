package com.injured.server.provider.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.injured.commons.DateUtil;
import com.injured.server.api.contract.WorkbenchContract;
import com.injured.server.api.entity.InjuredFastCompensatInfo;
import com.injured.server.api.entity.InjuredFastCompensatInfoExample;
import com.injured.server.api.entity.InjuredFastCompensatReviewOpinion;
import com.injured.server.api.entity.InjuredFastCompensatReviewOpinionExample;
import com.injured.server.api.enums.ResultEnum;
import com.injured.server.api.enums.ReviewStatusEnum;
import com.injured.server.api.model.response.BaseResponse;
import com.injured.server.api.model.response.ResponseUtil;
import com.injured.server.api.model.workbench.DateNum;
import com.injured.server.api.model.workbench.Statisticaldata;
import com.injured.server.provider.mapper.InjuredFastCompensatInfoMapper;
import com.injured.server.provider.mapper.InjuredFastCompensatReviewOpinionMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * @author cm
 * @title: WorkbenchServiceImp
 * @projectName injured
 * @description: TODO
 * @date 2019/7/23
 */
@Service(timeout = 60000)
public class WorkbenchServiceImpl implements WorkbenchContract {

    private static final Logger log = LoggerFactory.getLogger(WorkbenchServiceImpl.class);

    @Autowired
    private InjuredFastCompensatInfoMapper injuredFastCompensatInfoMapper;

    @Autowired
    private InjuredFastCompensatReviewOpinionMapper injuredFastCompensatReviewOpinionMapper;



    /*
      1.查询所有待处理的任务数量
      2.查询今日已完成的任务数量
      3.查询本周完成的任务数量
      4.查询本月每日完成的任务数量
      @author cm
     */
    @Override
    public BaseResponse list(Long userId,String userNo){
        log.info("获取控制台数据BEGIN");
        try {
            Statisticaldata statisticaldata = new Statisticaldata();
            //查询所有待处理的任务
            untreatedNum(userId,userNo,statisticaldata);
            //查询今日已完成的任务数量
            todayProcessed(userId,userNo,statisticaldata);
            //查询本周完成的任务数量
            weekProcessed(userId,userNo,statisticaldata);
            //查询本月每日完成的任务数量
            currentDate(userId,userNo,statisticaldata);
            return ResponseUtil.success(statisticaldata);
        }catch(Exception e){
            e.printStackTrace();
            return ResponseUtil.error(ResultEnum.EXCEPTION);
        }
    }

    private void currentDate(Long userId,String userNo,Statisticaldata statisticaldata) throws ParseException {
        List<String> curremDate = DateUtil.getMonthFullDay();
        List<DateNum> dateNums = new ArrayList<>();
        for (String dateStr:curremDate) {
             DateNum dateNum = new DateNum();
             Date beginDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateStr.concat(" 00:00:00"));
             InjuredFastCompensatReviewOpinionExample example = new InjuredFastCompensatReviewOpinionExample();
             List<Integer> reviewStatusList = new ArrayList<>();
             //reviewStatusList.add(ReviewStatusEnum.PRIMARY_REVIEWED.getCode());
             //reviewStatusList.add(ReviewStatusEnum.REVIEWED.getCode());
             example.createCriteria().andReviewerNoEqualTo(userNo).andIsDeletedEqualTo(new Byte((byte) 0))
                    .andReviewerSubmitTimeBetween(beginDate,
                            DateUtil.getEndOfDay(beginDate));
             List<InjuredFastCompensatReviewOpinion> todayProcesseds = injuredFastCompensatReviewOpinionMapper.selectByExample(example);
            if(todayProcesseds == null) {
                dateNum.setDateTime(dateStr);
                dateNum.setNum(0);
            }else{
                dateNum.setDateTime(dateStr);
                dateNum.setNum(todayProcesseds.size());
            }
            dateNums.add(dateNum);
        }
        statisticaldata.setCurrentDate(dateNums);
    }

    private void weekProcessed(Long userId,String userNo,Statisticaldata statisticaldata) throws ParseException {
        //查询本周完成的任务数量
        InjuredFastCompensatReviewOpinionExample example = new InjuredFastCompensatReviewOpinionExample();
       // List<Integer> reviewStatusList = new ArrayList<>();
       //reviewStatusList.add(ReviewStatusEnum.PRIMARY_REVIEWED.getCode());
       // reviewStatusList.add(ReviewStatusEnum.REVIEWED.getCode());
        example.createCriteria().andReviewerNoEqualTo(userNo).andIsDeletedEqualTo(new Byte((byte) 0))
                .andReviewerSubmitTimeBetween(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(DateUtil.getMondayOfThisWeek()),
                        DateUtil.getEndOfDay(new Date()));
        List<InjuredFastCompensatReviewOpinion> weekProcesseds = injuredFastCompensatReviewOpinionMapper.selectByExample(example);
        if(weekProcesseds == null) {
            statisticaldata.setWeekProcessed(0);
        }else{
            statisticaldata.setWeekProcessed(weekProcesseds.size());
        }
    }


    private void todayProcessed(Long userId,String userNo,Statisticaldata statisticaldata) {
        //查询今日已完成的任务数量
        InjuredFastCompensatReviewOpinionExample example = new InjuredFastCompensatReviewOpinionExample();
       /* List<Integer> reviewStatusList = new ArrayList<>();
        reviewStatusList.add(ReviewStatusEnum.PRIMARY_REVIEWED.getCode());
        reviewStatusList.add(ReviewStatusEnum.REVIEWED.getCode());*/
        example.createCriteria().andReviewerNoEqualTo(userNo).andIsDeletedEqualTo(new Byte((byte) 0))
                                            .andReviewerSubmitTimeBetween(DateUtil.getStartOfDay(new Date()),DateUtil.getEndOfDay(new Date()));
        List<InjuredFastCompensatReviewOpinion> todayProcesseds = injuredFastCompensatReviewOpinionMapper.selectByExample(example);
        if(todayProcesseds == null) {
            statisticaldata.setTodayProcessed(0);
        }else{
            statisticaldata.setTodayProcessed(todayProcesseds.size());
        }
    }

    private void untreatedNum(Long userId,String userNo,Statisticaldata statisticaldata) {
        //查询所有待处理的任务
        InjuredFastCompensatInfoExample example = new InjuredFastCompensatInfoExample();
        List<Integer> reviewStatusList = new ArrayList<>();
        reviewStatusList.add(ReviewStatusEnum.PRIMARY_REVIEWING.getCode());
        reviewStatusList.add(ReviewStatusEnum.UITIMATE_REVIEWING.getCode());
        example.createCriteria().andReviewStatusIn(reviewStatusList).andReviewerIdEqualTo(userId);
        List<InjuredFastCompensatInfo> untreateds = injuredFastCompensatInfoMapper.selectByExample(example);
        if(untreateds == null) {
            statisticaldata.setUntreatedNum(0);
        }else{
            statisticaldata.setUntreatedNum(untreateds.size());
        }
    }
}
