package com.injured.server.api.contract;

import com.injured.server.api.entity.InjuredStaffOperatLog;
import com.injured.server.api.model.response.BaseResponse;


/**
 * @author zlu
 * @title: CompanyAgencyContract
 * @projectName injured
 * @description: TODO
 * @date 2019/7/318:02
 */
public interface InjuredStaffOperatLogContract {
    
	/**
     * @Description 根据任务类型等查询操作日志
     * @param submitTask 任务类型名称
     * @param id 查勘任务id/机构id/用户id/菜单id/任务id/权限等id
     * @param companyId 保险公司id
     * @return
     */
    public BaseResponse logListByTaskId(int submitTask,Long id, Long companyId);
    
    /**
     * @Description 新增日志信息
     * @param injuredStaffOperatLog
     */
    public void addInjuredStaffLog(InjuredStaffOperatLog injuredStaffOperatLog);
}
