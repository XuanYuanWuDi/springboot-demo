package com.injured.server.api.contract;


import com.injured.server.api.model.response.BaseResponse;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author cm
 * @title: WorkbenchContract
 * @projectName injured
 *  * @description: TODO
 * @date 2019/7/23
 */
public interface WorkbenchContract{
    public BaseResponse list(Long userId,String userNo);
}
