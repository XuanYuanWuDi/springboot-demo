package com.injured.server.api.model.request.fast;

import com.injured.server.api.annotations.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author zlu
 * @title: SpecialAgreement
 * @projectName injured
 * @description:特别约定详情
 * @date 2019/7/2213:20
 */
@Getter
@Setter
@ToString
public class SpecialAgreement implements Serializable {

    //序号
    @NotNull(groups = { "fastInfo" })
    private String order;

    //约定条文
    @NotNull(groups = { "fastInfo" })
    private String content;

}
