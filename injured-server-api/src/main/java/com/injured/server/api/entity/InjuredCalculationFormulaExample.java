package com.injured.server.api.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InjuredCalculationFormulaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InjuredCalculationFormulaExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaNameIsNull() {
            addCriterion("calculation_formula_name is null");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaNameIsNotNull() {
            addCriterion("calculation_formula_name is not null");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaNameEqualTo(String value) {
            addCriterion("calculation_formula_name =", value, "calculationFormulaName");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaNameNotEqualTo(String value) {
            addCriterion("calculation_formula_name <>", value, "calculationFormulaName");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaNameGreaterThan(String value) {
            addCriterion("calculation_formula_name >", value, "calculationFormulaName");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaNameGreaterThanOrEqualTo(String value) {
            addCriterion("calculation_formula_name >=", value, "calculationFormulaName");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaNameLessThan(String value) {
            addCriterion("calculation_formula_name <", value, "calculationFormulaName");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaNameLessThanOrEqualTo(String value) {
            addCriterion("calculation_formula_name <=", value, "calculationFormulaName");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaNameLike(String value) {
            addCriterion("calculation_formula_name like", value, "calculationFormulaName");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaNameNotLike(String value) {
            addCriterion("calculation_formula_name not like", value, "calculationFormulaName");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaNameIn(List<String> values) {
            addCriterion("calculation_formula_name in", values, "calculationFormulaName");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaNameNotIn(List<String> values) {
            addCriterion("calculation_formula_name not in", values, "calculationFormulaName");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaNameBetween(String value1, String value2) {
            addCriterion("calculation_formula_name between", value1, value2, "calculationFormulaName");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaNameNotBetween(String value1, String value2) {
            addCriterion("calculation_formula_name not between", value1, value2, "calculationFormulaName");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaCommentIsNull() {
            addCriterion("calculation_formula_comment is null");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaCommentIsNotNull() {
            addCriterion("calculation_formula_comment is not null");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaCommentEqualTo(String value) {
            addCriterion("calculation_formula_comment =", value, "calculationFormulaComment");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaCommentNotEqualTo(String value) {
            addCriterion("calculation_formula_comment <>", value, "calculationFormulaComment");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaCommentGreaterThan(String value) {
            addCriterion("calculation_formula_comment >", value, "calculationFormulaComment");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaCommentGreaterThanOrEqualTo(String value) {
            addCriterion("calculation_formula_comment >=", value, "calculationFormulaComment");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaCommentLessThan(String value) {
            addCriterion("calculation_formula_comment <", value, "calculationFormulaComment");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaCommentLessThanOrEqualTo(String value) {
            addCriterion("calculation_formula_comment <=", value, "calculationFormulaComment");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaCommentLike(String value) {
            addCriterion("calculation_formula_comment like", value, "calculationFormulaComment");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaCommentNotLike(String value) {
            addCriterion("calculation_formula_comment not like", value, "calculationFormulaComment");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaCommentIn(List<String> values) {
            addCriterion("calculation_formula_comment in", values, "calculationFormulaComment");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaCommentNotIn(List<String> values) {
            addCriterion("calculation_formula_comment not in", values, "calculationFormulaComment");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaCommentBetween(String value1, String value2) {
            addCriterion("calculation_formula_comment between", value1, value2, "calculationFormulaComment");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaCommentNotBetween(String value1, String value2) {
            addCriterion("calculation_formula_comment not between", value1, value2, "calculationFormulaComment");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaIsNull() {
            addCriterion("calculation_formula is null");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaIsNotNull() {
            addCriterion("calculation_formula is not null");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaEqualTo(String value) {
            addCriterion("calculation_formula =", value, "calculationFormula");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaNotEqualTo(String value) {
            addCriterion("calculation_formula <>", value, "calculationFormula");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGreaterThan(String value) {
            addCriterion("calculation_formula >", value, "calculationFormula");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGreaterThanOrEqualTo(String value) {
            addCriterion("calculation_formula >=", value, "calculationFormula");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaLessThan(String value) {
            addCriterion("calculation_formula <", value, "calculationFormula");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaLessThanOrEqualTo(String value) {
            addCriterion("calculation_formula <=", value, "calculationFormula");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaLike(String value) {
            addCriterion("calculation_formula like", value, "calculationFormula");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaNotLike(String value) {
            addCriterion("calculation_formula not like", value, "calculationFormula");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaIn(List<String> values) {
            addCriterion("calculation_formula in", values, "calculationFormula");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaNotIn(List<String> values) {
            addCriterion("calculation_formula not in", values, "calculationFormula");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaBetween(String value1, String value2) {
            addCriterion("calculation_formula between", value1, value2, "calculationFormula");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaNotBetween(String value1, String value2) {
            addCriterion("calculation_formula not between", value1, value2, "calculationFormula");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupCodeIsNull() {
            addCriterion("calculation_formula_group_code is null");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupCodeIsNotNull() {
            addCriterion("calculation_formula_group_code is not null");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupCodeEqualTo(String value) {
            addCriterion("calculation_formula_group_code =", value, "calculationFormulaGroupCode");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupCodeNotEqualTo(String value) {
            addCriterion("calculation_formula_group_code <>", value, "calculationFormulaGroupCode");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupCodeGreaterThan(String value) {
            addCriterion("calculation_formula_group_code >", value, "calculationFormulaGroupCode");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupCodeGreaterThanOrEqualTo(String value) {
            addCriterion("calculation_formula_group_code >=", value, "calculationFormulaGroupCode");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupCodeLessThan(String value) {
            addCriterion("calculation_formula_group_code <", value, "calculationFormulaGroupCode");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupCodeLessThanOrEqualTo(String value) {
            addCriterion("calculation_formula_group_code <=", value, "calculationFormulaGroupCode");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupCodeLike(String value) {
            addCriterion("calculation_formula_group_code like", value, "calculationFormulaGroupCode");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupCodeNotLike(String value) {
            addCriterion("calculation_formula_group_code not like", value, "calculationFormulaGroupCode");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupCodeIn(List<String> values) {
            addCriterion("calculation_formula_group_code in", values, "calculationFormulaGroupCode");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupCodeNotIn(List<String> values) {
            addCriterion("calculation_formula_group_code not in", values, "calculationFormulaGroupCode");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupCodeBetween(String value1, String value2) {
            addCriterion("calculation_formula_group_code between", value1, value2, "calculationFormulaGroupCode");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupCodeNotBetween(String value1, String value2) {
            addCriterion("calculation_formula_group_code not between", value1, value2, "calculationFormulaGroupCode");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupTypeIsNull() {
            addCriterion("calculation_formula_group_type is null");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupTypeIsNotNull() {
            addCriterion("calculation_formula_group_type is not null");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupTypeEqualTo(Integer value) {
            addCriterion("calculation_formula_group_type =", value, "calculationFormulaGroupType");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupTypeNotEqualTo(Integer value) {
            addCriterion("calculation_formula_group_type <>", value, "calculationFormulaGroupType");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupTypeGreaterThan(Integer value) {
            addCriterion("calculation_formula_group_type >", value, "calculationFormulaGroupType");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("calculation_formula_group_type >=", value, "calculationFormulaGroupType");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupTypeLessThan(Integer value) {
            addCriterion("calculation_formula_group_type <", value, "calculationFormulaGroupType");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupTypeLessThanOrEqualTo(Integer value) {
            addCriterion("calculation_formula_group_type <=", value, "calculationFormulaGroupType");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupTypeIn(List<Integer> values) {
            addCriterion("calculation_formula_group_type in", values, "calculationFormulaGroupType");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupTypeNotIn(List<Integer> values) {
            addCriterion("calculation_formula_group_type not in", values, "calculationFormulaGroupType");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupTypeBetween(Integer value1, Integer value2) {
            addCriterion("calculation_formula_group_type between", value1, value2, "calculationFormulaGroupType");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("calculation_formula_group_type not between", value1, value2, "calculationFormulaGroupType");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaFinalNodeIsNull() {
            addCriterion("calculation_formula_final_node is null");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaFinalNodeIsNotNull() {
            addCriterion("calculation_formula_final_node is not null");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaFinalNodeEqualTo(Boolean value) {
            addCriterion("calculation_formula_final_node =", value, "calculationFormulaFinalNode");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaFinalNodeNotEqualTo(Boolean value) {
            addCriterion("calculation_formula_final_node <>", value, "calculationFormulaFinalNode");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaFinalNodeGreaterThan(Boolean value) {
            addCriterion("calculation_formula_final_node >", value, "calculationFormulaFinalNode");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaFinalNodeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("calculation_formula_final_node >=", value, "calculationFormulaFinalNode");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaFinalNodeLessThan(Boolean value) {
            addCriterion("calculation_formula_final_node <", value, "calculationFormulaFinalNode");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaFinalNodeLessThanOrEqualTo(Boolean value) {
            addCriterion("calculation_formula_final_node <=", value, "calculationFormulaFinalNode");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaFinalNodeIn(List<Boolean> values) {
            addCriterion("calculation_formula_final_node in", values, "calculationFormulaFinalNode");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaFinalNodeNotIn(List<Boolean> values) {
            addCriterion("calculation_formula_final_node not in", values, "calculationFormulaFinalNode");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaFinalNodeBetween(Boolean value1, Boolean value2) {
            addCriterion("calculation_formula_final_node between", value1, value2, "calculationFormulaFinalNode");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaFinalNodeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("calculation_formula_final_node not between", value1, value2, "calculationFormulaFinalNode");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupSortIsNull() {
            addCriterion("calculation_formula_group_sort is null");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupSortIsNotNull() {
            addCriterion("calculation_formula_group_sort is not null");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupSortEqualTo(Integer value) {
            addCriterion("calculation_formula_group_sort =", value, "calculationFormulaGroupSort");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupSortNotEqualTo(Integer value) {
            addCriterion("calculation_formula_group_sort <>", value, "calculationFormulaGroupSort");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupSortGreaterThan(Integer value) {
            addCriterion("calculation_formula_group_sort >", value, "calculationFormulaGroupSort");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("calculation_formula_group_sort >=", value, "calculationFormulaGroupSort");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupSortLessThan(Integer value) {
            addCriterion("calculation_formula_group_sort <", value, "calculationFormulaGroupSort");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupSortLessThanOrEqualTo(Integer value) {
            addCriterion("calculation_formula_group_sort <=", value, "calculationFormulaGroupSort");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupSortIn(List<Integer> values) {
            addCriterion("calculation_formula_group_sort in", values, "calculationFormulaGroupSort");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupSortNotIn(List<Integer> values) {
            addCriterion("calculation_formula_group_sort not in", values, "calculationFormulaGroupSort");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupSortBetween(Integer value1, Integer value2) {
            addCriterion("calculation_formula_group_sort between", value1, value2, "calculationFormulaGroupSort");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGroupSortNotBetween(Integer value1, Integer value2) {
            addCriterion("calculation_formula_group_sort not between", value1, value2, "calculationFormulaGroupSort");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Byte value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Byte value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Byte value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Byte value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Byte value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Byte> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Byte> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Byte value1, Byte value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}