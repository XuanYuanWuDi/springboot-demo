package com.injured.server.api.contract;

import com.injured.server.api.entity.InjuredFastCompensatInfo;
import com.injured.server.api.entity.InjuredStaffOperatLog;
import com.injured.server.api.enums.ReviewStatusEnum;
import com.injured.server.api.enums.TaskStatusEnum;
import com.injured.server.api.model.compensat.FastCompensationReviewDetail;
import com.injured.server.api.model.compensat.FastCompensationReviewQuery;
import com.injured.server.api.model.response.BaseResponse;

/**
 * @author cm
 * @title: CompensatContract
 * @projectName injured
 *  * @description: TODO
 * @date 2019/7/24
 */
public interface CompensatContract  {
    public BaseResponse selectlist(FastCompensationReviewQuery query);

    public BaseResponse detail(Long fastInfoId);

    BaseResponse edit(FastCompensationReviewDetail detail,Integer type,Long userId);

    BaseResponse submit(FastCompensationReviewDetail detail,Long userId);

    BaseResponse reassSubmit(Long fastInfoId, Long userId,String userName,InjuredStaffOperatLog log,Integer underLevel);

    public InjuredFastCompensatInfo selectById(Long fastInfoId);
}
