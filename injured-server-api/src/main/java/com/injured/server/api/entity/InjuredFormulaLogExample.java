package com.injured.server.api.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InjuredFormulaLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InjuredFormulaLogExample() {
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Long value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Long value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Long value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Long value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Long> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Long> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Long value1, Long value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andFastInfoIdIsNull() {
            addCriterion("fast_info_id is null");
            return (Criteria) this;
        }

        public Criteria andFastInfoIdIsNotNull() {
            addCriterion("fast_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andFastInfoIdEqualTo(Long value) {
            addCriterion("fast_info_id =", value, "fastInfoId");
            return (Criteria) this;
        }

        public Criteria andFastInfoIdNotEqualTo(Long value) {
            addCriterion("fast_info_id <>", value, "fastInfoId");
            return (Criteria) this;
        }

        public Criteria andFastInfoIdGreaterThan(Long value) {
            addCriterion("fast_info_id >", value, "fastInfoId");
            return (Criteria) this;
        }

        public Criteria andFastInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("fast_info_id >=", value, "fastInfoId");
            return (Criteria) this;
        }

        public Criteria andFastInfoIdLessThan(Long value) {
            addCriterion("fast_info_id <", value, "fastInfoId");
            return (Criteria) this;
        }

        public Criteria andFastInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("fast_info_id <=", value, "fastInfoId");
            return (Criteria) this;
        }

        public Criteria andFastInfoIdIn(List<Long> values) {
            addCriterion("fast_info_id in", values, "fastInfoId");
            return (Criteria) this;
        }

        public Criteria andFastInfoIdNotIn(List<Long> values) {
            addCriterion("fast_info_id not in", values, "fastInfoId");
            return (Criteria) this;
        }

        public Criteria andFastInfoIdBetween(Long value1, Long value2) {
            addCriterion("fast_info_id between", value1, value2, "fastInfoId");
            return (Criteria) this;
        }

        public Criteria andFastInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("fast_info_id not between", value1, value2, "fastInfoId");
            return (Criteria) this;
        }

        public Criteria andDamageNameIsNull() {
            addCriterion("damage_name is null");
            return (Criteria) this;
        }

        public Criteria andDamageNameIsNotNull() {
            addCriterion("damage_name is not null");
            return (Criteria) this;
        }

        public Criteria andDamageNameEqualTo(String value) {
            addCriterion("damage_name =", value, "damageName");
            return (Criteria) this;
        }

        public Criteria andDamageNameNotEqualTo(String value) {
            addCriterion("damage_name <>", value, "damageName");
            return (Criteria) this;
        }

        public Criteria andDamageNameGreaterThan(String value) {
            addCriterion("damage_name >", value, "damageName");
            return (Criteria) this;
        }

        public Criteria andDamageNameGreaterThanOrEqualTo(String value) {
            addCriterion("damage_name >=", value, "damageName");
            return (Criteria) this;
        }

        public Criteria andDamageNameLessThan(String value) {
            addCriterion("damage_name <", value, "damageName");
            return (Criteria) this;
        }

        public Criteria andDamageNameLessThanOrEqualTo(String value) {
            addCriterion("damage_name <=", value, "damageName");
            return (Criteria) this;
        }

        public Criteria andDamageNameLike(String value) {
            addCriterion("damage_name like", value, "damageName");
            return (Criteria) this;
        }

        public Criteria andDamageNameNotLike(String value) {
            addCriterion("damage_name not like", value, "damageName");
            return (Criteria) this;
        }

        public Criteria andDamageNameIn(List<String> values) {
            addCriterion("damage_name in", values, "damageName");
            return (Criteria) this;
        }

        public Criteria andDamageNameNotIn(List<String> values) {
            addCriterion("damage_name not in", values, "damageName");
            return (Criteria) this;
        }

        public Criteria andDamageNameBetween(String value1, String value2) {
            addCriterion("damage_name between", value1, value2, "damageName");
            return (Criteria) this;
        }

        public Criteria andDamageNameNotBetween(String value1, String value2) {
            addCriterion("damage_name not between", value1, value2, "damageName");
            return (Criteria) this;
        }

        public Criteria andDamageNoIsNull() {
            addCriterion("damage_no is null");
            return (Criteria) this;
        }

        public Criteria andDamageNoIsNotNull() {
            addCriterion("damage_no is not null");
            return (Criteria) this;
        }

        public Criteria andDamageNoEqualTo(String value) {
            addCriterion("damage_no =", value, "damageNo");
            return (Criteria) this;
        }

        public Criteria andDamageNoNotEqualTo(String value) {
            addCriterion("damage_no <>", value, "damageNo");
            return (Criteria) this;
        }

        public Criteria andDamageNoGreaterThan(String value) {
            addCriterion("damage_no >", value, "damageNo");
            return (Criteria) this;
        }

        public Criteria andDamageNoGreaterThanOrEqualTo(String value) {
            addCriterion("damage_no >=", value, "damageNo");
            return (Criteria) this;
        }

        public Criteria andDamageNoLessThan(String value) {
            addCriterion("damage_no <", value, "damageNo");
            return (Criteria) this;
        }

        public Criteria andDamageNoLessThanOrEqualTo(String value) {
            addCriterion("damage_no <=", value, "damageNo");
            return (Criteria) this;
        }

        public Criteria andDamageNoLike(String value) {
            addCriterion("damage_no like", value, "damageNo");
            return (Criteria) this;
        }

        public Criteria andDamageNoNotLike(String value) {
            addCriterion("damage_no not like", value, "damageNo");
            return (Criteria) this;
        }

        public Criteria andDamageNoIn(List<String> values) {
            addCriterion("damage_no in", values, "damageNo");
            return (Criteria) this;
        }

        public Criteria andDamageNoNotIn(List<String> values) {
            addCriterion("damage_no not in", values, "damageNo");
            return (Criteria) this;
        }

        public Criteria andDamageNoBetween(String value1, String value2) {
            addCriterion("damage_no between", value1, value2, "damageNo");
            return (Criteria) this;
        }

        public Criteria andDamageNoNotBetween(String value1, String value2) {
            addCriterion("damage_no not between", value1, value2, "damageNo");
            return (Criteria) this;
        }

        public Criteria andMedicalFeeIsNull() {
            addCriterion("medical_fee is null");
            return (Criteria) this;
        }

        public Criteria andMedicalFeeIsNotNull() {
            addCriterion("medical_fee is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalFeeEqualTo(BigDecimal value) {
            addCriterion("medical_fee =", value, "medicalFee");
            return (Criteria) this;
        }

        public Criteria andMedicalFeeNotEqualTo(BigDecimal value) {
            addCriterion("medical_fee <>", value, "medicalFee");
            return (Criteria) this;
        }

        public Criteria andMedicalFeeGreaterThan(BigDecimal value) {
            addCriterion("medical_fee >", value, "medicalFee");
            return (Criteria) this;
        }

        public Criteria andMedicalFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("medical_fee >=", value, "medicalFee");
            return (Criteria) this;
        }

        public Criteria andMedicalFeeLessThan(BigDecimal value) {
            addCriterion("medical_fee <", value, "medicalFee");
            return (Criteria) this;
        }

        public Criteria andMedicalFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("medical_fee <=", value, "medicalFee");
            return (Criteria) this;
        }

        public Criteria andMedicalFeeIn(List<BigDecimal> values) {
            addCriterion("medical_fee in", values, "medicalFee");
            return (Criteria) this;
        }

        public Criteria andMedicalFeeNotIn(List<BigDecimal> values) {
            addCriterion("medical_fee not in", values, "medicalFee");
            return (Criteria) this;
        }

        public Criteria andMedicalFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("medical_fee between", value1, value2, "medicalFee");
            return (Criteria) this;
        }

        public Criteria andMedicalFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("medical_fee not between", value1, value2, "medicalFee");
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

        public Criteria andIncomeFeeIsNull() {
            addCriterion("income_fee is null");
            return (Criteria) this;
        }

        public Criteria andIncomeFeeIsNotNull() {
            addCriterion("income_fee is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeFeeEqualTo(BigDecimal value) {
            addCriterion("income_fee =", value, "incomeFee");
            return (Criteria) this;
        }

        public Criteria andIncomeFeeNotEqualTo(BigDecimal value) {
            addCriterion("income_fee <>", value, "incomeFee");
            return (Criteria) this;
        }

        public Criteria andIncomeFeeGreaterThan(BigDecimal value) {
            addCriterion("income_fee >", value, "incomeFee");
            return (Criteria) this;
        }

        public Criteria andIncomeFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("income_fee >=", value, "incomeFee");
            return (Criteria) this;
        }

        public Criteria andIncomeFeeLessThan(BigDecimal value) {
            addCriterion("income_fee <", value, "incomeFee");
            return (Criteria) this;
        }

        public Criteria andIncomeFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("income_fee <=", value, "incomeFee");
            return (Criteria) this;
        }

        public Criteria andIncomeFeeIn(List<BigDecimal> values) {
            addCriterion("income_fee in", values, "incomeFee");
            return (Criteria) this;
        }

        public Criteria andIncomeFeeNotIn(List<BigDecimal> values) {
            addCriterion("income_fee not in", values, "incomeFee");
            return (Criteria) this;
        }

        public Criteria andIncomeFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("income_fee between", value1, value2, "incomeFee");
            return (Criteria) this;
        }

        public Criteria andIncomeFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("income_fee not between", value1, value2, "incomeFee");
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

        public Criteria andSumFeeIsNull() {
            addCriterion("sum_fee is null");
            return (Criteria) this;
        }

        public Criteria andSumFeeIsNotNull() {
            addCriterion("sum_fee is not null");
            return (Criteria) this;
        }

        public Criteria andSumFeeEqualTo(BigDecimal value) {
            addCriterion("sum_fee =", value, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeNotEqualTo(BigDecimal value) {
            addCriterion("sum_fee <>", value, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeGreaterThan(BigDecimal value) {
            addCriterion("sum_fee >", value, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_fee >=", value, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeLessThan(BigDecimal value) {
            addCriterion("sum_fee <", value, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_fee <=", value, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeIn(List<BigDecimal> values) {
            addCriterion("sum_fee in", values, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeNotIn(List<BigDecimal> values) {
            addCriterion("sum_fee not in", values, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_fee between", value1, value2, "sumFee");
            return (Criteria) this;
        }

        public Criteria andSumFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_fee not between", value1, value2, "sumFee");
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