package com.injured.server.api.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InjuredInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InjuredInfoExample() {
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

        public Criteria andInjuryTimeIsNull() {
            addCriterion("injury_time is null");
            return (Criteria) this;
        }

        public Criteria andInjuryTimeIsNotNull() {
            addCriterion("injury_time is not null");
            return (Criteria) this;
        }

        public Criteria andInjuryTimeEqualTo(Date value) {
            addCriterion("injury_time =", value, "injuryTime");
            return (Criteria) this;
        }

        public Criteria andInjuryTimeNotEqualTo(Date value) {
            addCriterion("injury_time <>", value, "injuryTime");
            return (Criteria) this;
        }

        public Criteria andInjuryTimeGreaterThan(Date value) {
            addCriterion("injury_time >", value, "injuryTime");
            return (Criteria) this;
        }

        public Criteria andInjuryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("injury_time >=", value, "injuryTime");
            return (Criteria) this;
        }

        public Criteria andInjuryTimeLessThan(Date value) {
            addCriterion("injury_time <", value, "injuryTime");
            return (Criteria) this;
        }

        public Criteria andInjuryTimeLessThanOrEqualTo(Date value) {
            addCriterion("injury_time <=", value, "injuryTime");
            return (Criteria) this;
        }

        public Criteria andInjuryTimeIn(List<Date> values) {
            addCriterion("injury_time in", values, "injuryTime");
            return (Criteria) this;
        }

        public Criteria andInjuryTimeNotIn(List<Date> values) {
            addCriterion("injury_time not in", values, "injuryTime");
            return (Criteria) this;
        }

        public Criteria andInjuryTimeBetween(Date value1, Date value2) {
            addCriterion("injury_time between", value1, value2, "injuryTime");
            return (Criteria) this;
        }

        public Criteria andInjuryTimeNotBetween(Date value1, Date value2) {
            addCriterion("injury_time not between", value1, value2, "injuryTime");
            return (Criteria) this;
        }

        public Criteria andAnecdotePlateIsNull() {
            addCriterion("anecdote_plate is null");
            return (Criteria) this;
        }

        public Criteria andAnecdotePlateIsNotNull() {
            addCriterion("anecdote_plate is not null");
            return (Criteria) this;
        }

        public Criteria andAnecdotePlateEqualTo(String value) {
            addCriterion("anecdote_plate =", value, "anecdotePlate");
            return (Criteria) this;
        }

        public Criteria andAnecdotePlateNotEqualTo(String value) {
            addCriterion("anecdote_plate <>", value, "anecdotePlate");
            return (Criteria) this;
        }

        public Criteria andAnecdotePlateGreaterThan(String value) {
            addCriterion("anecdote_plate >", value, "anecdotePlate");
            return (Criteria) this;
        }

        public Criteria andAnecdotePlateGreaterThanOrEqualTo(String value) {
            addCriterion("anecdote_plate >=", value, "anecdotePlate");
            return (Criteria) this;
        }

        public Criteria andAnecdotePlateLessThan(String value) {
            addCriterion("anecdote_plate <", value, "anecdotePlate");
            return (Criteria) this;
        }

        public Criteria andAnecdotePlateLessThanOrEqualTo(String value) {
            addCriterion("anecdote_plate <=", value, "anecdotePlate");
            return (Criteria) this;
        }

        public Criteria andAnecdotePlateLike(String value) {
            addCriterion("anecdote_plate like", value, "anecdotePlate");
            return (Criteria) this;
        }

        public Criteria andAnecdotePlateNotLike(String value) {
            addCriterion("anecdote_plate not like", value, "anecdotePlate");
            return (Criteria) this;
        }

        public Criteria andAnecdotePlateIn(List<String> values) {
            addCriterion("anecdote_plate in", values, "anecdotePlate");
            return (Criteria) this;
        }

        public Criteria andAnecdotePlateNotIn(List<String> values) {
            addCriterion("anecdote_plate not in", values, "anecdotePlate");
            return (Criteria) this;
        }

        public Criteria andAnecdotePlateBetween(String value1, String value2) {
            addCriterion("anecdote_plate between", value1, value2, "anecdotePlate");
            return (Criteria) this;
        }

        public Criteria andAnecdotePlateNotBetween(String value1, String value2) {
            addCriterion("anecdote_plate not between", value1, value2, "anecdotePlate");
            return (Criteria) this;
        }

        public Criteria andAnecdoteProvinceIsNull() {
            addCriterion("anecdote_province is null");
            return (Criteria) this;
        }

        public Criteria andAnecdoteProvinceIsNotNull() {
            addCriterion("anecdote_province is not null");
            return (Criteria) this;
        }

        public Criteria andAnecdoteProvinceEqualTo(String value) {
            addCriterion("anecdote_province =", value, "anecdoteProvince");
            return (Criteria) this;
        }

        public Criteria andAnecdoteProvinceNotEqualTo(String value) {
            addCriterion("anecdote_province <>", value, "anecdoteProvince");
            return (Criteria) this;
        }

        public Criteria andAnecdoteProvinceGreaterThan(String value) {
            addCriterion("anecdote_province >", value, "anecdoteProvince");
            return (Criteria) this;
        }

        public Criteria andAnecdoteProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("anecdote_province >=", value, "anecdoteProvince");
            return (Criteria) this;
        }

        public Criteria andAnecdoteProvinceLessThan(String value) {
            addCriterion("anecdote_province <", value, "anecdoteProvince");
            return (Criteria) this;
        }

        public Criteria andAnecdoteProvinceLessThanOrEqualTo(String value) {
            addCriterion("anecdote_province <=", value, "anecdoteProvince");
            return (Criteria) this;
        }

        public Criteria andAnecdoteProvinceLike(String value) {
            addCriterion("anecdote_province like", value, "anecdoteProvince");
            return (Criteria) this;
        }

        public Criteria andAnecdoteProvinceNotLike(String value) {
            addCriterion("anecdote_province not like", value, "anecdoteProvince");
            return (Criteria) this;
        }

        public Criteria andAnecdoteProvinceIn(List<String> values) {
            addCriterion("anecdote_province in", values, "anecdoteProvince");
            return (Criteria) this;
        }

        public Criteria andAnecdoteProvinceNotIn(List<String> values) {
            addCriterion("anecdote_province not in", values, "anecdoteProvince");
            return (Criteria) this;
        }

        public Criteria andAnecdoteProvinceBetween(String value1, String value2) {
            addCriterion("anecdote_province between", value1, value2, "anecdoteProvince");
            return (Criteria) this;
        }

        public Criteria andAnecdoteProvinceNotBetween(String value1, String value2) {
            addCriterion("anecdote_province not between", value1, value2, "anecdoteProvince");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCityIsNull() {
            addCriterion("anecdote_city is null");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCityIsNotNull() {
            addCriterion("anecdote_city is not null");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCityEqualTo(String value) {
            addCriterion("anecdote_city =", value, "anecdoteCity");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCityNotEqualTo(String value) {
            addCriterion("anecdote_city <>", value, "anecdoteCity");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCityGreaterThan(String value) {
            addCriterion("anecdote_city >", value, "anecdoteCity");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCityGreaterThanOrEqualTo(String value) {
            addCriterion("anecdote_city >=", value, "anecdoteCity");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCityLessThan(String value) {
            addCriterion("anecdote_city <", value, "anecdoteCity");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCityLessThanOrEqualTo(String value) {
            addCriterion("anecdote_city <=", value, "anecdoteCity");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCityLike(String value) {
            addCriterion("anecdote_city like", value, "anecdoteCity");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCityNotLike(String value) {
            addCriterion("anecdote_city not like", value, "anecdoteCity");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCityIn(List<String> values) {
            addCriterion("anecdote_city in", values, "anecdoteCity");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCityNotIn(List<String> values) {
            addCriterion("anecdote_city not in", values, "anecdoteCity");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCityBetween(String value1, String value2) {
            addCriterion("anecdote_city between", value1, value2, "anecdoteCity");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCityNotBetween(String value1, String value2) {
            addCriterion("anecdote_city not between", value1, value2, "anecdoteCity");
            return (Criteria) this;
        }

        public Criteria andAnecdoteDistrictIsNull() {
            addCriterion("anecdote_district is null");
            return (Criteria) this;
        }

        public Criteria andAnecdoteDistrictIsNotNull() {
            addCriterion("anecdote_district is not null");
            return (Criteria) this;
        }

        public Criteria andAnecdoteDistrictEqualTo(String value) {
            addCriterion("anecdote_district =", value, "anecdoteDistrict");
            return (Criteria) this;
        }

        public Criteria andAnecdoteDistrictNotEqualTo(String value) {
            addCriterion("anecdote_district <>", value, "anecdoteDistrict");
            return (Criteria) this;
        }

        public Criteria andAnecdoteDistrictGreaterThan(String value) {
            addCriterion("anecdote_district >", value, "anecdoteDistrict");
            return (Criteria) this;
        }

        public Criteria andAnecdoteDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("anecdote_district >=", value, "anecdoteDistrict");
            return (Criteria) this;
        }

        public Criteria andAnecdoteDistrictLessThan(String value) {
            addCriterion("anecdote_district <", value, "anecdoteDistrict");
            return (Criteria) this;
        }

        public Criteria andAnecdoteDistrictLessThanOrEqualTo(String value) {
            addCriterion("anecdote_district <=", value, "anecdoteDistrict");
            return (Criteria) this;
        }

        public Criteria andAnecdoteDistrictLike(String value) {
            addCriterion("anecdote_district like", value, "anecdoteDistrict");
            return (Criteria) this;
        }

        public Criteria andAnecdoteDistrictNotLike(String value) {
            addCriterion("anecdote_district not like", value, "anecdoteDistrict");
            return (Criteria) this;
        }

        public Criteria andAnecdoteDistrictIn(List<String> values) {
            addCriterion("anecdote_district in", values, "anecdoteDistrict");
            return (Criteria) this;
        }

        public Criteria andAnecdoteDistrictNotIn(List<String> values) {
            addCriterion("anecdote_district not in", values, "anecdoteDistrict");
            return (Criteria) this;
        }

        public Criteria andAnecdoteDistrictBetween(String value1, String value2) {
            addCriterion("anecdote_district between", value1, value2, "anecdoteDistrict");
            return (Criteria) this;
        }

        public Criteria andAnecdoteDistrictNotBetween(String value1, String value2) {
            addCriterion("anecdote_district not between", value1, value2, "anecdoteDistrict");
            return (Criteria) this;
        }

        public Criteria andAnecdoteTownIsNull() {
            addCriterion("anecdote_town is null");
            return (Criteria) this;
        }

        public Criteria andAnecdoteTownIsNotNull() {
            addCriterion("anecdote_town is not null");
            return (Criteria) this;
        }

        public Criteria andAnecdoteTownEqualTo(String value) {
            addCriterion("anecdote_town =", value, "anecdoteTown");
            return (Criteria) this;
        }

        public Criteria andAnecdoteTownNotEqualTo(String value) {
            addCriterion("anecdote_town <>", value, "anecdoteTown");
            return (Criteria) this;
        }

        public Criteria andAnecdoteTownGreaterThan(String value) {
            addCriterion("anecdote_town >", value, "anecdoteTown");
            return (Criteria) this;
        }

        public Criteria andAnecdoteTownGreaterThanOrEqualTo(String value) {
            addCriterion("anecdote_town >=", value, "anecdoteTown");
            return (Criteria) this;
        }

        public Criteria andAnecdoteTownLessThan(String value) {
            addCriterion("anecdote_town <", value, "anecdoteTown");
            return (Criteria) this;
        }

        public Criteria andAnecdoteTownLessThanOrEqualTo(String value) {
            addCriterion("anecdote_town <=", value, "anecdoteTown");
            return (Criteria) this;
        }

        public Criteria andAnecdoteTownLike(String value) {
            addCriterion("anecdote_town like", value, "anecdoteTown");
            return (Criteria) this;
        }

        public Criteria andAnecdoteTownNotLike(String value) {
            addCriterion("anecdote_town not like", value, "anecdoteTown");
            return (Criteria) this;
        }

        public Criteria andAnecdoteTownIn(List<String> values) {
            addCriterion("anecdote_town in", values, "anecdoteTown");
            return (Criteria) this;
        }

        public Criteria andAnecdoteTownNotIn(List<String> values) {
            addCriterion("anecdote_town not in", values, "anecdoteTown");
            return (Criteria) this;
        }

        public Criteria andAnecdoteTownBetween(String value1, String value2) {
            addCriterion("anecdote_town between", value1, value2, "anecdoteTown");
            return (Criteria) this;
        }

        public Criteria andAnecdoteTownNotBetween(String value1, String value2) {
            addCriterion("anecdote_town not between", value1, value2, "anecdoteTown");
            return (Criteria) this;
        }

        public Criteria andAnecdoteAddressIsNull() {
            addCriterion("anecdote_address is null");
            return (Criteria) this;
        }

        public Criteria andAnecdoteAddressIsNotNull() {
            addCriterion("anecdote_address is not null");
            return (Criteria) this;
        }

        public Criteria andAnecdoteAddressEqualTo(String value) {
            addCriterion("anecdote_address =", value, "anecdoteAddress");
            return (Criteria) this;
        }

        public Criteria andAnecdoteAddressNotEqualTo(String value) {
            addCriterion("anecdote_address <>", value, "anecdoteAddress");
            return (Criteria) this;
        }

        public Criteria andAnecdoteAddressGreaterThan(String value) {
            addCriterion("anecdote_address >", value, "anecdoteAddress");
            return (Criteria) this;
        }

        public Criteria andAnecdoteAddressGreaterThanOrEqualTo(String value) {
            addCriterion("anecdote_address >=", value, "anecdoteAddress");
            return (Criteria) this;
        }

        public Criteria andAnecdoteAddressLessThan(String value) {
            addCriterion("anecdote_address <", value, "anecdoteAddress");
            return (Criteria) this;
        }

        public Criteria andAnecdoteAddressLessThanOrEqualTo(String value) {
            addCriterion("anecdote_address <=", value, "anecdoteAddress");
            return (Criteria) this;
        }

        public Criteria andAnecdoteAddressLike(String value) {
            addCriterion("anecdote_address like", value, "anecdoteAddress");
            return (Criteria) this;
        }

        public Criteria andAnecdoteAddressNotLike(String value) {
            addCriterion("anecdote_address not like", value, "anecdoteAddress");
            return (Criteria) this;
        }

        public Criteria andAnecdoteAddressIn(List<String> values) {
            addCriterion("anecdote_address in", values, "anecdoteAddress");
            return (Criteria) this;
        }

        public Criteria andAnecdoteAddressNotIn(List<String> values) {
            addCriterion("anecdote_address not in", values, "anecdoteAddress");
            return (Criteria) this;
        }

        public Criteria andAnecdoteAddressBetween(String value1, String value2) {
            addCriterion("anecdote_address between", value1, value2, "anecdoteAddress");
            return (Criteria) this;
        }

        public Criteria andAnecdoteAddressNotBetween(String value1, String value2) {
            addCriterion("anecdote_address not between", value1, value2, "anecdoteAddress");
            return (Criteria) this;
        }

        public Criteria andInjuryPersonSumIsNull() {
            addCriterion("injury_person_sum is null");
            return (Criteria) this;
        }

        public Criteria andInjuryPersonSumIsNotNull() {
            addCriterion("injury_person_sum is not null");
            return (Criteria) this;
        }

        public Criteria andInjuryPersonSumEqualTo(Integer value) {
            addCriterion("injury_person_sum =", value, "injuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andInjuryPersonSumNotEqualTo(Integer value) {
            addCriterion("injury_person_sum <>", value, "injuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andInjuryPersonSumGreaterThan(Integer value) {
            addCriterion("injury_person_sum >", value, "injuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andInjuryPersonSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("injury_person_sum >=", value, "injuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andInjuryPersonSumLessThan(Integer value) {
            addCriterion("injury_person_sum <", value, "injuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andInjuryPersonSumLessThanOrEqualTo(Integer value) {
            addCriterion("injury_person_sum <=", value, "injuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andInjuryPersonSumIn(List<Integer> values) {
            addCriterion("injury_person_sum in", values, "injuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andInjuryPersonSumNotIn(List<Integer> values) {
            addCriterion("injury_person_sum not in", values, "injuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andInjuryPersonSumBetween(Integer value1, Integer value2) {
            addCriterion("injury_person_sum between", value1, value2, "injuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andInjuryPersonSumNotBetween(Integer value1, Integer value2) {
            addCriterion("injury_person_sum not between", value1, value2, "injuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andMinorInjuryPersonSumIsNull() {
            addCriterion("minor_injury_person_sum is null");
            return (Criteria) this;
        }

        public Criteria andMinorInjuryPersonSumIsNotNull() {
            addCriterion("minor_injury_person_sum is not null");
            return (Criteria) this;
        }

        public Criteria andMinorInjuryPersonSumEqualTo(Integer value) {
            addCriterion("minor_injury_person_sum =", value, "minorInjuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andMinorInjuryPersonSumNotEqualTo(Integer value) {
            addCriterion("minor_injury_person_sum <>", value, "minorInjuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andMinorInjuryPersonSumGreaterThan(Integer value) {
            addCriterion("minor_injury_person_sum >", value, "minorInjuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andMinorInjuryPersonSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("minor_injury_person_sum >=", value, "minorInjuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andMinorInjuryPersonSumLessThan(Integer value) {
            addCriterion("minor_injury_person_sum <", value, "minorInjuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andMinorInjuryPersonSumLessThanOrEqualTo(Integer value) {
            addCriterion("minor_injury_person_sum <=", value, "minorInjuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andMinorInjuryPersonSumIn(List<Integer> values) {
            addCriterion("minor_injury_person_sum in", values, "minorInjuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andMinorInjuryPersonSumNotIn(List<Integer> values) {
            addCriterion("minor_injury_person_sum not in", values, "minorInjuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andMinorInjuryPersonSumBetween(Integer value1, Integer value2) {
            addCriterion("minor_injury_person_sum between", value1, value2, "minorInjuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andMinorInjuryPersonSumNotBetween(Integer value1, Integer value2) {
            addCriterion("minor_injury_person_sum not between", value1, value2, "minorInjuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andSeriousInjuryPersonSumIsNull() {
            addCriterion("serious_injury_person_sum is null");
            return (Criteria) this;
        }

        public Criteria andSeriousInjuryPersonSumIsNotNull() {
            addCriterion("serious_injury_person_sum is not null");
            return (Criteria) this;
        }

        public Criteria andSeriousInjuryPersonSumEqualTo(Integer value) {
            addCriterion("serious_injury_person_sum =", value, "seriousInjuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andSeriousInjuryPersonSumNotEqualTo(Integer value) {
            addCriterion("serious_injury_person_sum <>", value, "seriousInjuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andSeriousInjuryPersonSumGreaterThan(Integer value) {
            addCriterion("serious_injury_person_sum >", value, "seriousInjuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andSeriousInjuryPersonSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("serious_injury_person_sum >=", value, "seriousInjuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andSeriousInjuryPersonSumLessThan(Integer value) {
            addCriterion("serious_injury_person_sum <", value, "seriousInjuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andSeriousInjuryPersonSumLessThanOrEqualTo(Integer value) {
            addCriterion("serious_injury_person_sum <=", value, "seriousInjuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andSeriousInjuryPersonSumIn(List<Integer> values) {
            addCriterion("serious_injury_person_sum in", values, "seriousInjuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andSeriousInjuryPersonSumNotIn(List<Integer> values) {
            addCriterion("serious_injury_person_sum not in", values, "seriousInjuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andSeriousInjuryPersonSumBetween(Integer value1, Integer value2) {
            addCriterion("serious_injury_person_sum between", value1, value2, "seriousInjuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andSeriousInjuryPersonSumNotBetween(Integer value1, Integer value2) {
            addCriterion("serious_injury_person_sum not between", value1, value2, "seriousInjuryPersonSum");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCarDirectionIsNull() {
            addCriterion("anecdote_car_direction is null");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCarDirectionIsNotNull() {
            addCriterion("anecdote_car_direction is not null");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCarDirectionEqualTo(String value) {
            addCriterion("anecdote_car_direction =", value, "anecdoteCarDirection");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCarDirectionNotEqualTo(String value) {
            addCriterion("anecdote_car_direction <>", value, "anecdoteCarDirection");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCarDirectionGreaterThan(String value) {
            addCriterion("anecdote_car_direction >", value, "anecdoteCarDirection");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCarDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("anecdote_car_direction >=", value, "anecdoteCarDirection");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCarDirectionLessThan(String value) {
            addCriterion("anecdote_car_direction <", value, "anecdoteCarDirection");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCarDirectionLessThanOrEqualTo(String value) {
            addCriterion("anecdote_car_direction <=", value, "anecdoteCarDirection");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCarDirectionLike(String value) {
            addCriterion("anecdote_car_direction like", value, "anecdoteCarDirection");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCarDirectionNotLike(String value) {
            addCriterion("anecdote_car_direction not like", value, "anecdoteCarDirection");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCarDirectionIn(List<String> values) {
            addCriterion("anecdote_car_direction in", values, "anecdoteCarDirection");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCarDirectionNotIn(List<String> values) {
            addCriterion("anecdote_car_direction not in", values, "anecdoteCarDirection");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCarDirectionBetween(String value1, String value2) {
            addCriterion("anecdote_car_direction between", value1, value2, "anecdoteCarDirection");
            return (Criteria) this;
        }

        public Criteria andAnecdoteCarDirectionNotBetween(String value1, String value2) {
            addCriterion("anecdote_car_direction not between", value1, value2, "anecdoteCarDirection");
            return (Criteria) this;
        }

        public Criteria andWoundedDirectionIsNull() {
            addCriterion("wounded_direction is null");
            return (Criteria) this;
        }

        public Criteria andWoundedDirectionIsNotNull() {
            addCriterion("wounded_direction is not null");
            return (Criteria) this;
        }

        public Criteria andWoundedDirectionEqualTo(String value) {
            addCriterion("wounded_direction =", value, "woundedDirection");
            return (Criteria) this;
        }

        public Criteria andWoundedDirectionNotEqualTo(String value) {
            addCriterion("wounded_direction <>", value, "woundedDirection");
            return (Criteria) this;
        }

        public Criteria andWoundedDirectionGreaterThan(String value) {
            addCriterion("wounded_direction >", value, "woundedDirection");
            return (Criteria) this;
        }

        public Criteria andWoundedDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("wounded_direction >=", value, "woundedDirection");
            return (Criteria) this;
        }

        public Criteria andWoundedDirectionLessThan(String value) {
            addCriterion("wounded_direction <", value, "woundedDirection");
            return (Criteria) this;
        }

        public Criteria andWoundedDirectionLessThanOrEqualTo(String value) {
            addCriterion("wounded_direction <=", value, "woundedDirection");
            return (Criteria) this;
        }

        public Criteria andWoundedDirectionLike(String value) {
            addCriterion("wounded_direction like", value, "woundedDirection");
            return (Criteria) this;
        }

        public Criteria andWoundedDirectionNotLike(String value) {
            addCriterion("wounded_direction not like", value, "woundedDirection");
            return (Criteria) this;
        }

        public Criteria andWoundedDirectionIn(List<String> values) {
            addCriterion("wounded_direction in", values, "woundedDirection");
            return (Criteria) this;
        }

        public Criteria andWoundedDirectionNotIn(List<String> values) {
            addCriterion("wounded_direction not in", values, "woundedDirection");
            return (Criteria) this;
        }

        public Criteria andWoundedDirectionBetween(String value1, String value2) {
            addCriterion("wounded_direction between", value1, value2, "woundedDirection");
            return (Criteria) this;
        }

        public Criteria andWoundedDirectionNotBetween(String value1, String value2) {
            addCriterion("wounded_direction not between", value1, value2, "woundedDirection");
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