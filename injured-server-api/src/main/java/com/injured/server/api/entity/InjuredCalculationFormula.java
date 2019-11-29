package com.injured.server.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class InjuredCalculationFormula implements Serializable {
    private Long id;

    /**
     * 计算公式名称
     */
    private String calculationFormulaName;

    /**
     * 计算公式中文注释
     */
    private String calculationFormulaComment;

    /**
     * 计算公式
     */
    private String calculationFormula;

    /**
     * 计算公式分组编码
     */
    private String calculationFormulaGroupCode;

    /**
     * 1.结果累加  2.是否判断
     */
    private Integer calculationFormulaGroupType;

    /**
     * 是否为最终节点 0否 1是
     */
    private Boolean calculationFormulaFinalNode;

    /**
     * 计算公式分组执行顺序
     */
    private Integer calculationFormulaGroupSort;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 是否删除
     */
    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCalculationFormulaName() {
        return calculationFormulaName;
    }

    public void setCalculationFormulaName(String calculationFormulaName) {
        this.calculationFormulaName = calculationFormulaName;
    }

    public String getCalculationFormulaComment() {
        return calculationFormulaComment;
    }

    public void setCalculationFormulaComment(String calculationFormulaComment) {
        this.calculationFormulaComment = calculationFormulaComment;
    }

    public String getCalculationFormula() {
        return calculationFormula;
    }

    public void setCalculationFormula(String calculationFormula) {
        this.calculationFormula = calculationFormula;
    }

    public String getCalculationFormulaGroupCode() {
        return calculationFormulaGroupCode;
    }

    public void setCalculationFormulaGroupCode(String calculationFormulaGroupCode) {
        this.calculationFormulaGroupCode = calculationFormulaGroupCode;
    }

    public Integer getCalculationFormulaGroupType() {
        return calculationFormulaGroupType;
    }

    public void setCalculationFormulaGroupType(Integer calculationFormulaGroupType) {
        this.calculationFormulaGroupType = calculationFormulaGroupType;
    }

    public Boolean getCalculationFormulaFinalNode() {
        return calculationFormulaFinalNode;
    }

    public void setCalculationFormulaFinalNode(Boolean calculationFormulaFinalNode) {
        this.calculationFormulaFinalNode = calculationFormulaFinalNode;
    }

    public Integer getCalculationFormulaGroupSort() {
        return calculationFormulaGroupSort;
    }

    public void setCalculationFormulaGroupSort(Integer calculationFormulaGroupSort) {
        this.calculationFormulaGroupSort = calculationFormulaGroupSort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }
}