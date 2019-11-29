package com.injured.server.api.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InjuredTreatDiagnosisInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InjuredTreatDiagnosisInfoExample() {
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

        public Criteria andInfoIdIsNull() {
            addCriterion("info_id is null");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNotNull() {
            addCriterion("info_id is not null");
            return (Criteria) this;
        }

        public Criteria andInfoIdEqualTo(Long value) {
            addCriterion("info_id =", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotEqualTo(Long value) {
            addCriterion("info_id <>", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThan(Long value) {
            addCriterion("info_id >", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("info_id >=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThan(Long value) {
            addCriterion("info_id <", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("info_id <=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdIn(List<Long> values) {
            addCriterion("info_id in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotIn(List<Long> values) {
            addCriterion("info_id not in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdBetween(Long value1, Long value2) {
            addCriterion("info_id between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("info_id not between", value1, value2, "infoId");
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

        public Criteria andPrimaryDiagnosisIsNull() {
            addCriterion("primary_diagnosis is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiagnosisIsNotNull() {
            addCriterion("primary_diagnosis is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiagnosisEqualTo(Integer value) {
            addCriterion("primary_diagnosis =", value, "primaryDiagnosis");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiagnosisNotEqualTo(Integer value) {
            addCriterion("primary_diagnosis <>", value, "primaryDiagnosis");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiagnosisGreaterThan(Integer value) {
            addCriterion("primary_diagnosis >", value, "primaryDiagnosis");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiagnosisGreaterThanOrEqualTo(Integer value) {
            addCriterion("primary_diagnosis >=", value, "primaryDiagnosis");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiagnosisLessThan(Integer value) {
            addCriterion("primary_diagnosis <", value, "primaryDiagnosis");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiagnosisLessThanOrEqualTo(Integer value) {
            addCriterion("primary_diagnosis <=", value, "primaryDiagnosis");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiagnosisIn(List<Integer> values) {
            addCriterion("primary_diagnosis in", values, "primaryDiagnosis");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiagnosisNotIn(List<Integer> values) {
            addCriterion("primary_diagnosis not in", values, "primaryDiagnosis");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiagnosisBetween(Integer value1, Integer value2) {
            addCriterion("primary_diagnosis between", value1, value2, "primaryDiagnosis");
            return (Criteria) this;
        }

        public Criteria andPrimaryDiagnosisNotBetween(Integer value1, Integer value2) {
            addCriterion("primary_diagnosis not between", value1, value2, "primaryDiagnosis");
            return (Criteria) this;
        }

        public Criteria andAroundIsNull() {
            addCriterion("around is null");
            return (Criteria) this;
        }

        public Criteria andAroundIsNotNull() {
            addCriterion("around is not null");
            return (Criteria) this;
        }

        public Criteria andAroundEqualTo(Byte value) {
            addCriterion("around =", value, "around");
            return (Criteria) this;
        }

        public Criteria andAroundNotEqualTo(Byte value) {
            addCriterion("around <>", value, "around");
            return (Criteria) this;
        }

        public Criteria andAroundGreaterThan(Byte value) {
            addCriterion("around >", value, "around");
            return (Criteria) this;
        }

        public Criteria andAroundGreaterThanOrEqualTo(Byte value) {
            addCriterion("around >=", value, "around");
            return (Criteria) this;
        }

        public Criteria andAroundLessThan(Byte value) {
            addCriterion("around <", value, "around");
            return (Criteria) this;
        }

        public Criteria andAroundLessThanOrEqualTo(Byte value) {
            addCriterion("around <=", value, "around");
            return (Criteria) this;
        }

        public Criteria andAroundIn(List<Byte> values) {
            addCriterion("around in", values, "around");
            return (Criteria) this;
        }

        public Criteria andAroundNotIn(List<Byte> values) {
            addCriterion("around not in", values, "around");
            return (Criteria) this;
        }

        public Criteria andAroundBetween(Byte value1, Byte value2) {
            addCriterion("around between", value1, value2, "around");
            return (Criteria) this;
        }

        public Criteria andAroundNotBetween(Byte value1, Byte value2) {
            addCriterion("around not between", value1, value2, "around");
            return (Criteria) this;
        }

        public Criteria andDamageSiteIsNull() {
            addCriterion("damage_site is null");
            return (Criteria) this;
        }

        public Criteria andDamageSiteIsNotNull() {
            addCriterion("damage_site is not null");
            return (Criteria) this;
        }

        public Criteria andDamageSiteEqualTo(Integer value) {
            addCriterion("damage_site =", value, "damageSite");
            return (Criteria) this;
        }

        public Criteria andDamageSiteNotEqualTo(Integer value) {
            addCriterion("damage_site <>", value, "damageSite");
            return (Criteria) this;
        }

        public Criteria andDamageSiteGreaterThan(Integer value) {
            addCriterion("damage_site >", value, "damageSite");
            return (Criteria) this;
        }

        public Criteria andDamageSiteGreaterThanOrEqualTo(Integer value) {
            addCriterion("damage_site >=", value, "damageSite");
            return (Criteria) this;
        }

        public Criteria andDamageSiteLessThan(Integer value) {
            addCriterion("damage_site <", value, "damageSite");
            return (Criteria) this;
        }

        public Criteria andDamageSiteLessThanOrEqualTo(Integer value) {
            addCriterion("damage_site <=", value, "damageSite");
            return (Criteria) this;
        }

        public Criteria andDamageSiteIn(List<Integer> values) {
            addCriterion("damage_site in", values, "damageSite");
            return (Criteria) this;
        }

        public Criteria andDamageSiteNotIn(List<Integer> values) {
            addCriterion("damage_site not in", values, "damageSite");
            return (Criteria) this;
        }

        public Criteria andDamageSiteBetween(Integer value1, Integer value2) {
            addCriterion("damage_site between", value1, value2, "damageSite");
            return (Criteria) this;
        }

        public Criteria andDamageSiteNotBetween(Integer value1, Integer value2) {
            addCriterion("damage_site not between", value1, value2, "damageSite");
            return (Criteria) this;
        }

        public Criteria andDamageSiteSecondIsNull() {
            addCriterion("damage_site_second is null");
            return (Criteria) this;
        }

        public Criteria andDamageSiteSecondIsNotNull() {
            addCriterion("damage_site_second is not null");
            return (Criteria) this;
        }

        public Criteria andDamageSiteSecondEqualTo(Integer value) {
            addCriterion("damage_site_second =", value, "damageSiteSecond");
            return (Criteria) this;
        }

        public Criteria andDamageSiteSecondNotEqualTo(Integer value) {
            addCriterion("damage_site_second <>", value, "damageSiteSecond");
            return (Criteria) this;
        }

        public Criteria andDamageSiteSecondGreaterThan(Integer value) {
            addCriterion("damage_site_second >", value, "damageSiteSecond");
            return (Criteria) this;
        }

        public Criteria andDamageSiteSecondGreaterThanOrEqualTo(Integer value) {
            addCriterion("damage_site_second >=", value, "damageSiteSecond");
            return (Criteria) this;
        }

        public Criteria andDamageSiteSecondLessThan(Integer value) {
            addCriterion("damage_site_second <", value, "damageSiteSecond");
            return (Criteria) this;
        }

        public Criteria andDamageSiteSecondLessThanOrEqualTo(Integer value) {
            addCriterion("damage_site_second <=", value, "damageSiteSecond");
            return (Criteria) this;
        }

        public Criteria andDamageSiteSecondIn(List<Integer> values) {
            addCriterion("damage_site_second in", values, "damageSiteSecond");
            return (Criteria) this;
        }

        public Criteria andDamageSiteSecondNotIn(List<Integer> values) {
            addCriterion("damage_site_second not in", values, "damageSiteSecond");
            return (Criteria) this;
        }

        public Criteria andDamageSiteSecondBetween(Integer value1, Integer value2) {
            addCriterion("damage_site_second between", value1, value2, "damageSiteSecond");
            return (Criteria) this;
        }

        public Criteria andDamageSiteSecondNotBetween(Integer value1, Integer value2) {
            addCriterion("damage_site_second not between", value1, value2, "damageSiteSecond");
            return (Criteria) this;
        }

        public Criteria andDamageTypeIsNull() {
            addCriterion("damage_type is null");
            return (Criteria) this;
        }

        public Criteria andDamageTypeIsNotNull() {
            addCriterion("damage_type is not null");
            return (Criteria) this;
        }

        public Criteria andDamageTypeEqualTo(Integer value) {
            addCriterion("damage_type =", value, "damageType");
            return (Criteria) this;
        }

        public Criteria andDamageTypeNotEqualTo(Integer value) {
            addCriterion("damage_type <>", value, "damageType");
            return (Criteria) this;
        }

        public Criteria andDamageTypeGreaterThan(Integer value) {
            addCriterion("damage_type >", value, "damageType");
            return (Criteria) this;
        }

        public Criteria andDamageTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("damage_type >=", value, "damageType");
            return (Criteria) this;
        }

        public Criteria andDamageTypeLessThan(Integer value) {
            addCriterion("damage_type <", value, "damageType");
            return (Criteria) this;
        }

        public Criteria andDamageTypeLessThanOrEqualTo(Integer value) {
            addCriterion("damage_type <=", value, "damageType");
            return (Criteria) this;
        }

        public Criteria andDamageTypeIn(List<Integer> values) {
            addCriterion("damage_type in", values, "damageType");
            return (Criteria) this;
        }

        public Criteria andDamageTypeNotIn(List<Integer> values) {
            addCriterion("damage_type not in", values, "damageType");
            return (Criteria) this;
        }

        public Criteria andDamageTypeBetween(Integer value1, Integer value2) {
            addCriterion("damage_type between", value1, value2, "damageType");
            return (Criteria) this;
        }

        public Criteria andDamageTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("damage_type not between", value1, value2, "damageType");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInjuryIsNull() {
            addCriterion("diagnosis_injury is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInjuryIsNotNull() {
            addCriterion("diagnosis_injury is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInjuryEqualTo(Integer value) {
            addCriterion("diagnosis_injury =", value, "diagnosisInjury");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInjuryNotEqualTo(Integer value) {
            addCriterion("diagnosis_injury <>", value, "diagnosisInjury");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInjuryGreaterThan(Integer value) {
            addCriterion("diagnosis_injury >", value, "diagnosisInjury");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInjuryGreaterThanOrEqualTo(Integer value) {
            addCriterion("diagnosis_injury >=", value, "diagnosisInjury");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInjuryLessThan(Integer value) {
            addCriterion("diagnosis_injury <", value, "diagnosisInjury");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInjuryLessThanOrEqualTo(Integer value) {
            addCriterion("diagnosis_injury <=", value, "diagnosisInjury");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInjuryIn(List<Integer> values) {
            addCriterion("diagnosis_injury in", values, "diagnosisInjury");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInjuryNotIn(List<Integer> values) {
            addCriterion("diagnosis_injury not in", values, "diagnosisInjury");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInjuryBetween(Integer value1, Integer value2) {
            addCriterion("diagnosis_injury between", value1, value2, "diagnosisInjury");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInjuryNotBetween(Integer value1, Integer value2) {
            addCriterion("diagnosis_injury not between", value1, value2, "diagnosisInjury");
            return (Criteria) this;
        }

        public Criteria andTreatmentIsNull() {
            addCriterion("treatment is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentIsNotNull() {
            addCriterion("treatment is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentEqualTo(Integer value) {
            addCriterion("treatment =", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentNotEqualTo(Integer value) {
            addCriterion("treatment <>", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentGreaterThan(Integer value) {
            addCriterion("treatment >", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("treatment >=", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentLessThan(Integer value) {
            addCriterion("treatment <", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentLessThanOrEqualTo(Integer value) {
            addCriterion("treatment <=", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentIn(List<Integer> values) {
            addCriterion("treatment in", values, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentNotIn(List<Integer> values) {
            addCriterion("treatment not in", values, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentBetween(Integer value1, Integer value2) {
            addCriterion("treatment between", value1, value2, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentNotBetween(Integer value1, Integer value2) {
            addCriterion("treatment not between", value1, value2, "treatment");
            return (Criteria) this;
        }

        public Criteria andSurgicalNameIsNull() {
            addCriterion("surgical_name is null");
            return (Criteria) this;
        }

        public Criteria andSurgicalNameIsNotNull() {
            addCriterion("surgical_name is not null");
            return (Criteria) this;
        }

        public Criteria andSurgicalNameEqualTo(Integer value) {
            addCriterion("surgical_name =", value, "surgicalName");
            return (Criteria) this;
        }

        public Criteria andSurgicalNameNotEqualTo(Integer value) {
            addCriterion("surgical_name <>", value, "surgicalName");
            return (Criteria) this;
        }

        public Criteria andSurgicalNameGreaterThan(Integer value) {
            addCriterion("surgical_name >", value, "surgicalName");
            return (Criteria) this;
        }

        public Criteria andSurgicalNameGreaterThanOrEqualTo(Integer value) {
            addCriterion("surgical_name >=", value, "surgicalName");
            return (Criteria) this;
        }

        public Criteria andSurgicalNameLessThan(Integer value) {
            addCriterion("surgical_name <", value, "surgicalName");
            return (Criteria) this;
        }

        public Criteria andSurgicalNameLessThanOrEqualTo(Integer value) {
            addCriterion("surgical_name <=", value, "surgicalName");
            return (Criteria) this;
        }

        public Criteria andSurgicalNameIn(List<Integer> values) {
            addCriterion("surgical_name in", values, "surgicalName");
            return (Criteria) this;
        }

        public Criteria andSurgicalNameNotIn(List<Integer> values) {
            addCriterion("surgical_name not in", values, "surgicalName");
            return (Criteria) this;
        }

        public Criteria andSurgicalNameBetween(Integer value1, Integer value2) {
            addCriterion("surgical_name between", value1, value2, "surgicalName");
            return (Criteria) this;
        }

        public Criteria andSurgicalNameNotBetween(Integer value1, Integer value2) {
            addCriterion("surgical_name not between", value1, value2, "surgicalName");
            return (Criteria) this;
        }

        public Criteria andSurgeryAgainIsNull() {
            addCriterion("surgery_again is null");
            return (Criteria) this;
        }

        public Criteria andSurgeryAgainIsNotNull() {
            addCriterion("surgery_again is not null");
            return (Criteria) this;
        }

        public Criteria andSurgeryAgainEqualTo(Integer value) {
            addCriterion("surgery_again =", value, "surgeryAgain");
            return (Criteria) this;
        }

        public Criteria andSurgeryAgainNotEqualTo(Integer value) {
            addCriterion("surgery_again <>", value, "surgeryAgain");
            return (Criteria) this;
        }

        public Criteria andSurgeryAgainGreaterThan(Integer value) {
            addCriterion("surgery_again >", value, "surgeryAgain");
            return (Criteria) this;
        }

        public Criteria andSurgeryAgainGreaterThanOrEqualTo(Integer value) {
            addCriterion("surgery_again >=", value, "surgeryAgain");
            return (Criteria) this;
        }

        public Criteria andSurgeryAgainLessThan(Integer value) {
            addCriterion("surgery_again <", value, "surgeryAgain");
            return (Criteria) this;
        }

        public Criteria andSurgeryAgainLessThanOrEqualTo(Integer value) {
            addCriterion("surgery_again <=", value, "surgeryAgain");
            return (Criteria) this;
        }

        public Criteria andSurgeryAgainIn(List<Integer> values) {
            addCriterion("surgery_again in", values, "surgeryAgain");
            return (Criteria) this;
        }

        public Criteria andSurgeryAgainNotIn(List<Integer> values) {
            addCriterion("surgery_again not in", values, "surgeryAgain");
            return (Criteria) this;
        }

        public Criteria andSurgeryAgainBetween(Integer value1, Integer value2) {
            addCriterion("surgery_again between", value1, value2, "surgeryAgain");
            return (Criteria) this;
        }

        public Criteria andSurgeryAgainNotBetween(Integer value1, Integer value2) {
            addCriterion("surgery_again not between", value1, value2, "surgeryAgain");
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