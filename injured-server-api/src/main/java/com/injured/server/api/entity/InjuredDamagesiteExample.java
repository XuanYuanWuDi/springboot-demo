package com.injured.server.api.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class InjuredDamagesiteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InjuredDamagesiteExample() {
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

        public Criteria andDictCodeIsNull() {
            addCriterion("dict_code is null");
            return (Criteria) this;
        }

        public Criteria andDictCodeIsNotNull() {
            addCriterion("dict_code is not null");
            return (Criteria) this;
        }

        public Criteria andDictCodeEqualTo(String value) {
            addCriterion("dict_code =", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeNotEqualTo(String value) {
            addCriterion("dict_code <>", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeGreaterThan(String value) {
            addCriterion("dict_code >", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dict_code >=", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeLessThan(String value) {
            addCriterion("dict_code <", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeLessThanOrEqualTo(String value) {
            addCriterion("dict_code <=", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeLike(String value) {
            addCriterion("dict_code like", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeNotLike(String value) {
            addCriterion("dict_code not like", value, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeIn(List<String> values) {
            addCriterion("dict_code in", values, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeNotIn(List<String> values) {
            addCriterion("dict_code not in", values, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeBetween(String value1, String value2) {
            addCriterion("dict_code between", value1, value2, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictCodeNotBetween(String value1, String value2) {
            addCriterion("dict_code not between", value1, value2, "dictCode");
            return (Criteria) this;
        }

        public Criteria andDictNameIsNull() {
            addCriterion("dict_name is null");
            return (Criteria) this;
        }

        public Criteria andDictNameIsNotNull() {
            addCriterion("dict_name is not null");
            return (Criteria) this;
        }

        public Criteria andDictNameEqualTo(String value) {
            addCriterion("dict_name =", value, "dictName");
            return (Criteria) this;
        }

        public Criteria andDictNameNotEqualTo(String value) {
            addCriterion("dict_name <>", value, "dictName");
            return (Criteria) this;
        }

        public Criteria andDictNameGreaterThan(String value) {
            addCriterion("dict_name >", value, "dictName");
            return (Criteria) this;
        }

        public Criteria andDictNameGreaterThanOrEqualTo(String value) {
            addCriterion("dict_name >=", value, "dictName");
            return (Criteria) this;
        }

        public Criteria andDictNameLessThan(String value) {
            addCriterion("dict_name <", value, "dictName");
            return (Criteria) this;
        }

        public Criteria andDictNameLessThanOrEqualTo(String value) {
            addCriterion("dict_name <=", value, "dictName");
            return (Criteria) this;
        }

        public Criteria andDictNameLike(String value) {
            addCriterion("dict_name like", value, "dictName");
            return (Criteria) this;
        }

        public Criteria andDictNameNotLike(String value) {
            addCriterion("dict_name not like", value, "dictName");
            return (Criteria) this;
        }

        public Criteria andDictNameIn(List<String> values) {
            addCriterion("dict_name in", values, "dictName");
            return (Criteria) this;
        }

        public Criteria andDictNameNotIn(List<String> values) {
            addCriterion("dict_name not in", values, "dictName");
            return (Criteria) this;
        }

        public Criteria andDictNameBetween(String value1, String value2) {
            addCriterion("dict_name between", value1, value2, "dictName");
            return (Criteria) this;
        }

        public Criteria andDictNameNotBetween(String value1, String value2) {
            addCriterion("dict_name not between", value1, value2, "dictName");
            return (Criteria) this;
        }

        public Criteria andUntreatedMedicalIsNull() {
            addCriterion("untreated_medical is null");
            return (Criteria) this;
        }

        public Criteria andUntreatedMedicalIsNotNull() {
            addCriterion("untreated_medical is not null");
            return (Criteria) this;
        }

        public Criteria andUntreatedMedicalEqualTo(BigDecimal value) {
            addCriterion("untreated_medical =", value, "untreatedMedical");
            return (Criteria) this;
        }

        public Criteria andUntreatedMedicalNotEqualTo(BigDecimal value) {
            addCriterion("untreated_medical <>", value, "untreatedMedical");
            return (Criteria) this;
        }

        public Criteria andUntreatedMedicalGreaterThan(BigDecimal value) {
            addCriterion("untreated_medical >", value, "untreatedMedical");
            return (Criteria) this;
        }

        public Criteria andUntreatedMedicalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("untreated_medical >=", value, "untreatedMedical");
            return (Criteria) this;
        }

        public Criteria andUntreatedMedicalLessThan(BigDecimal value) {
            addCriterion("untreated_medical <", value, "untreatedMedical");
            return (Criteria) this;
        }

        public Criteria andUntreatedMedicalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("untreated_medical <=", value, "untreatedMedical");
            return (Criteria) this;
        }

        public Criteria andUntreatedMedicalIn(List<BigDecimal> values) {
            addCriterion("untreated_medical in", values, "untreatedMedical");
            return (Criteria) this;
        }

        public Criteria andUntreatedMedicalNotIn(List<BigDecimal> values) {
            addCriterion("untreated_medical not in", values, "untreatedMedical");
            return (Criteria) this;
        }

        public Criteria andUntreatedMedicalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("untreated_medical between", value1, value2, "untreatedMedical");
            return (Criteria) this;
        }

        public Criteria andUntreatedMedicalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("untreated_medical not between", value1, value2, "untreatedMedical");
            return (Criteria) this;
        }

        public Criteria andUntreatedRenewalFeeIsNull() {
            addCriterion("untreated_renewal_fee is null");
            return (Criteria) this;
        }

        public Criteria andUntreatedRenewalFeeIsNotNull() {
            addCriterion("untreated_renewal_fee is not null");
            return (Criteria) this;
        }

        public Criteria andUntreatedRenewalFeeEqualTo(BigDecimal value) {
            addCriterion("untreated_renewal_fee =", value, "untreatedRenewalFee");
            return (Criteria) this;
        }

        public Criteria andUntreatedRenewalFeeNotEqualTo(BigDecimal value) {
            addCriterion("untreated_renewal_fee <>", value, "untreatedRenewalFee");
            return (Criteria) this;
        }

        public Criteria andUntreatedRenewalFeeGreaterThan(BigDecimal value) {
            addCriterion("untreated_renewal_fee >", value, "untreatedRenewalFee");
            return (Criteria) this;
        }

        public Criteria andUntreatedRenewalFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("untreated_renewal_fee >=", value, "untreatedRenewalFee");
            return (Criteria) this;
        }

        public Criteria andUntreatedRenewalFeeLessThan(BigDecimal value) {
            addCriterion("untreated_renewal_fee <", value, "untreatedRenewalFee");
            return (Criteria) this;
        }

        public Criteria andUntreatedRenewalFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("untreated_renewal_fee <=", value, "untreatedRenewalFee");
            return (Criteria) this;
        }

        public Criteria andUntreatedRenewalFeeIn(List<BigDecimal> values) {
            addCriterion("untreated_renewal_fee in", values, "untreatedRenewalFee");
            return (Criteria) this;
        }

        public Criteria andUntreatedRenewalFeeNotIn(List<BigDecimal> values) {
            addCriterion("untreated_renewal_fee not in", values, "untreatedRenewalFee");
            return (Criteria) this;
        }

        public Criteria andUntreatedRenewalFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("untreated_renewal_fee between", value1, value2, "untreatedRenewalFee");
            return (Criteria) this;
        }

        public Criteria andUntreatedRenewalFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("untreated_renewal_fee not between", value1, value2, "untreatedRenewalFee");
            return (Criteria) this;
        }

        public Criteria andRenewalFeeIsNull() {
            addCriterion("renewal_fee is null");
            return (Criteria) this;
        }

        public Criteria andRenewalFeeIsNotNull() {
            addCriterion("renewal_fee is not null");
            return (Criteria) this;
        }

        public Criteria andRenewalFeeEqualTo(BigDecimal value) {
            addCriterion("renewal_fee =", value, "renewalFee");
            return (Criteria) this;
        }

        public Criteria andRenewalFeeNotEqualTo(BigDecimal value) {
            addCriterion("renewal_fee <>", value, "renewalFee");
            return (Criteria) this;
        }

        public Criteria andRenewalFeeGreaterThan(BigDecimal value) {
            addCriterion("renewal_fee >", value, "renewalFee");
            return (Criteria) this;
        }

        public Criteria andRenewalFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("renewal_fee >=", value, "renewalFee");
            return (Criteria) this;
        }

        public Criteria andRenewalFeeLessThan(BigDecimal value) {
            addCriterion("renewal_fee <", value, "renewalFee");
            return (Criteria) this;
        }

        public Criteria andRenewalFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("renewal_fee <=", value, "renewalFee");
            return (Criteria) this;
        }

        public Criteria andRenewalFeeIn(List<BigDecimal> values) {
            addCriterion("renewal_fee in", values, "renewalFee");
            return (Criteria) this;
        }

        public Criteria andRenewalFeeNotIn(List<BigDecimal> values) {
            addCriterion("renewal_fee not in", values, "renewalFee");
            return (Criteria) this;
        }

        public Criteria andRenewalFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("renewal_fee between", value1, value2, "renewalFee");
            return (Criteria) this;
        }

        public Criteria andRenewalFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("renewal_fee not between", value1, value2, "renewalFee");
            return (Criteria) this;
        }

        public Criteria andTrafficDaysIsNull() {
            addCriterion("traffic_days is null");
            return (Criteria) this;
        }

        public Criteria andTrafficDaysIsNotNull() {
            addCriterion("traffic_days is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficDaysEqualTo(BigDecimal value) {
            addCriterion("traffic_days =", value, "trafficDays");
            return (Criteria) this;
        }

        public Criteria andTrafficDaysNotEqualTo(BigDecimal value) {
            addCriterion("traffic_days <>", value, "trafficDays");
            return (Criteria) this;
        }

        public Criteria andTrafficDaysGreaterThan(BigDecimal value) {
            addCriterion("traffic_days >", value, "trafficDays");
            return (Criteria) this;
        }

        public Criteria andTrafficDaysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("traffic_days >=", value, "trafficDays");
            return (Criteria) this;
        }

        public Criteria andTrafficDaysLessThan(BigDecimal value) {
            addCriterion("traffic_days <", value, "trafficDays");
            return (Criteria) this;
        }

        public Criteria andTrafficDaysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("traffic_days <=", value, "trafficDays");
            return (Criteria) this;
        }

        public Criteria andTrafficDaysIn(List<BigDecimal> values) {
            addCriterion("traffic_days in", values, "trafficDays");
            return (Criteria) this;
        }

        public Criteria andTrafficDaysNotIn(List<BigDecimal> values) {
            addCriterion("traffic_days not in", values, "trafficDays");
            return (Criteria) this;
        }

        public Criteria andTrafficDaysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("traffic_days between", value1, value2, "trafficDays");
            return (Criteria) this;
        }

        public Criteria andTrafficDaysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("traffic_days not between", value1, value2, "trafficDays");
            return (Criteria) this;
        }

        public Criteria andIncomeDaysIsNull() {
            addCriterion("income_days is null");
            return (Criteria) this;
        }

        public Criteria andIncomeDaysIsNotNull() {
            addCriterion("income_days is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeDaysEqualTo(BigDecimal value) {
            addCriterion("income_days =", value, "incomeDays");
            return (Criteria) this;
        }

        public Criteria andIncomeDaysNotEqualTo(BigDecimal value) {
            addCriterion("income_days <>", value, "incomeDays");
            return (Criteria) this;
        }

        public Criteria andIncomeDaysGreaterThan(BigDecimal value) {
            addCriterion("income_days >", value, "incomeDays");
            return (Criteria) this;
        }

        public Criteria andIncomeDaysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("income_days >=", value, "incomeDays");
            return (Criteria) this;
        }

        public Criteria andIncomeDaysLessThan(BigDecimal value) {
            addCriterion("income_days <", value, "incomeDays");
            return (Criteria) this;
        }

        public Criteria andIncomeDaysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("income_days <=", value, "incomeDays");
            return (Criteria) this;
        }

        public Criteria andIncomeDaysIn(List<BigDecimal> values) {
            addCriterion("income_days in", values, "incomeDays");
            return (Criteria) this;
        }

        public Criteria andIncomeDaysNotIn(List<BigDecimal> values) {
            addCriterion("income_days not in", values, "incomeDays");
            return (Criteria) this;
        }

        public Criteria andIncomeDaysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("income_days between", value1, value2, "incomeDays");
            return (Criteria) this;
        }

        public Criteria andIncomeDaysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("income_days not between", value1, value2, "incomeDays");
            return (Criteria) this;
        }

        public Criteria andNursingDaysIsNull() {
            addCriterion("nursing_days is null");
            return (Criteria) this;
        }

        public Criteria andNursingDaysIsNotNull() {
            addCriterion("nursing_days is not null");
            return (Criteria) this;
        }

        public Criteria andNursingDaysEqualTo(BigDecimal value) {
            addCriterion("nursing_days =", value, "nursingDays");
            return (Criteria) this;
        }

        public Criteria andNursingDaysNotEqualTo(BigDecimal value) {
            addCriterion("nursing_days <>", value, "nursingDays");
            return (Criteria) this;
        }

        public Criteria andNursingDaysGreaterThan(BigDecimal value) {
            addCriterion("nursing_days >", value, "nursingDays");
            return (Criteria) this;
        }

        public Criteria andNursingDaysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nursing_days >=", value, "nursingDays");
            return (Criteria) this;
        }

        public Criteria andNursingDaysLessThan(BigDecimal value) {
            addCriterion("nursing_days <", value, "nursingDays");
            return (Criteria) this;
        }

        public Criteria andNursingDaysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nursing_days <=", value, "nursingDays");
            return (Criteria) this;
        }

        public Criteria andNursingDaysIn(List<BigDecimal> values) {
            addCriterion("nursing_days in", values, "nursingDays");
            return (Criteria) this;
        }

        public Criteria andNursingDaysNotIn(List<BigDecimal> values) {
            addCriterion("nursing_days not in", values, "nursingDays");
            return (Criteria) this;
        }

        public Criteria andNursingDaysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nursing_days between", value1, value2, "nursingDays");
            return (Criteria) this;
        }

        public Criteria andNursingDaysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nursing_days not between", value1, value2, "nursingDays");
            return (Criteria) this;
        }

        public Criteria andNutritionDaysIsNull() {
            addCriterion("nutrition_days is null");
            return (Criteria) this;
        }

        public Criteria andNutritionDaysIsNotNull() {
            addCriterion("nutrition_days is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionDaysEqualTo(BigDecimal value) {
            addCriterion("nutrition_days =", value, "nutritionDays");
            return (Criteria) this;
        }

        public Criteria andNutritionDaysNotEqualTo(BigDecimal value) {
            addCriterion("nutrition_days <>", value, "nutritionDays");
            return (Criteria) this;
        }

        public Criteria andNutritionDaysGreaterThan(BigDecimal value) {
            addCriterion("nutrition_days >", value, "nutritionDays");
            return (Criteria) this;
        }

        public Criteria andNutritionDaysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_days >=", value, "nutritionDays");
            return (Criteria) this;
        }

        public Criteria andNutritionDaysLessThan(BigDecimal value) {
            addCriterion("nutrition_days <", value, "nutritionDays");
            return (Criteria) this;
        }

        public Criteria andNutritionDaysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_days <=", value, "nutritionDays");
            return (Criteria) this;
        }

        public Criteria andNutritionDaysIn(List<BigDecimal> values) {
            addCriterion("nutrition_days in", values, "nutritionDays");
            return (Criteria) this;
        }

        public Criteria andNutritionDaysNotIn(List<BigDecimal> values) {
            addCriterion("nutrition_days not in", values, "nutritionDays");
            return (Criteria) this;
        }

        public Criteria andNutritionDaysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_days between", value1, value2, "nutritionDays");
            return (Criteria) this;
        }

        public Criteria andNutritionDaysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_days not between", value1, value2, "nutritionDays");
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