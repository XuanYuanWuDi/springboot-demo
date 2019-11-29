package com.injured.server.api.contract;

import com.injured.server.api.entity.InjuredNotifyTask;

/**
 * @author zlu
 * @title: CeNotifyTaskContract
 * @projectName injured
 * @description: 异步任务
 * @date 2019/7/2714:44
 */
public interface InjuredNotifyTaskContract {

    public void task();

    public void saveInjuredNotifyTask(InjuredNotifyTask task);
}
