package com.injured.server.api.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InjuredSurveyWouInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InjuredSurveyWouInfoExample() {
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

        public Criteria andHumanInjuryIsNull() {
            addCriterion("human_injury is null");
            return (Criteria) this;
        }

        public Criteria andHumanInjuryIsNotNull() {
            addCriterion("human_injury is not null");
            return (Criteria) this;
        }

        public Criteria andHumanInjuryEqualTo(Integer value) {
            addCriterion("human_injury =", value, "humanInjury");
            return (Criteria) this;
        }

        public Criteria andHumanInjuryNotEqualTo(Integer value) {
            addCriterion("human_injury <>", value, "humanInjury");
            return (Criteria) this;
        }

        public Criteria andHumanInjuryGreaterThan(Integer value) {
            addCriterion("human_injury >", value, "humanInjury");
            return (Criteria) this;
        }

        public Criteria andHumanInjuryGreaterThanOrEqualTo(Integer value) {
            addCriterion("human_injury >=", value, "humanInjury");
            return (Criteria) this;
        }

        public Criteria andHumanInjuryLessThan(Integer value) {
            addCriterion("human_injury <", value, "humanInjury");
            return (Criteria) this;
        }

        public Criteria andHumanInjuryLessThanOrEqualTo(Integer value) {
            addCriterion("human_injury <=", value, "humanInjury");
            return (Criteria) this;
        }

        public Criteria andHumanInjuryIn(List<Integer> values) {
            addCriterion("human_injury in", values, "humanInjury");
            return (Criteria) this;
        }

        public Criteria andHumanInjuryNotIn(List<Integer> values) {
            addCriterion("human_injury not in", values, "humanInjury");
            return (Criteria) this;
        }

        public Criteria andHumanInjuryBetween(Integer value1, Integer value2) {
            addCriterion("human_injury between", value1, value2, "humanInjury");
            return (Criteria) this;
        }

        public Criteria andHumanInjuryNotBetween(Integer value1, Integer value2) {
            addCriterion("human_injury not between", value1, value2, "humanInjury");
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

        public Criteria andHumanTypeEqualTo(Integer value) {
            addCriterion("human_type =", value, "humanType");
            return (Criteria) this;
        }

        public Criteria andHumanTypeNotEqualTo(Integer value) {
            addCriterion("human_type <>", value, "humanType");
            return (Criteria) this;
        }

        public Criteria andHumanTypeGreaterThan(Integer value) {
            addCriterion("human_type >", value, "humanType");
            return (Criteria) this;
        }

        public Criteria andHumanTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("human_type >=", value, "humanType");
            return (Criteria) this;
        }

        public Criteria andHumanTypeLessThan(Integer value) {
            addCriterion("human_type <", value, "humanType");
            return (Criteria) this;
        }

        public Criteria andHumanTypeLessThanOrEqualTo(Integer value) {
            addCriterion("human_type <=", value, "humanType");
            return (Criteria) this;
        }

        public Criteria andHumanTypeIn(List<Integer> values) {
            addCriterion("human_type in", values, "humanType");
            return (Criteria) this;
        }

        public Criteria andHumanTypeNotIn(List<Integer> values) {
            addCriterion("human_type not in", values, "humanType");
            return (Criteria) this;
        }

        public Criteria andHumanTypeBetween(Integer value1, Integer value2) {
            addCriterion("human_type between", value1, value2, "humanType");
            return (Criteria) this;
        }

        public Criteria andHumanTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("human_type not between", value1, value2, "humanType");
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

        public Criteria andIdCardTypeIsNull() {
            addCriterion("id_card_type is null");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeIsNotNull() {
            addCriterion("id_card_type is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeEqualTo(Integer value) {
            addCriterion("id_card_type =", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeNotEqualTo(Integer value) {
            addCriterion("id_card_type <>", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeGreaterThan(Integer value) {
            addCriterion("id_card_type >", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_card_type >=", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeLessThan(Integer value) {
            addCriterion("id_card_type <", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeLessThanOrEqualTo(Integer value) {
            addCriterion("id_card_type <=", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeIn(List<Integer> values) {
            addCriterion("id_card_type in", values, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeNotIn(List<Integer> values) {
            addCriterion("id_card_type not in", values, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeBetween(Integer value1, Integer value2) {
            addCriterion("id_card_type between", value1, value2, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeNotBetween(Integer value1, Integer value2) {
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

        public Criteria andWouSexIsNull() {
            addCriterion("wou_sex is null");
            return (Criteria) this;
        }

        public Criteria andWouSexIsNotNull() {
            addCriterion("wou_sex is not null");
            return (Criteria) this;
        }

        public Criteria andWouSexEqualTo(Integer value) {
            addCriterion("wou_sex =", value, "wouSex");
            return (Criteria) this;
        }

        public Criteria andWouSexNotEqualTo(Integer value) {
            addCriterion("wou_sex <>", value, "wouSex");
            return (Criteria) this;
        }

        public Criteria andWouSexGreaterThan(Integer value) {
            addCriterion("wou_sex >", value, "wouSex");
            return (Criteria) this;
        }

        public Criteria andWouSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("wou_sex >=", value, "wouSex");
            return (Criteria) this;
        }

        public Criteria andWouSexLessThan(Integer value) {
            addCriterion("wou_sex <", value, "wouSex");
            return (Criteria) this;
        }

        public Criteria andWouSexLessThanOrEqualTo(Integer value) {
            addCriterion("wou_sex <=", value, "wouSex");
            return (Criteria) this;
        }

        public Criteria andWouSexIn(List<Integer> values) {
            addCriterion("wou_sex in", values, "wouSex");
            return (Criteria) this;
        }

        public Criteria andWouSexNotIn(List<Integer> values) {
            addCriterion("wou_sex not in", values, "wouSex");
            return (Criteria) this;
        }

        public Criteria andWouSexBetween(Integer value1, Integer value2) {
            addCriterion("wou_sex between", value1, value2, "wouSex");
            return (Criteria) this;
        }

        public Criteria andWouSexNotBetween(Integer value1, Integer value2) {
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

        public Criteria andWouAgeEqualTo(Integer value) {
            addCriterion("wou_age =", value, "wouAge");
            return (Criteria) this;
        }

        public Criteria andWouAgeNotEqualTo(Integer value) {
            addCriterion("wou_age <>", value, "wouAge");
            return (Criteria) this;
        }

        public Criteria andWouAgeGreaterThan(Integer value) {
            addCriterion("wou_age >", value, "wouAge");
            return (Criteria) this;
        }

        public Criteria andWouAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("wou_age >=", value, "wouAge");
            return (Criteria) this;
        }

        public Criteria andWouAgeLessThan(Integer value) {
            addCriterion("wou_age <", value, "wouAge");
            return (Criteria) this;
        }

        public Criteria andWouAgeLessThanOrEqualTo(Integer value) {
            addCriterion("wou_age <=", value, "wouAge");
            return (Criteria) this;
        }

        public Criteria andWouAgeIn(List<Integer> values) {
            addCriterion("wou_age in", values, "wouAge");
            return (Criteria) this;
        }

        public Criteria andWouAgeNotIn(List<Integer> values) {
            addCriterion("wou_age not in", values, "wouAge");
            return (Criteria) this;
        }

        public Criteria andWouAgeBetween(Integer value1, Integer value2) {
            addCriterion("wou_age between", value1, value2, "wouAge");
            return (Criteria) this;
        }

        public Criteria andWouAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("wou_age not between", value1, value2, "wouAge");
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

        public Criteria andResideNatureEqualTo(Integer value) {
            addCriterion("reside_nature =", value, "resideNature");
            return (Criteria) this;
        }

        public Criteria andResideNatureNotEqualTo(Integer value) {
            addCriterion("reside_nature <>", value, "resideNature");
            return (Criteria) this;
        }

        public Criteria andResideNatureGreaterThan(Integer value) {
            addCriterion("reside_nature >", value, "resideNature");
            return (Criteria) this;
        }

        public Criteria andResideNatureGreaterThanOrEqualTo(Integer value) {
            addCriterion("reside_nature >=", value, "resideNature");
            return (Criteria) this;
        }

        public Criteria andResideNatureLessThan(Integer value) {
            addCriterion("reside_nature <", value, "resideNature");
            return (Criteria) this;
        }

        public Criteria andResideNatureLessThanOrEqualTo(Integer value) {
            addCriterion("reside_nature <=", value, "resideNature");
            return (Criteria) this;
        }

        public Criteria andResideNatureIn(List<Integer> values) {
            addCriterion("reside_nature in", values, "resideNature");
            return (Criteria) this;
        }

        public Criteria andResideNatureNotIn(List<Integer> values) {
            addCriterion("reside_nature not in", values, "resideNature");
            return (Criteria) this;
        }

        public Criteria andResideNatureBetween(Integer value1, Integer value2) {
            addCriterion("reside_nature between", value1, value2, "resideNature");
            return (Criteria) this;
        }

        public Criteria andResideNatureNotBetween(Integer value1, Integer value2) {
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

        public Criteria andPerProvinceIsNull() {
            addCriterion("per_province is null");
            return (Criteria) this;
        }

        public Criteria andPerProvinceIsNotNull() {
            addCriterion("per_province is not null");
            return (Criteria) this;
        }

        public Criteria andPerProvinceEqualTo(String value) {
            addCriterion("per_province =", value, "perProvince");
            return (Criteria) this;
        }

        public Criteria andPerProvinceNotEqualTo(String value) {
            addCriterion("per_province <>", value, "perProvince");
            return (Criteria) this;
        }

        public Criteria andPerProvinceGreaterThan(String value) {
            addCriterion("per_province >", value, "perProvince");
            return (Criteria) this;
        }

        public Criteria andPerProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("per_province >=", value, "perProvince");
            return (Criteria) this;
        }

        public Criteria andPerProvinceLessThan(String value) {
            addCriterion("per_province <", value, "perProvince");
            return (Criteria) this;
        }

        public Criteria andPerProvinceLessThanOrEqualTo(String value) {
            addCriterion("per_province <=", value, "perProvince");
            return (Criteria) this;
        }

        public Criteria andPerProvinceLike(String value) {
            addCriterion("per_province like", value, "perProvince");
            return (Criteria) this;
        }

        public Criteria andPerProvinceNotLike(String value) {
            addCriterion("per_province not like", value, "perProvince");
            return (Criteria) this;
        }

        public Criteria andPerProvinceIn(List<String> values) {
            addCriterion("per_province in", values, "perProvince");
            return (Criteria) this;
        }

        public Criteria andPerProvinceNotIn(List<String> values) {
            addCriterion("per_province not in", values, "perProvince");
            return (Criteria) this;
        }

        public Criteria andPerProvinceBetween(String value1, String value2) {
            addCriterion("per_province between", value1, value2, "perProvince");
            return (Criteria) this;
        }

        public Criteria andPerProvinceNotBetween(String value1, String value2) {
            addCriterion("per_province not between", value1, value2, "perProvince");
            return (Criteria) this;
        }

        public Criteria andPerCityIsNull() {
            addCriterion("per_city is null");
            return (Criteria) this;
        }

        public Criteria andPerCityIsNotNull() {
            addCriterion("per_city is not null");
            return (Criteria) this;
        }

        public Criteria andPerCityEqualTo(String value) {
            addCriterion("per_city =", value, "perCity");
            return (Criteria) this;
        }

        public Criteria andPerCityNotEqualTo(String value) {
            addCriterion("per_city <>", value, "perCity");
            return (Criteria) this;
        }

        public Criteria andPerCityGreaterThan(String value) {
            addCriterion("per_city >", value, "perCity");
            return (Criteria) this;
        }

        public Criteria andPerCityGreaterThanOrEqualTo(String value) {
            addCriterion("per_city >=", value, "perCity");
            return (Criteria) this;
        }

        public Criteria andPerCityLessThan(String value) {
            addCriterion("per_city <", value, "perCity");
            return (Criteria) this;
        }

        public Criteria andPerCityLessThanOrEqualTo(String value) {
            addCriterion("per_city <=", value, "perCity");
            return (Criteria) this;
        }

        public Criteria andPerCityLike(String value) {
            addCriterion("per_city like", value, "perCity");
            return (Criteria) this;
        }

        public Criteria andPerCityNotLike(String value) {
            addCriterion("per_city not like", value, "perCity");
            return (Criteria) this;
        }

        public Criteria andPerCityIn(List<String> values) {
            addCriterion("per_city in", values, "perCity");
            return (Criteria) this;
        }

        public Criteria andPerCityNotIn(List<String> values) {
            addCriterion("per_city not in", values, "perCity");
            return (Criteria) this;
        }

        public Criteria andPerCityBetween(String value1, String value2) {
            addCriterion("per_city between", value1, value2, "perCity");
            return (Criteria) this;
        }

        public Criteria andPerCityNotBetween(String value1, String value2) {
            addCriterion("per_city not between", value1, value2, "perCity");
            return (Criteria) this;
        }

        public Criteria andPerDistrictIsNull() {
            addCriterion("per_district is null");
            return (Criteria) this;
        }

        public Criteria andPerDistrictIsNotNull() {
            addCriterion("per_district is not null");
            return (Criteria) this;
        }

        public Criteria andPerDistrictEqualTo(String value) {
            addCriterion("per_district =", value, "perDistrict");
            return (Criteria) this;
        }

        public Criteria andPerDistrictNotEqualTo(String value) {
            addCriterion("per_district <>", value, "perDistrict");
            return (Criteria) this;
        }

        public Criteria andPerDistrictGreaterThan(String value) {
            addCriterion("per_district >", value, "perDistrict");
            return (Criteria) this;
        }

        public Criteria andPerDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("per_district >=", value, "perDistrict");
            return (Criteria) this;
        }

        public Criteria andPerDistrictLessThan(String value) {
            addCriterion("per_district <", value, "perDistrict");
            return (Criteria) this;
        }

        public Criteria andPerDistrictLessThanOrEqualTo(String value) {
            addCriterion("per_district <=", value, "perDistrict");
            return (Criteria) this;
        }

        public Criteria andPerDistrictLike(String value) {
            addCriterion("per_district like", value, "perDistrict");
            return (Criteria) this;
        }

        public Criteria andPerDistrictNotLike(String value) {
            addCriterion("per_district not like", value, "perDistrict");
            return (Criteria) this;
        }

        public Criteria andPerDistrictIn(List<String> values) {
            addCriterion("per_district in", values, "perDistrict");
            return (Criteria) this;
        }

        public Criteria andPerDistrictNotIn(List<String> values) {
            addCriterion("per_district not in", values, "perDistrict");
            return (Criteria) this;
        }

        public Criteria andPerDistrictBetween(String value1, String value2) {
            addCriterion("per_district between", value1, value2, "perDistrict");
            return (Criteria) this;
        }

        public Criteria andPerDistrictNotBetween(String value1, String value2) {
            addCriterion("per_district not between", value1, value2, "perDistrict");
            return (Criteria) this;
        }

        public Criteria andPerTownIsNull() {
            addCriterion("per_town is null");
            return (Criteria) this;
        }

        public Criteria andPerTownIsNotNull() {
            addCriterion("per_town is not null");
            return (Criteria) this;
        }

        public Criteria andPerTownEqualTo(String value) {
            addCriterion("per_town =", value, "perTown");
            return (Criteria) this;
        }

        public Criteria andPerTownNotEqualTo(String value) {
            addCriterion("per_town <>", value, "perTown");
            return (Criteria) this;
        }

        public Criteria andPerTownGreaterThan(String value) {
            addCriterion("per_town >", value, "perTown");
            return (Criteria) this;
        }

        public Criteria andPerTownGreaterThanOrEqualTo(String value) {
            addCriterion("per_town >=", value, "perTown");
            return (Criteria) this;
        }

        public Criteria andPerTownLessThan(String value) {
            addCriterion("per_town <", value, "perTown");
            return (Criteria) this;
        }

        public Criteria andPerTownLessThanOrEqualTo(String value) {
            addCriterion("per_town <=", value, "perTown");
            return (Criteria) this;
        }

        public Criteria andPerTownLike(String value) {
            addCriterion("per_town like", value, "perTown");
            return (Criteria) this;
        }

        public Criteria andPerTownNotLike(String value) {
            addCriterion("per_town not like", value, "perTown");
            return (Criteria) this;
        }

        public Criteria andPerTownIn(List<String> values) {
            addCriterion("per_town in", values, "perTown");
            return (Criteria) this;
        }

        public Criteria andPerTownNotIn(List<String> values) {
            addCriterion("per_town not in", values, "perTown");
            return (Criteria) this;
        }

        public Criteria andPerTownBetween(String value1, String value2) {
            addCriterion("per_town between", value1, value2, "perTown");
            return (Criteria) this;
        }

        public Criteria andPerTownNotBetween(String value1, String value2) {
            addCriterion("per_town not between", value1, value2, "perTown");
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

        public Criteria andSameHouseholdIsNull() {
            addCriterion("same_household is null");
            return (Criteria) this;
        }

        public Criteria andSameHouseholdIsNotNull() {
            addCriterion("same_household is not null");
            return (Criteria) this;
        }

        public Criteria andSameHouseholdEqualTo(Integer value) {
            addCriterion("same_household =", value, "sameHousehold");
            return (Criteria) this;
        }

        public Criteria andSameHouseholdNotEqualTo(Integer value) {
            addCriterion("same_household <>", value, "sameHousehold");
            return (Criteria) this;
        }

        public Criteria andSameHouseholdGreaterThan(Integer value) {
            addCriterion("same_household >", value, "sameHousehold");
            return (Criteria) this;
        }

        public Criteria andSameHouseholdGreaterThanOrEqualTo(Integer value) {
            addCriterion("same_household >=", value, "sameHousehold");
            return (Criteria) this;
        }

        public Criteria andSameHouseholdLessThan(Integer value) {
            addCriterion("same_household <", value, "sameHousehold");
            return (Criteria) this;
        }

        public Criteria andSameHouseholdLessThanOrEqualTo(Integer value) {
            addCriterion("same_household <=", value, "sameHousehold");
            return (Criteria) this;
        }

        public Criteria andSameHouseholdIn(List<Integer> values) {
            addCriterion("same_household in", values, "sameHousehold");
            return (Criteria) this;
        }

        public Criteria andSameHouseholdNotIn(List<Integer> values) {
            addCriterion("same_household not in", values, "sameHousehold");
            return (Criteria) this;
        }

        public Criteria andSameHouseholdBetween(Integer value1, Integer value2) {
            addCriterion("same_household between", value1, value2, "sameHousehold");
            return (Criteria) this;
        }

        public Criteria andSameHouseholdNotBetween(Integer value1, Integer value2) {
            addCriterion("same_household not between", value1, value2, "sameHousehold");
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

        public Criteria andDepartmentFirstIsNull() {
            addCriterion("department_first is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentFirstIsNotNull() {
            addCriterion("department_first is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentFirstEqualTo(Integer value) {
            addCriterion("department_first =", value, "departmentFirst");
            return (Criteria) this;
        }

        public Criteria andDepartmentFirstNotEqualTo(Integer value) {
            addCriterion("department_first <>", value, "departmentFirst");
            return (Criteria) this;
        }

        public Criteria andDepartmentFirstGreaterThan(Integer value) {
            addCriterion("department_first >", value, "departmentFirst");
            return (Criteria) this;
        }

        public Criteria andDepartmentFirstGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_first >=", value, "departmentFirst");
            return (Criteria) this;
        }

        public Criteria andDepartmentFirstLessThan(Integer value) {
            addCriterion("department_first <", value, "departmentFirst");
            return (Criteria) this;
        }

        public Criteria andDepartmentFirstLessThanOrEqualTo(Integer value) {
            addCriterion("department_first <=", value, "departmentFirst");
            return (Criteria) this;
        }

        public Criteria andDepartmentFirstIn(List<Integer> values) {
            addCriterion("department_first in", values, "departmentFirst");
            return (Criteria) this;
        }

        public Criteria andDepartmentFirstNotIn(List<Integer> values) {
            addCriterion("department_first not in", values, "departmentFirst");
            return (Criteria) this;
        }

        public Criteria andDepartmentFirstBetween(Integer value1, Integer value2) {
            addCriterion("department_first between", value1, value2, "departmentFirst");
            return (Criteria) this;
        }

        public Criteria andDepartmentFirstNotBetween(Integer value1, Integer value2) {
            addCriterion("department_first not between", value1, value2, "departmentFirst");
            return (Criteria) this;
        }

        public Criteria andDepartmentSecondIsNull() {
            addCriterion("department_second is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentSecondIsNotNull() {
            addCriterion("department_second is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentSecondEqualTo(Integer value) {
            addCriterion("department_second =", value, "departmentSecond");
            return (Criteria) this;
        }

        public Criteria andDepartmentSecondNotEqualTo(Integer value) {
            addCriterion("department_second <>", value, "departmentSecond");
            return (Criteria) this;
        }

        public Criteria andDepartmentSecondGreaterThan(Integer value) {
            addCriterion("department_second >", value, "departmentSecond");
            return (Criteria) this;
        }

        public Criteria andDepartmentSecondGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_second >=", value, "departmentSecond");
            return (Criteria) this;
        }

        public Criteria andDepartmentSecondLessThan(Integer value) {
            addCriterion("department_second <", value, "departmentSecond");
            return (Criteria) this;
        }

        public Criteria andDepartmentSecondLessThanOrEqualTo(Integer value) {
            addCriterion("department_second <=", value, "departmentSecond");
            return (Criteria) this;
        }

        public Criteria andDepartmentSecondIn(List<Integer> values) {
            addCriterion("department_second in", values, "departmentSecond");
            return (Criteria) this;
        }

        public Criteria andDepartmentSecondNotIn(List<Integer> values) {
            addCriterion("department_second not in", values, "departmentSecond");
            return (Criteria) this;
        }

        public Criteria andDepartmentSecondBetween(Integer value1, Integer value2) {
            addCriterion("department_second between", value1, value2, "departmentSecond");
            return (Criteria) this;
        }

        public Criteria andDepartmentSecondNotBetween(Integer value1, Integer value2) {
            addCriterion("department_second not between", value1, value2, "departmentSecond");
            return (Criteria) this;
        }

        public Criteria andBedNumberIsNull() {
            addCriterion("bed_number is null");
            return (Criteria) this;
        }

        public Criteria andBedNumberIsNotNull() {
            addCriterion("bed_number is not null");
            return (Criteria) this;
        }

        public Criteria andBedNumberEqualTo(String value) {
            addCriterion("bed_number =", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberNotEqualTo(String value) {
            addCriterion("bed_number <>", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberGreaterThan(String value) {
            addCriterion("bed_number >", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberGreaterThanOrEqualTo(String value) {
            addCriterion("bed_number >=", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberLessThan(String value) {
            addCriterion("bed_number <", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberLessThanOrEqualTo(String value) {
            addCriterion("bed_number <=", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberLike(String value) {
            addCriterion("bed_number like", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberNotLike(String value) {
            addCriterion("bed_number not like", value, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberIn(List<String> values) {
            addCriterion("bed_number in", values, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberNotIn(List<String> values) {
            addCriterion("bed_number not in", values, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberBetween(String value1, String value2) {
            addCriterion("bed_number between", value1, value2, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andBedNumberNotBetween(String value1, String value2) {
            addCriterion("bed_number not between", value1, value2, "bedNumber");
            return (Criteria) this;
        }

        public Criteria andContactsIsNull() {
            addCriterion("contacts is null");
            return (Criteria) this;
        }

        public Criteria andContactsIsNotNull() {
            addCriterion("contacts is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEqualTo(String value) {
            addCriterion("contacts =", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("contacts <>", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThan(String value) {
            addCriterion("contacts >", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("contacts >=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThan(String value) {
            addCriterion("contacts <", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("contacts <=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLike(String value) {
            addCriterion("contacts like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotLike(String value) {
            addCriterion("contacts not like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsIn(List<String> values) {
            addCriterion("contacts in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("contacts not in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("contacts between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("contacts not between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactAttributesIsNull() {
            addCriterion("contact_attributes is null");
            return (Criteria) this;
        }

        public Criteria andContactAttributesIsNotNull() {
            addCriterion("contact_attributes is not null");
            return (Criteria) this;
        }

        public Criteria andContactAttributesEqualTo(Integer value) {
            addCriterion("contact_attributes =", value, "contactAttributes");
            return (Criteria) this;
        }

        public Criteria andContactAttributesNotEqualTo(Integer value) {
            addCriterion("contact_attributes <>", value, "contactAttributes");
            return (Criteria) this;
        }

        public Criteria andContactAttributesGreaterThan(Integer value) {
            addCriterion("contact_attributes >", value, "contactAttributes");
            return (Criteria) this;
        }

        public Criteria andContactAttributesGreaterThanOrEqualTo(Integer value) {
            addCriterion("contact_attributes >=", value, "contactAttributes");
            return (Criteria) this;
        }

        public Criteria andContactAttributesLessThan(Integer value) {
            addCriterion("contact_attributes <", value, "contactAttributes");
            return (Criteria) this;
        }

        public Criteria andContactAttributesLessThanOrEqualTo(Integer value) {
            addCriterion("contact_attributes <=", value, "contactAttributes");
            return (Criteria) this;
        }

        public Criteria andContactAttributesIn(List<Integer> values) {
            addCriterion("contact_attributes in", values, "contactAttributes");
            return (Criteria) this;
        }

        public Criteria andContactAttributesNotIn(List<Integer> values) {
            addCriterion("contact_attributes not in", values, "contactAttributes");
            return (Criteria) this;
        }

        public Criteria andContactAttributesBetween(Integer value1, Integer value2) {
            addCriterion("contact_attributes between", value1, value2, "contactAttributes");
            return (Criteria) this;
        }

        public Criteria andContactAttributesNotBetween(Integer value1, Integer value2) {
            addCriterion("contact_attributes not between", value1, value2, "contactAttributes");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneIsNull() {
            addCriterion("contacts_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneIsNotNull() {
            addCriterion("contacts_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneEqualTo(String value) {
            addCriterion("contacts_phone =", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotEqualTo(String value) {
            addCriterion("contacts_phone <>", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneGreaterThan(String value) {
            addCriterion("contacts_phone >", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_phone >=", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneLessThan(String value) {
            addCriterion("contacts_phone <", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneLessThanOrEqualTo(String value) {
            addCriterion("contacts_phone <=", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneLike(String value) {
            addCriterion("contacts_phone like", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotLike(String value) {
            addCriterion("contacts_phone not like", value, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneIn(List<String> values) {
            addCriterion("contacts_phone in", values, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotIn(List<String> values) {
            addCriterion("contacts_phone not in", values, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneBetween(String value1, String value2) {
            addCriterion("contacts_phone between", value1, value2, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andContactsPhoneNotBetween(String value1, String value2) {
            addCriterion("contacts_phone not between", value1, value2, "contactsPhone");
            return (Criteria) this;
        }

        public Criteria andInjuryDescriptionIsNull() {
            addCriterion("injury_description is null");
            return (Criteria) this;
        }

        public Criteria andInjuryDescriptionIsNotNull() {
            addCriterion("injury_description is not null");
            return (Criteria) this;
        }

        public Criteria andInjuryDescriptionEqualTo(String value) {
            addCriterion("injury_description =", value, "injuryDescription");
            return (Criteria) this;
        }

        public Criteria andInjuryDescriptionNotEqualTo(String value) {
            addCriterion("injury_description <>", value, "injuryDescription");
            return (Criteria) this;
        }

        public Criteria andInjuryDescriptionGreaterThan(String value) {
            addCriterion("injury_description >", value, "injuryDescription");
            return (Criteria) this;
        }

        public Criteria andInjuryDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("injury_description >=", value, "injuryDescription");
            return (Criteria) this;
        }

        public Criteria andInjuryDescriptionLessThan(String value) {
            addCriterion("injury_description <", value, "injuryDescription");
            return (Criteria) this;
        }

        public Criteria andInjuryDescriptionLessThanOrEqualTo(String value) {
            addCriterion("injury_description <=", value, "injuryDescription");
            return (Criteria) this;
        }

        public Criteria andInjuryDescriptionLike(String value) {
            addCriterion("injury_description like", value, "injuryDescription");
            return (Criteria) this;
        }

        public Criteria andInjuryDescriptionNotLike(String value) {
            addCriterion("injury_description not like", value, "injuryDescription");
            return (Criteria) this;
        }

        public Criteria andInjuryDescriptionIn(List<String> values) {
            addCriterion("injury_description in", values, "injuryDescription");
            return (Criteria) this;
        }

        public Criteria andInjuryDescriptionNotIn(List<String> values) {
            addCriterion("injury_description not in", values, "injuryDescription");
            return (Criteria) this;
        }

        public Criteria andInjuryDescriptionBetween(String value1, String value2) {
            addCriterion("injury_description between", value1, value2, "injuryDescription");
            return (Criteria) this;
        }

        public Criteria andInjuryDescriptionNotBetween(String value1, String value2) {
            addCriterion("injury_description not between", value1, value2, "injuryDescription");
            return (Criteria) this;
        }

        public Criteria andInjuryCauseIsNull() {
            addCriterion("injury_cause is null");
            return (Criteria) this;
        }

        public Criteria andInjuryCauseIsNotNull() {
            addCriterion("injury_cause is not null");
            return (Criteria) this;
        }

        public Criteria andInjuryCauseEqualTo(Integer value) {
            addCriterion("injury_cause =", value, "injuryCause");
            return (Criteria) this;
        }

        public Criteria andInjuryCauseNotEqualTo(Integer value) {
            addCriterion("injury_cause <>", value, "injuryCause");
            return (Criteria) this;
        }

        public Criteria andInjuryCauseGreaterThan(Integer value) {
            addCriterion("injury_cause >", value, "injuryCause");
            return (Criteria) this;
        }

        public Criteria andInjuryCauseGreaterThanOrEqualTo(Integer value) {
            addCriterion("injury_cause >=", value, "injuryCause");
            return (Criteria) this;
        }

        public Criteria andInjuryCauseLessThan(Integer value) {
            addCriterion("injury_cause <", value, "injuryCause");
            return (Criteria) this;
        }

        public Criteria andInjuryCauseLessThanOrEqualTo(Integer value) {
            addCriterion("injury_cause <=", value, "injuryCause");
            return (Criteria) this;
        }

        public Criteria andInjuryCauseIn(List<Integer> values) {
            addCriterion("injury_cause in", values, "injuryCause");
            return (Criteria) this;
        }

        public Criteria andInjuryCauseNotIn(List<Integer> values) {
            addCriterion("injury_cause not in", values, "injuryCause");
            return (Criteria) this;
        }

        public Criteria andInjuryCauseBetween(Integer value1, Integer value2) {
            addCriterion("injury_cause between", value1, value2, "injuryCause");
            return (Criteria) this;
        }

        public Criteria andInjuryCauseNotBetween(Integer value1, Integer value2) {
            addCriterion("injury_cause not between", value1, value2, "injuryCause");
            return (Criteria) this;
        }

        public Criteria andSituationStatementIsNull() {
            addCriterion("situation_statement is null");
            return (Criteria) this;
        }

        public Criteria andSituationStatementIsNotNull() {
            addCriterion("situation_statement is not null");
            return (Criteria) this;
        }

        public Criteria andSituationStatementEqualTo(String value) {
            addCriterion("situation_statement =", value, "situationStatement");
            return (Criteria) this;
        }

        public Criteria andSituationStatementNotEqualTo(String value) {
            addCriterion("situation_statement <>", value, "situationStatement");
            return (Criteria) this;
        }

        public Criteria andSituationStatementGreaterThan(String value) {
            addCriterion("situation_statement >", value, "situationStatement");
            return (Criteria) this;
        }

        public Criteria andSituationStatementGreaterThanOrEqualTo(String value) {
            addCriterion("situation_statement >=", value, "situationStatement");
            return (Criteria) this;
        }

        public Criteria andSituationStatementLessThan(String value) {
            addCriterion("situation_statement <", value, "situationStatement");
            return (Criteria) this;
        }

        public Criteria andSituationStatementLessThanOrEqualTo(String value) {
            addCriterion("situation_statement <=", value, "situationStatement");
            return (Criteria) this;
        }

        public Criteria andSituationStatementLike(String value) {
            addCriterion("situation_statement like", value, "situationStatement");
            return (Criteria) this;
        }

        public Criteria andSituationStatementNotLike(String value) {
            addCriterion("situation_statement not like", value, "situationStatement");
            return (Criteria) this;
        }

        public Criteria andSituationStatementIn(List<String> values) {
            addCriterion("situation_statement in", values, "situationStatement");
            return (Criteria) this;
        }

        public Criteria andSituationStatementNotIn(List<String> values) {
            addCriterion("situation_statement not in", values, "situationStatement");
            return (Criteria) this;
        }

        public Criteria andSituationStatementBetween(String value1, String value2) {
            addCriterion("situation_statement between", value1, value2, "situationStatement");
            return (Criteria) this;
        }

        public Criteria andSituationStatementNotBetween(String value1, String value2) {
            addCriterion("situation_statement not between", value1, value2, "situationStatement");
            return (Criteria) this;
        }

        public Criteria andTotalEstimatedAmountIsNull() {
            addCriterion("total_estimated_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalEstimatedAmountIsNotNull() {
            addCriterion("total_estimated_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEstimatedAmountEqualTo(BigDecimal value) {
            addCriterion("total_estimated_amount =", value, "totalEstimatedAmount");
            return (Criteria) this;
        }

        public Criteria andTotalEstimatedAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_estimated_amount <>", value, "totalEstimatedAmount");
            return (Criteria) this;
        }

        public Criteria andTotalEstimatedAmountGreaterThan(BigDecimal value) {
            addCriterion("total_estimated_amount >", value, "totalEstimatedAmount");
            return (Criteria) this;
        }

        public Criteria andTotalEstimatedAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_estimated_amount >=", value, "totalEstimatedAmount");
            return (Criteria) this;
        }

        public Criteria andTotalEstimatedAmountLessThan(BigDecimal value) {
            addCriterion("total_estimated_amount <", value, "totalEstimatedAmount");
            return (Criteria) this;
        }

        public Criteria andTotalEstimatedAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_estimated_amount <=", value, "totalEstimatedAmount");
            return (Criteria) this;
        }

        public Criteria andTotalEstimatedAmountIn(List<BigDecimal> values) {
            addCriterion("total_estimated_amount in", values, "totalEstimatedAmount");
            return (Criteria) this;
        }

        public Criteria andTotalEstimatedAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_estimated_amount not in", values, "totalEstimatedAmount");
            return (Criteria) this;
        }

        public Criteria andTotalEstimatedAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_estimated_amount between", value1, value2, "totalEstimatedAmount");
            return (Criteria) this;
        }

        public Criteria andTotalEstimatedAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_estimated_amount not between", value1, value2, "totalEstimatedAmount");
            return (Criteria) this;
        }

        public Criteria andLossLiabilityIsNull() {
            addCriterion("loss_liability is null");
            return (Criteria) this;
        }

        public Criteria andLossLiabilityIsNotNull() {
            addCriterion("loss_liability is not null");
            return (Criteria) this;
        }

        public Criteria andLossLiabilityEqualTo(Integer value) {
            addCriterion("loss_liability =", value, "lossLiability");
            return (Criteria) this;
        }

        public Criteria andLossLiabilityNotEqualTo(Integer value) {
            addCriterion("loss_liability <>", value, "lossLiability");
            return (Criteria) this;
        }

        public Criteria andLossLiabilityGreaterThan(Integer value) {
            addCriterion("loss_liability >", value, "lossLiability");
            return (Criteria) this;
        }

        public Criteria andLossLiabilityGreaterThanOrEqualTo(Integer value) {
            addCriterion("loss_liability >=", value, "lossLiability");
            return (Criteria) this;
        }

        public Criteria andLossLiabilityLessThan(Integer value) {
            addCriterion("loss_liability <", value, "lossLiability");
            return (Criteria) this;
        }

        public Criteria andLossLiabilityLessThanOrEqualTo(Integer value) {
            addCriterion("loss_liability <=", value, "lossLiability");
            return (Criteria) this;
        }

        public Criteria andLossLiabilityIn(List<Integer> values) {
            addCriterion("loss_liability in", values, "lossLiability");
            return (Criteria) this;
        }

        public Criteria andLossLiabilityNotIn(List<Integer> values) {
            addCriterion("loss_liability not in", values, "lossLiability");
            return (Criteria) this;
        }

        public Criteria andLossLiabilityBetween(Integer value1, Integer value2) {
            addCriterion("loss_liability between", value1, value2, "lossLiability");
            return (Criteria) this;
        }

        public Criteria andLossLiabilityNotBetween(Integer value1, Integer value2) {
            addCriterion("loss_liability not between", value1, value2, "lossLiability");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountIsNull() {
            addCriterion("estimated_amount is null");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountIsNotNull() {
            addCriterion("estimated_amount is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountEqualTo(BigDecimal value) {
            addCriterion("estimated_amount =", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountNotEqualTo(BigDecimal value) {
            addCriterion("estimated_amount <>", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountGreaterThan(BigDecimal value) {
            addCriterion("estimated_amount >", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("estimated_amount >=", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountLessThan(BigDecimal value) {
            addCriterion("estimated_amount <", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("estimated_amount <=", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountIn(List<BigDecimal> values) {
            addCriterion("estimated_amount in", values, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountNotIn(List<BigDecimal> values) {
            addCriterion("estimated_amount not in", values, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("estimated_amount between", value1, value2, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("estimated_amount not between", value1, value2, "estimatedAmount");
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

        public Criteria andIsDeletedEqualTo(Integer value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Integer value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Integer value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Integer value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Integer> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Integer> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
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

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdtaeTimeIsNull() {
            addCriterion("updtae_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdtaeTimeIsNotNull() {
            addCriterion("updtae_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdtaeTimeEqualTo(Date value) {
            addCriterion("updtae_time =", value, "updtaeTime");
            return (Criteria) this;
        }

        public Criteria andUpdtaeTimeNotEqualTo(Date value) {
            addCriterion("updtae_time <>", value, "updtaeTime");
            return (Criteria) this;
        }

        public Criteria andUpdtaeTimeGreaterThan(Date value) {
            addCriterion("updtae_time >", value, "updtaeTime");
            return (Criteria) this;
        }

        public Criteria andUpdtaeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updtae_time >=", value, "updtaeTime");
            return (Criteria) this;
        }

        public Criteria andUpdtaeTimeLessThan(Date value) {
            addCriterion("updtae_time <", value, "updtaeTime");
            return (Criteria) this;
        }

        public Criteria andUpdtaeTimeLessThanOrEqualTo(Date value) {
            addCriterion("updtae_time <=", value, "updtaeTime");
            return (Criteria) this;
        }

        public Criteria andUpdtaeTimeIn(List<Date> values) {
            addCriterion("updtae_time in", values, "updtaeTime");
            return (Criteria) this;
        }

        public Criteria andUpdtaeTimeNotIn(List<Date> values) {
            addCriterion("updtae_time not in", values, "updtaeTime");
            return (Criteria) this;
        }

        public Criteria andUpdtaeTimeBetween(Date value1, Date value2) {
            addCriterion("updtae_time between", value1, value2, "updtaeTime");
            return (Criteria) this;
        }

        public Criteria andUpdtaeTimeNotBetween(Date value1, Date value2) {
            addCriterion("updtae_time not between", value1, value2, "updtaeTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
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