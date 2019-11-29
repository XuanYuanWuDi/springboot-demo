package com.injured.commons.qiniu;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author zlu
 * @title: QiniuConfig
 * @projectName injured
 * @description: 配件文件初始化
 * @date 2019/7/210:41
 */
@Configuration
@Getter
@Setter
public class QiniuConfig {

    @Value("${qiniu.access.key}")
    private  String accessKey;
    @Value("${qiniu.secre.key}")
    private  String secretKey;
    @Value("${qiniu.domain.name}")
    private  String domain;
    @Value("${qiniu.bucket.name}")
    private  String bucket;
}
