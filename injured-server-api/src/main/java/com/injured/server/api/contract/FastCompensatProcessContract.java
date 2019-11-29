package com.injured.server.api.contract;

import com.injured.commons.PageBean;
import com.injured.server.api.model.query.FastCompensatQuery;
import com.injured.server.api.model.query.FastCompensatQueryRes;
import com.injured.server.api.model.query.FastCompensatRegistRes;
import com.injured.server.api.model.query.FastCompensatfoldTransfer;
import com.injured.server.api.model.query.FastInsuranceInfoRes;
import com.injured.server.api.model.query.InjuredFastCompensatInfoDetail;

/**
 * 
 * @author cli
 *
 */
public interface FastCompensatProcessContract {

	/**
	 * 快赔定损列表
	 * @param fastCompensatQuery
	 * @return
	 */
	public PageBean<FastCompensatQueryRes> queryFastCompensats(FastCompensatQuery fastCompensatQuery);
	
	/**
	 * 修改状态
	 * @param fastCompensatId
	 * @param status
	 * @return
	 */
	public int updateFastCompensatStatus(Long fastCompensatId,Integer status);
	
	/**
	 * 获取快赔定损详情
	 * @param id
	 * @return
	 */
	public InjuredFastCompensatInfoDetail getFastCompensatInfoDetail(Long id);
	
	/**
	 * 获取快赔案件查勘信息
	 * @param registId
	 * @return
	 */
	public FastCompensatRegistRes getRegistSurvey(Long registId);
	
	/**
	 * 获取快赔保单信息
	 * @param registId
	 * @return
	 */
	public FastInsuranceInfoRes getInsuranceInfo(Long registId);
	
	/**
	 * 保存快赔定损信息
	 * @param injuredFastCompensatInfoDetail
	 * @return
	 */
	public int saveFastCompensat(InjuredFastCompensatInfoDetail injuredFastCompensatInfoDetail);
	
	/**
	 * 更新快赔定损信息
	 * @param injuredFastCompensatInfoDetail
	 * @return
	 */
	public int submitFastCompensat(InjuredFastCompensatInfoDetail injuredFastCompensatInfoDetail);
	
	/**
	 * 快赔定损转派
	 * @param fastCompensatfoldTransfer
	 * @return
	 */
	public int fastCompensatTransfer(FastCompensatfoldTransfer fastCompensatfoldTransfer);
}
