package com.injured.server.api.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InjuredIncapacityIdentificationInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InjuredIncapacityIdentificationInfoExample() {
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

        public Criteria andEvaluationMethodIsNull() {
            addCriterion("evaluation_method is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationMethodIsNotNull() {
            addCriterion("evaluation_method is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationMethodEqualTo(Byte value) {
            addCriterion("evaluation_method =", value, "evaluationMethod");
            return (Criteria) this;
        }

        public Criteria andEvaluationMethodNotEqualTo(Byte value) {
            addCriterion("evaluation_method <>", value, "evaluationMethod");
            return (Criteria) this;
        }

        public Criteria andEvaluationMethodGreaterThan(Byte value) {
            addCriterion("evaluation_method >", value, "evaluationMethod");
            return (Criteria) this;
        }

        public Criteria andEvaluationMethodGreaterThanOrEqualTo(Byte value) {
            addCriterion("evaluation_method >=", value, "evaluationMethod");
            return (Criteria) this;
        }

        public Criteria andEvaluationMethodLessThan(Byte value) {
            addCriterion("evaluation_method <", value, "evaluationMethod");
            return (Criteria) this;
        }

        public Criteria andEvaluationMethodLessThanOrEqualTo(Byte value) {
            addCriterion("evaluation_method <=", value, "evaluationMethod");
            return (Criteria) this;
        }

        public Criteria andEvaluationMethodIn(List<Byte> values) {
            addCriterion("evaluation_method in", values, "evaluationMethod");
            return (Criteria) this;
        }

        public Criteria andEvaluationMethodNotIn(List<Byte> values) {
            addCriterion("evaluation_method not in", values, "evaluationMethod");
            return (Criteria) this;
        }

        public Criteria andEvaluationMethodBetween(Byte value1, Byte value2) {
            addCriterion("evaluation_method between", value1, value2, "evaluationMethod");
            return (Criteria) this;
        }

        public Criteria andEvaluationMethodNotBetween(Byte value1, Byte value2) {
            addCriterion("evaluation_method not between", value1, value2, "evaluationMethod");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(Byte value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(Byte value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(Byte value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(Byte value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(Byte value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(Byte value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<Byte> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<Byte> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(Byte value1, Byte value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(Byte value1, Byte value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andDisabilitLevelIsNull() {
            addCriterion("disabilit_level is null");
            return (Criteria) this;
        }

        public Criteria andDisabilitLevelIsNotNull() {
            addCriterion("disabilit_level is not null");
            return (Criteria) this;
        }

        public Criteria andDisabilitLevelEqualTo(Byte value) {
            addCriterion("disabilit_level =", value, "disabilitLevel");
            return (Criteria) this;
        }

        public Criteria andDisabilitLevelNotEqualTo(Byte value) {
            addCriterion("disabilit_level <>", value, "disabilitLevel");
            return (Criteria) this;
        }

        public Criteria andDisabilitLevelGreaterThan(Byte value) {
            addCriterion("disabilit_level >", value, "disabilitLevel");
            return (Criteria) this;
        }

        public Criteria andDisabilitLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("disabilit_level >=", value, "disabilitLevel");
            return (Criteria) this;
        }

        public Criteria andDisabilitLevelLessThan(Byte value) {
            addCriterion("disabilit_level <", value, "disabilitLevel");
            return (Criteria) this;
        }

        public Criteria andDisabilitLevelLessThanOrEqualTo(Byte value) {
            addCriterion("disabilit_level <=", value, "disabilitLevel");
            return (Criteria) this;
        }

        public Criteria andDisabilitLevelIn(List<Byte> values) {
            addCriterion("disabilit_level in", values, "disabilitLevel");
            return (Criteria) this;
        }

        public Criteria andDisabilitLevelNotIn(List<Byte> values) {
            addCriterion("disabilit_level not in", values, "disabilitLevel");
            return (Criteria) this;
        }

        public Criteria andDisabilitLevelBetween(Byte value1, Byte value2) {
            addCriterion("disabilit_level between", value1, value2, "disabilitLevel");
            return (Criteria) this;
        }

        public Criteria andDisabilitLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("disabilit_level not between", value1, value2, "disabilitLevel");
            return (Criteria) this;
        }

        public Criteria andCompensCoeIsNull() {
            addCriterion("compens_coe is null");
            return (Criteria) this;
        }

        public Criteria andCompensCoeIsNotNull() {
            addCriterion("compens_coe is not null");
            return (Criteria) this;
        }

        public Criteria andCompensCoeEqualTo(Integer value) {
            addCriterion("compens_coe =", value, "compensCoe");
            return (Criteria) this;
        }

        public Criteria andCompensCoeNotEqualTo(Integer value) {
            addCriterion("compens_coe <>", value, "compensCoe");
            return (Criteria) this;
        }

        public Criteria andCompensCoeGreaterThan(Integer value) {
            addCriterion("compens_coe >", value, "compensCoe");
            return (Criteria) this;
        }

        public Criteria andCompensCoeGreaterThanOrEqualTo(Integer value) {
            addCriterion("compens_coe >=", value, "compensCoe");
            return (Criteria) this;
        }

        public Criteria andCompensCoeLessThan(Integer value) {
            addCriterion("compens_coe <", value, "compensCoe");
            return (Criteria) this;
        }

        public Criteria andCompensCoeLessThanOrEqualTo(Integer value) {
            addCriterion("compens_coe <=", value, "compensCoe");
            return (Criteria) this;
        }

        public Criteria andCompensCoeIn(List<Integer> values) {
            addCriterion("compens_coe in", values, "compensCoe");
            return (Criteria) this;
        }

        public Criteria andCompensCoeNotIn(List<Integer> values) {
            addCriterion("compens_coe not in", values, "compensCoe");
            return (Criteria) this;
        }

        public Criteria andCompensCoeBetween(Integer value1, Integer value2) {
            addCriterion("compens_coe between", value1, value2, "compensCoe");
            return (Criteria) this;
        }

        public Criteria andCompensCoeNotBetween(Integer value1, Integer value2) {
            addCriterion("compens_coe not between", value1, value2, "compensCoe");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitProIsNull() {
            addCriterion("assess_disabilit_pro is null");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitProIsNotNull() {
            addCriterion("assess_disabilit_pro is not null");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitProEqualTo(String value) {
            addCriterion("assess_disabilit_pro =", value, "assessDisabilitPro");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitProNotEqualTo(String value) {
            addCriterion("assess_disabilit_pro <>", value, "assessDisabilitPro");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitProGreaterThan(String value) {
            addCriterion("assess_disabilit_pro >", value, "assessDisabilitPro");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitProGreaterThanOrEqualTo(String value) {
            addCriterion("assess_disabilit_pro >=", value, "assessDisabilitPro");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitProLessThan(String value) {
            addCriterion("assess_disabilit_pro <", value, "assessDisabilitPro");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitProLessThanOrEqualTo(String value) {
            addCriterion("assess_disabilit_pro <=", value, "assessDisabilitPro");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitProLike(String value) {
            addCriterion("assess_disabilit_pro like", value, "assessDisabilitPro");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitProNotLike(String value) {
            addCriterion("assess_disabilit_pro not like", value, "assessDisabilitPro");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitProIn(List<String> values) {
            addCriterion("assess_disabilit_pro in", values, "assessDisabilitPro");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitProNotIn(List<String> values) {
            addCriterion("assess_disabilit_pro not in", values, "assessDisabilitPro");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitProBetween(String value1, String value2) {
            addCriterion("assess_disabilit_pro between", value1, value2, "assessDisabilitPro");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitProNotBetween(String value1, String value2) {
            addCriterion("assess_disabilit_pro not between", value1, value2, "assessDisabilitPro");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitTimeIsNull() {
            addCriterion("assess_disabilit_time is null");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitTimeIsNotNull() {
            addCriterion("assess_disabilit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitTimeEqualTo(Date value) {
            addCriterion("assess_disabilit_time =", value, "assessDisabilitTime");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitTimeNotEqualTo(Date value) {
            addCriterion("assess_disabilit_time <>", value, "assessDisabilitTime");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitTimeGreaterThan(Date value) {
            addCriterion("assess_disabilit_time >", value, "assessDisabilitTime");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("assess_disabilit_time >=", value, "assessDisabilitTime");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitTimeLessThan(Date value) {
            addCriterion("assess_disabilit_time <", value, "assessDisabilitTime");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitTimeLessThanOrEqualTo(Date value) {
            addCriterion("assess_disabilit_time <=", value, "assessDisabilitTime");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitTimeIn(List<Date> values) {
            addCriterion("assess_disabilit_time in", values, "assessDisabilitTime");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitTimeNotIn(List<Date> values) {
            addCriterion("assess_disabilit_time not in", values, "assessDisabilitTime");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitTimeBetween(Date value1, Date value2) {
            addCriterion("assess_disabilit_time between", value1, value2, "assessDisabilitTime");
            return (Criteria) this;
        }

        public Criteria andAssessDisabilitTimeNotBetween(Date value1, Date value2) {
            addCriterion("assess_disabilit_time not between", value1, value2, "assessDisabilitTime");
            return (Criteria) this;
        }

        public Criteria andAccreditatBodiesNameIsNull() {
            addCriterion("accreditat_bodies_name is null");
            return (Criteria) this;
        }

        public Criteria andAccreditatBodiesNameIsNotNull() {
            addCriterion("accreditat_bodies_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccreditatBodiesNameEqualTo(String value) {
            addCriterion("accreditat_bodies_name =", value, "accreditatBodiesName");
            return (Criteria) this;
        }

        public Criteria andAccreditatBodiesNameNotEqualTo(String value) {
            addCriterion("accreditat_bodies_name <>", value, "accreditatBodiesName");
            return (Criteria) this;
        }

        public Criteria andAccreditatBodiesNameGreaterThan(String value) {
            addCriterion("accreditat_bodies_name >", value, "accreditatBodiesName");
            return (Criteria) this;
        }

        public Criteria andAccreditatBodiesNameGreaterThanOrEqualTo(String value) {
            addCriterion("accreditat_bodies_name >=", value, "accreditatBodiesName");
            return (Criteria) this;
        }

        public Criteria andAccreditatBodiesNameLessThan(String value) {
            addCriterion("accreditat_bodies_name <", value, "accreditatBodiesName");
            return (Criteria) this;
        }

        public Criteria andAccreditatBodiesNameLessThanOrEqualTo(String value) {
            addCriterion("accreditat_bodies_name <=", value, "accreditatBodiesName");
            return (Criteria) this;
        }

        public Criteria andAccreditatBodiesNameLike(String value) {
            addCriterion("accreditat_bodies_name like", value, "accreditatBodiesName");
            return (Criteria) this;
        }

        public Criteria andAccreditatBodiesNameNotLike(String value) {
            addCriterion("accreditat_bodies_name not like", value, "accreditatBodiesName");
            return (Criteria) this;
        }

        public Criteria andAccreditatBodiesNameIn(List<String> values) {
            addCriterion("accreditat_bodies_name in", values, "accreditatBodiesName");
            return (Criteria) this;
        }

        public Criteria andAccreditatBodiesNameNotIn(List<String> values) {
            addCriterion("accreditat_bodies_name not in", values, "accreditatBodiesName");
            return (Criteria) this;
        }

        public Criteria andAccreditatBodiesNameBetween(String value1, String value2) {
            addCriterion("accreditat_bodies_name between", value1, value2, "accreditatBodiesName");
            return (Criteria) this;
        }

        public Criteria andAccreditatBodiesNameNotBetween(String value1, String value2) {
            addCriterion("accreditat_bodies_name not between", value1, value2, "accreditatBodiesName");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameOneIsNull() {
            addCriterion("accreditat_name_one is null");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameOneIsNotNull() {
            addCriterion("accreditat_name_one is not null");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameOneEqualTo(String value) {
            addCriterion("accreditat_name_one =", value, "accreditatNameOne");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameOneNotEqualTo(String value) {
            addCriterion("accreditat_name_one <>", value, "accreditatNameOne");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameOneGreaterThan(String value) {
            addCriterion("accreditat_name_one >", value, "accreditatNameOne");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameOneGreaterThanOrEqualTo(String value) {
            addCriterion("accreditat_name_one >=", value, "accreditatNameOne");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameOneLessThan(String value) {
            addCriterion("accreditat_name_one <", value, "accreditatNameOne");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameOneLessThanOrEqualTo(String value) {
            addCriterion("accreditat_name_one <=", value, "accreditatNameOne");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameOneLike(String value) {
            addCriterion("accreditat_name_one like", value, "accreditatNameOne");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameOneNotLike(String value) {
            addCriterion("accreditat_name_one not like", value, "accreditatNameOne");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameOneIn(List<String> values) {
            addCriterion("accreditat_name_one in", values, "accreditatNameOne");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameOneNotIn(List<String> values) {
            addCriterion("accreditat_name_one not in", values, "accreditatNameOne");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameOneBetween(String value1, String value2) {
            addCriterion("accreditat_name_one between", value1, value2, "accreditatNameOne");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameOneNotBetween(String value1, String value2) {
            addCriterion("accreditat_name_one not between", value1, value2, "accreditatNameOne");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameTwoIsNull() {
            addCriterion("accreditat_name_two is null");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameTwoIsNotNull() {
            addCriterion("accreditat_name_two is not null");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameTwoEqualTo(String value) {
            addCriterion("accreditat_name_two =", value, "accreditatNameTwo");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameTwoNotEqualTo(String value) {
            addCriterion("accreditat_name_two <>", value, "accreditatNameTwo");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameTwoGreaterThan(String value) {
            addCriterion("accreditat_name_two >", value, "accreditatNameTwo");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameTwoGreaterThanOrEqualTo(String value) {
            addCriterion("accreditat_name_two >=", value, "accreditatNameTwo");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameTwoLessThan(String value) {
            addCriterion("accreditat_name_two <", value, "accreditatNameTwo");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameTwoLessThanOrEqualTo(String value) {
            addCriterion("accreditat_name_two <=", value, "accreditatNameTwo");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameTwoLike(String value) {
            addCriterion("accreditat_name_two like", value, "accreditatNameTwo");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameTwoNotLike(String value) {
            addCriterion("accreditat_name_two not like", value, "accreditatNameTwo");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameTwoIn(List<String> values) {
            addCriterion("accreditat_name_two in", values, "accreditatNameTwo");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameTwoNotIn(List<String> values) {
            addCriterion("accreditat_name_two not in", values, "accreditatNameTwo");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameTwoBetween(String value1, String value2) {
            addCriterion("accreditat_name_two between", value1, value2, "accreditatNameTwo");
            return (Criteria) this;
        }

        public Criteria andAccreditatNameTwoNotBetween(String value1, String value2) {
            addCriterion("accreditat_name_two not between", value1, value2, "accreditatNameTwo");
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