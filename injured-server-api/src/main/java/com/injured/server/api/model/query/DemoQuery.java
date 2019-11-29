package com.injured.server.api.model.query;

import com.injured.server.api.model.request.BaseRequest;
import lombok.Getter;
import lombok.Setter;

/**
 * @author zlu
 * @title: DemoQuery
 * @projectName injured
 * @description: TODO
 * @date 2019/7/116:01
 */
@Getter
@Setter
public class DemoQuery extends BaseRequest {

    private String company;

}
