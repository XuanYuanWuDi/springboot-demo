package com.injured.server.api.entity;

import java.util.ArrayList;
import java.util.List;

public class CeDictionariesTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CeDictionariesTypeExample() {
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

        public Criteria andDictionariesTypeIsNull() {
            addCriterion("dictionaries_type is null");
            return (Criteria) this;
        }

        public Criteria andDictionariesTypeIsNotNull() {
            addCriterion("dictionaries_type is not null");
            return (Criteria) this;
        }

        public Criteria andDictionariesTypeEqualTo(String value) {
            addCriterion("dictionaries_type =", value, "dictionariesType");
            return (Criteria) this;
        }

        public Criteria andDictionariesTypeNotEqualTo(String value) {
            addCriterion("dictionaries_type <>", value, "dictionariesType");
            return (Criteria) this;
        }

        public Criteria andDictionariesTypeGreaterThan(String value) {
            addCriterion("dictionaries_type >", value, "dictionariesType");
            return (Criteria) this;
        }

        public Criteria andDictionariesTypeGreaterThanOrEqualTo(String value) {
            addCriterion("dictionaries_type >=", value, "dictionariesType");
            return (Criteria) this;
        }

        public Criteria andDictionariesTypeLessThan(String value) {
            addCriterion("dictionaries_type <", value, "dictionariesType");
            return (Criteria) this;
        }

        public Criteria andDictionariesTypeLessThanOrEqualTo(String value) {
            addCriterion("dictionaries_type <=", value, "dictionariesType");
            return (Criteria) this;
        }

        public Criteria andDictionariesTypeLike(String value) {
            addCriterion("dictionaries_type like", value, "dictionariesType");
            return (Criteria) this;
        }

        public Criteria andDictionariesTypeNotLike(String value) {
            addCriterion("dictionaries_type not like", value, "dictionariesType");
            return (Criteria) this;
        }

        public Criteria andDictionariesTypeIn(List<String> values) {
            addCriterion("dictionaries_type in", values, "dictionariesType");
            return (Criteria) this;
        }

        public Criteria andDictionariesTypeNotIn(List<String> values) {
            addCriterion("dictionaries_type not in", values, "dictionariesType");
            return (Criteria) this;
        }

        public Criteria andDictionariesTypeBetween(String value1, String value2) {
            addCriterion("dictionaries_type between", value1, value2, "dictionariesType");
            return (Criteria) this;
        }

        public Criteria andDictionariesTypeNotBetween(String value1, String value2) {
            addCriterion("dictionaries_type not between", value1, value2, "dictionariesType");
            return (Criteria) this;
        }

        public Criteria andTypeRemarksIsNull() {
            addCriterion("type_remarks is null");
            return (Criteria) this;
        }

        public Criteria andTypeRemarksIsNotNull() {
            addCriterion("type_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andTypeRemarksEqualTo(String value) {
            addCriterion("type_remarks =", value, "typeRemarks");
            return (Criteria) this;
        }

        public Criteria andTypeRemarksNotEqualTo(String value) {
            addCriterion("type_remarks <>", value, "typeRemarks");
            return (Criteria) this;
        }

        public Criteria andTypeRemarksGreaterThan(String value) {
            addCriterion("type_remarks >", value, "typeRemarks");
            return (Criteria) this;
        }

        public Criteria andTypeRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("type_remarks >=", value, "typeRemarks");
            return (Criteria) this;
        }

        public Criteria andTypeRemarksLessThan(String value) {
            addCriterion("type_remarks <", value, "typeRemarks");
            return (Criteria) this;
        }

        public Criteria andTypeRemarksLessThanOrEqualTo(String value) {
            addCriterion("type_remarks <=", value, "typeRemarks");
            return (Criteria) this;
        }

        public Criteria andTypeRemarksLike(String value) {
            addCriterion("type_remarks like", value, "typeRemarks");
            return (Criteria) this;
        }

        public Criteria andTypeRemarksNotLike(String value) {
            addCriterion("type_remarks not like", value, "typeRemarks");
            return (Criteria) this;
        }

        public Criteria andTypeRemarksIn(List<String> values) {
            addCriterion("type_remarks in", values, "typeRemarks");
            return (Criteria) this;
        }

        public Criteria andTypeRemarksNotIn(List<String> values) {
            addCriterion("type_remarks not in", values, "typeRemarks");
            return (Criteria) this;
        }

        public Criteria andTypeRemarksBetween(String value1, String value2) {
            addCriterion("type_remarks between", value1, value2, "typeRemarks");
            return (Criteria) this;
        }

        public Criteria andTypeRemarksNotBetween(String value1, String value2) {
            addCriterion("type_remarks not between", value1, value2, "typeRemarks");
            return (Criteria) this;
        }

        public Criteria andDictionariesCodeIsNull() {
            addCriterion("dictionaries_code is null");
            return (Criteria) this;
        }

        public Criteria andDictionariesCodeIsNotNull() {
            addCriterion("dictionaries_code is not null");
            return (Criteria) this;
        }

        public Criteria andDictionariesCodeEqualTo(String value) {
            addCriterion("dictionaries_code =", value, "dictionariesCode");
            return (Criteria) this;
        }

        public Criteria andDictionariesCodeNotEqualTo(String value) {
            addCriterion("dictionaries_code <>", value, "dictionariesCode");
            return (Criteria) this;
        }

        public Criteria andDictionariesCodeGreaterThan(String value) {
            addCriterion("dictionaries_code >", value, "dictionariesCode");
            return (Criteria) this;
        }

        public Criteria andDictionariesCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dictionaries_code >=", value, "dictionariesCode");
            return (Criteria) this;
        }

        public Criteria andDictionariesCodeLessThan(String value) {
            addCriterion("dictionaries_code <", value, "dictionariesCode");
            return (Criteria) this;
        }

        public Criteria andDictionariesCodeLessThanOrEqualTo(String value) {
            addCriterion("dictionaries_code <=", value, "dictionariesCode");
            return (Criteria) this;
        }

        public Criteria andDictionariesCodeLike(String value) {
            addCriterion("dictionaries_code like", value, "dictionariesCode");
            return (Criteria) this;
        }

        public Criteria andDictionariesCodeNotLike(String value) {
            addCriterion("dictionaries_code not like", value, "dictionariesCode");
            return (Criteria) this;
        }

        public Criteria andDictionariesCodeIn(List<String> values) {
            addCriterion("dictionaries_code in", values, "dictionariesCode");
            return (Criteria) this;
        }

        public Criteria andDictionariesCodeNotIn(List<String> values) {
            addCriterion("dictionaries_code not in", values, "dictionariesCode");
            return (Criteria) this;
        }

        public Criteria andDictionariesCodeBetween(String value1, String value2) {
            addCriterion("dictionaries_code between", value1, value2, "dictionariesCode");
            return (Criteria) this;
        }

        public Criteria andDictionariesCodeNotBetween(String value1, String value2) {
            addCriterion("dictionaries_code not between", value1, value2, "dictionariesCode");
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