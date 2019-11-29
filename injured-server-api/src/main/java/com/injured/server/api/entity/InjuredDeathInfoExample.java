package com.injured.server.api.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InjuredDeathInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InjuredDeathInfoExample() {
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

        public Criteria andDeathCauseIsNull() {
            addCriterion("death_cause is null");
            return (Criteria) this;
        }

        public Criteria andDeathCauseIsNotNull() {
            addCriterion("death_cause is not null");
            return (Criteria) this;
        }

        public Criteria andDeathCauseEqualTo(Byte value) {
            addCriterion("death_cause =", value, "deathCause");
            return (Criteria) this;
        }

        public Criteria andDeathCauseNotEqualTo(Byte value) {
            addCriterion("death_cause <>", value, "deathCause");
            return (Criteria) this;
        }

        public Criteria andDeathCauseGreaterThan(Byte value) {
            addCriterion("death_cause >", value, "deathCause");
            return (Criteria) this;
        }

        public Criteria andDeathCauseGreaterThanOrEqualTo(Byte value) {
            addCriterion("death_cause >=", value, "deathCause");
            return (Criteria) this;
        }

        public Criteria andDeathCauseLessThan(Byte value) {
            addCriterion("death_cause <", value, "deathCause");
            return (Criteria) this;
        }

        public Criteria andDeathCauseLessThanOrEqualTo(Byte value) {
            addCriterion("death_cause <=", value, "deathCause");
            return (Criteria) this;
        }

        public Criteria andDeathCauseIn(List<Byte> values) {
            addCriterion("death_cause in", values, "deathCause");
            return (Criteria) this;
        }

        public Criteria andDeathCauseNotIn(List<Byte> values) {
            addCriterion("death_cause not in", values, "deathCause");
            return (Criteria) this;
        }

        public Criteria andDeathCauseBetween(Byte value1, Byte value2) {
            addCriterion("death_cause between", value1, value2, "deathCause");
            return (Criteria) this;
        }

        public Criteria andDeathCauseNotBetween(Byte value1, Byte value2) {
            addCriterion("death_cause not between", value1, value2, "deathCause");
            return (Criteria) this;
        }

        public Criteria andDeathTimeIsNull() {
            addCriterion("death_time is null");
            return (Criteria) this;
        }

        public Criteria andDeathTimeIsNotNull() {
            addCriterion("death_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeathTimeEqualTo(Date value) {
            addCriterion("death_time =", value, "deathTime");
            return (Criteria) this;
        }

        public Criteria andDeathTimeNotEqualTo(Date value) {
            addCriterion("death_time <>", value, "deathTime");
            return (Criteria) this;
        }

        public Criteria andDeathTimeGreaterThan(Date value) {
            addCriterion("death_time >", value, "deathTime");
            return (Criteria) this;
        }

        public Criteria andDeathTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("death_time >=", value, "deathTime");
            return (Criteria) this;
        }

        public Criteria andDeathTimeLessThan(Date value) {
            addCriterion("death_time <", value, "deathTime");
            return (Criteria) this;
        }

        public Criteria andDeathTimeLessThanOrEqualTo(Date value) {
            addCriterion("death_time <=", value, "deathTime");
            return (Criteria) this;
        }

        public Criteria andDeathTimeIn(List<Date> values) {
            addCriterion("death_time in", values, "deathTime");
            return (Criteria) this;
        }

        public Criteria andDeathTimeNotIn(List<Date> values) {
            addCriterion("death_time not in", values, "deathTime");
            return (Criteria) this;
        }

        public Criteria andDeathTimeBetween(Date value1, Date value2) {
            addCriterion("death_time between", value1, value2, "deathTime");
            return (Criteria) this;
        }

        public Criteria andDeathTimeNotBetween(Date value1, Date value2) {
            addCriterion("death_time not between", value1, value2, "deathTime");
            return (Criteria) this;
        }

        public Criteria andDeathTraumaParticipatIsNull() {
            addCriterion("death_trauma_participat is null");
            return (Criteria) this;
        }

        public Criteria andDeathTraumaParticipatIsNotNull() {
            addCriterion("death_trauma_participat is not null");
            return (Criteria) this;
        }

        public Criteria andDeathTraumaParticipatEqualTo(BigDecimal value) {
            addCriterion("death_trauma_participat =", value, "deathTraumaParticipat");
            return (Criteria) this;
        }

        public Criteria andDeathTraumaParticipatNotEqualTo(BigDecimal value) {
            addCriterion("death_trauma_participat <>", value, "deathTraumaParticipat");
            return (Criteria) this;
        }

        public Criteria andDeathTraumaParticipatGreaterThan(BigDecimal value) {
            addCriterion("death_trauma_participat >", value, "deathTraumaParticipat");
            return (Criteria) this;
        }

        public Criteria andDeathTraumaParticipatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("death_trauma_participat >=", value, "deathTraumaParticipat");
            return (Criteria) this;
        }

        public Criteria andDeathTraumaParticipatLessThan(BigDecimal value) {
            addCriterion("death_trauma_participat <", value, "deathTraumaParticipat");
            return (Criteria) this;
        }

        public Criteria andDeathTraumaParticipatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("death_trauma_participat <=", value, "deathTraumaParticipat");
            return (Criteria) this;
        }

        public Criteria andDeathTraumaParticipatIn(List<BigDecimal> values) {
            addCriterion("death_trauma_participat in", values, "deathTraumaParticipat");
            return (Criteria) this;
        }

        public Criteria andDeathTraumaParticipatNotIn(List<BigDecimal> values) {
            addCriterion("death_trauma_participat not in", values, "deathTraumaParticipat");
            return (Criteria) this;
        }

        public Criteria andDeathTraumaParticipatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("death_trauma_participat between", value1, value2, "deathTraumaParticipat");
            return (Criteria) this;
        }

        public Criteria andDeathTraumaParticipatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("death_trauma_participat not between", value1, value2, "deathTraumaParticipat");
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

        public Criteria andCompensCoeEqualTo(String value) {
            addCriterion("compens_coe =", value, "compensCoe");
            return (Criteria) this;
        }

        public Criteria andCompensCoeNotEqualTo(String value) {
            addCriterion("compens_coe <>", value, "compensCoe");
            return (Criteria) this;
        }

        public Criteria andCompensCoeGreaterThan(String value) {
            addCriterion("compens_coe >", value, "compensCoe");
            return (Criteria) this;
        }

        public Criteria andCompensCoeGreaterThanOrEqualTo(String value) {
            addCriterion("compens_coe >=", value, "compensCoe");
            return (Criteria) this;
        }

        public Criteria andCompensCoeLessThan(String value) {
            addCriterion("compens_coe <", value, "compensCoe");
            return (Criteria) this;
        }

        public Criteria andCompensCoeLessThanOrEqualTo(String value) {
            addCriterion("compens_coe <=", value, "compensCoe");
            return (Criteria) this;
        }

        public Criteria andCompensCoeLike(String value) {
            addCriterion("compens_coe like", value, "compensCoe");
            return (Criteria) this;
        }

        public Criteria andCompensCoeNotLike(String value) {
            addCriterion("compens_coe not like", value, "compensCoe");
            return (Criteria) this;
        }

        public Criteria andCompensCoeIn(List<String> values) {
            addCriterion("compens_coe in", values, "compensCoe");
            return (Criteria) this;
        }

        public Criteria andCompensCoeNotIn(List<String> values) {
            addCriterion("compens_coe not in", values, "compensCoe");
            return (Criteria) this;
        }

        public Criteria andCompensCoeBetween(String value1, String value2) {
            addCriterion("compens_coe between", value1, value2, "compensCoe");
            return (Criteria) this;
        }

        public Criteria andCompensCoeNotBetween(String value1, String value2) {
            addCriterion("compens_coe not between", value1, value2, "compensCoe");
            return (Criteria) this;
        }

        public Criteria andDeathCompensatPeriodIsNull() {
            addCriterion("death_compensat_period is null");
            return (Criteria) this;
        }

        public Criteria andDeathCompensatPeriodIsNotNull() {
            addCriterion("death_compensat_period is not null");
            return (Criteria) this;
        }

        public Criteria andDeathCompensatPeriodEqualTo(String value) {
            addCriterion("death_compensat_period =", value, "deathCompensatPeriod");
            return (Criteria) this;
        }

        public Criteria andDeathCompensatPeriodNotEqualTo(String value) {
            addCriterion("death_compensat_period <>", value, "deathCompensatPeriod");
            return (Criteria) this;
        }

        public Criteria andDeathCompensatPeriodGreaterThan(String value) {
            addCriterion("death_compensat_period >", value, "deathCompensatPeriod");
            return (Criteria) this;
        }

        public Criteria andDeathCompensatPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("death_compensat_period >=", value, "deathCompensatPeriod");
            return (Criteria) this;
        }

        public Criteria andDeathCompensatPeriodLessThan(String value) {
            addCriterion("death_compensat_period <", value, "deathCompensatPeriod");
            return (Criteria) this;
        }

        public Criteria andDeathCompensatPeriodLessThanOrEqualTo(String value) {
            addCriterion("death_compensat_period <=", value, "deathCompensatPeriod");
            return (Criteria) this;
        }

        public Criteria andDeathCompensatPeriodLike(String value) {
            addCriterion("death_compensat_period like", value, "deathCompensatPeriod");
            return (Criteria) this;
        }

        public Criteria andDeathCompensatPeriodNotLike(String value) {
            addCriterion("death_compensat_period not like", value, "deathCompensatPeriod");
            return (Criteria) this;
        }

        public Criteria andDeathCompensatPeriodIn(List<String> values) {
            addCriterion("death_compensat_period in", values, "deathCompensatPeriod");
            return (Criteria) this;
        }

        public Criteria andDeathCompensatPeriodNotIn(List<String> values) {
            addCriterion("death_compensat_period not in", values, "deathCompensatPeriod");
            return (Criteria) this;
        }

        public Criteria andDeathCompensatPeriodBetween(String value1, String value2) {
            addCriterion("death_compensat_period between", value1, value2, "deathCompensatPeriod");
            return (Criteria) this;
        }

        public Criteria andDeathCompensatPeriodNotBetween(String value1, String value2) {
            addCriterion("death_compensat_period not between", value1, value2, "deathCompensatPeriod");
            return (Criteria) this;
        }

        public Criteria andAnnualEmployeesSalaryIsNull() {
            addCriterion("annual_employees_salary is null");
            return (Criteria) this;
        }

        public Criteria andAnnualEmployeesSalaryIsNotNull() {
            addCriterion("annual_employees_salary is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualEmployeesSalaryEqualTo(BigDecimal value) {
            addCriterion("annual_employees_salary =", value, "annualEmployeesSalary");
            return (Criteria) this;
        }

        public Criteria andAnnualEmployeesSalaryNotEqualTo(BigDecimal value) {
            addCriterion("annual_employees_salary <>", value, "annualEmployeesSalary");
            return (Criteria) this;
        }

        public Criteria andAnnualEmployeesSalaryGreaterThan(BigDecimal value) {
            addCriterion("annual_employees_salary >", value, "annualEmployeesSalary");
            return (Criteria) this;
        }

        public Criteria andAnnualEmployeesSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("annual_employees_salary >=", value, "annualEmployeesSalary");
            return (Criteria) this;
        }

        public Criteria andAnnualEmployeesSalaryLessThan(BigDecimal value) {
            addCriterion("annual_employees_salary <", value, "annualEmployeesSalary");
            return (Criteria) this;
        }

        public Criteria andAnnualEmployeesSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("annual_employees_salary <=", value, "annualEmployeesSalary");
            return (Criteria) this;
        }

        public Criteria andAnnualEmployeesSalaryIn(List<BigDecimal> values) {
            addCriterion("annual_employees_salary in", values, "annualEmployeesSalary");
            return (Criteria) this;
        }

        public Criteria andAnnualEmployeesSalaryNotIn(List<BigDecimal> values) {
            addCriterion("annual_employees_salary not in", values, "annualEmployeesSalary");
            return (Criteria) this;
        }

        public Criteria andAnnualEmployeesSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("annual_employees_salary between", value1, value2, "annualEmployeesSalary");
            return (Criteria) this;
        }

        public Criteria andAnnualEmployeesSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("annual_employees_salary not between", value1, value2, "annualEmployeesSalary");
            return (Criteria) this;
        }

        public Criteria andHandledPeopNumIsNull() {
            addCriterion("handled_peop_num is null");
            return (Criteria) this;
        }

        public Criteria andHandledPeopNumIsNotNull() {
            addCriterion("handled_peop_num is not null");
            return (Criteria) this;
        }

        public Criteria andHandledPeopNumEqualTo(Integer value) {
            addCriterion("handled_peop_num =", value, "handledPeopNum");
            return (Criteria) this;
        }

        public Criteria andHandledPeopNumNotEqualTo(Integer value) {
            addCriterion("handled_peop_num <>", value, "handledPeopNum");
            return (Criteria) this;
        }

        public Criteria andHandledPeopNumGreaterThan(Integer value) {
            addCriterion("handled_peop_num >", value, "handledPeopNum");
            return (Criteria) this;
        }

        public Criteria andHandledPeopNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("handled_peop_num >=", value, "handledPeopNum");
            return (Criteria) this;
        }

        public Criteria andHandledPeopNumLessThan(Integer value) {
            addCriterion("handled_peop_num <", value, "handledPeopNum");
            return (Criteria) this;
        }

        public Criteria andHandledPeopNumLessThanOrEqualTo(Integer value) {
            addCriterion("handled_peop_num <=", value, "handledPeopNum");
            return (Criteria) this;
        }

        public Criteria andHandledPeopNumIn(List<Integer> values) {
            addCriterion("handled_peop_num in", values, "handledPeopNum");
            return (Criteria) this;
        }

        public Criteria andHandledPeopNumNotIn(List<Integer> values) {
            addCriterion("handled_peop_num not in", values, "handledPeopNum");
            return (Criteria) this;
        }

        public Criteria andHandledPeopNumBetween(Integer value1, Integer value2) {
            addCriterion("handled_peop_num between", value1, value2, "handledPeopNum");
            return (Criteria) this;
        }

        public Criteria andHandledPeopNumNotBetween(Integer value1, Integer value2) {
            addCriterion("handled_peop_num not between", value1, value2, "handledPeopNum");
            return (Criteria) this;
        }

        public Criteria andHandledDaysIsNull() {
            addCriterion("handled_days is null");
            return (Criteria) this;
        }

        public Criteria andHandledDaysIsNotNull() {
            addCriterion("handled_days is not null");
            return (Criteria) this;
        }

        public Criteria andHandledDaysEqualTo(Integer value) {
            addCriterion("handled_days =", value, "handledDays");
            return (Criteria) this;
        }

        public Criteria andHandledDaysNotEqualTo(Integer value) {
            addCriterion("handled_days <>", value, "handledDays");
            return (Criteria) this;
        }

        public Criteria andHandledDaysGreaterThan(Integer value) {
            addCriterion("handled_days >", value, "handledDays");
            return (Criteria) this;
        }

        public Criteria andHandledDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("handled_days >=", value, "handledDays");
            return (Criteria) this;
        }

        public Criteria andHandledDaysLessThan(Integer value) {
            addCriterion("handled_days <", value, "handledDays");
            return (Criteria) this;
        }

        public Criteria andHandledDaysLessThanOrEqualTo(Integer value) {
            addCriterion("handled_days <=", value, "handledDays");
            return (Criteria) this;
        }

        public Criteria andHandledDaysIn(List<Integer> values) {
            addCriterion("handled_days in", values, "handledDays");
            return (Criteria) this;
        }

        public Criteria andHandledDaysNotIn(List<Integer> values) {
            addCriterion("handled_days not in", values, "handledDays");
            return (Criteria) this;
        }

        public Criteria andHandledDaysBetween(Integer value1, Integer value2) {
            addCriterion("handled_days between", value1, value2, "handledDays");
            return (Criteria) this;
        }

        public Criteria andHandledDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("handled_days not between", value1, value2, "handledDays");
            return (Criteria) this;
        }

        public Criteria andHandledPeopIncomeIsNull() {
            addCriterion("handled_peop_income is null");
            return (Criteria) this;
        }

        public Criteria andHandledPeopIncomeIsNotNull() {
            addCriterion("handled_peop_income is not null");
            return (Criteria) this;
        }

        public Criteria andHandledPeopIncomeEqualTo(BigDecimal value) {
            addCriterion("handled_peop_income =", value, "handledPeopIncome");
            return (Criteria) this;
        }

        public Criteria andHandledPeopIncomeNotEqualTo(BigDecimal value) {
            addCriterion("handled_peop_income <>", value, "handledPeopIncome");
            return (Criteria) this;
        }

        public Criteria andHandledPeopIncomeGreaterThan(BigDecimal value) {
            addCriterion("handled_peop_income >", value, "handledPeopIncome");
            return (Criteria) this;
        }

        public Criteria andHandledPeopIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("handled_peop_income >=", value, "handledPeopIncome");
            return (Criteria) this;
        }

        public Criteria andHandledPeopIncomeLessThan(BigDecimal value) {
            addCriterion("handled_peop_income <", value, "handledPeopIncome");
            return (Criteria) this;
        }

        public Criteria andHandledPeopIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("handled_peop_income <=", value, "handledPeopIncome");
            return (Criteria) this;
        }

        public Criteria andHandledPeopIncomeIn(List<BigDecimal> values) {
            addCriterion("handled_peop_income in", values, "handledPeopIncome");
            return (Criteria) this;
        }

        public Criteria andHandledPeopIncomeNotIn(List<BigDecimal> values) {
            addCriterion("handled_peop_income not in", values, "handledPeopIncome");
            return (Criteria) this;
        }

        public Criteria andHandledPeopIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("handled_peop_income between", value1, value2, "handledPeopIncome");
            return (Criteria) this;
        }

        public Criteria andHandledPeopIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("handled_peop_income not between", value1, value2, "handledPeopIncome");
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

        public Criteria andDeathRelatedDiseaseIsNull() {
            addCriterion("death_related_disease is null");
            return (Criteria) this;
        }

        public Criteria andDeathRelatedDiseaseIsNotNull() {
            addCriterion("death_related_disease is not null");
            return (Criteria) this;
        }

        public Criteria andDeathRelatedDiseaseEqualTo(String value) {
            addCriterion("death_related_disease =", value, "deathRelatedDisease");
            return (Criteria) this;
        }

        public Criteria andDeathRelatedDiseaseNotEqualTo(String value) {
            addCriterion("death_related_disease <>", value, "deathRelatedDisease");
            return (Criteria) this;
        }

        public Criteria andDeathRelatedDiseaseGreaterThan(String value) {
            addCriterion("death_related_disease >", value, "deathRelatedDisease");
            return (Criteria) this;
        }

        public Criteria andDeathRelatedDiseaseGreaterThanOrEqualTo(String value) {
            addCriterion("death_related_disease >=", value, "deathRelatedDisease");
            return (Criteria) this;
        }

        public Criteria andDeathRelatedDiseaseLessThan(String value) {
            addCriterion("death_related_disease <", value, "deathRelatedDisease");
            return (Criteria) this;
        }

        public Criteria andDeathRelatedDiseaseLessThanOrEqualTo(String value) {
            addCriterion("death_related_disease <=", value, "deathRelatedDisease");
            return (Criteria) this;
        }

        public Criteria andDeathRelatedDiseaseLike(String value) {
            addCriterion("death_related_disease like", value, "deathRelatedDisease");
            return (Criteria) this;
        }

        public Criteria andDeathRelatedDiseaseNotLike(String value) {
            addCriterion("death_related_disease not like", value, "deathRelatedDisease");
            return (Criteria) this;
        }

        public Criteria andDeathRelatedDiseaseIn(List<String> values) {
            addCriterion("death_related_disease in", values, "deathRelatedDisease");
            return (Criteria) this;
        }

        public Criteria andDeathRelatedDiseaseNotIn(List<String> values) {
            addCriterion("death_related_disease not in", values, "deathRelatedDisease");
            return (Criteria) this;
        }

        public Criteria andDeathRelatedDiseaseBetween(String value1, String value2) {
            addCriterion("death_related_disease between", value1, value2, "deathRelatedDisease");
            return (Criteria) this;
        }

        public Criteria andDeathRelatedDiseaseNotBetween(String value1, String value2) {
            addCriterion("death_related_disease not between", value1, value2, "deathRelatedDisease");
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