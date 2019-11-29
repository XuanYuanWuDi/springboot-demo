package com.injured.server.api.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InjuredInvestigateHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InjuredInvestigateHistoryExample() {
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

        public Criteria andCountInvestigationsIsNull() {
            addCriterion("count_investigations is null");
            return (Criteria) this;
        }

        public Criteria andCountInvestigationsIsNotNull() {
            addCriterion("count_investigations is not null");
            return (Criteria) this;
        }

        public Criteria andCountInvestigationsEqualTo(Integer value) {
            addCriterion("count_investigations =", value, "countInvestigations");
            return (Criteria) this;
        }

        public Criteria andCountInvestigationsNotEqualTo(Integer value) {
            addCriterion("count_investigations <>", value, "countInvestigations");
            return (Criteria) this;
        }

        public Criteria andCountInvestigationsGreaterThan(Integer value) {
            addCriterion("count_investigations >", value, "countInvestigations");
            return (Criteria) this;
        }

        public Criteria andCountInvestigationsGreaterThanOrEqualTo(Integer value) {
            addCriterion("count_investigations >=", value, "countInvestigations");
            return (Criteria) this;
        }

        public Criteria andCountInvestigationsLessThan(Integer value) {
            addCriterion("count_investigations <", value, "countInvestigations");
            return (Criteria) this;
        }

        public Criteria andCountInvestigationsLessThanOrEqualTo(Integer value) {
            addCriterion("count_investigations <=", value, "countInvestigations");
            return (Criteria) this;
        }

        public Criteria andCountInvestigationsIn(List<Integer> values) {
            addCriterion("count_investigations in", values, "countInvestigations");
            return (Criteria) this;
        }

        public Criteria andCountInvestigationsNotIn(List<Integer> values) {
            addCriterion("count_investigations not in", values, "countInvestigations");
            return (Criteria) this;
        }

        public Criteria andCountInvestigationsBetween(Integer value1, Integer value2) {
            addCriterion("count_investigations between", value1, value2, "countInvestigations");
            return (Criteria) this;
        }

        public Criteria andCountInvestigationsNotBetween(Integer value1, Integer value2) {
            addCriterion("count_investigations not between", value1, value2, "countInvestigations");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNameIsNull() {
            addCriterion("investigator_name is null");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNameIsNotNull() {
            addCriterion("investigator_name is not null");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNameEqualTo(String value) {
            addCriterion("investigator_name =", value, "investigatorName");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNameNotEqualTo(String value) {
            addCriterion("investigator_name <>", value, "investigatorName");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNameGreaterThan(String value) {
            addCriterion("investigator_name >", value, "investigatorName");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("investigator_name >=", value, "investigatorName");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNameLessThan(String value) {
            addCriterion("investigator_name <", value, "investigatorName");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNameLessThanOrEqualTo(String value) {
            addCriterion("investigator_name <=", value, "investigatorName");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNameLike(String value) {
            addCriterion("investigator_name like", value, "investigatorName");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNameNotLike(String value) {
            addCriterion("investigator_name not like", value, "investigatorName");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNameIn(List<String> values) {
            addCriterion("investigator_name in", values, "investigatorName");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNameNotIn(List<String> values) {
            addCriterion("investigator_name not in", values, "investigatorName");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNameBetween(String value1, String value2) {
            addCriterion("investigator_name between", value1, value2, "investigatorName");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNameNotBetween(String value1, String value2) {
            addCriterion("investigator_name not between", value1, value2, "investigatorName");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNoIsNull() {
            addCriterion("investigator_no is null");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNoIsNotNull() {
            addCriterion("investigator_no is not null");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNoEqualTo(String value) {
            addCriterion("investigator_no =", value, "investigatorNo");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNoNotEqualTo(String value) {
            addCriterion("investigator_no <>", value, "investigatorNo");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNoGreaterThan(String value) {
            addCriterion("investigator_no >", value, "investigatorNo");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNoGreaterThanOrEqualTo(String value) {
            addCriterion("investigator_no >=", value, "investigatorNo");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNoLessThan(String value) {
            addCriterion("investigator_no <", value, "investigatorNo");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNoLessThanOrEqualTo(String value) {
            addCriterion("investigator_no <=", value, "investigatorNo");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNoLike(String value) {
            addCriterion("investigator_no like", value, "investigatorNo");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNoNotLike(String value) {
            addCriterion("investigator_no not like", value, "investigatorNo");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNoIn(List<String> values) {
            addCriterion("investigator_no in", values, "investigatorNo");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNoNotIn(List<String> values) {
            addCriterion("investigator_no not in", values, "investigatorNo");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNoBetween(String value1, String value2) {
            addCriterion("investigator_no between", value1, value2, "investigatorNo");
            return (Criteria) this;
        }

        public Criteria andInvestigatorNoNotBetween(String value1, String value2) {
            addCriterion("investigator_no not between", value1, value2, "investigatorNo");
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

        public Criteria andReviewerIsNull() {
            addCriterion("reviewer is null");
            return (Criteria) this;
        }

        public Criteria andReviewerIsNotNull() {
            addCriterion("reviewer is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerEqualTo(String value) {
            addCriterion("reviewer =", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotEqualTo(String value) {
            addCriterion("reviewer <>", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerGreaterThan(String value) {
            addCriterion("reviewer >", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerGreaterThanOrEqualTo(String value) {
            addCriterion("reviewer >=", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLessThan(String value) {
            addCriterion("reviewer <", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLessThanOrEqualTo(String value) {
            addCriterion("reviewer <=", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLike(String value) {
            addCriterion("reviewer like", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotLike(String value) {
            addCriterion("reviewer not like", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerIn(List<String> values) {
            addCriterion("reviewer in", values, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotIn(List<String> values) {
            addCriterion("reviewer not in", values, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerBetween(String value1, String value2) {
            addCriterion("reviewer between", value1, value2, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotBetween(String value1, String value2) {
            addCriterion("reviewer not between", value1, value2, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerTimeIsNull() {
            addCriterion("reviewer_time is null");
            return (Criteria) this;
        }

        public Criteria andReviewerTimeIsNotNull() {
            addCriterion("reviewer_time is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerTimeEqualTo(Date value) {
            addCriterion("reviewer_time =", value, "reviewerTime");
            return (Criteria) this;
        }

        public Criteria andReviewerTimeNotEqualTo(Date value) {
            addCriterion("reviewer_time <>", value, "reviewerTime");
            return (Criteria) this;
        }

        public Criteria andReviewerTimeGreaterThan(Date value) {
            addCriterion("reviewer_time >", value, "reviewerTime");
            return (Criteria) this;
        }

        public Criteria andReviewerTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reviewer_time >=", value, "reviewerTime");
            return (Criteria) this;
        }

        public Criteria andReviewerTimeLessThan(Date value) {
            addCriterion("reviewer_time <", value, "reviewerTime");
            return (Criteria) this;
        }

        public Criteria andReviewerTimeLessThanOrEqualTo(Date value) {
            addCriterion("reviewer_time <=", value, "reviewerTime");
            return (Criteria) this;
        }

        public Criteria andReviewerTimeIn(List<Date> values) {
            addCriterion("reviewer_time in", values, "reviewerTime");
            return (Criteria) this;
        }

        public Criteria andReviewerTimeNotIn(List<Date> values) {
            addCriterion("reviewer_time not in", values, "reviewerTime");
            return (Criteria) this;
        }

        public Criteria andReviewerTimeBetween(Date value1, Date value2) {
            addCriterion("reviewer_time between", value1, value2, "reviewerTime");
            return (Criteria) this;
        }

        public Criteria andReviewerTimeNotBetween(Date value1, Date value2) {
            addCriterion("reviewer_time not between", value1, value2, "reviewerTime");
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

        public Criteria andReviewerAmountIsNull() {
            addCriterion("reviewer_amount is null");
            return (Criteria) this;
        }

        public Criteria andReviewerAmountIsNotNull() {
            addCriterion("reviewer_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerAmountEqualTo(BigDecimal value) {
            addCriterion("reviewer_amount =", value, "reviewerAmount");
            return (Criteria) this;
        }

        public Criteria andReviewerAmountNotEqualTo(BigDecimal value) {
            addCriterion("reviewer_amount <>", value, "reviewerAmount");
            return (Criteria) this;
        }

        public Criteria andReviewerAmountGreaterThan(BigDecimal value) {
            addCriterion("reviewer_amount >", value, "reviewerAmount");
            return (Criteria) this;
        }

        public Criteria andReviewerAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reviewer_amount >=", value, "reviewerAmount");
            return (Criteria) this;
        }

        public Criteria andReviewerAmountLessThan(BigDecimal value) {
            addCriterion("reviewer_amount <", value, "reviewerAmount");
            return (Criteria) this;
        }

        public Criteria andReviewerAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reviewer_amount <=", value, "reviewerAmount");
            return (Criteria) this;
        }

        public Criteria andReviewerAmountIn(List<BigDecimal> values) {
            addCriterion("reviewer_amount in", values, "reviewerAmount");
            return (Criteria) this;
        }

        public Criteria andReviewerAmountNotIn(List<BigDecimal> values) {
            addCriterion("reviewer_amount not in", values, "reviewerAmount");
            return (Criteria) this;
        }

        public Criteria andReviewerAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reviewer_amount between", value1, value2, "reviewerAmount");
            return (Criteria) this;
        }

        public Criteria andReviewerAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reviewer_amount not between", value1, value2, "reviewerAmount");
            return (Criteria) this;
        }

        public Criteria andReviewerOpinionIsNull() {
            addCriterion("reviewer_opinion is null");
            return (Criteria) this;
        }

        public Criteria andReviewerOpinionIsNotNull() {
            addCriterion("reviewer_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerOpinionEqualTo(Integer value) {
            addCriterion("reviewer_opinion =", value, "reviewerOpinion");
            return (Criteria) this;
        }

        public Criteria andReviewerOpinionNotEqualTo(Integer value) {
            addCriterion("reviewer_opinion <>", value, "reviewerOpinion");
            return (Criteria) this;
        }

        public Criteria andReviewerOpinionGreaterThan(Integer value) {
            addCriterion("reviewer_opinion >", value, "reviewerOpinion");
            return (Criteria) this;
        }

        public Criteria andReviewerOpinionGreaterThanOrEqualTo(Integer value) {
            addCriterion("reviewer_opinion >=", value, "reviewerOpinion");
            return (Criteria) this;
        }

        public Criteria andReviewerOpinionLessThan(Integer value) {
            addCriterion("reviewer_opinion <", value, "reviewerOpinion");
            return (Criteria) this;
        }

        public Criteria andReviewerOpinionLessThanOrEqualTo(Integer value) {
            addCriterion("reviewer_opinion <=", value, "reviewerOpinion");
            return (Criteria) this;
        }

        public Criteria andReviewerOpinionIn(List<Integer> values) {
            addCriterion("reviewer_opinion in", values, "reviewerOpinion");
            return (Criteria) this;
        }

        public Criteria andReviewerOpinionNotIn(List<Integer> values) {
            addCriterion("reviewer_opinion not in", values, "reviewerOpinion");
            return (Criteria) this;
        }

        public Criteria andReviewerOpinionBetween(Integer value1, Integer value2) {
            addCriterion("reviewer_opinion between", value1, value2, "reviewerOpinion");
            return (Criteria) this;
        }

        public Criteria andReviewerOpinionNotBetween(Integer value1, Integer value2) {
            addCriterion("reviewer_opinion not between", value1, value2, "reviewerOpinion");
            return (Criteria) this;
        }

        public Criteria andNextTrackTimeIsNull() {
            addCriterion("next_track_time is null");
            return (Criteria) this;
        }

        public Criteria andNextTrackTimeIsNotNull() {
            addCriterion("next_track_time is not null");
            return (Criteria) this;
        }

        public Criteria andNextTrackTimeEqualTo(Date value) {
            addCriterion("next_track_time =", value, "nextTrackTime");
            return (Criteria) this;
        }

        public Criteria andNextTrackTimeNotEqualTo(Date value) {
            addCriterion("next_track_time <>", value, "nextTrackTime");
            return (Criteria) this;
        }

        public Criteria andNextTrackTimeGreaterThan(Date value) {
            addCriterion("next_track_time >", value, "nextTrackTime");
            return (Criteria) this;
        }

        public Criteria andNextTrackTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("next_track_time >=", value, "nextTrackTime");
            return (Criteria) this;
        }

        public Criteria andNextTrackTimeLessThan(Date value) {
            addCriterion("next_track_time <", value, "nextTrackTime");
            return (Criteria) this;
        }

        public Criteria andNextTrackTimeLessThanOrEqualTo(Date value) {
            addCriterion("next_track_time <=", value, "nextTrackTime");
            return (Criteria) this;
        }

        public Criteria andNextTrackTimeIn(List<Date> values) {
            addCriterion("next_track_time in", values, "nextTrackTime");
            return (Criteria) this;
        }

        public Criteria andNextTrackTimeNotIn(List<Date> values) {
            addCriterion("next_track_time not in", values, "nextTrackTime");
            return (Criteria) this;
        }

        public Criteria andNextTrackTimeBetween(Date value1, Date value2) {
            addCriterion("next_track_time between", value1, value2, "nextTrackTime");
            return (Criteria) this;
        }

        public Criteria andNextTrackTimeNotBetween(Date value1, Date value2) {
            addCriterion("next_track_time not between", value1, value2, "nextTrackTime");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNull() {
            addCriterion("task_status is null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNotNull() {
            addCriterion("task_status is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusEqualTo(Integer value) {
            addCriterion("task_status =", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotEqualTo(Integer value) {
            addCriterion("task_status <>", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThan(Integer value) {
            addCriterion("task_status >", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_status >=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThan(Integer value) {
            addCriterion("task_status <", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThanOrEqualTo(Integer value) {
            addCriterion("task_status <=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIn(List<Integer> values) {
            addCriterion("task_status in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotIn(List<Integer> values) {
            addCriterion("task_status not in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusBetween(Integer value1, Integer value2) {
            addCriterion("task_status between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("task_status not between", value1, value2, "taskStatus");
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