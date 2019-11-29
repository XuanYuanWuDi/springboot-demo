package com.injured.server.api.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CeRegistSurveyCarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CeRegistSurveyCarExample() {
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

        public Criteria andCeRegistSurveyIdIsNull() {
            addCriterion("ce_regist_survey_id is null");
            return (Criteria) this;
        }

        public Criteria andCeRegistSurveyIdIsNotNull() {
            addCriterion("ce_regist_survey_id is not null");
            return (Criteria) this;
        }

        public Criteria andCeRegistSurveyIdEqualTo(Long value) {
            addCriterion("ce_regist_survey_id =", value, "ceRegistSurveyId");
            return (Criteria) this;
        }

        public Criteria andCeRegistSurveyIdNotEqualTo(Long value) {
            addCriterion("ce_regist_survey_id <>", value, "ceRegistSurveyId");
            return (Criteria) this;
        }

        public Criteria andCeRegistSurveyIdGreaterThan(Long value) {
            addCriterion("ce_regist_survey_id >", value, "ceRegistSurveyId");
            return (Criteria) this;
        }

        public Criteria andCeRegistSurveyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ce_regist_survey_id >=", value, "ceRegistSurveyId");
            return (Criteria) this;
        }

        public Criteria andCeRegistSurveyIdLessThan(Long value) {
            addCriterion("ce_regist_survey_id <", value, "ceRegistSurveyId");
            return (Criteria) this;
        }

        public Criteria andCeRegistSurveyIdLessThanOrEqualTo(Long value) {
            addCriterion("ce_regist_survey_id <=", value, "ceRegistSurveyId");
            return (Criteria) this;
        }

        public Criteria andCeRegistSurveyIdIn(List<Long> values) {
            addCriterion("ce_regist_survey_id in", values, "ceRegistSurveyId");
            return (Criteria) this;
        }

        public Criteria andCeRegistSurveyIdNotIn(List<Long> values) {
            addCriterion("ce_regist_survey_id not in", values, "ceRegistSurveyId");
            return (Criteria) this;
        }

        public Criteria andCeRegistSurveyIdBetween(Long value1, Long value2) {
            addCriterion("ce_regist_survey_id between", value1, value2, "ceRegistSurveyId");
            return (Criteria) this;
        }

        public Criteria andCeRegistSurveyIdNotBetween(Long value1, Long value2) {
            addCriterion("ce_regist_survey_id not between", value1, value2, "ceRegistSurveyId");
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

        public Criteria andSubjectThirdIsNull() {
            addCriterion("subject_third is null");
            return (Criteria) this;
        }

        public Criteria andSubjectThirdIsNotNull() {
            addCriterion("subject_third is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectThirdEqualTo(String value) {
            addCriterion("subject_third =", value, "subjectThird");
            return (Criteria) this;
        }

        public Criteria andSubjectThirdNotEqualTo(String value) {
            addCriterion("subject_third <>", value, "subjectThird");
            return (Criteria) this;
        }

        public Criteria andSubjectThirdGreaterThan(String value) {
            addCriterion("subject_third >", value, "subjectThird");
            return (Criteria) this;
        }

        public Criteria andSubjectThirdGreaterThanOrEqualTo(String value) {
            addCriterion("subject_third >=", value, "subjectThird");
            return (Criteria) this;
        }

        public Criteria andSubjectThirdLessThan(String value) {
            addCriterion("subject_third <", value, "subjectThird");
            return (Criteria) this;
        }

        public Criteria andSubjectThirdLessThanOrEqualTo(String value) {
            addCriterion("subject_third <=", value, "subjectThird");
            return (Criteria) this;
        }

        public Criteria andSubjectThirdLike(String value) {
            addCriterion("subject_third like", value, "subjectThird");
            return (Criteria) this;
        }

        public Criteria andSubjectThirdNotLike(String value) {
            addCriterion("subject_third not like", value, "subjectThird");
            return (Criteria) this;
        }

        public Criteria andSubjectThirdIn(List<String> values) {
            addCriterion("subject_third in", values, "subjectThird");
            return (Criteria) this;
        }

        public Criteria andSubjectThirdNotIn(List<String> values) {
            addCriterion("subject_third not in", values, "subjectThird");
            return (Criteria) this;
        }

        public Criteria andSubjectThirdBetween(String value1, String value2) {
            addCriterion("subject_third between", value1, value2, "subjectThird");
            return (Criteria) this;
        }

        public Criteria andSubjectThirdNotBetween(String value1, String value2) {
            addCriterion("subject_third not between", value1, value2, "subjectThird");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoIsNull() {
            addCriterion("license_plate_no is null");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoIsNotNull() {
            addCriterion("license_plate_no is not null");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoEqualTo(String value) {
            addCriterion("license_plate_no =", value, "licensePlateNo");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoNotEqualTo(String value) {
            addCriterion("license_plate_no <>", value, "licensePlateNo");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoGreaterThan(String value) {
            addCriterion("license_plate_no >", value, "licensePlateNo");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoGreaterThanOrEqualTo(String value) {
            addCriterion("license_plate_no >=", value, "licensePlateNo");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoLessThan(String value) {
            addCriterion("license_plate_no <", value, "licensePlateNo");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoLessThanOrEqualTo(String value) {
            addCriterion("license_plate_no <=", value, "licensePlateNo");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoLike(String value) {
            addCriterion("license_plate_no like", value, "licensePlateNo");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoNotLike(String value) {
            addCriterion("license_plate_no not like", value, "licensePlateNo");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoIn(List<String> values) {
            addCriterion("license_plate_no in", values, "licensePlateNo");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoNotIn(List<String> values) {
            addCriterion("license_plate_no not in", values, "licensePlateNo");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoBetween(String value1, String value2) {
            addCriterion("license_plate_no between", value1, value2, "licensePlateNo");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNoNotBetween(String value1, String value2) {
            addCriterion("license_plate_no not between", value1, value2, "licensePlateNo");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoIsNull() {
            addCriterion("hkmac_license_plate_no is null");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoIsNotNull() {
            addCriterion("hkmac_license_plate_no is not null");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoEqualTo(String value) {
            addCriterion("hkmac_license_plate_no =", value, "hkmacLicensePlateNo");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoNotEqualTo(String value) {
            addCriterion("hkmac_license_plate_no <>", value, "hkmacLicensePlateNo");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoGreaterThan(String value) {
            addCriterion("hkmac_license_plate_no >", value, "hkmacLicensePlateNo");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoGreaterThanOrEqualTo(String value) {
            addCriterion("hkmac_license_plate_no >=", value, "hkmacLicensePlateNo");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoLessThan(String value) {
            addCriterion("hkmac_license_plate_no <", value, "hkmacLicensePlateNo");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoLessThanOrEqualTo(String value) {
            addCriterion("hkmac_license_plate_no <=", value, "hkmacLicensePlateNo");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoLike(String value) {
            addCriterion("hkmac_license_plate_no like", value, "hkmacLicensePlateNo");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoNotLike(String value) {
            addCriterion("hkmac_license_plate_no not like", value, "hkmacLicensePlateNo");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoIn(List<String> values) {
            addCriterion("hkmac_license_plate_no in", values, "hkmacLicensePlateNo");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoNotIn(List<String> values) {
            addCriterion("hkmac_license_plate_no not in", values, "hkmacLicensePlateNo");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoBetween(String value1, String value2) {
            addCriterion("hkmac_license_plate_no between", value1, value2, "hkmacLicensePlateNo");
            return (Criteria) this;
        }

        public Criteria andHkmacLicensePlateNoNotBetween(String value1, String value2) {
            addCriterion("hkmac_license_plate_no not between", value1, value2, "hkmacLicensePlateNo");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("owner is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("owner is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("owner =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("owner <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("owner >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("owner >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("owner <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("owner <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("owner like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("owner not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("owner in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("owner not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("owner between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("owner not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andInsuredNameIsNull() {
            addCriterion("insured_name is null");
            return (Criteria) this;
        }

        public Criteria andInsuredNameIsNotNull() {
            addCriterion("insured_name is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredNameEqualTo(String value) {
            addCriterion("insured_name =", value, "insuredName");
            return (Criteria) this;
        }

        public Criteria andInsuredNameNotEqualTo(String value) {
            addCriterion("insured_name <>", value, "insuredName");
            return (Criteria) this;
        }

        public Criteria andInsuredNameGreaterThan(String value) {
            addCriterion("insured_name >", value, "insuredName");
            return (Criteria) this;
        }

        public Criteria andInsuredNameGreaterThanOrEqualTo(String value) {
            addCriterion("insured_name >=", value, "insuredName");
            return (Criteria) this;
        }

        public Criteria andInsuredNameLessThan(String value) {
            addCriterion("insured_name <", value, "insuredName");
            return (Criteria) this;
        }

        public Criteria andInsuredNameLessThanOrEqualTo(String value) {
            addCriterion("insured_name <=", value, "insuredName");
            return (Criteria) this;
        }

        public Criteria andInsuredNameLike(String value) {
            addCriterion("insured_name like", value, "insuredName");
            return (Criteria) this;
        }

        public Criteria andInsuredNameNotLike(String value) {
            addCriterion("insured_name not like", value, "insuredName");
            return (Criteria) this;
        }

        public Criteria andInsuredNameIn(List<String> values) {
            addCriterion("insured_name in", values, "insuredName");
            return (Criteria) this;
        }

        public Criteria andInsuredNameNotIn(List<String> values) {
            addCriterion("insured_name not in", values, "insuredName");
            return (Criteria) this;
        }

        public Criteria andInsuredNameBetween(String value1, String value2) {
            addCriterion("insured_name between", value1, value2, "insuredName");
            return (Criteria) this;
        }

        public Criteria andInsuredNameNotBetween(String value1, String value2) {
            addCriterion("insured_name not between", value1, value2, "insuredName");
            return (Criteria) this;
        }

        public Criteria andBzPolicyNoIsNull() {
            addCriterion("bz_policy_no is null");
            return (Criteria) this;
        }

        public Criteria andBzPolicyNoIsNotNull() {
            addCriterion("bz_policy_no is not null");
            return (Criteria) this;
        }

        public Criteria andBzPolicyNoEqualTo(String value) {
            addCriterion("bz_policy_no =", value, "bzPolicyNo");
            return (Criteria) this;
        }

        public Criteria andBzPolicyNoNotEqualTo(String value) {
            addCriterion("bz_policy_no <>", value, "bzPolicyNo");
            return (Criteria) this;
        }

        public Criteria andBzPolicyNoGreaterThan(String value) {
            addCriterion("bz_policy_no >", value, "bzPolicyNo");
            return (Criteria) this;
        }

        public Criteria andBzPolicyNoGreaterThanOrEqualTo(String value) {
            addCriterion("bz_policy_no >=", value, "bzPolicyNo");
            return (Criteria) this;
        }

        public Criteria andBzPolicyNoLessThan(String value) {
            addCriterion("bz_policy_no <", value, "bzPolicyNo");
            return (Criteria) this;
        }

        public Criteria andBzPolicyNoLessThanOrEqualTo(String value) {
            addCriterion("bz_policy_no <=", value, "bzPolicyNo");
            return (Criteria) this;
        }

        public Criteria andBzPolicyNoLike(String value) {
            addCriterion("bz_policy_no like", value, "bzPolicyNo");
            return (Criteria) this;
        }

        public Criteria andBzPolicyNoNotLike(String value) {
            addCriterion("bz_policy_no not like", value, "bzPolicyNo");
            return (Criteria) this;
        }

        public Criteria andBzPolicyNoIn(List<String> values) {
            addCriterion("bz_policy_no in", values, "bzPolicyNo");
            return (Criteria) this;
        }

        public Criteria andBzPolicyNoNotIn(List<String> values) {
            addCriterion("bz_policy_no not in", values, "bzPolicyNo");
            return (Criteria) this;
        }

        public Criteria andBzPolicyNoBetween(String value1, String value2) {
            addCriterion("bz_policy_no between", value1, value2, "bzPolicyNo");
            return (Criteria) this;
        }

        public Criteria andBzPolicyNoNotBetween(String value1, String value2) {
            addCriterion("bz_policy_no not between", value1, value2, "bzPolicyNo");
            return (Criteria) this;
        }

        public Criteria andBzCompanyCodeIsNull() {
            addCriterion("bz_company_code is null");
            return (Criteria) this;
        }

        public Criteria andBzCompanyCodeIsNotNull() {
            addCriterion("bz_company_code is not null");
            return (Criteria) this;
        }

        public Criteria andBzCompanyCodeEqualTo(String value) {
            addCriterion("bz_company_code =", value, "bzCompanyCode");
            return (Criteria) this;
        }

        public Criteria andBzCompanyCodeNotEqualTo(String value) {
            addCriterion("bz_company_code <>", value, "bzCompanyCode");
            return (Criteria) this;
        }

        public Criteria andBzCompanyCodeGreaterThan(String value) {
            addCriterion("bz_company_code >", value, "bzCompanyCode");
            return (Criteria) this;
        }

        public Criteria andBzCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bz_company_code >=", value, "bzCompanyCode");
            return (Criteria) this;
        }

        public Criteria andBzCompanyCodeLessThan(String value) {
            addCriterion("bz_company_code <", value, "bzCompanyCode");
            return (Criteria) this;
        }

        public Criteria andBzCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("bz_company_code <=", value, "bzCompanyCode");
            return (Criteria) this;
        }

        public Criteria andBzCompanyCodeLike(String value) {
            addCriterion("bz_company_code like", value, "bzCompanyCode");
            return (Criteria) this;
        }

        public Criteria andBzCompanyCodeNotLike(String value) {
            addCriterion("bz_company_code not like", value, "bzCompanyCode");
            return (Criteria) this;
        }

        public Criteria andBzCompanyCodeIn(List<String> values) {
            addCriterion("bz_company_code in", values, "bzCompanyCode");
            return (Criteria) this;
        }

        public Criteria andBzCompanyCodeNotIn(List<String> values) {
            addCriterion("bz_company_code not in", values, "bzCompanyCode");
            return (Criteria) this;
        }

        public Criteria andBzCompanyCodeBetween(String value1, String value2) {
            addCriterion("bz_company_code between", value1, value2, "bzCompanyCode");
            return (Criteria) this;
        }

        public Criteria andBzCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("bz_company_code not between", value1, value2, "bzCompanyCode");
            return (Criteria) this;
        }

        public Criteria andSubCompanyNameIsNull() {
            addCriterion("sub_company_name is null");
            return (Criteria) this;
        }

        public Criteria andSubCompanyNameIsNotNull() {
            addCriterion("sub_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubCompanyNameEqualTo(String value) {
            addCriterion("sub_company_name =", value, "subCompanyName");
            return (Criteria) this;
        }

        public Criteria andSubCompanyNameNotEqualTo(String value) {
            addCriterion("sub_company_name <>", value, "subCompanyName");
            return (Criteria) this;
        }

        public Criteria andSubCompanyNameGreaterThan(String value) {
            addCriterion("sub_company_name >", value, "subCompanyName");
            return (Criteria) this;
        }

        public Criteria andSubCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("sub_company_name >=", value, "subCompanyName");
            return (Criteria) this;
        }

        public Criteria andSubCompanyNameLessThan(String value) {
            addCriterion("sub_company_name <", value, "subCompanyName");
            return (Criteria) this;
        }

        public Criteria andSubCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("sub_company_name <=", value, "subCompanyName");
            return (Criteria) this;
        }

        public Criteria andSubCompanyNameLike(String value) {
            addCriterion("sub_company_name like", value, "subCompanyName");
            return (Criteria) this;
        }

        public Criteria andSubCompanyNameNotLike(String value) {
            addCriterion("sub_company_name not like", value, "subCompanyName");
            return (Criteria) this;
        }

        public Criteria andSubCompanyNameIn(List<String> values) {
            addCriterion("sub_company_name in", values, "subCompanyName");
            return (Criteria) this;
        }

        public Criteria andSubCompanyNameNotIn(List<String> values) {
            addCriterion("sub_company_name not in", values, "subCompanyName");
            return (Criteria) this;
        }

        public Criteria andSubCompanyNameBetween(String value1, String value2) {
            addCriterion("sub_company_name between", value1, value2, "subCompanyName");
            return (Criteria) this;
        }

        public Criteria andSubCompanyNameNotBetween(String value1, String value2) {
            addCriterion("sub_company_name not between", value1, value2, "subCompanyName");
            return (Criteria) this;
        }

        public Criteria andModelCodeIsNull() {
            addCriterion("model_code is null");
            return (Criteria) this;
        }

        public Criteria andModelCodeIsNotNull() {
            addCriterion("model_code is not null");
            return (Criteria) this;
        }

        public Criteria andModelCodeEqualTo(String value) {
            addCriterion("model_code =", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeNotEqualTo(String value) {
            addCriterion("model_code <>", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeGreaterThan(String value) {
            addCriterion("model_code >", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("model_code >=", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeLessThan(String value) {
            addCriterion("model_code <", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeLessThanOrEqualTo(String value) {
            addCriterion("model_code <=", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeLike(String value) {
            addCriterion("model_code like", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeNotLike(String value) {
            addCriterion("model_code not like", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeIn(List<String> values) {
            addCriterion("model_code in", values, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeNotIn(List<String> values) {
            addCriterion("model_code not in", values, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeBetween(String value1, String value2) {
            addCriterion("model_code between", value1, value2, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeNotBetween(String value1, String value2) {
            addCriterion("model_code not between", value1, value2, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNull() {
            addCriterion("model_name is null");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNotNull() {
            addCriterion("model_name is not null");
            return (Criteria) this;
        }

        public Criteria andModelNameEqualTo(String value) {
            addCriterion("model_name =", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotEqualTo(String value) {
            addCriterion("model_name <>", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThan(String value) {
            addCriterion("model_name >", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThanOrEqualTo(String value) {
            addCriterion("model_name >=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThan(String value) {
            addCriterion("model_name <", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThanOrEqualTo(String value) {
            addCriterion("model_name <=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLike(String value) {
            addCriterion("model_name like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotLike(String value) {
            addCriterion("model_name not like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameIn(List<String> values) {
            addCriterion("model_name in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotIn(List<String> values) {
            addCriterion("model_name not in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameBetween(String value1, String value2) {
            addCriterion("model_name between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotBetween(String value1, String value2) {
            addCriterion("model_name not between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandCodeIsNull() {
            addCriterion("vehicle_brand_code is null");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandCodeIsNotNull() {
            addCriterion("vehicle_brand_code is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandCodeEqualTo(String value) {
            addCriterion("vehicle_brand_code =", value, "vehicleBrandCode");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandCodeNotEqualTo(String value) {
            addCriterion("vehicle_brand_code <>", value, "vehicleBrandCode");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandCodeGreaterThan(String value) {
            addCriterion("vehicle_brand_code >", value, "vehicleBrandCode");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandCodeGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_brand_code >=", value, "vehicleBrandCode");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandCodeLessThan(String value) {
            addCriterion("vehicle_brand_code <", value, "vehicleBrandCode");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandCodeLessThanOrEqualTo(String value) {
            addCriterion("vehicle_brand_code <=", value, "vehicleBrandCode");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandCodeLike(String value) {
            addCriterion("vehicle_brand_code like", value, "vehicleBrandCode");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandCodeNotLike(String value) {
            addCriterion("vehicle_brand_code not like", value, "vehicleBrandCode");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandCodeIn(List<String> values) {
            addCriterion("vehicle_brand_code in", values, "vehicleBrandCode");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandCodeNotIn(List<String> values) {
            addCriterion("vehicle_brand_code not in", values, "vehicleBrandCode");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandCodeBetween(String value1, String value2) {
            addCriterion("vehicle_brand_code between", value1, value2, "vehicleBrandCode");
            return (Criteria) this;
        }

        public Criteria andVehicleBrandCodeNotBetween(String value1, String value2) {
            addCriterion("vehicle_brand_code not between", value1, value2, "vehicleBrandCode");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesCodeIsNull() {
            addCriterion("vehicle_series_code is null");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesCodeIsNotNull() {
            addCriterion("vehicle_series_code is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesCodeEqualTo(String value) {
            addCriterion("vehicle_series_code =", value, "vehicleSeriesCode");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesCodeNotEqualTo(String value) {
            addCriterion("vehicle_series_code <>", value, "vehicleSeriesCode");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesCodeGreaterThan(String value) {
            addCriterion("vehicle_series_code >", value, "vehicleSeriesCode");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesCodeGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_series_code >=", value, "vehicleSeriesCode");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesCodeLessThan(String value) {
            addCriterion("vehicle_series_code <", value, "vehicleSeriesCode");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesCodeLessThanOrEqualTo(String value) {
            addCriterion("vehicle_series_code <=", value, "vehicleSeriesCode");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesCodeLike(String value) {
            addCriterion("vehicle_series_code like", value, "vehicleSeriesCode");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesCodeNotLike(String value) {
            addCriterion("vehicle_series_code not like", value, "vehicleSeriesCode");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesCodeIn(List<String> values) {
            addCriterion("vehicle_series_code in", values, "vehicleSeriesCode");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesCodeNotIn(List<String> values) {
            addCriterion("vehicle_series_code not in", values, "vehicleSeriesCode");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesCodeBetween(String value1, String value2) {
            addCriterion("vehicle_series_code between", value1, value2, "vehicleSeriesCode");
            return (Criteria) this;
        }

        public Criteria andVehicleSeriesCodeNotBetween(String value1, String value2) {
            addCriterion("vehicle_series_code not between", value1, value2, "vehicleSeriesCode");
            return (Criteria) this;
        }

        public Criteria andGroupVehCodeIsNull() {
            addCriterion("group_veh_code is null");
            return (Criteria) this;
        }

        public Criteria andGroupVehCodeIsNotNull() {
            addCriterion("group_veh_code is not null");
            return (Criteria) this;
        }

        public Criteria andGroupVehCodeEqualTo(String value) {
            addCriterion("group_veh_code =", value, "groupVehCode");
            return (Criteria) this;
        }

        public Criteria andGroupVehCodeNotEqualTo(String value) {
            addCriterion("group_veh_code <>", value, "groupVehCode");
            return (Criteria) this;
        }

        public Criteria andGroupVehCodeGreaterThan(String value) {
            addCriterion("group_veh_code >", value, "groupVehCode");
            return (Criteria) this;
        }

        public Criteria andGroupVehCodeGreaterThanOrEqualTo(String value) {
            addCriterion("group_veh_code >=", value, "groupVehCode");
            return (Criteria) this;
        }

        public Criteria andGroupVehCodeLessThan(String value) {
            addCriterion("group_veh_code <", value, "groupVehCode");
            return (Criteria) this;
        }

        public Criteria andGroupVehCodeLessThanOrEqualTo(String value) {
            addCriterion("group_veh_code <=", value, "groupVehCode");
            return (Criteria) this;
        }

        public Criteria andGroupVehCodeLike(String value) {
            addCriterion("group_veh_code like", value, "groupVehCode");
            return (Criteria) this;
        }

        public Criteria andGroupVehCodeNotLike(String value) {
            addCriterion("group_veh_code not like", value, "groupVehCode");
            return (Criteria) this;
        }

        public Criteria andGroupVehCodeIn(List<String> values) {
            addCriterion("group_veh_code in", values, "groupVehCode");
            return (Criteria) this;
        }

        public Criteria andGroupVehCodeNotIn(List<String> values) {
            addCriterion("group_veh_code not in", values, "groupVehCode");
            return (Criteria) this;
        }

        public Criteria andGroupVehCodeBetween(String value1, String value2) {
            addCriterion("group_veh_code between", value1, value2, "groupVehCode");
            return (Criteria) this;
        }

        public Criteria andGroupVehCodeNotBetween(String value1, String value2) {
            addCriterion("group_veh_code not between", value1, value2, "groupVehCode");
            return (Criteria) this;
        }

        public Criteria andManuCodeIsNull() {
            addCriterion("manu_code is null");
            return (Criteria) this;
        }

        public Criteria andManuCodeIsNotNull() {
            addCriterion("manu_code is not null");
            return (Criteria) this;
        }

        public Criteria andManuCodeEqualTo(String value) {
            addCriterion("manu_code =", value, "manuCode");
            return (Criteria) this;
        }

        public Criteria andManuCodeNotEqualTo(String value) {
            addCriterion("manu_code <>", value, "manuCode");
            return (Criteria) this;
        }

        public Criteria andManuCodeGreaterThan(String value) {
            addCriterion("manu_code >", value, "manuCode");
            return (Criteria) this;
        }

        public Criteria andManuCodeGreaterThanOrEqualTo(String value) {
            addCriterion("manu_code >=", value, "manuCode");
            return (Criteria) this;
        }

        public Criteria andManuCodeLessThan(String value) {
            addCriterion("manu_code <", value, "manuCode");
            return (Criteria) this;
        }

        public Criteria andManuCodeLessThanOrEqualTo(String value) {
            addCriterion("manu_code <=", value, "manuCode");
            return (Criteria) this;
        }

        public Criteria andManuCodeLike(String value) {
            addCriterion("manu_code like", value, "manuCode");
            return (Criteria) this;
        }

        public Criteria andManuCodeNotLike(String value) {
            addCriterion("manu_code not like", value, "manuCode");
            return (Criteria) this;
        }

        public Criteria andManuCodeIn(List<String> values) {
            addCriterion("manu_code in", values, "manuCode");
            return (Criteria) this;
        }

        public Criteria andManuCodeNotIn(List<String> values) {
            addCriterion("manu_code not in", values, "manuCode");
            return (Criteria) this;
        }

        public Criteria andManuCodeBetween(String value1, String value2) {
            addCriterion("manu_code between", value1, value2, "manuCode");
            return (Criteria) this;
        }

        public Criteria andManuCodeNotBetween(String value1, String value2) {
            addCriterion("manu_code not between", value1, value2, "manuCode");
            return (Criteria) this;
        }

        public Criteria andTransmissionCodeIsNull() {
            addCriterion("transmission_code is null");
            return (Criteria) this;
        }

        public Criteria andTransmissionCodeIsNotNull() {
            addCriterion("transmission_code is not null");
            return (Criteria) this;
        }

        public Criteria andTransmissionCodeEqualTo(String value) {
            addCriterion("transmission_code =", value, "transmissionCode");
            return (Criteria) this;
        }

        public Criteria andTransmissionCodeNotEqualTo(String value) {
            addCriterion("transmission_code <>", value, "transmissionCode");
            return (Criteria) this;
        }

        public Criteria andTransmissionCodeGreaterThan(String value) {
            addCriterion("transmission_code >", value, "transmissionCode");
            return (Criteria) this;
        }

        public Criteria andTransmissionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("transmission_code >=", value, "transmissionCode");
            return (Criteria) this;
        }

        public Criteria andTransmissionCodeLessThan(String value) {
            addCriterion("transmission_code <", value, "transmissionCode");
            return (Criteria) this;
        }

        public Criteria andTransmissionCodeLessThanOrEqualTo(String value) {
            addCriterion("transmission_code <=", value, "transmissionCode");
            return (Criteria) this;
        }

        public Criteria andTransmissionCodeLike(String value) {
            addCriterion("transmission_code like", value, "transmissionCode");
            return (Criteria) this;
        }

        public Criteria andTransmissionCodeNotLike(String value) {
            addCriterion("transmission_code not like", value, "transmissionCode");
            return (Criteria) this;
        }

        public Criteria andTransmissionCodeIn(List<String> values) {
            addCriterion("transmission_code in", values, "transmissionCode");
            return (Criteria) this;
        }

        public Criteria andTransmissionCodeNotIn(List<String> values) {
            addCriterion("transmission_code not in", values, "transmissionCode");
            return (Criteria) this;
        }

        public Criteria andTransmissionCodeBetween(String value1, String value2) {
            addCriterion("transmission_code between", value1, value2, "transmissionCode");
            return (Criteria) this;
        }

        public Criteria andTransmissionCodeNotBetween(String value1, String value2) {
            addCriterion("transmission_code not between", value1, value2, "transmissionCode");
            return (Criteria) this;
        }

        public Criteria andTransmissionNameIsNull() {
            addCriterion("transmission_name is null");
            return (Criteria) this;
        }

        public Criteria andTransmissionNameIsNotNull() {
            addCriterion("transmission_name is not null");
            return (Criteria) this;
        }

        public Criteria andTransmissionNameEqualTo(String value) {
            addCriterion("transmission_name =", value, "transmissionName");
            return (Criteria) this;
        }

        public Criteria andTransmissionNameNotEqualTo(String value) {
            addCriterion("transmission_name <>", value, "transmissionName");
            return (Criteria) this;
        }

        public Criteria andTransmissionNameGreaterThan(String value) {
            addCriterion("transmission_name >", value, "transmissionName");
            return (Criteria) this;
        }

        public Criteria andTransmissionNameGreaterThanOrEqualTo(String value) {
            addCriterion("transmission_name >=", value, "transmissionName");
            return (Criteria) this;
        }

        public Criteria andTransmissionNameLessThan(String value) {
            addCriterion("transmission_name <", value, "transmissionName");
            return (Criteria) this;
        }

        public Criteria andTransmissionNameLessThanOrEqualTo(String value) {
            addCriterion("transmission_name <=", value, "transmissionName");
            return (Criteria) this;
        }

        public Criteria andTransmissionNameLike(String value) {
            addCriterion("transmission_name like", value, "transmissionName");
            return (Criteria) this;
        }

        public Criteria andTransmissionNameNotLike(String value) {
            addCriterion("transmission_name not like", value, "transmissionName");
            return (Criteria) this;
        }

        public Criteria andTransmissionNameIn(List<String> values) {
            addCriterion("transmission_name in", values, "transmissionName");
            return (Criteria) this;
        }

        public Criteria andTransmissionNameNotIn(List<String> values) {
            addCriterion("transmission_name not in", values, "transmissionName");
            return (Criteria) this;
        }

        public Criteria andTransmissionNameBetween(String value1, String value2) {
            addCriterion("transmission_name between", value1, value2, "transmissionName");
            return (Criteria) this;
        }

        public Criteria andTransmissionNameNotBetween(String value1, String value2) {
            addCriterion("transmission_name not between", value1, value2, "transmissionName");
            return (Criteria) this;
        }

        public Criteria andVinIsNull() {
            addCriterion("vin is null");
            return (Criteria) this;
        }

        public Criteria andVinIsNotNull() {
            addCriterion("vin is not null");
            return (Criteria) this;
        }

        public Criteria andVinEqualTo(String value) {
            addCriterion("vin =", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotEqualTo(String value) {
            addCriterion("vin <>", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThan(String value) {
            addCriterion("vin >", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinGreaterThanOrEqualTo(String value) {
            addCriterion("vin >=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThan(String value) {
            addCriterion("vin <", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLessThanOrEqualTo(String value) {
            addCriterion("vin <=", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinLike(String value) {
            addCriterion("vin like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotLike(String value) {
            addCriterion("vin not like", value, "vin");
            return (Criteria) this;
        }

        public Criteria andVinIn(List<String> values) {
            addCriterion("vin in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotIn(List<String> values) {
            addCriterion("vin not in", values, "vin");
            return (Criteria) this;
        }

        public Criteria andVinBetween(String value1, String value2) {
            addCriterion("vin between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andVinNotBetween(String value1, String value2) {
            addCriterion("vin not between", value1, value2, "vin");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeIsNull() {
            addCriterion("car_kind_code is null");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeIsNotNull() {
            addCriterion("car_kind_code is not null");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeEqualTo(String value) {
            addCriterion("car_kind_code =", value, "carKindCode");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeNotEqualTo(String value) {
            addCriterion("car_kind_code <>", value, "carKindCode");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeGreaterThan(String value) {
            addCriterion("car_kind_code >", value, "carKindCode");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeGreaterThanOrEqualTo(String value) {
            addCriterion("car_kind_code >=", value, "carKindCode");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeLessThan(String value) {
            addCriterion("car_kind_code <", value, "carKindCode");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeLessThanOrEqualTo(String value) {
            addCriterion("car_kind_code <=", value, "carKindCode");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeLike(String value) {
            addCriterion("car_kind_code like", value, "carKindCode");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeNotLike(String value) {
            addCriterion("car_kind_code not like", value, "carKindCode");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeIn(List<String> values) {
            addCriterion("car_kind_code in", values, "carKindCode");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeNotIn(List<String> values) {
            addCriterion("car_kind_code not in", values, "carKindCode");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeBetween(String value1, String value2) {
            addCriterion("car_kind_code between", value1, value2, "carKindCode");
            return (Criteria) this;
        }

        public Criteria andCarKindCodeNotBetween(String value1, String value2) {
            addCriterion("car_kind_code not between", value1, value2, "carKindCode");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeIsNull() {
            addCriterion("veh_type_code is null");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeIsNotNull() {
            addCriterion("veh_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeEqualTo(String value) {
            addCriterion("veh_type_code =", value, "vehTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeNotEqualTo(String value) {
            addCriterion("veh_type_code <>", value, "vehTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeGreaterThan(String value) {
            addCriterion("veh_type_code >", value, "vehTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("veh_type_code >=", value, "vehTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeLessThan(String value) {
            addCriterion("veh_type_code <", value, "vehTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("veh_type_code <=", value, "vehTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeLike(String value) {
            addCriterion("veh_type_code like", value, "vehTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeNotLike(String value) {
            addCriterion("veh_type_code not like", value, "vehTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeIn(List<String> values) {
            addCriterion("veh_type_code in", values, "vehTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeNotIn(List<String> values) {
            addCriterion("veh_type_code not in", values, "vehTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeBetween(String value1, String value2) {
            addCriterion("veh_type_code between", value1, value2, "vehTypeCode");
            return (Criteria) this;
        }

        public Criteria andVehTypeCodeNotBetween(String value1, String value2) {
            addCriterion("veh_type_code not between", value1, value2, "vehTypeCode");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeIsNull() {
            addCriterion("body_type_code is null");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeIsNotNull() {
            addCriterion("body_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeEqualTo(String value) {
            addCriterion("body_type_code =", value, "bodyTypeCode");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeNotEqualTo(String value) {
            addCriterion("body_type_code <>", value, "bodyTypeCode");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeGreaterThan(String value) {
            addCriterion("body_type_code >", value, "bodyTypeCode");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("body_type_code >=", value, "bodyTypeCode");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeLessThan(String value) {
            addCriterion("body_type_code <", value, "bodyTypeCode");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("body_type_code <=", value, "bodyTypeCode");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeLike(String value) {
            addCriterion("body_type_code like", value, "bodyTypeCode");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeNotLike(String value) {
            addCriterion("body_type_code not like", value, "bodyTypeCode");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeIn(List<String> values) {
            addCriterion("body_type_code in", values, "bodyTypeCode");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeNotIn(List<String> values) {
            addCriterion("body_type_code not in", values, "bodyTypeCode");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeBetween(String value1, String value2) {
            addCriterion("body_type_code between", value1, value2, "bodyTypeCode");
            return (Criteria) this;
        }

        public Criteria andBodyTypeCodeNotBetween(String value1, String value2) {
            addCriterion("body_type_code not between", value1, value2, "bodyTypeCode");
            return (Criteria) this;
        }

        public Criteria andBrandModelIsNull() {
            addCriterion("brand_model is null");
            return (Criteria) this;
        }

        public Criteria andBrandModelIsNotNull() {
            addCriterion("brand_model is not null");
            return (Criteria) this;
        }

        public Criteria andBrandModelEqualTo(String value) {
            addCriterion("brand_model =", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelNotEqualTo(String value) {
            addCriterion("brand_model <>", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelGreaterThan(String value) {
            addCriterion("brand_model >", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelGreaterThanOrEqualTo(String value) {
            addCriterion("brand_model >=", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelLessThan(String value) {
            addCriterion("brand_model <", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelLessThanOrEqualTo(String value) {
            addCriterion("brand_model <=", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelLike(String value) {
            addCriterion("brand_model like", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelNotLike(String value) {
            addCriterion("brand_model not like", value, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelIn(List<String> values) {
            addCriterion("brand_model in", values, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelNotIn(List<String> values) {
            addCriterion("brand_model not in", values, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelBetween(String value1, String value2) {
            addCriterion("brand_model between", value1, value2, "brandModel");
            return (Criteria) this;
        }

        public Criteria andBrandModelNotBetween(String value1, String value2) {
            addCriterion("brand_model not between", value1, value2, "brandModel");
            return (Criteria) this;
        }

        public Criteria andLicensePlateTypeIsNull() {
            addCriterion("license_plate_type is null");
            return (Criteria) this;
        }

        public Criteria andLicensePlateTypeIsNotNull() {
            addCriterion("license_plate_type is not null");
            return (Criteria) this;
        }

        public Criteria andLicensePlateTypeEqualTo(String value) {
            addCriterion("license_plate_type =", value, "licensePlateType");
            return (Criteria) this;
        }

        public Criteria andLicensePlateTypeNotEqualTo(String value) {
            addCriterion("license_plate_type <>", value, "licensePlateType");
            return (Criteria) this;
        }

        public Criteria andLicensePlateTypeGreaterThan(String value) {
            addCriterion("license_plate_type >", value, "licensePlateType");
            return (Criteria) this;
        }

        public Criteria andLicensePlateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("license_plate_type >=", value, "licensePlateType");
            return (Criteria) this;
        }

        public Criteria andLicensePlateTypeLessThan(String value) {
            addCriterion("license_plate_type <", value, "licensePlateType");
            return (Criteria) this;
        }

        public Criteria andLicensePlateTypeLessThanOrEqualTo(String value) {
            addCriterion("license_plate_type <=", value, "licensePlateType");
            return (Criteria) this;
        }

        public Criteria andLicensePlateTypeLike(String value) {
            addCriterion("license_plate_type like", value, "licensePlateType");
            return (Criteria) this;
        }

        public Criteria andLicensePlateTypeNotLike(String value) {
            addCriterion("license_plate_type not like", value, "licensePlateType");
            return (Criteria) this;
        }

        public Criteria andLicensePlateTypeIn(List<String> values) {
            addCriterion("license_plate_type in", values, "licensePlateType");
            return (Criteria) this;
        }

        public Criteria andLicensePlateTypeNotIn(List<String> values) {
            addCriterion("license_plate_type not in", values, "licensePlateType");
            return (Criteria) this;
        }

        public Criteria andLicensePlateTypeBetween(String value1, String value2) {
            addCriterion("license_plate_type between", value1, value2, "licensePlateType");
            return (Criteria) this;
        }

        public Criteria andLicensePlateTypeNotBetween(String value1, String value2) {
            addCriterion("license_plate_type not between", value1, value2, "licensePlateType");
            return (Criteria) this;
        }

        public Criteria andEngineNoIsNull() {
            addCriterion("engine_no is null");
            return (Criteria) this;
        }

        public Criteria andEngineNoIsNotNull() {
            addCriterion("engine_no is not null");
            return (Criteria) this;
        }

        public Criteria andEngineNoEqualTo(String value) {
            addCriterion("engine_no =", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotEqualTo(String value) {
            addCriterion("engine_no <>", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoGreaterThan(String value) {
            addCriterion("engine_no >", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoGreaterThanOrEqualTo(String value) {
            addCriterion("engine_no >=", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLessThan(String value) {
            addCriterion("engine_no <", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLessThanOrEqualTo(String value) {
            addCriterion("engine_no <=", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLike(String value) {
            addCriterion("engine_no like", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotLike(String value) {
            addCriterion("engine_no not like", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoIn(List<String> values) {
            addCriterion("engine_no in", values, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotIn(List<String> values) {
            addCriterion("engine_no not in", values, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoBetween(String value1, String value2) {
            addCriterion("engine_no between", value1, value2, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotBetween(String value1, String value2) {
            addCriterion("engine_no not between", value1, value2, "engineNo");
            return (Criteria) this;
        }

        public Criteria andPlateColorIsNull() {
            addCriterion("plate_color is null");
            return (Criteria) this;
        }

        public Criteria andPlateColorIsNotNull() {
            addCriterion("plate_color is not null");
            return (Criteria) this;
        }

        public Criteria andPlateColorEqualTo(String value) {
            addCriterion("plate_color =", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorNotEqualTo(String value) {
            addCriterion("plate_color <>", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorGreaterThan(String value) {
            addCriterion("plate_color >", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorGreaterThanOrEqualTo(String value) {
            addCriterion("plate_color >=", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorLessThan(String value) {
            addCriterion("plate_color <", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorLessThanOrEqualTo(String value) {
            addCriterion("plate_color <=", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorLike(String value) {
            addCriterion("plate_color like", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorNotLike(String value) {
            addCriterion("plate_color not like", value, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorIn(List<String> values) {
            addCriterion("plate_color in", values, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorNotIn(List<String> values) {
            addCriterion("plate_color not in", values, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorBetween(String value1, String value2) {
            addCriterion("plate_color between", value1, value2, "plateColor");
            return (Criteria) this;
        }

        public Criteria andPlateColorNotBetween(String value1, String value2) {
            addCriterion("plate_color not between", value1, value2, "plateColor");
            return (Criteria) this;
        }

        public Criteria andSeatCountIsNull() {
            addCriterion("seat_count is null");
            return (Criteria) this;
        }

        public Criteria andSeatCountIsNotNull() {
            addCriterion("seat_count is not null");
            return (Criteria) this;
        }

        public Criteria andSeatCountEqualTo(Byte value) {
            addCriterion("seat_count =", value, "seatCount");
            return (Criteria) this;
        }

        public Criteria andSeatCountNotEqualTo(Byte value) {
            addCriterion("seat_count <>", value, "seatCount");
            return (Criteria) this;
        }

        public Criteria andSeatCountGreaterThan(Byte value) {
            addCriterion("seat_count >", value, "seatCount");
            return (Criteria) this;
        }

        public Criteria andSeatCountGreaterThanOrEqualTo(Byte value) {
            addCriterion("seat_count >=", value, "seatCount");
            return (Criteria) this;
        }

        public Criteria andSeatCountLessThan(Byte value) {
            addCriterion("seat_count <", value, "seatCount");
            return (Criteria) this;
        }

        public Criteria andSeatCountLessThanOrEqualTo(Byte value) {
            addCriterion("seat_count <=", value, "seatCount");
            return (Criteria) this;
        }

        public Criteria andSeatCountIn(List<Byte> values) {
            addCriterion("seat_count in", values, "seatCount");
            return (Criteria) this;
        }

        public Criteria andSeatCountNotIn(List<Byte> values) {
            addCriterion("seat_count not in", values, "seatCount");
            return (Criteria) this;
        }

        public Criteria andSeatCountBetween(Byte value1, Byte value2) {
            addCriterion("seat_count between", value1, value2, "seatCount");
            return (Criteria) this;
        }

        public Criteria andSeatCountNotBetween(Byte value1, Byte value2) {
            addCriterion("seat_count not between", value1, value2, "seatCount");
            return (Criteria) this;
        }

        public Criteria andVehicleColorIsNull() {
            addCriterion("vehicle_color is null");
            return (Criteria) this;
        }

        public Criteria andVehicleColorIsNotNull() {
            addCriterion("vehicle_color is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleColorEqualTo(String value) {
            addCriterion("vehicle_color =", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorNotEqualTo(String value) {
            addCriterion("vehicle_color <>", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorGreaterThan(String value) {
            addCriterion("vehicle_color >", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_color >=", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorLessThan(String value) {
            addCriterion("vehicle_color <", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorLessThanOrEqualTo(String value) {
            addCriterion("vehicle_color <=", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorLike(String value) {
            addCriterion("vehicle_color like", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorNotLike(String value) {
            addCriterion("vehicle_color not like", value, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorIn(List<String> values) {
            addCriterion("vehicle_color in", values, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorNotIn(List<String> values) {
            addCriterion("vehicle_color not in", values, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorBetween(String value1, String value2) {
            addCriterion("vehicle_color between", value1, value2, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andVehicleColorNotBetween(String value1, String value2) {
            addCriterion("vehicle_color not between", value1, value2, "vehicleColor");
            return (Criteria) this;
        }

        public Criteria andIsModificationIsNull() {
            addCriterion("is_modification is null");
            return (Criteria) this;
        }

        public Criteria andIsModificationIsNotNull() {
            addCriterion("is_modification is not null");
            return (Criteria) this;
        }

        public Criteria andIsModificationEqualTo(Boolean value) {
            addCriterion("is_modification =", value, "isModification");
            return (Criteria) this;
        }

        public Criteria andIsModificationNotEqualTo(Boolean value) {
            addCriterion("is_modification <>", value, "isModification");
            return (Criteria) this;
        }

        public Criteria andIsModificationGreaterThan(Boolean value) {
            addCriterion("is_modification >", value, "isModification");
            return (Criteria) this;
        }

        public Criteria andIsModificationGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_modification >=", value, "isModification");
            return (Criteria) this;
        }

        public Criteria andIsModificationLessThan(Boolean value) {
            addCriterion("is_modification <", value, "isModification");
            return (Criteria) this;
        }

        public Criteria andIsModificationLessThanOrEqualTo(Boolean value) {
            addCriterion("is_modification <=", value, "isModification");
            return (Criteria) this;
        }

        public Criteria andIsModificationIn(List<Boolean> values) {
            addCriterion("is_modification in", values, "isModification");
            return (Criteria) this;
        }

        public Criteria andIsModificationNotIn(List<Boolean> values) {
            addCriterion("is_modification not in", values, "isModification");
            return (Criteria) this;
        }

        public Criteria andIsModificationBetween(Boolean value1, Boolean value2) {
            addCriterion("is_modification between", value1, value2, "isModification");
            return (Criteria) this;
        }

        public Criteria andIsModificationNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_modification not between", value1, value2, "isModification");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddressIsNull() {
            addCriterion("driving_license_address is null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddressIsNotNull() {
            addCriterion("driving_license_address is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddressEqualTo(String value) {
            addCriterion("driving_license_address =", value, "drivingLicenseAddress");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddressNotEqualTo(String value) {
            addCriterion("driving_license_address <>", value, "drivingLicenseAddress");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddressGreaterThan(String value) {
            addCriterion("driving_license_address >", value, "drivingLicenseAddress");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("driving_license_address >=", value, "drivingLicenseAddress");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddressLessThan(String value) {
            addCriterion("driving_license_address <", value, "drivingLicenseAddress");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddressLessThanOrEqualTo(String value) {
            addCriterion("driving_license_address <=", value, "drivingLicenseAddress");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddressLike(String value) {
            addCriterion("driving_license_address like", value, "drivingLicenseAddress");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddressNotLike(String value) {
            addCriterion("driving_license_address not like", value, "drivingLicenseAddress");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddressIn(List<String> values) {
            addCriterion("driving_license_address in", values, "drivingLicenseAddress");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddressNotIn(List<String> values) {
            addCriterion("driving_license_address not in", values, "drivingLicenseAddress");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddressBetween(String value1, String value2) {
            addCriterion("driving_license_address between", value1, value2, "drivingLicenseAddress");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseAddressNotBetween(String value1, String value2) {
            addCriterion("driving_license_address not between", value1, value2, "drivingLicenseAddress");
            return (Criteria) this;
        }

        public Criteria andDrivingFirstDateIsNull() {
            addCriterion("driving_first_date is null");
            return (Criteria) this;
        }

        public Criteria andDrivingFirstDateIsNotNull() {
            addCriterion("driving_first_date is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingFirstDateEqualTo(Date value) {
            addCriterion("driving_first_date =", value, "drivingFirstDate");
            return (Criteria) this;
        }

        public Criteria andDrivingFirstDateNotEqualTo(Date value) {
            addCriterion("driving_first_date <>", value, "drivingFirstDate");
            return (Criteria) this;
        }

        public Criteria andDrivingFirstDateGreaterThan(Date value) {
            addCriterion("driving_first_date >", value, "drivingFirstDate");
            return (Criteria) this;
        }

        public Criteria andDrivingFirstDateGreaterThanOrEqualTo(Date value) {
            addCriterion("driving_first_date >=", value, "drivingFirstDate");
            return (Criteria) this;
        }

        public Criteria andDrivingFirstDateLessThan(Date value) {
            addCriterion("driving_first_date <", value, "drivingFirstDate");
            return (Criteria) this;
        }

        public Criteria andDrivingFirstDateLessThanOrEqualTo(Date value) {
            addCriterion("driving_first_date <=", value, "drivingFirstDate");
            return (Criteria) this;
        }

        public Criteria andDrivingFirstDateIn(List<Date> values) {
            addCriterion("driving_first_date in", values, "drivingFirstDate");
            return (Criteria) this;
        }

        public Criteria andDrivingFirstDateNotIn(List<Date> values) {
            addCriterion("driving_first_date not in", values, "drivingFirstDate");
            return (Criteria) this;
        }

        public Criteria andDrivingFirstDateBetween(Date value1, Date value2) {
            addCriterion("driving_first_date between", value1, value2, "drivingFirstDate");
            return (Criteria) this;
        }

        public Criteria andDrivingFirstDateNotBetween(Date value1, Date value2) {
            addCriterion("driving_first_date not between", value1, value2, "drivingFirstDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateIsNull() {
            addCriterion("registration_date is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateIsNotNull() {
            addCriterion("registration_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateEqualTo(Date value) {
            addCriterion("registration_date =", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotEqualTo(Date value) {
            addCriterion("registration_date <>", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateGreaterThan(Date value) {
            addCriterion("registration_date >", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("registration_date >=", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateLessThan(Date value) {
            addCriterion("registration_date <", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateLessThanOrEqualTo(Date value) {
            addCriterion("registration_date <=", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateIn(List<Date> values) {
            addCriterion("registration_date in", values, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotIn(List<Date> values) {
            addCriterion("registration_date not in", values, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateBetween(Date value1, Date value2) {
            addCriterion("registration_date between", value1, value2, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotBetween(Date value1, Date value2) {
            addCriterion("registration_date not between", value1, value2, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andAsDateIsNull() {
            addCriterion("as_date is null");
            return (Criteria) this;
        }

        public Criteria andAsDateIsNotNull() {
            addCriterion("as_date is not null");
            return (Criteria) this;
        }

        public Criteria andAsDateEqualTo(Date value) {
            addCriterion("as_date =", value, "asDate");
            return (Criteria) this;
        }

        public Criteria andAsDateNotEqualTo(Date value) {
            addCriterion("as_date <>", value, "asDate");
            return (Criteria) this;
        }

        public Criteria andAsDateGreaterThan(Date value) {
            addCriterion("as_date >", value, "asDate");
            return (Criteria) this;
        }

        public Criteria andAsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("as_date >=", value, "asDate");
            return (Criteria) this;
        }

        public Criteria andAsDateLessThan(Date value) {
            addCriterion("as_date <", value, "asDate");
            return (Criteria) this;
        }

        public Criteria andAsDateLessThanOrEqualTo(Date value) {
            addCriterion("as_date <=", value, "asDate");
            return (Criteria) this;
        }

        public Criteria andAsDateIn(List<Date> values) {
            addCriterion("as_date in", values, "asDate");
            return (Criteria) this;
        }

        public Criteria andAsDateNotIn(List<Date> values) {
            addCriterion("as_date not in", values, "asDate");
            return (Criteria) this;
        }

        public Criteria andAsDateBetween(Date value1, Date value2) {
            addCriterion("as_date between", value1, value2, "asDate");
            return (Criteria) this;
        }

        public Criteria andAsDateNotBetween(Date value1, Date value2) {
            addCriterion("as_date not between", value1, value2, "asDate");
            return (Criteria) this;
        }

        public Criteria andCheckNumIsNull() {
            addCriterion("check_num is null");
            return (Criteria) this;
        }

        public Criteria andCheckNumIsNotNull() {
            addCriterion("check_num is not null");
            return (Criteria) this;
        }

        public Criteria andCheckNumEqualTo(Byte value) {
            addCriterion("check_num =", value, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumNotEqualTo(Byte value) {
            addCriterion("check_num <>", value, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumGreaterThan(Byte value) {
            addCriterion("check_num >", value, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("check_num >=", value, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumLessThan(Byte value) {
            addCriterion("check_num <", value, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumLessThanOrEqualTo(Byte value) {
            addCriterion("check_num <=", value, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumIn(List<Byte> values) {
            addCriterion("check_num in", values, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumNotIn(List<Byte> values) {
            addCriterion("check_num not in", values, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumBetween(Byte value1, Byte value2) {
            addCriterion("check_num between", value1, value2, "checkNum");
            return (Criteria) this;
        }

        public Criteria andCheckNumNotBetween(Byte value1, Byte value2) {
            addCriterion("check_num not between", value1, value2, "checkNum");
            return (Criteria) this;
        }

        public Criteria andReserveEstimateAddressIsNull() {
            addCriterion("reserve_estimate_address is null");
            return (Criteria) this;
        }

        public Criteria andReserveEstimateAddressIsNotNull() {
            addCriterion("reserve_estimate_address is not null");
            return (Criteria) this;
        }

        public Criteria andReserveEstimateAddressEqualTo(String value) {
            addCriterion("reserve_estimate_address =", value, "reserveEstimateAddress");
            return (Criteria) this;
        }

        public Criteria andReserveEstimateAddressNotEqualTo(String value) {
            addCriterion("reserve_estimate_address <>", value, "reserveEstimateAddress");
            return (Criteria) this;
        }

        public Criteria andReserveEstimateAddressGreaterThan(String value) {
            addCriterion("reserve_estimate_address >", value, "reserveEstimateAddress");
            return (Criteria) this;
        }

        public Criteria andReserveEstimateAddressGreaterThanOrEqualTo(String value) {
            addCriterion("reserve_estimate_address >=", value, "reserveEstimateAddress");
            return (Criteria) this;
        }

        public Criteria andReserveEstimateAddressLessThan(String value) {
            addCriterion("reserve_estimate_address <", value, "reserveEstimateAddress");
            return (Criteria) this;
        }

        public Criteria andReserveEstimateAddressLessThanOrEqualTo(String value) {
            addCriterion("reserve_estimate_address <=", value, "reserveEstimateAddress");
            return (Criteria) this;
        }

        public Criteria andReserveEstimateAddressLike(String value) {
            addCriterion("reserve_estimate_address like", value, "reserveEstimateAddress");
            return (Criteria) this;
        }

        public Criteria andReserveEstimateAddressNotLike(String value) {
            addCriterion("reserve_estimate_address not like", value, "reserveEstimateAddress");
            return (Criteria) this;
        }

        public Criteria andReserveEstimateAddressIn(List<String> values) {
            addCriterion("reserve_estimate_address in", values, "reserveEstimateAddress");
            return (Criteria) this;
        }

        public Criteria andReserveEstimateAddressNotIn(List<String> values) {
            addCriterion("reserve_estimate_address not in", values, "reserveEstimateAddress");
            return (Criteria) this;
        }

        public Criteria andReserveEstimateAddressBetween(String value1, String value2) {
            addCriterion("reserve_estimate_address between", value1, value2, "reserveEstimateAddress");
            return (Criteria) this;
        }

        public Criteria andReserveEstimateAddressNotBetween(String value1, String value2) {
            addCriterion("reserve_estimate_address not between", value1, value2, "reserveEstimateAddress");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceIsNull() {
            addCriterion("new_vehicle_price is null");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceIsNotNull() {
            addCriterion("new_vehicle_price is not null");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceEqualTo(BigDecimal value) {
            addCriterion("new_vehicle_price =", value, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceNotEqualTo(BigDecimal value) {
            addCriterion("new_vehicle_price <>", value, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceGreaterThan(BigDecimal value) {
            addCriterion("new_vehicle_price >", value, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("new_vehicle_price >=", value, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceLessThan(BigDecimal value) {
            addCriterion("new_vehicle_price <", value, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("new_vehicle_price <=", value, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceIn(List<BigDecimal> values) {
            addCriterion("new_vehicle_price in", values, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceNotIn(List<BigDecimal> values) {
            addCriterion("new_vehicle_price not in", values, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("new_vehicle_price between", value1, value2, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andNewVehiclePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("new_vehicle_price not between", value1, value2, "newVehiclePrice");
            return (Criteria) this;
        }

        public Criteria andIsLossIsNull() {
            addCriterion("is_loss is null");
            return (Criteria) this;
        }

        public Criteria andIsLossIsNotNull() {
            addCriterion("is_loss is not null");
            return (Criteria) this;
        }

        public Criteria andIsLossEqualTo(Boolean value) {
            addCriterion("is_loss =", value, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossNotEqualTo(Boolean value) {
            addCriterion("is_loss <>", value, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossGreaterThan(Boolean value) {
            addCriterion("is_loss >", value, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_loss >=", value, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossLessThan(Boolean value) {
            addCriterion("is_loss <", value, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossLessThanOrEqualTo(Boolean value) {
            addCriterion("is_loss <=", value, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossIn(List<Boolean> values) {
            addCriterion("is_loss in", values, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossNotIn(List<Boolean> values) {
            addCriterion("is_loss not in", values, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossBetween(Boolean value1, Boolean value2) {
            addCriterion("is_loss between", value1, value2, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsLossNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_loss not between", value1, value2, "isLoss");
            return (Criteria) this;
        }

        public Criteria andIsTotalLossIsNull() {
            addCriterion("is_total_loss is null");
            return (Criteria) this;
        }

        public Criteria andIsTotalLossIsNotNull() {
            addCriterion("is_total_loss is not null");
            return (Criteria) this;
        }

        public Criteria andIsTotalLossEqualTo(String value) {
            addCriterion("is_total_loss =", value, "isTotalLoss");
            return (Criteria) this;
        }

        public Criteria andIsTotalLossNotEqualTo(String value) {
            addCriterion("is_total_loss <>", value, "isTotalLoss");
            return (Criteria) this;
        }

        public Criteria andIsTotalLossGreaterThan(String value) {
            addCriterion("is_total_loss >", value, "isTotalLoss");
            return (Criteria) this;
        }

        public Criteria andIsTotalLossGreaterThanOrEqualTo(String value) {
            addCriterion("is_total_loss >=", value, "isTotalLoss");
            return (Criteria) this;
        }

        public Criteria andIsTotalLossLessThan(String value) {
            addCriterion("is_total_loss <", value, "isTotalLoss");
            return (Criteria) this;
        }

        public Criteria andIsTotalLossLessThanOrEqualTo(String value) {
            addCriterion("is_total_loss <=", value, "isTotalLoss");
            return (Criteria) this;
        }

        public Criteria andIsTotalLossLike(String value) {
            addCriterion("is_total_loss like", value, "isTotalLoss");
            return (Criteria) this;
        }

        public Criteria andIsTotalLossNotLike(String value) {
            addCriterion("is_total_loss not like", value, "isTotalLoss");
            return (Criteria) this;
        }

        public Criteria andIsTotalLossIn(List<String> values) {
            addCriterion("is_total_loss in", values, "isTotalLoss");
            return (Criteria) this;
        }

        public Criteria andIsTotalLossNotIn(List<String> values) {
            addCriterion("is_total_loss not in", values, "isTotalLoss");
            return (Criteria) this;
        }

        public Criteria andIsTotalLossBetween(String value1, String value2) {
            addCriterion("is_total_loss between", value1, value2, "isTotalLoss");
            return (Criteria) this;
        }

        public Criteria andIsTotalLossNotBetween(String value1, String value2) {
            addCriterion("is_total_loss not between", value1, value2, "isTotalLoss");
            return (Criteria) this;
        }

        public Criteria andLossDegreeIsNull() {
            addCriterion("loss_degree is null");
            return (Criteria) this;
        }

        public Criteria andLossDegreeIsNotNull() {
            addCriterion("loss_degree is not null");
            return (Criteria) this;
        }

        public Criteria andLossDegreeEqualTo(String value) {
            addCriterion("loss_degree =", value, "lossDegree");
            return (Criteria) this;
        }

        public Criteria andLossDegreeNotEqualTo(String value) {
            addCriterion("loss_degree <>", value, "lossDegree");
            return (Criteria) this;
        }

        public Criteria andLossDegreeGreaterThan(String value) {
            addCriterion("loss_degree >", value, "lossDegree");
            return (Criteria) this;
        }

        public Criteria andLossDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("loss_degree >=", value, "lossDegree");
            return (Criteria) this;
        }

        public Criteria andLossDegreeLessThan(String value) {
            addCriterion("loss_degree <", value, "lossDegree");
            return (Criteria) this;
        }

        public Criteria andLossDegreeLessThanOrEqualTo(String value) {
            addCriterion("loss_degree <=", value, "lossDegree");
            return (Criteria) this;
        }

        public Criteria andLossDegreeLike(String value) {
            addCriterion("loss_degree like", value, "lossDegree");
            return (Criteria) this;
        }

        public Criteria andLossDegreeNotLike(String value) {
            addCriterion("loss_degree not like", value, "lossDegree");
            return (Criteria) this;
        }

        public Criteria andLossDegreeIn(List<String> values) {
            addCriterion("loss_degree in", values, "lossDegree");
            return (Criteria) this;
        }

        public Criteria andLossDegreeNotIn(List<String> values) {
            addCriterion("loss_degree not in", values, "lossDegree");
            return (Criteria) this;
        }

        public Criteria andLossDegreeBetween(String value1, String value2) {
            addCriterion("loss_degree between", value1, value2, "lossDegree");
            return (Criteria) this;
        }

        public Criteria andLossDegreeNotBetween(String value1, String value2) {
            addCriterion("loss_degree not between", value1, value2, "lossDegree");
            return (Criteria) this;
        }

        public Criteria andLossPartDataIsNull() {
            addCriterion("loss_part_data is null");
            return (Criteria) this;
        }

        public Criteria andLossPartDataIsNotNull() {
            addCriterion("loss_part_data is not null");
            return (Criteria) this;
        }

        public Criteria andLossPartDataEqualTo(String value) {
            addCriterion("loss_part_data =", value, "lossPartData");
            return (Criteria) this;
        }

        public Criteria andLossPartDataNotEqualTo(String value) {
            addCriterion("loss_part_data <>", value, "lossPartData");
            return (Criteria) this;
        }

        public Criteria andLossPartDataGreaterThan(String value) {
            addCriterion("loss_part_data >", value, "lossPartData");
            return (Criteria) this;
        }

        public Criteria andLossPartDataGreaterThanOrEqualTo(String value) {
            addCriterion("loss_part_data >=", value, "lossPartData");
            return (Criteria) this;
        }

        public Criteria andLossPartDataLessThan(String value) {
            addCriterion("loss_part_data <", value, "lossPartData");
            return (Criteria) this;
        }

        public Criteria andLossPartDataLessThanOrEqualTo(String value) {
            addCriterion("loss_part_data <=", value, "lossPartData");
            return (Criteria) this;
        }

        public Criteria andLossPartDataLike(String value) {
            addCriterion("loss_part_data like", value, "lossPartData");
            return (Criteria) this;
        }

        public Criteria andLossPartDataNotLike(String value) {
            addCriterion("loss_part_data not like", value, "lossPartData");
            return (Criteria) this;
        }

        public Criteria andLossPartDataIn(List<String> values) {
            addCriterion("loss_part_data in", values, "lossPartData");
            return (Criteria) this;
        }

        public Criteria andLossPartDataNotIn(List<String> values) {
            addCriterion("loss_part_data not in", values, "lossPartData");
            return (Criteria) this;
        }

        public Criteria andLossPartDataBetween(String value1, String value2) {
            addCriterion("loss_part_data between", value1, value2, "lossPartData");
            return (Criteria) this;
        }

        public Criteria andLossPartDataNotBetween(String value1, String value2) {
            addCriterion("loss_part_data not between", value1, value2, "lossPartData");
            return (Criteria) this;
        }

        public Criteria andIsCarryingDangerousGoodsIsNull() {
            addCriterion("is_carrying_dangerous_goods is null");
            return (Criteria) this;
        }

        public Criteria andIsCarryingDangerousGoodsIsNotNull() {
            addCriterion("is_carrying_dangerous_goods is not null");
            return (Criteria) this;
        }

        public Criteria andIsCarryingDangerousGoodsEqualTo(Boolean value) {
            addCriterion("is_carrying_dangerous_goods =", value, "isCarryingDangerousGoods");
            return (Criteria) this;
        }

        public Criteria andIsCarryingDangerousGoodsNotEqualTo(Boolean value) {
            addCriterion("is_carrying_dangerous_goods <>", value, "isCarryingDangerousGoods");
            return (Criteria) this;
        }

        public Criteria andIsCarryingDangerousGoodsGreaterThan(Boolean value) {
            addCriterion("is_carrying_dangerous_goods >", value, "isCarryingDangerousGoods");
            return (Criteria) this;
        }

        public Criteria andIsCarryingDangerousGoodsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_carrying_dangerous_goods >=", value, "isCarryingDangerousGoods");
            return (Criteria) this;
        }

        public Criteria andIsCarryingDangerousGoodsLessThan(Boolean value) {
            addCriterion("is_carrying_dangerous_goods <", value, "isCarryingDangerousGoods");
            return (Criteria) this;
        }

        public Criteria andIsCarryingDangerousGoodsLessThanOrEqualTo(Boolean value) {
            addCriterion("is_carrying_dangerous_goods <=", value, "isCarryingDangerousGoods");
            return (Criteria) this;
        }

        public Criteria andIsCarryingDangerousGoodsIn(List<Boolean> values) {
            addCriterion("is_carrying_dangerous_goods in", values, "isCarryingDangerousGoods");
            return (Criteria) this;
        }

        public Criteria andIsCarryingDangerousGoodsNotIn(List<Boolean> values) {
            addCriterion("is_carrying_dangerous_goods not in", values, "isCarryingDangerousGoods");
            return (Criteria) this;
        }

        public Criteria andIsCarryingDangerousGoodsBetween(Boolean value1, Boolean value2) {
            addCriterion("is_carrying_dangerous_goods between", value1, value2, "isCarryingDangerousGoods");
            return (Criteria) this;
        }

        public Criteria andIsCarryingDangerousGoodsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_carrying_dangerous_goods not between", value1, value2, "isCarryingDangerousGoods");
            return (Criteria) this;
        }

        public Criteria andHasCarLicenseIsNull() {
            addCriterion("has_car_license is null");
            return (Criteria) this;
        }

        public Criteria andHasCarLicenseIsNotNull() {
            addCriterion("has_car_license is not null");
            return (Criteria) this;
        }

        public Criteria andHasCarLicenseEqualTo(Boolean value) {
            addCriterion("has_car_license =", value, "hasCarLicense");
            return (Criteria) this;
        }

        public Criteria andHasCarLicenseNotEqualTo(Boolean value) {
            addCriterion("has_car_license <>", value, "hasCarLicense");
            return (Criteria) this;
        }

        public Criteria andHasCarLicenseGreaterThan(Boolean value) {
            addCriterion("has_car_license >", value, "hasCarLicense");
            return (Criteria) this;
        }

        public Criteria andHasCarLicenseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_car_license >=", value, "hasCarLicense");
            return (Criteria) this;
        }

        public Criteria andHasCarLicenseLessThan(Boolean value) {
            addCriterion("has_car_license <", value, "hasCarLicense");
            return (Criteria) this;
        }

        public Criteria andHasCarLicenseLessThanOrEqualTo(Boolean value) {
            addCriterion("has_car_license <=", value, "hasCarLicense");
            return (Criteria) this;
        }

        public Criteria andHasCarLicenseIn(List<Boolean> values) {
            addCriterion("has_car_license in", values, "hasCarLicense");
            return (Criteria) this;
        }

        public Criteria andHasCarLicenseNotIn(List<Boolean> values) {
            addCriterion("has_car_license not in", values, "hasCarLicense");
            return (Criteria) this;
        }

        public Criteria andHasCarLicenseBetween(Boolean value1, Boolean value2) {
            addCriterion("has_car_license between", value1, value2, "hasCarLicense");
            return (Criteria) this;
        }

        public Criteria andHasCarLicenseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_car_license not between", value1, value2, "hasCarLicense");
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

        public Criteria andIsDisassembleIsNull() {
            addCriterion("is_disassemble is null");
            return (Criteria) this;
        }

        public Criteria andIsDisassembleIsNotNull() {
            addCriterion("is_disassemble is not null");
            return (Criteria) this;
        }

        public Criteria andIsDisassembleEqualTo(String value) {
            addCriterion("is_disassemble =", value, "isDisassemble");
            return (Criteria) this;
        }

        public Criteria andIsDisassembleNotEqualTo(String value) {
            addCriterion("is_disassemble <>", value, "isDisassemble");
            return (Criteria) this;
        }

        public Criteria andIsDisassembleGreaterThan(String value) {
            addCriterion("is_disassemble >", value, "isDisassemble");
            return (Criteria) this;
        }

        public Criteria andIsDisassembleGreaterThanOrEqualTo(String value) {
            addCriterion("is_disassemble >=", value, "isDisassemble");
            return (Criteria) this;
        }

        public Criteria andIsDisassembleLessThan(String value) {
            addCriterion("is_disassemble <", value, "isDisassemble");
            return (Criteria) this;
        }

        public Criteria andIsDisassembleLessThanOrEqualTo(String value) {
            addCriterion("is_disassemble <=", value, "isDisassemble");
            return (Criteria) this;
        }

        public Criteria andIsDisassembleLike(String value) {
            addCriterion("is_disassemble like", value, "isDisassemble");
            return (Criteria) this;
        }

        public Criteria andIsDisassembleNotLike(String value) {
            addCriterion("is_disassemble not like", value, "isDisassemble");
            return (Criteria) this;
        }

        public Criteria andIsDisassembleIn(List<String> values) {
            addCriterion("is_disassemble in", values, "isDisassemble");
            return (Criteria) this;
        }

        public Criteria andIsDisassembleNotIn(List<String> values) {
            addCriterion("is_disassemble not in", values, "isDisassemble");
            return (Criteria) this;
        }

        public Criteria andIsDisassembleBetween(String value1, String value2) {
            addCriterion("is_disassemble between", value1, value2, "isDisassemble");
            return (Criteria) this;
        }

        public Criteria andIsDisassembleNotBetween(String value1, String value2) {
            addCriterion("is_disassemble not between", value1, value2, "isDisassemble");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesIsNull() {
            addCriterion("using_properties is null");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesIsNotNull() {
            addCriterion("using_properties is not null");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesEqualTo(String value) {
            addCriterion("using_properties =", value, "usingProperties");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesNotEqualTo(String value) {
            addCriterion("using_properties <>", value, "usingProperties");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesGreaterThan(String value) {
            addCriterion("using_properties >", value, "usingProperties");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesGreaterThanOrEqualTo(String value) {
            addCriterion("using_properties >=", value, "usingProperties");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesLessThan(String value) {
            addCriterion("using_properties <", value, "usingProperties");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesLessThanOrEqualTo(String value) {
            addCriterion("using_properties <=", value, "usingProperties");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesLike(String value) {
            addCriterion("using_properties like", value, "usingProperties");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesNotLike(String value) {
            addCriterion("using_properties not like", value, "usingProperties");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesIn(List<String> values) {
            addCriterion("using_properties in", values, "usingProperties");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesNotIn(List<String> values) {
            addCriterion("using_properties not in", values, "usingProperties");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesBetween(String value1, String value2) {
            addCriterion("using_properties between", value1, value2, "usingProperties");
            return (Criteria) this;
        }

        public Criteria andUsingPropertiesNotBetween(String value1, String value2) {
            addCriterion("using_properties not between", value1, value2, "usingProperties");
            return (Criteria) this;
        }

        public Criteria andRescueCompanyIsNull() {
            addCriterion("rescue_company is null");
            return (Criteria) this;
        }

        public Criteria andRescueCompanyIsNotNull() {
            addCriterion("rescue_company is not null");
            return (Criteria) this;
        }

        public Criteria andRescueCompanyEqualTo(String value) {
            addCriterion("rescue_company =", value, "rescueCompany");
            return (Criteria) this;
        }

        public Criteria andRescueCompanyNotEqualTo(String value) {
            addCriterion("rescue_company <>", value, "rescueCompany");
            return (Criteria) this;
        }

        public Criteria andRescueCompanyGreaterThan(String value) {
            addCriterion("rescue_company >", value, "rescueCompany");
            return (Criteria) this;
        }

        public Criteria andRescueCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("rescue_company >=", value, "rescueCompany");
            return (Criteria) this;
        }

        public Criteria andRescueCompanyLessThan(String value) {
            addCriterion("rescue_company <", value, "rescueCompany");
            return (Criteria) this;
        }

        public Criteria andRescueCompanyLessThanOrEqualTo(String value) {
            addCriterion("rescue_company <=", value, "rescueCompany");
            return (Criteria) this;
        }

        public Criteria andRescueCompanyLike(String value) {
            addCriterion("rescue_company like", value, "rescueCompany");
            return (Criteria) this;
        }

        public Criteria andRescueCompanyNotLike(String value) {
            addCriterion("rescue_company not like", value, "rescueCompany");
            return (Criteria) this;
        }

        public Criteria andRescueCompanyIn(List<String> values) {
            addCriterion("rescue_company in", values, "rescueCompany");
            return (Criteria) this;
        }

        public Criteria andRescueCompanyNotIn(List<String> values) {
            addCriterion("rescue_company not in", values, "rescueCompany");
            return (Criteria) this;
        }

        public Criteria andRescueCompanyBetween(String value1, String value2) {
            addCriterion("rescue_company between", value1, value2, "rescueCompany");
            return (Criteria) this;
        }

        public Criteria andRescueCompanyNotBetween(String value1, String value2) {
            addCriterion("rescue_company not between", value1, value2, "rescueCompany");
            return (Criteria) this;
        }

        public Criteria andRescueWayIsNull() {
            addCriterion("rescue_way is null");
            return (Criteria) this;
        }

        public Criteria andRescueWayIsNotNull() {
            addCriterion("rescue_way is not null");
            return (Criteria) this;
        }

        public Criteria andRescueWayEqualTo(String value) {
            addCriterion("rescue_way =", value, "rescueWay");
            return (Criteria) this;
        }

        public Criteria andRescueWayNotEqualTo(String value) {
            addCriterion("rescue_way <>", value, "rescueWay");
            return (Criteria) this;
        }

        public Criteria andRescueWayGreaterThan(String value) {
            addCriterion("rescue_way >", value, "rescueWay");
            return (Criteria) this;
        }

        public Criteria andRescueWayGreaterThanOrEqualTo(String value) {
            addCriterion("rescue_way >=", value, "rescueWay");
            return (Criteria) this;
        }

        public Criteria andRescueWayLessThan(String value) {
            addCriterion("rescue_way <", value, "rescueWay");
            return (Criteria) this;
        }

        public Criteria andRescueWayLessThanOrEqualTo(String value) {
            addCriterion("rescue_way <=", value, "rescueWay");
            return (Criteria) this;
        }

        public Criteria andRescueWayLike(String value) {
            addCriterion("rescue_way like", value, "rescueWay");
            return (Criteria) this;
        }

        public Criteria andRescueWayNotLike(String value) {
            addCriterion("rescue_way not like", value, "rescueWay");
            return (Criteria) this;
        }

        public Criteria andRescueWayIn(List<String> values) {
            addCriterion("rescue_way in", values, "rescueWay");
            return (Criteria) this;
        }

        public Criteria andRescueWayNotIn(List<String> values) {
            addCriterion("rescue_way not in", values, "rescueWay");
            return (Criteria) this;
        }

        public Criteria andRescueWayBetween(String value1, String value2) {
            addCriterion("rescue_way between", value1, value2, "rescueWay");
            return (Criteria) this;
        }

        public Criteria andRescueWayNotBetween(String value1, String value2) {
            addCriterion("rescue_way not between", value1, value2, "rescueWay");
            return (Criteria) this;
        }

        public Criteria andRescueTrafficIsNull() {
            addCriterion("rescue_traffic is null");
            return (Criteria) this;
        }

        public Criteria andRescueTrafficIsNotNull() {
            addCriterion("rescue_traffic is not null");
            return (Criteria) this;
        }

        public Criteria andRescueTrafficEqualTo(String value) {
            addCriterion("rescue_traffic =", value, "rescueTraffic");
            return (Criteria) this;
        }

        public Criteria andRescueTrafficNotEqualTo(String value) {
            addCriterion("rescue_traffic <>", value, "rescueTraffic");
            return (Criteria) this;
        }

        public Criteria andRescueTrafficGreaterThan(String value) {
            addCriterion("rescue_traffic >", value, "rescueTraffic");
            return (Criteria) this;
        }

        public Criteria andRescueTrafficGreaterThanOrEqualTo(String value) {
            addCriterion("rescue_traffic >=", value, "rescueTraffic");
            return (Criteria) this;
        }

        public Criteria andRescueTrafficLessThan(String value) {
            addCriterion("rescue_traffic <", value, "rescueTraffic");
            return (Criteria) this;
        }

        public Criteria andRescueTrafficLessThanOrEqualTo(String value) {
            addCriterion("rescue_traffic <=", value, "rescueTraffic");
            return (Criteria) this;
        }

        public Criteria andRescueTrafficLike(String value) {
            addCriterion("rescue_traffic like", value, "rescueTraffic");
            return (Criteria) this;
        }

        public Criteria andRescueTrafficNotLike(String value) {
            addCriterion("rescue_traffic not like", value, "rescueTraffic");
            return (Criteria) this;
        }

        public Criteria andRescueTrafficIn(List<String> values) {
            addCriterion("rescue_traffic in", values, "rescueTraffic");
            return (Criteria) this;
        }

        public Criteria andRescueTrafficNotIn(List<String> values) {
            addCriterion("rescue_traffic not in", values, "rescueTraffic");
            return (Criteria) this;
        }

        public Criteria andRescueTrafficBetween(String value1, String value2) {
            addCriterion("rescue_traffic between", value1, value2, "rescueTraffic");
            return (Criteria) this;
        }

        public Criteria andRescueTrafficNotBetween(String value1, String value2) {
            addCriterion("rescue_traffic not between", value1, value2, "rescueTraffic");
            return (Criteria) this;
        }

        public Criteria andRescueDistanceIsNull() {
            addCriterion("rescue_distance is null");
            return (Criteria) this;
        }

        public Criteria andRescueDistanceIsNotNull() {
            addCriterion("rescue_distance is not null");
            return (Criteria) this;
        }

        public Criteria andRescueDistanceEqualTo(BigDecimal value) {
            addCriterion("rescue_distance =", value, "rescueDistance");
            return (Criteria) this;
        }

        public Criteria andRescueDistanceNotEqualTo(BigDecimal value) {
            addCriterion("rescue_distance <>", value, "rescueDistance");
            return (Criteria) this;
        }

        public Criteria andRescueDistanceGreaterThan(BigDecimal value) {
            addCriterion("rescue_distance >", value, "rescueDistance");
            return (Criteria) this;
        }

        public Criteria andRescueDistanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rescue_distance >=", value, "rescueDistance");
            return (Criteria) this;
        }

        public Criteria andRescueDistanceLessThan(BigDecimal value) {
            addCriterion("rescue_distance <", value, "rescueDistance");
            return (Criteria) this;
        }

        public Criteria andRescueDistanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rescue_distance <=", value, "rescueDistance");
            return (Criteria) this;
        }

        public Criteria andRescueDistanceIn(List<BigDecimal> values) {
            addCriterion("rescue_distance in", values, "rescueDistance");
            return (Criteria) this;
        }

        public Criteria andRescueDistanceNotIn(List<BigDecimal> values) {
            addCriterion("rescue_distance not in", values, "rescueDistance");
            return (Criteria) this;
        }

        public Criteria andRescueDistanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rescue_distance between", value1, value2, "rescueDistance");
            return (Criteria) this;
        }

        public Criteria andRescueDistanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rescue_distance not between", value1, value2, "rescueDistance");
            return (Criteria) this;
        }

        public Criteria andSpecificFactorIsNull() {
            addCriterion("specific_factor is null");
            return (Criteria) this;
        }

        public Criteria andSpecificFactorIsNotNull() {
            addCriterion("specific_factor is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificFactorEqualTo(String value) {
            addCriterion("specific_factor =", value, "specificFactor");
            return (Criteria) this;
        }

        public Criteria andSpecificFactorNotEqualTo(String value) {
            addCriterion("specific_factor <>", value, "specificFactor");
            return (Criteria) this;
        }

        public Criteria andSpecificFactorGreaterThan(String value) {
            addCriterion("specific_factor >", value, "specificFactor");
            return (Criteria) this;
        }

        public Criteria andSpecificFactorGreaterThanOrEqualTo(String value) {
            addCriterion("specific_factor >=", value, "specificFactor");
            return (Criteria) this;
        }

        public Criteria andSpecificFactorLessThan(String value) {
            addCriterion("specific_factor <", value, "specificFactor");
            return (Criteria) this;
        }

        public Criteria andSpecificFactorLessThanOrEqualTo(String value) {
            addCriterion("specific_factor <=", value, "specificFactor");
            return (Criteria) this;
        }

        public Criteria andSpecificFactorLike(String value) {
            addCriterion("specific_factor like", value, "specificFactor");
            return (Criteria) this;
        }

        public Criteria andSpecificFactorNotLike(String value) {
            addCriterion("specific_factor not like", value, "specificFactor");
            return (Criteria) this;
        }

        public Criteria andSpecificFactorIn(List<String> values) {
            addCriterion("specific_factor in", values, "specificFactor");
            return (Criteria) this;
        }

        public Criteria andSpecificFactorNotIn(List<String> values) {
            addCriterion("specific_factor not in", values, "specificFactor");
            return (Criteria) this;
        }

        public Criteria andSpecificFactorBetween(String value1, String value2) {
            addCriterion("specific_factor between", value1, value2, "specificFactor");
            return (Criteria) this;
        }

        public Criteria andSpecificFactorNotBetween(String value1, String value2) {
            addCriterion("specific_factor not between", value1, value2, "specificFactor");
            return (Criteria) this;
        }

        public Criteria andRescueAmountIsNull() {
            addCriterion("rescue_amount is null");
            return (Criteria) this;
        }

        public Criteria andRescueAmountIsNotNull() {
            addCriterion("rescue_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRescueAmountEqualTo(BigDecimal value) {
            addCriterion("rescue_amount =", value, "rescueAmount");
            return (Criteria) this;
        }

        public Criteria andRescueAmountNotEqualTo(BigDecimal value) {
            addCriterion("rescue_amount <>", value, "rescueAmount");
            return (Criteria) this;
        }

        public Criteria andRescueAmountGreaterThan(BigDecimal value) {
            addCriterion("rescue_amount >", value, "rescueAmount");
            return (Criteria) this;
        }

        public Criteria andRescueAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rescue_amount >=", value, "rescueAmount");
            return (Criteria) this;
        }

        public Criteria andRescueAmountLessThan(BigDecimal value) {
            addCriterion("rescue_amount <", value, "rescueAmount");
            return (Criteria) this;
        }

        public Criteria andRescueAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rescue_amount <=", value, "rescueAmount");
            return (Criteria) this;
        }

        public Criteria andRescueAmountIn(List<BigDecimal> values) {
            addCriterion("rescue_amount in", values, "rescueAmount");
            return (Criteria) this;
        }

        public Criteria andRescueAmountNotIn(List<BigDecimal> values) {
            addCriterion("rescue_amount not in", values, "rescueAmount");
            return (Criteria) this;
        }

        public Criteria andRescueAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rescue_amount between", value1, value2, "rescueAmount");
            return (Criteria) this;
        }

        public Criteria andRescueAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rescue_amount not between", value1, value2, "rescueAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedLossAmountIsNull() {
            addCriterion("estimated_loss_amount is null");
            return (Criteria) this;
        }

        public Criteria andEstimatedLossAmountIsNotNull() {
            addCriterion("estimated_loss_amount is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatedLossAmountEqualTo(BigDecimal value) {
            addCriterion("estimated_loss_amount =", value, "estimatedLossAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedLossAmountNotEqualTo(BigDecimal value) {
            addCriterion("estimated_loss_amount <>", value, "estimatedLossAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedLossAmountGreaterThan(BigDecimal value) {
            addCriterion("estimated_loss_amount >", value, "estimatedLossAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedLossAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("estimated_loss_amount >=", value, "estimatedLossAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedLossAmountLessThan(BigDecimal value) {
            addCriterion("estimated_loss_amount <", value, "estimatedLossAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedLossAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("estimated_loss_amount <=", value, "estimatedLossAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedLossAmountIn(List<BigDecimal> values) {
            addCriterion("estimated_loss_amount in", values, "estimatedLossAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedLossAmountNotIn(List<BigDecimal> values) {
            addCriterion("estimated_loss_amount not in", values, "estimatedLossAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedLossAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("estimated_loss_amount between", value1, value2, "estimatedLossAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedLossAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("estimated_loss_amount not between", value1, value2, "estimatedLossAmount");
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