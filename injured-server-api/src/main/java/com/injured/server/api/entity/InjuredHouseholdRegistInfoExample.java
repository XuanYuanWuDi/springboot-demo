package com.injured.server.api.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InjuredHouseholdRegistInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InjuredHouseholdRegistInfoExample() {
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

        public Criteria andIsFieldSurveyIsNull() {
            addCriterion("is_field_survey is null");
            return (Criteria) this;
        }

        public Criteria andIsFieldSurveyIsNotNull() {
            addCriterion("is_field_survey is not null");
            return (Criteria) this;
        }

        public Criteria andIsFieldSurveyEqualTo(Byte value) {
            addCriterion("is_field_survey =", value, "isFieldSurvey");
            return (Criteria) this;
        }

        public Criteria andIsFieldSurveyNotEqualTo(Byte value) {
            addCriterion("is_field_survey <>", value, "isFieldSurvey");
            return (Criteria) this;
        }

        public Criteria andIsFieldSurveyGreaterThan(Byte value) {
            addCriterion("is_field_survey >", value, "isFieldSurvey");
            return (Criteria) this;
        }

        public Criteria andIsFieldSurveyGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_field_survey >=", value, "isFieldSurvey");
            return (Criteria) this;
        }

        public Criteria andIsFieldSurveyLessThan(Byte value) {
            addCriterion("is_field_survey <", value, "isFieldSurvey");
            return (Criteria) this;
        }

        public Criteria andIsFieldSurveyLessThanOrEqualTo(Byte value) {
            addCriterion("is_field_survey <=", value, "isFieldSurvey");
            return (Criteria) this;
        }

        public Criteria andIsFieldSurveyIn(List<Byte> values) {
            addCriterion("is_field_survey in", values, "isFieldSurvey");
            return (Criteria) this;
        }

        public Criteria andIsFieldSurveyNotIn(List<Byte> values) {
            addCriterion("is_field_survey not in", values, "isFieldSurvey");
            return (Criteria) this;
        }

        public Criteria andIsFieldSurveyBetween(Byte value1, Byte value2) {
            addCriterion("is_field_survey between", value1, value2, "isFieldSurvey");
            return (Criteria) this;
        }

        public Criteria andIsFieldSurveyNotBetween(Byte value1, Byte value2) {
            addCriterion("is_field_survey not between", value1, value2, "isFieldSurvey");
            return (Criteria) this;
        }

        public Criteria andResideNatureIsNull() {
            addCriterion("reside_nature is null");
            return (Criteria) this;
        }

        public Criteria andResideNatureIsNotNull() {
            addCriterion("reside_nature is not null");
            return (Criteria) this;
        }

        public Criteria andResideNatureEqualTo(Byte value) {
            addCriterion("reside_nature =", value, "resideNature");
            return (Criteria) this;
        }

        public Criteria andResideNatureNotEqualTo(Byte value) {
            addCriterion("reside_nature <>", value, "resideNature");
            return (Criteria) this;
        }

        public Criteria andResideNatureGreaterThan(Byte value) {
            addCriterion("reside_nature >", value, "resideNature");
            return (Criteria) this;
        }

        public Criteria andResideNatureGreaterThanOrEqualTo(Byte value) {
            addCriterion("reside_nature >=", value, "resideNature");
            return (Criteria) this;
        }

        public Criteria andResideNatureLessThan(Byte value) {
            addCriterion("reside_nature <", value, "resideNature");
            return (Criteria) this;
        }

        public Criteria andResideNatureLessThanOrEqualTo(Byte value) {
            addCriterion("reside_nature <=", value, "resideNature");
            return (Criteria) this;
        }

        public Criteria andResideNatureIn(List<Byte> values) {
            addCriterion("reside_nature in", values, "resideNature");
            return (Criteria) this;
        }

        public Criteria andResideNatureNotIn(List<Byte> values) {
            addCriterion("reside_nature not in", values, "resideNature");
            return (Criteria) this;
        }

        public Criteria andResideNatureBetween(Byte value1, Byte value2) {
            addCriterion("reside_nature between", value1, value2, "resideNature");
            return (Criteria) this;
        }

        public Criteria andResideNatureNotBetween(Byte value1, Byte value2) {
            addCriterion("reside_nature not between", value1, value2, "resideNature");
            return (Criteria) this;
        }

        public Criteria andIsResidentIsNull() {
            addCriterion("is_resident is null");
            return (Criteria) this;
        }

        public Criteria andIsResidentIsNotNull() {
            addCriterion("is_resident is not null");
            return (Criteria) this;
        }

        public Criteria andIsResidentEqualTo(Byte value) {
            addCriterion("is_resident =", value, "isResident");
            return (Criteria) this;
        }

        public Criteria andIsResidentNotEqualTo(Byte value) {
            addCriterion("is_resident <>", value, "isResident");
            return (Criteria) this;
        }

        public Criteria andIsResidentGreaterThan(Byte value) {
            addCriterion("is_resident >", value, "isResident");
            return (Criteria) this;
        }

        public Criteria andIsResidentGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_resident >=", value, "isResident");
            return (Criteria) this;
        }

        public Criteria andIsResidentLessThan(Byte value) {
            addCriterion("is_resident <", value, "isResident");
            return (Criteria) this;
        }

        public Criteria andIsResidentLessThanOrEqualTo(Byte value) {
            addCriterion("is_resident <=", value, "isResident");
            return (Criteria) this;
        }

        public Criteria andIsResidentIn(List<Byte> values) {
            addCriterion("is_resident in", values, "isResident");
            return (Criteria) this;
        }

        public Criteria andIsResidentNotIn(List<Byte> values) {
            addCriterion("is_resident not in", values, "isResident");
            return (Criteria) this;
        }

        public Criteria andIsResidentBetween(Byte value1, Byte value2) {
            addCriterion("is_resident between", value1, value2, "isResident");
            return (Criteria) this;
        }

        public Criteria andIsResidentNotBetween(Byte value1, Byte value2) {
            addCriterion("is_resident not between", value1, value2, "isResident");
            return (Criteria) this;
        }

        public Criteria andResideProvinceIsNull() {
            addCriterion("reside_province is null");
            return (Criteria) this;
        }

        public Criteria andResideProvinceIsNotNull() {
            addCriterion("reside_province is not null");
            return (Criteria) this;
        }

        public Criteria andResideProvinceEqualTo(Long value) {
            addCriterion("reside_province =", value, "resideProvince");
            return (Criteria) this;
        }

        public Criteria andResideProvinceNotEqualTo(Long value) {
            addCriterion("reside_province <>", value, "resideProvince");
            return (Criteria) this;
        }

        public Criteria andResideProvinceGreaterThan(Long value) {
            addCriterion("reside_province >", value, "resideProvince");
            return (Criteria) this;
        }

        public Criteria andResideProvinceGreaterThanOrEqualTo(Long value) {
            addCriterion("reside_province >=", value, "resideProvince");
            return (Criteria) this;
        }

        public Criteria andResideProvinceLessThan(Long value) {
            addCriterion("reside_province <", value, "resideProvince");
            return (Criteria) this;
        }

        public Criteria andResideProvinceLessThanOrEqualTo(Long value) {
            addCriterion("reside_province <=", value, "resideProvince");
            return (Criteria) this;
        }

        public Criteria andResideProvinceIn(List<Long> values) {
            addCriterion("reside_province in", values, "resideProvince");
            return (Criteria) this;
        }

        public Criteria andResideProvinceNotIn(List<Long> values) {
            addCriterion("reside_province not in", values, "resideProvince");
            return (Criteria) this;
        }

        public Criteria andResideProvinceBetween(Long value1, Long value2) {
            addCriterion("reside_province between", value1, value2, "resideProvince");
            return (Criteria) this;
        }

        public Criteria andResideProvinceNotBetween(Long value1, Long value2) {
            addCriterion("reside_province not between", value1, value2, "resideProvince");
            return (Criteria) this;
        }

        public Criteria andResideCityIsNull() {
            addCriterion("reside_city is null");
            return (Criteria) this;
        }

        public Criteria andResideCityIsNotNull() {
            addCriterion("reside_city is not null");
            return (Criteria) this;
        }

        public Criteria andResideCityEqualTo(Long value) {
            addCriterion("reside_city =", value, "resideCity");
            return (Criteria) this;
        }

        public Criteria andResideCityNotEqualTo(Long value) {
            addCriterion("reside_city <>", value, "resideCity");
            return (Criteria) this;
        }

        public Criteria andResideCityGreaterThan(Long value) {
            addCriterion("reside_city >", value, "resideCity");
            return (Criteria) this;
        }

        public Criteria andResideCityGreaterThanOrEqualTo(Long value) {
            addCriterion("reside_city >=", value, "resideCity");
            return (Criteria) this;
        }

        public Criteria andResideCityLessThan(Long value) {
            addCriterion("reside_city <", value, "resideCity");
            return (Criteria) this;
        }

        public Criteria andResideCityLessThanOrEqualTo(Long value) {
            addCriterion("reside_city <=", value, "resideCity");
            return (Criteria) this;
        }

        public Criteria andResideCityIn(List<Long> values) {
            addCriterion("reside_city in", values, "resideCity");
            return (Criteria) this;
        }

        public Criteria andResideCityNotIn(List<Long> values) {
            addCriterion("reside_city not in", values, "resideCity");
            return (Criteria) this;
        }

        public Criteria andResideCityBetween(Long value1, Long value2) {
            addCriterion("reside_city between", value1, value2, "resideCity");
            return (Criteria) this;
        }

        public Criteria andResideCityNotBetween(Long value1, Long value2) {
            addCriterion("reside_city not between", value1, value2, "resideCity");
            return (Criteria) this;
        }

        public Criteria andResideDistrictIsNull() {
            addCriterion("reside_district is null");
            return (Criteria) this;
        }

        public Criteria andResideDistrictIsNotNull() {
            addCriterion("reside_district is not null");
            return (Criteria) this;
        }

        public Criteria andResideDistrictEqualTo(Long value) {
            addCriterion("reside_district =", value, "resideDistrict");
            return (Criteria) this;
        }

        public Criteria andResideDistrictNotEqualTo(Long value) {
            addCriterion("reside_district <>", value, "resideDistrict");
            return (Criteria) this;
        }

        public Criteria andResideDistrictGreaterThan(Long value) {
            addCriterion("reside_district >", value, "resideDistrict");
            return (Criteria) this;
        }

        public Criteria andResideDistrictGreaterThanOrEqualTo(Long value) {
            addCriterion("reside_district >=", value, "resideDistrict");
            return (Criteria) this;
        }

        public Criteria andResideDistrictLessThan(Long value) {
            addCriterion("reside_district <", value, "resideDistrict");
            return (Criteria) this;
        }

        public Criteria andResideDistrictLessThanOrEqualTo(Long value) {
            addCriterion("reside_district <=", value, "resideDistrict");
            return (Criteria) this;
        }

        public Criteria andResideDistrictIn(List<Long> values) {
            addCriterion("reside_district in", values, "resideDistrict");
            return (Criteria) this;
        }

        public Criteria andResideDistrictNotIn(List<Long> values) {
            addCriterion("reside_district not in", values, "resideDistrict");
            return (Criteria) this;
        }

        public Criteria andResideDistrictBetween(Long value1, Long value2) {
            addCriterion("reside_district between", value1, value2, "resideDistrict");
            return (Criteria) this;
        }

        public Criteria andResideDistrictNotBetween(Long value1, Long value2) {
            addCriterion("reside_district not between", value1, value2, "resideDistrict");
            return (Criteria) this;
        }

        public Criteria andResideTownIsNull() {
            addCriterion("reside_town is null");
            return (Criteria) this;
        }

        public Criteria andResideTownIsNotNull() {
            addCriterion("reside_town is not null");
            return (Criteria) this;
        }

        public Criteria andResideTownEqualTo(Long value) {
            addCriterion("reside_town =", value, "resideTown");
            return (Criteria) this;
        }

        public Criteria andResideTownNotEqualTo(Long value) {
            addCriterion("reside_town <>", value, "resideTown");
            return (Criteria) this;
        }

        public Criteria andResideTownGreaterThan(Long value) {
            addCriterion("reside_town >", value, "resideTown");
            return (Criteria) this;
        }

        public Criteria andResideTownGreaterThanOrEqualTo(Long value) {
            addCriterion("reside_town >=", value, "resideTown");
            return (Criteria) this;
        }

        public Criteria andResideTownLessThan(Long value) {
            addCriterion("reside_town <", value, "resideTown");
            return (Criteria) this;
        }

        public Criteria andResideTownLessThanOrEqualTo(Long value) {
            addCriterion("reside_town <=", value, "resideTown");
            return (Criteria) this;
        }

        public Criteria andResideTownIn(List<Long> values) {
            addCriterion("reside_town in", values, "resideTown");
            return (Criteria) this;
        }

        public Criteria andResideTownNotIn(List<Long> values) {
            addCriterion("reside_town not in", values, "resideTown");
            return (Criteria) this;
        }

        public Criteria andResideTownBetween(Long value1, Long value2) {
            addCriterion("reside_town between", value1, value2, "resideTown");
            return (Criteria) this;
        }

        public Criteria andResideTownNotBetween(Long value1, Long value2) {
            addCriterion("reside_town not between", value1, value2, "resideTown");
            return (Criteria) this;
        }

        public Criteria andResideAddressIsNull() {
            addCriterion("reside_address is null");
            return (Criteria) this;
        }

        public Criteria andResideAddressIsNotNull() {
            addCriterion("reside_address is not null");
            return (Criteria) this;
        }

        public Criteria andResideAddressEqualTo(String value) {
            addCriterion("reside_address =", value, "resideAddress");
            return (Criteria) this;
        }

        public Criteria andResideAddressNotEqualTo(String value) {
            addCriterion("reside_address <>", value, "resideAddress");
            return (Criteria) this;
        }

        public Criteria andResideAddressGreaterThan(String value) {
            addCriterion("reside_address >", value, "resideAddress");
            return (Criteria) this;
        }

        public Criteria andResideAddressGreaterThanOrEqualTo(String value) {
            addCriterion("reside_address >=", value, "resideAddress");
            return (Criteria) this;
        }

        public Criteria andResideAddressLessThan(String value) {
            addCriterion("reside_address <", value, "resideAddress");
            return (Criteria) this;
        }

        public Criteria andResideAddressLessThanOrEqualTo(String value) {
            addCriterion("reside_address <=", value, "resideAddress");
            return (Criteria) this;
        }

        public Criteria andResideAddressLike(String value) {
            addCriterion("reside_address like", value, "resideAddress");
            return (Criteria) this;
        }

        public Criteria andResideAddressNotLike(String value) {
            addCriterion("reside_address not like", value, "resideAddress");
            return (Criteria) this;
        }

        public Criteria andResideAddressIn(List<String> values) {
            addCriterion("reside_address in", values, "resideAddress");
            return (Criteria) this;
        }

        public Criteria andResideAddressNotIn(List<String> values) {
            addCriterion("reside_address not in", values, "resideAddress");
            return (Criteria) this;
        }

        public Criteria andResideAddressBetween(String value1, String value2) {
            addCriterion("reside_address between", value1, value2, "resideAddress");
            return (Criteria) this;
        }

        public Criteria andResideAddressNotBetween(String value1, String value2) {
            addCriterion("reside_address not between", value1, value2, "resideAddress");
            return (Criteria) this;
        }

        public Criteria andPerResidenceProvinceIsNull() {
            addCriterion("per_residence_province is null");
            return (Criteria) this;
        }

        public Criteria andPerResidenceProvinceIsNotNull() {
            addCriterion("per_residence_province is not null");
            return (Criteria) this;
        }

        public Criteria andPerResidenceProvinceEqualTo(Long value) {
            addCriterion("per_residence_province =", value, "perResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andPerResidenceProvinceNotEqualTo(Long value) {
            addCriterion("per_residence_province <>", value, "perResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andPerResidenceProvinceGreaterThan(Long value) {
            addCriterion("per_residence_province >", value, "perResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andPerResidenceProvinceGreaterThanOrEqualTo(Long value) {
            addCriterion("per_residence_province >=", value, "perResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andPerResidenceProvinceLessThan(Long value) {
            addCriterion("per_residence_province <", value, "perResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andPerResidenceProvinceLessThanOrEqualTo(Long value) {
            addCriterion("per_residence_province <=", value, "perResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andPerResidenceProvinceIn(List<Long> values) {
            addCriterion("per_residence_province in", values, "perResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andPerResidenceProvinceNotIn(List<Long> values) {
            addCriterion("per_residence_province not in", values, "perResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andPerResidenceProvinceBetween(Long value1, Long value2) {
            addCriterion("per_residence_province between", value1, value2, "perResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andPerResidenceProvinceNotBetween(Long value1, Long value2) {
            addCriterion("per_residence_province not between", value1, value2, "perResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityIsNull() {
            addCriterion("per_residence_city is null");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityIsNotNull() {
            addCriterion("per_residence_city is not null");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityEqualTo(Long value) {
            addCriterion("per_residence_city =", value, "perResidenceCity");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityNotEqualTo(Long value) {
            addCriterion("per_residence_city <>", value, "perResidenceCity");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityGreaterThan(Long value) {
            addCriterion("per_residence_city >", value, "perResidenceCity");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityGreaterThanOrEqualTo(Long value) {
            addCriterion("per_residence_city >=", value, "perResidenceCity");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityLessThan(Long value) {
            addCriterion("per_residence_city <", value, "perResidenceCity");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityLessThanOrEqualTo(Long value) {
            addCriterion("per_residence_city <=", value, "perResidenceCity");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityIn(List<Long> values) {
            addCriterion("per_residence_city in", values, "perResidenceCity");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityNotIn(List<Long> values) {
            addCriterion("per_residence_city not in", values, "perResidenceCity");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityBetween(Long value1, Long value2) {
            addCriterion("per_residence_city between", value1, value2, "perResidenceCity");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityNotBetween(Long value1, Long value2) {
            addCriterion("per_residence_city not between", value1, value2, "perResidenceCity");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictIsNull() {
            addCriterion("per_residence_district is null");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictIsNotNull() {
            addCriterion("per_residence_district is not null");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictEqualTo(Long value) {
            addCriterion("per_residence_district =", value, "perResidenceDistrict");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictNotEqualTo(Long value) {
            addCriterion("per_residence_district <>", value, "perResidenceDistrict");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictGreaterThan(Long value) {
            addCriterion("per_residence_district >", value, "perResidenceDistrict");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictGreaterThanOrEqualTo(Long value) {
            addCriterion("per_residence_district >=", value, "perResidenceDistrict");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictLessThan(Long value) {
            addCriterion("per_residence_district <", value, "perResidenceDistrict");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictLessThanOrEqualTo(Long value) {
            addCriterion("per_residence_district <=", value, "perResidenceDistrict");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictIn(List<Long> values) {
            addCriterion("per_residence_district in", values, "perResidenceDistrict");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictNotIn(List<Long> values) {
            addCriterion("per_residence_district not in", values, "perResidenceDistrict");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictBetween(Long value1, Long value2) {
            addCriterion("per_residence_district between", value1, value2, "perResidenceDistrict");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictNotBetween(Long value1, Long value2) {
            addCriterion("per_residence_district not between", value1, value2, "perResidenceDistrict");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownIsNull() {
            addCriterion("per_residence_town is null");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownIsNotNull() {
            addCriterion("per_residence_town is not null");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownEqualTo(Long value) {
            addCriterion("per_residence_town =", value, "perResidenceTown");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownNotEqualTo(Long value) {
            addCriterion("per_residence_town <>", value, "perResidenceTown");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownGreaterThan(Long value) {
            addCriterion("per_residence_town >", value, "perResidenceTown");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownGreaterThanOrEqualTo(Long value) {
            addCriterion("per_residence_town >=", value, "perResidenceTown");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownLessThan(Long value) {
            addCriterion("per_residence_town <", value, "perResidenceTown");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownLessThanOrEqualTo(Long value) {
            addCriterion("per_residence_town <=", value, "perResidenceTown");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownIn(List<Long> values) {
            addCriterion("per_residence_town in", values, "perResidenceTown");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownNotIn(List<Long> values) {
            addCriterion("per_residence_town not in", values, "perResidenceTown");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownBetween(Long value1, Long value2) {
            addCriterion("per_residence_town between", value1, value2, "perResidenceTown");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownNotBetween(Long value1, Long value2) {
            addCriterion("per_residence_town not between", value1, value2, "perResidenceTown");
            return (Criteria) this;
        }

        public Criteria andPerResidenceAddressIsNull() {
            addCriterion("per_residence_address is null");
            return (Criteria) this;
        }

        public Criteria andPerResidenceAddressIsNotNull() {
            addCriterion("per_residence_address is not null");
            return (Criteria) this;
        }

        public Criteria andPerResidenceAddressEqualTo(String value) {
            addCriterion("per_residence_address =", value, "perResidenceAddress");
            return (Criteria) this;
        }

        public Criteria andPerResidenceAddressNotEqualTo(String value) {
            addCriterion("per_residence_address <>", value, "perResidenceAddress");
            return (Criteria) this;
        }

        public Criteria andPerResidenceAddressGreaterThan(String value) {
            addCriterion("per_residence_address >", value, "perResidenceAddress");
            return (Criteria) this;
        }

        public Criteria andPerResidenceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("per_residence_address >=", value, "perResidenceAddress");
            return (Criteria) this;
        }

        public Criteria andPerResidenceAddressLessThan(String value) {
            addCriterion("per_residence_address <", value, "perResidenceAddress");
            return (Criteria) this;
        }

        public Criteria andPerResidenceAddressLessThanOrEqualTo(String value) {
            addCriterion("per_residence_address <=", value, "perResidenceAddress");
            return (Criteria) this;
        }

        public Criteria andPerResidenceAddressLike(String value) {
            addCriterion("per_residence_address like", value, "perResidenceAddress");
            return (Criteria) this;
        }

        public Criteria andPerResidenceAddressNotLike(String value) {
            addCriterion("per_residence_address not like", value, "perResidenceAddress");
            return (Criteria) this;
        }

        public Criteria andPerResidenceAddressIn(List<String> values) {
            addCriterion("per_residence_address in", values, "perResidenceAddress");
            return (Criteria) this;
        }

        public Criteria andPerResidenceAddressNotIn(List<String> values) {
            addCriterion("per_residence_address not in", values, "perResidenceAddress");
            return (Criteria) this;
        }

        public Criteria andPerResidenceAddressBetween(String value1, String value2) {
            addCriterion("per_residence_address between", value1, value2, "perResidenceAddress");
            return (Criteria) this;
        }

        public Criteria andPerResidenceAddressNotBetween(String value1, String value2) {
            addCriterion("per_residence_address not between", value1, value2, "perResidenceAddress");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTimeIsNull() {
            addCriterion("per_residence_time is null");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTimeIsNotNull() {
            addCriterion("per_residence_time is not null");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTimeEqualTo(Date value) {
            addCriterion("per_residence_time =", value, "perResidenceTime");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTimeNotEqualTo(Date value) {
            addCriterion("per_residence_time <>", value, "perResidenceTime");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTimeGreaterThan(Date value) {
            addCriterion("per_residence_time >", value, "perResidenceTime");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("per_residence_time >=", value, "perResidenceTime");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTimeLessThan(Date value) {
            addCriterion("per_residence_time <", value, "perResidenceTime");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTimeLessThanOrEqualTo(Date value) {
            addCriterion("per_residence_time <=", value, "perResidenceTime");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTimeIn(List<Date> values) {
            addCriterion("per_residence_time in", values, "perResidenceTime");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTimeNotIn(List<Date> values) {
            addCriterion("per_residence_time not in", values, "perResidenceTime");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTimeBetween(Date value1, Date value2) {
            addCriterion("per_residence_time between", value1, value2, "perResidenceTime");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTimeNotBetween(Date value1, Date value2) {
            addCriterion("per_residence_time not between", value1, value2, "perResidenceTime");
            return (Criteria) this;
        }

        public Criteria andWhetherPassedIsNull() {
            addCriterion("whether_passed is null");
            return (Criteria) this;
        }

        public Criteria andWhetherPassedIsNotNull() {
            addCriterion("whether_passed is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherPassedEqualTo(Integer value) {
            addCriterion("whether_passed =", value, "whetherPassed");
            return (Criteria) this;
        }

        public Criteria andWhetherPassedNotEqualTo(Integer value) {
            addCriterion("whether_passed <>", value, "whetherPassed");
            return (Criteria) this;
        }

        public Criteria andWhetherPassedGreaterThan(Integer value) {
            addCriterion("whether_passed >", value, "whetherPassed");
            return (Criteria) this;
        }

        public Criteria andWhetherPassedGreaterThanOrEqualTo(Integer value) {
            addCriterion("whether_passed >=", value, "whetherPassed");
            return (Criteria) this;
        }

        public Criteria andWhetherPassedLessThan(Integer value) {
            addCriterion("whether_passed <", value, "whetherPassed");
            return (Criteria) this;
        }

        public Criteria andWhetherPassedLessThanOrEqualTo(Integer value) {
            addCriterion("whether_passed <=", value, "whetherPassed");
            return (Criteria) this;
        }

        public Criteria andWhetherPassedIn(List<Integer> values) {
            addCriterion("whether_passed in", values, "whetherPassed");
            return (Criteria) this;
        }

        public Criteria andWhetherPassedNotIn(List<Integer> values) {
            addCriterion("whether_passed not in", values, "whetherPassed");
            return (Criteria) this;
        }

        public Criteria andWhetherPassedBetween(Integer value1, Integer value2) {
            addCriterion("whether_passed between", value1, value2, "whetherPassed");
            return (Criteria) this;
        }

        public Criteria andWhetherPassedNotBetween(Integer value1, Integer value2) {
            addCriterion("whether_passed not between", value1, value2, "whetherPassed");
            return (Criteria) this;
        }

        public Criteria andCompensatStandardIsNull() {
            addCriterion("compensat_standard is null");
            return (Criteria) this;
        }

        public Criteria andCompensatStandardIsNotNull() {
            addCriterion("compensat_standard is not null");
            return (Criteria) this;
        }

        public Criteria andCompensatStandardEqualTo(BigDecimal value) {
            addCriterion("compensat_standard =", value, "compensatStandard");
            return (Criteria) this;
        }

        public Criteria andCompensatStandardNotEqualTo(BigDecimal value) {
            addCriterion("compensat_standard <>", value, "compensatStandard");
            return (Criteria) this;
        }

        public Criteria andCompensatStandardGreaterThan(BigDecimal value) {
            addCriterion("compensat_standard >", value, "compensatStandard");
            return (Criteria) this;
        }

        public Criteria andCompensatStandardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("compensat_standard >=", value, "compensatStandard");
            return (Criteria) this;
        }

        public Criteria andCompensatStandardLessThan(BigDecimal value) {
            addCriterion("compensat_standard <", value, "compensatStandard");
            return (Criteria) this;
        }

        public Criteria andCompensatStandardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("compensat_standard <=", value, "compensatStandard");
            return (Criteria) this;
        }

        public Criteria andCompensatStandardIn(List<BigDecimal> values) {
            addCriterion("compensat_standard in", values, "compensatStandard");
            return (Criteria) this;
        }

        public Criteria andCompensatStandardNotIn(List<BigDecimal> values) {
            addCriterion("compensat_standard not in", values, "compensatStandard");
            return (Criteria) this;
        }

        public Criteria andCompensatStandardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("compensat_standard between", value1, value2, "compensatStandard");
            return (Criteria) this;
        }

        public Criteria andCompensatStandardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("compensat_standard not between", value1, value2, "compensatStandard");
            return (Criteria) this;
        }

        public Criteria andSerialNumIsNull() {
            addCriterion("serial_num is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumIsNotNull() {
            addCriterion("serial_num is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumEqualTo(Integer value) {
            addCriterion("serial_num =", value, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumNotEqualTo(Integer value) {
            addCriterion("serial_num <>", value, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumGreaterThan(Integer value) {
            addCriterion("serial_num >", value, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("serial_num >=", value, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumLessThan(Integer value) {
            addCriterion("serial_num <", value, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumLessThanOrEqualTo(Integer value) {
            addCriterion("serial_num <=", value, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumIn(List<Integer> values) {
            addCriterion("serial_num in", values, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumNotIn(List<Integer> values) {
            addCriterion("serial_num not in", values, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumBetween(Integer value1, Integer value2) {
            addCriterion("serial_num between", value1, value2, "serialNum");
            return (Criteria) this;
        }

        public Criteria andSerialNumNotBetween(Integer value1, Integer value2) {
            addCriterion("serial_num not between", value1, value2, "serialNum");
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