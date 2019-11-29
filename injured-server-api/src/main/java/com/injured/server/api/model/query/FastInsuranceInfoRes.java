package com.injured.server.api.model.query;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * 保单信息
 * @author cli
 *
 */
@Getter
@Setter
public class FastInsuranceInfoRes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 商业险
	 */
	private CeInsuranceInfoDetail commercialInsurance;
	
	/**
	 * 交强险
	 */
	private CeInsuranceInfoDetail compulsoryInsurance;

}
