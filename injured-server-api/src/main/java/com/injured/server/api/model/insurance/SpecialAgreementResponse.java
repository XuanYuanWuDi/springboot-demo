package com.injured.server.api.model.insurance;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author zlu
 * @title: SpecialAgreementResponse
 * @projectName injured
 * @description: 特别约定
 * @date 2019/7/3115:28
 */
@Getter
@Setter
@ToString
public class SpecialAgreementResponse implements Serializable {

    //约定条文
    private String content;
}
