package com.injured.server.api.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InjuredFixedDamageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InjuredFixedDamageExample() {
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

        public Criteria andWouNameIsNull() {
            addCriterion("wou_name is null");
            return (Criteria) this;
        }

        public Criteria andWouNameIsNotNull() {
            addCriterion("wou_name is not null");
            return (Criteria) this;
        }

        public Criteria andWouNameEqualTo(String value) {
            addCriterion("wou_name =", value, "wouName");
            return (Criteria) this;
        }

        public Criteria andWouNameNotEqualTo(String value) {
            addCriterion("wou_name <>", value, "wouName");
            return (Criteria) this;
        }

        public Criteria andWouNameGreaterThan(String value) {
            addCriterion("wou_name >", value, "wouName");
            return (Criteria) this;
        }

        public Criteria andWouNameGreaterThanOrEqualTo(String value) {
            addCriterion("wou_name >=", value, "wouName");
            return (Criteria) this;
        }

        public Criteria andWouNameLessThan(String value) {
            addCriterion("wou_name <", value, "wouName");
            return (Criteria) this;
        }

        public Criteria andWouNameLessThanOrEqualTo(String value) {
            addCriterion("wou_name <=", value, "wouName");
            return (Criteria) this;
        }

        public Criteria andWouNameLike(String value) {
            addCriterion("wou_name like", value, "wouName");
            return (Criteria) this;
        }

        public Criteria andWouNameNotLike(String value) {
            addCriterion("wou_name not like", value, "wouName");
            return (Criteria) this;
        }

        public Criteria andWouNameIn(List<String> values) {
            addCriterion("wou_name in", values, "wouName");
            return (Criteria) this;
        }

        public Criteria andWouNameNotIn(List<String> values) {
            addCriterion("wou_name not in", values, "wouName");
            return (Criteria) this;
        }

        public Criteria andWouNameBetween(String value1, String value2) {
            addCriterion("wou_name between", value1, value2, "wouName");
            return (Criteria) this;
        }

        public Criteria andWouNameNotBetween(String value1, String value2) {
            addCriterion("wou_name not between", value1, value2, "wouName");
            return (Criteria) this;
        }

        public Criteria andWouSexIsNull() {
            addCriterion("wou_sex is null");
            return (Criteria) this;
        }

        public Criteria andWouSexIsNotNull() {
            addCriterion("wou_sex is not null");
            return (Criteria) this;
        }

        public Criteria andWouSexEqualTo(Byte value) {
            addCriterion("wou_sex =", value, "wouSex");
            return (Criteria) this;
        }

        public Criteria andWouSexNotEqualTo(Byte value) {
            addCriterion("wou_sex <>", value, "wouSex");
            return (Criteria) this;
        }

        public Criteria andWouSexGreaterThan(Byte value) {
            addCriterion("wou_sex >", value, "wouSex");
            return (Criteria) this;
        }

        public Criteria andWouSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("wou_sex >=", value, "wouSex");
            return (Criteria) this;
        }

        public Criteria andWouSexLessThan(Byte value) {
            addCriterion("wou_sex <", value, "wouSex");
            return (Criteria) this;
        }

        public Criteria andWouSexLessThanOrEqualTo(Byte value) {
            addCriterion("wou_sex <=", value, "wouSex");
            return (Criteria) this;
        }

        public Criteria andWouSexIn(List<Byte> values) {
            addCriterion("wou_sex in", values, "wouSex");
            return (Criteria) this;
        }

        public Criteria andWouSexNotIn(List<Byte> values) {
            addCriterion("wou_sex not in", values, "wouSex");
            return (Criteria) this;
        }

        public Criteria andWouSexBetween(Byte value1, Byte value2) {
            addCriterion("wou_sex between", value1, value2, "wouSex");
            return (Criteria) this;
        }

        public Criteria andWouSexNotBetween(Byte value1, Byte value2) {
            addCriterion("wou_sex not between", value1, value2, "wouSex");
            return (Criteria) this;
        }

        public Criteria andWouAgeIsNull() {
            addCriterion("wou_age is null");
            return (Criteria) this;
        }

        public Criteria andWouAgeIsNotNull() {
            addCriterion("wou_age is not null");
            return (Criteria) this;
        }

        public Criteria andWouAgeEqualTo(Long value) {
            addCriterion("wou_age =", value, "wouAge");
            return (Criteria) this;
        }

        public Criteria andWouAgeNotEqualTo(Long value) {
            addCriterion("wou_age <>", value, "wouAge");
            return (Criteria) this;
        }

        public Criteria andWouAgeGreaterThan(Long value) {
            addCriterion("wou_age >", value, "wouAge");
            return (Criteria) this;
        }

        public Criteria andWouAgeGreaterThanOrEqualTo(Long value) {
            addCriterion("wou_age >=", value, "wouAge");
            return (Criteria) this;
        }

        public Criteria andWouAgeLessThan(Long value) {
            addCriterion("wou_age <", value, "wouAge");
            return (Criteria) this;
        }

        public Criteria andWouAgeLessThanOrEqualTo(Long value) {
            addCriterion("wou_age <=", value, "wouAge");
            return (Criteria) this;
        }

        public Criteria andWouAgeIn(List<Long> values) {
            addCriterion("wou_age in", values, "wouAge");
            return (Criteria) this;
        }

        public Criteria andWouAgeNotIn(List<Long> values) {
            addCriterion("wou_age not in", values, "wouAge");
            return (Criteria) this;
        }

        public Criteria andWouAgeBetween(Long value1, Long value2) {
            addCriterion("wou_age between", value1, value2, "wouAge");
            return (Criteria) this;
        }

        public Criteria andWouAgeNotBetween(Long value1, Long value2) {
            addCriterion("wou_age not between", value1, value2, "wouAge");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeIsNull() {
            addCriterion("id_card_type is null");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeIsNotNull() {
            addCriterion("id_card_type is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeEqualTo(Byte value) {
            addCriterion("id_card_type =", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeNotEqualTo(Byte value) {
            addCriterion("id_card_type <>", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeGreaterThan(Byte value) {
            addCriterion("id_card_type >", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("id_card_type >=", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeLessThan(Byte value) {
            addCriterion("id_card_type <", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeLessThanOrEqualTo(Byte value) {
            addCriterion("id_card_type <=", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeIn(List<Byte> values) {
            addCriterion("id_card_type in", values, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeNotIn(List<Byte> values) {
            addCriterion("id_card_type not in", values, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeBetween(Byte value1, Byte value2) {
            addCriterion("id_card_type between", value1, value2, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("id_card_type not between", value1, value2, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIsNull() {
            addCriterion("id_card_no is null");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIsNotNull() {
            addCriterion("id_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardNoEqualTo(String value) {
            addCriterion("id_card_no =", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotEqualTo(String value) {
            addCriterion("id_card_no <>", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoGreaterThan(String value) {
            addCriterion("id_card_no >", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_no >=", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLessThan(String value) {
            addCriterion("id_card_no <", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLessThanOrEqualTo(String value) {
            addCriterion("id_card_no <=", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLike(String value) {
            addCriterion("id_card_no like", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotLike(String value) {
            addCriterion("id_card_no not like", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIn(List<String> values) {
            addCriterion("id_card_no in", values, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotIn(List<String> values) {
            addCriterion("id_card_no not in", values, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoBetween(String value1, String value2) {
            addCriterion("id_card_no between", value1, value2, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotBetween(String value1, String value2) {
            addCriterion("id_card_no not between", value1, value2, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberIsNull() {
            addCriterion("bank_card_number is null");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberIsNotNull() {
            addCriterion("bank_card_number is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberEqualTo(String value) {
            addCriterion("bank_card_number =", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberNotEqualTo(String value) {
            addCriterion("bank_card_number <>", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberGreaterThan(String value) {
            addCriterion("bank_card_number >", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_number >=", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberLessThan(String value) {
            addCriterion("bank_card_number <", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberLessThanOrEqualTo(String value) {
            addCriterion("bank_card_number <=", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberLike(String value) {
            addCriterion("bank_card_number like", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberNotLike(String value) {
            addCriterion("bank_card_number not like", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberIn(List<String> values) {
            addCriterion("bank_card_number in", values, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberNotIn(List<String> values) {
            addCriterion("bank_card_number not in", values, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberBetween(String value1, String value2) {
            addCriterion("bank_card_number between", value1, value2, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberNotBetween(String value1, String value2) {
            addCriterion("bank_card_number not between", value1, value2, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andContacNumberIsNull() {
            addCriterion("contac_number is null");
            return (Criteria) this;
        }

        public Criteria andContacNumberIsNotNull() {
            addCriterion("contac_number is not null");
            return (Criteria) this;
        }

        public Criteria andContacNumberEqualTo(String value) {
            addCriterion("contac_number =", value, "contacNumber");
            return (Criteria) this;
        }

        public Criteria andContacNumberNotEqualTo(String value) {
            addCriterion("contac_number <>", value, "contacNumber");
            return (Criteria) this;
        }

        public Criteria andContacNumberGreaterThan(String value) {
            addCriterion("contac_number >", value, "contacNumber");
            return (Criteria) this;
        }

        public Criteria andContacNumberGreaterThanOrEqualTo(String value) {
            addCriterion("contac_number >=", value, "contacNumber");
            return (Criteria) this;
        }

        public Criteria andContacNumberLessThan(String value) {
            addCriterion("contac_number <", value, "contacNumber");
            return (Criteria) this;
        }

        public Criteria andContacNumberLessThanOrEqualTo(String value) {
            addCriterion("contac_number <=", value, "contacNumber");
            return (Criteria) this;
        }

        public Criteria andContacNumberLike(String value) {
            addCriterion("contac_number like", value, "contacNumber");
            return (Criteria) this;
        }

        public Criteria andContacNumberNotLike(String value) {
            addCriterion("contac_number not like", value, "contacNumber");
            return (Criteria) this;
        }

        public Criteria andContacNumberIn(List<String> values) {
            addCriterion("contac_number in", values, "contacNumber");
            return (Criteria) this;
        }

        public Criteria andContacNumberNotIn(List<String> values) {
            addCriterion("contac_number not in", values, "contacNumber");
            return (Criteria) this;
        }

        public Criteria andContacNumberBetween(String value1, String value2) {
            addCriterion("contac_number between", value1, value2, "contacNumber");
            return (Criteria) this;
        }

        public Criteria andContacNumberNotBetween(String value1, String value2) {
            addCriterion("contac_number not between", value1, value2, "contacNumber");
            return (Criteria) this;
        }

        public Criteria andHumanTypeIsNull() {
            addCriterion("human_type is null");
            return (Criteria) this;
        }

        public Criteria andHumanTypeIsNotNull() {
            addCriterion("human_type is not null");
            return (Criteria) this;
        }

        public Criteria andHumanTypeEqualTo(Byte value) {
            addCriterion("human_type =", value, "humanType");
            return (Criteria) this;
        }

        public Criteria andHumanTypeNotEqualTo(Byte value) {
            addCriterion("human_type <>", value, "humanType");
            return (Criteria) this;
        }

        public Criteria andHumanTypeGreaterThan(Byte value) {
            addCriterion("human_type >", value, "humanType");
            return (Criteria) this;
        }

        public Criteria andHumanTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("human_type >=", value, "humanType");
            return (Criteria) this;
        }

        public Criteria andHumanTypeLessThan(Byte value) {
            addCriterion("human_type <", value, "humanType");
            return (Criteria) this;
        }

        public Criteria andHumanTypeLessThanOrEqualTo(Byte value) {
            addCriterion("human_type <=", value, "humanType");
            return (Criteria) this;
        }

        public Criteria andHumanTypeIn(List<Byte> values) {
            addCriterion("human_type in", values, "humanType");
            return (Criteria) this;
        }

        public Criteria andHumanTypeNotIn(List<Byte> values) {
            addCriterion("human_type not in", values, "humanType");
            return (Criteria) this;
        }

        public Criteria andHumanTypeBetween(Byte value1, Byte value2) {
            addCriterion("human_type between", value1, value2, "humanType");
            return (Criteria) this;
        }

        public Criteria andHumanTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("human_type not between", value1, value2, "humanType");
            return (Criteria) this;
        }

        public Criteria andHumanInjuryIsNull() {
            addCriterion("human_injury is null");
            return (Criteria) this;
        }

        public Criteria andHumanInjuryIsNotNull() {
            addCriterion("human_injury is not null");
            return (Criteria) this;
        }

        public Criteria andHumanInjuryEqualTo(Byte value) {
            addCriterion("human_injury =", value, "humanInjury");
            return (Criteria) this;
        }

        public Criteria andHumanInjuryNotEqualTo(Byte value) {
            addCriterion("human_injury <>", value, "humanInjury");
            return (Criteria) this;
        }

        public Criteria andHumanInjuryGreaterThan(Byte value) {
            addCriterion("human_injury >", value, "humanInjury");
            return (Criteria) this;
        }

        public Criteria andHumanInjuryGreaterThanOrEqualTo(Byte value) {
            addCriterion("human_injury >=", value, "humanInjury");
            return (Criteria) this;
        }

        public Criteria andHumanInjuryLessThan(Byte value) {
            addCriterion("human_injury <", value, "humanInjury");
            return (Criteria) this;
        }

        public Criteria andHumanInjuryLessThanOrEqualTo(Byte value) {
            addCriterion("human_injury <=", value, "humanInjury");
            return (Criteria) this;
        }

        public Criteria andHumanInjuryIn(List<Byte> values) {
            addCriterion("human_injury in", values, "humanInjury");
            return (Criteria) this;
        }

        public Criteria andHumanInjuryNotIn(List<Byte> values) {
            addCriterion("human_injury not in", values, "humanInjury");
            return (Criteria) this;
        }

        public Criteria andHumanInjuryBetween(Byte value1, Byte value2) {
            addCriterion("human_injury between", value1, value2, "humanInjury");
            return (Criteria) this;
        }

        public Criteria andHumanInjuryNotBetween(Byte value1, Byte value2) {
            addCriterion("human_injury not between", value1, value2, "humanInjury");
            return (Criteria) this;
        }

        public Criteria andClaimYearIsNull() {
            addCriterion("claim_year is null");
            return (Criteria) this;
        }

        public Criteria andClaimYearIsNotNull() {
            addCriterion("claim_year is not null");
            return (Criteria) this;
        }

        public Criteria andClaimYearEqualTo(String value) {
            addCriterion("claim_year =", value, "claimYear");
            return (Criteria) this;
        }

        public Criteria andClaimYearNotEqualTo(String value) {
            addCriterion("claim_year <>", value, "claimYear");
            return (Criteria) this;
        }

        public Criteria andClaimYearGreaterThan(String value) {
            addCriterion("claim_year >", value, "claimYear");
            return (Criteria) this;
        }

        public Criteria andClaimYearGreaterThanOrEqualTo(String value) {
            addCriterion("claim_year >=", value, "claimYear");
            return (Criteria) this;
        }

        public Criteria andClaimYearLessThan(String value) {
            addCriterion("claim_year <", value, "claimYear");
            return (Criteria) this;
        }

        public Criteria andClaimYearLessThanOrEqualTo(String value) {
            addCriterion("claim_year <=", value, "claimYear");
            return (Criteria) this;
        }

        public Criteria andClaimYearLike(String value) {
            addCriterion("claim_year like", value, "claimYear");
            return (Criteria) this;
        }

        public Criteria andClaimYearNotLike(String value) {
            addCriterion("claim_year not like", value, "claimYear");
            return (Criteria) this;
        }

        public Criteria andClaimYearIn(List<String> values) {
            addCriterion("claim_year in", values, "claimYear");
            return (Criteria) this;
        }

        public Criteria andClaimYearNotIn(List<String> values) {
            addCriterion("claim_year not in", values, "claimYear");
            return (Criteria) this;
        }

        public Criteria andClaimYearBetween(String value1, String value2) {
            addCriterion("claim_year between", value1, value2, "claimYear");
            return (Criteria) this;
        }

        public Criteria andClaimYearNotBetween(String value1, String value2) {
            addCriterion("claim_year not between", value1, value2, "claimYear");
            return (Criteria) this;
        }

        public Criteria andClaimProvinceIsNull() {
            addCriterion("claim_province is null");
            return (Criteria) this;
        }

        public Criteria andClaimProvinceIsNotNull() {
            addCriterion("claim_province is not null");
            return (Criteria) this;
        }

        public Criteria andClaimProvinceEqualTo(String value) {
            addCriterion("claim_province =", value, "claimProvince");
            return (Criteria) this;
        }

        public Criteria andClaimProvinceNotEqualTo(String value) {
            addCriterion("claim_province <>", value, "claimProvince");
            return (Criteria) this;
        }

        public Criteria andClaimProvinceGreaterThan(String value) {
            addCriterion("claim_province >", value, "claimProvince");
            return (Criteria) this;
        }

        public Criteria andClaimProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("claim_province >=", value, "claimProvince");
            return (Criteria) this;
        }

        public Criteria andClaimProvinceLessThan(String value) {
            addCriterion("claim_province <", value, "claimProvince");
            return (Criteria) this;
        }

        public Criteria andClaimProvinceLessThanOrEqualTo(String value) {
            addCriterion("claim_province <=", value, "claimProvince");
            return (Criteria) this;
        }

        public Criteria andClaimProvinceLike(String value) {
            addCriterion("claim_province like", value, "claimProvince");
            return (Criteria) this;
        }

        public Criteria andClaimProvinceNotLike(String value) {
            addCriterion("claim_province not like", value, "claimProvince");
            return (Criteria) this;
        }

        public Criteria andClaimProvinceIn(List<String> values) {
            addCriterion("claim_province in", values, "claimProvince");
            return (Criteria) this;
        }

        public Criteria andClaimProvinceNotIn(List<String> values) {
            addCriterion("claim_province not in", values, "claimProvince");
            return (Criteria) this;
        }

        public Criteria andClaimProvinceBetween(String value1, String value2) {
            addCriterion("claim_province between", value1, value2, "claimProvince");
            return (Criteria) this;
        }

        public Criteria andClaimProvinceNotBetween(String value1, String value2) {
            addCriterion("claim_province not between", value1, value2, "claimProvince");
            return (Criteria) this;
        }

        public Criteria andClaimCityIsNull() {
            addCriterion("claim_city is null");
            return (Criteria) this;
        }

        public Criteria andClaimCityIsNotNull() {
            addCriterion("claim_city is not null");
            return (Criteria) this;
        }

        public Criteria andClaimCityEqualTo(String value) {
            addCriterion("claim_city =", value, "claimCity");
            return (Criteria) this;
        }

        public Criteria andClaimCityNotEqualTo(String value) {
            addCriterion("claim_city <>", value, "claimCity");
            return (Criteria) this;
        }

        public Criteria andClaimCityGreaterThan(String value) {
            addCriterion("claim_city >", value, "claimCity");
            return (Criteria) this;
        }

        public Criteria andClaimCityGreaterThanOrEqualTo(String value) {
            addCriterion("claim_city >=", value, "claimCity");
            return (Criteria) this;
        }

        public Criteria andClaimCityLessThan(String value) {
            addCriterion("claim_city <", value, "claimCity");
            return (Criteria) this;
        }

        public Criteria andClaimCityLessThanOrEqualTo(String value) {
            addCriterion("claim_city <=", value, "claimCity");
            return (Criteria) this;
        }

        public Criteria andClaimCityLike(String value) {
            addCriterion("claim_city like", value, "claimCity");
            return (Criteria) this;
        }

        public Criteria andClaimCityNotLike(String value) {
            addCriterion("claim_city not like", value, "claimCity");
            return (Criteria) this;
        }

        public Criteria andClaimCityIn(List<String> values) {
            addCriterion("claim_city in", values, "claimCity");
            return (Criteria) this;
        }

        public Criteria andClaimCityNotIn(List<String> values) {
            addCriterion("claim_city not in", values, "claimCity");
            return (Criteria) this;
        }

        public Criteria andClaimCityBetween(String value1, String value2) {
            addCriterion("claim_city between", value1, value2, "claimCity");
            return (Criteria) this;
        }

        public Criteria andClaimCityNotBetween(String value1, String value2) {
            addCriterion("claim_city not between", value1, value2, "claimCity");
            return (Criteria) this;
        }

        public Criteria andIsPublicProsecutionIsNull() {
            addCriterion("is_public_prosecution is null");
            return (Criteria) this;
        }

        public Criteria andIsPublicProsecutionIsNotNull() {
            addCriterion("is_public_prosecution is not null");
            return (Criteria) this;
        }

        public Criteria andIsPublicProsecutionEqualTo(Byte value) {
            addCriterion("is_public_prosecution =", value, "isPublicProsecution");
            return (Criteria) this;
        }

        public Criteria andIsPublicProsecutionNotEqualTo(Byte value) {
            addCriterion("is_public_prosecution <>", value, "isPublicProsecution");
            return (Criteria) this;
        }

        public Criteria andIsPublicProsecutionGreaterThan(Byte value) {
            addCriterion("is_public_prosecution >", value, "isPublicProsecution");
            return (Criteria) this;
        }

        public Criteria andIsPublicProsecutionGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_public_prosecution >=", value, "isPublicProsecution");
            return (Criteria) this;
        }

        public Criteria andIsPublicProsecutionLessThan(Byte value) {
            addCriterion("is_public_prosecution <", value, "isPublicProsecution");
            return (Criteria) this;
        }

        public Criteria andIsPublicProsecutionLessThanOrEqualTo(Byte value) {
            addCriterion("is_public_prosecution <=", value, "isPublicProsecution");
            return (Criteria) this;
        }

        public Criteria andIsPublicProsecutionIn(List<Byte> values) {
            addCriterion("is_public_prosecution in", values, "isPublicProsecution");
            return (Criteria) this;
        }

        public Criteria andIsPublicProsecutionNotIn(List<Byte> values) {
            addCriterion("is_public_prosecution not in", values, "isPublicProsecution");
            return (Criteria) this;
        }

        public Criteria andIsPublicProsecutionBetween(Byte value1, Byte value2) {
            addCriterion("is_public_prosecution between", value1, value2, "isPublicProsecution");
            return (Criteria) this;
        }

        public Criteria andIsPublicProsecutionNotBetween(Byte value1, Byte value2) {
            addCriterion("is_public_prosecution not between", value1, value2, "isPublicProsecution");
            return (Criteria) this;
        }

        public Criteria andAgentNameIsNull() {
            addCriterion("agent_name is null");
            return (Criteria) this;
        }

        public Criteria andAgentNameIsNotNull() {
            addCriterion("agent_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgentNameEqualTo(String value) {
            addCriterion("agent_name =", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotEqualTo(String value) {
            addCriterion("agent_name <>", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThan(String value) {
            addCriterion("agent_name >", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThanOrEqualTo(String value) {
            addCriterion("agent_name >=", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThan(String value) {
            addCriterion("agent_name <", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThanOrEqualTo(String value) {
            addCriterion("agent_name <=", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLike(String value) {
            addCriterion("agent_name like", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotLike(String value) {
            addCriterion("agent_name not like", value, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameIn(List<String> values) {
            addCriterion("agent_name in", values, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotIn(List<String> values) {
            addCriterion("agent_name not in", values, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameBetween(String value1, String value2) {
            addCriterion("agent_name between", value1, value2, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotBetween(String value1, String value2) {
            addCriterion("agent_name not between", value1, value2, "agentName");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneIsNull() {
            addCriterion("agent_phone is null");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneIsNotNull() {
            addCriterion("agent_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneEqualTo(String value) {
            addCriterion("agent_phone =", value, "agentPhone");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneNotEqualTo(String value) {
            addCriterion("agent_phone <>", value, "agentPhone");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneGreaterThan(String value) {
            addCriterion("agent_phone >", value, "agentPhone");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("agent_phone >=", value, "agentPhone");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneLessThan(String value) {
            addCriterion("agent_phone <", value, "agentPhone");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneLessThanOrEqualTo(String value) {
            addCriterion("agent_phone <=", value, "agentPhone");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneLike(String value) {
            addCriterion("agent_phone like", value, "agentPhone");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneNotLike(String value) {
            addCriterion("agent_phone not like", value, "agentPhone");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneIn(List<String> values) {
            addCriterion("agent_phone in", values, "agentPhone");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneNotIn(List<String> values) {
            addCriterion("agent_phone not in", values, "agentPhone");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneBetween(String value1, String value2) {
            addCriterion("agent_phone between", value1, value2, "agentPhone");
            return (Criteria) this;
        }

        public Criteria andAgentPhoneNotBetween(String value1, String value2) {
            addCriterion("agent_phone not between", value1, value2, "agentPhone");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeIsNull() {
            addCriterion("accident_type is null");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeIsNotNull() {
            addCriterion("accident_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeEqualTo(Byte value) {
            addCriterion("accident_type =", value, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeNotEqualTo(Byte value) {
            addCriterion("accident_type <>", value, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeGreaterThan(Byte value) {
            addCriterion("accident_type >", value, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("accident_type >=", value, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeLessThan(Byte value) {
            addCriterion("accident_type <", value, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeLessThanOrEqualTo(Byte value) {
            addCriterion("accident_type <=", value, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeIn(List<Byte> values) {
            addCriterion("accident_type in", values, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeNotIn(List<Byte> values) {
            addCriterion("accident_type not in", values, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeBetween(Byte value1, Byte value2) {
            addCriterion("accident_type between", value1, value2, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("accident_type not between", value1, value2, "accidentType");
            return (Criteria) this;
        }

        public Criteria andAccidentLiabilityIsNull() {
            addCriterion("accident_liability is null");
            return (Criteria) this;
        }

        public Criteria andAccidentLiabilityIsNotNull() {
            addCriterion("accident_liability is not null");
            return (Criteria) this;
        }

        public Criteria andAccidentLiabilityEqualTo(String value) {
            addCriterion("accident_liability =", value, "accidentLiability");
            return (Criteria) this;
        }

        public Criteria andAccidentLiabilityNotEqualTo(String value) {
            addCriterion("accident_liability <>", value, "accidentLiability");
            return (Criteria) this;
        }

        public Criteria andAccidentLiabilityGreaterThan(String value) {
            addCriterion("accident_liability >", value, "accidentLiability");
            return (Criteria) this;
        }

        public Criteria andAccidentLiabilityGreaterThanOrEqualTo(String value) {
            addCriterion("accident_liability >=", value, "accidentLiability");
            return (Criteria) this;
        }

        public Criteria andAccidentLiabilityLessThan(String value) {
            addCriterion("accident_liability <", value, "accidentLiability");
            return (Criteria) this;
        }

        public Criteria andAccidentLiabilityLessThanOrEqualTo(String value) {
            addCriterion("accident_liability <=", value, "accidentLiability");
            return (Criteria) this;
        }

        public Criteria andAccidentLiabilityLike(String value) {
            addCriterion("accident_liability like", value, "accidentLiability");
            return (Criteria) this;
        }

        public Criteria andAccidentLiabilityNotLike(String value) {
            addCriterion("accident_liability not like", value, "accidentLiability");
            return (Criteria) this;
        }

        public Criteria andAccidentLiabilityIn(List<String> values) {
            addCriterion("accident_liability in", values, "accidentLiability");
            return (Criteria) this;
        }

        public Criteria andAccidentLiabilityNotIn(List<String> values) {
            addCriterion("accident_liability not in", values, "accidentLiability");
            return (Criteria) this;
        }

        public Criteria andAccidentLiabilityBetween(String value1, String value2) {
            addCriterion("accident_liability between", value1, value2, "accidentLiability");
            return (Criteria) this;
        }

        public Criteria andAccidentLiabilityNotBetween(String value1, String value2) {
            addCriterion("accident_liability not between", value1, value2, "accidentLiability");
            return (Criteria) this;
        }

        public Criteria andLiabilityRatioIsNull() {
            addCriterion("liability_ratio is null");
            return (Criteria) this;
        }

        public Criteria andLiabilityRatioIsNotNull() {
            addCriterion("liability_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andLiabilityRatioEqualTo(String value) {
            addCriterion("liability_ratio =", value, "liabilityRatio");
            return (Criteria) this;
        }

        public Criteria andLiabilityRatioNotEqualTo(String value) {
            addCriterion("liability_ratio <>", value, "liabilityRatio");
            return (Criteria) this;
        }

        public Criteria andLiabilityRatioGreaterThan(String value) {
            addCriterion("liability_ratio >", value, "liabilityRatio");
            return (Criteria) this;
        }

        public Criteria andLiabilityRatioGreaterThanOrEqualTo(String value) {
            addCriterion("liability_ratio >=", value, "liabilityRatio");
            return (Criteria) this;
        }

        public Criteria andLiabilityRatioLessThan(String value) {
            addCriterion("liability_ratio <", value, "liabilityRatio");
            return (Criteria) this;
        }

        public Criteria andLiabilityRatioLessThanOrEqualTo(String value) {
            addCriterion("liability_ratio <=", value, "liabilityRatio");
            return (Criteria) this;
        }

        public Criteria andLiabilityRatioLike(String value) {
            addCriterion("liability_ratio like", value, "liabilityRatio");
            return (Criteria) this;
        }

        public Criteria andLiabilityRatioNotLike(String value) {
            addCriterion("liability_ratio not like", value, "liabilityRatio");
            return (Criteria) this;
        }

        public Criteria andLiabilityRatioIn(List<String> values) {
            addCriterion("liability_ratio in", values, "liabilityRatio");
            return (Criteria) this;
        }

        public Criteria andLiabilityRatioNotIn(List<String> values) {
            addCriterion("liability_ratio not in", values, "liabilityRatio");
            return (Criteria) this;
        }

        public Criteria andLiabilityRatioBetween(String value1, String value2) {
            addCriterion("liability_ratio between", value1, value2, "liabilityRatio");
            return (Criteria) this;
        }

        public Criteria andLiabilityRatioNotBetween(String value1, String value2) {
            addCriterion("liability_ratio not between", value1, value2, "liabilityRatio");
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

        public Criteria andResideProvinceIsNull() {
            addCriterion("reside_province is null");
            return (Criteria) this;
        }

        public Criteria andResideProvinceIsNotNull() {
            addCriterion("reside_province is not null");
            return (Criteria) this;
        }

        public Criteria andResideProvinceEqualTo(String value) {
            addCriterion("reside_province =", value, "resideProvince");
            return (Criteria) this;
        }

        public Criteria andResideProvinceNotEqualTo(String value) {
            addCriterion("reside_province <>", value, "resideProvince");
            return (Criteria) this;
        }

        public Criteria andResideProvinceGreaterThan(String value) {
            addCriterion("reside_province >", value, "resideProvince");
            return (Criteria) this;
        }

        public Criteria andResideProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("reside_province >=", value, "resideProvince");
            return (Criteria) this;
        }

        public Criteria andResideProvinceLessThan(String value) {
            addCriterion("reside_province <", value, "resideProvince");
            return (Criteria) this;
        }

        public Criteria andResideProvinceLessThanOrEqualTo(String value) {
            addCriterion("reside_province <=", value, "resideProvince");
            return (Criteria) this;
        }

        public Criteria andResideProvinceLike(String value) {
            addCriterion("reside_province like", value, "resideProvince");
            return (Criteria) this;
        }

        public Criteria andResideProvinceNotLike(String value) {
            addCriterion("reside_province not like", value, "resideProvince");
            return (Criteria) this;
        }

        public Criteria andResideProvinceIn(List<String> values) {
            addCriterion("reside_province in", values, "resideProvince");
            return (Criteria) this;
        }

        public Criteria andResideProvinceNotIn(List<String> values) {
            addCriterion("reside_province not in", values, "resideProvince");
            return (Criteria) this;
        }

        public Criteria andResideProvinceBetween(String value1, String value2) {
            addCriterion("reside_province between", value1, value2, "resideProvince");
            return (Criteria) this;
        }

        public Criteria andResideProvinceNotBetween(String value1, String value2) {
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

        public Criteria andResideCityEqualTo(String value) {
            addCriterion("reside_city =", value, "resideCity");
            return (Criteria) this;
        }

        public Criteria andResideCityNotEqualTo(String value) {
            addCriterion("reside_city <>", value, "resideCity");
            return (Criteria) this;
        }

        public Criteria andResideCityGreaterThan(String value) {
            addCriterion("reside_city >", value, "resideCity");
            return (Criteria) this;
        }

        public Criteria andResideCityGreaterThanOrEqualTo(String value) {
            addCriterion("reside_city >=", value, "resideCity");
            return (Criteria) this;
        }

        public Criteria andResideCityLessThan(String value) {
            addCriterion("reside_city <", value, "resideCity");
            return (Criteria) this;
        }

        public Criteria andResideCityLessThanOrEqualTo(String value) {
            addCriterion("reside_city <=", value, "resideCity");
            return (Criteria) this;
        }

        public Criteria andResideCityLike(String value) {
            addCriterion("reside_city like", value, "resideCity");
            return (Criteria) this;
        }

        public Criteria andResideCityNotLike(String value) {
            addCriterion("reside_city not like", value, "resideCity");
            return (Criteria) this;
        }

        public Criteria andResideCityIn(List<String> values) {
            addCriterion("reside_city in", values, "resideCity");
            return (Criteria) this;
        }

        public Criteria andResideCityNotIn(List<String> values) {
            addCriterion("reside_city not in", values, "resideCity");
            return (Criteria) this;
        }

        public Criteria andResideCityBetween(String value1, String value2) {
            addCriterion("reside_city between", value1, value2, "resideCity");
            return (Criteria) this;
        }

        public Criteria andResideCityNotBetween(String value1, String value2) {
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

        public Criteria andResideDistrictEqualTo(String value) {
            addCriterion("reside_district =", value, "resideDistrict");
            return (Criteria) this;
        }

        public Criteria andResideDistrictNotEqualTo(String value) {
            addCriterion("reside_district <>", value, "resideDistrict");
            return (Criteria) this;
        }

        public Criteria andResideDistrictGreaterThan(String value) {
            addCriterion("reside_district >", value, "resideDistrict");
            return (Criteria) this;
        }

        public Criteria andResideDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("reside_district >=", value, "resideDistrict");
            return (Criteria) this;
        }

        public Criteria andResideDistrictLessThan(String value) {
            addCriterion("reside_district <", value, "resideDistrict");
            return (Criteria) this;
        }

        public Criteria andResideDistrictLessThanOrEqualTo(String value) {
            addCriterion("reside_district <=", value, "resideDistrict");
            return (Criteria) this;
        }

        public Criteria andResideDistrictLike(String value) {
            addCriterion("reside_district like", value, "resideDistrict");
            return (Criteria) this;
        }

        public Criteria andResideDistrictNotLike(String value) {
            addCriterion("reside_district not like", value, "resideDistrict");
            return (Criteria) this;
        }

        public Criteria andResideDistrictIn(List<String> values) {
            addCriterion("reside_district in", values, "resideDistrict");
            return (Criteria) this;
        }

        public Criteria andResideDistrictNotIn(List<String> values) {
            addCriterion("reside_district not in", values, "resideDistrict");
            return (Criteria) this;
        }

        public Criteria andResideDistrictBetween(String value1, String value2) {
            addCriterion("reside_district between", value1, value2, "resideDistrict");
            return (Criteria) this;
        }

        public Criteria andResideDistrictNotBetween(String value1, String value2) {
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

        public Criteria andResideTownEqualTo(String value) {
            addCriterion("reside_town =", value, "resideTown");
            return (Criteria) this;
        }

        public Criteria andResideTownNotEqualTo(String value) {
            addCriterion("reside_town <>", value, "resideTown");
            return (Criteria) this;
        }

        public Criteria andResideTownGreaterThan(String value) {
            addCriterion("reside_town >", value, "resideTown");
            return (Criteria) this;
        }

        public Criteria andResideTownGreaterThanOrEqualTo(String value) {
            addCriterion("reside_town >=", value, "resideTown");
            return (Criteria) this;
        }

        public Criteria andResideTownLessThan(String value) {
            addCriterion("reside_town <", value, "resideTown");
            return (Criteria) this;
        }

        public Criteria andResideTownLessThanOrEqualTo(String value) {
            addCriterion("reside_town <=", value, "resideTown");
            return (Criteria) this;
        }

        public Criteria andResideTownLike(String value) {
            addCriterion("reside_town like", value, "resideTown");
            return (Criteria) this;
        }

        public Criteria andResideTownNotLike(String value) {
            addCriterion("reside_town not like", value, "resideTown");
            return (Criteria) this;
        }

        public Criteria andResideTownIn(List<String> values) {
            addCriterion("reside_town in", values, "resideTown");
            return (Criteria) this;
        }

        public Criteria andResideTownNotIn(List<String> values) {
            addCriterion("reside_town not in", values, "resideTown");
            return (Criteria) this;
        }

        public Criteria andResideTownBetween(String value1, String value2) {
            addCriterion("reside_town between", value1, value2, "resideTown");
            return (Criteria) this;
        }

        public Criteria andResideTownNotBetween(String value1, String value2) {
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

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(Byte value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(Byte value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(Byte value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(Byte value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(Byte value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(Byte value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<Byte> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<Byte> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(Byte value1, Byte value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(Byte value1, Byte value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andLossWorkDaysIsNull() {
            addCriterion("loss_work_days is null");
            return (Criteria) this;
        }

        public Criteria andLossWorkDaysIsNotNull() {
            addCriterion("loss_work_days is not null");
            return (Criteria) this;
        }

        public Criteria andLossWorkDaysEqualTo(Integer value) {
            addCriterion("loss_work_days =", value, "lossWorkDays");
            return (Criteria) this;
        }

        public Criteria andLossWorkDaysNotEqualTo(Integer value) {
            addCriterion("loss_work_days <>", value, "lossWorkDays");
            return (Criteria) this;
        }

        public Criteria andLossWorkDaysGreaterThan(Integer value) {
            addCriterion("loss_work_days >", value, "lossWorkDays");
            return (Criteria) this;
        }

        public Criteria andLossWorkDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("loss_work_days >=", value, "lossWorkDays");
            return (Criteria) this;
        }

        public Criteria andLossWorkDaysLessThan(Integer value) {
            addCriterion("loss_work_days <", value, "lossWorkDays");
            return (Criteria) this;
        }

        public Criteria andLossWorkDaysLessThanOrEqualTo(Integer value) {
            addCriterion("loss_work_days <=", value, "lossWorkDays");
            return (Criteria) this;
        }

        public Criteria andLossWorkDaysIn(List<Integer> values) {
            addCriterion("loss_work_days in", values, "lossWorkDays");
            return (Criteria) this;
        }

        public Criteria andLossWorkDaysNotIn(List<Integer> values) {
            addCriterion("loss_work_days not in", values, "lossWorkDays");
            return (Criteria) this;
        }

        public Criteria andLossWorkDaysBetween(Integer value1, Integer value2) {
            addCriterion("loss_work_days between", value1, value2, "lossWorkDays");
            return (Criteria) this;
        }

        public Criteria andLossWorkDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("loss_work_days not between", value1, value2, "lossWorkDays");
            return (Criteria) this;
        }

        public Criteria andHospitalDaysIsNull() {
            addCriterion("hospital_days is null");
            return (Criteria) this;
        }

        public Criteria andHospitalDaysIsNotNull() {
            addCriterion("hospital_days is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalDaysEqualTo(Integer value) {
            addCriterion("hospital_days =", value, "hospitalDays");
            return (Criteria) this;
        }

        public Criteria andHospitalDaysNotEqualTo(Integer value) {
            addCriterion("hospital_days <>", value, "hospitalDays");
            return (Criteria) this;
        }

        public Criteria andHospitalDaysGreaterThan(Integer value) {
            addCriterion("hospital_days >", value, "hospitalDays");
            return (Criteria) this;
        }

        public Criteria andHospitalDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospital_days >=", value, "hospitalDays");
            return (Criteria) this;
        }

        public Criteria andHospitalDaysLessThan(Integer value) {
            addCriterion("hospital_days <", value, "hospitalDays");
            return (Criteria) this;
        }

        public Criteria andHospitalDaysLessThanOrEqualTo(Integer value) {
            addCriterion("hospital_days <=", value, "hospitalDays");
            return (Criteria) this;
        }

        public Criteria andHospitalDaysIn(List<Integer> values) {
            addCriterion("hospital_days in", values, "hospitalDays");
            return (Criteria) this;
        }

        public Criteria andHospitalDaysNotIn(List<Integer> values) {
            addCriterion("hospital_days not in", values, "hospitalDays");
            return (Criteria) this;
        }

        public Criteria andHospitalDaysBetween(Integer value1, Integer value2) {
            addCriterion("hospital_days between", value1, value2, "hospitalDays");
            return (Criteria) this;
        }

        public Criteria andHospitalDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("hospital_days not between", value1, value2, "hospitalDays");
            return (Criteria) this;
        }

        public Criteria andNurseDaysIsNull() {
            addCriterion("nurse_days is null");
            return (Criteria) this;
        }

        public Criteria andNurseDaysIsNotNull() {
            addCriterion("nurse_days is not null");
            return (Criteria) this;
        }

        public Criteria andNurseDaysEqualTo(Integer value) {
            addCriterion("nurse_days =", value, "nurseDays");
            return (Criteria) this;
        }

        public Criteria andNurseDaysNotEqualTo(Integer value) {
            addCriterion("nurse_days <>", value, "nurseDays");
            return (Criteria) this;
        }

        public Criteria andNurseDaysGreaterThan(Integer value) {
            addCriterion("nurse_days >", value, "nurseDays");
            return (Criteria) this;
        }

        public Criteria andNurseDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("nurse_days >=", value, "nurseDays");
            return (Criteria) this;
        }

        public Criteria andNurseDaysLessThan(Integer value) {
            addCriterion("nurse_days <", value, "nurseDays");
            return (Criteria) this;
        }

        public Criteria andNurseDaysLessThanOrEqualTo(Integer value) {
            addCriterion("nurse_days <=", value, "nurseDays");
            return (Criteria) this;
        }

        public Criteria andNurseDaysIn(List<Integer> values) {
            addCriterion("nurse_days in", values, "nurseDays");
            return (Criteria) this;
        }

        public Criteria andNurseDaysNotIn(List<Integer> values) {
            addCriterion("nurse_days not in", values, "nurseDays");
            return (Criteria) this;
        }

        public Criteria andNurseDaysBetween(Integer value1, Integer value2) {
            addCriterion("nurse_days between", value1, value2, "nurseDays");
            return (Criteria) this;
        }

        public Criteria andNurseDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("nurse_days not between", value1, value2, "nurseDays");
            return (Criteria) this;
        }

        public Criteria andDischargeTimeIsNull() {
            addCriterion("discharge_time is null");
            return (Criteria) this;
        }

        public Criteria andDischargeTimeIsNotNull() {
            addCriterion("discharge_time is not null");
            return (Criteria) this;
        }

        public Criteria andDischargeTimeEqualTo(Date value) {
            addCriterion("discharge_time =", value, "dischargeTime");
            return (Criteria) this;
        }

        public Criteria andDischargeTimeNotEqualTo(Date value) {
            addCriterion("discharge_time <>", value, "dischargeTime");
            return (Criteria) this;
        }

        public Criteria andDischargeTimeGreaterThan(Date value) {
            addCriterion("discharge_time >", value, "dischargeTime");
            return (Criteria) this;
        }

        public Criteria andDischargeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("discharge_time >=", value, "dischargeTime");
            return (Criteria) this;
        }

        public Criteria andDischargeTimeLessThan(Date value) {
            addCriterion("discharge_time <", value, "dischargeTime");
            return (Criteria) this;
        }

        public Criteria andDischargeTimeLessThanOrEqualTo(Date value) {
            addCriterion("discharge_time <=", value, "dischargeTime");
            return (Criteria) this;
        }

        public Criteria andDischargeTimeIn(List<Date> values) {
            addCriterion("discharge_time in", values, "dischargeTime");
            return (Criteria) this;
        }

        public Criteria andDischargeTimeNotIn(List<Date> values) {
            addCriterion("discharge_time not in", values, "dischargeTime");
            return (Criteria) this;
        }

        public Criteria andDischargeTimeBetween(Date value1, Date value2) {
            addCriterion("discharge_time between", value1, value2, "dischargeTime");
            return (Criteria) this;
        }

        public Criteria andDischargeTimeNotBetween(Date value1, Date value2) {
            addCriterion("discharge_time not between", value1, value2, "dischargeTime");
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

        public Criteria andHospitalNameIsNull() {
            addCriterion("hospital_name is null");
            return (Criteria) this;
        }

        public Criteria andHospitalNameIsNotNull() {
            addCriterion("hospital_name is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalNameEqualTo(String value) {
            addCriterion("hospital_name =", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotEqualTo(String value) {
            addCriterion("hospital_name <>", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameGreaterThan(String value) {
            addCriterion("hospital_name >", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_name >=", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameLessThan(String value) {
            addCriterion("hospital_name <", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameLessThanOrEqualTo(String value) {
            addCriterion("hospital_name <=", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameLike(String value) {
            addCriterion("hospital_name like", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotLike(String value) {
            addCriterion("hospital_name not like", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameIn(List<String> values) {
            addCriterion("hospital_name in", values, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotIn(List<String> values) {
            addCriterion("hospital_name not in", values, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameBetween(String value1, String value2) {
            addCriterion("hospital_name between", value1, value2, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotBetween(String value1, String value2) {
            addCriterion("hospital_name not between", value1, value2, "hospitalName");
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