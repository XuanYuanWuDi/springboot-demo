package com.injured.server.api.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CeRegistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CeRegistExample() {
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

        public Criteria andCompanyCodeIsNull() {
            addCriterion("company_code is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNotNull() {
            addCriterion("company_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeEqualTo(String value) {
            addCriterion("company_code =", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotEqualTo(String value) {
            addCriterion("company_code <>", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThan(String value) {
            addCriterion("company_code >", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("company_code >=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThan(String value) {
            addCriterion("company_code <", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("company_code <=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLike(String value) {
            addCriterion("company_code like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotLike(String value) {
            addCriterion("company_code not like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIn(List<String> values) {
            addCriterion("company_code in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotIn(List<String> values) {
            addCriterion("company_code not in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeBetween(String value1, String value2) {
            addCriterion("company_code between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("company_code not between", value1, value2, "companyCode");
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

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
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

        public Criteria andCaseStatusIsNull() {
            addCriterion("case_status is null");
            return (Criteria) this;
        }

        public Criteria andCaseStatusIsNotNull() {
            addCriterion("case_status is not null");
            return (Criteria) this;
        }

        public Criteria andCaseStatusEqualTo(String value) {
            addCriterion("case_status =", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotEqualTo(String value) {
            addCriterion("case_status <>", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusGreaterThan(String value) {
            addCriterion("case_status >", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("case_status >=", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusLessThan(String value) {
            addCriterion("case_status <", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusLessThanOrEqualTo(String value) {
            addCriterion("case_status <=", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusLike(String value) {
            addCriterion("case_status like", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotLike(String value) {
            addCriterion("case_status not like", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusIn(List<String> values) {
            addCriterion("case_status in", values, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotIn(List<String> values) {
            addCriterion("case_status not in", values, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusBetween(String value1, String value2) {
            addCriterion("case_status between", value1, value2, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotBetween(String value1, String value2) {
            addCriterion("case_status not between", value1, value2, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNull() {
            addCriterion("cancel_reason is null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNotNull() {
            addCriterion("cancel_reason is not null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonEqualTo(String value) {
            addCriterion("cancel_reason =", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotEqualTo(String value) {
            addCriterion("cancel_reason <>", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThan(String value) {
            addCriterion("cancel_reason >", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_reason >=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThan(String value) {
            addCriterion("cancel_reason <", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThanOrEqualTo(String value) {
            addCriterion("cancel_reason <=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLike(String value) {
            addCriterion("cancel_reason like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotLike(String value) {
            addCriterion("cancel_reason not like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIn(List<String> values) {
            addCriterion("cancel_reason in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotIn(List<String> values) {
            addCriterion("cancel_reason not in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonBetween(String value1, String value2) {
            addCriterion("cancel_reason between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotBetween(String value1, String value2) {
            addCriterion("cancel_reason not between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNull() {
            addCriterion("cancel_date is null");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNotNull() {
            addCriterion("cancel_date is not null");
            return (Criteria) this;
        }

        public Criteria andCancelDateEqualTo(Date value) {
            addCriterion("cancel_date =", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotEqualTo(Date value) {
            addCriterion("cancel_date <>", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThan(Date value) {
            addCriterion("cancel_date >", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThanOrEqualTo(Date value) {
            addCriterion("cancel_date >=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThan(Date value) {
            addCriterion("cancel_date <", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThanOrEqualTo(Date value) {
            addCriterion("cancel_date <=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateIn(List<Date> values) {
            addCriterion("cancel_date in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotIn(List<Date> values) {
            addCriterion("cancel_date not in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateBetween(Date value1, Date value2) {
            addCriterion("cancel_date between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotBetween(Date value1, Date value2) {
            addCriterion("cancel_date not between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andWeatherIsNull() {
            addCriterion("weather is null");
            return (Criteria) this;
        }

        public Criteria andWeatherIsNotNull() {
            addCriterion("weather is not null");
            return (Criteria) this;
        }

        public Criteria andWeatherEqualTo(String value) {
            addCriterion("weather =", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotEqualTo(String value) {
            addCriterion("weather <>", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherGreaterThan(String value) {
            addCriterion("weather >", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherGreaterThanOrEqualTo(String value) {
            addCriterion("weather >=", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLessThan(String value) {
            addCriterion("weather <", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLessThanOrEqualTo(String value) {
            addCriterion("weather <=", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLike(String value) {
            addCriterion("weather like", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotLike(String value) {
            addCriterion("weather not like", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherIn(List<String> values) {
            addCriterion("weather in", values, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotIn(List<String> values) {
            addCriterion("weather not in", values, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherBetween(String value1, String value2) {
            addCriterion("weather between", value1, value2, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotBetween(String value1, String value2) {
            addCriterion("weather not between", value1, value2, "weather");
            return (Criteria) this;
        }

        public Criteria andHurtNumIsNull() {
            addCriterion("hurt_num is null");
            return (Criteria) this;
        }

        public Criteria andHurtNumIsNotNull() {
            addCriterion("hurt_num is not null");
            return (Criteria) this;
        }

        public Criteria andHurtNumEqualTo(Byte value) {
            addCriterion("hurt_num =", value, "hurtNum");
            return (Criteria) this;
        }

        public Criteria andHurtNumNotEqualTo(Byte value) {
            addCriterion("hurt_num <>", value, "hurtNum");
            return (Criteria) this;
        }

        public Criteria andHurtNumGreaterThan(Byte value) {
            addCriterion("hurt_num >", value, "hurtNum");
            return (Criteria) this;
        }

        public Criteria andHurtNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("hurt_num >=", value, "hurtNum");
            return (Criteria) this;
        }

        public Criteria andHurtNumLessThan(Byte value) {
            addCriterion("hurt_num <", value, "hurtNum");
            return (Criteria) this;
        }

        public Criteria andHurtNumLessThanOrEqualTo(Byte value) {
            addCriterion("hurt_num <=", value, "hurtNum");
            return (Criteria) this;
        }

        public Criteria andHurtNumIn(List<Byte> values) {
            addCriterion("hurt_num in", values, "hurtNum");
            return (Criteria) this;
        }

        public Criteria andHurtNumNotIn(List<Byte> values) {
            addCriterion("hurt_num not in", values, "hurtNum");
            return (Criteria) this;
        }

        public Criteria andHurtNumBetween(Byte value1, Byte value2) {
            addCriterion("hurt_num between", value1, value2, "hurtNum");
            return (Criteria) this;
        }

        public Criteria andHurtNumNotBetween(Byte value1, Byte value2) {
            addCriterion("hurt_num not between", value1, value2, "hurtNum");
            return (Criteria) this;
        }

        public Criteria andAcceptIndIsNull() {
            addCriterion("accept_ind is null");
            return (Criteria) this;
        }

        public Criteria andAcceptIndIsNotNull() {
            addCriterion("accept_ind is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptIndEqualTo(String value) {
            addCriterion("accept_ind =", value, "acceptInd");
            return (Criteria) this;
        }

        public Criteria andAcceptIndNotEqualTo(String value) {
            addCriterion("accept_ind <>", value, "acceptInd");
            return (Criteria) this;
        }

        public Criteria andAcceptIndGreaterThan(String value) {
            addCriterion("accept_ind >", value, "acceptInd");
            return (Criteria) this;
        }

        public Criteria andAcceptIndGreaterThanOrEqualTo(String value) {
            addCriterion("accept_ind >=", value, "acceptInd");
            return (Criteria) this;
        }

        public Criteria andAcceptIndLessThan(String value) {
            addCriterion("accept_ind <", value, "acceptInd");
            return (Criteria) this;
        }

        public Criteria andAcceptIndLessThanOrEqualTo(String value) {
            addCriterion("accept_ind <=", value, "acceptInd");
            return (Criteria) this;
        }

        public Criteria andAcceptIndLike(String value) {
            addCriterion("accept_ind like", value, "acceptInd");
            return (Criteria) this;
        }

        public Criteria andAcceptIndNotLike(String value) {
            addCriterion("accept_ind not like", value, "acceptInd");
            return (Criteria) this;
        }

        public Criteria andAcceptIndIn(List<String> values) {
            addCriterion("accept_ind in", values, "acceptInd");
            return (Criteria) this;
        }

        public Criteria andAcceptIndNotIn(List<String> values) {
            addCriterion("accept_ind not in", values, "acceptInd");
            return (Criteria) this;
        }

        public Criteria andAcceptIndBetween(String value1, String value2) {
            addCriterion("accept_ind between", value1, value2, "acceptInd");
            return (Criteria) this;
        }

        public Criteria andAcceptIndNotBetween(String value1, String value2) {
            addCriterion("accept_ind not between", value1, value2, "acceptInd");
            return (Criteria) this;
        }

        public Criteria andIsPersonInjuredIsNull() {
            addCriterion("is_person_injured is null");
            return (Criteria) this;
        }

        public Criteria andIsPersonInjuredIsNotNull() {
            addCriterion("is_person_injured is not null");
            return (Criteria) this;
        }

        public Criteria andIsPersonInjuredEqualTo(String value) {
            addCriterion("is_person_injured =", value, "isPersonInjured");
            return (Criteria) this;
        }

        public Criteria andIsPersonInjuredNotEqualTo(String value) {
            addCriterion("is_person_injured <>", value, "isPersonInjured");
            return (Criteria) this;
        }

        public Criteria andIsPersonInjuredGreaterThan(String value) {
            addCriterion("is_person_injured >", value, "isPersonInjured");
            return (Criteria) this;
        }

        public Criteria andIsPersonInjuredGreaterThanOrEqualTo(String value) {
            addCriterion("is_person_injured >=", value, "isPersonInjured");
            return (Criteria) this;
        }

        public Criteria andIsPersonInjuredLessThan(String value) {
            addCriterion("is_person_injured <", value, "isPersonInjured");
            return (Criteria) this;
        }

        public Criteria andIsPersonInjuredLessThanOrEqualTo(String value) {
            addCriterion("is_person_injured <=", value, "isPersonInjured");
            return (Criteria) this;
        }

        public Criteria andIsPersonInjuredLike(String value) {
            addCriterion("is_person_injured like", value, "isPersonInjured");
            return (Criteria) this;
        }

        public Criteria andIsPersonInjuredNotLike(String value) {
            addCriterion("is_person_injured not like", value, "isPersonInjured");
            return (Criteria) this;
        }

        public Criteria andIsPersonInjuredIn(List<String> values) {
            addCriterion("is_person_injured in", values, "isPersonInjured");
            return (Criteria) this;
        }

        public Criteria andIsPersonInjuredNotIn(List<String> values) {
            addCriterion("is_person_injured not in", values, "isPersonInjured");
            return (Criteria) this;
        }

        public Criteria andIsPersonInjuredBetween(String value1, String value2) {
            addCriterion("is_person_injured between", value1, value2, "isPersonInjured");
            return (Criteria) this;
        }

        public Criteria andIsPersonInjuredNotBetween(String value1, String value2) {
            addCriterion("is_person_injured not between", value1, value2, "isPersonInjured");
            return (Criteria) this;
        }

        public Criteria andIsProtectLossIsNull() {
            addCriterion("is_protect_loss is null");
            return (Criteria) this;
        }

        public Criteria andIsProtectLossIsNotNull() {
            addCriterion("is_protect_loss is not null");
            return (Criteria) this;
        }

        public Criteria andIsProtectLossEqualTo(String value) {
            addCriterion("is_protect_loss =", value, "isProtectLoss");
            return (Criteria) this;
        }

        public Criteria andIsProtectLossNotEqualTo(String value) {
            addCriterion("is_protect_loss <>", value, "isProtectLoss");
            return (Criteria) this;
        }

        public Criteria andIsProtectLossGreaterThan(String value) {
            addCriterion("is_protect_loss >", value, "isProtectLoss");
            return (Criteria) this;
        }

        public Criteria andIsProtectLossGreaterThanOrEqualTo(String value) {
            addCriterion("is_protect_loss >=", value, "isProtectLoss");
            return (Criteria) this;
        }

        public Criteria andIsProtectLossLessThan(String value) {
            addCriterion("is_protect_loss <", value, "isProtectLoss");
            return (Criteria) this;
        }

        public Criteria andIsProtectLossLessThanOrEqualTo(String value) {
            addCriterion("is_protect_loss <=", value, "isProtectLoss");
            return (Criteria) this;
        }

        public Criteria andIsProtectLossLike(String value) {
            addCriterion("is_protect_loss like", value, "isProtectLoss");
            return (Criteria) this;
        }

        public Criteria andIsProtectLossNotLike(String value) {
            addCriterion("is_protect_loss not like", value, "isProtectLoss");
            return (Criteria) this;
        }

        public Criteria andIsProtectLossIn(List<String> values) {
            addCriterion("is_protect_loss in", values, "isProtectLoss");
            return (Criteria) this;
        }

        public Criteria andIsProtectLossNotIn(List<String> values) {
            addCriterion("is_protect_loss not in", values, "isProtectLoss");
            return (Criteria) this;
        }

        public Criteria andIsProtectLossBetween(String value1, String value2) {
            addCriterion("is_protect_loss between", value1, value2, "isProtectLoss");
            return (Criteria) this;
        }

        public Criteria andIsProtectLossNotBetween(String value1, String value2) {
            addCriterion("is_protect_loss not between", value1, value2, "isProtectLoss");
            return (Criteria) this;
        }

        public Criteria andIsOutofLocalClaimIsNull() {
            addCriterion("is_outof_local_claim is null");
            return (Criteria) this;
        }

        public Criteria andIsOutofLocalClaimIsNotNull() {
            addCriterion("is_outof_local_claim is not null");
            return (Criteria) this;
        }

        public Criteria andIsOutofLocalClaimEqualTo(String value) {
            addCriterion("is_outof_local_claim =", value, "isOutofLocalClaim");
            return (Criteria) this;
        }

        public Criteria andIsOutofLocalClaimNotEqualTo(String value) {
            addCriterion("is_outof_local_claim <>", value, "isOutofLocalClaim");
            return (Criteria) this;
        }

        public Criteria andIsOutofLocalClaimGreaterThan(String value) {
            addCriterion("is_outof_local_claim >", value, "isOutofLocalClaim");
            return (Criteria) this;
        }

        public Criteria andIsOutofLocalClaimGreaterThanOrEqualTo(String value) {
            addCriterion("is_outof_local_claim >=", value, "isOutofLocalClaim");
            return (Criteria) this;
        }

        public Criteria andIsOutofLocalClaimLessThan(String value) {
            addCriterion("is_outof_local_claim <", value, "isOutofLocalClaim");
            return (Criteria) this;
        }

        public Criteria andIsOutofLocalClaimLessThanOrEqualTo(String value) {
            addCriterion("is_outof_local_claim <=", value, "isOutofLocalClaim");
            return (Criteria) this;
        }

        public Criteria andIsOutofLocalClaimLike(String value) {
            addCriterion("is_outof_local_claim like", value, "isOutofLocalClaim");
            return (Criteria) this;
        }

        public Criteria andIsOutofLocalClaimNotLike(String value) {
            addCriterion("is_outof_local_claim not like", value, "isOutofLocalClaim");
            return (Criteria) this;
        }

        public Criteria andIsOutofLocalClaimIn(List<String> values) {
            addCriterion("is_outof_local_claim in", values, "isOutofLocalClaim");
            return (Criteria) this;
        }

        public Criteria andIsOutofLocalClaimNotIn(List<String> values) {
            addCriterion("is_outof_local_claim not in", values, "isOutofLocalClaim");
            return (Criteria) this;
        }

        public Criteria andIsOutofLocalClaimBetween(String value1, String value2) {
            addCriterion("is_outof_local_claim between", value1, value2, "isOutofLocalClaim");
            return (Criteria) this;
        }

        public Criteria andIsOutofLocalClaimNotBetween(String value1, String value2) {
            addCriterion("is_outof_local_claim not between", value1, value2, "isOutofLocalClaim");
            return (Criteria) this;
        }

        public Criteria andSubrogationFlagIsNull() {
            addCriterion("subrogation_flag is null");
            return (Criteria) this;
        }

        public Criteria andSubrogationFlagIsNotNull() {
            addCriterion("subrogation_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSubrogationFlagEqualTo(String value) {
            addCriterion("subrogation_flag =", value, "subrogationFlag");
            return (Criteria) this;
        }

        public Criteria andSubrogationFlagNotEqualTo(String value) {
            addCriterion("subrogation_flag <>", value, "subrogationFlag");
            return (Criteria) this;
        }

        public Criteria andSubrogationFlagGreaterThan(String value) {
            addCriterion("subrogation_flag >", value, "subrogationFlag");
            return (Criteria) this;
        }

        public Criteria andSubrogationFlagGreaterThanOrEqualTo(String value) {
            addCriterion("subrogation_flag >=", value, "subrogationFlag");
            return (Criteria) this;
        }

        public Criteria andSubrogationFlagLessThan(String value) {
            addCriterion("subrogation_flag <", value, "subrogationFlag");
            return (Criteria) this;
        }

        public Criteria andSubrogationFlagLessThanOrEqualTo(String value) {
            addCriterion("subrogation_flag <=", value, "subrogationFlag");
            return (Criteria) this;
        }

        public Criteria andSubrogationFlagLike(String value) {
            addCriterion("subrogation_flag like", value, "subrogationFlag");
            return (Criteria) this;
        }

        public Criteria andSubrogationFlagNotLike(String value) {
            addCriterion("subrogation_flag not like", value, "subrogationFlag");
            return (Criteria) this;
        }

        public Criteria andSubrogationFlagIn(List<String> values) {
            addCriterion("subrogation_flag in", values, "subrogationFlag");
            return (Criteria) this;
        }

        public Criteria andSubrogationFlagNotIn(List<String> values) {
            addCriterion("subrogation_flag not in", values, "subrogationFlag");
            return (Criteria) this;
        }

        public Criteria andSubrogationFlagBetween(String value1, String value2) {
            addCriterion("subrogation_flag between", value1, value2, "subrogationFlag");
            return (Criteria) this;
        }

        public Criteria andSubrogationFlagNotBetween(String value1, String value2) {
            addCriterion("subrogation_flag not between", value1, value2, "subrogationFlag");
            return (Criteria) this;
        }

        public Criteria andIsClosedIsNull() {
            addCriterion("is_closed is null");
            return (Criteria) this;
        }

        public Criteria andIsClosedIsNotNull() {
            addCriterion("is_closed is not null");
            return (Criteria) this;
        }

        public Criteria andIsClosedEqualTo(String value) {
            addCriterion("is_closed =", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedNotEqualTo(String value) {
            addCriterion("is_closed <>", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedGreaterThan(String value) {
            addCriterion("is_closed >", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedGreaterThanOrEqualTo(String value) {
            addCriterion("is_closed >=", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedLessThan(String value) {
            addCriterion("is_closed <", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedLessThanOrEqualTo(String value) {
            addCriterion("is_closed <=", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedLike(String value) {
            addCriterion("is_closed like", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedNotLike(String value) {
            addCriterion("is_closed not like", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedIn(List<String> values) {
            addCriterion("is_closed in", values, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedNotIn(List<String> values) {
            addCriterion("is_closed not in", values, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedBetween(String value1, String value2) {
            addCriterion("is_closed between", value1, value2, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedNotBetween(String value1, String value2) {
            addCriterion("is_closed not between", value1, value2, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsSimpleClaimIsNull() {
            addCriterion("is_simple_claim is null");
            return (Criteria) this;
        }

        public Criteria andIsSimpleClaimIsNotNull() {
            addCriterion("is_simple_claim is not null");
            return (Criteria) this;
        }

        public Criteria andIsSimpleClaimEqualTo(String value) {
            addCriterion("is_simple_claim =", value, "isSimpleClaim");
            return (Criteria) this;
        }

        public Criteria andIsSimpleClaimNotEqualTo(String value) {
            addCriterion("is_simple_claim <>", value, "isSimpleClaim");
            return (Criteria) this;
        }

        public Criteria andIsSimpleClaimGreaterThan(String value) {
            addCriterion("is_simple_claim >", value, "isSimpleClaim");
            return (Criteria) this;
        }

        public Criteria andIsSimpleClaimGreaterThanOrEqualTo(String value) {
            addCriterion("is_simple_claim >=", value, "isSimpleClaim");
            return (Criteria) this;
        }

        public Criteria andIsSimpleClaimLessThan(String value) {
            addCriterion("is_simple_claim <", value, "isSimpleClaim");
            return (Criteria) this;
        }

        public Criteria andIsSimpleClaimLessThanOrEqualTo(String value) {
            addCriterion("is_simple_claim <=", value, "isSimpleClaim");
            return (Criteria) this;
        }

        public Criteria andIsSimpleClaimLike(String value) {
            addCriterion("is_simple_claim like", value, "isSimpleClaim");
            return (Criteria) this;
        }

        public Criteria andIsSimpleClaimNotLike(String value) {
            addCriterion("is_simple_claim not like", value, "isSimpleClaim");
            return (Criteria) this;
        }

        public Criteria andIsSimpleClaimIn(List<String> values) {
            addCriterion("is_simple_claim in", values, "isSimpleClaim");
            return (Criteria) this;
        }

        public Criteria andIsSimpleClaimNotIn(List<String> values) {
            addCriterion("is_simple_claim not in", values, "isSimpleClaim");
            return (Criteria) this;
        }

        public Criteria andIsSimpleClaimBetween(String value1, String value2) {
            addCriterion("is_simple_claim between", value1, value2, "isSimpleClaim");
            return (Criteria) this;
        }

        public Criteria andIsSimpleClaimNotBetween(String value1, String value2) {
            addCriterion("is_simple_claim not between", value1, value2, "isSimpleClaim");
            return (Criteria) this;
        }

        public Criteria andFirstSceneIndIsNull() {
            addCriterion("first_scene_ind is null");
            return (Criteria) this;
        }

        public Criteria andFirstSceneIndIsNotNull() {
            addCriterion("first_scene_ind is not null");
            return (Criteria) this;
        }

        public Criteria andFirstSceneIndEqualTo(String value) {
            addCriterion("first_scene_ind =", value, "firstSceneInd");
            return (Criteria) this;
        }

        public Criteria andFirstSceneIndNotEqualTo(String value) {
            addCriterion("first_scene_ind <>", value, "firstSceneInd");
            return (Criteria) this;
        }

        public Criteria andFirstSceneIndGreaterThan(String value) {
            addCriterion("first_scene_ind >", value, "firstSceneInd");
            return (Criteria) this;
        }

        public Criteria andFirstSceneIndGreaterThanOrEqualTo(String value) {
            addCriterion("first_scene_ind >=", value, "firstSceneInd");
            return (Criteria) this;
        }

        public Criteria andFirstSceneIndLessThan(String value) {
            addCriterion("first_scene_ind <", value, "firstSceneInd");
            return (Criteria) this;
        }

        public Criteria andFirstSceneIndLessThanOrEqualTo(String value) {
            addCriterion("first_scene_ind <=", value, "firstSceneInd");
            return (Criteria) this;
        }

        public Criteria andFirstSceneIndLike(String value) {
            addCriterion("first_scene_ind like", value, "firstSceneInd");
            return (Criteria) this;
        }

        public Criteria andFirstSceneIndNotLike(String value) {
            addCriterion("first_scene_ind not like", value, "firstSceneInd");
            return (Criteria) this;
        }

        public Criteria andFirstSceneIndIn(List<String> values) {
            addCriterion("first_scene_ind in", values, "firstSceneInd");
            return (Criteria) this;
        }

        public Criteria andFirstSceneIndNotIn(List<String> values) {
            addCriterion("first_scene_ind not in", values, "firstSceneInd");
            return (Criteria) this;
        }

        public Criteria andFirstSceneIndBetween(String value1, String value2) {
            addCriterion("first_scene_ind between", value1, value2, "firstSceneInd");
            return (Criteria) this;
        }

        public Criteria andFirstSceneIndNotBetween(String value1, String value2) {
            addCriterion("first_scene_ind not between", value1, value2, "firstSceneInd");
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

        public Criteria andEventReasonTypeIsNull() {
            addCriterion("event_reason_type is null");
            return (Criteria) this;
        }

        public Criteria andEventReasonTypeIsNotNull() {
            addCriterion("event_reason_type is not null");
            return (Criteria) this;
        }

        public Criteria andEventReasonTypeEqualTo(String value) {
            addCriterion("event_reason_type =", value, "eventReasonType");
            return (Criteria) this;
        }

        public Criteria andEventReasonTypeNotEqualTo(String value) {
            addCriterion("event_reason_type <>", value, "eventReasonType");
            return (Criteria) this;
        }

        public Criteria andEventReasonTypeGreaterThan(String value) {
            addCriterion("event_reason_type >", value, "eventReasonType");
            return (Criteria) this;
        }

        public Criteria andEventReasonTypeGreaterThanOrEqualTo(String value) {
            addCriterion("event_reason_type >=", value, "eventReasonType");
            return (Criteria) this;
        }

        public Criteria andEventReasonTypeLessThan(String value) {
            addCriterion("event_reason_type <", value, "eventReasonType");
            return (Criteria) this;
        }

        public Criteria andEventReasonTypeLessThanOrEqualTo(String value) {
            addCriterion("event_reason_type <=", value, "eventReasonType");
            return (Criteria) this;
        }

        public Criteria andEventReasonTypeLike(String value) {
            addCriterion("event_reason_type like", value, "eventReasonType");
            return (Criteria) this;
        }

        public Criteria andEventReasonTypeNotLike(String value) {
            addCriterion("event_reason_type not like", value, "eventReasonType");
            return (Criteria) this;
        }

        public Criteria andEventReasonTypeIn(List<String> values) {
            addCriterion("event_reason_type in", values, "eventReasonType");
            return (Criteria) this;
        }

        public Criteria andEventReasonTypeNotIn(List<String> values) {
            addCriterion("event_reason_type not in", values, "eventReasonType");
            return (Criteria) this;
        }

        public Criteria andEventReasonTypeBetween(String value1, String value2) {
            addCriterion("event_reason_type between", value1, value2, "eventReasonType");
            return (Criteria) this;
        }

        public Criteria andEventReasonTypeNotBetween(String value1, String value2) {
            addCriterion("event_reason_type not between", value1, value2, "eventReasonType");
            return (Criteria) this;
        }

        public Criteria andEventProcessModeIsNull() {
            addCriterion("event_process_mode is null");
            return (Criteria) this;
        }

        public Criteria andEventProcessModeIsNotNull() {
            addCriterion("event_process_mode is not null");
            return (Criteria) this;
        }

        public Criteria andEventProcessModeEqualTo(String value) {
            addCriterion("event_process_mode =", value, "eventProcessMode");
            return (Criteria) this;
        }

        public Criteria andEventProcessModeNotEqualTo(String value) {
            addCriterion("event_process_mode <>", value, "eventProcessMode");
            return (Criteria) this;
        }

        public Criteria andEventProcessModeGreaterThan(String value) {
            addCriterion("event_process_mode >", value, "eventProcessMode");
            return (Criteria) this;
        }

        public Criteria andEventProcessModeGreaterThanOrEqualTo(String value) {
            addCriterion("event_process_mode >=", value, "eventProcessMode");
            return (Criteria) this;
        }

        public Criteria andEventProcessModeLessThan(String value) {
            addCriterion("event_process_mode <", value, "eventProcessMode");
            return (Criteria) this;
        }

        public Criteria andEventProcessModeLessThanOrEqualTo(String value) {
            addCriterion("event_process_mode <=", value, "eventProcessMode");
            return (Criteria) this;
        }

        public Criteria andEventProcessModeLike(String value) {
            addCriterion("event_process_mode like", value, "eventProcessMode");
            return (Criteria) this;
        }

        public Criteria andEventProcessModeNotLike(String value) {
            addCriterion("event_process_mode not like", value, "eventProcessMode");
            return (Criteria) this;
        }

        public Criteria andEventProcessModeIn(List<String> values) {
            addCriterion("event_process_mode in", values, "eventProcessMode");
            return (Criteria) this;
        }

        public Criteria andEventProcessModeNotIn(List<String> values) {
            addCriterion("event_process_mode not in", values, "eventProcessMode");
            return (Criteria) this;
        }

        public Criteria andEventProcessModeBetween(String value1, String value2) {
            addCriterion("event_process_mode between", value1, value2, "eventProcessMode");
            return (Criteria) this;
        }

        public Criteria andEventProcessModeNotBetween(String value1, String value2) {
            addCriterion("event_process_mode not between", value1, value2, "eventProcessMode");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("contact_phone =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("contact_phone <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("contact_phone >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("contact_phone <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("contact_phone <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("contact_phone like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("contact_phone not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("contact_phone in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("contact_phone not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("contact_phone between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("contact_phone not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactTelIsNull() {
            addCriterion("contact_tel is null");
            return (Criteria) this;
        }

        public Criteria andContactTelIsNotNull() {
            addCriterion("contact_tel is not null");
            return (Criteria) this;
        }

        public Criteria andContactTelEqualTo(String value) {
            addCriterion("contact_tel =", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotEqualTo(String value) {
            addCriterion("contact_tel <>", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelGreaterThan(String value) {
            addCriterion("contact_tel >", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelGreaterThanOrEqualTo(String value) {
            addCriterion("contact_tel >=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLessThan(String value) {
            addCriterion("contact_tel <", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLessThanOrEqualTo(String value) {
            addCriterion("contact_tel <=", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelLike(String value) {
            addCriterion("contact_tel like", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotLike(String value) {
            addCriterion("contact_tel not like", value, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelIn(List<String> values) {
            addCriterion("contact_tel in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotIn(List<String> values) {
            addCriterion("contact_tel not in", values, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelBetween(String value1, String value2) {
            addCriterion("contact_tel between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactTelNotBetween(String value1, String value2) {
            addCriterion("contact_tel not between", value1, value2, "contactTel");
            return (Criteria) this;
        }

        public Criteria andContactPersonIsNull() {
            addCriterion("contact_person is null");
            return (Criteria) this;
        }

        public Criteria andContactPersonIsNotNull() {
            addCriterion("contact_person is not null");
            return (Criteria) this;
        }

        public Criteria andContactPersonEqualTo(String value) {
            addCriterion("contact_person =", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotEqualTo(String value) {
            addCriterion("contact_person <>", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonGreaterThan(String value) {
            addCriterion("contact_person >", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonGreaterThanOrEqualTo(String value) {
            addCriterion("contact_person >=", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLessThan(String value) {
            addCriterion("contact_person <", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLessThanOrEqualTo(String value) {
            addCriterion("contact_person <=", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLike(String value) {
            addCriterion("contact_person like", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotLike(String value) {
            addCriterion("contact_person not like", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonIn(List<String> values) {
            addCriterion("contact_person in", values, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotIn(List<String> values) {
            addCriterion("contact_person not in", values, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonBetween(String value1, String value2) {
            addCriterion("contact_person between", value1, value2, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotBetween(String value1, String value2) {
            addCriterion("contact_person not between", value1, value2, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIsNull() {
            addCriterion("customer_level is null");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIsNotNull() {
            addCriterion("customer_level is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelEqualTo(String value) {
            addCriterion("customer_level =", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotEqualTo(String value) {
            addCriterion("customer_level <>", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelGreaterThan(String value) {
            addCriterion("customer_level >", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelGreaterThanOrEqualTo(String value) {
            addCriterion("customer_level >=", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLessThan(String value) {
            addCriterion("customer_level <", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLessThanOrEqualTo(String value) {
            addCriterion("customer_level <=", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelLike(String value) {
            addCriterion("customer_level like", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotLike(String value) {
            addCriterion("customer_level not like", value, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelIn(List<String> values) {
            addCriterion("customer_level in", values, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotIn(List<String> values) {
            addCriterion("customer_level not in", values, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelBetween(String value1, String value2) {
            addCriterion("customer_level between", value1, value2, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andCustomerLevelNotBetween(String value1, String value2) {
            addCriterion("customer_level not between", value1, value2, "customerLevel");
            return (Criteria) this;
        }

        public Criteria andIsPoliceIsNull() {
            addCriterion("is_police is null");
            return (Criteria) this;
        }

        public Criteria andIsPoliceIsNotNull() {
            addCriterion("is_police is not null");
            return (Criteria) this;
        }

        public Criteria andIsPoliceEqualTo(String value) {
            addCriterion("is_police =", value, "isPolice");
            return (Criteria) this;
        }

        public Criteria andIsPoliceNotEqualTo(String value) {
            addCriterion("is_police <>", value, "isPolice");
            return (Criteria) this;
        }

        public Criteria andIsPoliceGreaterThan(String value) {
            addCriterion("is_police >", value, "isPolice");
            return (Criteria) this;
        }

        public Criteria andIsPoliceGreaterThanOrEqualTo(String value) {
            addCriterion("is_police >=", value, "isPolice");
            return (Criteria) this;
        }

        public Criteria andIsPoliceLessThan(String value) {
            addCriterion("is_police <", value, "isPolice");
            return (Criteria) this;
        }

        public Criteria andIsPoliceLessThanOrEqualTo(String value) {
            addCriterion("is_police <=", value, "isPolice");
            return (Criteria) this;
        }

        public Criteria andIsPoliceLike(String value) {
            addCriterion("is_police like", value, "isPolice");
            return (Criteria) this;
        }

        public Criteria andIsPoliceNotLike(String value) {
            addCriterion("is_police not like", value, "isPolice");
            return (Criteria) this;
        }

        public Criteria andIsPoliceIn(List<String> values) {
            addCriterion("is_police in", values, "isPolice");
            return (Criteria) this;
        }

        public Criteria andIsPoliceNotIn(List<String> values) {
            addCriterion("is_police not in", values, "isPolice");
            return (Criteria) this;
        }

        public Criteria andIsPoliceBetween(String value1, String value2) {
            addCriterion("is_police between", value1, value2, "isPolice");
            return (Criteria) this;
        }

        public Criteria andIsPoliceNotBetween(String value1, String value2) {
            addCriterion("is_police not between", value1, value2, "isPolice");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNull() {
            addCriterion("driver_name is null");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNotNull() {
            addCriterion("driver_name is not null");
            return (Criteria) this;
        }

        public Criteria andDriverNameEqualTo(String value) {
            addCriterion("driver_name =", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotEqualTo(String value) {
            addCriterion("driver_name <>", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThan(String value) {
            addCriterion("driver_name >", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThanOrEqualTo(String value) {
            addCriterion("driver_name >=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThan(String value) {
            addCriterion("driver_name <", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThanOrEqualTo(String value) {
            addCriterion("driver_name <=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLike(String value) {
            addCriterion("driver_name like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotLike(String value) {
            addCriterion("driver_name not like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameIn(List<String> values) {
            addCriterion("driver_name in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotIn(List<String> values) {
            addCriterion("driver_name not in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameBetween(String value1, String value2) {
            addCriterion("driver_name between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotBetween(String value1, String value2) {
            addCriterion("driver_name not between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverGenderIsNull() {
            addCriterion("driver_gender is null");
            return (Criteria) this;
        }

        public Criteria andDriverGenderIsNotNull() {
            addCriterion("driver_gender is not null");
            return (Criteria) this;
        }

        public Criteria andDriverGenderEqualTo(String value) {
            addCriterion("driver_gender =", value, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderNotEqualTo(String value) {
            addCriterion("driver_gender <>", value, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderGreaterThan(String value) {
            addCriterion("driver_gender >", value, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderGreaterThanOrEqualTo(String value) {
            addCriterion("driver_gender >=", value, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderLessThan(String value) {
            addCriterion("driver_gender <", value, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderLessThanOrEqualTo(String value) {
            addCriterion("driver_gender <=", value, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderLike(String value) {
            addCriterion("driver_gender like", value, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderNotLike(String value) {
            addCriterion("driver_gender not like", value, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderIn(List<String> values) {
            addCriterion("driver_gender in", values, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderNotIn(List<String> values) {
            addCriterion("driver_gender not in", values, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderBetween(String value1, String value2) {
            addCriterion("driver_gender between", value1, value2, "driverGender");
            return (Criteria) this;
        }

        public Criteria andDriverGenderNotBetween(String value1, String value2) {
            addCriterion("driver_gender not between", value1, value2, "driverGender");
            return (Criteria) this;
        }

        public Criteria andIsMutualCollisionSelfCompensationIsNull() {
            addCriterion("is_mutual_collision_self_compensation is null");
            return (Criteria) this;
        }

        public Criteria andIsMutualCollisionSelfCompensationIsNotNull() {
            addCriterion("is_mutual_collision_self_compensation is not null");
            return (Criteria) this;
        }

        public Criteria andIsMutualCollisionSelfCompensationEqualTo(String value) {
            addCriterion("is_mutual_collision_self_compensation =", value, "isMutualCollisionSelfCompensation");
            return (Criteria) this;
        }

        public Criteria andIsMutualCollisionSelfCompensationNotEqualTo(String value) {
            addCriterion("is_mutual_collision_self_compensation <>", value, "isMutualCollisionSelfCompensation");
            return (Criteria) this;
        }

        public Criteria andIsMutualCollisionSelfCompensationGreaterThan(String value) {
            addCriterion("is_mutual_collision_self_compensation >", value, "isMutualCollisionSelfCompensation");
            return (Criteria) this;
        }

        public Criteria andIsMutualCollisionSelfCompensationGreaterThanOrEqualTo(String value) {
            addCriterion("is_mutual_collision_self_compensation >=", value, "isMutualCollisionSelfCompensation");
            return (Criteria) this;
        }

        public Criteria andIsMutualCollisionSelfCompensationLessThan(String value) {
            addCriterion("is_mutual_collision_self_compensation <", value, "isMutualCollisionSelfCompensation");
            return (Criteria) this;
        }

        public Criteria andIsMutualCollisionSelfCompensationLessThanOrEqualTo(String value) {
            addCriterion("is_mutual_collision_self_compensation <=", value, "isMutualCollisionSelfCompensation");
            return (Criteria) this;
        }

        public Criteria andIsMutualCollisionSelfCompensationLike(String value) {
            addCriterion("is_mutual_collision_self_compensation like", value, "isMutualCollisionSelfCompensation");
            return (Criteria) this;
        }

        public Criteria andIsMutualCollisionSelfCompensationNotLike(String value) {
            addCriterion("is_mutual_collision_self_compensation not like", value, "isMutualCollisionSelfCompensation");
            return (Criteria) this;
        }

        public Criteria andIsMutualCollisionSelfCompensationIn(List<String> values) {
            addCriterion("is_mutual_collision_self_compensation in", values, "isMutualCollisionSelfCompensation");
            return (Criteria) this;
        }

        public Criteria andIsMutualCollisionSelfCompensationNotIn(List<String> values) {
            addCriterion("is_mutual_collision_self_compensation not in", values, "isMutualCollisionSelfCompensation");
            return (Criteria) this;
        }

        public Criteria andIsMutualCollisionSelfCompensationBetween(String value1, String value2) {
            addCriterion("is_mutual_collision_self_compensation between", value1, value2, "isMutualCollisionSelfCompensation");
            return (Criteria) this;
        }

        public Criteria andIsMutualCollisionSelfCompensationNotBetween(String value1, String value2) {
            addCriterion("is_mutual_collision_self_compensation not between", value1, value2, "isMutualCollisionSelfCompensation");
            return (Criteria) this;
        }

        public Criteria andEventAddressTypeIsNull() {
            addCriterion("event_address_type is null");
            return (Criteria) this;
        }

        public Criteria andEventAddressTypeIsNotNull() {
            addCriterion("event_address_type is not null");
            return (Criteria) this;
        }

        public Criteria andEventAddressTypeEqualTo(String value) {
            addCriterion("event_address_type =", value, "eventAddressType");
            return (Criteria) this;
        }

        public Criteria andEventAddressTypeNotEqualTo(String value) {
            addCriterion("event_address_type <>", value, "eventAddressType");
            return (Criteria) this;
        }

        public Criteria andEventAddressTypeGreaterThan(String value) {
            addCriterion("event_address_type >", value, "eventAddressType");
            return (Criteria) this;
        }

        public Criteria andEventAddressTypeGreaterThanOrEqualTo(String value) {
            addCriterion("event_address_type >=", value, "eventAddressType");
            return (Criteria) this;
        }

        public Criteria andEventAddressTypeLessThan(String value) {
            addCriterion("event_address_type <", value, "eventAddressType");
            return (Criteria) this;
        }

        public Criteria andEventAddressTypeLessThanOrEqualTo(String value) {
            addCriterion("event_address_type <=", value, "eventAddressType");
            return (Criteria) this;
        }

        public Criteria andEventAddressTypeLike(String value) {
            addCriterion("event_address_type like", value, "eventAddressType");
            return (Criteria) this;
        }

        public Criteria andEventAddressTypeNotLike(String value) {
            addCriterion("event_address_type not like", value, "eventAddressType");
            return (Criteria) this;
        }

        public Criteria andEventAddressTypeIn(List<String> values) {
            addCriterion("event_address_type in", values, "eventAddressType");
            return (Criteria) this;
        }

        public Criteria andEventAddressTypeNotIn(List<String> values) {
            addCriterion("event_address_type not in", values, "eventAddressType");
            return (Criteria) this;
        }

        public Criteria andEventAddressTypeBetween(String value1, String value2) {
            addCriterion("event_address_type between", value1, value2, "eventAddressType");
            return (Criteria) this;
        }

        public Criteria andEventAddressTypeNotBetween(String value1, String value2) {
            addCriterion("event_address_type not between", value1, value2, "eventAddressType");
            return (Criteria) this;
        }

        public Criteria andDangerCauseIsNull() {
            addCriterion("danger_cause is null");
            return (Criteria) this;
        }

        public Criteria andDangerCauseIsNotNull() {
            addCriterion("danger_cause is not null");
            return (Criteria) this;
        }

        public Criteria andDangerCauseEqualTo(String value) {
            addCriterion("danger_cause =", value, "dangerCause");
            return (Criteria) this;
        }

        public Criteria andDangerCauseNotEqualTo(String value) {
            addCriterion("danger_cause <>", value, "dangerCause");
            return (Criteria) this;
        }

        public Criteria andDangerCauseGreaterThan(String value) {
            addCriterion("danger_cause >", value, "dangerCause");
            return (Criteria) this;
        }

        public Criteria andDangerCauseGreaterThanOrEqualTo(String value) {
            addCriterion("danger_cause >=", value, "dangerCause");
            return (Criteria) this;
        }

        public Criteria andDangerCauseLessThan(String value) {
            addCriterion("danger_cause <", value, "dangerCause");
            return (Criteria) this;
        }

        public Criteria andDangerCauseLessThanOrEqualTo(String value) {
            addCriterion("danger_cause <=", value, "dangerCause");
            return (Criteria) this;
        }

        public Criteria andDangerCauseLike(String value) {
            addCriterion("danger_cause like", value, "dangerCause");
            return (Criteria) this;
        }

        public Criteria andDangerCauseNotLike(String value) {
            addCriterion("danger_cause not like", value, "dangerCause");
            return (Criteria) this;
        }

        public Criteria andDangerCauseIn(List<String> values) {
            addCriterion("danger_cause in", values, "dangerCause");
            return (Criteria) this;
        }

        public Criteria andDangerCauseNotIn(List<String> values) {
            addCriterion("danger_cause not in", values, "dangerCause");
            return (Criteria) this;
        }

        public Criteria andDangerCauseBetween(String value1, String value2) {
            addCriterion("danger_cause between", value1, value2, "dangerCause");
            return (Criteria) this;
        }

        public Criteria andDangerCauseNotBetween(String value1, String value2) {
            addCriterion("danger_cause not between", value1, value2, "dangerCause");
            return (Criteria) this;
        }

        public Criteria andDangerAddressIsNull() {
            addCriterion("danger_address is null");
            return (Criteria) this;
        }

        public Criteria andDangerAddressIsNotNull() {
            addCriterion("danger_address is not null");
            return (Criteria) this;
        }

        public Criteria andDangerAddressEqualTo(String value) {
            addCriterion("danger_address =", value, "dangerAddress");
            return (Criteria) this;
        }

        public Criteria andDangerAddressNotEqualTo(String value) {
            addCriterion("danger_address <>", value, "dangerAddress");
            return (Criteria) this;
        }

        public Criteria andDangerAddressGreaterThan(String value) {
            addCriterion("danger_address >", value, "dangerAddress");
            return (Criteria) this;
        }

        public Criteria andDangerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("danger_address >=", value, "dangerAddress");
            return (Criteria) this;
        }

        public Criteria andDangerAddressLessThan(String value) {
            addCriterion("danger_address <", value, "dangerAddress");
            return (Criteria) this;
        }

        public Criteria andDangerAddressLessThanOrEqualTo(String value) {
            addCriterion("danger_address <=", value, "dangerAddress");
            return (Criteria) this;
        }

        public Criteria andDangerAddressLike(String value) {
            addCriterion("danger_address like", value, "dangerAddress");
            return (Criteria) this;
        }

        public Criteria andDangerAddressNotLike(String value) {
            addCriterion("danger_address not like", value, "dangerAddress");
            return (Criteria) this;
        }

        public Criteria andDangerAddressIn(List<String> values) {
            addCriterion("danger_address in", values, "dangerAddress");
            return (Criteria) this;
        }

        public Criteria andDangerAddressNotIn(List<String> values) {
            addCriterion("danger_address not in", values, "dangerAddress");
            return (Criteria) this;
        }

        public Criteria andDangerAddressBetween(String value1, String value2) {
            addCriterion("danger_address between", value1, value2, "dangerAddress");
            return (Criteria) this;
        }

        public Criteria andDangerAddressNotBetween(String value1, String value2) {
            addCriterion("danger_address not between", value1, value2, "dangerAddress");
            return (Criteria) this;
        }

        public Criteria andDangerTimeIsNull() {
            addCriterion("danger_time is null");
            return (Criteria) this;
        }

        public Criteria andDangerTimeIsNotNull() {
            addCriterion("danger_time is not null");
            return (Criteria) this;
        }

        public Criteria andDangerTimeEqualTo(Date value) {
            addCriterion("danger_time =", value, "dangerTime");
            return (Criteria) this;
        }

        public Criteria andDangerTimeNotEqualTo(Date value) {
            addCriterion("danger_time <>", value, "dangerTime");
            return (Criteria) this;
        }

        public Criteria andDangerTimeGreaterThan(Date value) {
            addCriterion("danger_time >", value, "dangerTime");
            return (Criteria) this;
        }

        public Criteria andDangerTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("danger_time >=", value, "dangerTime");
            return (Criteria) this;
        }

        public Criteria andDangerTimeLessThan(Date value) {
            addCriterion("danger_time <", value, "dangerTime");
            return (Criteria) this;
        }

        public Criteria andDangerTimeLessThanOrEqualTo(Date value) {
            addCriterion("danger_time <=", value, "dangerTime");
            return (Criteria) this;
        }

        public Criteria andDangerTimeIn(List<Date> values) {
            addCriterion("danger_time in", values, "dangerTime");
            return (Criteria) this;
        }

        public Criteria andDangerTimeNotIn(List<Date> values) {
            addCriterion("danger_time not in", values, "dangerTime");
            return (Criteria) this;
        }

        public Criteria andDangerTimeBetween(Date value1, Date value2) {
            addCriterion("danger_time between", value1, value2, "dangerTime");
            return (Criteria) this;
        }

        public Criteria andDangerTimeNotBetween(Date value1, Date value2) {
            addCriterion("danger_time not between", value1, value2, "dangerTime");
            return (Criteria) this;
        }

        public Criteria andDangerAreaIsNull() {
            addCriterion("danger_area is null");
            return (Criteria) this;
        }

        public Criteria andDangerAreaIsNotNull() {
            addCriterion("danger_area is not null");
            return (Criteria) this;
        }

        public Criteria andDangerAreaEqualTo(String value) {
            addCriterion("danger_area =", value, "dangerArea");
            return (Criteria) this;
        }

        public Criteria andDangerAreaNotEqualTo(String value) {
            addCriterion("danger_area <>", value, "dangerArea");
            return (Criteria) this;
        }

        public Criteria andDangerAreaGreaterThan(String value) {
            addCriterion("danger_area >", value, "dangerArea");
            return (Criteria) this;
        }

        public Criteria andDangerAreaGreaterThanOrEqualTo(String value) {
            addCriterion("danger_area >=", value, "dangerArea");
            return (Criteria) this;
        }

        public Criteria andDangerAreaLessThan(String value) {
            addCriterion("danger_area <", value, "dangerArea");
            return (Criteria) this;
        }

        public Criteria andDangerAreaLessThanOrEqualTo(String value) {
            addCriterion("danger_area <=", value, "dangerArea");
            return (Criteria) this;
        }

        public Criteria andDangerAreaLike(String value) {
            addCriterion("danger_area like", value, "dangerArea");
            return (Criteria) this;
        }

        public Criteria andDangerAreaNotLike(String value) {
            addCriterion("danger_area not like", value, "dangerArea");
            return (Criteria) this;
        }

        public Criteria andDangerAreaIn(List<String> values) {
            addCriterion("danger_area in", values, "dangerArea");
            return (Criteria) this;
        }

        public Criteria andDangerAreaNotIn(List<String> values) {
            addCriterion("danger_area not in", values, "dangerArea");
            return (Criteria) this;
        }

        public Criteria andDangerAreaBetween(String value1, String value2) {
            addCriterion("danger_area between", value1, value2, "dangerArea");
            return (Criteria) this;
        }

        public Criteria andDangerAreaNotBetween(String value1, String value2) {
            addCriterion("danger_area not between", value1, value2, "dangerArea");
            return (Criteria) this;
        }

        public Criteria andDangerDescIsNull() {
            addCriterion("danger_desc is null");
            return (Criteria) this;
        }

        public Criteria andDangerDescIsNotNull() {
            addCriterion("danger_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDangerDescEqualTo(String value) {
            addCriterion("danger_desc =", value, "dangerDesc");
            return (Criteria) this;
        }

        public Criteria andDangerDescNotEqualTo(String value) {
            addCriterion("danger_desc <>", value, "dangerDesc");
            return (Criteria) this;
        }

        public Criteria andDangerDescGreaterThan(String value) {
            addCriterion("danger_desc >", value, "dangerDesc");
            return (Criteria) this;
        }

        public Criteria andDangerDescGreaterThanOrEqualTo(String value) {
            addCriterion("danger_desc >=", value, "dangerDesc");
            return (Criteria) this;
        }

        public Criteria andDangerDescLessThan(String value) {
            addCriterion("danger_desc <", value, "dangerDesc");
            return (Criteria) this;
        }

        public Criteria andDangerDescLessThanOrEqualTo(String value) {
            addCriterion("danger_desc <=", value, "dangerDesc");
            return (Criteria) this;
        }

        public Criteria andDangerDescLike(String value) {
            addCriterion("danger_desc like", value, "dangerDesc");
            return (Criteria) this;
        }

        public Criteria andDangerDescNotLike(String value) {
            addCriterion("danger_desc not like", value, "dangerDesc");
            return (Criteria) this;
        }

        public Criteria andDangerDescIn(List<String> values) {
            addCriterion("danger_desc in", values, "dangerDesc");
            return (Criteria) this;
        }

        public Criteria andDangerDescNotIn(List<String> values) {
            addCriterion("danger_desc not in", values, "dangerDesc");
            return (Criteria) this;
        }

        public Criteria andDangerDescBetween(String value1, String value2) {
            addCriterion("danger_desc between", value1, value2, "dangerDesc");
            return (Criteria) this;
        }

        public Criteria andDangerDescNotBetween(String value1, String value2) {
            addCriterion("danger_desc not between", value1, value2, "dangerDesc");
            return (Criteria) this;
        }

        public Criteria andDangerAddressTypeIsNull() {
            addCriterion("danger_address_type is null");
            return (Criteria) this;
        }

        public Criteria andDangerAddressTypeIsNotNull() {
            addCriterion("danger_address_type is not null");
            return (Criteria) this;
        }

        public Criteria andDangerAddressTypeEqualTo(String value) {
            addCriterion("danger_address_type =", value, "dangerAddressType");
            return (Criteria) this;
        }

        public Criteria andDangerAddressTypeNotEqualTo(String value) {
            addCriterion("danger_address_type <>", value, "dangerAddressType");
            return (Criteria) this;
        }

        public Criteria andDangerAddressTypeGreaterThan(String value) {
            addCriterion("danger_address_type >", value, "dangerAddressType");
            return (Criteria) this;
        }

        public Criteria andDangerAddressTypeGreaterThanOrEqualTo(String value) {
            addCriterion("danger_address_type >=", value, "dangerAddressType");
            return (Criteria) this;
        }

        public Criteria andDangerAddressTypeLessThan(String value) {
            addCriterion("danger_address_type <", value, "dangerAddressType");
            return (Criteria) this;
        }

        public Criteria andDangerAddressTypeLessThanOrEqualTo(String value) {
            addCriterion("danger_address_type <=", value, "dangerAddressType");
            return (Criteria) this;
        }

        public Criteria andDangerAddressTypeLike(String value) {
            addCriterion("danger_address_type like", value, "dangerAddressType");
            return (Criteria) this;
        }

        public Criteria andDangerAddressTypeNotLike(String value) {
            addCriterion("danger_address_type not like", value, "dangerAddressType");
            return (Criteria) this;
        }

        public Criteria andDangerAddressTypeIn(List<String> values) {
            addCriterion("danger_address_type in", values, "dangerAddressType");
            return (Criteria) this;
        }

        public Criteria andDangerAddressTypeNotIn(List<String> values) {
            addCriterion("danger_address_type not in", values, "dangerAddressType");
            return (Criteria) this;
        }

        public Criteria andDangerAddressTypeBetween(String value1, String value2) {
            addCriterion("danger_address_type between", value1, value2, "dangerAddressType");
            return (Criteria) this;
        }

        public Criteria andDangerAddressTypeNotBetween(String value1, String value2) {
            addCriterion("danger_address_type not between", value1, value2, "dangerAddressType");
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

        public Criteria andReportTypeIsNull() {
            addCriterion("report_type is null");
            return (Criteria) this;
        }

        public Criteria andReportTypeIsNotNull() {
            addCriterion("report_type is not null");
            return (Criteria) this;
        }

        public Criteria andReportTypeEqualTo(String value) {
            addCriterion("report_type =", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotEqualTo(String value) {
            addCriterion("report_type <>", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeGreaterThan(String value) {
            addCriterion("report_type >", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeGreaterThanOrEqualTo(String value) {
            addCriterion("report_type >=", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLessThan(String value) {
            addCriterion("report_type <", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLessThanOrEqualTo(String value) {
            addCriterion("report_type <=", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeLike(String value) {
            addCriterion("report_type like", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotLike(String value) {
            addCriterion("report_type not like", value, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeIn(List<String> values) {
            addCriterion("report_type in", values, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotIn(List<String> values) {
            addCriterion("report_type not in", values, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeBetween(String value1, String value2) {
            addCriterion("report_type between", value1, value2, "reportType");
            return (Criteria) this;
        }

        public Criteria andReportTypeNotBetween(String value1, String value2) {
            addCriterion("report_type not between", value1, value2, "reportType");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeIsNull() {
            addCriterion("notification_time is null");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeIsNotNull() {
            addCriterion("notification_time is not null");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeEqualTo(Date value) {
            addCriterion("notification_time =", value, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeNotEqualTo(Date value) {
            addCriterion("notification_time <>", value, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeGreaterThan(Date value) {
            addCriterion("notification_time >", value, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("notification_time >=", value, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeLessThan(Date value) {
            addCriterion("notification_time <", value, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeLessThanOrEqualTo(Date value) {
            addCriterion("notification_time <=", value, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeIn(List<Date> values) {
            addCriterion("notification_time in", values, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeNotIn(List<Date> values) {
            addCriterion("notification_time not in", values, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeBetween(Date value1, Date value2) {
            addCriterion("notification_time between", value1, value2, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andNotificationTimeNotBetween(Date value1, Date value2) {
            addCriterion("notification_time not between", value1, value2, "notificationTime");
            return (Criteria) this;
        }

        public Criteria andReporterIsNull() {
            addCriterion("reporter is null");
            return (Criteria) this;
        }

        public Criteria andReporterIsNotNull() {
            addCriterion("reporter is not null");
            return (Criteria) this;
        }

        public Criteria andReporterEqualTo(String value) {
            addCriterion("reporter =", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotEqualTo(String value) {
            addCriterion("reporter <>", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterGreaterThan(String value) {
            addCriterion("reporter >", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterGreaterThanOrEqualTo(String value) {
            addCriterion("reporter >=", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLessThan(String value) {
            addCriterion("reporter <", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLessThanOrEqualTo(String value) {
            addCriterion("reporter <=", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterLike(String value) {
            addCriterion("reporter like", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotLike(String value) {
            addCriterion("reporter not like", value, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterIn(List<String> values) {
            addCriterion("reporter in", values, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotIn(List<String> values) {
            addCriterion("reporter not in", values, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterBetween(String value1, String value2) {
            addCriterion("reporter between", value1, value2, "reporter");
            return (Criteria) this;
        }

        public Criteria andReporterNotBetween(String value1, String value2) {
            addCriterion("reporter not between", value1, value2, "reporter");
            return (Criteria) this;
        }

        public Criteria andInformantMobilTelIsNull() {
            addCriterion("informant_mobil_tel is null");
            return (Criteria) this;
        }

        public Criteria andInformantMobilTelIsNotNull() {
            addCriterion("informant_mobil_tel is not null");
            return (Criteria) this;
        }

        public Criteria andInformantMobilTelEqualTo(String value) {
            addCriterion("informant_mobil_tel =", value, "informantMobilTel");
            return (Criteria) this;
        }

        public Criteria andInformantMobilTelNotEqualTo(String value) {
            addCriterion("informant_mobil_tel <>", value, "informantMobilTel");
            return (Criteria) this;
        }

        public Criteria andInformantMobilTelGreaterThan(String value) {
            addCriterion("informant_mobil_tel >", value, "informantMobilTel");
            return (Criteria) this;
        }

        public Criteria andInformantMobilTelGreaterThanOrEqualTo(String value) {
            addCriterion("informant_mobil_tel >=", value, "informantMobilTel");
            return (Criteria) this;
        }

        public Criteria andInformantMobilTelLessThan(String value) {
            addCriterion("informant_mobil_tel <", value, "informantMobilTel");
            return (Criteria) this;
        }

        public Criteria andInformantMobilTelLessThanOrEqualTo(String value) {
            addCriterion("informant_mobil_tel <=", value, "informantMobilTel");
            return (Criteria) this;
        }

        public Criteria andInformantMobilTelLike(String value) {
            addCriterion("informant_mobil_tel like", value, "informantMobilTel");
            return (Criteria) this;
        }

        public Criteria andInformantMobilTelNotLike(String value) {
            addCriterion("informant_mobil_tel not like", value, "informantMobilTel");
            return (Criteria) this;
        }

        public Criteria andInformantMobilTelIn(List<String> values) {
            addCriterion("informant_mobil_tel in", values, "informantMobilTel");
            return (Criteria) this;
        }

        public Criteria andInformantMobilTelNotIn(List<String> values) {
            addCriterion("informant_mobil_tel not in", values, "informantMobilTel");
            return (Criteria) this;
        }

        public Criteria andInformantMobilTelBetween(String value1, String value2) {
            addCriterion("informant_mobil_tel between", value1, value2, "informantMobilTel");
            return (Criteria) this;
        }

        public Criteria andInformantMobilTelNotBetween(String value1, String value2) {
            addCriterion("informant_mobil_tel not between", value1, value2, "informantMobilTel");
            return (Criteria) this;
        }

        public Criteria andInformantIsDriverIsNull() {
            addCriterion("informant_is_driver is null");
            return (Criteria) this;
        }

        public Criteria andInformantIsDriverIsNotNull() {
            addCriterion("informant_is_driver is not null");
            return (Criteria) this;
        }

        public Criteria andInformantIsDriverEqualTo(String value) {
            addCriterion("informant_is_driver =", value, "informantIsDriver");
            return (Criteria) this;
        }

        public Criteria andInformantIsDriverNotEqualTo(String value) {
            addCriterion("informant_is_driver <>", value, "informantIsDriver");
            return (Criteria) this;
        }

        public Criteria andInformantIsDriverGreaterThan(String value) {
            addCriterion("informant_is_driver >", value, "informantIsDriver");
            return (Criteria) this;
        }

        public Criteria andInformantIsDriverGreaterThanOrEqualTo(String value) {
            addCriterion("informant_is_driver >=", value, "informantIsDriver");
            return (Criteria) this;
        }

        public Criteria andInformantIsDriverLessThan(String value) {
            addCriterion("informant_is_driver <", value, "informantIsDriver");
            return (Criteria) this;
        }

        public Criteria andInformantIsDriverLessThanOrEqualTo(String value) {
            addCriterion("informant_is_driver <=", value, "informantIsDriver");
            return (Criteria) this;
        }

        public Criteria andInformantIsDriverLike(String value) {
            addCriterion("informant_is_driver like", value, "informantIsDriver");
            return (Criteria) this;
        }

        public Criteria andInformantIsDriverNotLike(String value) {
            addCriterion("informant_is_driver not like", value, "informantIsDriver");
            return (Criteria) this;
        }

        public Criteria andInformantIsDriverIn(List<String> values) {
            addCriterion("informant_is_driver in", values, "informantIsDriver");
            return (Criteria) this;
        }

        public Criteria andInformantIsDriverNotIn(List<String> values) {
            addCriterion("informant_is_driver not in", values, "informantIsDriver");
            return (Criteria) this;
        }

        public Criteria andInformantIsDriverBetween(String value1, String value2) {
            addCriterion("informant_is_driver between", value1, value2, "informantIsDriver");
            return (Criteria) this;
        }

        public Criteria andInformantIsDriverNotBetween(String value1, String value2) {
            addCriterion("informant_is_driver not between", value1, value2, "informantIsDriver");
            return (Criteria) this;
        }

        public Criteria andInformantIsNsuredIsNull() {
            addCriterion("informant_is_nsured is null");
            return (Criteria) this;
        }

        public Criteria andInformantIsNsuredIsNotNull() {
            addCriterion("informant_is_nsured is not null");
            return (Criteria) this;
        }

        public Criteria andInformantIsNsuredEqualTo(String value) {
            addCriterion("informant_is_nsured =", value, "informantIsNsured");
            return (Criteria) this;
        }

        public Criteria andInformantIsNsuredNotEqualTo(String value) {
            addCriterion("informant_is_nsured <>", value, "informantIsNsured");
            return (Criteria) this;
        }

        public Criteria andInformantIsNsuredGreaterThan(String value) {
            addCriterion("informant_is_nsured >", value, "informantIsNsured");
            return (Criteria) this;
        }

        public Criteria andInformantIsNsuredGreaterThanOrEqualTo(String value) {
            addCriterion("informant_is_nsured >=", value, "informantIsNsured");
            return (Criteria) this;
        }

        public Criteria andInformantIsNsuredLessThan(String value) {
            addCriterion("informant_is_nsured <", value, "informantIsNsured");
            return (Criteria) this;
        }

        public Criteria andInformantIsNsuredLessThanOrEqualTo(String value) {
            addCriterion("informant_is_nsured <=", value, "informantIsNsured");
            return (Criteria) this;
        }

        public Criteria andInformantIsNsuredLike(String value) {
            addCriterion("informant_is_nsured like", value, "informantIsNsured");
            return (Criteria) this;
        }

        public Criteria andInformantIsNsuredNotLike(String value) {
            addCriterion("informant_is_nsured not like", value, "informantIsNsured");
            return (Criteria) this;
        }

        public Criteria andInformantIsNsuredIn(List<String> values) {
            addCriterion("informant_is_nsured in", values, "informantIsNsured");
            return (Criteria) this;
        }

        public Criteria andInformantIsNsuredNotIn(List<String> values) {
            addCriterion("informant_is_nsured not in", values, "informantIsNsured");
            return (Criteria) this;
        }

        public Criteria andInformantIsNsuredBetween(String value1, String value2) {
            addCriterion("informant_is_nsured between", value1, value2, "informantIsNsured");
            return (Criteria) this;
        }

        public Criteria andInformantIsNsuredNotBetween(String value1, String value2) {
            addCriterion("informant_is_nsured not between", value1, value2, "informantIsNsured");
            return (Criteria) this;
        }

        public Criteria andInformantIdentityIsNull() {
            addCriterion("informant_identity is null");
            return (Criteria) this;
        }

        public Criteria andInformantIdentityIsNotNull() {
            addCriterion("informant_identity is not null");
            return (Criteria) this;
        }

        public Criteria andInformantIdentityEqualTo(String value) {
            addCriterion("informant_identity =", value, "informantIdentity");
            return (Criteria) this;
        }

        public Criteria andInformantIdentityNotEqualTo(String value) {
            addCriterion("informant_identity <>", value, "informantIdentity");
            return (Criteria) this;
        }

        public Criteria andInformantIdentityGreaterThan(String value) {
            addCriterion("informant_identity >", value, "informantIdentity");
            return (Criteria) this;
        }

        public Criteria andInformantIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("informant_identity >=", value, "informantIdentity");
            return (Criteria) this;
        }

        public Criteria andInformantIdentityLessThan(String value) {
            addCriterion("informant_identity <", value, "informantIdentity");
            return (Criteria) this;
        }

        public Criteria andInformantIdentityLessThanOrEqualTo(String value) {
            addCriterion("informant_identity <=", value, "informantIdentity");
            return (Criteria) this;
        }

        public Criteria andInformantIdentityLike(String value) {
            addCriterion("informant_identity like", value, "informantIdentity");
            return (Criteria) this;
        }

        public Criteria andInformantIdentityNotLike(String value) {
            addCriterion("informant_identity not like", value, "informantIdentity");
            return (Criteria) this;
        }

        public Criteria andInformantIdentityIn(List<String> values) {
            addCriterion("informant_identity in", values, "informantIdentity");
            return (Criteria) this;
        }

        public Criteria andInformantIdentityNotIn(List<String> values) {
            addCriterion("informant_identity not in", values, "informantIdentity");
            return (Criteria) this;
        }

        public Criteria andInformantIdentityBetween(String value1, String value2) {
            addCriterion("informant_identity between", value1, value2, "informantIdentity");
            return (Criteria) this;
        }

        public Criteria andInformantIdentityNotBetween(String value1, String value2) {
            addCriterion("informant_identity not between", value1, value2, "informantIdentity");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneIsNull() {
            addCriterion("reporter_phone is null");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneIsNotNull() {
            addCriterion("reporter_phone is not null");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneEqualTo(String value) {
            addCriterion("reporter_phone =", value, "reporterPhone");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneNotEqualTo(String value) {
            addCriterion("reporter_phone <>", value, "reporterPhone");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneGreaterThan(String value) {
            addCriterion("reporter_phone >", value, "reporterPhone");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("reporter_phone >=", value, "reporterPhone");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneLessThan(String value) {
            addCriterion("reporter_phone <", value, "reporterPhone");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneLessThanOrEqualTo(String value) {
            addCriterion("reporter_phone <=", value, "reporterPhone");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneLike(String value) {
            addCriterion("reporter_phone like", value, "reporterPhone");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneNotLike(String value) {
            addCriterion("reporter_phone not like", value, "reporterPhone");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneIn(List<String> values) {
            addCriterion("reporter_phone in", values, "reporterPhone");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneNotIn(List<String> values) {
            addCriterion("reporter_phone not in", values, "reporterPhone");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneBetween(String value1, String value2) {
            addCriterion("reporter_phone between", value1, value2, "reporterPhone");
            return (Criteria) this;
        }

        public Criteria andReporterPhoneNotBetween(String value1, String value2) {
            addCriterion("reporter_phone not between", value1, value2, "reporterPhone");
            return (Criteria) this;
        }

        public Criteria andReportProvinceIsNull() {
            addCriterion("report_province is null");
            return (Criteria) this;
        }

        public Criteria andReportProvinceIsNotNull() {
            addCriterion("report_province is not null");
            return (Criteria) this;
        }

        public Criteria andReportProvinceEqualTo(String value) {
            addCriterion("report_province =", value, "reportProvince");
            return (Criteria) this;
        }

        public Criteria andReportProvinceNotEqualTo(String value) {
            addCriterion("report_province <>", value, "reportProvince");
            return (Criteria) this;
        }

        public Criteria andReportProvinceGreaterThan(String value) {
            addCriterion("report_province >", value, "reportProvince");
            return (Criteria) this;
        }

        public Criteria andReportProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("report_province >=", value, "reportProvince");
            return (Criteria) this;
        }

        public Criteria andReportProvinceLessThan(String value) {
            addCriterion("report_province <", value, "reportProvince");
            return (Criteria) this;
        }

        public Criteria andReportProvinceLessThanOrEqualTo(String value) {
            addCriterion("report_province <=", value, "reportProvince");
            return (Criteria) this;
        }

        public Criteria andReportProvinceLike(String value) {
            addCriterion("report_province like", value, "reportProvince");
            return (Criteria) this;
        }

        public Criteria andReportProvinceNotLike(String value) {
            addCriterion("report_province not like", value, "reportProvince");
            return (Criteria) this;
        }

        public Criteria andReportProvinceIn(List<String> values) {
            addCriterion("report_province in", values, "reportProvince");
            return (Criteria) this;
        }

        public Criteria andReportProvinceNotIn(List<String> values) {
            addCriterion("report_province not in", values, "reportProvince");
            return (Criteria) this;
        }

        public Criteria andReportProvinceBetween(String value1, String value2) {
            addCriterion("report_province between", value1, value2, "reportProvince");
            return (Criteria) this;
        }

        public Criteria andReportProvinceNotBetween(String value1, String value2) {
            addCriterion("report_province not between", value1, value2, "reportProvince");
            return (Criteria) this;
        }

        public Criteria andReportCityIsNull() {
            addCriterion("report_city is null");
            return (Criteria) this;
        }

        public Criteria andReportCityIsNotNull() {
            addCriterion("report_city is not null");
            return (Criteria) this;
        }

        public Criteria andReportCityEqualTo(String value) {
            addCriterion("report_city =", value, "reportCity");
            return (Criteria) this;
        }

        public Criteria andReportCityNotEqualTo(String value) {
            addCriterion("report_city <>", value, "reportCity");
            return (Criteria) this;
        }

        public Criteria andReportCityGreaterThan(String value) {
            addCriterion("report_city >", value, "reportCity");
            return (Criteria) this;
        }

        public Criteria andReportCityGreaterThanOrEqualTo(String value) {
            addCriterion("report_city >=", value, "reportCity");
            return (Criteria) this;
        }

        public Criteria andReportCityLessThan(String value) {
            addCriterion("report_city <", value, "reportCity");
            return (Criteria) this;
        }

        public Criteria andReportCityLessThanOrEqualTo(String value) {
            addCriterion("report_city <=", value, "reportCity");
            return (Criteria) this;
        }

        public Criteria andReportCityLike(String value) {
            addCriterion("report_city like", value, "reportCity");
            return (Criteria) this;
        }

        public Criteria andReportCityNotLike(String value) {
            addCriterion("report_city not like", value, "reportCity");
            return (Criteria) this;
        }

        public Criteria andReportCityIn(List<String> values) {
            addCriterion("report_city in", values, "reportCity");
            return (Criteria) this;
        }

        public Criteria andReportCityNotIn(List<String> values) {
            addCriterion("report_city not in", values, "reportCity");
            return (Criteria) this;
        }

        public Criteria andReportCityBetween(String value1, String value2) {
            addCriterion("report_city between", value1, value2, "reportCity");
            return (Criteria) this;
        }

        public Criteria andReportCityNotBetween(String value1, String value2) {
            addCriterion("report_city not between", value1, value2, "reportCity");
            return (Criteria) this;
        }

        public Criteria andReportDistrictIsNull() {
            addCriterion("report_district is null");
            return (Criteria) this;
        }

        public Criteria andReportDistrictIsNotNull() {
            addCriterion("report_district is not null");
            return (Criteria) this;
        }

        public Criteria andReportDistrictEqualTo(String value) {
            addCriterion("report_district =", value, "reportDistrict");
            return (Criteria) this;
        }

        public Criteria andReportDistrictNotEqualTo(String value) {
            addCriterion("report_district <>", value, "reportDistrict");
            return (Criteria) this;
        }

        public Criteria andReportDistrictGreaterThan(String value) {
            addCriterion("report_district >", value, "reportDistrict");
            return (Criteria) this;
        }

        public Criteria andReportDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("report_district >=", value, "reportDistrict");
            return (Criteria) this;
        }

        public Criteria andReportDistrictLessThan(String value) {
            addCriterion("report_district <", value, "reportDistrict");
            return (Criteria) this;
        }

        public Criteria andReportDistrictLessThanOrEqualTo(String value) {
            addCriterion("report_district <=", value, "reportDistrict");
            return (Criteria) this;
        }

        public Criteria andReportDistrictLike(String value) {
            addCriterion("report_district like", value, "reportDistrict");
            return (Criteria) this;
        }

        public Criteria andReportDistrictNotLike(String value) {
            addCriterion("report_district not like", value, "reportDistrict");
            return (Criteria) this;
        }

        public Criteria andReportDistrictIn(List<String> values) {
            addCriterion("report_district in", values, "reportDistrict");
            return (Criteria) this;
        }

        public Criteria andReportDistrictNotIn(List<String> values) {
            addCriterion("report_district not in", values, "reportDistrict");
            return (Criteria) this;
        }

        public Criteria andReportDistrictBetween(String value1, String value2) {
            addCriterion("report_district between", value1, value2, "reportDistrict");
            return (Criteria) this;
        }

        public Criteria andReportDistrictNotBetween(String value1, String value2) {
            addCriterion("report_district not between", value1, value2, "reportDistrict");
            return (Criteria) this;
        }

        public Criteria andReportAddressIsNull() {
            addCriterion("report_address is null");
            return (Criteria) this;
        }

        public Criteria andReportAddressIsNotNull() {
            addCriterion("report_address is not null");
            return (Criteria) this;
        }

        public Criteria andReportAddressEqualTo(String value) {
            addCriterion("report_address =", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressNotEqualTo(String value) {
            addCriterion("report_address <>", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressGreaterThan(String value) {
            addCriterion("report_address >", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressGreaterThanOrEqualTo(String value) {
            addCriterion("report_address >=", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressLessThan(String value) {
            addCriterion("report_address <", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressLessThanOrEqualTo(String value) {
            addCriterion("report_address <=", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressLike(String value) {
            addCriterion("report_address like", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressNotLike(String value) {
            addCriterion("report_address not like", value, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressIn(List<String> values) {
            addCriterion("report_address in", values, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressNotIn(List<String> values) {
            addCriterion("report_address not in", values, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressBetween(String value1, String value2) {
            addCriterion("report_address between", value1, value2, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andReportAddressNotBetween(String value1, String value2) {
            addCriterion("report_address not between", value1, value2, "reportAddress");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLindicatorIsNull() {
            addCriterion("lindicator is null");
            return (Criteria) this;
        }

        public Criteria andLindicatorIsNotNull() {
            addCriterion("lindicator is not null");
            return (Criteria) this;
        }

        public Criteria andLindicatorEqualTo(String value) {
            addCriterion("lindicator =", value, "lindicator");
            return (Criteria) this;
        }

        public Criteria andLindicatorNotEqualTo(String value) {
            addCriterion("lindicator <>", value, "lindicator");
            return (Criteria) this;
        }

        public Criteria andLindicatorGreaterThan(String value) {
            addCriterion("lindicator >", value, "lindicator");
            return (Criteria) this;
        }

        public Criteria andLindicatorGreaterThanOrEqualTo(String value) {
            addCriterion("lindicator >=", value, "lindicator");
            return (Criteria) this;
        }

        public Criteria andLindicatorLessThan(String value) {
            addCriterion("lindicator <", value, "lindicator");
            return (Criteria) this;
        }

        public Criteria andLindicatorLessThanOrEqualTo(String value) {
            addCriterion("lindicator <=", value, "lindicator");
            return (Criteria) this;
        }

        public Criteria andLindicatorLike(String value) {
            addCriterion("lindicator like", value, "lindicator");
            return (Criteria) this;
        }

        public Criteria andLindicatorNotLike(String value) {
            addCriterion("lindicator not like", value, "lindicator");
            return (Criteria) this;
        }

        public Criteria andLindicatorIn(List<String> values) {
            addCriterion("lindicator in", values, "lindicator");
            return (Criteria) this;
        }

        public Criteria andLindicatorNotIn(List<String> values) {
            addCriterion("lindicator not in", values, "lindicator");
            return (Criteria) this;
        }

        public Criteria andLindicatorBetween(String value1, String value2) {
            addCriterion("lindicator between", value1, value2, "lindicator");
            return (Criteria) this;
        }

        public Criteria andLindicatorNotBetween(String value1, String value2) {
            addCriterion("lindicator not between", value1, value2, "lindicator");
            return (Criteria) this;
        }

        public Criteria andCatastropheNameIsNull() {
            addCriterion("catastrophe_name is null");
            return (Criteria) this;
        }

        public Criteria andCatastropheNameIsNotNull() {
            addCriterion("catastrophe_name is not null");
            return (Criteria) this;
        }

        public Criteria andCatastropheNameEqualTo(String value) {
            addCriterion("catastrophe_name =", value, "catastropheName");
            return (Criteria) this;
        }

        public Criteria andCatastropheNameNotEqualTo(String value) {
            addCriterion("catastrophe_name <>", value, "catastropheName");
            return (Criteria) this;
        }

        public Criteria andCatastropheNameGreaterThan(String value) {
            addCriterion("catastrophe_name >", value, "catastropheName");
            return (Criteria) this;
        }

        public Criteria andCatastropheNameGreaterThanOrEqualTo(String value) {
            addCriterion("catastrophe_name >=", value, "catastropheName");
            return (Criteria) this;
        }

        public Criteria andCatastropheNameLessThan(String value) {
            addCriterion("catastrophe_name <", value, "catastropheName");
            return (Criteria) this;
        }

        public Criteria andCatastropheNameLessThanOrEqualTo(String value) {
            addCriterion("catastrophe_name <=", value, "catastropheName");
            return (Criteria) this;
        }

        public Criteria andCatastropheNameLike(String value) {
            addCriterion("catastrophe_name like", value, "catastropheName");
            return (Criteria) this;
        }

        public Criteria andCatastropheNameNotLike(String value) {
            addCriterion("catastrophe_name not like", value, "catastropheName");
            return (Criteria) this;
        }

        public Criteria andCatastropheNameIn(List<String> values) {
            addCriterion("catastrophe_name in", values, "catastropheName");
            return (Criteria) this;
        }

        public Criteria andCatastropheNameNotIn(List<String> values) {
            addCriterion("catastrophe_name not in", values, "catastropheName");
            return (Criteria) this;
        }

        public Criteria andCatastropheNameBetween(String value1, String value2) {
            addCriterion("catastrophe_name between", value1, value2, "catastropheName");
            return (Criteria) this;
        }

        public Criteria andCatastropheNameNotBetween(String value1, String value2) {
            addCriterion("catastrophe_name not between", value1, value2, "catastropheName");
            return (Criteria) this;
        }

        public Criteria andCatastropheTypeIsNull() {
            addCriterion("catastrophe_type is null");
            return (Criteria) this;
        }

        public Criteria andCatastropheTypeIsNotNull() {
            addCriterion("catastrophe_type is not null");
            return (Criteria) this;
        }

        public Criteria andCatastropheTypeEqualTo(String value) {
            addCriterion("catastrophe_type =", value, "catastropheType");
            return (Criteria) this;
        }

        public Criteria andCatastropheTypeNotEqualTo(String value) {
            addCriterion("catastrophe_type <>", value, "catastropheType");
            return (Criteria) this;
        }

        public Criteria andCatastropheTypeGreaterThan(String value) {
            addCriterion("catastrophe_type >", value, "catastropheType");
            return (Criteria) this;
        }

        public Criteria andCatastropheTypeGreaterThanOrEqualTo(String value) {
            addCriterion("catastrophe_type >=", value, "catastropheType");
            return (Criteria) this;
        }

        public Criteria andCatastropheTypeLessThan(String value) {
            addCriterion("catastrophe_type <", value, "catastropheType");
            return (Criteria) this;
        }

        public Criteria andCatastropheTypeLessThanOrEqualTo(String value) {
            addCriterion("catastrophe_type <=", value, "catastropheType");
            return (Criteria) this;
        }

        public Criteria andCatastropheTypeLike(String value) {
            addCriterion("catastrophe_type like", value, "catastropheType");
            return (Criteria) this;
        }

        public Criteria andCatastropheTypeNotLike(String value) {
            addCriterion("catastrophe_type not like", value, "catastropheType");
            return (Criteria) this;
        }

        public Criteria andCatastropheTypeIn(List<String> values) {
            addCriterion("catastrophe_type in", values, "catastropheType");
            return (Criteria) this;
        }

        public Criteria andCatastropheTypeNotIn(List<String> values) {
            addCriterion("catastrophe_type not in", values, "catastropheType");
            return (Criteria) this;
        }

        public Criteria andCatastropheTypeBetween(String value1, String value2) {
            addCriterion("catastrophe_type between", value1, value2, "catastropheType");
            return (Criteria) this;
        }

        public Criteria andCatastropheTypeNotBetween(String value1, String value2) {
            addCriterion("catastrophe_type not between", value1, value2, "catastropheType");
            return (Criteria) this;
        }

        public Criteria andCatastropheCodeIsNull() {
            addCriterion("catastrophe_code is null");
            return (Criteria) this;
        }

        public Criteria andCatastropheCodeIsNotNull() {
            addCriterion("catastrophe_code is not null");
            return (Criteria) this;
        }

        public Criteria andCatastropheCodeEqualTo(String value) {
            addCriterion("catastrophe_code =", value, "catastropheCode");
            return (Criteria) this;
        }

        public Criteria andCatastropheCodeNotEqualTo(String value) {
            addCriterion("catastrophe_code <>", value, "catastropheCode");
            return (Criteria) this;
        }

        public Criteria andCatastropheCodeGreaterThan(String value) {
            addCriterion("catastrophe_code >", value, "catastropheCode");
            return (Criteria) this;
        }

        public Criteria andCatastropheCodeGreaterThanOrEqualTo(String value) {
            addCriterion("catastrophe_code >=", value, "catastropheCode");
            return (Criteria) this;
        }

        public Criteria andCatastropheCodeLessThan(String value) {
            addCriterion("catastrophe_code <", value, "catastropheCode");
            return (Criteria) this;
        }

        public Criteria andCatastropheCodeLessThanOrEqualTo(String value) {
            addCriterion("catastrophe_code <=", value, "catastropheCode");
            return (Criteria) this;
        }

        public Criteria andCatastropheCodeLike(String value) {
            addCriterion("catastrophe_code like", value, "catastropheCode");
            return (Criteria) this;
        }

        public Criteria andCatastropheCodeNotLike(String value) {
            addCriterion("catastrophe_code not like", value, "catastropheCode");
            return (Criteria) this;
        }

        public Criteria andCatastropheCodeIn(List<String> values) {
            addCriterion("catastrophe_code in", values, "catastropheCode");
            return (Criteria) this;
        }

        public Criteria andCatastropheCodeNotIn(List<String> values) {
            addCriterion("catastrophe_code not in", values, "catastropheCode");
            return (Criteria) this;
        }

        public Criteria andCatastropheCodeBetween(String value1, String value2) {
            addCriterion("catastrophe_code between", value1, value2, "catastropheCode");
            return (Criteria) this;
        }

        public Criteria andCatastropheCodeNotBetween(String value1, String value2) {
            addCriterion("catastrophe_code not between", value1, value2, "catastropheCode");
            return (Criteria) this;
        }

        public Criteria andIsSubjectNormalIsNull() {
            addCriterion("is_subject_normal is null");
            return (Criteria) this;
        }

        public Criteria andIsSubjectNormalIsNotNull() {
            addCriterion("is_subject_normal is not null");
            return (Criteria) this;
        }

        public Criteria andIsSubjectNormalEqualTo(String value) {
            addCriterion("is_subject_normal =", value, "isSubjectNormal");
            return (Criteria) this;
        }

        public Criteria andIsSubjectNormalNotEqualTo(String value) {
            addCriterion("is_subject_normal <>", value, "isSubjectNormal");
            return (Criteria) this;
        }

        public Criteria andIsSubjectNormalGreaterThan(String value) {
            addCriterion("is_subject_normal >", value, "isSubjectNormal");
            return (Criteria) this;
        }

        public Criteria andIsSubjectNormalGreaterThanOrEqualTo(String value) {
            addCriterion("is_subject_normal >=", value, "isSubjectNormal");
            return (Criteria) this;
        }

        public Criteria andIsSubjectNormalLessThan(String value) {
            addCriterion("is_subject_normal <", value, "isSubjectNormal");
            return (Criteria) this;
        }

        public Criteria andIsSubjectNormalLessThanOrEqualTo(String value) {
            addCriterion("is_subject_normal <=", value, "isSubjectNormal");
            return (Criteria) this;
        }

        public Criteria andIsSubjectNormalLike(String value) {
            addCriterion("is_subject_normal like", value, "isSubjectNormal");
            return (Criteria) this;
        }

        public Criteria andIsSubjectNormalNotLike(String value) {
            addCriterion("is_subject_normal not like", value, "isSubjectNormal");
            return (Criteria) this;
        }

        public Criteria andIsSubjectNormalIn(List<String> values) {
            addCriterion("is_subject_normal in", values, "isSubjectNormal");
            return (Criteria) this;
        }

        public Criteria andIsSubjectNormalNotIn(List<String> values) {
            addCriterion("is_subject_normal not in", values, "isSubjectNormal");
            return (Criteria) this;
        }

        public Criteria andIsSubjectNormalBetween(String value1, String value2) {
            addCriterion("is_subject_normal between", value1, value2, "isSubjectNormal");
            return (Criteria) this;
        }

        public Criteria andIsSubjectNormalNotBetween(String value1, String value2) {
            addCriterion("is_subject_normal not between", value1, value2, "isSubjectNormal");
            return (Criteria) this;
        }

        public Criteria andIsRescueIsNull() {
            addCriterion("is_rescue is null");
            return (Criteria) this;
        }

        public Criteria andIsRescueIsNotNull() {
            addCriterion("is_rescue is not null");
            return (Criteria) this;
        }

        public Criteria andIsRescueEqualTo(String value) {
            addCriterion("is_rescue =", value, "isRescue");
            return (Criteria) this;
        }

        public Criteria andIsRescueNotEqualTo(String value) {
            addCriterion("is_rescue <>", value, "isRescue");
            return (Criteria) this;
        }

        public Criteria andIsRescueGreaterThan(String value) {
            addCriterion("is_rescue >", value, "isRescue");
            return (Criteria) this;
        }

        public Criteria andIsRescueGreaterThanOrEqualTo(String value) {
            addCriterion("is_rescue >=", value, "isRescue");
            return (Criteria) this;
        }

        public Criteria andIsRescueLessThan(String value) {
            addCriterion("is_rescue <", value, "isRescue");
            return (Criteria) this;
        }

        public Criteria andIsRescueLessThanOrEqualTo(String value) {
            addCriterion("is_rescue <=", value, "isRescue");
            return (Criteria) this;
        }

        public Criteria andIsRescueLike(String value) {
            addCriterion("is_rescue like", value, "isRescue");
            return (Criteria) this;
        }

        public Criteria andIsRescueNotLike(String value) {
            addCriterion("is_rescue not like", value, "isRescue");
            return (Criteria) this;
        }

        public Criteria andIsRescueIn(List<String> values) {
            addCriterion("is_rescue in", values, "isRescue");
            return (Criteria) this;
        }

        public Criteria andIsRescueNotIn(List<String> values) {
            addCriterion("is_rescue not in", values, "isRescue");
            return (Criteria) this;
        }

        public Criteria andIsRescueBetween(String value1, String value2) {
            addCriterion("is_rescue between", value1, value2, "isRescue");
            return (Criteria) this;
        }

        public Criteria andIsRescueNotBetween(String value1, String value2) {
            addCriterion("is_rescue not between", value1, value2, "isRescue");
            return (Criteria) this;
        }

        public Criteria andIsSelfSurveyIsNull() {
            addCriterion("is_self_survey is null");
            return (Criteria) this;
        }

        public Criteria andIsSelfSurveyIsNotNull() {
            addCriterion("is_self_survey is not null");
            return (Criteria) this;
        }

        public Criteria andIsSelfSurveyEqualTo(String value) {
            addCriterion("is_self_survey =", value, "isSelfSurvey");
            return (Criteria) this;
        }

        public Criteria andIsSelfSurveyNotEqualTo(String value) {
            addCriterion("is_self_survey <>", value, "isSelfSurvey");
            return (Criteria) this;
        }

        public Criteria andIsSelfSurveyGreaterThan(String value) {
            addCriterion("is_self_survey >", value, "isSelfSurvey");
            return (Criteria) this;
        }

        public Criteria andIsSelfSurveyGreaterThanOrEqualTo(String value) {
            addCriterion("is_self_survey >=", value, "isSelfSurvey");
            return (Criteria) this;
        }

        public Criteria andIsSelfSurveyLessThan(String value) {
            addCriterion("is_self_survey <", value, "isSelfSurvey");
            return (Criteria) this;
        }

        public Criteria andIsSelfSurveyLessThanOrEqualTo(String value) {
            addCriterion("is_self_survey <=", value, "isSelfSurvey");
            return (Criteria) this;
        }

        public Criteria andIsSelfSurveyLike(String value) {
            addCriterion("is_self_survey like", value, "isSelfSurvey");
            return (Criteria) this;
        }

        public Criteria andIsSelfSurveyNotLike(String value) {
            addCriterion("is_self_survey not like", value, "isSelfSurvey");
            return (Criteria) this;
        }

        public Criteria andIsSelfSurveyIn(List<String> values) {
            addCriterion("is_self_survey in", values, "isSelfSurvey");
            return (Criteria) this;
        }

        public Criteria andIsSelfSurveyNotIn(List<String> values) {
            addCriterion("is_self_survey not in", values, "isSelfSurvey");
            return (Criteria) this;
        }

        public Criteria andIsSelfSurveyBetween(String value1, String value2) {
            addCriterion("is_self_survey between", value1, value2, "isSelfSurvey");
            return (Criteria) this;
        }

        public Criteria andIsSelfSurveyNotBetween(String value1, String value2) {
            addCriterion("is_self_survey not between", value1, value2, "isSelfSurvey");
            return (Criteria) this;
        }

        public Criteria andIsPaymentIsNull() {
            addCriterion("is_payment is null");
            return (Criteria) this;
        }

        public Criteria andIsPaymentIsNotNull() {
            addCriterion("is_payment is not null");
            return (Criteria) this;
        }

        public Criteria andIsPaymentEqualTo(String value) {
            addCriterion("is_payment =", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentNotEqualTo(String value) {
            addCriterion("is_payment <>", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentGreaterThan(String value) {
            addCriterion("is_payment >", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentGreaterThanOrEqualTo(String value) {
            addCriterion("is_payment >=", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentLessThan(String value) {
            addCriterion("is_payment <", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentLessThanOrEqualTo(String value) {
            addCriterion("is_payment <=", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentLike(String value) {
            addCriterion("is_payment like", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentNotLike(String value) {
            addCriterion("is_payment not like", value, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentIn(List<String> values) {
            addCriterion("is_payment in", values, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentNotIn(List<String> values) {
            addCriterion("is_payment not in", values, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentBetween(String value1, String value2) {
            addCriterion("is_payment between", value1, value2, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsPaymentNotBetween(String value1, String value2) {
            addCriterion("is_payment not between", value1, value2, "isPayment");
            return (Criteria) this;
        }

        public Criteria andIsDriverLocaleIsNull() {
            addCriterion("is_driver_locale is null");
            return (Criteria) this;
        }

        public Criteria andIsDriverLocaleIsNotNull() {
            addCriterion("is_driver_locale is not null");
            return (Criteria) this;
        }

        public Criteria andIsDriverLocaleEqualTo(String value) {
            addCriterion("is_driver_locale =", value, "isDriverLocale");
            return (Criteria) this;
        }

        public Criteria andIsDriverLocaleNotEqualTo(String value) {
            addCriterion("is_driver_locale <>", value, "isDriverLocale");
            return (Criteria) this;
        }

        public Criteria andIsDriverLocaleGreaterThan(String value) {
            addCriterion("is_driver_locale >", value, "isDriverLocale");
            return (Criteria) this;
        }

        public Criteria andIsDriverLocaleGreaterThanOrEqualTo(String value) {
            addCriterion("is_driver_locale >=", value, "isDriverLocale");
            return (Criteria) this;
        }

        public Criteria andIsDriverLocaleLessThan(String value) {
            addCriterion("is_driver_locale <", value, "isDriverLocale");
            return (Criteria) this;
        }

        public Criteria andIsDriverLocaleLessThanOrEqualTo(String value) {
            addCriterion("is_driver_locale <=", value, "isDriverLocale");
            return (Criteria) this;
        }

        public Criteria andIsDriverLocaleLike(String value) {
            addCriterion("is_driver_locale like", value, "isDriverLocale");
            return (Criteria) this;
        }

        public Criteria andIsDriverLocaleNotLike(String value) {
            addCriterion("is_driver_locale not like", value, "isDriverLocale");
            return (Criteria) this;
        }

        public Criteria andIsDriverLocaleIn(List<String> values) {
            addCriterion("is_driver_locale in", values, "isDriverLocale");
            return (Criteria) this;
        }

        public Criteria andIsDriverLocaleNotIn(List<String> values) {
            addCriterion("is_driver_locale not in", values, "isDriverLocale");
            return (Criteria) this;
        }

        public Criteria andIsDriverLocaleBetween(String value1, String value2) {
            addCriterion("is_driver_locale between", value1, value2, "isDriverLocale");
            return (Criteria) this;
        }

        public Criteria andIsDriverLocaleNotBetween(String value1, String value2) {
            addCriterion("is_driver_locale not between", value1, value2, "isDriverLocale");
            return (Criteria) this;
        }

        public Criteria andIsTakeEffectIsNull() {
            addCriterion("is_take_effect is null");
            return (Criteria) this;
        }

        public Criteria andIsTakeEffectIsNotNull() {
            addCriterion("is_take_effect is not null");
            return (Criteria) this;
        }

        public Criteria andIsTakeEffectEqualTo(String value) {
            addCriterion("is_take_effect =", value, "isTakeEffect");
            return (Criteria) this;
        }

        public Criteria andIsTakeEffectNotEqualTo(String value) {
            addCriterion("is_take_effect <>", value, "isTakeEffect");
            return (Criteria) this;
        }

        public Criteria andIsTakeEffectGreaterThan(String value) {
            addCriterion("is_take_effect >", value, "isTakeEffect");
            return (Criteria) this;
        }

        public Criteria andIsTakeEffectGreaterThanOrEqualTo(String value) {
            addCriterion("is_take_effect >=", value, "isTakeEffect");
            return (Criteria) this;
        }

        public Criteria andIsTakeEffectLessThan(String value) {
            addCriterion("is_take_effect <", value, "isTakeEffect");
            return (Criteria) this;
        }

        public Criteria andIsTakeEffectLessThanOrEqualTo(String value) {
            addCriterion("is_take_effect <=", value, "isTakeEffect");
            return (Criteria) this;
        }

        public Criteria andIsTakeEffectLike(String value) {
            addCriterion("is_take_effect like", value, "isTakeEffect");
            return (Criteria) this;
        }

        public Criteria andIsTakeEffectNotLike(String value) {
            addCriterion("is_take_effect not like", value, "isTakeEffect");
            return (Criteria) this;
        }

        public Criteria andIsTakeEffectIn(List<String> values) {
            addCriterion("is_take_effect in", values, "isTakeEffect");
            return (Criteria) this;
        }

        public Criteria andIsTakeEffectNotIn(List<String> values) {
            addCriterion("is_take_effect not in", values, "isTakeEffect");
            return (Criteria) this;
        }

        public Criteria andIsTakeEffectBetween(String value1, String value2) {
            addCriterion("is_take_effect between", value1, value2, "isTakeEffect");
            return (Criteria) this;
        }

        public Criteria andIsTakeEffectNotBetween(String value1, String value2) {
            addCriterion("is_take_effect not between", value1, value2, "isTakeEffect");
            return (Criteria) this;
        }

        public Criteria andIsMainReportIsNull() {
            addCriterion("is_main_report is null");
            return (Criteria) this;
        }

        public Criteria andIsMainReportIsNotNull() {
            addCriterion("is_main_report is not null");
            return (Criteria) this;
        }

        public Criteria andIsMainReportEqualTo(String value) {
            addCriterion("is_main_report =", value, "isMainReport");
            return (Criteria) this;
        }

        public Criteria andIsMainReportNotEqualTo(String value) {
            addCriterion("is_main_report <>", value, "isMainReport");
            return (Criteria) this;
        }

        public Criteria andIsMainReportGreaterThan(String value) {
            addCriterion("is_main_report >", value, "isMainReport");
            return (Criteria) this;
        }

        public Criteria andIsMainReportGreaterThanOrEqualTo(String value) {
            addCriterion("is_main_report >=", value, "isMainReport");
            return (Criteria) this;
        }

        public Criteria andIsMainReportLessThan(String value) {
            addCriterion("is_main_report <", value, "isMainReport");
            return (Criteria) this;
        }

        public Criteria andIsMainReportLessThanOrEqualTo(String value) {
            addCriterion("is_main_report <=", value, "isMainReport");
            return (Criteria) this;
        }

        public Criteria andIsMainReportLike(String value) {
            addCriterion("is_main_report like", value, "isMainReport");
            return (Criteria) this;
        }

        public Criteria andIsMainReportNotLike(String value) {
            addCriterion("is_main_report not like", value, "isMainReport");
            return (Criteria) this;
        }

        public Criteria andIsMainReportIn(List<String> values) {
            addCriterion("is_main_report in", values, "isMainReport");
            return (Criteria) this;
        }

        public Criteria andIsMainReportNotIn(List<String> values) {
            addCriterion("is_main_report not in", values, "isMainReport");
            return (Criteria) this;
        }

        public Criteria andIsMainReportBetween(String value1, String value2) {
            addCriterion("is_main_report between", value1, value2, "isMainReport");
            return (Criteria) this;
        }

        public Criteria andIsMainReportNotBetween(String value1, String value2) {
            addCriterion("is_main_report not between", value1, value2, "isMainReport");
            return (Criteria) this;
        }

        public Criteria andIsLocaleSurveyIsNull() {
            addCriterion("is_locale_survey is null");
            return (Criteria) this;
        }

        public Criteria andIsLocaleSurveyIsNotNull() {
            addCriterion("is_locale_survey is not null");
            return (Criteria) this;
        }

        public Criteria andIsLocaleSurveyEqualTo(String value) {
            addCriterion("is_locale_survey =", value, "isLocaleSurvey");
            return (Criteria) this;
        }

        public Criteria andIsLocaleSurveyNotEqualTo(String value) {
            addCriterion("is_locale_survey <>", value, "isLocaleSurvey");
            return (Criteria) this;
        }

        public Criteria andIsLocaleSurveyGreaterThan(String value) {
            addCriterion("is_locale_survey >", value, "isLocaleSurvey");
            return (Criteria) this;
        }

        public Criteria andIsLocaleSurveyGreaterThanOrEqualTo(String value) {
            addCriterion("is_locale_survey >=", value, "isLocaleSurvey");
            return (Criteria) this;
        }

        public Criteria andIsLocaleSurveyLessThan(String value) {
            addCriterion("is_locale_survey <", value, "isLocaleSurvey");
            return (Criteria) this;
        }

        public Criteria andIsLocaleSurveyLessThanOrEqualTo(String value) {
            addCriterion("is_locale_survey <=", value, "isLocaleSurvey");
            return (Criteria) this;
        }

        public Criteria andIsLocaleSurveyLike(String value) {
            addCriterion("is_locale_survey like", value, "isLocaleSurvey");
            return (Criteria) this;
        }

        public Criteria andIsLocaleSurveyNotLike(String value) {
            addCriterion("is_locale_survey not like", value, "isLocaleSurvey");
            return (Criteria) this;
        }

        public Criteria andIsLocaleSurveyIn(List<String> values) {
            addCriterion("is_locale_survey in", values, "isLocaleSurvey");
            return (Criteria) this;
        }

        public Criteria andIsLocaleSurveyNotIn(List<String> values) {
            addCriterion("is_locale_survey not in", values, "isLocaleSurvey");
            return (Criteria) this;
        }

        public Criteria andIsLocaleSurveyBetween(String value1, String value2) {
            addCriterion("is_locale_survey between", value1, value2, "isLocaleSurvey");
            return (Criteria) this;
        }

        public Criteria andIsLocaleSurveyNotBetween(String value1, String value2) {
            addCriterion("is_locale_survey not between", value1, value2, "isLocaleSurvey");
            return (Criteria) this;
        }

        public Criteria andReplaceSurveyMarkIsNull() {
            addCriterion("replace_survey_mark is null");
            return (Criteria) this;
        }

        public Criteria andReplaceSurveyMarkIsNotNull() {
            addCriterion("replace_survey_mark is not null");
            return (Criteria) this;
        }

        public Criteria andReplaceSurveyMarkEqualTo(String value) {
            addCriterion("replace_survey_mark =", value, "replaceSurveyMark");
            return (Criteria) this;
        }

        public Criteria andReplaceSurveyMarkNotEqualTo(String value) {
            addCriterion("replace_survey_mark <>", value, "replaceSurveyMark");
            return (Criteria) this;
        }

        public Criteria andReplaceSurveyMarkGreaterThan(String value) {
            addCriterion("replace_survey_mark >", value, "replaceSurveyMark");
            return (Criteria) this;
        }

        public Criteria andReplaceSurveyMarkGreaterThanOrEqualTo(String value) {
            addCriterion("replace_survey_mark >=", value, "replaceSurveyMark");
            return (Criteria) this;
        }

        public Criteria andReplaceSurveyMarkLessThan(String value) {
            addCriterion("replace_survey_mark <", value, "replaceSurveyMark");
            return (Criteria) this;
        }

        public Criteria andReplaceSurveyMarkLessThanOrEqualTo(String value) {
            addCriterion("replace_survey_mark <=", value, "replaceSurveyMark");
            return (Criteria) this;
        }

        public Criteria andReplaceSurveyMarkLike(String value) {
            addCriterion("replace_survey_mark like", value, "replaceSurveyMark");
            return (Criteria) this;
        }

        public Criteria andReplaceSurveyMarkNotLike(String value) {
            addCriterion("replace_survey_mark not like", value, "replaceSurveyMark");
            return (Criteria) this;
        }

        public Criteria andReplaceSurveyMarkIn(List<String> values) {
            addCriterion("replace_survey_mark in", values, "replaceSurveyMark");
            return (Criteria) this;
        }

        public Criteria andReplaceSurveyMarkNotIn(List<String> values) {
            addCriterion("replace_survey_mark not in", values, "replaceSurveyMark");
            return (Criteria) this;
        }

        public Criteria andReplaceSurveyMarkBetween(String value1, String value2) {
            addCriterion("replace_survey_mark between", value1, value2, "replaceSurveyMark");
            return (Criteria) this;
        }

        public Criteria andReplaceSurveyMarkNotBetween(String value1, String value2) {
            addCriterion("replace_survey_mark not between", value1, value2, "replaceSurveyMark");
            return (Criteria) this;
        }

        public Criteria andIsEditReportIsNull() {
            addCriterion("is_edit_report is null");
            return (Criteria) this;
        }

        public Criteria andIsEditReportIsNotNull() {
            addCriterion("is_edit_report is not null");
            return (Criteria) this;
        }

        public Criteria andIsEditReportEqualTo(String value) {
            addCriterion("is_edit_report =", value, "isEditReport");
            return (Criteria) this;
        }

        public Criteria andIsEditReportNotEqualTo(String value) {
            addCriterion("is_edit_report <>", value, "isEditReport");
            return (Criteria) this;
        }

        public Criteria andIsEditReportGreaterThan(String value) {
            addCriterion("is_edit_report >", value, "isEditReport");
            return (Criteria) this;
        }

        public Criteria andIsEditReportGreaterThanOrEqualTo(String value) {
            addCriterion("is_edit_report >=", value, "isEditReport");
            return (Criteria) this;
        }

        public Criteria andIsEditReportLessThan(String value) {
            addCriterion("is_edit_report <", value, "isEditReport");
            return (Criteria) this;
        }

        public Criteria andIsEditReportLessThanOrEqualTo(String value) {
            addCriterion("is_edit_report <=", value, "isEditReport");
            return (Criteria) this;
        }

        public Criteria andIsEditReportLike(String value) {
            addCriterion("is_edit_report like", value, "isEditReport");
            return (Criteria) this;
        }

        public Criteria andIsEditReportNotLike(String value) {
            addCriterion("is_edit_report not like", value, "isEditReport");
            return (Criteria) this;
        }

        public Criteria andIsEditReportIn(List<String> values) {
            addCriterion("is_edit_report in", values, "isEditReport");
            return (Criteria) this;
        }

        public Criteria andIsEditReportNotIn(List<String> values) {
            addCriterion("is_edit_report not in", values, "isEditReport");
            return (Criteria) this;
        }

        public Criteria andIsEditReportBetween(String value1, String value2) {
            addCriterion("is_edit_report between", value1, value2, "isEditReport");
            return (Criteria) this;
        }

        public Criteria andIsEditReportNotBetween(String value1, String value2) {
            addCriterion("is_edit_report not between", value1, value2, "isEditReport");
            return (Criteria) this;
        }

        public Criteria andIsInsuredPhoneIsNull() {
            addCriterion("is_insured_phone is null");
            return (Criteria) this;
        }

        public Criteria andIsInsuredPhoneIsNotNull() {
            addCriterion("is_insured_phone is not null");
            return (Criteria) this;
        }

        public Criteria andIsInsuredPhoneEqualTo(String value) {
            addCriterion("is_insured_phone =", value, "isInsuredPhone");
            return (Criteria) this;
        }

        public Criteria andIsInsuredPhoneNotEqualTo(String value) {
            addCriterion("is_insured_phone <>", value, "isInsuredPhone");
            return (Criteria) this;
        }

        public Criteria andIsInsuredPhoneGreaterThan(String value) {
            addCriterion("is_insured_phone >", value, "isInsuredPhone");
            return (Criteria) this;
        }

        public Criteria andIsInsuredPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("is_insured_phone >=", value, "isInsuredPhone");
            return (Criteria) this;
        }

        public Criteria andIsInsuredPhoneLessThan(String value) {
            addCriterion("is_insured_phone <", value, "isInsuredPhone");
            return (Criteria) this;
        }

        public Criteria andIsInsuredPhoneLessThanOrEqualTo(String value) {
            addCriterion("is_insured_phone <=", value, "isInsuredPhone");
            return (Criteria) this;
        }

        public Criteria andIsInsuredPhoneLike(String value) {
            addCriterion("is_insured_phone like", value, "isInsuredPhone");
            return (Criteria) this;
        }

        public Criteria andIsInsuredPhoneNotLike(String value) {
            addCriterion("is_insured_phone not like", value, "isInsuredPhone");
            return (Criteria) this;
        }

        public Criteria andIsInsuredPhoneIn(List<String> values) {
            addCriterion("is_insured_phone in", values, "isInsuredPhone");
            return (Criteria) this;
        }

        public Criteria andIsInsuredPhoneNotIn(List<String> values) {
            addCriterion("is_insured_phone not in", values, "isInsuredPhone");
            return (Criteria) this;
        }

        public Criteria andIsInsuredPhoneBetween(String value1, String value2) {
            addCriterion("is_insured_phone between", value1, value2, "isInsuredPhone");
            return (Criteria) this;
        }

        public Criteria andIsInsuredPhoneNotBetween(String value1, String value2) {
            addCriterion("is_insured_phone not between", value1, value2, "isInsuredPhone");
            return (Criteria) this;
        }

        public Criteria andTaskWorkflowIsNull() {
            addCriterion("task_workflow is null");
            return (Criteria) this;
        }

        public Criteria andTaskWorkflowIsNotNull() {
            addCriterion("task_workflow is not null");
            return (Criteria) this;
        }

        public Criteria andTaskWorkflowEqualTo(String value) {
            addCriterion("task_workflow =", value, "taskWorkflow");
            return (Criteria) this;
        }

        public Criteria andTaskWorkflowNotEqualTo(String value) {
            addCriterion("task_workflow <>", value, "taskWorkflow");
            return (Criteria) this;
        }

        public Criteria andTaskWorkflowGreaterThan(String value) {
            addCriterion("task_workflow >", value, "taskWorkflow");
            return (Criteria) this;
        }

        public Criteria andTaskWorkflowGreaterThanOrEqualTo(String value) {
            addCriterion("task_workflow >=", value, "taskWorkflow");
            return (Criteria) this;
        }

        public Criteria andTaskWorkflowLessThan(String value) {
            addCriterion("task_workflow <", value, "taskWorkflow");
            return (Criteria) this;
        }

        public Criteria andTaskWorkflowLessThanOrEqualTo(String value) {
            addCriterion("task_workflow <=", value, "taskWorkflow");
            return (Criteria) this;
        }

        public Criteria andTaskWorkflowLike(String value) {
            addCriterion("task_workflow like", value, "taskWorkflow");
            return (Criteria) this;
        }

        public Criteria andTaskWorkflowNotLike(String value) {
            addCriterion("task_workflow not like", value, "taskWorkflow");
            return (Criteria) this;
        }

        public Criteria andTaskWorkflowIn(List<String> values) {
            addCriterion("task_workflow in", values, "taskWorkflow");
            return (Criteria) this;
        }

        public Criteria andTaskWorkflowNotIn(List<String> values) {
            addCriterion("task_workflow not in", values, "taskWorkflow");
            return (Criteria) this;
        }

        public Criteria andTaskWorkflowBetween(String value1, String value2) {
            addCriterion("task_workflow between", value1, value2, "taskWorkflow");
            return (Criteria) this;
        }

        public Criteria andTaskWorkflowNotBetween(String value1, String value2) {
            addCriterion("task_workflow not between", value1, value2, "taskWorkflow");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNull() {
            addCriterion("receive_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNotNull() {
            addCriterion("receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeEqualTo(Date value) {
            addCriterion("receive_time =", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotEqualTo(Date value) {
            addCriterion("receive_time <>", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThan(Date value) {
            addCriterion("receive_time >", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receive_time >=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThan(Date value) {
            addCriterion("receive_time <", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("receive_time <=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIn(List<Date> values) {
            addCriterion("receive_time in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotIn(List<Date> values) {
            addCriterion("receive_time not in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeBetween(Date value1, Date value2) {
            addCriterion("receive_time between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("receive_time not between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andIsFlagIsNull() {
            addCriterion("is_flag is null");
            return (Criteria) this;
        }

        public Criteria andIsFlagIsNotNull() {
            addCriterion("is_flag is not null");
            return (Criteria) this;
        }

        public Criteria andIsFlagEqualTo(Byte value) {
            addCriterion("is_flag =", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagNotEqualTo(Byte value) {
            addCriterion("is_flag <>", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagGreaterThan(Byte value) {
            addCriterion("is_flag >", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_flag >=", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagLessThan(Byte value) {
            addCriterion("is_flag <", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagLessThanOrEqualTo(Byte value) {
            addCriterion("is_flag <=", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagIn(List<Byte> values) {
            addCriterion("is_flag in", values, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagNotIn(List<Byte> values) {
            addCriterion("is_flag not in", values, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagBetween(Byte value1, Byte value2) {
            addCriterion("is_flag between", value1, value2, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("is_flag not between", value1, value2, "isFlag");
            return (Criteria) this;
        }

        public Criteria andRegistSourceIsNull() {
            addCriterion("regist_source is null");
            return (Criteria) this;
        }

        public Criteria andRegistSourceIsNotNull() {
            addCriterion("regist_source is not null");
            return (Criteria) this;
        }

        public Criteria andRegistSourceEqualTo(String value) {
            addCriterion("regist_source =", value, "registSource");
            return (Criteria) this;
        }

        public Criteria andRegistSourceNotEqualTo(String value) {
            addCriterion("regist_source <>", value, "registSource");
            return (Criteria) this;
        }

        public Criteria andRegistSourceGreaterThan(String value) {
            addCriterion("regist_source >", value, "registSource");
            return (Criteria) this;
        }

        public Criteria andRegistSourceGreaterThanOrEqualTo(String value) {
            addCriterion("regist_source >=", value, "registSource");
            return (Criteria) this;
        }

        public Criteria andRegistSourceLessThan(String value) {
            addCriterion("regist_source <", value, "registSource");
            return (Criteria) this;
        }

        public Criteria andRegistSourceLessThanOrEqualTo(String value) {
            addCriterion("regist_source <=", value, "registSource");
            return (Criteria) this;
        }

        public Criteria andRegistSourceLike(String value) {
            addCriterion("regist_source like", value, "registSource");
            return (Criteria) this;
        }

        public Criteria andRegistSourceNotLike(String value) {
            addCriterion("regist_source not like", value, "registSource");
            return (Criteria) this;
        }

        public Criteria andRegistSourceIn(List<String> values) {
            addCriterion("regist_source in", values, "registSource");
            return (Criteria) this;
        }

        public Criteria andRegistSourceNotIn(List<String> values) {
            addCriterion("regist_source not in", values, "registSource");
            return (Criteria) this;
        }

        public Criteria andRegistSourceBetween(String value1, String value2) {
            addCriterion("regist_source between", value1, value2, "registSource");
            return (Criteria) this;
        }

        public Criteria andRegistSourceNotBetween(String value1, String value2) {
            addCriterion("regist_source not between", value1, value2, "registSource");
            return (Criteria) this;
        }

        public Criteria andCaseTypeIsNull() {
            addCriterion("case_type is null");
            return (Criteria) this;
        }

        public Criteria andCaseTypeIsNotNull() {
            addCriterion("case_type is not null");
            return (Criteria) this;
        }

        public Criteria andCaseTypeEqualTo(String value) {
            addCriterion("case_type =", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotEqualTo(String value) {
            addCriterion("case_type <>", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeGreaterThan(String value) {
            addCriterion("case_type >", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("case_type >=", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeLessThan(String value) {
            addCriterion("case_type <", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeLessThanOrEqualTo(String value) {
            addCriterion("case_type <=", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeLike(String value) {
            addCriterion("case_type like", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotLike(String value) {
            addCriterion("case_type not like", value, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeIn(List<String> values) {
            addCriterion("case_type in", values, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotIn(List<String> values) {
            addCriterion("case_type not in", values, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeBetween(String value1, String value2) {
            addCriterion("case_type between", value1, value2, "caseType");
            return (Criteria) this;
        }

        public Criteria andCaseTypeNotBetween(String value1, String value2) {
            addCriterion("case_type not between", value1, value2, "caseType");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("group_id like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("group_id not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andExtIsNull() {
            addCriterion("ext is null");
            return (Criteria) this;
        }

        public Criteria andExtIsNotNull() {
            addCriterion("ext is not null");
            return (Criteria) this;
        }

        public Criteria andExtEqualTo(String value) {
            addCriterion("ext =", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotEqualTo(String value) {
            addCriterion("ext <>", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtGreaterThan(String value) {
            addCriterion("ext >", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtGreaterThanOrEqualTo(String value) {
            addCriterion("ext >=", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLessThan(String value) {
            addCriterion("ext <", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLessThanOrEqualTo(String value) {
            addCriterion("ext <=", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLike(String value) {
            addCriterion("ext like", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotLike(String value) {
            addCriterion("ext not like", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtIn(List<String> values) {
            addCriterion("ext in", values, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotIn(List<String> values) {
            addCriterion("ext not in", values, "ext");
            return (Criteria) this;
        }

        public Criteria andExtBetween(String value1, String value2) {
            addCriterion("ext between", value1, value2, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotBetween(String value1, String value2) {
            addCriterion("ext not between", value1, value2, "ext");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Boolean value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Boolean value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Boolean value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Boolean value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Boolean> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Boolean> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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