package com.injured.server.api.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CityExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("pid like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("pid not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andNoIncomeFeeIsNull() {
            addCriterion("no_income_fee is null");
            return (Criteria) this;
        }

        public Criteria andNoIncomeFeeIsNotNull() {
            addCriterion("no_income_fee is not null");
            return (Criteria) this;
        }

        public Criteria andNoIncomeFeeEqualTo(BigDecimal value) {
            addCriterion("no_income_fee =", value, "noIncomeFee");
            return (Criteria) this;
        }

        public Criteria andNoIncomeFeeNotEqualTo(BigDecimal value) {
            addCriterion("no_income_fee <>", value, "noIncomeFee");
            return (Criteria) this;
        }

        public Criteria andNoIncomeFeeGreaterThan(BigDecimal value) {
            addCriterion("no_income_fee >", value, "noIncomeFee");
            return (Criteria) this;
        }

        public Criteria andNoIncomeFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("no_income_fee >=", value, "noIncomeFee");
            return (Criteria) this;
        }

        public Criteria andNoIncomeFeeLessThan(BigDecimal value) {
            addCriterion("no_income_fee <", value, "noIncomeFee");
            return (Criteria) this;
        }

        public Criteria andNoIncomeFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("no_income_fee <=", value, "noIncomeFee");
            return (Criteria) this;
        }

        public Criteria andNoIncomeFeeIn(List<BigDecimal> values) {
            addCriterion("no_income_fee in", values, "noIncomeFee");
            return (Criteria) this;
        }

        public Criteria andNoIncomeFeeNotIn(List<BigDecimal> values) {
            addCriterion("no_income_fee not in", values, "noIncomeFee");
            return (Criteria) this;
        }

        public Criteria andNoIncomeFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("no_income_fee between", value1, value2, "noIncomeFee");
            return (Criteria) this;
        }

        public Criteria andNoIncomeFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("no_income_fee not between", value1, value2, "noIncomeFee");
            return (Criteria) this;
        }

        public Criteria andNoFixedIncomeFeeIsNull() {
            addCriterion("no_fixed_income_fee is null");
            return (Criteria) this;
        }

        public Criteria andNoFixedIncomeFeeIsNotNull() {
            addCriterion("no_fixed_income_fee is not null");
            return (Criteria) this;
        }

        public Criteria andNoFixedIncomeFeeEqualTo(BigDecimal value) {
            addCriterion("no_fixed_income_fee =", value, "noFixedIncomeFee");
            return (Criteria) this;
        }

        public Criteria andNoFixedIncomeFeeNotEqualTo(BigDecimal value) {
            addCriterion("no_fixed_income_fee <>", value, "noFixedIncomeFee");
            return (Criteria) this;
        }

        public Criteria andNoFixedIncomeFeeGreaterThan(BigDecimal value) {
            addCriterion("no_fixed_income_fee >", value, "noFixedIncomeFee");
            return (Criteria) this;
        }

        public Criteria andNoFixedIncomeFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("no_fixed_income_fee >=", value, "noFixedIncomeFee");
            return (Criteria) this;
        }

        public Criteria andNoFixedIncomeFeeLessThan(BigDecimal value) {
            addCriterion("no_fixed_income_fee <", value, "noFixedIncomeFee");
            return (Criteria) this;
        }

        public Criteria andNoFixedIncomeFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("no_fixed_income_fee <=", value, "noFixedIncomeFee");
            return (Criteria) this;
        }

        public Criteria andNoFixedIncomeFeeIn(List<BigDecimal> values) {
            addCriterion("no_fixed_income_fee in", values, "noFixedIncomeFee");
            return (Criteria) this;
        }

        public Criteria andNoFixedIncomeFeeNotIn(List<BigDecimal> values) {
            addCriterion("no_fixed_income_fee not in", values, "noFixedIncomeFee");
            return (Criteria) this;
        }

        public Criteria andNoFixedIncomeFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("no_fixed_income_fee between", value1, value2, "noFixedIncomeFee");
            return (Criteria) this;
        }

        public Criteria andNoFixedIncomeFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("no_fixed_income_fee not between", value1, value2, "noFixedIncomeFee");
            return (Criteria) this;
        }

        public Criteria andFixedIncomeFeeIsNull() {
            addCriterion("fixed_income_fee is null");
            return (Criteria) this;
        }

        public Criteria andFixedIncomeFeeIsNotNull() {
            addCriterion("fixed_income_fee is not null");
            return (Criteria) this;
        }

        public Criteria andFixedIncomeFeeEqualTo(BigDecimal value) {
            addCriterion("fixed_income_fee =", value, "fixedIncomeFee");
            return (Criteria) this;
        }

        public Criteria andFixedIncomeFeeNotEqualTo(BigDecimal value) {
            addCriterion("fixed_income_fee <>", value, "fixedIncomeFee");
            return (Criteria) this;
        }

        public Criteria andFixedIncomeFeeGreaterThan(BigDecimal value) {
            addCriterion("fixed_income_fee >", value, "fixedIncomeFee");
            return (Criteria) this;
        }

        public Criteria andFixedIncomeFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fixed_income_fee >=", value, "fixedIncomeFee");
            return (Criteria) this;
        }

        public Criteria andFixedIncomeFeeLessThan(BigDecimal value) {
            addCriterion("fixed_income_fee <", value, "fixedIncomeFee");
            return (Criteria) this;
        }

        public Criteria andFixedIncomeFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fixed_income_fee <=", value, "fixedIncomeFee");
            return (Criteria) this;
        }

        public Criteria andFixedIncomeFeeIn(List<BigDecimal> values) {
            addCriterion("fixed_income_fee in", values, "fixedIncomeFee");
            return (Criteria) this;
        }

        public Criteria andFixedIncomeFeeNotIn(List<BigDecimal> values) {
            addCriterion("fixed_income_fee not in", values, "fixedIncomeFee");
            return (Criteria) this;
        }

        public Criteria andFixedIncomeFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fixed_income_fee between", value1, value2, "fixedIncomeFee");
            return (Criteria) this;
        }

        public Criteria andFixedIncomeFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fixed_income_fee not between", value1, value2, "fixedIncomeFee");
            return (Criteria) this;
        }

        public Criteria andNursingFeeIsNull() {
            addCriterion("nursing_fee is null");
            return (Criteria) this;
        }

        public Criteria andNursingFeeIsNotNull() {
            addCriterion("nursing_fee is not null");
            return (Criteria) this;
        }

        public Criteria andNursingFeeEqualTo(BigDecimal value) {
            addCriterion("nursing_fee =", value, "nursingFee");
            return (Criteria) this;
        }

        public Criteria andNursingFeeNotEqualTo(BigDecimal value) {
            addCriterion("nursing_fee <>", value, "nursingFee");
            return (Criteria) this;
        }

        public Criteria andNursingFeeGreaterThan(BigDecimal value) {
            addCriterion("nursing_fee >", value, "nursingFee");
            return (Criteria) this;
        }

        public Criteria andNursingFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nursing_fee >=", value, "nursingFee");
            return (Criteria) this;
        }

        public Criteria andNursingFeeLessThan(BigDecimal value) {
            addCriterion("nursing_fee <", value, "nursingFee");
            return (Criteria) this;
        }

        public Criteria andNursingFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nursing_fee <=", value, "nursingFee");
            return (Criteria) this;
        }

        public Criteria andNursingFeeIn(List<BigDecimal> values) {
            addCriterion("nursing_fee in", values, "nursingFee");
            return (Criteria) this;
        }

        public Criteria andNursingFeeNotIn(List<BigDecimal> values) {
            addCriterion("nursing_fee not in", values, "nursingFee");
            return (Criteria) this;
        }

        public Criteria andNursingFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nursing_fee between", value1, value2, "nursingFee");
            return (Criteria) this;
        }

        public Criteria andNursingFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nursing_fee not between", value1, value2, "nursingFee");
            return (Criteria) this;
        }

        public Criteria andNutritionFeeIsNull() {
            addCriterion("nutrition_fee is null");
            return (Criteria) this;
        }

        public Criteria andNutritionFeeIsNotNull() {
            addCriterion("nutrition_fee is not null");
            return (Criteria) this;
        }

        public Criteria andNutritionFeeEqualTo(BigDecimal value) {
            addCriterion("nutrition_fee =", value, "nutritionFee");
            return (Criteria) this;
        }

        public Criteria andNutritionFeeNotEqualTo(BigDecimal value) {
            addCriterion("nutrition_fee <>", value, "nutritionFee");
            return (Criteria) this;
        }

        public Criteria andNutritionFeeGreaterThan(BigDecimal value) {
            addCriterion("nutrition_fee >", value, "nutritionFee");
            return (Criteria) this;
        }

        public Criteria andNutritionFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_fee >=", value, "nutritionFee");
            return (Criteria) this;
        }

        public Criteria andNutritionFeeLessThan(BigDecimal value) {
            addCriterion("nutrition_fee <", value, "nutritionFee");
            return (Criteria) this;
        }

        public Criteria andNutritionFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nutrition_fee <=", value, "nutritionFee");
            return (Criteria) this;
        }

        public Criteria andNutritionFeeIn(List<BigDecimal> values) {
            addCriterion("nutrition_fee in", values, "nutritionFee");
            return (Criteria) this;
        }

        public Criteria andNutritionFeeNotIn(List<BigDecimal> values) {
            addCriterion("nutrition_fee not in", values, "nutritionFee");
            return (Criteria) this;
        }

        public Criteria andNutritionFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_fee between", value1, value2, "nutritionFee");
            return (Criteria) this;
        }

        public Criteria andNutritionFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nutrition_fee not between", value1, value2, "nutritionFee");
            return (Criteria) this;
        }

        public Criteria andTrafficFeeIsNull() {
            addCriterion("traffic_fee is null");
            return (Criteria) this;
        }

        public Criteria andTrafficFeeIsNotNull() {
            addCriterion("traffic_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTrafficFeeEqualTo(BigDecimal value) {
            addCriterion("traffic_fee =", value, "trafficFee");
            return (Criteria) this;
        }

        public Criteria andTrafficFeeNotEqualTo(BigDecimal value) {
            addCriterion("traffic_fee <>", value, "trafficFee");
            return (Criteria) this;
        }

        public Criteria andTrafficFeeGreaterThan(BigDecimal value) {
            addCriterion("traffic_fee >", value, "trafficFee");
            return (Criteria) this;
        }

        public Criteria andTrafficFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("traffic_fee >=", value, "trafficFee");
            return (Criteria) this;
        }

        public Criteria andTrafficFeeLessThan(BigDecimal value) {
            addCriterion("traffic_fee <", value, "trafficFee");
            return (Criteria) this;
        }

        public Criteria andTrafficFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("traffic_fee <=", value, "trafficFee");
            return (Criteria) this;
        }

        public Criteria andTrafficFeeIn(List<BigDecimal> values) {
            addCriterion("traffic_fee in", values, "trafficFee");
            return (Criteria) this;
        }

        public Criteria andTrafficFeeNotIn(List<BigDecimal> values) {
            addCriterion("traffic_fee not in", values, "trafficFee");
            return (Criteria) this;
        }

        public Criteria andTrafficFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("traffic_fee between", value1, value2, "trafficFee");
            return (Criteria) this;
        }

        public Criteria andTrafficFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("traffic_fee not between", value1, value2, "trafficFee");
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