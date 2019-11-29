package com.injured.commons.qiniu;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import com.google.gson.Gson;
import com.injured.commons.http.OkHttpUtils;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zlu
 * @title: QiniuUtils
 * @projectName workspaces
 * @description: 七牛云上传工具类
 * @date 2019/4/318:30
 */
@Component
public class QiniuUtils {

    private static QiniuConfig config;

    @Autowired
    public void setConfig(QiniuConfig config) {
        QiniuUtils.config = config;
    }

    /**
     *              * 将图片对象流存储起来七牛云
     *              *
     *                      * @param imageIS       stream流 (stream流 与 byte[]流传其一，传null)
     *              * @param imageByte     byte[]流
     *              * @param zone          区域
     *              * @param accessKeyName accessKey（配置文件名）
     */
    public String saveImageObjToCloud(InputStream imageIS, byte[] imageByte,Zone zone) throws Exception {
        String cloudUrl = "";

        Configuration cfg = new Configuration(zone);
        UploadManager uploadManager = new UploadManager(cfg);

        String key = null;
        Auth auth = Auth.create(config.getAccessKey(), config.getSecretKey());
        String upToken = auth.uploadToken(config.getBucket());
        try {
            byte[] imageBys;

            if (imageIS == null) {
                imageBys = imageByte;
            }else{
                imageBys = toByteArray(imageIS);
            }
            Response response = uploadManager.put(imageBys, key, upToken);
            // 解析上传成功的结果
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            cloudUrl = config.getDomain() + "/" + putRet.key;

        } catch (QiniuException ex) {
            Response r = ex.response;
            System.err.println(r.toString());
        }

        return cloudUrl;
    }

    public  byte[] toByteArray(InputStream input) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] buffer = new byte[4096];
        int n = 0;
        while (-1 != (n = input.read(buffer))) {
            output.write(buffer, 0, n);
        }
        return output.toByteArray();
    }

    /**
     * 获取网络图片地址
     *
     */
    public  InputStream getImageObjWithHttp(String url) {
        InputStream sr = null;
        try {
            sr = OkHttpUtils.getReturnStream(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sr;
    }
}

