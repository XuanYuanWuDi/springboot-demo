package com.injured.server.api.contract;

import com.injured.server.api.model.request.fast.FastCompensatInfoRequest;
import com.injured.server.api.model.response.BaseResponse;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * @author zlu
 * @title: FastCompensatContract
 * @projectName injured
 * @description: 快赔案件
 * @date 2019/7/2215:10
 */
public interface FastCompensatContract {

    public BaseResponse fastCompensat(FastCompensatInfoRequest fastCompensatInfoRequest)throws Exception;

    public void injuredTableExecutor(FastCompensatInfoRequest fastCompensatInfoRequest, Map<String,Long> resultMap);

    public Map<String,Long> ceTableExecutor(FastCompensatInfoRequest fastCompensatInfoRequest);

    public void removeCeTable(Long registId, Long surveyId);
}
