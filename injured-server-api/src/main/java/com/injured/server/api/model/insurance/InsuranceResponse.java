package com.injured.server.api.model.insurance;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @author cli
 *
 */
@Getter
@Setter
@ToString
public class InsuranceResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 商业险
	 */
	private CommercialInsuranceResponse commercialInsuranceResponse;
	
	/**
	 * 交强险
	 */
	private CompulsoryInsuranceResponse compulsoryInsuranceResponse;

}
