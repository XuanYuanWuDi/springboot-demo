package com.injured.server.api.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InjuredInvestigateOpinionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InjuredInvestigateOpinionsExample() {
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

        public Criteria andVictimRecordPhotoIsNull() {
            addCriterion("victim_record_photo is null");
            return (Criteria) this;
        }

        public Criteria andVictimRecordPhotoIsNotNull() {
            addCriterion("victim_record_photo is not null");
            return (Criteria) this;
        }

        public Criteria andVictimRecordPhotoEqualTo(Integer value) {
            addCriterion("victim_record_photo =", value, "victimRecordPhoto");
            return (Criteria) this;
        }

        public Criteria andVictimRecordPhotoNotEqualTo(Integer value) {
            addCriterion("victim_record_photo <>", value, "victimRecordPhoto");
            return (Criteria) this;
        }

        public Criteria andVictimRecordPhotoGreaterThan(Integer value) {
            addCriterion("victim_record_photo >", value, "victimRecordPhoto");
            return (Criteria) this;
        }

        public Criteria andVictimRecordPhotoGreaterThanOrEqualTo(Integer value) {
            addCriterion("victim_record_photo >=", value, "victimRecordPhoto");
            return (Criteria) this;
        }

        public Criteria andVictimRecordPhotoLessThan(Integer value) {
            addCriterion("victim_record_photo <", value, "victimRecordPhoto");
            return (Criteria) this;
        }

        public Criteria andVictimRecordPhotoLessThanOrEqualTo(Integer value) {
            addCriterion("victim_record_photo <=", value, "victimRecordPhoto");
            return (Criteria) this;
        }

        public Criteria andVictimRecordPhotoIn(List<Integer> values) {
            addCriterion("victim_record_photo in", values, "victimRecordPhoto");
            return (Criteria) this;
        }

        public Criteria andVictimRecordPhotoNotIn(List<Integer> values) {
            addCriterion("victim_record_photo not in", values, "victimRecordPhoto");
            return (Criteria) this;
        }

        public Criteria andVictimRecordPhotoBetween(Integer value1, Integer value2) {
            addCriterion("victim_record_photo between", value1, value2, "victimRecordPhoto");
            return (Criteria) this;
        }

        public Criteria andVictimRecordPhotoNotBetween(Integer value1, Integer value2) {
            addCriterion("victim_record_photo not between", value1, value2, "victimRecordPhoto");
            return (Criteria) this;
        }

        public Criteria andClaimGroupPhotoIsNull() {
            addCriterion("claim_group_photo is null");
            return (Criteria) this;
        }

        public Criteria andClaimGroupPhotoIsNotNull() {
            addCriterion("claim_group_photo is not null");
            return (Criteria) this;
        }

        public Criteria andClaimGroupPhotoEqualTo(Integer value) {
            addCriterion("claim_group_photo =", value, "claimGroupPhoto");
            return (Criteria) this;
        }

        public Criteria andClaimGroupPhotoNotEqualTo(Integer value) {
            addCriterion("claim_group_photo <>", value, "claimGroupPhoto");
            return (Criteria) this;
        }

        public Criteria andClaimGroupPhotoGreaterThan(Integer value) {
            addCriterion("claim_group_photo >", value, "claimGroupPhoto");
            return (Criteria) this;
        }

        public Criteria andClaimGroupPhotoGreaterThanOrEqualTo(Integer value) {
            addCriterion("claim_group_photo >=", value, "claimGroupPhoto");
            return (Criteria) this;
        }

        public Criteria andClaimGroupPhotoLessThan(Integer value) {
            addCriterion("claim_group_photo <", value, "claimGroupPhoto");
            return (Criteria) this;
        }

        public Criteria andClaimGroupPhotoLessThanOrEqualTo(Integer value) {
            addCriterion("claim_group_photo <=", value, "claimGroupPhoto");
            return (Criteria) this;
        }

        public Criteria andClaimGroupPhotoIn(List<Integer> values) {
            addCriterion("claim_group_photo in", values, "claimGroupPhoto");
            return (Criteria) this;
        }

        public Criteria andClaimGroupPhotoNotIn(List<Integer> values) {
            addCriterion("claim_group_photo not in", values, "claimGroupPhoto");
            return (Criteria) this;
        }

        public Criteria andClaimGroupPhotoBetween(Integer value1, Integer value2) {
            addCriterion("claim_group_photo between", value1, value2, "claimGroupPhoto");
            return (Criteria) this;
        }

        public Criteria andClaimGroupPhotoNotBetween(Integer value1, Integer value2) {
            addCriterion("claim_group_photo not between", value1, value2, "claimGroupPhoto");
            return (Criteria) this;
        }

        public Criteria andActualSurveyReportIsNull() {
            addCriterion("actual_survey_report is null");
            return (Criteria) this;
        }

        public Criteria andActualSurveyReportIsNotNull() {
            addCriterion("actual_survey_report is not null");
            return (Criteria) this;
        }

        public Criteria andActualSurveyReportEqualTo(Integer value) {
            addCriterion("actual_survey_report =", value, "actualSurveyReport");
            return (Criteria) this;
        }

        public Criteria andActualSurveyReportNotEqualTo(Integer value) {
            addCriterion("actual_survey_report <>", value, "actualSurveyReport");
            return (Criteria) this;
        }

        public Criteria andActualSurveyReportGreaterThan(Integer value) {
            addCriterion("actual_survey_report >", value, "actualSurveyReport");
            return (Criteria) this;
        }

        public Criteria andActualSurveyReportGreaterThanOrEqualTo(Integer value) {
            addCriterion("actual_survey_report >=", value, "actualSurveyReport");
            return (Criteria) this;
        }

        public Criteria andActualSurveyReportLessThan(Integer value) {
            addCriterion("actual_survey_report <", value, "actualSurveyReport");
            return (Criteria) this;
        }

        public Criteria andActualSurveyReportLessThanOrEqualTo(Integer value) {
            addCriterion("actual_survey_report <=", value, "actualSurveyReport");
            return (Criteria) this;
        }

        public Criteria andActualSurveyReportIn(List<Integer> values) {
            addCriterion("actual_survey_report in", values, "actualSurveyReport");
            return (Criteria) this;
        }

        public Criteria andActualSurveyReportNotIn(List<Integer> values) {
            addCriterion("actual_survey_report not in", values, "actualSurveyReport");
            return (Criteria) this;
        }

        public Criteria andActualSurveyReportBetween(Integer value1, Integer value2) {
            addCriterion("actual_survey_report between", value1, value2, "actualSurveyReport");
            return (Criteria) this;
        }

        public Criteria andActualSurveyReportNotBetween(Integer value1, Integer value2) {
            addCriterion("actual_survey_report not between", value1, value2, "actualSurveyReport");
            return (Criteria) this;
        }

        public Criteria andStatementOpinionsIsNull() {
            addCriterion("statement_opinions is null");
            return (Criteria) this;
        }

        public Criteria andStatementOpinionsIsNotNull() {
            addCriterion("statement_opinions is not null");
            return (Criteria) this;
        }

        public Criteria andStatementOpinionsEqualTo(String value) {
            addCriterion("statement_opinions =", value, "statementOpinions");
            return (Criteria) this;
        }

        public Criteria andStatementOpinionsNotEqualTo(String value) {
            addCriterion("statement_opinions <>", value, "statementOpinions");
            return (Criteria) this;
        }

        public Criteria andStatementOpinionsGreaterThan(String value) {
            addCriterion("statement_opinions >", value, "statementOpinions");
            return (Criteria) this;
        }

        public Criteria andStatementOpinionsGreaterThanOrEqualTo(String value) {
            addCriterion("statement_opinions >=", value, "statementOpinions");
            return (Criteria) this;
        }

        public Criteria andStatementOpinionsLessThan(String value) {
            addCriterion("statement_opinions <", value, "statementOpinions");
            return (Criteria) this;
        }

        public Criteria andStatementOpinionsLessThanOrEqualTo(String value) {
            addCriterion("statement_opinions <=", value, "statementOpinions");
            return (Criteria) this;
        }

        public Criteria andStatementOpinionsLike(String value) {
            addCriterion("statement_opinions like", value, "statementOpinions");
            return (Criteria) this;
        }

        public Criteria andStatementOpinionsNotLike(String value) {
            addCriterion("statement_opinions not like", value, "statementOpinions");
            return (Criteria) this;
        }

        public Criteria andStatementOpinionsIn(List<String> values) {
            addCriterion("statement_opinions in", values, "statementOpinions");
            return (Criteria) this;
        }

        public Criteria andStatementOpinionsNotIn(List<String> values) {
            addCriterion("statement_opinions not in", values, "statementOpinions");
            return (Criteria) this;
        }

        public Criteria andStatementOpinionsBetween(String value1, String value2) {
            addCriterion("statement_opinions between", value1, value2, "statementOpinions");
            return (Criteria) this;
        }

        public Criteria andStatementOpinionsNotBetween(String value1, String value2) {
            addCriterion("statement_opinions not between", value1, value2, "statementOpinions");
            return (Criteria) this;
        }

        public Criteria andSurveyReceptionTimeIsNull() {
            addCriterion("survey_reception_time is null");
            return (Criteria) this;
        }

        public Criteria andSurveyReceptionTimeIsNotNull() {
            addCriterion("survey_reception_time is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyReceptionTimeEqualTo(Date value) {
            addCriterion("survey_reception_time =", value, "surveyReceptionTime");
            return (Criteria) this;
        }

        public Criteria andSurveyReceptionTimeNotEqualTo(Date value) {
            addCriterion("survey_reception_time <>", value, "surveyReceptionTime");
            return (Criteria) this;
        }

        public Criteria andSurveyReceptionTimeGreaterThan(Date value) {
            addCriterion("survey_reception_time >", value, "surveyReceptionTime");
            return (Criteria) this;
        }

        public Criteria andSurveyReceptionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("survey_reception_time >=", value, "surveyReceptionTime");
            return (Criteria) this;
        }

        public Criteria andSurveyReceptionTimeLessThan(Date value) {
            addCriterion("survey_reception_time <", value, "surveyReceptionTime");
            return (Criteria) this;
        }

        public Criteria andSurveyReceptionTimeLessThanOrEqualTo(Date value) {
            addCriterion("survey_reception_time <=", value, "surveyReceptionTime");
            return (Criteria) this;
        }

        public Criteria andSurveyReceptionTimeIn(List<Date> values) {
            addCriterion("survey_reception_time in", values, "surveyReceptionTime");
            return (Criteria) this;
        }

        public Criteria andSurveyReceptionTimeNotIn(List<Date> values) {
            addCriterion("survey_reception_time not in", values, "surveyReceptionTime");
            return (Criteria) this;
        }

        public Criteria andSurveyReceptionTimeBetween(Date value1, Date value2) {
            addCriterion("survey_reception_time between", value1, value2, "surveyReceptionTime");
            return (Criteria) this;
        }

        public Criteria andSurveyReceptionTimeNotBetween(Date value1, Date value2) {
            addCriterion("survey_reception_time not between", value1, value2, "surveyReceptionTime");
            return (Criteria) this;
        }

        public Criteria andSurveySubmitTimeIsNull() {
            addCriterion("survey_submit_time is null");
            return (Criteria) this;
        }

        public Criteria andSurveySubmitTimeIsNotNull() {
            addCriterion("survey_submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andSurveySubmitTimeEqualTo(Date value) {
            addCriterion("survey_submit_time =", value, "surveySubmitTime");
            return (Criteria) this;
        }

        public Criteria andSurveySubmitTimeNotEqualTo(Date value) {
            addCriterion("survey_submit_time <>", value, "surveySubmitTime");
            return (Criteria) this;
        }

        public Criteria andSurveySubmitTimeGreaterThan(Date value) {
            addCriterion("survey_submit_time >", value, "surveySubmitTime");
            return (Criteria) this;
        }

        public Criteria andSurveySubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("survey_submit_time >=", value, "surveySubmitTime");
            return (Criteria) this;
        }

        public Criteria andSurveySubmitTimeLessThan(Date value) {
            addCriterion("survey_submit_time <", value, "surveySubmitTime");
            return (Criteria) this;
        }

        public Criteria andSurveySubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("survey_submit_time <=", value, "surveySubmitTime");
            return (Criteria) this;
        }

        public Criteria andSurveySubmitTimeIn(List<Date> values) {
            addCriterion("survey_submit_time in", values, "surveySubmitTime");
            return (Criteria) this;
        }

        public Criteria andSurveySubmitTimeNotIn(List<Date> values) {
            addCriterion("survey_submit_time not in", values, "surveySubmitTime");
            return (Criteria) this;
        }

        public Criteria andSurveySubmitTimeBetween(Date value1, Date value2) {
            addCriterion("survey_submit_time between", value1, value2, "surveySubmitTime");
            return (Criteria) this;
        }

        public Criteria andSurveySubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("survey_submit_time not between", value1, value2, "surveySubmitTime");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNull() {
            addCriterion("\"task status\" is null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNotNull() {
            addCriterion("\"task status\" is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusEqualTo(Integer value) {
            addCriterion("\"task status\" =", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotEqualTo(Integer value) {
            addCriterion("\"task status\" <>", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThan(Integer value) {
            addCriterion("\"task status\" >", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"task status\" >=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThan(Integer value) {
            addCriterion("\"task status\" <", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThanOrEqualTo(Integer value) {
            addCriterion("\"task status\" <=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIn(List<Integer> values) {
            addCriterion("\"task status\" in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotIn(List<Integer> values) {
            addCriterion("\"task status\" not in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusBetween(Integer value1, Integer value2) {
            addCriterion("\"task status\" between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("\"task status\" not between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeIsNull() {
            addCriterion("adjust_type is null");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeIsNotNull() {
            addCriterion("adjust_type is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeEqualTo(Integer value) {
            addCriterion("adjust_type =", value, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeNotEqualTo(Integer value) {
            addCriterion("adjust_type <>", value, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeGreaterThan(Integer value) {
            addCriterion("adjust_type >", value, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("adjust_type >=", value, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeLessThan(Integer value) {
            addCriterion("adjust_type <", value, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeLessThanOrEqualTo(Integer value) {
            addCriterion("adjust_type <=", value, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeIn(List<Integer> values) {
            addCriterion("adjust_type in", values, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeNotIn(List<Integer> values) {
            addCriterion("adjust_type not in", values, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeBetween(Integer value1, Integer value2) {
            addCriterion("adjust_type between", value1, value2, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("adjust_type not between", value1, value2, "adjustType");
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

        public Criteria andAmountCompensationIsNull() {
            addCriterion("amount_compensation is null");
            return (Criteria) this;
        }

        public Criteria andAmountCompensationIsNotNull() {
            addCriterion("amount_compensation is not null");
            return (Criteria) this;
        }

        public Criteria andAmountCompensationEqualTo(BigDecimal value) {
            addCriterion("amount_compensation =", value, "amountCompensation");
            return (Criteria) this;
        }

        public Criteria andAmountCompensationNotEqualTo(BigDecimal value) {
            addCriterion("amount_compensation <>", value, "amountCompensation");
            return (Criteria) this;
        }

        public Criteria andAmountCompensationGreaterThan(BigDecimal value) {
            addCriterion("amount_compensation >", value, "amountCompensation");
            return (Criteria) this;
        }

        public Criteria andAmountCompensationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_compensation >=", value, "amountCompensation");
            return (Criteria) this;
        }

        public Criteria andAmountCompensationLessThan(BigDecimal value) {
            addCriterion("amount_compensation <", value, "amountCompensation");
            return (Criteria) this;
        }

        public Criteria andAmountCompensationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_compensation <=", value, "amountCompensation");
            return (Criteria) this;
        }

        public Criteria andAmountCompensationIn(List<BigDecimal> values) {
            addCriterion("amount_compensation in", values, "amountCompensation");
            return (Criteria) this;
        }

        public Criteria andAmountCompensationNotIn(List<BigDecimal> values) {
            addCriterion("amount_compensation not in", values, "amountCompensation");
            return (Criteria) this;
        }

        public Criteria andAmountCompensationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_compensation between", value1, value2, "amountCompensation");
            return (Criteria) this;
        }

        public Criteria andAmountCompensationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_compensation not between", value1, value2, "amountCompensation");
            return (Criteria) this;
        }

        public Criteria andConfirmationOpinionsIsNull() {
            addCriterion("confirmation_opinions is null");
            return (Criteria) this;
        }

        public Criteria andConfirmationOpinionsIsNotNull() {
            addCriterion("confirmation_opinions is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmationOpinionsEqualTo(Integer value) {
            addCriterion("confirmation_opinions =", value, "confirmationOpinions");
            return (Criteria) this;
        }

        public Criteria andConfirmationOpinionsNotEqualTo(Integer value) {
            addCriterion("confirmation_opinions <>", value, "confirmationOpinions");
            return (Criteria) this;
        }

        public Criteria andConfirmationOpinionsGreaterThan(Integer value) {
            addCriterion("confirmation_opinions >", value, "confirmationOpinions");
            return (Criteria) this;
        }

        public Criteria andConfirmationOpinionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirmation_opinions >=", value, "confirmationOpinions");
            return (Criteria) this;
        }

        public Criteria andConfirmationOpinionsLessThan(Integer value) {
            addCriterion("confirmation_opinions <", value, "confirmationOpinions");
            return (Criteria) this;
        }

        public Criteria andConfirmationOpinionsLessThanOrEqualTo(Integer value) {
            addCriterion("confirmation_opinions <=", value, "confirmationOpinions");
            return (Criteria) this;
        }

        public Criteria andConfirmationOpinionsIn(List<Integer> values) {
            addCriterion("confirmation_opinions in", values, "confirmationOpinions");
            return (Criteria) this;
        }

        public Criteria andConfirmationOpinionsNotIn(List<Integer> values) {
            addCriterion("confirmation_opinions not in", values, "confirmationOpinions");
            return (Criteria) this;
        }

        public Criteria andConfirmationOpinionsBetween(Integer value1, Integer value2) {
            addCriterion("confirmation_opinions between", value1, value2, "confirmationOpinions");
            return (Criteria) this;
        }

        public Criteria andConfirmationOpinionsNotBetween(Integer value1, Integer value2) {
            addCriterion("confirmation_opinions not between", value1, value2, "confirmationOpinions");
            return (Criteria) this;
        }

        public Criteria andConfirmationNoteIsNull() {
            addCriterion("confirmation_note is null");
            return (Criteria) this;
        }

        public Criteria andConfirmationNoteIsNotNull() {
            addCriterion("confirmation_note is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmationNoteEqualTo(String value) {
            addCriterion("confirmation_note =", value, "confirmationNote");
            return (Criteria) this;
        }

        public Criteria andConfirmationNoteNotEqualTo(String value) {
            addCriterion("confirmation_note <>", value, "confirmationNote");
            return (Criteria) this;
        }

        public Criteria andConfirmationNoteGreaterThan(String value) {
            addCriterion("confirmation_note >", value, "confirmationNote");
            return (Criteria) this;
        }

        public Criteria andConfirmationNoteGreaterThanOrEqualTo(String value) {
            addCriterion("confirmation_note >=", value, "confirmationNote");
            return (Criteria) this;
        }

        public Criteria andConfirmationNoteLessThan(String value) {
            addCriterion("confirmation_note <", value, "confirmationNote");
            return (Criteria) this;
        }

        public Criteria andConfirmationNoteLessThanOrEqualTo(String value) {
            addCriterion("confirmation_note <=", value, "confirmationNote");
            return (Criteria) this;
        }

        public Criteria andConfirmationNoteLike(String value) {
            addCriterion("confirmation_note like", value, "confirmationNote");
            return (Criteria) this;
        }

        public Criteria andConfirmationNoteNotLike(String value) {
            addCriterion("confirmation_note not like", value, "confirmationNote");
            return (Criteria) this;
        }

        public Criteria andConfirmationNoteIn(List<String> values) {
            addCriterion("confirmation_note in", values, "confirmationNote");
            return (Criteria) this;
        }

        public Criteria andConfirmationNoteNotIn(List<String> values) {
            addCriterion("confirmation_note not in", values, "confirmationNote");
            return (Criteria) this;
        }

        public Criteria andConfirmationNoteBetween(String value1, String value2) {
            addCriterion("confirmation_note between", value1, value2, "confirmationNote");
            return (Criteria) this;
        }

        public Criteria andConfirmationNoteNotBetween(String value1, String value2) {
            addCriterion("confirmation_note not between", value1, value2, "confirmationNote");
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