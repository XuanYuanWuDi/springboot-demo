package com.injured.dubbo.service;

import com.injured.project.system.user.domain.User;
import com.injured.server.api.model.query.DemoQuery;
import com.injured.server.api.model.response.BaseResponse;


/**
 * @author zlu
 * @title: DemoService
 * @projectName injured-web-manager
 * @description: TODO
 * @date 2019/7/19:27
 */
public interface DemoService {
    BaseResponse list(User user, DemoQuery query);
}
