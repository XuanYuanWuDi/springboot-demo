package com.injured.server.api.contract;

import com.injured.server.api.model.query.DemoQuery;
import com.injured.server.api.model.response.BaseResponse;


/**
 * @author zlu
 * @title: DemoContract
 * @projectName injured
 * @description: TODO
 * @date 2019/7/110:20
 */
public interface DemoContract {

    public BaseResponse list(DemoQuery query);
}
