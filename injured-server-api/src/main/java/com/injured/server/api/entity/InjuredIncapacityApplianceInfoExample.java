package com.injured.server.api.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InjuredIncapacityApplianceInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InjuredIncapacityApplianceInfoExample() {
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

        public Criteria andIncapacityIdIsNull() {
            addCriterion("incapacity_id is null");
            return (Criteria) this;
        }

        public Criteria andIncapacityIdIsNotNull() {
            addCriterion("incapacity_id is not null");
            return (Criteria) this;
        }

        public Criteria andIncapacityIdEqualTo(Long value) {
            addCriterion("incapacity_id =", value, "incapacityId");
            return (Criteria) this;
        }

        public Criteria andIncapacityIdNotEqualTo(Long value) {
            addCriterion("incapacity_id <>", value, "incapacityId");
            return (Criteria) this;
        }

        public Criteria andIncapacityIdGreaterThan(Long value) {
            addCriterion("incapacity_id >", value, "incapacityId");
            return (Criteria) this;
        }

        public Criteria andIncapacityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("incapacity_id >=", value, "incapacityId");
            return (Criteria) this;
        }

        public Criteria andIncapacityIdLessThan(Long value) {
            addCriterion("incapacity_id <", value, "incapacityId");
            return (Criteria) this;
        }

        public Criteria andIncapacityIdLessThanOrEqualTo(Long value) {
            addCriterion("incapacity_id <=", value, "incapacityId");
            return (Criteria) this;
        }

        public Criteria andIncapacityIdIn(List<Long> values) {
            addCriterion("incapacity_id in", values, "incapacityId");
            return (Criteria) this;
        }

        public Criteria andIncapacityIdNotIn(List<Long> values) {
            addCriterion("incapacity_id not in", values, "incapacityId");
            return (Criteria) this;
        }

        public Criteria andIncapacityIdBetween(Long value1, Long value2) {
            addCriterion("incapacity_id between", value1, value2, "incapacityId");
            return (Criteria) this;
        }

        public Criteria andIncapacityIdNotBetween(Long value1, Long value2) {
            addCriterion("incapacity_id not between", value1, value2, "incapacityId");
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

        public Criteria andHelperDeviceNameIsNull() {
            addCriterion("helper_device_name is null");
            return (Criteria) this;
        }

        public Criteria andHelperDeviceNameIsNotNull() {
            addCriterion("helper_device_name is not null");
            return (Criteria) this;
        }

        public Criteria andHelperDeviceNameEqualTo(String value) {
            addCriterion("helper_device_name =", value, "helperDeviceName");
            return (Criteria) this;
        }

        public Criteria andHelperDeviceNameNotEqualTo(String value) {
            addCriterion("helper_device_name <>", value, "helperDeviceName");
            return (Criteria) this;
        }

        public Criteria andHelperDeviceNameGreaterThan(String value) {
            addCriterion("helper_device_name >", value, "helperDeviceName");
            return (Criteria) this;
        }

        public Criteria andHelperDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("helper_device_name >=", value, "helperDeviceName");
            return (Criteria) this;
        }

        public Criteria andHelperDeviceNameLessThan(String value) {
            addCriterion("helper_device_name <", value, "helperDeviceName");
            return (Criteria) this;
        }

        public Criteria andHelperDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("helper_device_name <=", value, "helperDeviceName");
            return (Criteria) this;
        }

        public Criteria andHelperDeviceNameLike(String value) {
            addCriterion("helper_device_name like", value, "helperDeviceName");
            return (Criteria) this;
        }

        public Criteria andHelperDeviceNameNotLike(String value) {
            addCriterion("helper_device_name not like", value, "helperDeviceName");
            return (Criteria) this;
        }

        public Criteria andHelperDeviceNameIn(List<String> values) {
            addCriterion("helper_device_name in", values, "helperDeviceName");
            return (Criteria) this;
        }

        public Criteria andHelperDeviceNameNotIn(List<String> values) {
            addCriterion("helper_device_name not in", values, "helperDeviceName");
            return (Criteria) this;
        }

        public Criteria andHelperDeviceNameBetween(String value1, String value2) {
            addCriterion("helper_device_name between", value1, value2, "helperDeviceName");
            return (Criteria) this;
        }

        public Criteria andHelperDeviceNameNotBetween(String value1, String value2) {
            addCriterion("helper_device_name not between", value1, value2, "helperDeviceName");
            return (Criteria) this;
        }

        public Criteria andIsConfigIsNull() {
            addCriterion("is_config is null");
            return (Criteria) this;
        }

        public Criteria andIsConfigIsNotNull() {
            addCriterion("is_config is not null");
            return (Criteria) this;
        }

        public Criteria andIsConfigEqualTo(Byte value) {
            addCriterion("is_config =", value, "isConfig");
            return (Criteria) this;
        }

        public Criteria andIsConfigNotEqualTo(Byte value) {
            addCriterion("is_config <>", value, "isConfig");
            return (Criteria) this;
        }

        public Criteria andIsConfigGreaterThan(Byte value) {
            addCriterion("is_config >", value, "isConfig");
            return (Criteria) this;
        }

        public Criteria andIsConfigGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_config >=", value, "isConfig");
            return (Criteria) this;
        }

        public Criteria andIsConfigLessThan(Byte value) {
            addCriterion("is_config <", value, "isConfig");
            return (Criteria) this;
        }

        public Criteria andIsConfigLessThanOrEqualTo(Byte value) {
            addCriterion("is_config <=", value, "isConfig");
            return (Criteria) this;
        }

        public Criteria andIsConfigIn(List<Byte> values) {
            addCriterion("is_config in", values, "isConfig");
            return (Criteria) this;
        }

        public Criteria andIsConfigNotIn(List<Byte> values) {
            addCriterion("is_config not in", values, "isConfig");
            return (Criteria) this;
        }

        public Criteria andIsConfigBetween(Byte value1, Byte value2) {
            addCriterion("is_config between", value1, value2, "isConfig");
            return (Criteria) this;
        }

        public Criteria andIsConfigNotBetween(Byte value1, Byte value2) {
            addCriterion("is_config not between", value1, value2, "isConfig");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyTimeIsNull() {
            addCriterion("evaluation_agency_time is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyTimeIsNotNull() {
            addCriterion("evaluation_agency_time is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyTimeEqualTo(Date value) {
            addCriterion("evaluation_agency_time =", value, "evaluationAgencyTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyTimeNotEqualTo(Date value) {
            addCriterion("evaluation_agency_time <>", value, "evaluationAgencyTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyTimeGreaterThan(Date value) {
            addCriterion("evaluation_agency_time >", value, "evaluationAgencyTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("evaluation_agency_time >=", value, "evaluationAgencyTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyTimeLessThan(Date value) {
            addCriterion("evaluation_agency_time <", value, "evaluationAgencyTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyTimeLessThanOrEqualTo(Date value) {
            addCriterion("evaluation_agency_time <=", value, "evaluationAgencyTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyTimeIn(List<Date> values) {
            addCriterion("evaluation_agency_time in", values, "evaluationAgencyTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyTimeNotIn(List<Date> values) {
            addCriterion("evaluation_agency_time not in", values, "evaluationAgencyTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyTimeBetween(Date value1, Date value2) {
            addCriterion("evaluation_agency_time between", value1, value2, "evaluationAgencyTime");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyTimeNotBetween(Date value1, Date value2) {
            addCriterion("evaluation_agency_time not between", value1, value2, "evaluationAgencyTime");
            return (Criteria) this;
        }

        public Criteria andDisabilitAppPriceIsNull() {
            addCriterion("disabilit_app_price is null");
            return (Criteria) this;
        }

        public Criteria andDisabilitAppPriceIsNotNull() {
            addCriterion("disabilit_app_price is not null");
            return (Criteria) this;
        }

        public Criteria andDisabilitAppPriceEqualTo(BigDecimal value) {
            addCriterion("disabilit_app_price =", value, "disabilitAppPrice");
            return (Criteria) this;
        }

        public Criteria andDisabilitAppPriceNotEqualTo(BigDecimal value) {
            addCriterion("disabilit_app_price <>", value, "disabilitAppPrice");
            return (Criteria) this;
        }

        public Criteria andDisabilitAppPriceGreaterThan(BigDecimal value) {
            addCriterion("disabilit_app_price >", value, "disabilitAppPrice");
            return (Criteria) this;
        }

        public Criteria andDisabilitAppPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("disabilit_app_price >=", value, "disabilitAppPrice");
            return (Criteria) this;
        }

        public Criteria andDisabilitAppPriceLessThan(BigDecimal value) {
            addCriterion("disabilit_app_price <", value, "disabilitAppPrice");
            return (Criteria) this;
        }

        public Criteria andDisabilitAppPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("disabilit_app_price <=", value, "disabilitAppPrice");
            return (Criteria) this;
        }

        public Criteria andDisabilitAppPriceIn(List<BigDecimal> values) {
            addCriterion("disabilit_app_price in", values, "disabilitAppPrice");
            return (Criteria) this;
        }

        public Criteria andDisabilitAppPriceNotIn(List<BigDecimal> values) {
            addCriterion("disabilit_app_price not in", values, "disabilitAppPrice");
            return (Criteria) this;
        }

        public Criteria andDisabilitAppPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("disabilit_app_price between", value1, value2, "disabilitAppPrice");
            return (Criteria) this;
        }

        public Criteria andDisabilitAppPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("disabilit_app_price not between", value1, value2, "disabilitAppPrice");
            return (Criteria) this;
        }

        public Criteria andNeedInstallTimesIsNull() {
            addCriterion("need_install_times is null");
            return (Criteria) this;
        }

        public Criteria andNeedInstallTimesIsNotNull() {
            addCriterion("need_install_times is not null");
            return (Criteria) this;
        }

        public Criteria andNeedInstallTimesEqualTo(Integer value) {
            addCriterion("need_install_times =", value, "needInstallTimes");
            return (Criteria) this;
        }

        public Criteria andNeedInstallTimesNotEqualTo(Integer value) {
            addCriterion("need_install_times <>", value, "needInstallTimes");
            return (Criteria) this;
        }

        public Criteria andNeedInstallTimesGreaterThan(Integer value) {
            addCriterion("need_install_times >", value, "needInstallTimes");
            return (Criteria) this;
        }

        public Criteria andNeedInstallTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("need_install_times >=", value, "needInstallTimes");
            return (Criteria) this;
        }

        public Criteria andNeedInstallTimesLessThan(Integer value) {
            addCriterion("need_install_times <", value, "needInstallTimes");
            return (Criteria) this;
        }

        public Criteria andNeedInstallTimesLessThanOrEqualTo(Integer value) {
            addCriterion("need_install_times <=", value, "needInstallTimes");
            return (Criteria) this;
        }

        public Criteria andNeedInstallTimesIn(List<Integer> values) {
            addCriterion("need_install_times in", values, "needInstallTimes");
            return (Criteria) this;
        }

        public Criteria andNeedInstallTimesNotIn(List<Integer> values) {
            addCriterion("need_install_times not in", values, "needInstallTimes");
            return (Criteria) this;
        }

        public Criteria andNeedInstallTimesBetween(Integer value1, Integer value2) {
            addCriterion("need_install_times between", value1, value2, "needInstallTimes");
            return (Criteria) this;
        }

        public Criteria andNeedInstallTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("need_install_times not between", value1, value2, "needInstallTimes");
            return (Criteria) this;
        }

        public Criteria andAnnualMainRateIsNull() {
            addCriterion("annual_main_rate is null");
            return (Criteria) this;
        }

        public Criteria andAnnualMainRateIsNotNull() {
            addCriterion("annual_main_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualMainRateEqualTo(BigDecimal value) {
            addCriterion("annual_main_rate =", value, "annualMainRate");
            return (Criteria) this;
        }

        public Criteria andAnnualMainRateNotEqualTo(BigDecimal value) {
            addCriterion("annual_main_rate <>", value, "annualMainRate");
            return (Criteria) this;
        }

        public Criteria andAnnualMainRateGreaterThan(BigDecimal value) {
            addCriterion("annual_main_rate >", value, "annualMainRate");
            return (Criteria) this;
        }

        public Criteria andAnnualMainRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("annual_main_rate >=", value, "annualMainRate");
            return (Criteria) this;
        }

        public Criteria andAnnualMainRateLessThan(BigDecimal value) {
            addCriterion("annual_main_rate <", value, "annualMainRate");
            return (Criteria) this;
        }

        public Criteria andAnnualMainRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("annual_main_rate <=", value, "annualMainRate");
            return (Criteria) this;
        }

        public Criteria andAnnualMainRateIn(List<BigDecimal> values) {
            addCriterion("annual_main_rate in", values, "annualMainRate");
            return (Criteria) this;
        }

        public Criteria andAnnualMainRateNotIn(List<BigDecimal> values) {
            addCriterion("annual_main_rate not in", values, "annualMainRate");
            return (Criteria) this;
        }

        public Criteria andAnnualMainRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("annual_main_rate between", value1, value2, "annualMainRate");
            return (Criteria) this;
        }

        public Criteria andAnnualMainRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("annual_main_rate not between", value1, value2, "annualMainRate");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyIsNull() {
            addCriterion("evaluation_agency is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyIsNotNull() {
            addCriterion("evaluation_agency is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyEqualTo(String value) {
            addCriterion("evaluation_agency =", value, "evaluationAgency");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyNotEqualTo(String value) {
            addCriterion("evaluation_agency <>", value, "evaluationAgency");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyGreaterThan(String value) {
            addCriterion("evaluation_agency >", value, "evaluationAgency");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyGreaterThanOrEqualTo(String value) {
            addCriterion("evaluation_agency >=", value, "evaluationAgency");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyLessThan(String value) {
            addCriterion("evaluation_agency <", value, "evaluationAgency");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyLessThanOrEqualTo(String value) {
            addCriterion("evaluation_agency <=", value, "evaluationAgency");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyLike(String value) {
            addCriterion("evaluation_agency like", value, "evaluationAgency");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyNotLike(String value) {
            addCriterion("evaluation_agency not like", value, "evaluationAgency");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyIn(List<String> values) {
            addCriterion("evaluation_agency in", values, "evaluationAgency");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyNotIn(List<String> values) {
            addCriterion("evaluation_agency not in", values, "evaluationAgency");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyBetween(String value1, String value2) {
            addCriterion("evaluation_agency between", value1, value2, "evaluationAgency");
            return (Criteria) this;
        }

        public Criteria andEvaluationAgencyNotBetween(String value1, String value2) {
            addCriterion("evaluation_agency not between", value1, value2, "evaluationAgency");
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