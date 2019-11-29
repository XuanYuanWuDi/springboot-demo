package com.injured.server.api.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InjuredFixedOpinionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InjuredFixedOpinionExample() {
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

        public Criteria andSurveyIdIsNull() {
            addCriterion("survey_id is null");
            return (Criteria) this;
        }

        public Criteria andSurveyIdIsNotNull() {
            addCriterion("survey_id is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyIdEqualTo(Long value) {
            addCriterion("survey_id =", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdNotEqualTo(Long value) {
            addCriterion("survey_id <>", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdGreaterThan(Long value) {
            addCriterion("survey_id >", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("survey_id >=", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdLessThan(Long value) {
            addCriterion("survey_id <", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdLessThanOrEqualTo(Long value) {
            addCriterion("survey_id <=", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdIn(List<Long> values) {
            addCriterion("survey_id in", values, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdNotIn(List<Long> values) {
            addCriterion("survey_id not in", values, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdBetween(Long value1, Long value2) {
            addCriterion("survey_id between", value1, value2, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdNotBetween(Long value1, Long value2) {
            addCriterion("survey_id not between", value1, value2, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyWouIdIsNull() {
            addCriterion("survey_wou_id is null");
            return (Criteria) this;
        }

        public Criteria andSurveyWouIdIsNotNull() {
            addCriterion("survey_wou_id is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyWouIdEqualTo(Long value) {
            addCriterion("survey_wou_id =", value, "surveyWouId");
            return (Criteria) this;
        }

        public Criteria andSurveyWouIdNotEqualTo(Long value) {
            addCriterion("survey_wou_id <>", value, "surveyWouId");
            return (Criteria) this;
        }

        public Criteria andSurveyWouIdGreaterThan(Long value) {
            addCriterion("survey_wou_id >", value, "surveyWouId");
            return (Criteria) this;
        }

        public Criteria andSurveyWouIdGreaterThanOrEqualTo(Long value) {
            addCriterion("survey_wou_id >=", value, "surveyWouId");
            return (Criteria) this;
        }

        public Criteria andSurveyWouIdLessThan(Long value) {
            addCriterion("survey_wou_id <", value, "surveyWouId");
            return (Criteria) this;
        }

        public Criteria andSurveyWouIdLessThanOrEqualTo(Long value) {
            addCriterion("survey_wou_id <=", value, "surveyWouId");
            return (Criteria) this;
        }

        public Criteria andSurveyWouIdIn(List<Long> values) {
            addCriterion("survey_wou_id in", values, "surveyWouId");
            return (Criteria) this;
        }

        public Criteria andSurveyWouIdNotIn(List<Long> values) {
            addCriterion("survey_wou_id not in", values, "surveyWouId");
            return (Criteria) this;
        }

        public Criteria andSurveyWouIdBetween(Long value1, Long value2) {
            addCriterion("survey_wou_id between", value1, value2, "surveyWouId");
            return (Criteria) this;
        }

        public Criteria andSurveyWouIdNotBetween(Long value1, Long value2) {
            addCriterion("survey_wou_id not between", value1, value2, "surveyWouId");
            return (Criteria) this;
        }

        public Criteria andMedBasicInfoIdIsNull() {
            addCriterion("med_basic_info_id is null");
            return (Criteria) this;
        }

        public Criteria andMedBasicInfoIdIsNotNull() {
            addCriterion("med_basic_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andMedBasicInfoIdEqualTo(Long value) {
            addCriterion("med_basic_info_id =", value, "medBasicInfoId");
            return (Criteria) this;
        }

        public Criteria andMedBasicInfoIdNotEqualTo(Long value) {
            addCriterion("med_basic_info_id <>", value, "medBasicInfoId");
            return (Criteria) this;
        }

        public Criteria andMedBasicInfoIdGreaterThan(Long value) {
            addCriterion("med_basic_info_id >", value, "medBasicInfoId");
            return (Criteria) this;
        }

        public Criteria andMedBasicInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("med_basic_info_id >=", value, "medBasicInfoId");
            return (Criteria) this;
        }

        public Criteria andMedBasicInfoIdLessThan(Long value) {
            addCriterion("med_basic_info_id <", value, "medBasicInfoId");
            return (Criteria) this;
        }

        public Criteria andMedBasicInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("med_basic_info_id <=", value, "medBasicInfoId");
            return (Criteria) this;
        }

        public Criteria andMedBasicInfoIdIn(List<Long> values) {
            addCriterion("med_basic_info_id in", values, "medBasicInfoId");
            return (Criteria) this;
        }

        public Criteria andMedBasicInfoIdNotIn(List<Long> values) {
            addCriterion("med_basic_info_id not in", values, "medBasicInfoId");
            return (Criteria) this;
        }

        public Criteria andMedBasicInfoIdBetween(Long value1, Long value2) {
            addCriterion("med_basic_info_id between", value1, value2, "medBasicInfoId");
            return (Criteria) this;
        }

        public Criteria andMedBasicInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("med_basic_info_id not between", value1, value2, "medBasicInfoId");
            return (Criteria) this;
        }

        public Criteria andFixedDamageIdIsNull() {
            addCriterion("fixed_damage_id is null");
            return (Criteria) this;
        }

        public Criteria andFixedDamageIdIsNotNull() {
            addCriterion("fixed_damage_id is not null");
            return (Criteria) this;
        }

        public Criteria andFixedDamageIdEqualTo(Long value) {
            addCriterion("fixed_damage_id =", value, "fixedDamageId");
            return (Criteria) this;
        }

        public Criteria andFixedDamageIdNotEqualTo(Long value) {
            addCriterion("fixed_damage_id <>", value, "fixedDamageId");
            return (Criteria) this;
        }

        public Criteria andFixedDamageIdGreaterThan(Long value) {
            addCriterion("fixed_damage_id >", value, "fixedDamageId");
            return (Criteria) this;
        }

        public Criteria andFixedDamageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("fixed_damage_id >=", value, "fixedDamageId");
            return (Criteria) this;
        }

        public Criteria andFixedDamageIdLessThan(Long value) {
            addCriterion("fixed_damage_id <", value, "fixedDamageId");
            return (Criteria) this;
        }

        public Criteria andFixedDamageIdLessThanOrEqualTo(Long value) {
            addCriterion("fixed_damage_id <=", value, "fixedDamageId");
            return (Criteria) this;
        }

        public Criteria andFixedDamageIdIn(List<Long> values) {
            addCriterion("fixed_damage_id in", values, "fixedDamageId");
            return (Criteria) this;
        }

        public Criteria andFixedDamageIdNotIn(List<Long> values) {
            addCriterion("fixed_damage_id not in", values, "fixedDamageId");
            return (Criteria) this;
        }

        public Criteria andFixedDamageIdBetween(Long value1, Long value2) {
            addCriterion("fixed_damage_id between", value1, value2, "fixedDamageId");
            return (Criteria) this;
        }

        public Criteria andFixedDamageIdNotBetween(Long value1, Long value2) {
            addCriterion("fixed_damage_id not between", value1, value2, "fixedDamageId");
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

        public Criteria andCompantCodeIsNull() {
            addCriterion("compant_code is null");
            return (Criteria) this;
        }

        public Criteria andCompantCodeIsNotNull() {
            addCriterion("compant_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompantCodeEqualTo(String value) {
            addCriterion("compant_code =", value, "compantCode");
            return (Criteria) this;
        }

        public Criteria andCompantCodeNotEqualTo(String value) {
            addCriterion("compant_code <>", value, "compantCode");
            return (Criteria) this;
        }

        public Criteria andCompantCodeGreaterThan(String value) {
            addCriterion("compant_code >", value, "compantCode");
            return (Criteria) this;
        }

        public Criteria andCompantCodeGreaterThanOrEqualTo(String value) {
            addCriterion("compant_code >=", value, "compantCode");
            return (Criteria) this;
        }

        public Criteria andCompantCodeLessThan(String value) {
            addCriterion("compant_code <", value, "compantCode");
            return (Criteria) this;
        }

        public Criteria andCompantCodeLessThanOrEqualTo(String value) {
            addCriterion("compant_code <=", value, "compantCode");
            return (Criteria) this;
        }

        public Criteria andCompantCodeLike(String value) {
            addCriterion("compant_code like", value, "compantCode");
            return (Criteria) this;
        }

        public Criteria andCompantCodeNotLike(String value) {
            addCriterion("compant_code not like", value, "compantCode");
            return (Criteria) this;
        }

        public Criteria andCompantCodeIn(List<String> values) {
            addCriterion("compant_code in", values, "compantCode");
            return (Criteria) this;
        }

        public Criteria andCompantCodeNotIn(List<String> values) {
            addCriterion("compant_code not in", values, "compantCode");
            return (Criteria) this;
        }

        public Criteria andCompantCodeBetween(String value1, String value2) {
            addCriterion("compant_code between", value1, value2, "compantCode");
            return (Criteria) this;
        }

        public Criteria andCompantCodeNotBetween(String value1, String value2) {
            addCriterion("compant_code not between", value1, value2, "compantCode");
            return (Criteria) this;
        }

        public Criteria andNucNameIsNull() {
            addCriterion("nuc_name is null");
            return (Criteria) this;
        }

        public Criteria andNucNameIsNotNull() {
            addCriterion("nuc_name is not null");
            return (Criteria) this;
        }

        public Criteria andNucNameEqualTo(String value) {
            addCriterion("nuc_name =", value, "nucName");
            return (Criteria) this;
        }

        public Criteria andNucNameNotEqualTo(String value) {
            addCriterion("nuc_name <>", value, "nucName");
            return (Criteria) this;
        }

        public Criteria andNucNameGreaterThan(String value) {
            addCriterion("nuc_name >", value, "nucName");
            return (Criteria) this;
        }

        public Criteria andNucNameGreaterThanOrEqualTo(String value) {
            addCriterion("nuc_name >=", value, "nucName");
            return (Criteria) this;
        }

        public Criteria andNucNameLessThan(String value) {
            addCriterion("nuc_name <", value, "nucName");
            return (Criteria) this;
        }

        public Criteria andNucNameLessThanOrEqualTo(String value) {
            addCriterion("nuc_name <=", value, "nucName");
            return (Criteria) this;
        }

        public Criteria andNucNameLike(String value) {
            addCriterion("nuc_name like", value, "nucName");
            return (Criteria) this;
        }

        public Criteria andNucNameNotLike(String value) {
            addCriterion("nuc_name not like", value, "nucName");
            return (Criteria) this;
        }

        public Criteria andNucNameIn(List<String> values) {
            addCriterion("nuc_name in", values, "nucName");
            return (Criteria) this;
        }

        public Criteria andNucNameNotIn(List<String> values) {
            addCriterion("nuc_name not in", values, "nucName");
            return (Criteria) this;
        }

        public Criteria andNucNameBetween(String value1, String value2) {
            addCriterion("nuc_name between", value1, value2, "nucName");
            return (Criteria) this;
        }

        public Criteria andNucNameNotBetween(String value1, String value2) {
            addCriterion("nuc_name not between", value1, value2, "nucName");
            return (Criteria) this;
        }

        public Criteria andNucNoIsNull() {
            addCriterion("nuc_no is null");
            return (Criteria) this;
        }

        public Criteria andNucNoIsNotNull() {
            addCriterion("nuc_no is not null");
            return (Criteria) this;
        }

        public Criteria andNucNoEqualTo(Long value) {
            addCriterion("nuc_no =", value, "nucNo");
            return (Criteria) this;
        }

        public Criteria andNucNoNotEqualTo(Long value) {
            addCriterion("nuc_no <>", value, "nucNo");
            return (Criteria) this;
        }

        public Criteria andNucNoGreaterThan(Long value) {
            addCriterion("nuc_no >", value, "nucNo");
            return (Criteria) this;
        }

        public Criteria andNucNoGreaterThanOrEqualTo(Long value) {
            addCriterion("nuc_no >=", value, "nucNo");
            return (Criteria) this;
        }

        public Criteria andNucNoLessThan(Long value) {
            addCriterion("nuc_no <", value, "nucNo");
            return (Criteria) this;
        }

        public Criteria andNucNoLessThanOrEqualTo(Long value) {
            addCriterion("nuc_no <=", value, "nucNo");
            return (Criteria) this;
        }

        public Criteria andNucNoIn(List<Long> values) {
            addCriterion("nuc_no in", values, "nucNo");
            return (Criteria) this;
        }

        public Criteria andNucNoNotIn(List<Long> values) {
            addCriterion("nuc_no not in", values, "nucNo");
            return (Criteria) this;
        }

        public Criteria andNucNoBetween(Long value1, Long value2) {
            addCriterion("nuc_no between", value1, value2, "nucNo");
            return (Criteria) this;
        }

        public Criteria andNucNoNotBetween(Long value1, Long value2) {
            addCriterion("nuc_no not between", value1, value2, "nucNo");
            return (Criteria) this;
        }

        public Criteria andNucTimeIsNull() {
            addCriterion("nuc_time is null");
            return (Criteria) this;
        }

        public Criteria andNucTimeIsNotNull() {
            addCriterion("nuc_time is not null");
            return (Criteria) this;
        }

        public Criteria andNucTimeEqualTo(Date value) {
            addCriterion("nuc_time =", value, "nucTime");
            return (Criteria) this;
        }

        public Criteria andNucTimeNotEqualTo(Date value) {
            addCriterion("nuc_time <>", value, "nucTime");
            return (Criteria) this;
        }

        public Criteria andNucTimeGreaterThan(Date value) {
            addCriterion("nuc_time >", value, "nucTime");
            return (Criteria) this;
        }

        public Criteria andNucTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("nuc_time >=", value, "nucTime");
            return (Criteria) this;
        }

        public Criteria andNucTimeLessThan(Date value) {
            addCriterion("nuc_time <", value, "nucTime");
            return (Criteria) this;
        }

        public Criteria andNucTimeLessThanOrEqualTo(Date value) {
            addCriterion("nuc_time <=", value, "nucTime");
            return (Criteria) this;
        }

        public Criteria andNucTimeIn(List<Date> values) {
            addCriterion("nuc_time in", values, "nucTime");
            return (Criteria) this;
        }

        public Criteria andNucTimeNotIn(List<Date> values) {
            addCriterion("nuc_time not in", values, "nucTime");
            return (Criteria) this;
        }

        public Criteria andNucTimeBetween(Date value1, Date value2) {
            addCriterion("nuc_time between", value1, value2, "nucTime");
            return (Criteria) this;
        }

        public Criteria andNucTimeNotBetween(Date value1, Date value2) {
            addCriterion("nuc_time not between", value1, value2, "nucTime");
            return (Criteria) this;
        }

        public Criteria andNucSubmitTimeIsNull() {
            addCriterion("nuc_submit_time is null");
            return (Criteria) this;
        }

        public Criteria andNucSubmitTimeIsNotNull() {
            addCriterion("nuc_submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andNucSubmitTimeEqualTo(Date value) {
            addCriterion("nuc_submit_time =", value, "nucSubmitTime");
            return (Criteria) this;
        }

        public Criteria andNucSubmitTimeNotEqualTo(Date value) {
            addCriterion("nuc_submit_time <>", value, "nucSubmitTime");
            return (Criteria) this;
        }

        public Criteria andNucSubmitTimeGreaterThan(Date value) {
            addCriterion("nuc_submit_time >", value, "nucSubmitTime");
            return (Criteria) this;
        }

        public Criteria andNucSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("nuc_submit_time >=", value, "nucSubmitTime");
            return (Criteria) this;
        }

        public Criteria andNucSubmitTimeLessThan(Date value) {
            addCriterion("nuc_submit_time <", value, "nucSubmitTime");
            return (Criteria) this;
        }

        public Criteria andNucSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("nuc_submit_time <=", value, "nucSubmitTime");
            return (Criteria) this;
        }

        public Criteria andNucSubmitTimeIn(List<Date> values) {
            addCriterion("nuc_submit_time in", values, "nucSubmitTime");
            return (Criteria) this;
        }

        public Criteria andNucSubmitTimeNotIn(List<Date> values) {
            addCriterion("nuc_submit_time not in", values, "nucSubmitTime");
            return (Criteria) this;
        }

        public Criteria andNucSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("nuc_submit_time between", value1, value2, "nucSubmitTime");
            return (Criteria) this;
        }

        public Criteria andNucSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("nuc_submit_time not between", value1, value2, "nucSubmitTime");
            return (Criteria) this;
        }

        public Criteria andNucTotalAmountIsNull() {
            addCriterion("nuc_total_amount is null");
            return (Criteria) this;
        }

        public Criteria andNucTotalAmountIsNotNull() {
            addCriterion("nuc_total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andNucTotalAmountEqualTo(BigDecimal value) {
            addCriterion("nuc_total_amount =", value, "nucTotalAmount");
            return (Criteria) this;
        }

        public Criteria andNucTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("nuc_total_amount <>", value, "nucTotalAmount");
            return (Criteria) this;
        }

        public Criteria andNucTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("nuc_total_amount >", value, "nucTotalAmount");
            return (Criteria) this;
        }

        public Criteria andNucTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nuc_total_amount >=", value, "nucTotalAmount");
            return (Criteria) this;
        }

        public Criteria andNucTotalAmountLessThan(BigDecimal value) {
            addCriterion("nuc_total_amount <", value, "nucTotalAmount");
            return (Criteria) this;
        }

        public Criteria andNucTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nuc_total_amount <=", value, "nucTotalAmount");
            return (Criteria) this;
        }

        public Criteria andNucTotalAmountIn(List<BigDecimal> values) {
            addCriterion("nuc_total_amount in", values, "nucTotalAmount");
            return (Criteria) this;
        }

        public Criteria andNucTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("nuc_total_amount not in", values, "nucTotalAmount");
            return (Criteria) this;
        }

        public Criteria andNucTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nuc_total_amount between", value1, value2, "nucTotalAmount");
            return (Criteria) this;
        }

        public Criteria andNucTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nuc_total_amount not between", value1, value2, "nucTotalAmount");
            return (Criteria) this;
        }

        public Criteria andNucOpinionIsNull() {
            addCriterion("nuc_opinion is null");
            return (Criteria) this;
        }

        public Criteria andNucOpinionIsNotNull() {
            addCriterion("nuc_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andNucOpinionEqualTo(String value) {
            addCriterion("nuc_opinion =", value, "nucOpinion");
            return (Criteria) this;
        }

        public Criteria andNucOpinionNotEqualTo(String value) {
            addCriterion("nuc_opinion <>", value, "nucOpinion");
            return (Criteria) this;
        }

        public Criteria andNucOpinionGreaterThan(String value) {
            addCriterion("nuc_opinion >", value, "nucOpinion");
            return (Criteria) this;
        }

        public Criteria andNucOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("nuc_opinion >=", value, "nucOpinion");
            return (Criteria) this;
        }

        public Criteria andNucOpinionLessThan(String value) {
            addCriterion("nuc_opinion <", value, "nucOpinion");
            return (Criteria) this;
        }

        public Criteria andNucOpinionLessThanOrEqualTo(String value) {
            addCriterion("nuc_opinion <=", value, "nucOpinion");
            return (Criteria) this;
        }

        public Criteria andNucOpinionLike(String value) {
            addCriterion("nuc_opinion like", value, "nucOpinion");
            return (Criteria) this;
        }

        public Criteria andNucOpinionNotLike(String value) {
            addCriterion("nuc_opinion not like", value, "nucOpinion");
            return (Criteria) this;
        }

        public Criteria andNucOpinionIn(List<String> values) {
            addCriterion("nuc_opinion in", values, "nucOpinion");
            return (Criteria) this;
        }

        public Criteria andNucOpinionNotIn(List<String> values) {
            addCriterion("nuc_opinion not in", values, "nucOpinion");
            return (Criteria) this;
        }

        public Criteria andNucOpinionBetween(String value1, String value2) {
            addCriterion("nuc_opinion between", value1, value2, "nucOpinion");
            return (Criteria) this;
        }

        public Criteria andNucOpinionNotBetween(String value1, String value2) {
            addCriterion("nuc_opinion not between", value1, value2, "nucOpinion");
            return (Criteria) this;
        }

        public Criteria andNucDescIsNull() {
            addCriterion("nuc_desc is null");
            return (Criteria) this;
        }

        public Criteria andNucDescIsNotNull() {
            addCriterion("nuc_desc is not null");
            return (Criteria) this;
        }

        public Criteria andNucDescEqualTo(String value) {
            addCriterion("nuc_desc =", value, "nucDesc");
            return (Criteria) this;
        }

        public Criteria andNucDescNotEqualTo(String value) {
            addCriterion("nuc_desc <>", value, "nucDesc");
            return (Criteria) this;
        }

        public Criteria andNucDescGreaterThan(String value) {
            addCriterion("nuc_desc >", value, "nucDesc");
            return (Criteria) this;
        }

        public Criteria andNucDescGreaterThanOrEqualTo(String value) {
            addCriterion("nuc_desc >=", value, "nucDesc");
            return (Criteria) this;
        }

        public Criteria andNucDescLessThan(String value) {
            addCriterion("nuc_desc <", value, "nucDesc");
            return (Criteria) this;
        }

        public Criteria andNucDescLessThanOrEqualTo(String value) {
            addCriterion("nuc_desc <=", value, "nucDesc");
            return (Criteria) this;
        }

        public Criteria andNucDescLike(String value) {
            addCriterion("nuc_desc like", value, "nucDesc");
            return (Criteria) this;
        }

        public Criteria andNucDescNotLike(String value) {
            addCriterion("nuc_desc not like", value, "nucDesc");
            return (Criteria) this;
        }

        public Criteria andNucDescIn(List<String> values) {
            addCriterion("nuc_desc in", values, "nucDesc");
            return (Criteria) this;
        }

        public Criteria andNucDescNotIn(List<String> values) {
            addCriterion("nuc_desc not in", values, "nucDesc");
            return (Criteria) this;
        }

        public Criteria andNucDescBetween(String value1, String value2) {
            addCriterion("nuc_desc between", value1, value2, "nucDesc");
            return (Criteria) this;
        }

        public Criteria andNucDescNotBetween(String value1, String value2) {
            addCriterion("nuc_desc not between", value1, value2, "nucDesc");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNull() {
            addCriterion("task_type is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNotNull() {
            addCriterion("task_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeEqualTo(Byte value) {
            addCriterion("task_type =", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotEqualTo(Byte value) {
            addCriterion("task_type <>", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThan(Byte value) {
            addCriterion("task_type >", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("task_type >=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThan(Byte value) {
            addCriterion("task_type <", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThanOrEqualTo(Byte value) {
            addCriterion("task_type <=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIn(List<Byte> values) {
            addCriterion("task_type in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotIn(List<Byte> values) {
            addCriterion("task_type not in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeBetween(Byte value1, Byte value2) {
            addCriterion("task_type between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("task_type not between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNull() {
            addCriterion("task_status is null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNotNull() {
            addCriterion("task_status is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusEqualTo(Integer value) {
            addCriterion("task_status =", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotEqualTo(Integer value) {
            addCriterion("task_status <>", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThan(Integer value) {
            addCriterion("task_status >", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_status >=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThan(Integer value) {
            addCriterion("task_status <", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThanOrEqualTo(Integer value) {
            addCriterion("task_status <=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIn(List<Integer> values) {
            addCriterion("task_status in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotIn(List<Integer> values) {
            addCriterion("task_status not in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusBetween(Integer value1, Integer value2) {
            addCriterion("task_status between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("task_status not between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andMedTypeIsNull() {
            addCriterion("med_type is null");
            return (Criteria) this;
        }

        public Criteria andMedTypeIsNotNull() {
            addCriterion("med_type is not null");
            return (Criteria) this;
        }

        public Criteria andMedTypeEqualTo(Integer value) {
            addCriterion("med_type =", value, "medType");
            return (Criteria) this;
        }

        public Criteria andMedTypeNotEqualTo(Integer value) {
            addCriterion("med_type <>", value, "medType");
            return (Criteria) this;
        }

        public Criteria andMedTypeGreaterThan(Integer value) {
            addCriterion("med_type >", value, "medType");
            return (Criteria) this;
        }

        public Criteria andMedTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("med_type >=", value, "medType");
            return (Criteria) this;
        }

        public Criteria andMedTypeLessThan(Integer value) {
            addCriterion("med_type <", value, "medType");
            return (Criteria) this;
        }

        public Criteria andMedTypeLessThanOrEqualTo(Integer value) {
            addCriterion("med_type <=", value, "medType");
            return (Criteria) this;
        }

        public Criteria andMedTypeIn(List<Integer> values) {
            addCriterion("med_type in", values, "medType");
            return (Criteria) this;
        }

        public Criteria andMedTypeNotIn(List<Integer> values) {
            addCriterion("med_type not in", values, "medType");
            return (Criteria) this;
        }

        public Criteria andMedTypeBetween(Integer value1, Integer value2) {
            addCriterion("med_type between", value1, value2, "medType");
            return (Criteria) this;
        }

        public Criteria andMedTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("med_type not between", value1, value2, "medType");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFormulaIsNull() {
            addCriterion("adjustment_formula is null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFormulaIsNotNull() {
            addCriterion("adjustment_formula is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFormulaEqualTo(String value) {
            addCriterion("adjustment_formula =", value, "adjustmentFormula");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFormulaNotEqualTo(String value) {
            addCriterion("adjustment_formula <>", value, "adjustmentFormula");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFormulaGreaterThan(String value) {
            addCriterion("adjustment_formula >", value, "adjustmentFormula");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFormulaGreaterThanOrEqualTo(String value) {
            addCriterion("adjustment_formula >=", value, "adjustmentFormula");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFormulaLessThan(String value) {
            addCriterion("adjustment_formula <", value, "adjustmentFormula");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFormulaLessThanOrEqualTo(String value) {
            addCriterion("adjustment_formula <=", value, "adjustmentFormula");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFormulaLike(String value) {
            addCriterion("adjustment_formula like", value, "adjustmentFormula");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFormulaNotLike(String value) {
            addCriterion("adjustment_formula not like", value, "adjustmentFormula");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFormulaIn(List<String> values) {
            addCriterion("adjustment_formula in", values, "adjustmentFormula");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFormulaNotIn(List<String> values) {
            addCriterion("adjustment_formula not in", values, "adjustmentFormula");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFormulaBetween(String value1, String value2) {
            addCriterion("adjustment_formula between", value1, value2, "adjustmentFormula");
            return (Criteria) this;
        }

        public Criteria andAdjustmentFormulaNotBetween(String value1, String value2) {
            addCriterion("adjustment_formula not between", value1, value2, "adjustmentFormula");
            return (Criteria) this;
        }

        public Criteria andCompensationAmountIsNull() {
            addCriterion("compensation_amount is null");
            return (Criteria) this;
        }

        public Criteria andCompensationAmountIsNotNull() {
            addCriterion("compensation_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCompensationAmountEqualTo(BigDecimal value) {
            addCriterion("compensation_amount =", value, "compensationAmount");
            return (Criteria) this;
        }

        public Criteria andCompensationAmountNotEqualTo(BigDecimal value) {
            addCriterion("compensation_amount <>", value, "compensationAmount");
            return (Criteria) this;
        }

        public Criteria andCompensationAmountGreaterThan(BigDecimal value) {
            addCriterion("compensation_amount >", value, "compensationAmount");
            return (Criteria) this;
        }

        public Criteria andCompensationAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("compensation_amount >=", value, "compensationAmount");
            return (Criteria) this;
        }

        public Criteria andCompensationAmountLessThan(BigDecimal value) {
            addCriterion("compensation_amount <", value, "compensationAmount");
            return (Criteria) this;
        }

        public Criteria andCompensationAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("compensation_amount <=", value, "compensationAmount");
            return (Criteria) this;
        }

        public Criteria andCompensationAmountIn(List<BigDecimal> values) {
            addCriterion("compensation_amount in", values, "compensationAmount");
            return (Criteria) this;
        }

        public Criteria andCompensationAmountNotIn(List<BigDecimal> values) {
            addCriterion("compensation_amount not in", values, "compensationAmount");
            return (Criteria) this;
        }

        public Criteria andCompensationAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("compensation_amount between", value1, value2, "compensationAmount");
            return (Criteria) this;
        }

        public Criteria andCompensationAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("compensation_amount not between", value1, value2, "compensationAmount");
            return (Criteria) this;
        }

        public Criteria andFixNameIsNull() {
            addCriterion("fix_name is null");
            return (Criteria) this;
        }

        public Criteria andFixNameIsNotNull() {
            addCriterion("fix_name is not null");
            return (Criteria) this;
        }

        public Criteria andFixNameEqualTo(String value) {
            addCriterion("fix_name =", value, "fixName");
            return (Criteria) this;
        }

        public Criteria andFixNameNotEqualTo(String value) {
            addCriterion("fix_name <>", value, "fixName");
            return (Criteria) this;
        }

        public Criteria andFixNameGreaterThan(String value) {
            addCriterion("fix_name >", value, "fixName");
            return (Criteria) this;
        }

        public Criteria andFixNameGreaterThanOrEqualTo(String value) {
            addCriterion("fix_name >=", value, "fixName");
            return (Criteria) this;
        }

        public Criteria andFixNameLessThan(String value) {
            addCriterion("fix_name <", value, "fixName");
            return (Criteria) this;
        }

        public Criteria andFixNameLessThanOrEqualTo(String value) {
            addCriterion("fix_name <=", value, "fixName");
            return (Criteria) this;
        }

        public Criteria andFixNameLike(String value) {
            addCriterion("fix_name like", value, "fixName");
            return (Criteria) this;
        }

        public Criteria andFixNameNotLike(String value) {
            addCriterion("fix_name not like", value, "fixName");
            return (Criteria) this;
        }

        public Criteria andFixNameIn(List<String> values) {
            addCriterion("fix_name in", values, "fixName");
            return (Criteria) this;
        }

        public Criteria andFixNameNotIn(List<String> values) {
            addCriterion("fix_name not in", values, "fixName");
            return (Criteria) this;
        }

        public Criteria andFixNameBetween(String value1, String value2) {
            addCriterion("fix_name between", value1, value2, "fixName");
            return (Criteria) this;
        }

        public Criteria andFixNameNotBetween(String value1, String value2) {
            addCriterion("fix_name not between", value1, value2, "fixName");
            return (Criteria) this;
        }

        public Criteria andFixNoIsNull() {
            addCriterion("fix_no is null");
            return (Criteria) this;
        }

        public Criteria andFixNoIsNotNull() {
            addCriterion("fix_no is not null");
            return (Criteria) this;
        }

        public Criteria andFixNoEqualTo(Long value) {
            addCriterion("fix_no =", value, "fixNo");
            return (Criteria) this;
        }

        public Criteria andFixNoNotEqualTo(Long value) {
            addCriterion("fix_no <>", value, "fixNo");
            return (Criteria) this;
        }

        public Criteria andFixNoGreaterThan(Long value) {
            addCriterion("fix_no >", value, "fixNo");
            return (Criteria) this;
        }

        public Criteria andFixNoGreaterThanOrEqualTo(Long value) {
            addCriterion("fix_no >=", value, "fixNo");
            return (Criteria) this;
        }

        public Criteria andFixNoLessThan(Long value) {
            addCriterion("fix_no <", value, "fixNo");
            return (Criteria) this;
        }

        public Criteria andFixNoLessThanOrEqualTo(Long value) {
            addCriterion("fix_no <=", value, "fixNo");
            return (Criteria) this;
        }

        public Criteria andFixNoIn(List<Long> values) {
            addCriterion("fix_no in", values, "fixNo");
            return (Criteria) this;
        }

        public Criteria andFixNoNotIn(List<Long> values) {
            addCriterion("fix_no not in", values, "fixNo");
            return (Criteria) this;
        }

        public Criteria andFixNoBetween(Long value1, Long value2) {
            addCriterion("fix_no between", value1, value2, "fixNo");
            return (Criteria) this;
        }

        public Criteria andFixNoNotBetween(Long value1, Long value2) {
            addCriterion("fix_no not between", value1, value2, "fixNo");
            return (Criteria) this;
        }

        public Criteria andFixTimeIsNull() {
            addCriterion("fix_time is null");
            return (Criteria) this;
        }

        public Criteria andFixTimeIsNotNull() {
            addCriterion("fix_time is not null");
            return (Criteria) this;
        }

        public Criteria andFixTimeEqualTo(Date value) {
            addCriterion("fix_time =", value, "fixTime");
            return (Criteria) this;
        }

        public Criteria andFixTimeNotEqualTo(Date value) {
            addCriterion("fix_time <>", value, "fixTime");
            return (Criteria) this;
        }

        public Criteria andFixTimeGreaterThan(Date value) {
            addCriterion("fix_time >", value, "fixTime");
            return (Criteria) this;
        }

        public Criteria andFixTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fix_time >=", value, "fixTime");
            return (Criteria) this;
        }

        public Criteria andFixTimeLessThan(Date value) {
            addCriterion("fix_time <", value, "fixTime");
            return (Criteria) this;
        }

        public Criteria andFixTimeLessThanOrEqualTo(Date value) {
            addCriterion("fix_time <=", value, "fixTime");
            return (Criteria) this;
        }

        public Criteria andFixTimeIn(List<Date> values) {
            addCriterion("fix_time in", values, "fixTime");
            return (Criteria) this;
        }

        public Criteria andFixTimeNotIn(List<Date> values) {
            addCriterion("fix_time not in", values, "fixTime");
            return (Criteria) this;
        }

        public Criteria andFixTimeBetween(Date value1, Date value2) {
            addCriterion("fix_time between", value1, value2, "fixTime");
            return (Criteria) this;
        }

        public Criteria andFixTimeNotBetween(Date value1, Date value2) {
            addCriterion("fix_time not between", value1, value2, "fixTime");
            return (Criteria) this;
        }

        public Criteria andFixSubmitTimeIsNull() {
            addCriterion("fix_submit_time is null");
            return (Criteria) this;
        }

        public Criteria andFixSubmitTimeIsNotNull() {
            addCriterion("fix_submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andFixSubmitTimeEqualTo(Date value) {
            addCriterion("fix_submit_time =", value, "fixSubmitTime");
            return (Criteria) this;
        }

        public Criteria andFixSubmitTimeNotEqualTo(Date value) {
            addCriterion("fix_submit_time <>", value, "fixSubmitTime");
            return (Criteria) this;
        }

        public Criteria andFixSubmitTimeGreaterThan(Date value) {
            addCriterion("fix_submit_time >", value, "fixSubmitTime");
            return (Criteria) this;
        }

        public Criteria andFixSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fix_submit_time >=", value, "fixSubmitTime");
            return (Criteria) this;
        }

        public Criteria andFixSubmitTimeLessThan(Date value) {
            addCriterion("fix_submit_time <", value, "fixSubmitTime");
            return (Criteria) this;
        }

        public Criteria andFixSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("fix_submit_time <=", value, "fixSubmitTime");
            return (Criteria) this;
        }

        public Criteria andFixSubmitTimeIn(List<Date> values) {
            addCriterion("fix_submit_time in", values, "fixSubmitTime");
            return (Criteria) this;
        }

        public Criteria andFixSubmitTimeNotIn(List<Date> values) {
            addCriterion("fix_submit_time not in", values, "fixSubmitTime");
            return (Criteria) this;
        }

        public Criteria andFixSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("fix_submit_time between", value1, value2, "fixSubmitTime");
            return (Criteria) this;
        }

        public Criteria andFixSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("fix_submit_time not between", value1, value2, "fixSubmitTime");
            return (Criteria) this;
        }

        public Criteria andFixDescIsNull() {
            addCriterion("fix_desc is null");
            return (Criteria) this;
        }

        public Criteria andFixDescIsNotNull() {
            addCriterion("fix_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFixDescEqualTo(String value) {
            addCriterion("fix_desc =", value, "fixDesc");
            return (Criteria) this;
        }

        public Criteria andFixDescNotEqualTo(String value) {
            addCriterion("fix_desc <>", value, "fixDesc");
            return (Criteria) this;
        }

        public Criteria andFixDescGreaterThan(String value) {
            addCriterion("fix_desc >", value, "fixDesc");
            return (Criteria) this;
        }

        public Criteria andFixDescGreaterThanOrEqualTo(String value) {
            addCriterion("fix_desc >=", value, "fixDesc");
            return (Criteria) this;
        }

        public Criteria andFixDescLessThan(String value) {
            addCriterion("fix_desc <", value, "fixDesc");
            return (Criteria) this;
        }

        public Criteria andFixDescLessThanOrEqualTo(String value) {
            addCriterion("fix_desc <=", value, "fixDesc");
            return (Criteria) this;
        }

        public Criteria andFixDescLike(String value) {
            addCriterion("fix_desc like", value, "fixDesc");
            return (Criteria) this;
        }

        public Criteria andFixDescNotLike(String value) {
            addCriterion("fix_desc not like", value, "fixDesc");
            return (Criteria) this;
        }

        public Criteria andFixDescIn(List<String> values) {
            addCriterion("fix_desc in", values, "fixDesc");
            return (Criteria) this;
        }

        public Criteria andFixDescNotIn(List<String> values) {
            addCriterion("fix_desc not in", values, "fixDesc");
            return (Criteria) this;
        }

        public Criteria andFixDescBetween(String value1, String value2) {
            addCriterion("fix_desc between", value1, value2, "fixDesc");
            return (Criteria) this;
        }

        public Criteria andFixDescNotBetween(String value1, String value2) {
            addCriterion("fix_desc not between", value1, value2, "fixDesc");
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