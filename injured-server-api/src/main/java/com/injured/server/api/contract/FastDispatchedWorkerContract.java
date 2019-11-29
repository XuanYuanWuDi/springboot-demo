package com.injured.server.api.contract;

import java.util.List;

import com.injured.server.api.entity.CompanyAgency;
import com.injured.server.api.entity.InjuredFastCompensatInfo;
import com.injured.server.api.model.query.FastDispatchedWorkerUserNum;

/**
 * 
 * 派工服务  提供查询处理完成，未审批任务
 * @author cli
 *
 */
public interface FastDispatchedWorkerContract {

	/**
	 * 
	 * 根据id获取快赔信息
	 * @param id
	 * @return
	 */
	public InjuredFastCompensatInfo getDispatchedWorkerInfo(Long id);
	
	/**
	 * 
	 * @param agencyId
	 * @return
	 */
	public List<CompanyAgency> getAgencys(Long companyId);
	
	/**
	 * 获取对应用户  正在审核案件数量
	 * @return
	 */
	public List<FastDispatchedWorkerUserNum> getUserNum(List<Long> userIds);
	
	/**
	 * 更新审核人
	 * @param id
	 * @param userId
	 * @return
	 */
	public int updFastInfoToReviewerId(Long id,Long userId,String userNames,Integer reviewStatus);
	
	/**
	 * 快赔服务派工发送消息
	 * @param fastInfoId
	 */
	public void fastDispatchedWorkerSendMessage(String fastInfoId);
	
}
