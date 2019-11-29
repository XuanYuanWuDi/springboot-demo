package com.injured.server.api.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CeInsuranceItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CeInsuranceItemExample() {
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

        public Criteria andRegistIdIsNull() {
            addCriterion("regist_id is null");
            return (Criteria) this;
        }

        public Criteria andRegistIdIsNotNull() {
            addCriterion("regist_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegistIdEqualTo(Long value) {
            addCriterion("regist_id =", value, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdNotEqualTo(Long value) {
            addCriterion("regist_id <>", value, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdGreaterThan(Long value) {
            addCriterion("regist_id >", value, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdGreaterThanOrEqualTo(Long value) {
            addCriterion("regist_id >=", value, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdLessThan(Long value) {
            addCriterion("regist_id <", value, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdLessThanOrEqualTo(Long value) {
            addCriterion("regist_id <=", value, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdIn(List<Long> values) {
            addCriterion("regist_id in", values, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdNotIn(List<Long> values) {
            addCriterion("regist_id not in", values, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdBetween(Long value1, Long value2) {
            addCriterion("regist_id between", value1, value2, "registId");
            return (Criteria) this;
        }

        public Criteria andRegistIdNotBetween(Long value1, Long value2) {
            addCriterion("regist_id not between", value1, value2, "registId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdIsNull() {
            addCriterion("insurance_id is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdIsNotNull() {
            addCriterion("insurance_id is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdEqualTo(Long value) {
            addCriterion("insurance_id =", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdNotEqualTo(Long value) {
            addCriterion("insurance_id <>", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdGreaterThan(Long value) {
            addCriterion("insurance_id >", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("insurance_id >=", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdLessThan(Long value) {
            addCriterion("insurance_id <", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdLessThanOrEqualTo(Long value) {
            addCriterion("insurance_id <=", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdIn(List<Long> values) {
            addCriterion("insurance_id in", values, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdNotIn(List<Long> values) {
            addCriterion("insurance_id not in", values, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdBetween(Long value1, Long value2) {
            addCriterion("insurance_id between", value1, value2, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdNotBetween(Long value1, Long value2) {
            addCriterion("insurance_id not between", value1, value2, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmoutIsNull() {
            addCriterion("insurance_amout is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmoutIsNotNull() {
            addCriterion("insurance_amout is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmoutEqualTo(BigDecimal value) {
            addCriterion("insurance_amout =", value, "insuranceAmout");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmoutNotEqualTo(BigDecimal value) {
            addCriterion("insurance_amout <>", value, "insuranceAmout");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmoutGreaterThan(BigDecimal value) {
            addCriterion("insurance_amout >", value, "insuranceAmout");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmoutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_amout >=", value, "insuranceAmout");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmoutLessThan(BigDecimal value) {
            addCriterion("insurance_amout <", value, "insuranceAmout");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmoutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_amout <=", value, "insuranceAmout");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmoutIn(List<BigDecimal> values) {
            addCriterion("insurance_amout in", values, "insuranceAmout");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmoutNotIn(List<BigDecimal> values) {
            addCriterion("insurance_amout not in", values, "insuranceAmout");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmoutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_amout between", value1, value2, "insuranceAmout");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmoutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_amout not between", value1, value2, "insuranceAmout");
            return (Criteria) this;
        }

        public Criteria andUnitCountIsNull() {
            addCriterion("unit_count is null");
            return (Criteria) this;
        }

        public Criteria andUnitCountIsNotNull() {
            addCriterion("unit_count is not null");
            return (Criteria) this;
        }

        public Criteria andUnitCountEqualTo(Integer value) {
            addCriterion("unit_count =", value, "unitCount");
            return (Criteria) this;
        }

        public Criteria andUnitCountNotEqualTo(Integer value) {
            addCriterion("unit_count <>", value, "unitCount");
            return (Criteria) this;
        }

        public Criteria andUnitCountGreaterThan(Integer value) {
            addCriterion("unit_count >", value, "unitCount");
            return (Criteria) this;
        }

        public Criteria andUnitCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("unit_count >=", value, "unitCount");
            return (Criteria) this;
        }

        public Criteria andUnitCountLessThan(Integer value) {
            addCriterion("unit_count <", value, "unitCount");
            return (Criteria) this;
        }

        public Criteria andUnitCountLessThanOrEqualTo(Integer value) {
            addCriterion("unit_count <=", value, "unitCount");
            return (Criteria) this;
        }

        public Criteria andUnitCountIn(List<Integer> values) {
            addCriterion("unit_count in", values, "unitCount");
            return (Criteria) this;
        }

        public Criteria andUnitCountNotIn(List<Integer> values) {
            addCriterion("unit_count not in", values, "unitCount");
            return (Criteria) this;
        }

        public Criteria andUnitCountBetween(Integer value1, Integer value2) {
            addCriterion("unit_count between", value1, value2, "unitCount");
            return (Criteria) this;
        }

        public Criteria andUnitCountNotBetween(Integer value1, Integer value2) {
            addCriterion("unit_count not between", value1, value2, "unitCount");
            return (Criteria) this;
        }

        public Criteria andUnitAmountIsNull() {
            addCriterion("unit_amount is null");
            return (Criteria) this;
        }

        public Criteria andUnitAmountIsNotNull() {
            addCriterion("unit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andUnitAmountEqualTo(BigDecimal value) {
            addCriterion("unit_amount =", value, "unitAmount");
            return (Criteria) this;
        }

        public Criteria andUnitAmountNotEqualTo(BigDecimal value) {
            addCriterion("unit_amount <>", value, "unitAmount");
            return (Criteria) this;
        }

        public Criteria andUnitAmountGreaterThan(BigDecimal value) {
            addCriterion("unit_amount >", value, "unitAmount");
            return (Criteria) this;
        }

        public Criteria andUnitAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_amount >=", value, "unitAmount");
            return (Criteria) this;
        }

        public Criteria andUnitAmountLessThan(BigDecimal value) {
            addCriterion("unit_amount <", value, "unitAmount");
            return (Criteria) this;
        }

        public Criteria andUnitAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_amount <=", value, "unitAmount");
            return (Criteria) this;
        }

        public Criteria andUnitAmountIn(List<BigDecimal> values) {
            addCriterion("unit_amount in", values, "unitAmount");
            return (Criteria) this;
        }

        public Criteria andUnitAmountNotIn(List<BigDecimal> values) {
            addCriterion("unit_amount not in", values, "unitAmount");
            return (Criteria) this;
        }

        public Criteria andUnitAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_amount between", value1, value2, "unitAmount");
            return (Criteria) this;
        }

        public Criteria andUnitAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_amount not between", value1, value2, "unitAmount");
            return (Criteria) this;
        }

        public Criteria andNonDeductibleIsNull() {
            addCriterion("non_deductible is null");
            return (Criteria) this;
        }

        public Criteria andNonDeductibleIsNotNull() {
            addCriterion("non_deductible is not null");
            return (Criteria) this;
        }

        public Criteria andNonDeductibleEqualTo(String value) {
            addCriterion("non_deductible =", value, "nonDeductible");
            return (Criteria) this;
        }

        public Criteria andNonDeductibleNotEqualTo(String value) {
            addCriterion("non_deductible <>", value, "nonDeductible");
            return (Criteria) this;
        }

        public Criteria andNonDeductibleGreaterThan(String value) {
            addCriterion("non_deductible >", value, "nonDeductible");
            return (Criteria) this;
        }

        public Criteria andNonDeductibleGreaterThanOrEqualTo(String value) {
            addCriterion("non_deductible >=", value, "nonDeductible");
            return (Criteria) this;
        }

        public Criteria andNonDeductibleLessThan(String value) {
            addCriterion("non_deductible <", value, "nonDeductible");
            return (Criteria) this;
        }

        public Criteria andNonDeductibleLessThanOrEqualTo(String value) {
            addCriterion("non_deductible <=", value, "nonDeductible");
            return (Criteria) this;
        }

        public Criteria andNonDeductibleLike(String value) {
            addCriterion("non_deductible like", value, "nonDeductible");
            return (Criteria) this;
        }

        public Criteria andNonDeductibleNotLike(String value) {
            addCriterion("non_deductible not like", value, "nonDeductible");
            return (Criteria) this;
        }

        public Criteria andNonDeductibleIn(List<String> values) {
            addCriterion("non_deductible in", values, "nonDeductible");
            return (Criteria) this;
        }

        public Criteria andNonDeductibleNotIn(List<String> values) {
            addCriterion("non_deductible not in", values, "nonDeductible");
            return (Criteria) this;
        }

        public Criteria andNonDeductibleBetween(String value1, String value2) {
            addCriterion("non_deductible between", value1, value2, "nonDeductible");
            return (Criteria) this;
        }

        public Criteria andNonDeductibleNotBetween(String value1, String value2) {
            addCriterion("non_deductible not between", value1, value2, "nonDeductible");
            return (Criteria) this;
        }

        public Criteria andDeductibleRateIsNull() {
            addCriterion("deductible_rate is null");
            return (Criteria) this;
        }

        public Criteria andDeductibleRateIsNotNull() {
            addCriterion("deductible_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDeductibleRateEqualTo(BigDecimal value) {
            addCriterion("deductible_rate =", value, "deductibleRate");
            return (Criteria) this;
        }

        public Criteria andDeductibleRateNotEqualTo(BigDecimal value) {
            addCriterion("deductible_rate <>", value, "deductibleRate");
            return (Criteria) this;
        }

        public Criteria andDeductibleRateGreaterThan(BigDecimal value) {
            addCriterion("deductible_rate >", value, "deductibleRate");
            return (Criteria) this;
        }

        public Criteria andDeductibleRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deductible_rate >=", value, "deductibleRate");
            return (Criteria) this;
        }

        public Criteria andDeductibleRateLessThan(BigDecimal value) {
            addCriterion("deductible_rate <", value, "deductibleRate");
            return (Criteria) this;
        }

        public Criteria andDeductibleRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deductible_rate <=", value, "deductibleRate");
            return (Criteria) this;
        }

        public Criteria andDeductibleRateIn(List<BigDecimal> values) {
            addCriterion("deductible_rate in", values, "deductibleRate");
            return (Criteria) this;
        }

        public Criteria andDeductibleRateNotIn(List<BigDecimal> values) {
            addCriterion("deductible_rate not in", values, "deductibleRate");
            return (Criteria) this;
        }

        public Criteria andDeductibleRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deductible_rate between", value1, value2, "deductibleRate");
            return (Criteria) this;
        }

        public Criteria andDeductibleRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deductible_rate not between", value1, value2, "deductibleRate");
            return (Criteria) this;
        }

        public Criteria andDeductibleMoneyIsNull() {
            addCriterion("deductible_money is null");
            return (Criteria) this;
        }

        public Criteria andDeductibleMoneyIsNotNull() {
            addCriterion("deductible_money is not null");
            return (Criteria) this;
        }

        public Criteria andDeductibleMoneyEqualTo(BigDecimal value) {
            addCriterion("deductible_money =", value, "deductibleMoney");
            return (Criteria) this;
        }

        public Criteria andDeductibleMoneyNotEqualTo(BigDecimal value) {
            addCriterion("deductible_money <>", value, "deductibleMoney");
            return (Criteria) this;
        }

        public Criteria andDeductibleMoneyGreaterThan(BigDecimal value) {
            addCriterion("deductible_money >", value, "deductibleMoney");
            return (Criteria) this;
        }

        public Criteria andDeductibleMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deductible_money >=", value, "deductibleMoney");
            return (Criteria) this;
        }

        public Criteria andDeductibleMoneyLessThan(BigDecimal value) {
            addCriterion("deductible_money <", value, "deductibleMoney");
            return (Criteria) this;
        }

        public Criteria andDeductibleMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deductible_money <=", value, "deductibleMoney");
            return (Criteria) this;
        }

        public Criteria andDeductibleMoneyIn(List<BigDecimal> values) {
            addCriterion("deductible_money in", values, "deductibleMoney");
            return (Criteria) this;
        }

        public Criteria andDeductibleMoneyNotIn(List<BigDecimal> values) {
            addCriterion("deductible_money not in", values, "deductibleMoney");
            return (Criteria) this;
        }

        public Criteria andDeductibleMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deductible_money between", value1, value2, "deductibleMoney");
            return (Criteria) this;
        }

        public Criteria andDeductibleMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deductible_money not between", value1, value2, "deductibleMoney");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeIsNull() {
            addCriterion("insurance_fee is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeIsNotNull() {
            addCriterion("insurance_fee is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeEqualTo(BigDecimal value) {
            addCriterion("insurance_fee =", value, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeNotEqualTo(BigDecimal value) {
            addCriterion("insurance_fee <>", value, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeGreaterThan(BigDecimal value) {
            addCriterion("insurance_fee >", value, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_fee >=", value, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeLessThan(BigDecimal value) {
            addCriterion("insurance_fee <", value, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_fee <=", value, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeIn(List<BigDecimal> values) {
            addCriterion("insurance_fee in", values, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeNotIn(List<BigDecimal> values) {
            addCriterion("insurance_fee not in", values, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_fee between", value1, value2, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_fee not between", value1, value2, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andPremiumsIsNull() {
            addCriterion("premiums is null");
            return (Criteria) this;
        }

        public Criteria andPremiumsIsNotNull() {
            addCriterion("premiums is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumsEqualTo(BigDecimal value) {
            addCriterion("premiums =", value, "premiums");
            return (Criteria) this;
        }

        public Criteria andPremiumsNotEqualTo(BigDecimal value) {
            addCriterion("premiums <>", value, "premiums");
            return (Criteria) this;
        }

        public Criteria andPremiumsGreaterThan(BigDecimal value) {
            addCriterion("premiums >", value, "premiums");
            return (Criteria) this;
        }

        public Criteria andPremiumsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("premiums >=", value, "premiums");
            return (Criteria) this;
        }

        public Criteria andPremiumsLessThan(BigDecimal value) {
            addCriterion("premiums <", value, "premiums");
            return (Criteria) this;
        }

        public Criteria andPremiumsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("premiums <=", value, "premiums");
            return (Criteria) this;
        }

        public Criteria andPremiumsIn(List<BigDecimal> values) {
            addCriterion("premiums in", values, "premiums");
            return (Criteria) this;
        }

        public Criteria andPremiumsNotIn(List<BigDecimal> values) {
            addCriterion("premiums not in", values, "premiums");
            return (Criteria) this;
        }

        public Criteria andPremiumsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("premiums between", value1, value2, "premiums");
            return (Criteria) this;
        }

        public Criteria andPremiumsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("premiums not between", value1, value2, "premiums");
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

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Boolean value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Boolean value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Boolean value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Boolean value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Boolean> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Boolean> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andExtIsNull() {
            addCriterion("ext is null");
            return (Criteria) this;
        }

        public Criteria andExtIsNotNull() {
            addCriterion("ext is not null");
            return (Criteria) this;
        }

        public Criteria andExtEqualTo(String value) {
            addCriterion("ext =", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotEqualTo(String value) {
            addCriterion("ext <>", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtGreaterThan(String value) {
            addCriterion("ext >", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtGreaterThanOrEqualTo(String value) {
            addCriterion("ext >=", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLessThan(String value) {
            addCriterion("ext <", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLessThanOrEqualTo(String value) {
            addCriterion("ext <=", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLike(String value) {
            addCriterion("ext like", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotLike(String value) {
            addCriterion("ext not like", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtIn(List<String> values) {
            addCriterion("ext in", values, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotIn(List<String> values) {
            addCriterion("ext not in", values, "ext");
            return (Criteria) this;
        }

        public Criteria andExtBetween(String value1, String value2) {
            addCriterion("ext between", value1, value2, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotBetween(String value1, String value2) {
            addCriterion("ext not between", value1, value2, "ext");
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