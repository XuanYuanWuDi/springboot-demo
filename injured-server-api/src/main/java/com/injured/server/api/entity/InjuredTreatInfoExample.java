package com.injured.server.api.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InjuredTreatInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InjuredTreatInfoExample() {
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

        public Criteria andIsHospitalSurveyIsNull() {
            addCriterion("is_hospital_survey is null");
            return (Criteria) this;
        }

        public Criteria andIsHospitalSurveyIsNotNull() {
            addCriterion("is_hospital_survey is not null");
            return (Criteria) this;
        }

        public Criteria andIsHospitalSurveyEqualTo(Integer value) {
            addCriterion("is_hospital_survey =", value, "isHospitalSurvey");
            return (Criteria) this;
        }

        public Criteria andIsHospitalSurveyNotEqualTo(Integer value) {
            addCriterion("is_hospital_survey <>", value, "isHospitalSurvey");
            return (Criteria) this;
        }

        public Criteria andIsHospitalSurveyGreaterThan(Integer value) {
            addCriterion("is_hospital_survey >", value, "isHospitalSurvey");
            return (Criteria) this;
        }

        public Criteria andIsHospitalSurveyGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_hospital_survey >=", value, "isHospitalSurvey");
            return (Criteria) this;
        }

        public Criteria andIsHospitalSurveyLessThan(Integer value) {
            addCriterion("is_hospital_survey <", value, "isHospitalSurvey");
            return (Criteria) this;
        }

        public Criteria andIsHospitalSurveyLessThanOrEqualTo(Integer value) {
            addCriterion("is_hospital_survey <=", value, "isHospitalSurvey");
            return (Criteria) this;
        }

        public Criteria andIsHospitalSurveyIn(List<Integer> values) {
            addCriterion("is_hospital_survey in", values, "isHospitalSurvey");
            return (Criteria) this;
        }

        public Criteria andIsHospitalSurveyNotIn(List<Integer> values) {
            addCriterion("is_hospital_survey not in", values, "isHospitalSurvey");
            return (Criteria) this;
        }

        public Criteria andIsHospitalSurveyBetween(Integer value1, Integer value2) {
            addCriterion("is_hospital_survey between", value1, value2, "isHospitalSurvey");
            return (Criteria) this;
        }

        public Criteria andIsHospitalSurveyNotBetween(Integer value1, Integer value2) {
            addCriterion("is_hospital_survey not between", value1, value2, "isHospitalSurvey");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTypeIsNull() {
            addCriterion("send_doctor_type is null");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTypeIsNotNull() {
            addCriterion("send_doctor_type is not null");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTypeEqualTo(Integer value) {
            addCriterion("send_doctor_type =", value, "sendDoctorType");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTypeNotEqualTo(Integer value) {
            addCriterion("send_doctor_type <>", value, "sendDoctorType");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTypeGreaterThan(Integer value) {
            addCriterion("send_doctor_type >", value, "sendDoctorType");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_doctor_type >=", value, "sendDoctorType");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTypeLessThan(Integer value) {
            addCriterion("send_doctor_type <", value, "sendDoctorType");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTypeLessThanOrEqualTo(Integer value) {
            addCriterion("send_doctor_type <=", value, "sendDoctorType");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTypeIn(List<Integer> values) {
            addCriterion("send_doctor_type in", values, "sendDoctorType");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTypeNotIn(List<Integer> values) {
            addCriterion("send_doctor_type not in", values, "sendDoctorType");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTypeBetween(Integer value1, Integer value2) {
            addCriterion("send_doctor_type between", value1, value2, "sendDoctorType");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("send_doctor_type not between", value1, value2, "sendDoctorType");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTimeIsNull() {
            addCriterion("send_doctor_time is null");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTimeIsNotNull() {
            addCriterion("send_doctor_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTimeEqualTo(Date value) {
            addCriterion("send_doctor_time =", value, "sendDoctorTime");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTimeNotEqualTo(Date value) {
            addCriterion("send_doctor_time <>", value, "sendDoctorTime");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTimeGreaterThan(Date value) {
            addCriterion("send_doctor_time >", value, "sendDoctorTime");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_doctor_time >=", value, "sendDoctorTime");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTimeLessThan(Date value) {
            addCriterion("send_doctor_time <", value, "sendDoctorTime");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_doctor_time <=", value, "sendDoctorTime");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTimeIn(List<Date> values) {
            addCriterion("send_doctor_time in", values, "sendDoctorTime");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTimeNotIn(List<Date> values) {
            addCriterion("send_doctor_time not in", values, "sendDoctorTime");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTimeBetween(Date value1, Date value2) {
            addCriterion("send_doctor_time between", value1, value2, "sendDoctorTime");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_doctor_time not between", value1, value2, "sendDoctorTime");
            return (Criteria) this;
        }

        public Criteria andDischargeStatusIsNull() {
            addCriterion("discharge_status is null");
            return (Criteria) this;
        }

        public Criteria andDischargeStatusIsNotNull() {
            addCriterion("discharge_status is not null");
            return (Criteria) this;
        }

        public Criteria andDischargeStatusEqualTo(Integer value) {
            addCriterion("discharge_status =", value, "dischargeStatus");
            return (Criteria) this;
        }

        public Criteria andDischargeStatusNotEqualTo(Integer value) {
            addCriterion("discharge_status <>", value, "dischargeStatus");
            return (Criteria) this;
        }

        public Criteria andDischargeStatusGreaterThan(Integer value) {
            addCriterion("discharge_status >", value, "dischargeStatus");
            return (Criteria) this;
        }

        public Criteria andDischargeStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("discharge_status >=", value, "dischargeStatus");
            return (Criteria) this;
        }

        public Criteria andDischargeStatusLessThan(Integer value) {
            addCriterion("discharge_status <", value, "dischargeStatus");
            return (Criteria) this;
        }

        public Criteria andDischargeStatusLessThanOrEqualTo(Integer value) {
            addCriterion("discharge_status <=", value, "dischargeStatus");
            return (Criteria) this;
        }

        public Criteria andDischargeStatusIn(List<Integer> values) {
            addCriterion("discharge_status in", values, "dischargeStatus");
            return (Criteria) this;
        }

        public Criteria andDischargeStatusNotIn(List<Integer> values) {
            addCriterion("discharge_status not in", values, "dischargeStatus");
            return (Criteria) this;
        }

        public Criteria andDischargeStatusBetween(Integer value1, Integer value2) {
            addCriterion("discharge_status between", value1, value2, "dischargeStatus");
            return (Criteria) this;
        }

        public Criteria andDischargeStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("discharge_status not between", value1, value2, "dischargeStatus");
            return (Criteria) this;
        }

        public Criteria andMealStandardIsNull() {
            addCriterion("meal_standard is null");
            return (Criteria) this;
        }

        public Criteria andMealStandardIsNotNull() {
            addCriterion("meal_standard is not null");
            return (Criteria) this;
        }

        public Criteria andMealStandardEqualTo(BigDecimal value) {
            addCriterion("meal_standard =", value, "mealStandard");
            return (Criteria) this;
        }

        public Criteria andMealStandardNotEqualTo(BigDecimal value) {
            addCriterion("meal_standard <>", value, "mealStandard");
            return (Criteria) this;
        }

        public Criteria andMealStandardGreaterThan(BigDecimal value) {
            addCriterion("meal_standard >", value, "mealStandard");
            return (Criteria) this;
        }

        public Criteria andMealStandardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("meal_standard >=", value, "mealStandard");
            return (Criteria) this;
        }

        public Criteria andMealStandardLessThan(BigDecimal value) {
            addCriterion("meal_standard <", value, "mealStandard");
            return (Criteria) this;
        }

        public Criteria andMealStandardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("meal_standard <=", value, "mealStandard");
            return (Criteria) this;
        }

        public Criteria andMealStandardIn(List<BigDecimal> values) {
            addCriterion("meal_standard in", values, "mealStandard");
            return (Criteria) this;
        }

        public Criteria andMealStandardNotIn(List<BigDecimal> values) {
            addCriterion("meal_standard not in", values, "mealStandard");
            return (Criteria) this;
        }

        public Criteria andMealStandardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("meal_standard between", value1, value2, "mealStandard");
            return (Criteria) this;
        }

        public Criteria andMealStandardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("meal_standard not between", value1, value2, "mealStandard");
            return (Criteria) this;
        }

        public Criteria andIsPastDamageIsNull() {
            addCriterion("is_past_damage is null");
            return (Criteria) this;
        }

        public Criteria andIsPastDamageIsNotNull() {
            addCriterion("is_past_damage is not null");
            return (Criteria) this;
        }

        public Criteria andIsPastDamageEqualTo(Integer value) {
            addCriterion("is_past_damage =", value, "isPastDamage");
            return (Criteria) this;
        }

        public Criteria andIsPastDamageNotEqualTo(Integer value) {
            addCriterion("is_past_damage <>", value, "isPastDamage");
            return (Criteria) this;
        }

        public Criteria andIsPastDamageGreaterThan(Integer value) {
            addCriterion("is_past_damage >", value, "isPastDamage");
            return (Criteria) this;
        }

        public Criteria andIsPastDamageGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_past_damage >=", value, "isPastDamage");
            return (Criteria) this;
        }

        public Criteria andIsPastDamageLessThan(Integer value) {
            addCriterion("is_past_damage <", value, "isPastDamage");
            return (Criteria) this;
        }

        public Criteria andIsPastDamageLessThanOrEqualTo(Integer value) {
            addCriterion("is_past_damage <=", value, "isPastDamage");
            return (Criteria) this;
        }

        public Criteria andIsPastDamageIn(List<Integer> values) {
            addCriterion("is_past_damage in", values, "isPastDamage");
            return (Criteria) this;
        }

        public Criteria andIsPastDamageNotIn(List<Integer> values) {
            addCriterion("is_past_damage not in", values, "isPastDamage");
            return (Criteria) this;
        }

        public Criteria andIsPastDamageBetween(Integer value1, Integer value2) {
            addCriterion("is_past_damage between", value1, value2, "isPastDamage");
            return (Criteria) this;
        }

        public Criteria andIsPastDamageNotBetween(Integer value1, Integer value2) {
            addCriterion("is_past_damage not between", value1, value2, "isPastDamage");
            return (Criteria) this;
        }

        public Criteria andPastDamageIsNull() {
            addCriterion("past_damage is null");
            return (Criteria) this;
        }

        public Criteria andPastDamageIsNotNull() {
            addCriterion("past_damage is not null");
            return (Criteria) this;
        }

        public Criteria andPastDamageEqualTo(String value) {
            addCriterion("past_damage =", value, "pastDamage");
            return (Criteria) this;
        }

        public Criteria andPastDamageNotEqualTo(String value) {
            addCriterion("past_damage <>", value, "pastDamage");
            return (Criteria) this;
        }

        public Criteria andPastDamageGreaterThan(String value) {
            addCriterion("past_damage >", value, "pastDamage");
            return (Criteria) this;
        }

        public Criteria andPastDamageGreaterThanOrEqualTo(String value) {
            addCriterion("past_damage >=", value, "pastDamage");
            return (Criteria) this;
        }

        public Criteria andPastDamageLessThan(String value) {
            addCriterion("past_damage <", value, "pastDamage");
            return (Criteria) this;
        }

        public Criteria andPastDamageLessThanOrEqualTo(String value) {
            addCriterion("past_damage <=", value, "pastDamage");
            return (Criteria) this;
        }

        public Criteria andPastDamageLike(String value) {
            addCriterion("past_damage like", value, "pastDamage");
            return (Criteria) this;
        }

        public Criteria andPastDamageNotLike(String value) {
            addCriterion("past_damage not like", value, "pastDamage");
            return (Criteria) this;
        }

        public Criteria andPastDamageIn(List<String> values) {
            addCriterion("past_damage in", values, "pastDamage");
            return (Criteria) this;
        }

        public Criteria andPastDamageNotIn(List<String> values) {
            addCriterion("past_damage not in", values, "pastDamage");
            return (Criteria) this;
        }

        public Criteria andPastDamageBetween(String value1, String value2) {
            addCriterion("past_damage between", value1, value2, "pastDamage");
            return (Criteria) this;
        }

        public Criteria andPastDamageNotBetween(String value1, String value2) {
            addCriterion("past_damage not between", value1, value2, "pastDamage");
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

        public Criteria andMedicalInsuranceIsNull() {
            addCriterion("medical_insurance is null");
            return (Criteria) this;
        }

        public Criteria andMedicalInsuranceIsNotNull() {
            addCriterion("medical_insurance is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalInsuranceEqualTo(BigDecimal value) {
            addCriterion("medical_insurance =", value, "medicalInsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalInsuranceNotEqualTo(BigDecimal value) {
            addCriterion("medical_insurance <>", value, "medicalInsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalInsuranceGreaterThan(BigDecimal value) {
            addCriterion("medical_insurance >", value, "medicalInsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalInsuranceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("medical_insurance >=", value, "medicalInsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalInsuranceLessThan(BigDecimal value) {
            addCriterion("medical_insurance <", value, "medicalInsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalInsuranceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("medical_insurance <=", value, "medicalInsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalInsuranceIn(List<BigDecimal> values) {
            addCriterion("medical_insurance in", values, "medicalInsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalInsuranceNotIn(List<BigDecimal> values) {
            addCriterion("medical_insurance not in", values, "medicalInsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalInsuranceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("medical_insurance between", value1, value2, "medicalInsurance");
            return (Criteria) this;
        }

        public Criteria andMedicalInsuranceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("medical_insurance not between", value1, value2, "medicalInsurance");
            return (Criteria) this;
        }

        public Criteria andIrrelevantMedicationIsNull() {
            addCriterion("irrelevant_medication is null");
            return (Criteria) this;
        }

        public Criteria andIrrelevantMedicationIsNotNull() {
            addCriterion("irrelevant_medication is not null");
            return (Criteria) this;
        }

        public Criteria andIrrelevantMedicationEqualTo(BigDecimal value) {
            addCriterion("irrelevant_medication =", value, "irrelevantMedication");
            return (Criteria) this;
        }

        public Criteria andIrrelevantMedicationNotEqualTo(BigDecimal value) {
            addCriterion("irrelevant_medication <>", value, "irrelevantMedication");
            return (Criteria) this;
        }

        public Criteria andIrrelevantMedicationGreaterThan(BigDecimal value) {
            addCriterion("irrelevant_medication >", value, "irrelevantMedication");
            return (Criteria) this;
        }

        public Criteria andIrrelevantMedicationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("irrelevant_medication >=", value, "irrelevantMedication");
            return (Criteria) this;
        }

        public Criteria andIrrelevantMedicationLessThan(BigDecimal value) {
            addCriterion("irrelevant_medication <", value, "irrelevantMedication");
            return (Criteria) this;
        }

        public Criteria andIrrelevantMedicationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("irrelevant_medication <=", value, "irrelevantMedication");
            return (Criteria) this;
        }

        public Criteria andIrrelevantMedicationIn(List<BigDecimal> values) {
            addCriterion("irrelevant_medication in", values, "irrelevantMedication");
            return (Criteria) this;
        }

        public Criteria andIrrelevantMedicationNotIn(List<BigDecimal> values) {
            addCriterion("irrelevant_medication not in", values, "irrelevantMedication");
            return (Criteria) this;
        }

        public Criteria andIrrelevantMedicationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("irrelevant_medication between", value1, value2, "irrelevantMedication");
            return (Criteria) this;
        }

        public Criteria andIrrelevantMedicationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("irrelevant_medication not between", value1, value2, "irrelevantMedication");
            return (Criteria) this;
        }

        public Criteria andReimbursedIsNull() {
            addCriterion("reimbursed is null");
            return (Criteria) this;
        }

        public Criteria andReimbursedIsNotNull() {
            addCriterion("reimbursed is not null");
            return (Criteria) this;
        }

        public Criteria andReimbursedEqualTo(BigDecimal value) {
            addCriterion("reimbursed =", value, "reimbursed");
            return (Criteria) this;
        }

        public Criteria andReimbursedNotEqualTo(BigDecimal value) {
            addCriterion("reimbursed <>", value, "reimbursed");
            return (Criteria) this;
        }

        public Criteria andReimbursedGreaterThan(BigDecimal value) {
            addCriterion("reimbursed >", value, "reimbursed");
            return (Criteria) this;
        }

        public Criteria andReimbursedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reimbursed >=", value, "reimbursed");
            return (Criteria) this;
        }

        public Criteria andReimbursedLessThan(BigDecimal value) {
            addCriterion("reimbursed <", value, "reimbursed");
            return (Criteria) this;
        }

        public Criteria andReimbursedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reimbursed <=", value, "reimbursed");
            return (Criteria) this;
        }

        public Criteria andReimbursedIn(List<BigDecimal> values) {
            addCriterion("reimbursed in", values, "reimbursed");
            return (Criteria) this;
        }

        public Criteria andReimbursedNotIn(List<BigDecimal> values) {
            addCriterion("reimbursed not in", values, "reimbursed");
            return (Criteria) this;
        }

        public Criteria andReimbursedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reimbursed between", value1, value2, "reimbursed");
            return (Criteria) this;
        }

        public Criteria andReimbursedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reimbursed not between", value1, value2, "reimbursed");
            return (Criteria) this;
        }

        public Criteria andContinuedMedicalFeeIsNull() {
            addCriterion("continued_medical_fee is null");
            return (Criteria) this;
        }

        public Criteria andContinuedMedicalFeeIsNotNull() {
            addCriterion("continued_medical_fee is not null");
            return (Criteria) this;
        }

        public Criteria andContinuedMedicalFeeEqualTo(BigDecimal value) {
            addCriterion("continued_medical_fee =", value, "continuedMedicalFee");
            return (Criteria) this;
        }

        public Criteria andContinuedMedicalFeeNotEqualTo(BigDecimal value) {
            addCriterion("continued_medical_fee <>", value, "continuedMedicalFee");
            return (Criteria) this;
        }

        public Criteria andContinuedMedicalFeeGreaterThan(BigDecimal value) {
            addCriterion("continued_medical_fee >", value, "continuedMedicalFee");
            return (Criteria) this;
        }

        public Criteria andContinuedMedicalFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("continued_medical_fee >=", value, "continuedMedicalFee");
            return (Criteria) this;
        }

        public Criteria andContinuedMedicalFeeLessThan(BigDecimal value) {
            addCriterion("continued_medical_fee <", value, "continuedMedicalFee");
            return (Criteria) this;
        }

        public Criteria andContinuedMedicalFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("continued_medical_fee <=", value, "continuedMedicalFee");
            return (Criteria) this;
        }

        public Criteria andContinuedMedicalFeeIn(List<BigDecimal> values) {
            addCriterion("continued_medical_fee in", values, "continuedMedicalFee");
            return (Criteria) this;
        }

        public Criteria andContinuedMedicalFeeNotIn(List<BigDecimal> values) {
            addCriterion("continued_medical_fee not in", values, "continuedMedicalFee");
            return (Criteria) this;
        }

        public Criteria andContinuedMedicalFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("continued_medical_fee between", value1, value2, "continuedMedicalFee");
            return (Criteria) this;
        }

        public Criteria andContinuedMedicalFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("continued_medical_fee not between", value1, value2, "continuedMedicalFee");
            return (Criteria) this;
        }

        public Criteria andInjuTreatmentRemarkIsNull() {
            addCriterion("inju_treatment_remark is null");
            return (Criteria) this;
        }

        public Criteria andInjuTreatmentRemarkIsNotNull() {
            addCriterion("inju_treatment_remark is not null");
            return (Criteria) this;
        }

        public Criteria andInjuTreatmentRemarkEqualTo(String value) {
            addCriterion("inju_treatment_remark =", value, "injuTreatmentRemark");
            return (Criteria) this;
        }

        public Criteria andInjuTreatmentRemarkNotEqualTo(String value) {
            addCriterion("inju_treatment_remark <>", value, "injuTreatmentRemark");
            return (Criteria) this;
        }

        public Criteria andInjuTreatmentRemarkGreaterThan(String value) {
            addCriterion("inju_treatment_remark >", value, "injuTreatmentRemark");
            return (Criteria) this;
        }

        public Criteria andInjuTreatmentRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("inju_treatment_remark >=", value, "injuTreatmentRemark");
            return (Criteria) this;
        }

        public Criteria andInjuTreatmentRemarkLessThan(String value) {
            addCriterion("inju_treatment_remark <", value, "injuTreatmentRemark");
            return (Criteria) this;
        }

        public Criteria andInjuTreatmentRemarkLessThanOrEqualTo(String value) {
            addCriterion("inju_treatment_remark <=", value, "injuTreatmentRemark");
            return (Criteria) this;
        }

        public Criteria andInjuTreatmentRemarkLike(String value) {
            addCriterion("inju_treatment_remark like", value, "injuTreatmentRemark");
            return (Criteria) this;
        }

        public Criteria andInjuTreatmentRemarkNotLike(String value) {
            addCriterion("inju_treatment_remark not like", value, "injuTreatmentRemark");
            return (Criteria) this;
        }

        public Criteria andInjuTreatmentRemarkIn(List<String> values) {
            addCriterion("inju_treatment_remark in", values, "injuTreatmentRemark");
            return (Criteria) this;
        }

        public Criteria andInjuTreatmentRemarkNotIn(List<String> values) {
            addCriterion("inju_treatment_remark not in", values, "injuTreatmentRemark");
            return (Criteria) this;
        }

        public Criteria andInjuTreatmentRemarkBetween(String value1, String value2) {
            addCriterion("inju_treatment_remark between", value1, value2, "injuTreatmentRemark");
            return (Criteria) this;
        }

        public Criteria andInjuTreatmentRemarkNotBetween(String value1, String value2) {
            addCriterion("inju_treatment_remark not between", value1, value2, "injuTreatmentRemark");
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