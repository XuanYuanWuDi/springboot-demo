package com.injured.server.api.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CeInsuranceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CeInsuranceExample() {
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

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andPlateColorIsNull() {
            addCriterion("plate_color is null");
            return (Criteria) this;
        }

        public Criteria andPlateColorIsNotNull() {
            addCriterion("plate_color is not null");
            return (Criteria) this;
        }

        public Criteria andPlateColorEqualTo(String value) {
            addCriterion("plate_color =", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorNotEqualTo(String value) {
            addCriterion("plate_color <>", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorGreaterThan(String value) {
            addCriterion("plate_color >", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorGreaterThanOrEqualTo(String value) {
            addCriterion("plate_color >=", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorLessThan(String value) {
            addCriterion("plate_color <", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorLessThanOrEqualTo(String value) {
            addCriterion("plate_color <=", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorLike(String value) {
            addCriterion("plate_color like", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorNotLike(String value) {
            addCriterion("plate_color not like", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorIn(List<String> values) {
            addCriterion("plate_color in", values, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorNotIn(List<String> values) {
            addCriterion("plate_color not in", values, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorBetween(String value1, String value2) {
            addCriterion("plate_color between", value1, value2, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorNotBetween(String value1, String value2) {
            addCriterion("plate_color not between", value1, value2, "plateColor");
            return (Criteria) this;
        }

        public Criteria andAppointDriver1IsNull() {
            addCriterion("appoint_driver1 is null");
            return (Criteria) this;
        }

        public Criteria andAppointDriver1IsNotNull() {
            addCriterion("appoint_driver1 is not null");
            return (Criteria) this;
        }

        public Criteria andAppointDriver1EqualTo(String value) {
            addCriterion("appoint_driver1 =", value, "appointDriver1");
            return (Criteria) this;
        }

        public Criteria andAppointDriver1NotEqualTo(String value) {
            addCriterion("appoint_driver1 <>", value, "appointDriver1");
            return (Criteria) this;
        }

        public Criteria andAppointDriver1GreaterThan(String value) {
            addCriterion("appoint_driver1 >", value, "appointDriver1");
            return (Criteria) this;
        }

        public Criteria andAppointDriver1GreaterThanOrEqualTo(String value) {
            addCriterion("appoint_driver1 >=", value, "appointDriver1");
            return (Criteria) this;
        }

        public Criteria andAppointDriver1LessThan(String value) {
            addCriterion("appoint_driver1 <", value, "appointDriver1");
            return (Criteria) this;
        }

        public Criteria andAppointDriver1LessThanOrEqualTo(String value) {
            addCriterion("appoint_driver1 <=", value, "appointDriver1");
            return (Criteria) this;
        }

        public Criteria andAppointDriver1Like(String value) {
            addCriterion("appoint_driver1 like", value, "appointDriver1");
            return (Criteria) this;
        }

        public Criteria andAppointDriver1NotLike(String value) {
            addCriterion("appoint_driver1 not like", value, "appointDriver1");
            return (Criteria) this;
        }

        public Criteria andAppointDriver1In(List<String> values) {
            addCriterion("appoint_driver1 in", values, "appointDriver1");
            return (Criteria) this;
        }

        public Criteria andAppointDriver1NotIn(List<String> values) {
            addCriterion("appoint_driver1 not in", values, "appointDriver1");
            return (Criteria) this;
        }

        public Criteria andAppointDriver1Between(String value1, String value2) {
            addCriterion("appoint_driver1 between", value1, value2, "appointDriver1");
            return (Criteria) this;
        }

        public Criteria andAppointDriver1NotBetween(String value1, String value2) {
            addCriterion("appoint_driver1 not between", value1, value2, "appointDriver1");
            return (Criteria) this;
        }

        public Criteria andAppointDriver2IsNull() {
            addCriterion("appoint_driver2 is null");
            return (Criteria) this;
        }

        public Criteria andAppointDriver2IsNotNull() {
            addCriterion("appoint_driver2 is not null");
            return (Criteria) this;
        }

        public Criteria andAppointDriver2EqualTo(String value) {
            addCriterion("appoint_driver2 =", value, "appointDriver2");
            return (Criteria) this;
        }

        public Criteria andAppointDriver2NotEqualTo(String value) {
            addCriterion("appoint_driver2 <>", value, "appointDriver2");
            return (Criteria) this;
        }

        public Criteria andAppointDriver2GreaterThan(String value) {
            addCriterion("appoint_driver2 >", value, "appointDriver2");
            return (Criteria) this;
        }

        public Criteria andAppointDriver2GreaterThanOrEqualTo(String value) {
            addCriterion("appoint_driver2 >=", value, "appointDriver2");
            return (Criteria) this;
        }

        public Criteria andAppointDriver2LessThan(String value) {
            addCriterion("appoint_driver2 <", value, "appointDriver2");
            return (Criteria) this;
        }

        public Criteria andAppointDriver2LessThanOrEqualTo(String value) {
            addCriterion("appoint_driver2 <=", value, "appointDriver2");
            return (Criteria) this;
        }

        public Criteria andAppointDriver2Like(String value) {
            addCriterion("appoint_driver2 like", value, "appointDriver2");
            return (Criteria) this;
        }

        public Criteria andAppointDriver2NotLike(String value) {
            addCriterion("appoint_driver2 not like", value, "appointDriver2");
            return (Criteria) this;
        }

        public Criteria andAppointDriver2In(List<String> values) {
            addCriterion("appoint_driver2 in", values, "appointDriver2");
            return (Criteria) this;
        }

        public Criteria andAppointDriver2NotIn(List<String> values) {
            addCriterion("appoint_driver2 not in", values, "appointDriver2");
            return (Criteria) this;
        }

        public Criteria andAppointDriver2Between(String value1, String value2) {
            addCriterion("appoint_driver2 between", value1, value2, "appointDriver2");
            return (Criteria) this;
        }

        public Criteria andAppointDriver2NotBetween(String value1, String value2) {
            addCriterion("appoint_driver2 not between", value1, value2, "appointDriver2");
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

        public Criteria andInsuranceStandardFeeIsNull() {
            addCriterion("insurance_standard_fee is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceStandardFeeIsNotNull() {
            addCriterion("insurance_standard_fee is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceStandardFeeEqualTo(BigDecimal value) {
            addCriterion("insurance_standard_fee =", value, "insuranceStandardFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceStandardFeeNotEqualTo(BigDecimal value) {
            addCriterion("insurance_standard_fee <>", value, "insuranceStandardFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceStandardFeeGreaterThan(BigDecimal value) {
            addCriterion("insurance_standard_fee >", value, "insuranceStandardFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceStandardFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_standard_fee >=", value, "insuranceStandardFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceStandardFeeLessThan(BigDecimal value) {
            addCriterion("insurance_standard_fee <", value, "insuranceStandardFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceStandardFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_standard_fee <=", value, "insuranceStandardFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceStandardFeeIn(List<BigDecimal> values) {
            addCriterion("insurance_standard_fee in", values, "insuranceStandardFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceStandardFeeNotIn(List<BigDecimal> values) {
            addCriterion("insurance_standard_fee not in", values, "insuranceStandardFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceStandardFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_standard_fee between", value1, value2, "insuranceStandardFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceStandardFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_standard_fee not between", value1, value2, "insuranceStandardFee");
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

        public Criteria andInsuranceAmountIsNull() {
            addCriterion("insurance_amount is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmountIsNotNull() {
            addCriterion("insurance_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmountEqualTo(BigDecimal value) {
            addCriterion("insurance_amount =", value, "insuranceAmount");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmountNotEqualTo(BigDecimal value) {
            addCriterion("insurance_amount <>", value, "insuranceAmount");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmountGreaterThan(BigDecimal value) {
            addCriterion("insurance_amount >", value, "insuranceAmount");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_amount >=", value, "insuranceAmount");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmountLessThan(BigDecimal value) {
            addCriterion("insurance_amount <", value, "insuranceAmount");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insurance_amount <=", value, "insuranceAmount");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmountIn(List<BigDecimal> values) {
            addCriterion("insurance_amount in", values, "insuranceAmount");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmountNotIn(List<BigDecimal> values) {
            addCriterion("insurance_amount not in", values, "insuranceAmount");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_amount between", value1, value2, "insuranceAmount");
            return (Criteria) this;
        }

        public Criteria andInsuranceAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insurance_amount not between", value1, value2, "insuranceAmount");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andSignDateIsNull() {
            addCriterion("sign_date is null");
            return (Criteria) this;
        }

        public Criteria andSignDateIsNotNull() {
            addCriterion("sign_date is not null");
            return (Criteria) this;
        }

        public Criteria andSignDateEqualTo(Date value) {
            addCriterion("sign_date =", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotEqualTo(Date value) {
            addCriterion("sign_date <>", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThan(Date value) {
            addCriterion("sign_date >", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sign_date >=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThan(Date value) {
            addCriterion("sign_date <", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateLessThanOrEqualTo(Date value) {
            addCriterion("sign_date <=", value, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateIn(List<Date> values) {
            addCriterion("sign_date in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotIn(List<Date> values) {
            addCriterion("sign_date not in", values, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateBetween(Date value1, Date value2) {
            addCriterion("sign_date between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria andSignDateNotBetween(Date value1, Date value2) {
            addCriterion("sign_date not between", value1, value2, "signDate");
            return (Criteria) this;
        }

        public Criteria andFirstRegistrationDateIsNull() {
            addCriterion("first_registration_date is null");
            return (Criteria) this;
        }

        public Criteria andFirstRegistrationDateIsNotNull() {
            addCriterion("first_registration_date is not null");
            return (Criteria) this;
        }

        public Criteria andFirstRegistrationDateEqualTo(Date value) {
            addCriterion("first_registration_date =", value, "firstRegistrationDate");
            return (Criteria) this;
        }

        public Criteria andFirstRegistrationDateNotEqualTo(Date value) {
            addCriterion("first_registration_date <>", value, "firstRegistrationDate");
            return (Criteria) this;
        }

        public Criteria andFirstRegistrationDateGreaterThan(Date value) {
            addCriterion("first_registration_date >", value, "firstRegistrationDate");
            return (Criteria) this;
        }

        public Criteria andFirstRegistrationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("first_registration_date >=", value, "firstRegistrationDate");
            return (Criteria) this;
        }

        public Criteria andFirstRegistrationDateLessThan(Date value) {
            addCriterion("first_registration_date <", value, "firstRegistrationDate");
            return (Criteria) this;
        }

        public Criteria andFirstRegistrationDateLessThanOrEqualTo(Date value) {
            addCriterion("first_registration_date <=", value, "firstRegistrationDate");
            return (Criteria) this;
        }

        public Criteria andFirstRegistrationDateIn(List<Date> values) {
            addCriterion("first_registration_date in", values, "firstRegistrationDate");
            return (Criteria) this;
        }

        public Criteria andFirstRegistrationDateNotIn(List<Date> values) {
            addCriterion("first_registration_date not in", values, "firstRegistrationDate");
            return (Criteria) this;
        }

        public Criteria andFirstRegistrationDateBetween(Date value1, Date value2) {
            addCriterion("first_registration_date between", value1, value2, "firstRegistrationDate");
            return (Criteria) this;
        }

        public Criteria andFirstRegistrationDateNotBetween(Date value1, Date value2) {
            addCriterion("first_registration_date not between", value1, value2, "firstRegistrationDate");
            return (Criteria) this;
        }

        public Criteria andTonnageIsNull() {
            addCriterion("tonnage is null");
            return (Criteria) this;
        }

        public Criteria andTonnageIsNotNull() {
            addCriterion("tonnage is not null");
            return (Criteria) this;
        }

        public Criteria andTonnageEqualTo(BigDecimal value) {
            addCriterion("tonnage =", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageNotEqualTo(BigDecimal value) {
            addCriterion("tonnage <>", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageGreaterThan(BigDecimal value) {
            addCriterion("tonnage >", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tonnage >=", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageLessThan(BigDecimal value) {
            addCriterion("tonnage <", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tonnage <=", value, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageIn(List<BigDecimal> values) {
            addCriterion("tonnage in", values, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageNotIn(List<BigDecimal> values) {
            addCriterion("tonnage not in", values, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tonnage between", value1, value2, "tonnage");
            return (Criteria) this;
        }

        public Criteria andTonnageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tonnage not between", value1, value2, "tonnage");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andChannelsIsNull() {
            addCriterion("channels is null");
            return (Criteria) this;
        }

        public Criteria andChannelsIsNotNull() {
            addCriterion("channels is not null");
            return (Criteria) this;
        }

        public Criteria andChannelsEqualTo(String value) {
            addCriterion("channels =", value, "channels");
            return (Criteria) this;
        }

        public Criteria andChannelsNotEqualTo(String value) {
            addCriterion("channels <>", value, "channels");
            return (Criteria) this;
        }

        public Criteria andChannelsGreaterThan(String value) {
            addCriterion("channels >", value, "channels");
            return (Criteria) this;
        }

        public Criteria andChannelsGreaterThanOrEqualTo(String value) {
            addCriterion("channels >=", value, "channels");
            return (Criteria) this;
        }

        public Criteria andChannelsLessThan(String value) {
            addCriterion("channels <", value, "channels");
            return (Criteria) this;
        }

        public Criteria andChannelsLessThanOrEqualTo(String value) {
            addCriterion("channels <=", value, "channels");
            return (Criteria) this;
        }

        public Criteria andChannelsLike(String value) {
            addCriterion("channels like", value, "channels");
            return (Criteria) this;
        }

        public Criteria andChannelsNotLike(String value) {
            addCriterion("channels not like", value, "channels");
            return (Criteria) this;
        }

        public Criteria andChannelsIn(List<String> values) {
            addCriterion("channels in", values, "channels");
            return (Criteria) this;
        }

        public Criteria andChannelsNotIn(List<String> values) {
            addCriterion("channels not in", values, "channels");
            return (Criteria) this;
        }

        public Criteria andChannelsBetween(String value1, String value2) {
            addCriterion("channels between", value1, value2, "channels");
            return (Criteria) this;
        }

        public Criteria andChannelsNotBetween(String value1, String value2) {
            addCriterion("channels not between", value1, value2, "channels");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceIsNull() {
            addCriterion("new_vehicle_price is null");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceIsNotNull() {
            addCriterion("new_vehicle_price is not null");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceEqualTo(BigDecimal value) {
            addCriterion("new_vehicle_price =", value, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceNotEqualTo(BigDecimal value) {
            addCriterion("new_vehicle_price <>", value, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceGreaterThan(BigDecimal value) {
            addCriterion("new_vehicle_price >", value, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("new_vehicle_price >=", value, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceLessThan(BigDecimal value) {
            addCriterion("new_vehicle_price <", value, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("new_vehicle_price <=", value, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceIn(List<BigDecimal> values) {
            addCriterion("new_vehicle_price in", values, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceNotIn(List<BigDecimal> values) {
            addCriterion("new_vehicle_price not in", values, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("new_vehicle_price between", value1, value2, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("new_vehicle_price not between", value1, value2, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andVehiclePriceIsNull() {
            addCriterion("vehicle_price is null");
            return (Criteria) this;
        }

        public Criteria andVehiclePriceIsNotNull() {
            addCriterion("vehicle_price is not null");
            return (Criteria) this;
        }

        public Criteria andVehiclePriceEqualTo(BigDecimal value) {
            addCriterion("vehicle_price =", value, "vehiclePrice");
            return (Criteria) this;
        }

        public Criteria andVehiclePriceNotEqualTo(BigDecimal value) {
            addCriterion("vehicle_price <>", value, "vehiclePrice");
            return (Criteria) this;
        }

        public Criteria andVehiclePriceGreaterThan(BigDecimal value) {
            addCriterion("vehicle_price >", value, "vehiclePrice");
            return (Criteria) this;
        }

        public Criteria andVehiclePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("vehicle_price >=", value, "vehiclePrice");
            return (Criteria) this;
        }

        public Criteria andVehiclePriceLessThan(BigDecimal value) {
            addCriterion("vehicle_price <", value, "vehiclePrice");
            return (Criteria) this;
        }

        public Criteria andVehiclePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("vehicle_price <=", value, "vehiclePrice");
            return (Criteria) this;
        }

        public Criteria andVehiclePriceIn(List<BigDecimal> values) {
            addCriterion("vehicle_price in", values, "vehiclePrice");
            return (Criteria) this;
        }

        public Criteria andVehiclePriceNotIn(List<BigDecimal> values) {
            addCriterion("vehicle_price not in", values, "vehiclePrice");
            return (Criteria) this;
        }

        public Criteria andVehiclePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vehicle_price between", value1, value2, "vehiclePrice");
            return (Criteria) this;
        }

        public Criteria andVehiclePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vehicle_price not between", value1, value2, "vehiclePrice");
            return (Criteria) this;
        }

        public Criteria andPolicyHolderIsNull() {
            addCriterion("policy_holder is null");
            return (Criteria) this;
        }

        public Criteria andPolicyHolderIsNotNull() {
            addCriterion("policy_holder is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyHolderEqualTo(String value) {
            addCriterion("policy_holder =", value, "policyHolder");
            return (Criteria) this;
        }

        public Criteria andPolicyHolderNotEqualTo(String value) {
            addCriterion("policy_holder <>", value, "policyHolder");
            return (Criteria) this;
        }

        public Criteria andPolicyHolderGreaterThan(String value) {
            addCriterion("policy_holder >", value, "policyHolder");
            return (Criteria) this;
        }

        public Criteria andPolicyHolderGreaterThanOrEqualTo(String value) {
            addCriterion("policy_holder >=", value, "policyHolder");
            return (Criteria) this;
        }

        public Criteria andPolicyHolderLessThan(String value) {
            addCriterion("policy_holder <", value, "policyHolder");
            return (Criteria) this;
        }

        public Criteria andPolicyHolderLessThanOrEqualTo(String value) {
            addCriterion("policy_holder <=", value, "policyHolder");
            return (Criteria) this;
        }

        public Criteria andPolicyHolderLike(String value) {
            addCriterion("policy_holder like", value, "policyHolder");
            return (Criteria) this;
        }

        public Criteria andPolicyHolderNotLike(String value) {
            addCriterion("policy_holder not like", value, "policyHolder");
            return (Criteria) this;
        }

        public Criteria andPolicyHolderIn(List<String> values) {
            addCriterion("policy_holder in", values, "policyHolder");
            return (Criteria) this;
        }

        public Criteria andPolicyHolderNotIn(List<String> values) {
            addCriterion("policy_holder not in", values, "policyHolder");
            return (Criteria) this;
        }

        public Criteria andPolicyHolderBetween(String value1, String value2) {
            addCriterion("policy_holder between", value1, value2, "policyHolder");
            return (Criteria) this;
        }

        public Criteria andPolicyHolderNotBetween(String value1, String value2) {
            addCriterion("policy_holder not between", value1, value2, "policyHolder");
            return (Criteria) this;
        }

        public Criteria andNatureIsNull() {
            addCriterion("nature is null");
            return (Criteria) this;
        }

        public Criteria andNatureIsNotNull() {
            addCriterion("nature is not null");
            return (Criteria) this;
        }

        public Criteria andNatureEqualTo(String value) {
            addCriterion("nature =", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotEqualTo(String value) {
            addCriterion("nature <>", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThan(String value) {
            addCriterion("nature >", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThanOrEqualTo(String value) {
            addCriterion("nature >=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThan(String value) {
            addCriterion("nature <", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThanOrEqualTo(String value) {
            addCriterion("nature <=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLike(String value) {
            addCriterion("nature like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotLike(String value) {
            addCriterion("nature not like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureIn(List<String> values) {
            addCriterion("nature in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotIn(List<String> values) {
            addCriterion("nature not in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureBetween(String value1, String value2) {
            addCriterion("nature between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotBetween(String value1, String value2) {
            addCriterion("nature not between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andIsEffectImmediatelyIsNull() {
            addCriterion("is_effect_immediately is null");
            return (Criteria) this;
        }

        public Criteria andIsEffectImmediatelyIsNotNull() {
            addCriterion("is_effect_immediately is not null");
            return (Criteria) this;
        }

        public Criteria andIsEffectImmediatelyEqualTo(String value) {
            addCriterion("is_effect_immediately =", value, "isEffectImmediately");
            return (Criteria) this;
        }

        public Criteria andIsEffectImmediatelyNotEqualTo(String value) {
            addCriterion("is_effect_immediately <>", value, "isEffectImmediately");
            return (Criteria) this;
        }

        public Criteria andIsEffectImmediatelyGreaterThan(String value) {
            addCriterion("is_effect_immediately >", value, "isEffectImmediately");
            return (Criteria) this;
        }

        public Criteria andIsEffectImmediatelyGreaterThanOrEqualTo(String value) {
            addCriterion("is_effect_immediately >=", value, "isEffectImmediately");
            return (Criteria) this;
        }

        public Criteria andIsEffectImmediatelyLessThan(String value) {
            addCriterion("is_effect_immediately <", value, "isEffectImmediately");
            return (Criteria) this;
        }

        public Criteria andIsEffectImmediatelyLessThanOrEqualTo(String value) {
            addCriterion("is_effect_immediately <=", value, "isEffectImmediately");
            return (Criteria) this;
        }

        public Criteria andIsEffectImmediatelyLike(String value) {
            addCriterion("is_effect_immediately like", value, "isEffectImmediately");
            return (Criteria) this;
        }

        public Criteria andIsEffectImmediatelyNotLike(String value) {
            addCriterion("is_effect_immediately not like", value, "isEffectImmediately");
            return (Criteria) this;
        }

        public Criteria andIsEffectImmediatelyIn(List<String> values) {
            addCriterion("is_effect_immediately in", values, "isEffectImmediately");
            return (Criteria) this;
        }

        public Criteria andIsEffectImmediatelyNotIn(List<String> values) {
            addCriterion("is_effect_immediately not in", values, "isEffectImmediately");
            return (Criteria) this;
        }

        public Criteria andIsEffectImmediatelyBetween(String value1, String value2) {
            addCriterion("is_effect_immediately between", value1, value2, "isEffectImmediately");
            return (Criteria) this;
        }

        public Criteria andIsEffectImmediatelyNotBetween(String value1, String value2) {
            addCriterion("is_effect_immediately not between", value1, value2, "isEffectImmediately");
            return (Criteria) this;
        }

        public Criteria andIsContinuousPolicyIsNull() {
            addCriterion("is_continuous_policy is null");
            return (Criteria) this;
        }

        public Criteria andIsContinuousPolicyIsNotNull() {
            addCriterion("is_continuous_policy is not null");
            return (Criteria) this;
        }

        public Criteria andIsContinuousPolicyEqualTo(String value) {
            addCriterion("is_continuous_policy =", value, "isContinuousPolicy");
            return (Criteria) this;
        }

        public Criteria andIsContinuousPolicyNotEqualTo(String value) {
            addCriterion("is_continuous_policy <>", value, "isContinuousPolicy");
            return (Criteria) this;
        }

        public Criteria andIsContinuousPolicyGreaterThan(String value) {
            addCriterion("is_continuous_policy >", value, "isContinuousPolicy");
            return (Criteria) this;
        }

        public Criteria andIsContinuousPolicyGreaterThanOrEqualTo(String value) {
            addCriterion("is_continuous_policy >=", value, "isContinuousPolicy");
            return (Criteria) this;
        }

        public Criteria andIsContinuousPolicyLessThan(String value) {
            addCriterion("is_continuous_policy <", value, "isContinuousPolicy");
            return (Criteria) this;
        }

        public Criteria andIsContinuousPolicyLessThanOrEqualTo(String value) {
            addCriterion("is_continuous_policy <=", value, "isContinuousPolicy");
            return (Criteria) this;
        }

        public Criteria andIsContinuousPolicyLike(String value) {
            addCriterion("is_continuous_policy like", value, "isContinuousPolicy");
            return (Criteria) this;
        }

        public Criteria andIsContinuousPolicyNotLike(String value) {
            addCriterion("is_continuous_policy not like", value, "isContinuousPolicy");
            return (Criteria) this;
        }

        public Criteria andIsContinuousPolicyIn(List<String> values) {
            addCriterion("is_continuous_policy in", values, "isContinuousPolicy");
            return (Criteria) this;
        }

        public Criteria andIsContinuousPolicyNotIn(List<String> values) {
            addCriterion("is_continuous_policy not in", values, "isContinuousPolicy");
            return (Criteria) this;
        }

        public Criteria andIsContinuousPolicyBetween(String value1, String value2) {
            addCriterion("is_continuous_policy between", value1, value2, "isContinuousPolicy");
            return (Criteria) this;
        }

        public Criteria andIsContinuousPolicyNotBetween(String value1, String value2) {
            addCriterion("is_continuous_policy not between", value1, value2, "isContinuousPolicy");
            return (Criteria) this;
        }

        public Criteria andIsTransferIsNull() {
            addCriterion("is_transfer is null");
            return (Criteria) this;
        }

        public Criteria andIsTransferIsNotNull() {
            addCriterion("is_transfer is not null");
            return (Criteria) this;
        }

        public Criteria andIsTransferEqualTo(Boolean value) {
            addCriterion("is_transfer =", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferNotEqualTo(Boolean value) {
            addCriterion("is_transfer <>", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferGreaterThan(Boolean value) {
            addCriterion("is_transfer >", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_transfer >=", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferLessThan(Boolean value) {
            addCriterion("is_transfer <", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferLessThanOrEqualTo(Boolean value) {
            addCriterion("is_transfer <=", value, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferIn(List<Boolean> values) {
            addCriterion("is_transfer in", values, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferNotIn(List<Boolean> values) {
            addCriterion("is_transfer not in", values, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferBetween(Boolean value1, Boolean value2) {
            addCriterion("is_transfer between", value1, value2, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andIsTransferNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_transfer not between", value1, value2, "isTransfer");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesIsNull() {
            addCriterion("using_properties is null");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesIsNotNull() {
            addCriterion("using_properties is not null");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesEqualTo(String value) {
            addCriterion("using_properties =", value, "usingProperties");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesNotEqualTo(String value) {
            addCriterion("using_properties <>", value, "usingProperties");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesGreaterThan(String value) {
            addCriterion("using_properties >", value, "usingProperties");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesGreaterThanOrEqualTo(String value) {
            addCriterion("using_properties >=", value, "usingProperties");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesLessThan(String value) {
            addCriterion("using_properties <", value, "usingProperties");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesLessThanOrEqualTo(String value) {
            addCriterion("using_properties <=", value, "usingProperties");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesLike(String value) {
            addCriterion("using_properties like", value, "usingProperties");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesNotLike(String value) {
            addCriterion("using_properties not like", value, "usingProperties");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesIn(List<String> values) {
            addCriterion("using_properties in", values, "usingProperties");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesNotIn(List<String> values) {
            addCriterion("using_properties not in", values, "usingProperties");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesBetween(String value1, String value2) {
            addCriterion("using_properties between", value1, value2, "usingProperties");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesNotBetween(String value1, String value2) {
            addCriterion("using_properties not between", value1, value2, "usingProperties");
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

        public Criteria andPaidTotalIsNull() {
            addCriterion("paid_total is null");
            return (Criteria) this;
        }

        public Criteria andPaidTotalIsNotNull() {
            addCriterion("paid_total is not null");
            return (Criteria) this;
        }

        public Criteria andPaidTotalEqualTo(BigDecimal value) {
            addCriterion("paid_total =", value, "paidTotal");
            return (Criteria) this;
        }

        public Criteria andPaidTotalNotEqualTo(BigDecimal value) {
            addCriterion("paid_total <>", value, "paidTotal");
            return (Criteria) this;
        }

        public Criteria andPaidTotalGreaterThan(BigDecimal value) {
            addCriterion("paid_total >", value, "paidTotal");
            return (Criteria) this;
        }

        public Criteria andPaidTotalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_total >=", value, "paidTotal");
            return (Criteria) this;
        }

        public Criteria andPaidTotalLessThan(BigDecimal value) {
            addCriterion("paid_total <", value, "paidTotal");
            return (Criteria) this;
        }

        public Criteria andPaidTotalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("paid_total <=", value, "paidTotal");
            return (Criteria) this;
        }

        public Criteria andPaidTotalIn(List<BigDecimal> values) {
            addCriterion("paid_total in", values, "paidTotal");
            return (Criteria) this;
        }

        public Criteria andPaidTotalNotIn(List<BigDecimal> values) {
            addCriterion("paid_total not in", values, "paidTotal");
            return (Criteria) this;
        }

        public Criteria andPaidTotalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_total between", value1, value2, "paidTotal");
            return (Criteria) this;
        }

        public Criteria andPaidTotalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("paid_total not between", value1, value2, "paidTotal");
            return (Criteria) this;
        }

        public Criteria andDrivingMileageIsNull() {
            addCriterion("driving_mileage is null");
            return (Criteria) this;
        }

        public Criteria andDrivingMileageIsNotNull() {
            addCriterion("driving_mileage is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingMileageEqualTo(BigDecimal value) {
            addCriterion("driving_mileage =", value, "drivingMileage");
            return (Criteria) this;
        }

        public Criteria andDrivingMileageNotEqualTo(BigDecimal value) {
            addCriterion("driving_mileage <>", value, "drivingMileage");
            return (Criteria) this;
        }

        public Criteria andDrivingMileageGreaterThan(BigDecimal value) {
            addCriterion("driving_mileage >", value, "drivingMileage");
            return (Criteria) this;
        }

        public Criteria andDrivingMileageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("driving_mileage >=", value, "drivingMileage");
            return (Criteria) this;
        }

        public Criteria andDrivingMileageLessThan(BigDecimal value) {
            addCriterion("driving_mileage <", value, "drivingMileage");
            return (Criteria) this;
        }

        public Criteria andDrivingMileageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("driving_mileage <=", value, "drivingMileage");
            return (Criteria) this;
        }

        public Criteria andDrivingMileageIn(List<BigDecimal> values) {
            addCriterion("driving_mileage in", values, "drivingMileage");
            return (Criteria) this;
        }

        public Criteria andDrivingMileageNotIn(List<BigDecimal> values) {
            addCriterion("driving_mileage not in", values, "drivingMileage");
            return (Criteria) this;
        }

        public Criteria andDrivingMileageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("driving_mileage between", value1, value2, "drivingMileage");
            return (Criteria) this;
        }

        public Criteria andDrivingMileageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("driving_mileage not between", value1, value2, "drivingMileage");
            return (Criteria) this;
        }

        public Criteria andEngineNoIsNull() {
            addCriterion("engine_no is null");
            return (Criteria) this;
        }

        public Criteria andEngineNoIsNotNull() {
            addCriterion("engine_no is not null");
            return (Criteria) this;
        }

        public Criteria andEngineNoEqualTo(String value) {
            addCriterion("engine_no =", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotEqualTo(String value) {
            addCriterion("engine_no <>", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoGreaterThan(String value) {
            addCriterion("engine_no >", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoGreaterThanOrEqualTo(String value) {
            addCriterion("engine_no >=", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLessThan(String value) {
            addCriterion("engine_no <", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLessThanOrEqualTo(String value) {
            addCriterion("engine_no <=", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLike(String value) {
            addCriterion("engine_no like", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotLike(String value) {
            addCriterion("engine_no not like", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoIn(List<String> values) {
            addCriterion("engine_no in", values, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotIn(List<String> values) {
            addCriterion("engine_no not in", values, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoBetween(String value1, String value2) {
            addCriterion("engine_no between", value1, value2, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotBetween(String value1, String value2) {
            addCriterion("engine_no not between", value1, value2, "engineNo");
            return (Criteria) this;
        }

        public Criteria andPassengerVolumeIsNull() {
            addCriterion("passenger_volume is null");
            return (Criteria) this;
        }

        public Criteria andPassengerVolumeIsNotNull() {
            addCriterion("passenger_volume is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerVolumeEqualTo(Integer value) {
            addCriterion("passenger_volume =", value, "passengerVolume");
            return (Criteria) this;
        }

        public Criteria andPassengerVolumeNotEqualTo(Integer value) {
            addCriterion("passenger_volume <>", value, "passengerVolume");
            return (Criteria) this;
        }

        public Criteria andPassengerVolumeGreaterThan(Integer value) {
            addCriterion("passenger_volume >", value, "passengerVolume");
            return (Criteria) this;
        }

        public Criteria andPassengerVolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("passenger_volume >=", value, "passengerVolume");
            return (Criteria) this;
        }

        public Criteria andPassengerVolumeLessThan(Integer value) {
            addCriterion("passenger_volume <", value, "passengerVolume");
            return (Criteria) this;
        }

        public Criteria andPassengerVolumeLessThanOrEqualTo(Integer value) {
            addCriterion("passenger_volume <=", value, "passengerVolume");
            return (Criteria) this;
        }

        public Criteria andPassengerVolumeIn(List<Integer> values) {
            addCriterion("passenger_volume in", values, "passengerVolume");
            return (Criteria) this;
        }

        public Criteria andPassengerVolumeNotIn(List<Integer> values) {
            addCriterion("passenger_volume not in", values, "passengerVolume");
            return (Criteria) this;
        }

        public Criteria andPassengerVolumeBetween(Integer value1, Integer value2) {
            addCriterion("passenger_volume between", value1, value2, "passengerVolume");
            return (Criteria) this;
        }

        public Criteria andPassengerVolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("passenger_volume not between", value1, value2, "passengerVolume");
            return (Criteria) this;
        }

        public Criteria andPayloadMassIsNull() {
            addCriterion("payload_mass is null");
            return (Criteria) this;
        }

        public Criteria andPayloadMassIsNotNull() {
            addCriterion("payload_mass is not null");
            return (Criteria) this;
        }

        public Criteria andPayloadMassEqualTo(Integer value) {
            addCriterion("payload_mass =", value, "payloadMass");
            return (Criteria) this;
        }

        public Criteria andPayloadMassNotEqualTo(Integer value) {
            addCriterion("payload_mass <>", value, "payloadMass");
            return (Criteria) this;
        }

        public Criteria andPayloadMassGreaterThan(Integer value) {
            addCriterion("payload_mass >", value, "payloadMass");
            return (Criteria) this;
        }

        public Criteria andPayloadMassGreaterThanOrEqualTo(Integer value) {
            addCriterion("payload_mass >=", value, "payloadMass");
            return (Criteria) this;
        }

        public Criteria andPayloadMassLessThan(Integer value) {
            addCriterion("payload_mass <", value, "payloadMass");
            return (Criteria) this;
        }

        public Criteria andPayloadMassLessThanOrEqualTo(Integer value) {
            addCriterion("payload_mass <=", value, "payloadMass");
            return (Criteria) this;
        }

        public Criteria andPayloadMassIn(List<Integer> values) {
            addCriterion("payload_mass in", values, "payloadMass");
            return (Criteria) this;
        }

        public Criteria andPayloadMassNotIn(List<Integer> values) {
            addCriterion("payload_mass not in", values, "payloadMass");
            return (Criteria) this;
        }

        public Criteria andPayloadMassBetween(Integer value1, Integer value2) {
            addCriterion("payload_mass between", value1, value2, "payloadMass");
            return (Criteria) this;
        }

        public Criteria andPayloadMassNotBetween(Integer value1, Integer value2) {
            addCriterion("payload_mass not between", value1, value2, "payloadMass");
            return (Criteria) this;
        }

        public Criteria andEventCountIsNull() {
            addCriterion("event_count is null");
            return (Criteria) this;
        }

        public Criteria andEventCountIsNotNull() {
            addCriterion("event_count is not null");
            return (Criteria) this;
        }

        public Criteria andEventCountEqualTo(Integer value) {
            addCriterion("event_count =", value, "eventCount");
            return (Criteria) this;
        }

        public Criteria andEventCountNotEqualTo(Integer value) {
            addCriterion("event_count <>", value, "eventCount");
            return (Criteria) this;
        }

        public Criteria andEventCountGreaterThan(Integer value) {
            addCriterion("event_count >", value, "eventCount");
            return (Criteria) this;
        }

        public Criteria andEventCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("event_count >=", value, "eventCount");
            return (Criteria) this;
        }

        public Criteria andEventCountLessThan(Integer value) {
            addCriterion("event_count <", value, "eventCount");
            return (Criteria) this;
        }

        public Criteria andEventCountLessThanOrEqualTo(Integer value) {
            addCriterion("event_count <=", value, "eventCount");
            return (Criteria) this;
        }

        public Criteria andEventCountIn(List<Integer> values) {
            addCriterion("event_count in", values, "eventCount");
            return (Criteria) this;
        }

        public Criteria andEventCountNotIn(List<Integer> values) {
            addCriterion("event_count not in", values, "eventCount");
            return (Criteria) this;
        }

        public Criteria andEventCountBetween(Integer value1, Integer value2) {
            addCriterion("event_count between", value1, value2, "eventCount");
            return (Criteria) this;
        }

        public Criteria andEventCountNotBetween(Integer value1, Integer value2) {
            addCriterion("event_count not between", value1, value2, "eventCount");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyCodeIsNull() {
            addCriterion("issue_company_code is null");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyCodeIsNotNull() {
            addCriterion("issue_company_code is not null");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyCodeEqualTo(String value) {
            addCriterion("issue_company_code =", value, "issueCompanyCode");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyCodeNotEqualTo(String value) {
            addCriterion("issue_company_code <>", value, "issueCompanyCode");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyCodeGreaterThan(String value) {
            addCriterion("issue_company_code >", value, "issueCompanyCode");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("issue_company_code >=", value, "issueCompanyCode");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyCodeLessThan(String value) {
            addCriterion("issue_company_code <", value, "issueCompanyCode");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("issue_company_code <=", value, "issueCompanyCode");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyCodeLike(String value) {
            addCriterion("issue_company_code like", value, "issueCompanyCode");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyCodeNotLike(String value) {
            addCriterion("issue_company_code not like", value, "issueCompanyCode");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyCodeIn(List<String> values) {
            addCriterion("issue_company_code in", values, "issueCompanyCode");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyCodeNotIn(List<String> values) {
            addCriterion("issue_company_code not in", values, "issueCompanyCode");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyCodeBetween(String value1, String value2) {
            addCriterion("issue_company_code between", value1, value2, "issueCompanyCode");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("issue_company_code not between", value1, value2, "issueCompanyCode");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyNameIsNull() {
            addCriterion("issue_company_name is null");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyNameIsNotNull() {
            addCriterion("issue_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyNameEqualTo(String value) {
            addCriterion("issue_company_name =", value, "issueCompanyName");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyNameNotEqualTo(String value) {
            addCriterion("issue_company_name <>", value, "issueCompanyName");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyNameGreaterThan(String value) {
            addCriterion("issue_company_name >", value, "issueCompanyName");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("issue_company_name >=", value, "issueCompanyName");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyNameLessThan(String value) {
            addCriterion("issue_company_name <", value, "issueCompanyName");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("issue_company_name <=", value, "issueCompanyName");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyNameLike(String value) {
            addCriterion("issue_company_name like", value, "issueCompanyName");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyNameNotLike(String value) {
            addCriterion("issue_company_name not like", value, "issueCompanyName");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyNameIn(List<String> values) {
            addCriterion("issue_company_name in", values, "issueCompanyName");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyNameNotIn(List<String> values) {
            addCriterion("issue_company_name not in", values, "issueCompanyName");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyNameBetween(String value1, String value2) {
            addCriterion("issue_company_name between", value1, value2, "issueCompanyName");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyNameNotBetween(String value1, String value2) {
            addCriterion("issue_company_name not between", value1, value2, "issueCompanyName");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyAddressIsNull() {
            addCriterion("issue_company_address is null");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyAddressIsNotNull() {
            addCriterion("issue_company_address is not null");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyAddressEqualTo(String value) {
            addCriterion("issue_company_address =", value, "issueCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyAddressNotEqualTo(String value) {
            addCriterion("issue_company_address <>", value, "issueCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyAddressGreaterThan(String value) {
            addCriterion("issue_company_address >", value, "issueCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("issue_company_address >=", value, "issueCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyAddressLessThan(String value) {
            addCriterion("issue_company_address <", value, "issueCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("issue_company_address <=", value, "issueCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyAddressLike(String value) {
            addCriterion("issue_company_address like", value, "issueCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyAddressNotLike(String value) {
            addCriterion("issue_company_address not like", value, "issueCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyAddressIn(List<String> values) {
            addCriterion("issue_company_address in", values, "issueCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyAddressNotIn(List<String> values) {
            addCriterion("issue_company_address not in", values, "issueCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyAddressBetween(String value1, String value2) {
            addCriterion("issue_company_address between", value1, value2, "issueCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andIssueCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("issue_company_address not between", value1, value2, "issueCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andBearTelIsNull() {
            addCriterion("bear_tel is null");
            return (Criteria) this;
        }

        public Criteria andBearTelIsNotNull() {
            addCriterion("bear_tel is not null");
            return (Criteria) this;
        }

        public Criteria andBearTelEqualTo(String value) {
            addCriterion("bear_tel =", value, "bearTel");
            return (Criteria) this;
        }

        public Criteria andBearTelNotEqualTo(String value) {
            addCriterion("bear_tel <>", value, "bearTel");
            return (Criteria) this;
        }

        public Criteria andBearTelGreaterThan(String value) {
            addCriterion("bear_tel >", value, "bearTel");
            return (Criteria) this;
        }

        public Criteria andBearTelGreaterThanOrEqualTo(String value) {
            addCriterion("bear_tel >=", value, "bearTel");
            return (Criteria) this;
        }

        public Criteria andBearTelLessThan(String value) {
            addCriterion("bear_tel <", value, "bearTel");
            return (Criteria) this;
        }

        public Criteria andBearTelLessThanOrEqualTo(String value) {
            addCriterion("bear_tel <=", value, "bearTel");
            return (Criteria) this;
        }

        public Criteria andBearTelLike(String value) {
            addCriterion("bear_tel like", value, "bearTel");
            return (Criteria) this;
        }

        public Criteria andBearTelNotLike(String value) {
            addCriterion("bear_tel not like", value, "bearTel");
            return (Criteria) this;
        }

        public Criteria andBearTelIn(List<String> values) {
            addCriterion("bear_tel in", values, "bearTel");
            return (Criteria) this;
        }

        public Criteria andBearTelNotIn(List<String> values) {
            addCriterion("bear_tel not in", values, "bearTel");
            return (Criteria) this;
        }

        public Criteria andBearTelBetween(String value1, String value2) {
            addCriterion("bear_tel between", value1, value2, "bearTel");
            return (Criteria) this;
        }

        public Criteria andBearTelNotBetween(String value1, String value2) {
            addCriterion("bear_tel not between", value1, value2, "bearTel");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("owner is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("owner is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("owner =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("owner <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("owner >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("owner >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("owner <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("owner <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("owner like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("owner not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("owner in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("owner not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("owner between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("owner not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNull() {
            addCriterion("model_name is null");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNotNull() {
            addCriterion("model_name is not null");
            return (Criteria) this;
        }

        public Criteria andModelNameEqualTo(String value) {
            addCriterion("model_name =", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotEqualTo(String value) {
            addCriterion("model_name <>", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThan(String value) {
            addCriterion("model_name >", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThanOrEqualTo(String value) {
            addCriterion("model_name >=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThan(String value) {
            addCriterion("model_name <", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThanOrEqualTo(String value) {
            addCriterion("model_name <=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLike(String value) {
            addCriterion("model_name like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotLike(String value) {
            addCriterion("model_name not like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameIn(List<String> values) {
            addCriterion("model_name in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotIn(List<String> values) {
            addCriterion("model_name not in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameBetween(String value1, String value2) {
            addCriterion("model_name between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotBetween(String value1, String value2) {
            addCriterion("model_name not between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelCodeIsNull() {
            addCriterion("model_code is null");
            return (Criteria) this;
        }

        public Criteria andModelCodeIsNotNull() {
            addCriterion("model_code is not null");
            return (Criteria) this;
        }

        public Criteria andModelCodeEqualTo(String value) {
            addCriterion("model_code =", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeNotEqualTo(String value) {
            addCriterion("model_code <>", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeGreaterThan(String value) {
            addCriterion("model_code >", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("model_code >=", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeLessThan(String value) {
            addCriterion("model_code <", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeLessThanOrEqualTo(String value) {
            addCriterion("model_code <=", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeLike(String value) {
            addCriterion("model_code like", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeNotLike(String value) {
            addCriterion("model_code not like", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeIn(List<String> values) {
            addCriterion("model_code in", values, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeNotIn(List<String> values) {
            addCriterion("model_code not in", values, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeBetween(String value1, String value2) {
            addCriterion("model_code between", value1, value2, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeNotBetween(String value1, String value2) {
            addCriterion("model_code not between", value1, value2, "modelCode");
            return (Criteria) this;
        }

        public Criteria andBrandModelIsNull() {
            addCriterion("brand_model is null");
            return (Criteria) this;
        }

        public Criteria andBrandModelIsNotNull() {
            addCriterion("brand_model is not null");
            return (Criteria) this;
        }

        public Criteria andBrandModelEqualTo(String value) {
            addCriterion("brand_model =", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelNotEqualTo(String value) {
            addCriterion("brand_model <>", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelGreaterThan(String value) {
            addCriterion("brand_model >", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelGreaterThanOrEqualTo(String value) {
            addCriterion("brand_model >=", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelLessThan(String value) {
            addCriterion("brand_model <", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelLessThanOrEqualTo(String value) {
            addCriterion("brand_model <=", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelLike(String value) {
            addCriterion("brand_model like", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelNotLike(String value) {
            addCriterion("brand_model not like", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelIn(List<String> values) {
            addCriterion("brand_model in", values, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelNotIn(List<String> values) {
            addCriterion("brand_model not in", values, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelBetween(String value1, String value2) {
            addCriterion("brand_model between", value1, value2, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelNotBetween(String value1, String value2) {
            addCriterion("brand_model not between", value1, value2, "brandModel");
            return (Criteria) this;
        }

        public Criteria andVehicleColorIsNull() {
            addCriterion("vehicle_color is null");
            return (Criteria) this;
        }

        public Criteria andVehicleColorIsNotNull() {
            addCriterion("vehicle_color is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleColorEqualTo(String value) {
            addCriterion("vehicle_color =", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorNotEqualTo(String value) {
            addCriterion("vehicle_color <>", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorGreaterThan(String value) {
            addCriterion("vehicle_color >", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_color >=", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorLessThan(String value) {
            addCriterion("vehicle_color <", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorLessThanOrEqualTo(String value) {
            addCriterion("vehicle_color <=", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorLike(String value) {
            addCriterion("vehicle_color like", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorNotLike(String value) {
            addCriterion("vehicle_color not like", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorIn(List<String> values) {
            addCriterion("vehicle_color in", values, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorNotIn(List<String> values) {
            addCriterion("vehicle_color not in", values, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorBetween(String value1, String value2) {
            addCriterion("vehicle_color between", value1, value2, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorNotBetween(String value1, String value2) {
            addCriterion("vehicle_color not between", value1, value2, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andIsEmployeeCarIsNull() {
            addCriterion("is_employee_car is null");
            return (Criteria) this;
        }

        public Criteria andIsEmployeeCarIsNotNull() {
            addCriterion("is_employee_car is not null");
            return (Criteria) this;
        }

        public Criteria andIsEmployeeCarEqualTo(String value) {
            addCriterion("is_employee_car =", value, "isEmployeeCar");
            return (Criteria) this;
        }

        public Criteria andIsEmployeeCarNotEqualTo(String value) {
            addCriterion("is_employee_car <>", value, "isEmployeeCar");
            return (Criteria) this;
        }

        public Criteria andIsEmployeeCarGreaterThan(String value) {
            addCriterion("is_employee_car >", value, "isEmployeeCar");
            return (Criteria) this;
        }

        public Criteria andIsEmployeeCarGreaterThanOrEqualTo(String value) {
            addCriterion("is_employee_car >=", value, "isEmployeeCar");
            return (Criteria) this;
        }

        public Criteria andIsEmployeeCarLessThan(String value) {
            addCriterion("is_employee_car <", value, "isEmployeeCar");
            return (Criteria) this;
        }

        public Criteria andIsEmployeeCarLessThanOrEqualTo(String value) {
            addCriterion("is_employee_car <=", value, "isEmployeeCar");
            return (Criteria) this;
        }

        public Criteria andIsEmployeeCarLike(String value) {
            addCriterion("is_employee_car like", value, "isEmployeeCar");
            return (Criteria) this;
        }

        public Criteria andIsEmployeeCarNotLike(String value) {
            addCriterion("is_employee_car not like", value, "isEmployeeCar");
            return (Criteria) this;
        }

        public Criteria andIsEmployeeCarIn(List<String> values) {
            addCriterion("is_employee_car in", values, "isEmployeeCar");
            return (Criteria) this;
        }

        public Criteria andIsEmployeeCarNotIn(List<String> values) {
            addCriterion("is_employee_car not in", values, "isEmployeeCar");
            return (Criteria) this;
        }

        public Criteria andIsEmployeeCarBetween(String value1, String value2) {
            addCriterion("is_employee_car between", value1, value2, "isEmployeeCar");
            return (Criteria) this;
        }

        public Criteria andIsEmployeeCarNotBetween(String value1, String value2) {
            addCriterion("is_employee_car not between", value1, value2, "isEmployeeCar");
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

        public Criteria andHkmacLicensePlateNoIsNull() {
            addCriterion("hkmac_license_plate_no is null");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoIsNotNull() {
            addCriterion("hkmac_license_plate_no is not null");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoEqualTo(String value) {
            addCriterion("hkmac_license_plate_no =", value, "hkmacLicensePlateNo");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoNotEqualTo(String value) {
            addCriterion("hkmac_license_plate_no <>", value, "hkmacLicensePlateNo");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoGreaterThan(String value) {
            addCriterion("hkmac_license_plate_no >", value, "hkmacLicensePlateNo");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoGreaterThanOrEqualTo(String value) {
            addCriterion("hkmac_license_plate_no >=", value, "hkmacLicensePlateNo");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoLessThan(String value) {
            addCriterion("hkmac_license_plate_no <", value, "hkmacLicensePlateNo");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoLessThanOrEqualTo(String value) {
            addCriterion("hkmac_license_plate_no <=", value, "hkmacLicensePlateNo");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoLike(String value) {
            addCriterion("hkmac_license_plate_no like", value, "hkmacLicensePlateNo");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoNotLike(String value) {
            addCriterion("hkmac_license_plate_no not like", value, "hkmacLicensePlateNo");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoIn(List<String> values) {
            addCriterion("hkmac_license_plate_no in", values, "hkmacLicensePlateNo");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoNotIn(List<String> values) {
            addCriterion("hkmac_license_plate_no not in", values, "hkmacLicensePlateNo");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoBetween(String value1, String value2) {
            addCriterion("hkmac_license_plate_no between", value1, value2, "hkmacLicensePlateNo");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoNotBetween(String value1, String value2) {
            addCriterion("hkmac_license_plate_no not between", value1, value2, "hkmacLicensePlateNo");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeIsNull() {
            addCriterion("car_kind_code is null");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeIsNotNull() {
            addCriterion("car_kind_code is not null");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeEqualTo(String value) {
            addCriterion("car_kind_code =", value, "carKindCode");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeNotEqualTo(String value) {
            addCriterion("car_kind_code <>", value, "carKindCode");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeGreaterThan(String value) {
            addCriterion("car_kind_code >", value, "carKindCode");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeGreaterThanOrEqualTo(String value) {
            addCriterion("car_kind_code >=", value, "carKindCode");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeLessThan(String value) {
            addCriterion("car_kind_code <", value, "carKindCode");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeLessThanOrEqualTo(String value) {
            addCriterion("car_kind_code <=", value, "carKindCode");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeLike(String value) {
            addCriterion("car_kind_code like", value, "carKindCode");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeNotLike(String value) {
            addCriterion("car_kind_code not like", value, "carKindCode");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeIn(List<String> values) {
            addCriterion("car_kind_code in", values, "carKindCode");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeNotIn(List<String> values) {
            addCriterion("car_kind_code not in", values, "carKindCode");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeBetween(String value1, String value2) {
            addCriterion("car_kind_code between", value1, value2, "carKindCode");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeNotBetween(String value1, String value2) {
            addCriterion("car_kind_code not between", value1, value2, "carKindCode");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeIsNull() {
            addCriterion("veh_type_code is null");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeIsNotNull() {
            addCriterion("veh_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeEqualTo(String value) {
            addCriterion("veh_type_code =", value, "vehTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeNotEqualTo(String value) {
            addCriterion("veh_type_code <>", value, "vehTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeGreaterThan(String value) {
            addCriterion("veh_type_code >", value, "vehTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("veh_type_code >=", value, "vehTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeLessThan(String value) {
            addCriterion("veh_type_code <", value, "vehTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("veh_type_code <=", value, "vehTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeLike(String value) {
            addCriterion("veh_type_code like", value, "vehTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeNotLike(String value) {
            addCriterion("veh_type_code not like", value, "vehTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeIn(List<String> values) {
            addCriterion("veh_type_code in", values, "vehTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeNotIn(List<String> values) {
            addCriterion("veh_type_code not in", values, "vehTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeBetween(String value1, String value2) {
            addCriterion("veh_type_code between", value1, value2, "vehTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeNotBetween(String value1, String value2) {
            addCriterion("veh_type_code not between", value1, value2, "vehTypeCode");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeIsNull() {
            addCriterion("body_type_code is null");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeIsNotNull() {
            addCriterion("body_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeEqualTo(String value) {
            addCriterion("body_type_code =", value, "bodyTypeCode");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeNotEqualTo(String value) {
            addCriterion("body_type_code <>", value, "bodyTypeCode");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeGreaterThan(String value) {
            addCriterion("body_type_code >", value, "bodyTypeCode");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("body_type_code >=", value, "bodyTypeCode");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeLessThan(String value) {
            addCriterion("body_type_code <", value, "bodyTypeCode");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("body_type_code <=", value, "bodyTypeCode");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeLike(String value) {
            addCriterion("body_type_code like", value, "bodyTypeCode");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeNotLike(String value) {
            addCriterion("body_type_code not like", value, "bodyTypeCode");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeIn(List<String> values) {
            addCriterion("body_type_code in", values, "bodyTypeCode");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeNotIn(List<String> values) {
            addCriterion("body_type_code not in", values, "bodyTypeCode");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeBetween(String value1, String value2) {
            addCriterion("body_type_code between", value1, value2, "bodyTypeCode");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeNotBetween(String value1, String value2) {
            addCriterion("body_type_code not between", value1, value2, "bodyTypeCode");
            return (Criteria) this;
        }

        public Criteria andUsedYearsIsNull() {
            addCriterion("used_years is null");
            return (Criteria) this;
        }

        public Criteria andUsedYearsIsNotNull() {
            addCriterion("used_years is not null");
            return (Criteria) this;
        }

        public Criteria andUsedYearsEqualTo(Byte value) {
            addCriterion("used_years =", value, "usedYears");
            return (Criteria) this;
        }

        public Criteria andUsedYearsNotEqualTo(Byte value) {
            addCriterion("used_years <>", value, "usedYears");
            return (Criteria) this;
        }

        public Criteria andUsedYearsGreaterThan(Byte value) {
            addCriterion("used_years >", value, "usedYears");
            return (Criteria) this;
        }

        public Criteria andUsedYearsGreaterThanOrEqualTo(Byte value) {
            addCriterion("used_years >=", value, "usedYears");
            return (Criteria) this;
        }

        public Criteria andUsedYearsLessThan(Byte value) {
            addCriterion("used_years <", value, "usedYears");
            return (Criteria) this;
        }

        public Criteria andUsedYearsLessThanOrEqualTo(Byte value) {
            addCriterion("used_years <=", value, "usedYears");
            return (Criteria) this;
        }

        public Criteria andUsedYearsIn(List<Byte> values) {
            addCriterion("used_years in", values, "usedYears");
            return (Criteria) this;
        }

        public Criteria andUsedYearsNotIn(List<Byte> values) {
            addCriterion("used_years not in", values, "usedYears");
            return (Criteria) this;
        }

        public Criteria andUsedYearsBetween(Byte value1, Byte value2) {
            addCriterion("used_years between", value1, value2, "usedYears");
            return (Criteria) this;
        }

        public Criteria andUsedYearsNotBetween(Byte value1, Byte value2) {
            addCriterion("used_years not between", value1, value2, "usedYears");
            return (Criteria) this;
        }

        public Criteria andImportDomesticIsNull() {
            addCriterion("import_domestic is null");
            return (Criteria) this;
        }

        public Criteria andImportDomesticIsNotNull() {
            addCriterion("import_domestic is not null");
            return (Criteria) this;
        }

        public Criteria andImportDomesticEqualTo(String value) {
            addCriterion("import_domestic =", value, "importDomestic");
            return (Criteria) this;
        }

        public Criteria andImportDomesticNotEqualTo(String value) {
            addCriterion("import_domestic <>", value, "importDomestic");
            return (Criteria) this;
        }

        public Criteria andImportDomesticGreaterThan(String value) {
            addCriterion("import_domestic >", value, "importDomestic");
            return (Criteria) this;
        }

        public Criteria andImportDomesticGreaterThanOrEqualTo(String value) {
            addCriterion("import_domestic >=", value, "importDomestic");
            return (Criteria) this;
        }

        public Criteria andImportDomesticLessThan(String value) {
            addCriterion("import_domestic <", value, "importDomestic");
            return (Criteria) this;
        }

        public Criteria andImportDomesticLessThanOrEqualTo(String value) {
            addCriterion("import_domestic <=", value, "importDomestic");
            return (Criteria) this;
        }

        public Criteria andImportDomesticLike(String value) {
            addCriterion("import_domestic like", value, "importDomestic");
            return (Criteria) this;
        }

        public Criteria andImportDomesticNotLike(String value) {
            addCriterion("import_domestic not like", value, "importDomestic");
            return (Criteria) this;
        }

        public Criteria andImportDomesticIn(List<String> values) {
            addCriterion("import_domestic in", values, "importDomestic");
            return (Criteria) this;
        }

        public Criteria andImportDomesticNotIn(List<String> values) {
            addCriterion("import_domestic not in", values, "importDomestic");
            return (Criteria) this;
        }

        public Criteria andImportDomesticBetween(String value1, String value2) {
            addCriterion("import_domestic between", value1, value2, "importDomestic");
            return (Criteria) this;
        }

        public Criteria andImportDomesticNotBetween(String value1, String value2) {
            addCriterion("import_domestic not between", value1, value2, "importDomestic");
            return (Criteria) this;
        }

        public Criteria andVehicleFrameNoIsNull() {
            addCriterion("vehicle_frame_no is null");
            return (Criteria) this;
        }

        public Criteria andVehicleFrameNoIsNotNull() {
            addCriterion("vehicle_frame_no is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleFrameNoEqualTo(String value) {
            addCriterion("vehicle_frame_no =", value, "vehicleFrameNo");
            return (Criteria) this;
        }

        public Criteria andVehicleFrameNoNotEqualTo(String value) {
            addCriterion("vehicle_frame_no <>", value, "vehicleFrameNo");
            return (Criteria) this;
        }

        public Criteria andVehicleFrameNoGreaterThan(String value) {
            addCriterion("vehicle_frame_no >", value, "vehicleFrameNo");
            return (Criteria) this;
        }

        public Criteria andVehicleFrameNoGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_frame_no >=", value, "vehicleFrameNo");
            return (Criteria) this;
        }

        public Criteria andVehicleFrameNoLessThan(String value) {
            addCriterion("vehicle_frame_no <", value, "vehicleFrameNo");
            return (Criteria) this;
        }

        public Criteria andVehicleFrameNoLessThanOrEqualTo(String value) {
            addCriterion("vehicle_frame_no <=", value, "vehicleFrameNo");
            return (Criteria) this;
        }

        public Criteria andVehicleFrameNoLike(String value) {
            addCriterion("vehicle_frame_no like", value, "vehicleFrameNo");
            return (Criteria) this;
        }

        public Criteria andVehicleFrameNoNotLike(String value) {
            addCriterion("vehicle_frame_no not like", value, "vehicleFrameNo");
            return (Criteria) this;
        }

        public Criteria andVehicleFrameNoIn(List<String> values) {
            addCriterion("vehicle_frame_no in", values, "vehicleFrameNo");
            return (Criteria) this;
        }

        public Criteria andVehicleFrameNoNotIn(List<String> values) {
            addCriterion("vehicle_frame_no not in", values, "vehicleFrameNo");
            return (Criteria) this;
        }

        public Criteria andVehicleFrameNoBetween(String value1, String value2) {
            addCriterion("vehicle_frame_no between", value1, value2, "vehicleFrameNo");
            return (Criteria) this;
        }

        public Criteria andVehicleFrameNoNotBetween(String value1, String value2) {
            addCriterion("vehicle_frame_no not between", value1, value2, "vehicleFrameNo");
            return (Criteria) this;
        }

        public Criteria andInsuredGenderIsNull() {
            addCriterion("insured_gender is null");
            return (Criteria) this;
        }

        public Criteria andInsuredGenderIsNotNull() {
            addCriterion("insured_gender is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredGenderEqualTo(String value) {
            addCriterion("insured_gender =", value, "insuredGender");
            return (Criteria) this;
        }

        public Criteria andInsuredGenderNotEqualTo(String value) {
            addCriterion("insured_gender <>", value, "insuredGender");
            return (Criteria) this;
        }

        public Criteria andInsuredGenderGreaterThan(String value) {
            addCriterion("insured_gender >", value, "insuredGender");
            return (Criteria) this;
        }

        public Criteria andInsuredGenderGreaterThanOrEqualTo(String value) {
            addCriterion("insured_gender >=", value, "insuredGender");
            return (Criteria) this;
        }

        public Criteria andInsuredGenderLessThan(String value) {
            addCriterion("insured_gender <", value, "insuredGender");
            return (Criteria) this;
        }

        public Criteria andInsuredGenderLessThanOrEqualTo(String value) {
            addCriterion("insured_gender <=", value, "insuredGender");
            return (Criteria) this;
        }

        public Criteria andInsuredGenderLike(String value) {
            addCriterion("insured_gender like", value, "insuredGender");
            return (Criteria) this;
        }

        public Criteria andInsuredGenderNotLike(String value) {
            addCriterion("insured_gender not like", value, "insuredGender");
            return (Criteria) this;
        }

        public Criteria andInsuredGenderIn(List<String> values) {
            addCriterion("insured_gender in", values, "insuredGender");
            return (Criteria) this;
        }

        public Criteria andInsuredGenderNotIn(List<String> values) {
            addCriterion("insured_gender not in", values, "insuredGender");
            return (Criteria) this;
        }

        public Criteria andInsuredGenderBetween(String value1, String value2) {
            addCriterion("insured_gender between", value1, value2, "insuredGender");
            return (Criteria) this;
        }

        public Criteria andInsuredGenderNotBetween(String value1, String value2) {
            addCriterion("insured_gender not between", value1, value2, "insuredGender");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyTypeIsNull() {
            addCriterion("insured_identify_type is null");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyTypeIsNotNull() {
            addCriterion("insured_identify_type is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyTypeEqualTo(String value) {
            addCriterion("insured_identify_type =", value, "insuredIdentifyType");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyTypeNotEqualTo(String value) {
            addCriterion("insured_identify_type <>", value, "insuredIdentifyType");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyTypeGreaterThan(String value) {
            addCriterion("insured_identify_type >", value, "insuredIdentifyType");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("insured_identify_type >=", value, "insuredIdentifyType");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyTypeLessThan(String value) {
            addCriterion("insured_identify_type <", value, "insuredIdentifyType");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyTypeLessThanOrEqualTo(String value) {
            addCriterion("insured_identify_type <=", value, "insuredIdentifyType");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyTypeLike(String value) {
            addCriterion("insured_identify_type like", value, "insuredIdentifyType");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyTypeNotLike(String value) {
            addCriterion("insured_identify_type not like", value, "insuredIdentifyType");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyTypeIn(List<String> values) {
            addCriterion("insured_identify_type in", values, "insuredIdentifyType");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyTypeNotIn(List<String> values) {
            addCriterion("insured_identify_type not in", values, "insuredIdentifyType");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyTypeBetween(String value1, String value2) {
            addCriterion("insured_identify_type between", value1, value2, "insuredIdentifyType");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyTypeNotBetween(String value1, String value2) {
            addCriterion("insured_identify_type not between", value1, value2, "insuredIdentifyType");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyNoIsNull() {
            addCriterion("insured_identify_no is null");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyNoIsNotNull() {
            addCriterion("insured_identify_no is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyNoEqualTo(String value) {
            addCriterion("insured_identify_no =", value, "insuredIdentifyNo");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyNoNotEqualTo(String value) {
            addCriterion("insured_identify_no <>", value, "insuredIdentifyNo");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyNoGreaterThan(String value) {
            addCriterion("insured_identify_no >", value, "insuredIdentifyNo");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyNoGreaterThanOrEqualTo(String value) {
            addCriterion("insured_identify_no >=", value, "insuredIdentifyNo");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyNoLessThan(String value) {
            addCriterion("insured_identify_no <", value, "insuredIdentifyNo");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyNoLessThanOrEqualTo(String value) {
            addCriterion("insured_identify_no <=", value, "insuredIdentifyNo");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyNoLike(String value) {
            addCriterion("insured_identify_no like", value, "insuredIdentifyNo");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyNoNotLike(String value) {
            addCriterion("insured_identify_no not like", value, "insuredIdentifyNo");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyNoIn(List<String> values) {
            addCriterion("insured_identify_no in", values, "insuredIdentifyNo");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyNoNotIn(List<String> values) {
            addCriterion("insured_identify_no not in", values, "insuredIdentifyNo");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyNoBetween(String value1, String value2) {
            addCriterion("insured_identify_no between", value1, value2, "insuredIdentifyNo");
            return (Criteria) this;
        }

        public Criteria andInsuredIdentifyNoNotBetween(String value1, String value2) {
            addCriterion("insured_identify_no not between", value1, value2, "insuredIdentifyNo");
            return (Criteria) this;
        }

        public Criteria andInsuredLevelIsNull() {
            addCriterion("insured_level is null");
            return (Criteria) this;
        }

        public Criteria andInsuredLevelIsNotNull() {
            addCriterion("insured_level is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredLevelEqualTo(String value) {
            addCriterion("insured_level =", value, "insuredLevel");
            return (Criteria) this;
        }

        public Criteria andInsuredLevelNotEqualTo(String value) {
            addCriterion("insured_level <>", value, "insuredLevel");
            return (Criteria) this;
        }

        public Criteria andInsuredLevelGreaterThan(String value) {
            addCriterion("insured_level >", value, "insuredLevel");
            return (Criteria) this;
        }

        public Criteria andInsuredLevelGreaterThanOrEqualTo(String value) {
            addCriterion("insured_level >=", value, "insuredLevel");
            return (Criteria) this;
        }

        public Criteria andInsuredLevelLessThan(String value) {
            addCriterion("insured_level <", value, "insuredLevel");
            return (Criteria) this;
        }

        public Criteria andInsuredLevelLessThanOrEqualTo(String value) {
            addCriterion("insured_level <=", value, "insuredLevel");
            return (Criteria) this;
        }

        public Criteria andInsuredLevelLike(String value) {
            addCriterion("insured_level like", value, "insuredLevel");
            return (Criteria) this;
        }

        public Criteria andInsuredLevelNotLike(String value) {
            addCriterion("insured_level not like", value, "insuredLevel");
            return (Criteria) this;
        }

        public Criteria andInsuredLevelIn(List<String> values) {
            addCriterion("insured_level in", values, "insuredLevel");
            return (Criteria) this;
        }

        public Criteria andInsuredLevelNotIn(List<String> values) {
            addCriterion("insured_level not in", values, "insuredLevel");
            return (Criteria) this;
        }

        public Criteria andInsuredLevelBetween(String value1, String value2) {
            addCriterion("insured_level between", value1, value2, "insuredLevel");
            return (Criteria) this;
        }

        public Criteria andInsuredLevelNotBetween(String value1, String value2) {
            addCriterion("insured_level not between", value1, value2, "insuredLevel");
            return (Criteria) this;
        }

        public Criteria andInsuredMobilephoneIsNull() {
            addCriterion("insured_mobilephone is null");
            return (Criteria) this;
        }

        public Criteria andInsuredMobilephoneIsNotNull() {
            addCriterion("insured_mobilephone is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredMobilephoneEqualTo(String value) {
            addCriterion("insured_mobilephone =", value, "insuredMobilephone");
            return (Criteria) this;
        }

        public Criteria andInsuredMobilephoneNotEqualTo(String value) {
            addCriterion("insured_mobilephone <>", value, "insuredMobilephone");
            return (Criteria) this;
        }

        public Criteria andInsuredMobilephoneGreaterThan(String value) {
            addCriterion("insured_mobilephone >", value, "insuredMobilephone");
            return (Criteria) this;
        }

        public Criteria andInsuredMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("insured_mobilephone >=", value, "insuredMobilephone");
            return (Criteria) this;
        }

        public Criteria andInsuredMobilephoneLessThan(String value) {
            addCriterion("insured_mobilephone <", value, "insuredMobilephone");
            return (Criteria) this;
        }

        public Criteria andInsuredMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("insured_mobilephone <=", value, "insuredMobilephone");
            return (Criteria) this;
        }

        public Criteria andInsuredMobilephoneLike(String value) {
            addCriterion("insured_mobilephone like", value, "insuredMobilephone");
            return (Criteria) this;
        }

        public Criteria andInsuredMobilephoneNotLike(String value) {
            addCriterion("insured_mobilephone not like", value, "insuredMobilephone");
            return (Criteria) this;
        }

        public Criteria andInsuredMobilephoneIn(List<String> values) {
            addCriterion("insured_mobilephone in", values, "insuredMobilephone");
            return (Criteria) this;
        }

        public Criteria andInsuredMobilephoneNotIn(List<String> values) {
            addCriterion("insured_mobilephone not in", values, "insuredMobilephone");
            return (Criteria) this;
        }

        public Criteria andInsuredMobilephoneBetween(String value1, String value2) {
            addCriterion("insured_mobilephone between", value1, value2, "insuredMobilephone");
            return (Criteria) this;
        }

        public Criteria andInsuredMobilephoneNotBetween(String value1, String value2) {
            addCriterion("insured_mobilephone not between", value1, value2, "insuredMobilephone");
            return (Criteria) this;
        }

        public Criteria andInsuredAddressIsNull() {
            addCriterion("insured_address is null");
            return (Criteria) this;
        }

        public Criteria andInsuredAddressIsNotNull() {
            addCriterion("insured_address is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredAddressEqualTo(String value) {
            addCriterion("insured_address =", value, "insuredAddress");
            return (Criteria) this;
        }

        public Criteria andInsuredAddressNotEqualTo(String value) {
            addCriterion("insured_address <>", value, "insuredAddress");
            return (Criteria) this;
        }

        public Criteria andInsuredAddressGreaterThan(String value) {
            addCriterion("insured_address >", value, "insuredAddress");
            return (Criteria) this;
        }

        public Criteria andInsuredAddressGreaterThanOrEqualTo(String value) {
            addCriterion("insured_address >=", value, "insuredAddress");
            return (Criteria) this;
        }

        public Criteria andInsuredAddressLessThan(String value) {
            addCriterion("insured_address <", value, "insuredAddress");
            return (Criteria) this;
        }

        public Criteria andInsuredAddressLessThanOrEqualTo(String value) {
            addCriterion("insured_address <=", value, "insuredAddress");
            return (Criteria) this;
        }

        public Criteria andInsuredAddressLike(String value) {
            addCriterion("insured_address like", value, "insuredAddress");
            return (Criteria) this;
        }

        public Criteria andInsuredAddressNotLike(String value) {
            addCriterion("insured_address not like", value, "insuredAddress");
            return (Criteria) this;
        }

        public Criteria andInsuredAddressIn(List<String> values) {
            addCriterion("insured_address in", values, "insuredAddress");
            return (Criteria) this;
        }

        public Criteria andInsuredAddressNotIn(List<String> values) {
            addCriterion("insured_address not in", values, "insuredAddress");
            return (Criteria) this;
        }

        public Criteria andInsuredAddressBetween(String value1, String value2) {
            addCriterion("insured_address between", value1, value2, "insuredAddress");
            return (Criteria) this;
        }

        public Criteria andInsuredAddressNotBetween(String value1, String value2) {
            addCriterion("insured_address not between", value1, value2, "insuredAddress");
            return (Criteria) this;
        }

        public Criteria andInsuredNameIsNull() {
            addCriterion("insured_name is null");
            return (Criteria) this;
        }

        public Criteria andInsuredNameIsNotNull() {
            addCriterion("insured_name is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredNameEqualTo(String value) {
            addCriterion("insured_name =", value, "insuredName");
            return (Criteria) this;
        }

        public Criteria andInsuredNameNotEqualTo(String value) {
            addCriterion("insured_name <>", value, "insuredName");
            return (Criteria) this;
        }

        public Criteria andInsuredNameGreaterThan(String value) {
            addCriterion("insured_name >", value, "insuredName");
            return (Criteria) this;
        }

        public Criteria andInsuredNameGreaterThanOrEqualTo(String value) {
            addCriterion("insured_name >=", value, "insuredName");
            return (Criteria) this;
        }

        public Criteria andInsuredNameLessThan(String value) {
            addCriterion("insured_name <", value, "insuredName");
            return (Criteria) this;
        }

        public Criteria andInsuredNameLessThanOrEqualTo(String value) {
            addCriterion("insured_name <=", value, "insuredName");
            return (Criteria) this;
        }

        public Criteria andInsuredNameLike(String value) {
            addCriterion("insured_name like", value, "insuredName");
            return (Criteria) this;
        }

        public Criteria andInsuredNameNotLike(String value) {
            addCriterion("insured_name not like", value, "insuredName");
            return (Criteria) this;
        }

        public Criteria andInsuredNameIn(List<String> values) {
            addCriterion("insured_name in", values, "insuredName");
            return (Criteria) this;
        }

        public Criteria andInsuredNameNotIn(List<String> values) {
            addCriterion("insured_name not in", values, "insuredName");
            return (Criteria) this;
        }

        public Criteria andInsuredNameBetween(String value1, String value2) {
            addCriterion("insured_name between", value1, value2, "insuredName");
            return (Criteria) this;
        }

        public Criteria andInsuredNameNotBetween(String value1, String value2) {
            addCriterion("insured_name not between", value1, value2, "insuredName");
            return (Criteria) this;
        }

        public Criteria andInsuredUnitNatureIsNull() {
            addCriterion("insured_unit_nature is null");
            return (Criteria) this;
        }

        public Criteria andInsuredUnitNatureIsNotNull() {
            addCriterion("insured_unit_nature is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredUnitNatureEqualTo(String value) {
            addCriterion("insured_unit_nature =", value, "insuredUnitNature");
            return (Criteria) this;
        }

        public Criteria andInsuredUnitNatureNotEqualTo(String value) {
            addCriterion("insured_unit_nature <>", value, "insuredUnitNature");
            return (Criteria) this;
        }

        public Criteria andInsuredUnitNatureGreaterThan(String value) {
            addCriterion("insured_unit_nature >", value, "insuredUnitNature");
            return (Criteria) this;
        }

        public Criteria andInsuredUnitNatureGreaterThanOrEqualTo(String value) {
            addCriterion("insured_unit_nature >=", value, "insuredUnitNature");
            return (Criteria) this;
        }

        public Criteria andInsuredUnitNatureLessThan(String value) {
            addCriterion("insured_unit_nature <", value, "insuredUnitNature");
            return (Criteria) this;
        }

        public Criteria andInsuredUnitNatureLessThanOrEqualTo(String value) {
            addCriterion("insured_unit_nature <=", value, "insuredUnitNature");
            return (Criteria) this;
        }

        public Criteria andInsuredUnitNatureLike(String value) {
            addCriterion("insured_unit_nature like", value, "insuredUnitNature");
            return (Criteria) this;
        }

        public Criteria andInsuredUnitNatureNotLike(String value) {
            addCriterion("insured_unit_nature not like", value, "insuredUnitNature");
            return (Criteria) this;
        }

        public Criteria andInsuredUnitNatureIn(List<String> values) {
            addCriterion("insured_unit_nature in", values, "insuredUnitNature");
            return (Criteria) this;
        }

        public Criteria andInsuredUnitNatureNotIn(List<String> values) {
            addCriterion("insured_unit_nature not in", values, "insuredUnitNature");
            return (Criteria) this;
        }

        public Criteria andInsuredUnitNatureBetween(String value1, String value2) {
            addCriterion("insured_unit_nature between", value1, value2, "insuredUnitNature");
            return (Criteria) this;
        }

        public Criteria andInsuredUnitNatureNotBetween(String value1, String value2) {
            addCriterion("insured_unit_nature not between", value1, value2, "insuredUnitNature");
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

        public Criteria andAgencyNameIsNull() {
            addCriterion("agency_name is null");
            return (Criteria) this;
        }

        public Criteria andAgencyNameIsNotNull() {
            addCriterion("agency_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyNameEqualTo(String value) {
            addCriterion("agency_name =", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameNotEqualTo(String value) {
            addCriterion("agency_name <>", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameGreaterThan(String value) {
            addCriterion("agency_name >", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameGreaterThanOrEqualTo(String value) {
            addCriterion("agency_name >=", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameLessThan(String value) {
            addCriterion("agency_name <", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameLessThanOrEqualTo(String value) {
            addCriterion("agency_name <=", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameLike(String value) {
            addCriterion("agency_name like", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameNotLike(String value) {
            addCriterion("agency_name not like", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameIn(List<String> values) {
            addCriterion("agency_name in", values, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameNotIn(List<String> values) {
            addCriterion("agency_name not in", values, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameBetween(String value1, String value2) {
            addCriterion("agency_name between", value1, value2, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameNotBetween(String value1, String value2) {
            addCriterion("agency_name not between", value1, value2, "agencyName");
            return (Criteria) this;
        }

        public Criteria andContinuousYearsIsNull() {
            addCriterion("continuous_years is null");
            return (Criteria) this;
        }

        public Criteria andContinuousYearsIsNotNull() {
            addCriterion("continuous_years is not null");
            return (Criteria) this;
        }

        public Criteria andContinuousYearsEqualTo(Integer value) {
            addCriterion("continuous_years =", value, "continuousYears");
            return (Criteria) this;
        }

        public Criteria andContinuousYearsNotEqualTo(Integer value) {
            addCriterion("continuous_years <>", value, "continuousYears");
            return (Criteria) this;
        }

        public Criteria andContinuousYearsGreaterThan(Integer value) {
            addCriterion("continuous_years >", value, "continuousYears");
            return (Criteria) this;
        }

        public Criteria andContinuousYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("continuous_years >=", value, "continuousYears");
            return (Criteria) this;
        }

        public Criteria andContinuousYearsLessThan(Integer value) {
            addCriterion("continuous_years <", value, "continuousYears");
            return (Criteria) this;
        }

        public Criteria andContinuousYearsLessThanOrEqualTo(Integer value) {
            addCriterion("continuous_years <=", value, "continuousYears");
            return (Criteria) this;
        }

        public Criteria andContinuousYearsIn(List<Integer> values) {
            addCriterion("continuous_years in", values, "continuousYears");
            return (Criteria) this;
        }

        public Criteria andContinuousYearsNotIn(List<Integer> values) {
            addCriterion("continuous_years not in", values, "continuousYears");
            return (Criteria) this;
        }

        public Criteria andContinuousYearsBetween(Integer value1, Integer value2) {
            addCriterion("continuous_years between", value1, value2, "continuousYears");
            return (Criteria) this;
        }

        public Criteria andContinuousYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("continuous_years not between", value1, value2, "continuousYears");
            return (Criteria) this;
        }

        public Criteria andPolicyNoHistIsNull() {
            addCriterion("policy_no_hist is null");
            return (Criteria) this;
        }

        public Criteria andPolicyNoHistIsNotNull() {
            addCriterion("policy_no_hist is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyNoHistEqualTo(String value) {
            addCriterion("policy_no_hist =", value, "policyNoHist");
            return (Criteria) this;
        }

        public Criteria andPolicyNoHistNotEqualTo(String value) {
            addCriterion("policy_no_hist <>", value, "policyNoHist");
            return (Criteria) this;
        }

        public Criteria andPolicyNoHistGreaterThan(String value) {
            addCriterion("policy_no_hist >", value, "policyNoHist");
            return (Criteria) this;
        }

        public Criteria andPolicyNoHistGreaterThanOrEqualTo(String value) {
            addCriterion("policy_no_hist >=", value, "policyNoHist");
            return (Criteria) this;
        }

        public Criteria andPolicyNoHistLessThan(String value) {
            addCriterion("policy_no_hist <", value, "policyNoHist");
            return (Criteria) this;
        }

        public Criteria andPolicyNoHistLessThanOrEqualTo(String value) {
            addCriterion("policy_no_hist <=", value, "policyNoHist");
            return (Criteria) this;
        }

        public Criteria andPolicyNoHistLike(String value) {
            addCriterion("policy_no_hist like", value, "policyNoHist");
            return (Criteria) this;
        }

        public Criteria andPolicyNoHistNotLike(String value) {
            addCriterion("policy_no_hist not like", value, "policyNoHist");
            return (Criteria) this;
        }

        public Criteria andPolicyNoHistIn(List<String> values) {
            addCriterion("policy_no_hist in", values, "policyNoHist");
            return (Criteria) this;
        }

        public Criteria andPolicyNoHistNotIn(List<String> values) {
            addCriterion("policy_no_hist not in", values, "policyNoHist");
            return (Criteria) this;
        }

        public Criteria andPolicyNoHistBetween(String value1, String value2) {
            addCriterion("policy_no_hist between", value1, value2, "policyNoHist");
            return (Criteria) this;
        }

        public Criteria andPolicyNoHistNotBetween(String value1, String value2) {
            addCriterion("policy_no_hist not between", value1, value2, "policyNoHist");
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