package com.injured.server.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.injured.commons.string.StringUtils;
import com.injured.server.api.contract.FileContract;
import com.injured.server.api.entity.InjuredFastCompensatInfo;
import com.injured.server.api.entity.InjuredImg;
import com.injured.server.api.entity.InjuredImgExample;
import com.injured.server.api.enums.ResultEnum;
import com.injured.server.api.model.response.BaseResponse;
import com.injured.server.api.model.response.ResponseUtil;
import com.injured.server.provider.mapper.InjuredFastCompensatInfoMapper;
import com.injured.server.provider.mapper.InjuredImgMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zlu
 * @title: FileServiceImpl
 * @projectName injured
 * @description: 文件操作
 * @date 2019/7/2613:58
 */
@Service
public class FileServiceImpl implements FileContract {

    private static Logger logger = LogManager.getLogger(FileServiceImpl.class);

    @Autowired
    private InjuredImgMapper injuredImgMapper;

    @Autowired
    private InjuredFastCompensatInfoMapper injuredFastCompensatInfoMapper;

    /**
    　　* @description: 保存图片信息
    　　* @param [fileUrl, fileType, businessId, businessType, uploadName, uploadNumer]
    　　* @return com.injured.server.api.model.response.BaseResponse
    　　* @throws
    　　* @author LZX
    　　* @date 2019/7/26 14:34
    　　*/
    @Override
    public BaseResponse insertFileData(String fileUrl, Integer fileType, Long businessId,Integer businessType
            ,String uploadName,String uploadNumer) {
        logger.info("保存图片信息BEGIN");
        BaseResponse baseResponse = new BaseResponse();
        //快赔案件
        if(businessType == 1){
            InjuredFastCompensatInfo injuredFastCompensatInfo = injuredFastCompensatInfoMapper.selectByPrimaryKey(businessId);
            if(injuredFastCompensatInfo == null){
                logger.info("保存图片查询快赔信息为空");
                baseResponse = ResponseUtil.error(ResultEnum.NULL);
                return baseResponse;
            }
            InjuredImg injuredImg = new InjuredImg();
            injuredImg.setBusinessId(businessId);
            injuredImg.setBusinessType(businessType);
            injuredImg.setClaimNotificationNo(injuredFastCompensatInfo.getClaimNotificationNo());
            injuredImg.setCompanyCode(injuredFastCompensatInfo.getCompantCode());
            injuredImg.setCompanyId(injuredFastCompensatInfo.getCompanyId());
            injuredImg.setImgType(fileType);
            injuredImg.setImgUrl(fileUrl);
            injuredImg.setRegistId(injuredFastCompensatInfo.getRegistId());
            injuredImg.setUploadName(uploadName);
            injuredImg.setUploadNumber(uploadNumer);
            injuredImg.setCreateTime(new Date());

            int result = injuredImgMapper.insertSelective(injuredImg);
            if(result != 1){
                logger.info("插入文件信息失败");
                baseResponse = ResponseUtil.error(ResultEnum.FILE_INSERT_ERROR);
                return baseResponse;
            }
            Map<String,Object> resultMap = new HashMap<>();
            resultMap.put("fileUrl",fileUrl);
            resultMap.put("fileType",fileType);
            baseResponse = ResponseUtil.success(resultMap);
        }
        return baseResponse;
    }

    /**
    　　* @description: 获取图片列表
    　　* @param [registId,businessId]
    　　* @return com.injured.server.api.model.response.BaseResponse
    　　* @throws
    　　* @author LZX
    　　* @date 2019/7/26 14:41
    　　*/
    @Override
    public BaseResponse fileList(Long registId,Long businessId) {
        logger.info("获取案件{}下的业务ID为{}图片集合BEGIN",registId,businessId);
        InjuredImgExample example = new InjuredImgExample();
        InjuredImgExample.Criteria criteria = example.createCriteria();
        criteria.andRegistIdEqualTo(registId).andIsDeletedEqualTo(new Byte((byte) 0));
        if(businessId != null){
            criteria.andBusinessIdEqualTo(businessId);
        }
        List<InjuredImg> imgs = injuredImgMapper.selectByExample(example);

        for(InjuredImg img:imgs){
            if(StringUtils.isNotBlank(img.getImgUrl())){
                String url  = img.getImgUrl();
                url = url.concat("?imageView2");
                img.setImgUrl(url);
            }
        }
        return ResponseUtil.success(imgs);
    }
}
