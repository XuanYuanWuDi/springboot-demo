package com.injured.server.api.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InjuredFastCompensatInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

	protected String powersScope;

    public String getPowersScope() {
		return powersScope;
	}

	public void setPowersScope(String powersScope) {
		this.powersScope = powersScope;
	}

	public InjuredFastCompensatInfoExample() {
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

    public void setOredCriteria(List<Criteria> oredCriteria) {
		this.oredCriteria = oredCriteria;
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

        public Criteria andTaskNoIsNull() {
            addCriterion("task_no is null");
            return (Criteria) this;
        }

        public Criteria andTaskNoIsNotNull() {
            addCriterion("task_no is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNoEqualTo(String value) {
            addCriterion("task_no =", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoNotEqualTo(String value) {
            addCriterion("task_no <>", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoGreaterThan(String value) {
            addCriterion("task_no >", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoGreaterThanOrEqualTo(String value) {
            addCriterion("task_no >=", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoLessThan(String value) {
            addCriterion("task_no <", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoLessThanOrEqualTo(String value) {
            addCriterion("task_no <=", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoLike(String value) {
            addCriterion("task_no like", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoNotLike(String value) {
            addCriterion("task_no not like", value, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoIn(List<String> values) {
            addCriterion("task_no in", values, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoNotIn(List<String> values) {
            addCriterion("task_no not in", values, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoBetween(String value1, String value2) {
            addCriterion("task_no between", value1, value2, "taskNo");
            return (Criteria) this;
        }

        public Criteria andTaskNoNotBetween(String value1, String value2) {
            addCriterion("task_no not between", value1, value2, "taskNo");
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

        public Criteria andCompanyAgencyCodeIsNull() {
            addCriterion("company_agency_code is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyCodeIsNotNull() {
            addCriterion("company_agency_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyCodeEqualTo(String value) {
            addCriterion("company_agency_code =", value, "companyAgencyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyCodeNotEqualTo(String value) {
            addCriterion("company_agency_code <>", value, "companyAgencyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyCodeGreaterThan(String value) {
            addCriterion("company_agency_code >", value, "companyAgencyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("company_agency_code >=", value, "companyAgencyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyCodeLessThan(String value) {
            addCriterion("company_agency_code <", value, "companyAgencyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyCodeLessThanOrEqualTo(String value) {
            addCriterion("company_agency_code <=", value, "companyAgencyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyCodeLike(String value) {
            addCriterion("company_agency_code like", value, "companyAgencyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyCodeNotLike(String value) {
            addCriterion("company_agency_code not like", value, "companyAgencyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyCodeIn(List<String> values) {
            addCriterion("company_agency_code in", values, "companyAgencyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyCodeNotIn(List<String> values) {
            addCriterion("company_agency_code not in", values, "companyAgencyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyCodeBetween(String value1, String value2) {
            addCriterion("company_agency_code between", value1, value2, "companyAgencyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyCodeNotBetween(String value1, String value2) {
            addCriterion("company_agency_code not between", value1, value2, "companyAgencyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyNameIsNull() {
            addCriterion("company_agency_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyNameIsNotNull() {
            addCriterion("company_agency_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyNameEqualTo(String value) {
            addCriterion("company_agency_name =", value, "companyAgencyName");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyNameNotEqualTo(String value) {
            addCriterion("company_agency_name <>", value, "companyAgencyName");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyNameGreaterThan(String value) {
            addCriterion("company_agency_name >", value, "companyAgencyName");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_agency_name >=", value, "companyAgencyName");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyNameLessThan(String value) {
            addCriterion("company_agency_name <", value, "companyAgencyName");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyNameLessThanOrEqualTo(String value) {
            addCriterion("company_agency_name <=", value, "companyAgencyName");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyNameLike(String value) {
            addCriterion("company_agency_name like", value, "companyAgencyName");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyNameNotLike(String value) {
            addCriterion("company_agency_name not like", value, "companyAgencyName");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyNameIn(List<String> values) {
            addCriterion("company_agency_name in", values, "companyAgencyName");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyNameNotIn(List<String> values) {
            addCriterion("company_agency_name not in", values, "companyAgencyName");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyNameBetween(String value1, String value2) {
            addCriterion("company_agency_name between", value1, value2, "companyAgencyName");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyNameNotBetween(String value1, String value2) {
            addCriterion("company_agency_name not between", value1, value2, "companyAgencyName");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyIdIsNull() {
            addCriterion("company_agency_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyIdIsNotNull() {
            addCriterion("company_agency_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyIdEqualTo(Long value) {
            addCriterion("company_agency_id =", value, "companyAgencyId");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyIdNotEqualTo(Long value) {
            addCriterion("company_agency_id <>", value, "companyAgencyId");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyIdGreaterThan(Long value) {
            addCriterion("company_agency_id >", value, "companyAgencyId");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("company_agency_id >=", value, "companyAgencyId");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyIdLessThan(Long value) {
            addCriterion("company_agency_id <", value, "companyAgencyId");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyIdLessThanOrEqualTo(Long value) {
            addCriterion("company_agency_id <=", value, "companyAgencyId");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyIdIn(List<Long> values) {
            addCriterion("company_agency_id in", values, "companyAgencyId");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyIdNotIn(List<Long> values) {
            addCriterion("company_agency_id not in", values, "companyAgencyId");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyIdBetween(Long value1, Long value2) {
            addCriterion("company_agency_id between", value1, value2, "companyAgencyId");
            return (Criteria) this;
        }

        public Criteria andCompanyAgencyIdNotBetween(Long value1, Long value2) {
            addCriterion("company_agency_id not between", value1, value2, "companyAgencyId");
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

        public Criteria andMainDrivingStatusIsNull() {
            addCriterion("main_driving_status is null");
            return (Criteria) this;
        }

        public Criteria andMainDrivingStatusIsNotNull() {
            addCriterion("main_driving_status is not null");
            return (Criteria) this;
        }

        public Criteria andMainDrivingStatusEqualTo(Byte value) {
            addCriterion("main_driving_status =", value, "mainDrivingStatus");
            return (Criteria) this;
        }

        public Criteria andMainDrivingStatusNotEqualTo(Byte value) {
            addCriterion("main_driving_status <>", value, "mainDrivingStatus");
            return (Criteria) this;
        }

        public Criteria andMainDrivingStatusGreaterThan(Byte value) {
            addCriterion("main_driving_status >", value, "mainDrivingStatus");
            return (Criteria) this;
        }

        public Criteria andMainDrivingStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("main_driving_status >=", value, "mainDrivingStatus");
            return (Criteria) this;
        }

        public Criteria andMainDrivingStatusLessThan(Byte value) {
            addCriterion("main_driving_status <", value, "mainDrivingStatus");
            return (Criteria) this;
        }

        public Criteria andMainDrivingStatusLessThanOrEqualTo(Byte value) {
            addCriterion("main_driving_status <=", value, "mainDrivingStatus");
            return (Criteria) this;
        }

        public Criteria andMainDrivingStatusIn(List<Byte> values) {
            addCriterion("main_driving_status in", values, "mainDrivingStatus");
            return (Criteria) this;
        }

        public Criteria andMainDrivingStatusNotIn(List<Byte> values) {
            addCriterion("main_driving_status not in", values, "mainDrivingStatus");
            return (Criteria) this;
        }

        public Criteria andMainDrivingStatusBetween(Byte value1, Byte value2) {
            addCriterion("main_driving_status between", value1, value2, "mainDrivingStatus");
            return (Criteria) this;
        }

        public Criteria andMainDrivingStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("main_driving_status not between", value1, value2, "mainDrivingStatus");
            return (Criteria) this;
        }

        public Criteria andWouTransportatIsNull() {
            addCriterion("wou_transportat is null");
            return (Criteria) this;
        }

        public Criteria andWouTransportatIsNotNull() {
            addCriterion("wou_transportat is not null");
            return (Criteria) this;
        }

        public Criteria andWouTransportatEqualTo(Integer value) {
            addCriterion("wou_transportat =", value, "wouTransportat");
            return (Criteria) this;
        }

        public Criteria andWouTransportatNotEqualTo(Integer value) {
            addCriterion("wou_transportat <>", value, "wouTransportat");
            return (Criteria) this;
        }

        public Criteria andWouTransportatGreaterThan(Integer value) {
            addCriterion("wou_transportat >", value, "wouTransportat");
            return (Criteria) this;
        }

        public Criteria andWouTransportatGreaterThanOrEqualTo(Integer value) {
            addCriterion("wou_transportat >=", value, "wouTransportat");
            return (Criteria) this;
        }

        public Criteria andWouTransportatLessThan(Integer value) {
            addCriterion("wou_transportat <", value, "wouTransportat");
            return (Criteria) this;
        }

        public Criteria andWouTransportatLessThanOrEqualTo(Integer value) {
            addCriterion("wou_transportat <=", value, "wouTransportat");
            return (Criteria) this;
        }

        public Criteria andWouTransportatIn(List<Integer> values) {
            addCriterion("wou_transportat in", values, "wouTransportat");
            return (Criteria) this;
        }

        public Criteria andWouTransportatNotIn(List<Integer> values) {
            addCriterion("wou_transportat not in", values, "wouTransportat");
            return (Criteria) this;
        }

        public Criteria andWouTransportatBetween(Integer value1, Integer value2) {
            addCriterion("wou_transportat between", value1, value2, "wouTransportat");
            return (Criteria) this;
        }

        public Criteria andWouTransportatNotBetween(Integer value1, Integer value2) {
            addCriterion("wou_transportat not between", value1, value2, "wouTransportat");
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

        public Criteria andSurveyFirstAddressIsNull() {
            addCriterion("survey_first_address is null");
            return (Criteria) this;
        }

        public Criteria andSurveyFirstAddressIsNotNull() {
            addCriterion("survey_first_address is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyFirstAddressEqualTo(Integer value) {
            addCriterion("survey_first_address =", value, "surveyFirstAddress");
            return (Criteria) this;
        }

        public Criteria andSurveyFirstAddressNotEqualTo(Integer value) {
            addCriterion("survey_first_address <>", value, "surveyFirstAddress");
            return (Criteria) this;
        }

        public Criteria andSurveyFirstAddressGreaterThan(Integer value) {
            addCriterion("survey_first_address >", value, "surveyFirstAddress");
            return (Criteria) this;
        }

        public Criteria andSurveyFirstAddressGreaterThanOrEqualTo(Integer value) {
            addCriterion("survey_first_address >=", value, "surveyFirstAddress");
            return (Criteria) this;
        }

        public Criteria andSurveyFirstAddressLessThan(Integer value) {
            addCriterion("survey_first_address <", value, "surveyFirstAddress");
            return (Criteria) this;
        }

        public Criteria andSurveyFirstAddressLessThanOrEqualTo(Integer value) {
            addCriterion("survey_first_address <=", value, "surveyFirstAddress");
            return (Criteria) this;
        }

        public Criteria andSurveyFirstAddressIn(List<Integer> values) {
            addCriterion("survey_first_address in", values, "surveyFirstAddress");
            return (Criteria) this;
        }

        public Criteria andSurveyFirstAddressNotIn(List<Integer> values) {
            addCriterion("survey_first_address not in", values, "surveyFirstAddress");
            return (Criteria) this;
        }

        public Criteria andSurveyFirstAddressBetween(Integer value1, Integer value2) {
            addCriterion("survey_first_address between", value1, value2, "surveyFirstAddress");
            return (Criteria) this;
        }

        public Criteria andSurveyFirstAddressNotBetween(Integer value1, Integer value2) {
            addCriterion("survey_first_address not between", value1, value2, "surveyFirstAddress");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIsNull() {
            addCriterion("visit_time is null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIsNotNull() {
            addCriterion("visit_time is not null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeEqualTo(Date value) {
            addCriterion("visit_time =", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotEqualTo(Date value) {
            addCriterion("visit_time <>", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeGreaterThan(Date value) {
            addCriterion("visit_time >", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("visit_time >=", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLessThan(Date value) {
            addCriterion("visit_time <", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLessThanOrEqualTo(Date value) {
            addCriterion("visit_time <=", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIn(List<Date> values) {
            addCriterion("visit_time in", values, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotIn(List<Date> values) {
            addCriterion("visit_time not in", values, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeBetween(Date value1, Date value2) {
            addCriterion("visit_time between", value1, value2, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotBetween(Date value1, Date value2) {
            addCriterion("visit_time not between", value1, value2, "visitTime");
            return (Criteria) this;
        }

        public Criteria andMedicalExpensesFeeIsNull() {
            addCriterion("medical_expenses_fee is null");
            return (Criteria) this;
        }

        public Criteria andMedicalExpensesFeeIsNotNull() {
            addCriterion("medical_expenses_fee is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalExpensesFeeEqualTo(BigDecimal value) {
            addCriterion("medical_expenses_fee =", value, "medicalExpensesFee");
            return (Criteria) this;
        }

        public Criteria andMedicalExpensesFeeNotEqualTo(BigDecimal value) {
            addCriterion("medical_expenses_fee <>", value, "medicalExpensesFee");
            return (Criteria) this;
        }

        public Criteria andMedicalExpensesFeeGreaterThan(BigDecimal value) {
            addCriterion("medical_expenses_fee >", value, "medicalExpensesFee");
            return (Criteria) this;
        }

        public Criteria andMedicalExpensesFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("medical_expenses_fee >=", value, "medicalExpensesFee");
            return (Criteria) this;
        }

        public Criteria andMedicalExpensesFeeLessThan(BigDecimal value) {
            addCriterion("medical_expenses_fee <", value, "medicalExpensesFee");
            return (Criteria) this;
        }

        public Criteria andMedicalExpensesFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("medical_expenses_fee <=", value, "medicalExpensesFee");
            return (Criteria) this;
        }

        public Criteria andMedicalExpensesFeeIn(List<BigDecimal> values) {
            addCriterion("medical_expenses_fee in", values, "medicalExpensesFee");
            return (Criteria) this;
        }

        public Criteria andMedicalExpensesFeeNotIn(List<BigDecimal> values) {
            addCriterion("medical_expenses_fee not in", values, "medicalExpensesFee");
            return (Criteria) this;
        }

        public Criteria andMedicalExpensesFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("medical_expenses_fee between", value1, value2, "medicalExpensesFee");
            return (Criteria) this;
        }

        public Criteria andMedicalExpensesFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("medical_expenses_fee not between", value1, value2, "medicalExpensesFee");
            return (Criteria) this;
        }

        public Criteria andIncomeStatusIsNull() {
            addCriterion("income_status is null");
            return (Criteria) this;
        }

        public Criteria andIncomeStatusIsNotNull() {
            addCriterion("income_status is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeStatusEqualTo(Byte value) {
            addCriterion("income_status =", value, "incomeStatus");
            return (Criteria) this;
        }

        public Criteria andIncomeStatusNotEqualTo(Byte value) {
            addCriterion("income_status <>", value, "incomeStatus");
            return (Criteria) this;
        }

        public Criteria andIncomeStatusGreaterThan(Byte value) {
            addCriterion("income_status >", value, "incomeStatus");
            return (Criteria) this;
        }

        public Criteria andIncomeStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("income_status >=", value, "incomeStatus");
            return (Criteria) this;
        }

        public Criteria andIncomeStatusLessThan(Byte value) {
            addCriterion("income_status <", value, "incomeStatus");
            return (Criteria) this;
        }

        public Criteria andIncomeStatusLessThanOrEqualTo(Byte value) {
            addCriterion("income_status <=", value, "incomeStatus");
            return (Criteria) this;
        }

        public Criteria andIncomeStatusIn(List<Byte> values) {
            addCriterion("income_status in", values, "incomeStatus");
            return (Criteria) this;
        }

        public Criteria andIncomeStatusNotIn(List<Byte> values) {
            addCriterion("income_status not in", values, "incomeStatus");
            return (Criteria) this;
        }

        public Criteria andIncomeStatusBetween(Byte value1, Byte value2) {
            addCriterion("income_status between", value1, value2, "incomeStatus");
            return (Criteria) this;
        }

        public Criteria andIncomeStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("income_status not between", value1, value2, "incomeStatus");
            return (Criteria) this;
        }

        public Criteria andEngagedIndustryIsNull() {
            addCriterion("engaged_industry is null");
            return (Criteria) this;
        }

        public Criteria andEngagedIndustryIsNotNull() {
            addCriterion("engaged_industry is not null");
            return (Criteria) this;
        }

        public Criteria andEngagedIndustryEqualTo(Integer value) {
            addCriterion("engaged_industry =", value, "engagedIndustry");
            return (Criteria) this;
        }

        public Criteria andEngagedIndustryNotEqualTo(Integer value) {
            addCriterion("engaged_industry <>", value, "engagedIndustry");
            return (Criteria) this;
        }

        public Criteria andEngagedIndustryGreaterThan(Integer value) {
            addCriterion("engaged_industry >", value, "engagedIndustry");
            return (Criteria) this;
        }

        public Criteria andEngagedIndustryGreaterThanOrEqualTo(Integer value) {
            addCriterion("engaged_industry >=", value, "engagedIndustry");
            return (Criteria) this;
        }

        public Criteria andEngagedIndustryLessThan(Integer value) {
            addCriterion("engaged_industry <", value, "engagedIndustry");
            return (Criteria) this;
        }

        public Criteria andEngagedIndustryLessThanOrEqualTo(Integer value) {
            addCriterion("engaged_industry <=", value, "engagedIndustry");
            return (Criteria) this;
        }

        public Criteria andEngagedIndustryIn(List<Integer> values) {
            addCriterion("engaged_industry in", values, "engagedIndustry");
            return (Criteria) this;
        }

        public Criteria andEngagedIndustryNotIn(List<Integer> values) {
            addCriterion("engaged_industry not in", values, "engagedIndustry");
            return (Criteria) this;
        }

        public Criteria andEngagedIndustryBetween(Integer value1, Integer value2) {
            addCriterion("engaged_industry between", value1, value2, "engagedIndustry");
            return (Criteria) this;
        }

        public Criteria andEngagedIndustryNotBetween(Integer value1, Integer value2) {
            addCriterion("engaged_industry not between", value1, value2, "engagedIndustry");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeIsNull() {
            addCriterion("monthly_income is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeIsNotNull() {
            addCriterion("monthly_income is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeEqualTo(BigDecimal value) {
            addCriterion("monthly_income =", value, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeNotEqualTo(BigDecimal value) {
            addCriterion("monthly_income <>", value, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeGreaterThan(BigDecimal value) {
            addCriterion("monthly_income >", value, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("monthly_income >=", value, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeLessThan(BigDecimal value) {
            addCriterion("monthly_income <", value, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("monthly_income <=", value, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeIn(List<BigDecimal> values) {
            addCriterion("monthly_income in", values, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeNotIn(List<BigDecimal> values) {
            addCriterion("monthly_income not in", values, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monthly_income between", value1, value2, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andMonthlyIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("monthly_income not between", value1, value2, "monthlyIncome");
            return (Criteria) this;
        }

        public Criteria andReceiptNameIsNull() {
            addCriterion("receipt_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiptNameIsNotNull() {
            addCriterion("receipt_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptNameEqualTo(String value) {
            addCriterion("receipt_name =", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameNotEqualTo(String value) {
            addCriterion("receipt_name <>", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameGreaterThan(String value) {
            addCriterion("receipt_name >", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameGreaterThanOrEqualTo(String value) {
            addCriterion("receipt_name >=", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameLessThan(String value) {
            addCriterion("receipt_name <", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameLessThanOrEqualTo(String value) {
            addCriterion("receipt_name <=", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameLike(String value) {
            addCriterion("receipt_name like", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameNotLike(String value) {
            addCriterion("receipt_name not like", value, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameIn(List<String> values) {
            addCriterion("receipt_name in", values, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameNotIn(List<String> values) {
            addCriterion("receipt_name not in", values, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameBetween(String value1, String value2) {
            addCriterion("receipt_name between", value1, value2, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptNameNotBetween(String value1, String value2) {
            addCriterion("receipt_name not between", value1, value2, "receiptName");
            return (Criteria) this;
        }

        public Criteria andReceiptAccountIsNull() {
            addCriterion("receipt_account is null");
            return (Criteria) this;
        }

        public Criteria andReceiptAccountIsNotNull() {
            addCriterion("receipt_account is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptAccountEqualTo(String value) {
            addCriterion("receipt_account =", value, "receiptAccount");
            return (Criteria) this;
        }

        public Criteria andReceiptAccountNotEqualTo(String value) {
            addCriterion("receipt_account <>", value, "receiptAccount");
            return (Criteria) this;
        }

        public Criteria andReceiptAccountGreaterThan(String value) {
            addCriterion("receipt_account >", value, "receiptAccount");
            return (Criteria) this;
        }

        public Criteria andReceiptAccountGreaterThanOrEqualTo(String value) {
            addCriterion("receipt_account >=", value, "receiptAccount");
            return (Criteria) this;
        }

        public Criteria andReceiptAccountLessThan(String value) {
            addCriterion("receipt_account <", value, "receiptAccount");
            return (Criteria) this;
        }

        public Criteria andReceiptAccountLessThanOrEqualTo(String value) {
            addCriterion("receipt_account <=", value, "receiptAccount");
            return (Criteria) this;
        }

        public Criteria andReceiptAccountLike(String value) {
            addCriterion("receipt_account like", value, "receiptAccount");
            return (Criteria) this;
        }

        public Criteria andReceiptAccountNotLike(String value) {
            addCriterion("receipt_account not like", value, "receiptAccount");
            return (Criteria) this;
        }

        public Criteria andReceiptAccountIn(List<String> values) {
            addCriterion("receipt_account in", values, "receiptAccount");
            return (Criteria) this;
        }

        public Criteria andReceiptAccountNotIn(List<String> values) {
            addCriterion("receipt_account not in", values, "receiptAccount");
            return (Criteria) this;
        }

        public Criteria andReceiptAccountBetween(String value1, String value2) {
            addCriterion("receipt_account between", value1, value2, "receiptAccount");
            return (Criteria) this;
        }

        public Criteria andReceiptAccountNotBetween(String value1, String value2) {
            addCriterion("receipt_account not between", value1, value2, "receiptAccount");
            return (Criteria) this;
        }

        public Criteria andReceiptBankIsNull() {
            addCriterion("receipt_bank is null");
            return (Criteria) this;
        }

        public Criteria andReceiptBankIsNotNull() {
            addCriterion("receipt_bank is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptBankEqualTo(String value) {
            addCriterion("receipt_bank =", value, "receiptBank");
            return (Criteria) this;
        }

        public Criteria andReceiptBankNotEqualTo(String value) {
            addCriterion("receipt_bank <>", value, "receiptBank");
            return (Criteria) this;
        }

        public Criteria andReceiptBankGreaterThan(String value) {
            addCriterion("receipt_bank >", value, "receiptBank");
            return (Criteria) this;
        }

        public Criteria andReceiptBankGreaterThanOrEqualTo(String value) {
            addCriterion("receipt_bank >=", value, "receiptBank");
            return (Criteria) this;
        }

        public Criteria andReceiptBankLessThan(String value) {
            addCriterion("receipt_bank <", value, "receiptBank");
            return (Criteria) this;
        }

        public Criteria andReceiptBankLessThanOrEqualTo(String value) {
            addCriterion("receipt_bank <=", value, "receiptBank");
            return (Criteria) this;
        }

        public Criteria andReceiptBankLike(String value) {
            addCriterion("receipt_bank like", value, "receiptBank");
            return (Criteria) this;
        }

        public Criteria andReceiptBankNotLike(String value) {
            addCriterion("receipt_bank not like", value, "receiptBank");
            return (Criteria) this;
        }

        public Criteria andReceiptBankIn(List<String> values) {
            addCriterion("receipt_bank in", values, "receiptBank");
            return (Criteria) this;
        }

        public Criteria andReceiptBankNotIn(List<String> values) {
            addCriterion("receipt_bank not in", values, "receiptBank");
            return (Criteria) this;
        }

        public Criteria andReceiptBankBetween(String value1, String value2) {
            addCriterion("receipt_bank between", value1, value2, "receiptBank");
            return (Criteria) this;
        }

        public Criteria andReceiptBankNotBetween(String value1, String value2) {
            addCriterion("receipt_bank not between", value1, value2, "receiptBank");
            return (Criteria) this;
        }

        public Criteria andLossFirstTypeIsNull() {
            addCriterion("loss_first_type is null");
            return (Criteria) this;
        }

        public Criteria andLossFirstTypeIsNotNull() {
            addCriterion("loss_first_type is not null");
            return (Criteria) this;
        }

        public Criteria andLossFirstTypeEqualTo(String value) {
            addCriterion("loss_first_type =", value, "lossFirstType");
            return (Criteria) this;
        }

        public Criteria andLossFirstTypeNotEqualTo(String value) {
            addCriterion("loss_first_type <>", value, "lossFirstType");
            return (Criteria) this;
        }

        public Criteria andLossFirstTypeGreaterThan(String value) {
            addCriterion("loss_first_type >", value, "lossFirstType");
            return (Criteria) this;
        }

        public Criteria andLossFirstTypeGreaterThanOrEqualTo(String value) {
            addCriterion("loss_first_type >=", value, "lossFirstType");
            return (Criteria) this;
        }

        public Criteria andLossFirstTypeLessThan(String value) {
            addCriterion("loss_first_type <", value, "lossFirstType");
            return (Criteria) this;
        }

        public Criteria andLossFirstTypeLessThanOrEqualTo(String value) {
            addCriterion("loss_first_type <=", value, "lossFirstType");
            return (Criteria) this;
        }

        public Criteria andLossFirstTypeLike(String value) {
            addCriterion("loss_first_type like", value, "lossFirstType");
            return (Criteria) this;
        }

        public Criteria andLossFirstTypeNotLike(String value) {
            addCriterion("loss_first_type not like", value, "lossFirstType");
            return (Criteria) this;
        }

        public Criteria andLossFirstTypeIn(List<String> values) {
            addCriterion("loss_first_type in", values, "lossFirstType");
            return (Criteria) this;
        }

        public Criteria andLossFirstTypeNotIn(List<String> values) {
            addCriterion("loss_first_type not in", values, "lossFirstType");
            return (Criteria) this;
        }

        public Criteria andLossFirstTypeBetween(String value1, String value2) {
            addCriterion("loss_first_type between", value1, value2, "lossFirstType");
            return (Criteria) this;
        }

        public Criteria andLossFirstTypeNotBetween(String value1, String value2) {
            addCriterion("loss_first_type not between", value1, value2, "lossFirstType");
            return (Criteria) this;
        }

        public Criteria andLossSecondTypeIsNull() {
            addCriterion("loss_second_type is null");
            return (Criteria) this;
        }

        public Criteria andLossSecondTypeIsNotNull() {
            addCriterion("loss_second_type is not null");
            return (Criteria) this;
        }

        public Criteria andLossSecondTypeEqualTo(String value) {
            addCriterion("loss_second_type =", value, "lossSecondType");
            return (Criteria) this;
        }

        public Criteria andLossSecondTypeNotEqualTo(String value) {
            addCriterion("loss_second_type <>", value, "lossSecondType");
            return (Criteria) this;
        }

        public Criteria andLossSecondTypeGreaterThan(String value) {
            addCriterion("loss_second_type >", value, "lossSecondType");
            return (Criteria) this;
        }

        public Criteria andLossSecondTypeGreaterThanOrEqualTo(String value) {
            addCriterion("loss_second_type >=", value, "lossSecondType");
            return (Criteria) this;
        }

        public Criteria andLossSecondTypeLessThan(String value) {
            addCriterion("loss_second_type <", value, "lossSecondType");
            return (Criteria) this;
        }

        public Criteria andLossSecondTypeLessThanOrEqualTo(String value) {
            addCriterion("loss_second_type <=", value, "lossSecondType");
            return (Criteria) this;
        }

        public Criteria andLossSecondTypeLike(String value) {
            addCriterion("loss_second_type like", value, "lossSecondType");
            return (Criteria) this;
        }

        public Criteria andLossSecondTypeNotLike(String value) {
            addCriterion("loss_second_type not like", value, "lossSecondType");
            return (Criteria) this;
        }

        public Criteria andLossSecondTypeIn(List<String> values) {
            addCriterion("loss_second_type in", values, "lossSecondType");
            return (Criteria) this;
        }

        public Criteria andLossSecondTypeNotIn(List<String> values) {
            addCriterion("loss_second_type not in", values, "lossSecondType");
            return (Criteria) this;
        }

        public Criteria andLossSecondTypeBetween(String value1, String value2) {
            addCriterion("loss_second_type between", value1, value2, "lossSecondType");
            return (Criteria) this;
        }

        public Criteria andLossSecondTypeNotBetween(String value1, String value2) {
            addCriterion("loss_second_type not between", value1, value2, "lossSecondType");
            return (Criteria) this;
        }

        public Criteria andAveragePayAmountIsNull() {
            addCriterion("average_pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andAveragePayAmountIsNotNull() {
            addCriterion("average_pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAveragePayAmountEqualTo(BigDecimal value) {
            addCriterion("average_pay_amount =", value, "averagePayAmount");
            return (Criteria) this;
        }

        public Criteria andAveragePayAmountNotEqualTo(BigDecimal value) {
            addCriterion("average_pay_amount <>", value, "averagePayAmount");
            return (Criteria) this;
        }

        public Criteria andAveragePayAmountGreaterThan(BigDecimal value) {
            addCriterion("average_pay_amount >", value, "averagePayAmount");
            return (Criteria) this;
        }

        public Criteria andAveragePayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("average_pay_amount >=", value, "averagePayAmount");
            return (Criteria) this;
        }

        public Criteria andAveragePayAmountLessThan(BigDecimal value) {
            addCriterion("average_pay_amount <", value, "averagePayAmount");
            return (Criteria) this;
        }

        public Criteria andAveragePayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("average_pay_amount <=", value, "averagePayAmount");
            return (Criteria) this;
        }

        public Criteria andAveragePayAmountIn(List<BigDecimal> values) {
            addCriterion("average_pay_amount in", values, "averagePayAmount");
            return (Criteria) this;
        }

        public Criteria andAveragePayAmountNotIn(List<BigDecimal> values) {
            addCriterion("average_pay_amount not in", values, "averagePayAmount");
            return (Criteria) this;
        }

        public Criteria andAveragePayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("average_pay_amount between", value1, value2, "averagePayAmount");
            return (Criteria) this;
        }

        public Criteria andAveragePayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("average_pay_amount not between", value1, value2, "averagePayAmount");
            return (Criteria) this;
        }

        public Criteria andRecommendAmountIsNull() {
            addCriterion("recommend_amount is null");
            return (Criteria) this;
        }

        public Criteria andRecommendAmountIsNotNull() {
            addCriterion("recommend_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendAmountEqualTo(BigDecimal value) {
            addCriterion("recommend_amount =", value, "recommendAmount");
            return (Criteria) this;
        }

        public Criteria andRecommendAmountNotEqualTo(BigDecimal value) {
            addCriterion("recommend_amount <>", value, "recommendAmount");
            return (Criteria) this;
        }

        public Criteria andRecommendAmountGreaterThan(BigDecimal value) {
            addCriterion("recommend_amount >", value, "recommendAmount");
            return (Criteria) this;
        }

        public Criteria andRecommendAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recommend_amount >=", value, "recommendAmount");
            return (Criteria) this;
        }

        public Criteria andRecommendAmountLessThan(BigDecimal value) {
            addCriterion("recommend_amount <", value, "recommendAmount");
            return (Criteria) this;
        }

        public Criteria andRecommendAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recommend_amount <=", value, "recommendAmount");
            return (Criteria) this;
        }

        public Criteria andRecommendAmountIn(List<BigDecimal> values) {
            addCriterion("recommend_amount in", values, "recommendAmount");
            return (Criteria) this;
        }

        public Criteria andRecommendAmountNotIn(List<BigDecimal> values) {
            addCriterion("recommend_amount not in", values, "recommendAmount");
            return (Criteria) this;
        }

        public Criteria andRecommendAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recommend_amount between", value1, value2, "recommendAmount");
            return (Criteria) this;
        }

        public Criteria andRecommendAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recommend_amount not between", value1, value2, "recommendAmount");
            return (Criteria) this;
        }

        public Criteria andFixedLossAmountIsNull() {
            addCriterion("fixed_loss_amount is null");
            return (Criteria) this;
        }

        public Criteria andFixedLossAmountIsNotNull() {
            addCriterion("fixed_loss_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFixedLossAmountEqualTo(BigDecimal value) {
            addCriterion("fixed_loss_amount =", value, "fixedLossAmount");
            return (Criteria) this;
        }

        public Criteria andFixedLossAmountNotEqualTo(BigDecimal value) {
            addCriterion("fixed_loss_amount <>", value, "fixedLossAmount");
            return (Criteria) this;
        }

        public Criteria andFixedLossAmountGreaterThan(BigDecimal value) {
            addCriterion("fixed_loss_amount >", value, "fixedLossAmount");
            return (Criteria) this;
        }

        public Criteria andFixedLossAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fixed_loss_amount >=", value, "fixedLossAmount");
            return (Criteria) this;
        }

        public Criteria andFixedLossAmountLessThan(BigDecimal value) {
            addCriterion("fixed_loss_amount <", value, "fixedLossAmount");
            return (Criteria) this;
        }

        public Criteria andFixedLossAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fixed_loss_amount <=", value, "fixedLossAmount");
            return (Criteria) this;
        }

        public Criteria andFixedLossAmountIn(List<BigDecimal> values) {
            addCriterion("fixed_loss_amount in", values, "fixedLossAmount");
            return (Criteria) this;
        }

        public Criteria andFixedLossAmountNotIn(List<BigDecimal> values) {
            addCriterion("fixed_loss_amount not in", values, "fixedLossAmount");
            return (Criteria) this;
        }

        public Criteria andFixedLossAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fixed_loss_amount between", value1, value2, "fixedLossAmount");
            return (Criteria) this;
        }

        public Criteria andFixedLossAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fixed_loss_amount not between", value1, value2, "fixedLossAmount");
            return (Criteria) this;
        }

        public Criteria andDamageAmountIsNull() {
            addCriterion("damage_amount is null");
            return (Criteria) this;
        }

        public Criteria andDamageAmountIsNotNull() {
            addCriterion("damage_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDamageAmountEqualTo(BigDecimal value) {
            addCriterion("damage_amount =", value, "damageAmount");
            return (Criteria) this;
        }

        public Criteria andDamageAmountNotEqualTo(BigDecimal value) {
            addCriterion("damage_amount <>", value, "damageAmount");
            return (Criteria) this;
        }

        public Criteria andDamageAmountGreaterThan(BigDecimal value) {
            addCriterion("damage_amount >", value, "damageAmount");
            return (Criteria) this;
        }

        public Criteria andDamageAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("damage_amount >=", value, "damageAmount");
            return (Criteria) this;
        }

        public Criteria andDamageAmountLessThan(BigDecimal value) {
            addCriterion("damage_amount <", value, "damageAmount");
            return (Criteria) this;
        }

        public Criteria andDamageAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("damage_amount <=", value, "damageAmount");
            return (Criteria) this;
        }

        public Criteria andDamageAmountIn(List<BigDecimal> values) {
            addCriterion("damage_amount in", values, "damageAmount");
            return (Criteria) this;
        }

        public Criteria andDamageAmountNotIn(List<BigDecimal> values) {
            addCriterion("damage_amount not in", values, "damageAmount");
            return (Criteria) this;
        }

        public Criteria andDamageAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("damage_amount between", value1, value2, "damageAmount");
            return (Criteria) this;
        }

        public Criteria andDamageAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("damage_amount not between", value1, value2, "damageAmount");
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

        public Criteria andSendDoctorTypeIsNull() {
            addCriterion("send_doctor_type is null");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTypeIsNotNull() {
            addCriterion("send_doctor_type is not null");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTypeEqualTo(Byte value) {
            addCriterion("send_doctor_type =", value, "sendDoctorType");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTypeNotEqualTo(Byte value) {
            addCriterion("send_doctor_type <>", value, "sendDoctorType");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTypeGreaterThan(Byte value) {
            addCriterion("send_doctor_type >", value, "sendDoctorType");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("send_doctor_type >=", value, "sendDoctorType");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTypeLessThan(Byte value) {
            addCriterion("send_doctor_type <", value, "sendDoctorType");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTypeLessThanOrEqualTo(Byte value) {
            addCriterion("send_doctor_type <=", value, "sendDoctorType");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTypeIn(List<Byte> values) {
            addCriterion("send_doctor_type in", values, "sendDoctorType");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTypeNotIn(List<Byte> values) {
            addCriterion("send_doctor_type not in", values, "sendDoctorType");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTypeBetween(Byte value1, Byte value2) {
            addCriterion("send_doctor_type between", value1, value2, "sendDoctorType");
            return (Criteria) this;
        }

        public Criteria andSendDoctorTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("send_doctor_type not between", value1, value2, "sendDoctorType");
            return (Criteria) this;
        }

        public Criteria andHumanNameIsNull() {
            addCriterion("human_name is null");
            return (Criteria) this;
        }

        public Criteria andHumanNameIsNotNull() {
            addCriterion("human_name is not null");
            return (Criteria) this;
        }

        public Criteria andHumanNameEqualTo(String value) {
            addCriterion("human_name =", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameNotEqualTo(String value) {
            addCriterion("human_name <>", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameGreaterThan(String value) {
            addCriterion("human_name >", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameGreaterThanOrEqualTo(String value) {
            addCriterion("human_name >=", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameLessThan(String value) {
            addCriterion("human_name <", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameLessThanOrEqualTo(String value) {
            addCriterion("human_name <=", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameLike(String value) {
            addCriterion("human_name like", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameNotLike(String value) {
            addCriterion("human_name not like", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameIn(List<String> values) {
            addCriterion("human_name in", values, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameNotIn(List<String> values) {
            addCriterion("human_name not in", values, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameBetween(String value1, String value2) {
            addCriterion("human_name between", value1, value2, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameNotBetween(String value1, String value2) {
            addCriterion("human_name not between", value1, value2, "humanName");
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

        public Criteria andIdCardTypeEqualTo(String value) {
            addCriterion("id_card_type =", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeNotEqualTo(String value) {
            addCriterion("id_card_type <>", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeGreaterThan(String value) {
            addCriterion("id_card_type >", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_type >=", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeLessThan(String value) {
            addCriterion("id_card_type <", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeLessThanOrEqualTo(String value) {
            addCriterion("id_card_type <=", value, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeIn(List<String> values) {
            addCriterion("id_card_type in", values, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeNotIn(List<String> values) {
            addCriterion("id_card_type not in", values, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeBetween(String value1, String value2) {
            addCriterion("id_card_type between", value1, value2, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardTypeNotBetween(String value1, String value2) {
            addCriterion("id_card_type not between", value1, value2, "idCardType");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andHumanSexIsNull() {
            addCriterion("human_sex is null");
            return (Criteria) this;
        }

        public Criteria andHumanSexIsNotNull() {
            addCriterion("human_sex is not null");
            return (Criteria) this;
        }

        public Criteria andHumanSexEqualTo(Byte value) {
            addCriterion("human_sex =", value, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexNotEqualTo(Byte value) {
            addCriterion("human_sex <>", value, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexGreaterThan(Byte value) {
            addCriterion("human_sex >", value, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("human_sex >=", value, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexLessThan(Byte value) {
            addCriterion("human_sex <", value, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexLessThanOrEqualTo(Byte value) {
            addCriterion("human_sex <=", value, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexIn(List<Byte> values) {
            addCriterion("human_sex in", values, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexNotIn(List<Byte> values) {
            addCriterion("human_sex not in", values, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexBetween(Byte value1, Byte value2) {
            addCriterion("human_sex between", value1, value2, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexNotBetween(Byte value1, Byte value2) {
            addCriterion("human_sex not between", value1, value2, "humanSex");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNull() {
            addCriterion("birth_date is null");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNotNull() {
            addCriterion("birth_date is not null");
            return (Criteria) this;
        }

        public Criteria andBirthDateEqualTo(Date value) {
            addCriterion("birth_date =", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotEqualTo(Date value) {
            addCriterion("birth_date <>", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThan(Date value) {
            addCriterion("birth_date >", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThanOrEqualTo(Date value) {
            addCriterion("birth_date >=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThan(Date value) {
            addCriterion("birth_date <", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThanOrEqualTo(Date value) {
            addCriterion("birth_date <=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateIn(List<Date> values) {
            addCriterion("birth_date in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotIn(List<Date> values) {
            addCriterion("birth_date not in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateBetween(Date value1, Date value2) {
            addCriterion("birth_date between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotBetween(Date value1, Date value2) {
            addCriterion("birth_date not between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andHumanAgeIsNull() {
            addCriterion("human_age is null");
            return (Criteria) this;
        }

        public Criteria andHumanAgeIsNotNull() {
            addCriterion("human_age is not null");
            return (Criteria) this;
        }

        public Criteria andHumanAgeEqualTo(Integer value) {
            addCriterion("human_age =", value, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeNotEqualTo(Integer value) {
            addCriterion("human_age <>", value, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeGreaterThan(Integer value) {
            addCriterion("human_age >", value, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("human_age >=", value, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeLessThan(Integer value) {
            addCriterion("human_age <", value, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeLessThanOrEqualTo(Integer value) {
            addCriterion("human_age <=", value, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeIn(List<Integer> values) {
            addCriterion("human_age in", values, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeNotIn(List<Integer> values) {
            addCriterion("human_age not in", values, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeBetween(Integer value1, Integer value2) {
            addCriterion("human_age between", value1, value2, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("human_age not between", value1, value2, "humanAge");
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

        public Criteria andPerResidenceProvinceIsNull() {
            addCriterion("per_residence_province is null");
            return (Criteria) this;
        }

        public Criteria andPerResidenceProvinceIsNotNull() {
            addCriterion("per_residence_province is not null");
            return (Criteria) this;
        }

        public Criteria andPerResidenceProvinceEqualTo(String value) {
            addCriterion("per_residence_province =", value, "perResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andPerResidenceProvinceNotEqualTo(String value) {
            addCriterion("per_residence_province <>", value, "perResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andPerResidenceProvinceGreaterThan(String value) {
            addCriterion("per_residence_province >", value, "perResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andPerResidenceProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("per_residence_province >=", value, "perResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andPerResidenceProvinceLessThan(String value) {
            addCriterion("per_residence_province <", value, "perResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andPerResidenceProvinceLessThanOrEqualTo(String value) {
            addCriterion("per_residence_province <=", value, "perResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andPerResidenceProvinceLike(String value) {
            addCriterion("per_residence_province like", value, "perResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andPerResidenceProvinceNotLike(String value) {
            addCriterion("per_residence_province not like", value, "perResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andPerResidenceProvinceIn(List<String> values) {
            addCriterion("per_residence_province in", values, "perResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andPerResidenceProvinceNotIn(List<String> values) {
            addCriterion("per_residence_province not in", values, "perResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andPerResidenceProvinceBetween(String value1, String value2) {
            addCriterion("per_residence_province between", value1, value2, "perResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andPerResidenceProvinceNotBetween(String value1, String value2) {
            addCriterion("per_residence_province not between", value1, value2, "perResidenceProvince");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityIsNull() {
            addCriterion("per_residence_city is null");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityIsNotNull() {
            addCriterion("per_residence_city is not null");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityEqualTo(String value) {
            addCriterion("per_residence_city =", value, "perResidenceCity");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityNotEqualTo(String value) {
            addCriterion("per_residence_city <>", value, "perResidenceCity");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityGreaterThan(String value) {
            addCriterion("per_residence_city >", value, "perResidenceCity");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityGreaterThanOrEqualTo(String value) {
            addCriterion("per_residence_city >=", value, "perResidenceCity");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityLessThan(String value) {
            addCriterion("per_residence_city <", value, "perResidenceCity");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityLessThanOrEqualTo(String value) {
            addCriterion("per_residence_city <=", value, "perResidenceCity");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityLike(String value) {
            addCriterion("per_residence_city like", value, "perResidenceCity");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityNotLike(String value) {
            addCriterion("per_residence_city not like", value, "perResidenceCity");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityIn(List<String> values) {
            addCriterion("per_residence_city in", values, "perResidenceCity");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityNotIn(List<String> values) {
            addCriterion("per_residence_city not in", values, "perResidenceCity");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityBetween(String value1, String value2) {
            addCriterion("per_residence_city between", value1, value2, "perResidenceCity");
            return (Criteria) this;
        }

        public Criteria andPerResidenceCityNotBetween(String value1, String value2) {
            addCriterion("per_residence_city not between", value1, value2, "perResidenceCity");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictIsNull() {
            addCriterion("per_residence_district is null");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictIsNotNull() {
            addCriterion("per_residence_district is not null");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictEqualTo(String value) {
            addCriterion("per_residence_district =", value, "perResidenceDistrict");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictNotEqualTo(String value) {
            addCriterion("per_residence_district <>", value, "perResidenceDistrict");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictGreaterThan(String value) {
            addCriterion("per_residence_district >", value, "perResidenceDistrict");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("per_residence_district >=", value, "perResidenceDistrict");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictLessThan(String value) {
            addCriterion("per_residence_district <", value, "perResidenceDistrict");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictLessThanOrEqualTo(String value) {
            addCriterion("per_residence_district <=", value, "perResidenceDistrict");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictLike(String value) {
            addCriterion("per_residence_district like", value, "perResidenceDistrict");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictNotLike(String value) {
            addCriterion("per_residence_district not like", value, "perResidenceDistrict");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictIn(List<String> values) {
            addCriterion("per_residence_district in", values, "perResidenceDistrict");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictNotIn(List<String> values) {
            addCriterion("per_residence_district not in", values, "perResidenceDistrict");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictBetween(String value1, String value2) {
            addCriterion("per_residence_district between", value1, value2, "perResidenceDistrict");
            return (Criteria) this;
        }

        public Criteria andPerResidenceDistrictNotBetween(String value1, String value2) {
            addCriterion("per_residence_district not between", value1, value2, "perResidenceDistrict");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownIsNull() {
            addCriterion("per_residence_town is null");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownIsNotNull() {
            addCriterion("per_residence_town is not null");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownEqualTo(String value) {
            addCriterion("per_residence_town =", value, "perResidenceTown");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownNotEqualTo(String value) {
            addCriterion("per_residence_town <>", value, "perResidenceTown");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownGreaterThan(String value) {
            addCriterion("per_residence_town >", value, "perResidenceTown");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownGreaterThanOrEqualTo(String value) {
            addCriterion("per_residence_town >=", value, "perResidenceTown");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownLessThan(String value) {
            addCriterion("per_residence_town <", value, "perResidenceTown");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownLessThanOrEqualTo(String value) {
            addCriterion("per_residence_town <=", value, "perResidenceTown");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownLike(String value) {
            addCriterion("per_residence_town like", value, "perResidenceTown");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownNotLike(String value) {
            addCriterion("per_residence_town not like", value, "perResidenceTown");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownIn(List<String> values) {
            addCriterion("per_residence_town in", values, "perResidenceTown");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownNotIn(List<String> values) {
            addCriterion("per_residence_town not in", values, "perResidenceTown");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownBetween(String value1, String value2) {
            addCriterion("per_residence_town between", value1, value2, "perResidenceTown");
            return (Criteria) this;
        }

        public Criteria andPerResidenceTownNotBetween(String value1, String value2) {
            addCriterion("per_residence_town not between", value1, value2, "perResidenceTown");
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

        public Criteria andHospitalDepartmentFirstIsNull() {
            addCriterion("hospital_department_first is null");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstIsNotNull() {
            addCriterion("hospital_department_first is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstEqualTo(String value) {
            addCriterion("hospital_department_first =", value, "hospitalDepartmentFirst");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstNotEqualTo(String value) {
            addCriterion("hospital_department_first <>", value, "hospitalDepartmentFirst");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstGreaterThan(String value) {
            addCriterion("hospital_department_first >", value, "hospitalDepartmentFirst");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_department_first >=", value, "hospitalDepartmentFirst");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstLessThan(String value) {
            addCriterion("hospital_department_first <", value, "hospitalDepartmentFirst");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstLessThanOrEqualTo(String value) {
            addCriterion("hospital_department_first <=", value, "hospitalDepartmentFirst");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstLike(String value) {
            addCriterion("hospital_department_first like", value, "hospitalDepartmentFirst");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstNotLike(String value) {
            addCriterion("hospital_department_first not like", value, "hospitalDepartmentFirst");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstIn(List<String> values) {
            addCriterion("hospital_department_first in", values, "hospitalDepartmentFirst");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstNotIn(List<String> values) {
            addCriterion("hospital_department_first not in", values, "hospitalDepartmentFirst");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstBetween(String value1, String value2) {
            addCriterion("hospital_department_first between", value1, value2, "hospitalDepartmentFirst");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstNotBetween(String value1, String value2) {
            addCriterion("hospital_department_first not between", value1, value2, "hospitalDepartmentFirst");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondIsNull() {
            addCriterion("hospital_department_second is null");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondIsNotNull() {
            addCriterion("hospital_department_second is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondEqualTo(String value) {
            addCriterion("hospital_department_second =", value, "hospitalDepartmentSecond");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondNotEqualTo(String value) {
            addCriterion("hospital_department_second <>", value, "hospitalDepartmentSecond");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondGreaterThan(String value) {
            addCriterion("hospital_department_second >", value, "hospitalDepartmentSecond");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_department_second >=", value, "hospitalDepartmentSecond");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondLessThan(String value) {
            addCriterion("hospital_department_second <", value, "hospitalDepartmentSecond");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondLessThanOrEqualTo(String value) {
            addCriterion("hospital_department_second <=", value, "hospitalDepartmentSecond");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondLike(String value) {
            addCriterion("hospital_department_second like", value, "hospitalDepartmentSecond");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondNotLike(String value) {
            addCriterion("hospital_department_second not like", value, "hospitalDepartmentSecond");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondIn(List<String> values) {
            addCriterion("hospital_department_second in", values, "hospitalDepartmentSecond");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondNotIn(List<String> values) {
            addCriterion("hospital_department_second not in", values, "hospitalDepartmentSecond");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondBetween(String value1, String value2) {
            addCriterion("hospital_department_second between", value1, value2, "hospitalDepartmentSecond");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondNotBetween(String value1, String value2) {
            addCriterion("hospital_department_second not between", value1, value2, "hospitalDepartmentSecond");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstNameIsNull() {
            addCriterion("hospital_department_first_name is null");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstNameIsNotNull() {
            addCriterion("hospital_department_first_name is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstNameEqualTo(String value) {
            addCriterion("hospital_department_first_name =", value, "hospitalDepartmentFirstName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstNameNotEqualTo(String value) {
            addCriterion("hospital_department_first_name <>", value, "hospitalDepartmentFirstName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstNameGreaterThan(String value) {
            addCriterion("hospital_department_first_name >", value, "hospitalDepartmentFirstName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstNameGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_department_first_name >=", value, "hospitalDepartmentFirstName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstNameLessThan(String value) {
            addCriterion("hospital_department_first_name <", value, "hospitalDepartmentFirstName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstNameLessThanOrEqualTo(String value) {
            addCriterion("hospital_department_first_name <=", value, "hospitalDepartmentFirstName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstNameLike(String value) {
            addCriterion("hospital_department_first_name like", value, "hospitalDepartmentFirstName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstNameNotLike(String value) {
            addCriterion("hospital_department_first_name not like", value, "hospitalDepartmentFirstName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstNameIn(List<String> values) {
            addCriterion("hospital_department_first_name in", values, "hospitalDepartmentFirstName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstNameNotIn(List<String> values) {
            addCriterion("hospital_department_first_name not in", values, "hospitalDepartmentFirstName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstNameBetween(String value1, String value2) {
            addCriterion("hospital_department_first_name between", value1, value2, "hospitalDepartmentFirstName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentFirstNameNotBetween(String value1, String value2) {
            addCriterion("hospital_department_first_name not between", value1, value2, "hospitalDepartmentFirstName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondNameIsNull() {
            addCriterion("hospital_department_second_name is null");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondNameIsNotNull() {
            addCriterion("hospital_department_second_name is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondNameEqualTo(String value) {
            addCriterion("hospital_department_second_name =", value, "hospitalDepartmentSecondName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondNameNotEqualTo(String value) {
            addCriterion("hospital_department_second_name <>", value, "hospitalDepartmentSecondName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondNameGreaterThan(String value) {
            addCriterion("hospital_department_second_name >", value, "hospitalDepartmentSecondName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondNameGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_department_second_name >=", value, "hospitalDepartmentSecondName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondNameLessThan(String value) {
            addCriterion("hospital_department_second_name <", value, "hospitalDepartmentSecondName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondNameLessThanOrEqualTo(String value) {
            addCriterion("hospital_department_second_name <=", value, "hospitalDepartmentSecondName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondNameLike(String value) {
            addCriterion("hospital_department_second_name like", value, "hospitalDepartmentSecondName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondNameNotLike(String value) {
            addCriterion("hospital_department_second_name not like", value, "hospitalDepartmentSecondName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondNameIn(List<String> values) {
            addCriterion("hospital_department_second_name in", values, "hospitalDepartmentSecondName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondNameNotIn(List<String> values) {
            addCriterion("hospital_department_second_name not in", values, "hospitalDepartmentSecondName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondNameBetween(String value1, String value2) {
            addCriterion("hospital_department_second_name between", value1, value2, "hospitalDepartmentSecondName");
            return (Criteria) this;
        }

        public Criteria andHospitalDepartmentSecondNameNotBetween(String value1, String value2) {
            addCriterion("hospital_department_second_name not between", value1, value2, "hospitalDepartmentSecondName");
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

        public Criteria andDamageSiteEqualTo(String value) {
            addCriterion("damage_site =", value, "damageSite");
            return (Criteria) this;
        }

        public Criteria andDamageSiteNotEqualTo(String value) {
            addCriterion("damage_site <>", value, "damageSite");
            return (Criteria) this;
        }

        public Criteria andDamageSiteGreaterThan(String value) {
            addCriterion("damage_site >", value, "damageSite");
            return (Criteria) this;
        }

        public Criteria andDamageSiteGreaterThanOrEqualTo(String value) {
            addCriterion("damage_site >=", value, "damageSite");
            return (Criteria) this;
        }

        public Criteria andDamageSiteLessThan(String value) {
            addCriterion("damage_site <", value, "damageSite");
            return (Criteria) this;
        }

        public Criteria andDamageSiteLessThanOrEqualTo(String value) {
            addCriterion("damage_site <=", value, "damageSite");
            return (Criteria) this;
        }

        public Criteria andDamageSiteLike(String value) {
            addCriterion("damage_site like", value, "damageSite");
            return (Criteria) this;
        }

        public Criteria andDamageSiteNotLike(String value) {
            addCriterion("damage_site not like", value, "damageSite");
            return (Criteria) this;
        }

        public Criteria andDamageSiteIn(List<String> values) {
            addCriterion("damage_site in", values, "damageSite");
            return (Criteria) this;
        }

        public Criteria andDamageSiteNotIn(List<String> values) {
            addCriterion("damage_site not in", values, "damageSite");
            return (Criteria) this;
        }

        public Criteria andDamageSiteBetween(String value1, String value2) {
            addCriterion("damage_site between", value1, value2, "damageSite");
            return (Criteria) this;
        }

        public Criteria andDamageSiteNotBetween(String value1, String value2) {
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

        public Criteria andDamageSiteSecondEqualTo(String value) {
            addCriterion("damage_site_second =", value, "damageSiteSecond");
            return (Criteria) this;
        }

        public Criteria andDamageSiteSecondNotEqualTo(String value) {
            addCriterion("damage_site_second <>", value, "damageSiteSecond");
            return (Criteria) this;
        }

        public Criteria andDamageSiteSecondGreaterThan(String value) {
            addCriterion("damage_site_second >", value, "damageSiteSecond");
            return (Criteria) this;
        }

        public Criteria andDamageSiteSecondGreaterThanOrEqualTo(String value) {
            addCriterion("damage_site_second >=", value, "damageSiteSecond");
            return (Criteria) this;
        }

        public Criteria andDamageSiteSecondLessThan(String value) {
            addCriterion("damage_site_second <", value, "damageSiteSecond");
            return (Criteria) this;
        }

        public Criteria andDamageSiteSecondLessThanOrEqualTo(String value) {
            addCriterion("damage_site_second <=", value, "damageSiteSecond");
            return (Criteria) this;
        }

        public Criteria andDamageSiteSecondLike(String value) {
            addCriterion("damage_site_second like", value, "damageSiteSecond");
            return (Criteria) this;
        }

        public Criteria andDamageSiteSecondNotLike(String value) {
            addCriterion("damage_site_second not like", value, "damageSiteSecond");
            return (Criteria) this;
        }

        public Criteria andDamageSiteSecondIn(List<String> values) {
            addCriterion("damage_site_second in", values, "damageSiteSecond");
            return (Criteria) this;
        }

        public Criteria andDamageSiteSecondNotIn(List<String> values) {
            addCriterion("damage_site_second not in", values, "damageSiteSecond");
            return (Criteria) this;
        }

        public Criteria andDamageSiteSecondBetween(String value1, String value2) {
            addCriterion("damage_site_second between", value1, value2, "damageSiteSecond");
            return (Criteria) this;
        }

        public Criteria andDamageSiteSecondNotBetween(String value1, String value2) {
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

        public Criteria andDamageTypeEqualTo(String value) {
            addCriterion("damage_type =", value, "damageType");
            return (Criteria) this;
        }

        public Criteria andDamageTypeNotEqualTo(String value) {
            addCriterion("damage_type <>", value, "damageType");
            return (Criteria) this;
        }

        public Criteria andDamageTypeGreaterThan(String value) {
            addCriterion("damage_type >", value, "damageType");
            return (Criteria) this;
        }

        public Criteria andDamageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("damage_type >=", value, "damageType");
            return (Criteria) this;
        }

        public Criteria andDamageTypeLessThan(String value) {
            addCriterion("damage_type <", value, "damageType");
            return (Criteria) this;
        }

        public Criteria andDamageTypeLessThanOrEqualTo(String value) {
            addCriterion("damage_type <=", value, "damageType");
            return (Criteria) this;
        }

        public Criteria andDamageTypeLike(String value) {
            addCriterion("damage_type like", value, "damageType");
            return (Criteria) this;
        }

        public Criteria andDamageTypeNotLike(String value) {
            addCriterion("damage_type not like", value, "damageType");
            return (Criteria) this;
        }

        public Criteria andDamageTypeIn(List<String> values) {
            addCriterion("damage_type in", values, "damageType");
            return (Criteria) this;
        }

        public Criteria andDamageTypeNotIn(List<String> values) {
            addCriterion("damage_type not in", values, "damageType");
            return (Criteria) this;
        }

        public Criteria andDamageTypeBetween(String value1, String value2) {
            addCriterion("damage_type between", value1, value2, "damageType");
            return (Criteria) this;
        }

        public Criteria andDamageTypeNotBetween(String value1, String value2) {
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

        public Criteria andDiagnosisInjuryEqualTo(String value) {
            addCriterion("diagnosis_injury =", value, "diagnosisInjury");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInjuryNotEqualTo(String value) {
            addCriterion("diagnosis_injury <>", value, "diagnosisInjury");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInjuryGreaterThan(String value) {
            addCriterion("diagnosis_injury >", value, "diagnosisInjury");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInjuryGreaterThanOrEqualTo(String value) {
            addCriterion("diagnosis_injury >=", value, "diagnosisInjury");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInjuryLessThan(String value) {
            addCriterion("diagnosis_injury <", value, "diagnosisInjury");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInjuryLessThanOrEqualTo(String value) {
            addCriterion("diagnosis_injury <=", value, "diagnosisInjury");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInjuryLike(String value) {
            addCriterion("diagnosis_injury like", value, "diagnosisInjury");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInjuryNotLike(String value) {
            addCriterion("diagnosis_injury not like", value, "diagnosisInjury");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInjuryIn(List<String> values) {
            addCriterion("diagnosis_injury in", values, "diagnosisInjury");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInjuryNotIn(List<String> values) {
            addCriterion("diagnosis_injury not in", values, "diagnosisInjury");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInjuryBetween(String value1, String value2) {
            addCriterion("diagnosis_injury between", value1, value2, "diagnosisInjury");
            return (Criteria) this;
        }

        public Criteria andDiagnosisInjuryNotBetween(String value1, String value2) {
            addCriterion("diagnosis_injury not between", value1, value2, "diagnosisInjury");
            return (Criteria) this;
        }

        public Criteria andDamageDescIsNull() {
            addCriterion("damage_desc is null");
            return (Criteria) this;
        }

        public Criteria andDamageDescIsNotNull() {
            addCriterion("damage_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDamageDescEqualTo(String value) {
            addCriterion("damage_desc =", value, "damageDesc");
            return (Criteria) this;
        }

        public Criteria andDamageDescNotEqualTo(String value) {
            addCriterion("damage_desc <>", value, "damageDesc");
            return (Criteria) this;
        }

        public Criteria andDamageDescGreaterThan(String value) {
            addCriterion("damage_desc >", value, "damageDesc");
            return (Criteria) this;
        }

        public Criteria andDamageDescGreaterThanOrEqualTo(String value) {
            addCriterion("damage_desc >=", value, "damageDesc");
            return (Criteria) this;
        }

        public Criteria andDamageDescLessThan(String value) {
            addCriterion("damage_desc <", value, "damageDesc");
            return (Criteria) this;
        }

        public Criteria andDamageDescLessThanOrEqualTo(String value) {
            addCriterion("damage_desc <=", value, "damageDesc");
            return (Criteria) this;
        }

        public Criteria andDamageDescLike(String value) {
            addCriterion("damage_desc like", value, "damageDesc");
            return (Criteria) this;
        }

        public Criteria andDamageDescNotLike(String value) {
            addCriterion("damage_desc not like", value, "damageDesc");
            return (Criteria) this;
        }

        public Criteria andDamageDescIn(List<String> values) {
            addCriterion("damage_desc in", values, "damageDesc");
            return (Criteria) this;
        }

        public Criteria andDamageDescNotIn(List<String> values) {
            addCriterion("damage_desc not in", values, "damageDesc");
            return (Criteria) this;
        }

        public Criteria andDamageDescBetween(String value1, String value2) {
            addCriterion("damage_desc between", value1, value2, "damageDesc");
            return (Criteria) this;
        }

        public Criteria andDamageDescNotBetween(String value1, String value2) {
            addCriterion("damage_desc not between", value1, value2, "damageDesc");
            return (Criteria) this;
        }

        public Criteria andDamageNameIsNull() {
            addCriterion("damage_name is null");
            return (Criteria) this;
        }

        public Criteria andDamageNameIsNotNull() {
            addCriterion("damage_name is not null");
            return (Criteria) this;
        }

        public Criteria andDamageNameEqualTo(String value) {
            addCriterion("damage_name =", value, "damageName");
            return (Criteria) this;
        }

        public Criteria andDamageNameNotEqualTo(String value) {
            addCriterion("damage_name <>", value, "damageName");
            return (Criteria) this;
        }

        public Criteria andDamageNameGreaterThan(String value) {
            addCriterion("damage_name >", value, "damageName");
            return (Criteria) this;
        }

        public Criteria andDamageNameGreaterThanOrEqualTo(String value) {
            addCriterion("damage_name >=", value, "damageName");
            return (Criteria) this;
        }

        public Criteria andDamageNameLessThan(String value) {
            addCriterion("damage_name <", value, "damageName");
            return (Criteria) this;
        }

        public Criteria andDamageNameLessThanOrEqualTo(String value) {
            addCriterion("damage_name <=", value, "damageName");
            return (Criteria) this;
        }

        public Criteria andDamageNameLike(String value) {
            addCriterion("damage_name like", value, "damageName");
            return (Criteria) this;
        }

        public Criteria andDamageNameNotLike(String value) {
            addCriterion("damage_name not like", value, "damageName");
            return (Criteria) this;
        }

        public Criteria andDamageNameIn(List<String> values) {
            addCriterion("damage_name in", values, "damageName");
            return (Criteria) this;
        }

        public Criteria andDamageNameNotIn(List<String> values) {
            addCriterion("damage_name not in", values, "damageName");
            return (Criteria) this;
        }

        public Criteria andDamageNameBetween(String value1, String value2) {
            addCriterion("damage_name between", value1, value2, "damageName");
            return (Criteria) this;
        }

        public Criteria andDamageNameNotBetween(String value1, String value2) {
            addCriterion("damage_name not between", value1, value2, "damageName");
            return (Criteria) this;
        }

        public Criteria andDamageNoIsNull() {
            addCriterion("damage_no is null");
            return (Criteria) this;
        }

        public Criteria andDamageNoIsNotNull() {
            addCriterion("damage_no is not null");
            return (Criteria) this;
        }

        public Criteria andDamageNoEqualTo(String value) {
            addCriterion("damage_no =", value, "damageNo");
            return (Criteria) this;
        }

        public Criteria andDamageNoNotEqualTo(String value) {
            addCriterion("damage_no <>", value, "damageNo");
            return (Criteria) this;
        }

        public Criteria andDamageNoGreaterThan(String value) {
            addCriterion("damage_no >", value, "damageNo");
            return (Criteria) this;
        }

        public Criteria andDamageNoGreaterThanOrEqualTo(String value) {
            addCriterion("damage_no >=", value, "damageNo");
            return (Criteria) this;
        }

        public Criteria andDamageNoLessThan(String value) {
            addCriterion("damage_no <", value, "damageNo");
            return (Criteria) this;
        }

        public Criteria andDamageNoLessThanOrEqualTo(String value) {
            addCriterion("damage_no <=", value, "damageNo");
            return (Criteria) this;
        }

        public Criteria andDamageNoLike(String value) {
            addCriterion("damage_no like", value, "damageNo");
            return (Criteria) this;
        }

        public Criteria andDamageNoNotLike(String value) {
            addCriterion("damage_no not like", value, "damageNo");
            return (Criteria) this;
        }

        public Criteria andDamageNoIn(List<String> values) {
            addCriterion("damage_no in", values, "damageNo");
            return (Criteria) this;
        }

        public Criteria andDamageNoNotIn(List<String> values) {
            addCriterion("damage_no not in", values, "damageNo");
            return (Criteria) this;
        }

        public Criteria andDamageNoBetween(String value1, String value2) {
            addCriterion("damage_no between", value1, value2, "damageNo");
            return (Criteria) this;
        }

        public Criteria andDamageNoNotBetween(String value1, String value2) {
            addCriterion("damage_no not between", value1, value2, "damageNo");
            return (Criteria) this;
        }

        public Criteria andFixedLossReceivTimeIsNull() {
            addCriterion("fixed_loss_receiv_time is null");
            return (Criteria) this;
        }

        public Criteria andFixedLossReceivTimeIsNotNull() {
            addCriterion("fixed_loss_receiv_time is not null");
            return (Criteria) this;
        }

        public Criteria andFixedLossReceivTimeEqualTo(Date value) {
            addCriterion("fixed_loss_receiv_time =", value, "fixedLossReceivTime");
            return (Criteria) this;
        }

        public Criteria andFixedLossReceivTimeNotEqualTo(Date value) {
            addCriterion("fixed_loss_receiv_time <>", value, "fixedLossReceivTime");
            return (Criteria) this;
        }

        public Criteria andFixedLossReceivTimeGreaterThan(Date value) {
            addCriterion("fixed_loss_receiv_time >", value, "fixedLossReceivTime");
            return (Criteria) this;
        }

        public Criteria andFixedLossReceivTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fixed_loss_receiv_time >=", value, "fixedLossReceivTime");
            return (Criteria) this;
        }

        public Criteria andFixedLossReceivTimeLessThan(Date value) {
            addCriterion("fixed_loss_receiv_time <", value, "fixedLossReceivTime");
            return (Criteria) this;
        }

        public Criteria andFixedLossReceivTimeLessThanOrEqualTo(Date value) {
            addCriterion("fixed_loss_receiv_time <=", value, "fixedLossReceivTime");
            return (Criteria) this;
        }

        public Criteria andFixedLossReceivTimeIn(List<Date> values) {
            addCriterion("fixed_loss_receiv_time in", values, "fixedLossReceivTime");
            return (Criteria) this;
        }

        public Criteria andFixedLossReceivTimeNotIn(List<Date> values) {
            addCriterion("fixed_loss_receiv_time not in", values, "fixedLossReceivTime");
            return (Criteria) this;
        }

        public Criteria andFixedLossReceivTimeBetween(Date value1, Date value2) {
            addCriterion("fixed_loss_receiv_time between", value1, value2, "fixedLossReceivTime");
            return (Criteria) this;
        }

        public Criteria andFixedLossReceivTimeNotBetween(Date value1, Date value2) {
            addCriterion("fixed_loss_receiv_time not between", value1, value2, "fixedLossReceivTime");
            return (Criteria) this;
        }

        public Criteria andFixedLossSubmitTimeIsNull() {
            addCriterion("fixed_loss_submit_time is null");
            return (Criteria) this;
        }

        public Criteria andFixedLossSubmitTimeIsNotNull() {
            addCriterion("fixed_loss_submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andFixedLossSubmitTimeEqualTo(Date value) {
            addCriterion("fixed_loss_submit_time =", value, "fixedLossSubmitTime");
            return (Criteria) this;
        }

        public Criteria andFixedLossSubmitTimeNotEqualTo(Date value) {
            addCriterion("fixed_loss_submit_time <>", value, "fixedLossSubmitTime");
            return (Criteria) this;
        }

        public Criteria andFixedLossSubmitTimeGreaterThan(Date value) {
            addCriterion("fixed_loss_submit_time >", value, "fixedLossSubmitTime");
            return (Criteria) this;
        }

        public Criteria andFixedLossSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fixed_loss_submit_time >=", value, "fixedLossSubmitTime");
            return (Criteria) this;
        }

        public Criteria andFixedLossSubmitTimeLessThan(Date value) {
            addCriterion("fixed_loss_submit_time <", value, "fixedLossSubmitTime");
            return (Criteria) this;
        }

        public Criteria andFixedLossSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("fixed_loss_submit_time <=", value, "fixedLossSubmitTime");
            return (Criteria) this;
        }

        public Criteria andFixedLossSubmitTimeIn(List<Date> values) {
            addCriterion("fixed_loss_submit_time in", values, "fixedLossSubmitTime");
            return (Criteria) this;
        }

        public Criteria andFixedLossSubmitTimeNotIn(List<Date> values) {
            addCriterion("fixed_loss_submit_time not in", values, "fixedLossSubmitTime");
            return (Criteria) this;
        }

        public Criteria andFixedLossSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("fixed_loss_submit_time between", value1, value2, "fixedLossSubmitTime");
            return (Criteria) this;
        }

        public Criteria andFixedLossSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("fixed_loss_submit_time not between", value1, value2, "fixedLossSubmitTime");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIsNull() {
            addCriterion("review_status is null");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIsNotNull() {
            addCriterion("review_status is not null");
            return (Criteria) this;
        }

        public Criteria andReviewStatusEqualTo(Integer value) {
            addCriterion("review_status =", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotEqualTo(Integer value) {
            addCriterion("review_status <>", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusGreaterThan(Integer value) {
            addCriterion("review_status >", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("review_status >=", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusLessThan(Integer value) {
            addCriterion("review_status <", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusLessThanOrEqualTo(Integer value) {
            addCriterion("review_status <=", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIn(List<Integer> values) {
            addCriterion("review_status in", values, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotIn(List<Integer> values) {
            addCriterion("review_status not in", values, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusBetween(Integer value1, Integer value2) {
            addCriterion("review_status between", value1, value2, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("review_status not between", value1, value2, "reviewStatus");
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

        public Criteria andCeAccidentTypeIsNull() {
            addCriterion("ce_accident_type is null");
            return (Criteria) this;
        }

        public Criteria andCeAccidentTypeIsNotNull() {
            addCriterion("ce_accident_type is not null");
            return (Criteria) this;
        }

        public Criteria andCeAccidentTypeEqualTo(String value) {
            addCriterion("ce_accident_type =", value, "ceAccidentType");
            return (Criteria) this;
        }

        public Criteria andCeAccidentTypeNotEqualTo(String value) {
            addCriterion("ce_accident_type <>", value, "ceAccidentType");
            return (Criteria) this;
        }

        public Criteria andCeAccidentTypeGreaterThan(String value) {
            addCriterion("ce_accident_type >", value, "ceAccidentType");
            return (Criteria) this;
        }

        public Criteria andCeAccidentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ce_accident_type >=", value, "ceAccidentType");
            return (Criteria) this;
        }

        public Criteria andCeAccidentTypeLessThan(String value) {
            addCriterion("ce_accident_type <", value, "ceAccidentType");
            return (Criteria) this;
        }

        public Criteria andCeAccidentTypeLessThanOrEqualTo(String value) {
            addCriterion("ce_accident_type <=", value, "ceAccidentType");
            return (Criteria) this;
        }

        public Criteria andCeAccidentTypeLike(String value) {
            addCriterion("ce_accident_type like", value, "ceAccidentType");
            return (Criteria) this;
        }

        public Criteria andCeAccidentTypeNotLike(String value) {
            addCriterion("ce_accident_type not like", value, "ceAccidentType");
            return (Criteria) this;
        }

        public Criteria andCeAccidentTypeIn(List<String> values) {
            addCriterion("ce_accident_type in", values, "ceAccidentType");
            return (Criteria) this;
        }

        public Criteria andCeAccidentTypeNotIn(List<String> values) {
            addCriterion("ce_accident_type not in", values, "ceAccidentType");
            return (Criteria) this;
        }

        public Criteria andCeAccidentTypeBetween(String value1, String value2) {
            addCriterion("ce_accident_type between", value1, value2, "ceAccidentType");
            return (Criteria) this;
        }

        public Criteria andCeAccidentTypeNotBetween(String value1, String value2) {
            addCriterion("ce_accident_type not between", value1, value2, "ceAccidentType");
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

        public Criteria andReviewerIdIsNull() {
            addCriterion("reviewer_id is null");
            return (Criteria) this;
        }

        public Criteria andReviewerIdIsNotNull() {
            addCriterion("reviewer_id is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerIdEqualTo(Long value) {
            addCriterion("reviewer_id =", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdNotEqualTo(Long value) {
            addCriterion("reviewer_id <>", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdGreaterThan(Long value) {
            addCriterion("reviewer_id >", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("reviewer_id >=", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdLessThan(Long value) {
            addCriterion("reviewer_id <", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdLessThanOrEqualTo(Long value) {
            addCriterion("reviewer_id <=", value, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdIn(List<Long> values) {
            addCriterion("reviewer_id in", values, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdNotIn(List<Long> values) {
            addCriterion("reviewer_id not in", values, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdBetween(Long value1, Long value2) {
            addCriterion("reviewer_id between", value1, value2, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andReviewerIdNotBetween(Long value1, Long value2) {
            addCriterion("reviewer_id not between", value1, value2, "reviewerId");
            return (Criteria) this;
        }

        public Criteria andTheInsuredNameIsNull() {
            addCriterion("the_insured_name is null");
            return (Criteria) this;
        }

        public Criteria andTheInsuredNameIsNotNull() {
            addCriterion("the_insured_name is not null");
            return (Criteria) this;
        }

        public Criteria andTheInsuredNameEqualTo(String value) {
            addCriterion("the_insured_name =", value, "theInsuredName");
            return (Criteria) this;
        }

        public Criteria andTheInsuredNameNotEqualTo(String value) {
            addCriterion("the_insured_name <>", value, "theInsuredName");
            return (Criteria) this;
        }

        public Criteria andTheInsuredNameGreaterThan(String value) {
            addCriterion("the_insured_name >", value, "theInsuredName");
            return (Criteria) this;
        }

        public Criteria andTheInsuredNameGreaterThanOrEqualTo(String value) {
            addCriterion("the_insured_name >=", value, "theInsuredName");
            return (Criteria) this;
        }

        public Criteria andTheInsuredNameLessThan(String value) {
            addCriterion("the_insured_name <", value, "theInsuredName");
            return (Criteria) this;
        }

        public Criteria andTheInsuredNameLessThanOrEqualTo(String value) {
            addCriterion("the_insured_name <=", value, "theInsuredName");
            return (Criteria) this;
        }

        public Criteria andTheInsuredNameLike(String value) {
            addCriterion("the_insured_name like", value, "theInsuredName");
            return (Criteria) this;
        }

        public Criteria andTheInsuredNameNotLike(String value) {
            addCriterion("the_insured_name not like", value, "theInsuredName");
            return (Criteria) this;
        }

        public Criteria andTheInsuredNameIn(List<String> values) {
            addCriterion("the_insured_name in", values, "theInsuredName");
            return (Criteria) this;
        }

        public Criteria andTheInsuredNameNotIn(List<String> values) {
            addCriterion("the_insured_name not in", values, "theInsuredName");
            return (Criteria) this;
        }

        public Criteria andTheInsuredNameBetween(String value1, String value2) {
            addCriterion("the_insured_name between", value1, value2, "theInsuredName");
            return (Criteria) this;
        }

        public Criteria andTheInsuredNameNotBetween(String value1, String value2) {
            addCriterion("the_insured_name not between", value1, value2, "theInsuredName");
            return (Criteria) this;
        }

        public Criteria andReportDateIsNull() {
            addCriterion("report_date is null");
            return (Criteria) this;
        }

        public Criteria andReportDateIsNotNull() {
            addCriterion("report_date is not null");
            return (Criteria) this;
        }

        public Criteria andReportDateEqualTo(Date value) {
            addCriterion("report_date =", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotEqualTo(Date value) {
            addCriterion("report_date <>", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThan(Date value) {
            addCriterion("report_date >", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThanOrEqualTo(Date value) {
            addCriterion("report_date >=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThan(Date value) {
            addCriterion("report_date <", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThanOrEqualTo(Date value) {
            addCriterion("report_date <=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateIn(List<Date> values) {
            addCriterion("report_date in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotIn(List<Date> values) {
            addCriterion("report_date not in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateBetween(Date value1, Date value2) {
            addCriterion("report_date between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotBetween(Date value1, Date value2) {
            addCriterion("report_date not between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andClaimsAgencyIsNull() {
            addCriterion("claims_agency is null");
            return (Criteria) this;
        }

        public Criteria andClaimsAgencyIsNotNull() {
            addCriterion("claims_agency is not null");
            return (Criteria) this;
        }

        public Criteria andClaimsAgencyEqualTo(String value) {
            addCriterion("claims_agency =", value, "claimsAgency");
            return (Criteria) this;
        }

        public Criteria andClaimsAgencyNotEqualTo(String value) {
            addCriterion("claims_agency <>", value, "claimsAgency");
            return (Criteria) this;
        }

        public Criteria andClaimsAgencyGreaterThan(String value) {
            addCriterion("claims_agency >", value, "claimsAgency");
            return (Criteria) this;
        }

        public Criteria andClaimsAgencyGreaterThanOrEqualTo(String value) {
            addCriterion("claims_agency >=", value, "claimsAgency");
            return (Criteria) this;
        }

        public Criteria andClaimsAgencyLessThan(String value) {
            addCriterion("claims_agency <", value, "claimsAgency");
            return (Criteria) this;
        }

        public Criteria andClaimsAgencyLessThanOrEqualTo(String value) {
            addCriterion("claims_agency <=", value, "claimsAgency");
            return (Criteria) this;
        }

        public Criteria andClaimsAgencyLike(String value) {
            addCriterion("claims_agency like", value, "claimsAgency");
            return (Criteria) this;
        }

        public Criteria andClaimsAgencyNotLike(String value) {
            addCriterion("claims_agency not like", value, "claimsAgency");
            return (Criteria) this;
        }

        public Criteria andClaimsAgencyIn(List<String> values) {
            addCriterion("claims_agency in", values, "claimsAgency");
            return (Criteria) this;
        }

        public Criteria andClaimsAgencyNotIn(List<String> values) {
            addCriterion("claims_agency not in", values, "claimsAgency");
            return (Criteria) this;
        }

        public Criteria andClaimsAgencyBetween(String value1, String value2) {
            addCriterion("claims_agency between", value1, value2, "claimsAgency");
            return (Criteria) this;
        }

        public Criteria andClaimsAgencyNotBetween(String value1, String value2) {
            addCriterion("claims_agency not between", value1, value2, "claimsAgency");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNull() {
            addCriterion("notify_url is null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNotNull() {
            addCriterion("notify_url is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlEqualTo(String value) {
            addCriterion("notify_url =", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotEqualTo(String value) {
            addCriterion("notify_url <>", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThan(String value) {
            addCriterion("notify_url >", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("notify_url >=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThan(String value) {
            addCriterion("notify_url <", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThanOrEqualTo(String value) {
            addCriterion("notify_url <=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLike(String value) {
            addCriterion("notify_url like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotLike(String value) {
            addCriterion("notify_url not like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIn(List<String> values) {
            addCriterion("notify_url in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotIn(List<String> values) {
            addCriterion("notify_url not in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlBetween(String value1, String value2) {
            addCriterion("notify_url between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotBetween(String value1, String value2) {
            addCriterion("notify_url not between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlIsNull() {
            addCriterion("return_url is null");
            return (Criteria) this;
        }

        public Criteria andReturnUrlIsNotNull() {
            addCriterion("return_url is not null");
            return (Criteria) this;
        }

        public Criteria andReturnUrlEqualTo(String value) {
            addCriterion("return_url =", value, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlNotEqualTo(String value) {
            addCriterion("return_url <>", value, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlGreaterThan(String value) {
            addCriterion("return_url >", value, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlGreaterThanOrEqualTo(String value) {
            addCriterion("return_url >=", value, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlLessThan(String value) {
            addCriterion("return_url <", value, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlLessThanOrEqualTo(String value) {
            addCriterion("return_url <=", value, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlLike(String value) {
            addCriterion("return_url like", value, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlNotLike(String value) {
            addCriterion("return_url not like", value, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlIn(List<String> values) {
            addCriterion("return_url in", values, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlNotIn(List<String> values) {
            addCriterion("return_url not in", values, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlBetween(String value1, String value2) {
            addCriterion("return_url between", value1, value2, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andReturnUrlNotBetween(String value1, String value2) {
            addCriterion("return_url not between", value1, value2, "returnUrl");
            return (Criteria) this;
        }

        public Criteria andLossTimeIsNull() {
            addCriterion("loss_time is null");
            return (Criteria) this;
        }

        public Criteria andLossTimeIsNotNull() {
            addCriterion("loss_time is not null");
            return (Criteria) this;
        }

        public Criteria andLossTimeEqualTo(Date value) {
            addCriterion("loss_time =", value, "lossTime");
            return (Criteria) this;
        }

        public Criteria andLossTimeNotEqualTo(Date value) {
            addCriterion("loss_time <>", value, "lossTime");
            return (Criteria) this;
        }

        public Criteria andLossTimeGreaterThan(Date value) {
            addCriterion("loss_time >", value, "lossTime");
            return (Criteria) this;
        }

        public Criteria andLossTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("loss_time >=", value, "lossTime");
            return (Criteria) this;
        }

        public Criteria andLossTimeLessThan(Date value) {
            addCriterion("loss_time <", value, "lossTime");
            return (Criteria) this;
        }

        public Criteria andLossTimeLessThanOrEqualTo(Date value) {
            addCriterion("loss_time <=", value, "lossTime");
            return (Criteria) this;
        }

        public Criteria andLossTimeIn(List<Date> values) {
            addCriterion("loss_time in", values, "lossTime");
            return (Criteria) this;
        }

        public Criteria andLossTimeNotIn(List<Date> values) {
            addCriterion("loss_time not in", values, "lossTime");
            return (Criteria) this;
        }

        public Criteria andLossTimeBetween(Date value1, Date value2) {
            addCriterion("loss_time between", value1, value2, "lossTime");
            return (Criteria) this;
        }

        public Criteria andLossTimeNotBetween(Date value1, Date value2) {
            addCriterion("loss_time not between", value1, value2, "lossTime");
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

        public Criteria andTaskTypeFirstIsNull() {
            addCriterion("task_type_first is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeFirstIsNotNull() {
            addCriterion("task_type_first is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeFirstEqualTo(String value) {
            addCriterion("task_type_first =", value, "taskTypeFirst");
            return (Criteria) this;
        }

        public Criteria andTaskTypeFirstNotEqualTo(String value) {
            addCriterion("task_type_first <>", value, "taskTypeFirst");
            return (Criteria) this;
        }

        public Criteria andTaskTypeFirstGreaterThan(String value) {
            addCriterion("task_type_first >", value, "taskTypeFirst");
            return (Criteria) this;
        }

        public Criteria andTaskTypeFirstGreaterThanOrEqualTo(String value) {
            addCriterion("task_type_first >=", value, "taskTypeFirst");
            return (Criteria) this;
        }

        public Criteria andTaskTypeFirstLessThan(String value) {
            addCriterion("task_type_first <", value, "taskTypeFirst");
            return (Criteria) this;
        }

        public Criteria andTaskTypeFirstLessThanOrEqualTo(String value) {
            addCriterion("task_type_first <=", value, "taskTypeFirst");
            return (Criteria) this;
        }

        public Criteria andTaskTypeFirstLike(String value) {
            addCriterion("task_type_first like", value, "taskTypeFirst");
            return (Criteria) this;
        }

        public Criteria andTaskTypeFirstNotLike(String value) {
            addCriterion("task_type_first not like", value, "taskTypeFirst");
            return (Criteria) this;
        }

        public Criteria andTaskTypeFirstIn(List<String> values) {
            addCriterion("task_type_first in", values, "taskTypeFirst");
            return (Criteria) this;
        }

        public Criteria andTaskTypeFirstNotIn(List<String> values) {
            addCriterion("task_type_first not in", values, "taskTypeFirst");
            return (Criteria) this;
        }

        public Criteria andTaskTypeFirstBetween(String value1, String value2) {
            addCriterion("task_type_first between", value1, value2, "taskTypeFirst");
            return (Criteria) this;
        }

        public Criteria andTaskTypeFirstNotBetween(String value1, String value2) {
            addCriterion("task_type_first not between", value1, value2, "taskTypeFirst");
            return (Criteria) this;
        }

        public Criteria andTaskTypeSecondIsNull() {
            addCriterion("task_type_second is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeSecondIsNotNull() {
            addCriterion("task_type_second is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeSecondEqualTo(String value) {
            addCriterion("task_type_second =", value, "taskTypeSecond");
            return (Criteria) this;
        }

        public Criteria andTaskTypeSecondNotEqualTo(String value) {
            addCriterion("task_type_second <>", value, "taskTypeSecond");
            return (Criteria) this;
        }

        public Criteria andTaskTypeSecondGreaterThan(String value) {
            addCriterion("task_type_second >", value, "taskTypeSecond");
            return (Criteria) this;
        }

        public Criteria andTaskTypeSecondGreaterThanOrEqualTo(String value) {
            addCriterion("task_type_second >=", value, "taskTypeSecond");
            return (Criteria) this;
        }

        public Criteria andTaskTypeSecondLessThan(String value) {
            addCriterion("task_type_second <", value, "taskTypeSecond");
            return (Criteria) this;
        }

        public Criteria andTaskTypeSecondLessThanOrEqualTo(String value) {
            addCriterion("task_type_second <=", value, "taskTypeSecond");
            return (Criteria) this;
        }

        public Criteria andTaskTypeSecondLike(String value) {
            addCriterion("task_type_second like", value, "taskTypeSecond");
            return (Criteria) this;
        }

        public Criteria andTaskTypeSecondNotLike(String value) {
            addCriterion("task_type_second not like", value, "taskTypeSecond");
            return (Criteria) this;
        }

        public Criteria andTaskTypeSecondIn(List<String> values) {
            addCriterion("task_type_second in", values, "taskTypeSecond");
            return (Criteria) this;
        }

        public Criteria andTaskTypeSecondNotIn(List<String> values) {
            addCriterion("task_type_second not in", values, "taskTypeSecond");
            return (Criteria) this;
        }

        public Criteria andTaskTypeSecondBetween(String value1, String value2) {
            addCriterion("task_type_second between", value1, value2, "taskTypeSecond");
            return (Criteria) this;
        }

        public Criteria andTaskTypeSecondNotBetween(String value1, String value2) {
            addCriterion("task_type_second not between", value1, value2, "taskTypeSecond");
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