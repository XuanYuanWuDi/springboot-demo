package com.injured.server.api.contract;

import com.injured.server.api.model.response.BaseResponse;

/**
 * @author zlu
 * @title: ImgaeContract
 * @projectName injured
 * @description: 文件操作
 * @date 2019/7/2613:45
 */
public interface FileContract {

    public BaseResponse insertFileData(String fileUrl,Integer fileType,Long businessId,Integer businessType,String uploadName,String uploadNumer);

    BaseResponse fileList(Long registId,Long businessId);
}
