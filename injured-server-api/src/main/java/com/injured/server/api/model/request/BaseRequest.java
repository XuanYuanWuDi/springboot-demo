package com.injured.server.api.model.request;

import com.injured.server.api.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Auther: lzx
 * @Date: 2019/3/7 15:16
 * @Description:请求对象父类
 */
@Getter
@Setter
@ToString
public class BaseRequest extends BaseEntity implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer pageNum;

    private Integer pageSize;

}
