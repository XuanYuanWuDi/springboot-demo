package com.injured.server.api.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CeInsuranceDangerHistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CeInsuranceDangerHistExample() {
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNull() {
            addCriterion("company_code is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNotNull() {
            addCriterion("company_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeEqualTo(String value) {
            addCriterion("company_code =", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotEqualTo(String value) {
            addCriterion("company_code <>", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThan(String value) {
            addCriterion("company_code >", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("company_code >=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThan(String value) {
            addCriterion("company_code <", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("company_code <=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLike(String value) {
            addCriterion("company_code like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotLike(String value) {
            addCriterion("company_code not like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIn(List<String> values) {
            addCriterion("company_code in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotIn(List<String> values) {
            addCriterion("company_code not in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeBetween(String value1, String value2) {
            addCriterion("company_code between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("company_code not between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andPolicyNoIsNull() {
            addCriterion("policy_no is null");
            return (Criteria) this;
        }

        public Criteria andPolicyNoIsNotNull() {
            addCriterion("policy_no is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyNoEqualTo(String value) {
            addCriterion("policy_no =", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoNotEqualTo(String value) {
            addCriterion("policy_no <>", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoGreaterThan(String value) {
            addCriterion("policy_no >", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoGreaterThanOrEqualTo(String value) {
            addCriterion("policy_no >=", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoLessThan(String value) {
            addCriterion("policy_no <", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoLessThanOrEqualTo(String value) {
            addCriterion("policy_no <=", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoLike(String value) {
            addCriterion("policy_no like", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoNotLike(String value) {
            addCriterion("policy_no not like", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoIn(List<String> values) {
            addCriterion("policy_no in", values, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoNotIn(List<String> values) {
            addCriterion("policy_no not in", values, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoBetween(String value1, String value2) {
            addCriterion("policy_no between", value1, value2, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoNotBetween(String value1, String value2) {
            addCriterion("policy_no not between", value1, value2, "policyNo");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryIsNull() {
            addCriterion("insurance_category is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryIsNotNull() {
            addCriterion("insurance_category is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryEqualTo(String value) {
            addCriterion("insurance_category =", value, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryNotEqualTo(String value) {
            addCriterion("insurance_category <>", value, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryGreaterThan(String value) {
            addCriterion("insurance_category >", value, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_category >=", value, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryLessThan(String value) {
            addCriterion("insurance_category <", value, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryLessThanOrEqualTo(String value) {
            addCriterion("insurance_category <=", value, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryLike(String value) {
            addCriterion("insurance_category like", value, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryNotLike(String value) {
            addCriterion("insurance_category not like", value, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryIn(List<String> values) {
            addCriterion("insurance_category in", values, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryNotIn(List<String> values) {
            addCriterion("insurance_category not in", values, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryBetween(String value1, String value2) {
            addCriterion("insurance_category between", value1, value2, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryNotBetween(String value1, String value2) {
            addCriterion("insurance_category not between", value1, value2, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andPaidTimesIsNull() {
            addCriterion("paid_times is null");
            return (Criteria) this;
        }

        public Criteria andPaidTimesIsNotNull() {
            addCriterion("paid_times is not null");
            return (Criteria) this;
        }

        public Criteria andPaidTimesEqualTo(Integer value) {
            addCriterion("paid_times =", value, "paidTimes");
            return (Criteria) this;
        }

        public Criteria andPaidTimesNotEqualTo(Integer value) {
            addCriterion("paid_times <>", value, "paidTimes");
            return (Criteria) this;
        }

        public Criteria andPaidTimesGreaterThan(Integer value) {
            addCriterion("paid_times >", value, "paidTimes");
            return (Criteria) this;
        }

        public Criteria andPaidTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("paid_times >=", value, "paidTimes");
            return (Criteria) this;
        }

        public Criteria andPaidTimesLessThan(Integer value) {
            addCriterion("paid_times <", value, "paidTimes");
            return (Criteria) this;
        }

        public Criteria andPaidTimesLessThanOrEqualTo(Integer value) {
            addCriterion("paid_times <=", value, "paidTimes");
            return (Criteria) this;
        }

        public Criteria andPaidTimesIn(List<Integer> values) {
            addCriterion("paid_times in", values, "paidTimes");
            return (Criteria) this;
        }

        public Criteria andPaidTimesNotIn(List<Integer> values) {
            addCriterion("paid_times not in", values, "paidTimes");
            return (Criteria) this;
        }

        public Criteria andPaidTimesBetween(Integer value1, Integer value2) {
            addCriterion("paid_times between", value1, value2, "paidTimes");
            return (Criteria) this;
        }

        public Criteria andPaidTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("paid_times not between", value1, value2, "paidTimes");
            return (Criteria) this;
        }

        public Criteria andPayClaimNumberIsNull() {
            addCriterion("pay_claim_number is null");
            return (Criteria) this;
        }

        public Criteria andPayClaimNumberIsNotNull() {
            addCriterion("pay_claim_number is not null");
            return (Criteria) this;
        }

        public Criteria andPayClaimNumberEqualTo(String value) {
            addCriterion("pay_claim_number =", value, "payClaimNumber");
            return (Criteria) this;
        }

        public Criteria andPayClaimNumberNotEqualTo(String value) {
            addCriterion("pay_claim_number <>", value, "payClaimNumber");
            return (Criteria) this;
        }

        public Criteria andPayClaimNumberGreaterThan(String value) {
            addCriterion("pay_claim_number >", value, "payClaimNumber");
            return (Criteria) this;
        }

        public Criteria andPayClaimNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pay_claim_number >=", value, "payClaimNumber");
            return (Criteria) this;
        }

        public Criteria andPayClaimNumberLessThan(String value) {
            addCriterion("pay_claim_number <", value, "payClaimNumber");
            return (Criteria) this;
        }

        public Criteria andPayClaimNumberLessThanOrEqualTo(String value) {
            addCriterion("pay_claim_number <=", value, "payClaimNumber");
            return (Criteria) this;
        }

        public Criteria andPayClaimNumberLike(String value) {
            addCriterion("pay_claim_number like", value, "payClaimNumber");
            return (Criteria) this;
        }

        public Criteria andPayClaimNumberNotLike(String value) {
            addCriterion("pay_claim_number not like", value, "payClaimNumber");
            return (Criteria) this;
        }

        public Criteria andPayClaimNumberIn(List<String> values) {
            addCriterion("pay_claim_number in", values, "payClaimNumber");
            return (Criteria) this;
        }

        public Criteria andPayClaimNumberNotIn(List<String> values) {
            addCriterion("pay_claim_number not in", values, "payClaimNumber");
            return (Criteria) this;
        }

        public Criteria andPayClaimNumberBetween(String value1, String value2) {
            addCriterion("pay_claim_number between", value1, value2, "payClaimNumber");
            return (Criteria) this;
        }

        public Criteria andPayClaimNumberNotBetween(String value1, String value2) {
            addCriterion("pay_claim_number not between", value1, value2, "payClaimNumber");
            return (Criteria) this;
        }

        public Criteria andClaimEndDateIsNull() {
            addCriterion("claim_end_date is null");
            return (Criteria) this;
        }

        public Criteria andClaimEndDateIsNotNull() {
            addCriterion("claim_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andClaimEndDateEqualTo(Date value) {
            addCriterion("claim_end_date =", value, "claimEndDate");
            return (Criteria) this;
        }

        public Criteria andClaimEndDateNotEqualTo(Date value) {
            addCriterion("claim_end_date <>", value, "claimEndDate");
            return (Criteria) this;
        }

        public Criteria andClaimEndDateGreaterThan(Date value) {
            addCriterion("claim_end_date >", value, "claimEndDate");
            return (Criteria) this;
        }

        public Criteria andClaimEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("claim_end_date >=", value, "claimEndDate");
            return (Criteria) this;
        }

        public Criteria andClaimEndDateLessThan(Date value) {
            addCriterion("claim_end_date <", value, "claimEndDate");
            return (Criteria) this;
        }

        public Criteria andClaimEndDateLessThanOrEqualTo(Date value) {
            addCriterion("claim_end_date <=", value, "claimEndDate");
            return (Criteria) this;
        }

        public Criteria andClaimEndDateIn(List<Date> values) {
            addCriterion("claim_end_date in", values, "claimEndDate");
            return (Criteria) this;
        }

        public Criteria andClaimEndDateNotIn(List<Date> values) {
            addCriterion("claim_end_date not in", values, "claimEndDate");
            return (Criteria) this;
        }

        public Criteria andClaimEndDateBetween(Date value1, Date value2) {
            addCriterion("claim_end_date between", value1, value2, "claimEndDate");
            return (Criteria) this;
        }

        public Criteria andClaimEndDateNotBetween(Date value1, Date value2) {
            addCriterion("claim_end_date not between", value1, value2, "claimEndDate");
            return (Criteria) this;
        }

        public Criteria andClaimResultIsNull() {
            addCriterion("claim_result is null");
            return (Criteria) this;
        }

        public Criteria andClaimResultIsNotNull() {
            addCriterion("claim_result is not null");
            return (Criteria) this;
        }

        public Criteria andClaimResultEqualTo(Byte value) {
            addCriterion("claim_result =", value, "claimResult");
            return (Criteria) this;
        }

        public Criteria andClaimResultNotEqualTo(Byte value) {
            addCriterion("claim_result <>", value, "claimResult");
            return (Criteria) this;
        }

        public Criteria andClaimResultGreaterThan(Byte value) {
            addCriterion("claim_result >", value, "claimResult");
            return (Criteria) this;
        }

        public Criteria andClaimResultGreaterThanOrEqualTo(Byte value) {
            addCriterion("claim_result >=", value, "claimResult");
            return (Criteria) this;
        }

        public Criteria andClaimResultLessThan(Byte value) {
            addCriterion("claim_result <", value, "claimResult");
            return (Criteria) this;
        }

        public Criteria andClaimResultLessThanOrEqualTo(Byte value) {
            addCriterion("claim_result <=", value, "claimResult");
            return (Criteria) this;
        }

        public Criteria andClaimResultIn(List<Byte> values) {
            addCriterion("claim_result in", values, "claimResult");
            return (Criteria) this;
        }

        public Criteria andClaimResultNotIn(List<Byte> values) {
            addCriterion("claim_result not in", values, "claimResult");
            return (Criteria) this;
        }

        public Criteria andClaimResultBetween(Byte value1, Byte value2) {
            addCriterion("claim_result between", value1, value2, "claimResult");
            return (Criteria) this;
        }

        public Criteria andClaimResultNotBetween(Byte value1, Byte value2) {
            addCriterion("claim_result not between", value1, value2, "claimResult");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNull() {
            addCriterion("driver_name is null");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNotNull() {
            addCriterion("driver_name is not null");
            return (Criteria) this;
        }

        public Criteria andDriverNameEqualTo(String value) {
            addCriterion("driver_name =", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotEqualTo(String value) {
            addCriterion("driver_name <>", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThan(String value) {
            addCriterion("driver_name >", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThanOrEqualTo(String value) {
            addCriterion("driver_name >=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThan(String value) {
            addCriterion("driver_name <", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThanOrEqualTo(String value) {
            addCriterion("driver_name <=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLike(String value) {
            addCriterion("driver_name like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotLike(String value) {
            addCriterion("driver_name not like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameIn(List<String> values) {
            addCriterion("driver_name in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotIn(List<String> values) {
            addCriterion("driver_name not in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameBetween(String value1, String value2) {
            addCriterion("driver_name between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotBetween(String value1, String value2) {
            addCriterion("driver_name not between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andEstimateAmountIsNull() {
            addCriterion("estimate_amount is null");
            return (Criteria) this;
        }

        public Criteria andEstimateAmountIsNotNull() {
            addCriterion("estimate_amount is not null");
            return (Criteria) this;
        }

        public Criteria andEstimateAmountEqualTo(BigDecimal value) {
            addCriterion("estimate_amount =", value, "estimateAmount");
            return (Criteria) this;
        }

        public Criteria andEstimateAmountNotEqualTo(BigDecimal value) {
            addCriterion("estimate_amount <>", value, "estimateAmount");
            return (Criteria) this;
        }

        public Criteria andEstimateAmountGreaterThan(BigDecimal value) {
            addCriterion("estimate_amount >", value, "estimateAmount");
            return (Criteria) this;
        }

        public Criteria andEstimateAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("estimate_amount >=", value, "estimateAmount");
            return (Criteria) this;
        }

        public Criteria andEstimateAmountLessThan(BigDecimal value) {
            addCriterion("estimate_amount <", value, "estimateAmount");
            return (Criteria) this;
        }

        public Criteria andEstimateAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("estimate_amount <=", value, "estimateAmount");
            return (Criteria) this;
        }

        public Criteria andEstimateAmountIn(List<BigDecimal> values) {
            addCriterion("estimate_amount in", values, "estimateAmount");
            return (Criteria) this;
        }

        public Criteria andEstimateAmountNotIn(List<BigDecimal> values) {
            addCriterion("estimate_amount not in", values, "estimateAmount");
            return (Criteria) this;
        }

        public Criteria andEstimateAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("estimate_amount between", value1, value2, "estimateAmount");
            return (Criteria) this;
        }

        public Criteria andEstimateAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("estimate_amount not between", value1, value2, "estimateAmount");
            return (Criteria) this;
        }

        public Criteria andClaimDateIsNull() {
            addCriterion("claim_date is null");
            return (Criteria) this;
        }

        public Criteria andClaimDateIsNotNull() {
            addCriterion("claim_date is not null");
            return (Criteria) this;
        }

        public Criteria andClaimDateEqualTo(Date value) {
            addCriterion("claim_date =", value, "claimDate");
            return (Criteria) this;
        }

        public Criteria andClaimDateNotEqualTo(Date value) {
            addCriterion("claim_date <>", value, "claimDate");
            return (Criteria) this;
        }

        public Criteria andClaimDateGreaterThan(Date value) {
            addCriterion("claim_date >", value, "claimDate");
            return (Criteria) this;
        }

        public Criteria andClaimDateGreaterThanOrEqualTo(Date value) {
            addCriterion("claim_date >=", value, "claimDate");
            return (Criteria) this;
        }

        public Criteria andClaimDateLessThan(Date value) {
            addCriterion("claim_date <", value, "claimDate");
            return (Criteria) this;
        }

        public Criteria andClaimDateLessThanOrEqualTo(Date value) {
            addCriterion("claim_date <=", value, "claimDate");
            return (Criteria) this;
        }

        public Criteria andClaimDateIn(List<Date> values) {
            addCriterion("claim_date in", values, "claimDate");
            return (Criteria) this;
        }

        public Criteria andClaimDateNotIn(List<Date> values) {
            addCriterion("claim_date not in", values, "claimDate");
            return (Criteria) this;
        }

        public Criteria andClaimDateBetween(Date value1, Date value2) {
            addCriterion("claim_date between", value1, value2, "claimDate");
            return (Criteria) this;
        }

        public Criteria andClaimDateNotBetween(Date value1, Date value2) {
            addCriterion("claim_date not between", value1, value2, "claimDate");
            return (Criteria) this;
        }

        public Criteria andEventAddressIsNull() {
            addCriterion("event_address is null");
            return (Criteria) this;
        }

        public Criteria andEventAddressIsNotNull() {
            addCriterion("event_address is not null");
            return (Criteria) this;
        }

        public Criteria andEventAddressEqualTo(String value) {
            addCriterion("event_address =", value, "eventAddress");
            return (Criteria) this;
        }

        public Criteria andEventAddressNotEqualTo(String value) {
            addCriterion("event_address <>", value, "eventAddress");
            return (Criteria) this;
        }

        public Criteria andEventAddressGreaterThan(String value) {
            addCriterion("event_address >", value, "eventAddress");
            return (Criteria) this;
        }

        public Criteria andEventAddressGreaterThanOrEqualTo(String value) {
            addCriterion("event_address >=", value, "eventAddress");
            return (Criteria) this;
        }

        public Criteria andEventAddressLessThan(String value) {
            addCriterion("event_address <", value, "eventAddress");
            return (Criteria) this;
        }

        public Criteria andEventAddressLessThanOrEqualTo(String value) {
            addCriterion("event_address <=", value, "eventAddress");
            return (Criteria) this;
        }

        public Criteria andEventAddressLike(String value) {
            addCriterion("event_address like", value, "eventAddress");
            return (Criteria) this;
        }

        public Criteria andEventAddressNotLike(String value) {
            addCriterion("event_address not like", value, "eventAddress");
            return (Criteria) this;
        }

        public Criteria andEventAddressIn(List<String> values) {
            addCriterion("event_address in", values, "eventAddress");
            return (Criteria) this;
        }

        public Criteria andEventAddressNotIn(List<String> values) {
            addCriterion("event_address not in", values, "eventAddress");
            return (Criteria) this;
        }

        public Criteria andEventAddressBetween(String value1, String value2) {
            addCriterion("event_address between", value1, value2, "eventAddress");
            return (Criteria) this;
        }

        public Criteria andEventAddressNotBetween(String value1, String value2) {
            addCriterion("event_address not between", value1, value2, "eventAddress");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoIsNull() {
            addCriterion("license_plate_no is null");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoIsNotNull() {
            addCriterion("license_plate_no is not null");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoEqualTo(String value) {
            addCriterion("license_plate_no =", value, "licensePlateNo");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoNotEqualTo(String value) {
            addCriterion("license_plate_no <>", value, "licensePlateNo");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoGreaterThan(String value) {
            addCriterion("license_plate_no >", value, "licensePlateNo");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoGreaterThanOrEqualTo(String value) {
            addCriterion("license_plate_no >=", value, "licensePlateNo");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoLessThan(String value) {
            addCriterion("license_plate_no <", value, "licensePlateNo");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoLessThanOrEqualTo(String value) {
            addCriterion("license_plate_no <=", value, "licensePlateNo");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoLike(String value) {
            addCriterion("license_plate_no like", value, "licensePlateNo");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoNotLike(String value) {
            addCriterion("license_plate_no not like", value, "licensePlateNo");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoIn(List<String> values) {
            addCriterion("license_plate_no in", values, "licensePlateNo");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoNotIn(List<String> values) {
            addCriterion("license_plate_no not in", values, "licensePlateNo");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoBetween(String value1, String value2) {
            addCriterion("license_plate_no between", value1, value2, "licensePlateNo");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoNotBetween(String value1, String value2) {
            addCriterion("license_plate_no not between", value1, value2, "licensePlateNo");
            return (Criteria) this;
        }

        public Criteria andReportDateIsNull() {
            addCriterion("report_date is null");
            return (Criteria) this;
        }

        public Criteria andReportDateIsNotNull() {
            addCriterion("report_date is not null");
            return (Criteria) this;
        }

        public Criteria andReportDateEqualTo(Date value) {
            addCriterion("report_date =", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotEqualTo(Date value) {
            addCriterion("report_date <>", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThan(Date value) {
            addCriterion("report_date >", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThanOrEqualTo(Date value) {
            addCriterion("report_date >=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThan(Date value) {
            addCriterion("report_date <", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThanOrEqualTo(Date value) {
            addCriterion("report_date <=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateIn(List<Date> values) {
            addCriterion("report_date in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotIn(List<Date> values) {
            addCriterion("report_date not in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateBetween(Date value1, Date value2) {
            addCriterion("report_date between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotBetween(Date value1, Date value2) {
            addCriterion("report_date not between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReporterTelIsNull() {
            addCriterion("reporter_tel is null");
            return (Criteria) this;
        }

        public Criteria andReporterTelIsNotNull() {
            addCriterion("reporter_tel is not null");
            return (Criteria) this;
        }

        public Criteria andReporterTelEqualTo(String value) {
            addCriterion("reporter_tel =", value, "reporterTel");
            return (Criteria) this;
        }

        public Criteria andReporterTelNotEqualTo(String value) {
            addCriterion("reporter_tel <>", value, "reporterTel");
            return (Criteria) this;
        }

        public Criteria andReporterTelGreaterThan(String value) {
            addCriterion("reporter_tel >", value, "reporterTel");
            return (Criteria) this;
        }

        public Criteria andReporterTelGreaterThanOrEqualTo(String value) {
            addCriterion("reporter_tel >=", value, "reporterTel");
            return (Criteria) this;
        }

        public Criteria andReporterTelLessThan(String value) {
            addCriterion("reporter_tel <", value, "reporterTel");
            return (Criteria) this;
        }

        public Criteria andReporterTelLessThanOrEqualTo(String value) {
            addCriterion("reporter_tel <=", value, "reporterTel");
            return (Criteria) this;
        }

        public Criteria andReporterTelLike(String value) {
            addCriterion("reporter_tel like", value, "reporterTel");
            return (Criteria) this;
        }

        public Criteria andReporterTelNotLike(String value) {
            addCriterion("reporter_tel not like", value, "reporterTel");
            return (Criteria) this;
        }

        public Criteria andReporterTelIn(List<String> values) {
            addCriterion("reporter_tel in", values, "reporterTel");
            return (Criteria) this;
        }

        public Criteria andReporterTelNotIn(List<String> values) {
            addCriterion("reporter_tel not in", values, "reporterTel");
            return (Criteria) this;
        }

        public Criteria andReporterTelBetween(String value1, String value2) {
            addCriterion("reporter_tel between", value1, value2, "reporterTel");
            return (Criteria) this;
        }

        public Criteria andReporterTelNotBetween(String value1, String value2) {
            addCriterion("reporter_tel not between", value1, value2, "reporterTel");
            return (Criteria) this;
        }

        public Criteria andReporterIsNull() {
            addCriterion("reporter is null");
            return (Criteria) this;
        }

        public Criteria andReporterIsNotNull() {
            addCriterion("reporter is not null");
            return (Criteria) this;
        }

        public Criteria andReporterEqualTo(String value) {
            addCriterion("reporter =", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotEqualTo(String value) {
            addCriterion("reporter <>", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterGreaterThan(String value) {
            addCriterion("reporter >", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterGreaterThanOrEqualTo(String value) {
            addCriterion("reporter >=", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLessThan(String value) {
            addCriterion("reporter <", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLessThanOrEqualTo(String value) {
            addCriterion("reporter <=", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLike(String value) {
            addCriterion("reporter like", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotLike(String value) {
            addCriterion("reporter not like", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterIn(List<String> values) {
            addCriterion("reporter in", values, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotIn(List<String> values) {
            addCriterion("reporter not in", values, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterBetween(String value1, String value2) {
            addCriterion("reporter between", value1, value2, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotBetween(String value1, String value2) {
            addCriterion("reporter not between", value1, value2, "reporter");
            return (Criteria) this;
        }

        public Criteria andClaimNotificationNoIsNull() {
            addCriterion("claim_notification_no is null");
            return (Criteria) this;
        }

        public Criteria andClaimNotificationNoIsNotNull() {
            addCriterion("claim_notification_no is not null");
            return (Criteria) this;
        }

        public Criteria andClaimNotificationNoEqualTo(String value) {
            addCriterion("claim_notification_no =", value, "claimNotificationNo");
            return (Criteria) this;
        }

        public Criteria andClaimNotificationNoNotEqualTo(String value) {
            addCriterion("claim_notification_no <>", value, "claimNotificationNo");
            return (Criteria) this;
        }

        public Criteria andClaimNotificationNoGreaterThan(String value) {
            addCriterion("claim_notification_no >", value, "claimNotificationNo");
            return (Criteria) this;
        }

        public Criteria andClaimNotificationNoGreaterThanOrEqualTo(String value) {
            addCriterion("claim_notification_no >=", value, "claimNotificationNo");
            return (Criteria) this;
        }

        public Criteria andClaimNotificationNoLessThan(String value) {
            addCriterion("claim_notification_no <", value, "claimNotificationNo");
            return (Criteria) this;
        }

        public Criteria andClaimNotificationNoLessThanOrEqualTo(String value) {
            addCriterion("claim_notification_no <=", value, "claimNotificationNo");
            return (Criteria) this;
        }

        public Criteria andClaimNotificationNoLike(String value) {
            addCriterion("claim_notification_no like", value, "claimNotificationNo");
            return (Criteria) this;
        }

        public Criteria andClaimNotificationNoNotLike(String value) {
            addCriterion("claim_notification_no not like", value, "claimNotificationNo");
            return (Criteria) this;
        }

        public Criteria andClaimNotificationNoIn(List<String> values) {
            addCriterion("claim_notification_no in", values, "claimNotificationNo");
            return (Criteria) this;
        }

        public Criteria andClaimNotificationNoNotIn(List<String> values) {
            addCriterion("claim_notification_no not in", values, "claimNotificationNo");
            return (Criteria) this;
        }

        public Criteria andClaimNotificationNoBetween(String value1, String value2) {
            addCriterion("claim_notification_no between", value1, value2, "claimNotificationNo");
            return (Criteria) this;
        }

        public Criteria andClaimNotificationNoNotBetween(String value1, String value2) {
            addCriterion("claim_notification_no not between", value1, value2, "claimNotificationNo");
            return (Criteria) this;
        }

        public Criteria andPaidAmountIsNull() {
            addCriterion("paid_amount is null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountIsNotNull() {
            addCriterion("paid_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPaidAmountEqualTo(BigDecimal value) {
            addCriterion("paid_amount =", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountNotEqualTo(BigDecimal value) {
            addCriterion("paid_amount <>", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountGreaterThan(BigDecimal value) {
            addCriterion("paid_amount >", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_amount >=", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountLessThan(BigDecimal value) {
            addCriterion("paid_amount <", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_amount <=", value, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountIn(List<BigDecimal> values) {
            addCriterion("paid_amount in", values, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountNotIn(List<BigDecimal> values) {
            addCriterion("paid_amount not in", values, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_amount between", value1, value2, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andPaidAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_amount not between", value1, value2, "paidAmount");
            return (Criteria) this;
        }

        public Criteria andDangerDescIsNull() {
            addCriterion("danger_desc is null");
            return (Criteria) this;
        }

        public Criteria andDangerDescIsNotNull() {
            addCriterion("danger_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDangerDescEqualTo(String value) {
            addCriterion("danger_desc =", value, "dangerDesc");
            return (Criteria) this;
        }

        public Criteria andDangerDescNotEqualTo(String value) {
            addCriterion("danger_desc <>", value, "dangerDesc");
            return (Criteria) this;
        }

        public Criteria andDangerDescGreaterThan(String value) {
            addCriterion("danger_desc >", value, "dangerDesc");
            return (Criteria) this;
        }

        public Criteria andDangerDescGreaterThanOrEqualTo(String value) {
            addCriterion("danger_desc >=", value, "dangerDesc");
            return (Criteria) this;
        }

        public Criteria andDangerDescLessThan(String value) {
            addCriterion("danger_desc <", value, "dangerDesc");
            return (Criteria) this;
        }

        public Criteria andDangerDescLessThanOrEqualTo(String value) {
            addCriterion("danger_desc <=", value, "dangerDesc");
            return (Criteria) this;
        }

        public Criteria andDangerDescLike(String value) {
            addCriterion("danger_desc like", value, "dangerDesc");
            return (Criteria) this;
        }

        public Criteria andDangerDescNotLike(String value) {
            addCriterion("danger_desc not like", value, "dangerDesc");
            return (Criteria) this;
        }

        public Criteria andDangerDescIn(List<String> values) {
            addCriterion("danger_desc in", values, "dangerDesc");
            return (Criteria) this;
        }

        public Criteria andDangerDescNotIn(List<String> values) {
            addCriterion("danger_desc not in", values, "dangerDesc");
            return (Criteria) this;
        }

        public Criteria andDangerDescBetween(String value1, String value2) {
            addCriterion("danger_desc between", value1, value2, "dangerDesc");
            return (Criteria) this;
        }

        public Criteria andDangerDescNotBetween(String value1, String value2) {
            addCriterion("danger_desc not between", value1, value2, "dangerDesc");
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