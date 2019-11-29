package com.injured.server.api.model.query;

import java.io.Serializable;
import com.injured.server.api.annotations.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 转派参数
 * @author cli
 *
 */
@Getter
@Setter
@ToString
public class FastCompensatfoldTransfer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 快赔定损id
	 */
	@NotNull(groups = { "fastTransfer" })
	private Long id;
	
	/**
	 * 定损人名称
	 */
	@NotNull(groups = { "fastTransfer" })
	private String damageName;
	
	/**
	 * 定损人工号
	 */
	@NotNull(groups = { "fastTransfer" })
	private String damageNo;
	
	
	/**
	 * 定损人电话
	 */
	private String damagePhone;

}
