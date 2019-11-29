package com.injured.server.api.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class CeDictionariesType implements Serializable {
    private Long id;

    private String dictionariesType;

    private String typeRemarks;

    private String dictionariesCode;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDictionariesType() {
        return dictionariesType;
    }

    public void setDictionariesType(String dictionariesType) {
        this.dictionariesType = dictionariesType;
    }

    public String getTypeRemarks() {
        return typeRemarks;
    }

    public void setTypeRemarks(String typeRemarks) {
        this.typeRemarks = typeRemarks;
    }

    public String getDictionariesCode() {
        return dictionariesCode;
    }

    public void setDictionariesCode(String dictionariesCode) {
        this.dictionariesCode = dictionariesCode;
    }
}