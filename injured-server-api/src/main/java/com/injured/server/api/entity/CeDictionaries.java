package com.injured.server.api.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author  LZX
 */
@Getter
@Setter
@ToString
public class CeDictionaries implements Serializable {
    private Integer id;

    /**
     * 编码
     */
    private String code;

    private String name;

    /**
     * 字典类型
     */
    private String type;

    /**
     * 备注
     */
    private String remarks;

    private Integer typeId;

    /**
     * 是否删除
     */
    private Integer isDelete;

    private Integer parentId;

    private String parentCode;

    private static final long serialVersionUID = 1L;
}