package com.injured.server.api.model.query;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FastCompensatInfoId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 快赔定损信息ID
	 */
	private Long id;
	
	/**
	 * 案件ID
	 */
	private Long registId;

}
