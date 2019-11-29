package com.injured.server.api.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InjuredMedReviewOpinionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InjuredMedReviewOpinionExample() {
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

        public Criteria andReviewerNameIsNull() {
            addCriterion("reviewer_name is null");
            return (Criteria) this;
        }

        public Criteria andReviewerNameIsNotNull() {
            addCriterion("reviewer_name is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerNameEqualTo(String value) {
            addCriterion("reviewer_name =", value, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameNotEqualTo(String value) {
            addCriterion("reviewer_name <>", value, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameGreaterThan(String value) {
            addCriterion("reviewer_name >", value, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameGreaterThanOrEqualTo(String value) {
            addCriterion("reviewer_name >=", value, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameLessThan(String value) {
            addCriterion("reviewer_name <", value, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameLessThanOrEqualTo(String value) {
            addCriterion("reviewer_name <=", value, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameLike(String value) {
            addCriterion("reviewer_name like", value, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameNotLike(String value) {
            addCriterion("reviewer_name not like", value, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameIn(List<String> values) {
            addCriterion("reviewer_name in", values, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameNotIn(List<String> values) {
            addCriterion("reviewer_name not in", values, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameBetween(String value1, String value2) {
            addCriterion("reviewer_name between", value1, value2, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNameNotBetween(String value1, String value2) {
            addCriterion("reviewer_name not between", value1, value2, "reviewerName");
            return (Criteria) this;
        }

        public Criteria andReviewerNoIsNull() {
            addCriterion("reviewer_no is null");
            return (Criteria) this;
        }

        public Criteria andReviewerNoIsNotNull() {
            addCriterion("reviewer_no is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerNoEqualTo(String value) {
            addCriterion("reviewer_no =", value, "reviewerNo");
            return (Criteria) this;
        }

        public Criteria andReviewerNoNotEqualTo(String value) {
            addCriterion("reviewer_no <>", value, "reviewerNo");
            return (Criteria) this;
        }

        public Criteria andReviewerNoGreaterThan(String value) {
            addCriterion("reviewer_no >", value, "reviewerNo");
            return (Criteria) this;
        }

        public Criteria andReviewerNoGreaterThanOrEqualTo(String value) {
            addCriterion("reviewer_no >=", value, "reviewerNo");
            return (Criteria) this;
        }

        public Criteria andReviewerNoLessThan(String value) {
            addCriterion("reviewer_no <", value, "reviewerNo");
            return (Criteria) this;
        }

        public Criteria andReviewerNoLessThanOrEqualTo(String value) {
            addCriterion("reviewer_no <=", value, "reviewerNo");
            return (Criteria) this;
        }

        public Criteria andReviewerNoLike(String value) {
            addCriterion("reviewer_no like", value, "reviewerNo");
            return (Criteria) this;
        }

        public Criteria andReviewerNoNotLike(String value) {
            addCriterion("reviewer_no not like", value, "reviewerNo");
            return (Criteria) this;
        }

        public Criteria andReviewerNoIn(List<String> values) {
            addCriterion("reviewer_no in", values, "reviewerNo");
            return (Criteria) this;
        }

        public Criteria andReviewerNoNotIn(List<String> values) {
            addCriterion("reviewer_no not in", values, "reviewerNo");
            return (Criteria) this;
        }

        public Criteria andReviewerNoBetween(String value1, String value2) {
            addCriterion("reviewer_no between", value1, value2, "reviewerNo");
            return (Criteria) this;
        }

        public Criteria andReviewerNoNotBetween(String value1, String value2) {
            addCriterion("reviewer_no not between", value1, value2, "reviewerNo");
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

        public Criteria andReviewerSubmitTimeIsNull() {
            addCriterion("reviewer_submit_time is null");
            return (Criteria) this;
        }

        public Criteria andReviewerSubmitTimeIsNotNull() {
            addCriterion("reviewer_submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerSubmitTimeEqualTo(Date value) {
            addCriterion("reviewer_submit_time =", value, "reviewerSubmitTime");
            return (Criteria) this;
        }

        public Criteria andReviewerSubmitTimeNotEqualTo(Date value) {
            addCriterion("reviewer_submit_time <>", value, "reviewerSubmitTime");
            return (Criteria) this;
        }

        public Criteria andReviewerSubmitTimeGreaterThan(Date value) {
            addCriterion("reviewer_submit_time >", value, "reviewerSubmitTime");
            return (Criteria) this;
        }

        public Criteria andReviewerSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reviewer_submit_time >=", value, "reviewerSubmitTime");
            return (Criteria) this;
        }

        public Criteria andReviewerSubmitTimeLessThan(Date value) {
            addCriterion("reviewer_submit_time <", value, "reviewerSubmitTime");
            return (Criteria) this;
        }

        public Criteria andReviewerSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("reviewer_submit_time <=", value, "reviewerSubmitTime");
            return (Criteria) this;
        }

        public Criteria andReviewerSubmitTimeIn(List<Date> values) {
            addCriterion("reviewer_submit_time in", values, "reviewerSubmitTime");
            return (Criteria) this;
        }

        public Criteria andReviewerSubmitTimeNotIn(List<Date> values) {
            addCriterion("reviewer_submit_time not in", values, "reviewerSubmitTime");
            return (Criteria) this;
        }

        public Criteria andReviewerSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("reviewer_submit_time between", value1, value2, "reviewerSubmitTime");
            return (Criteria) this;
        }

        public Criteria andReviewerSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("reviewer_submit_time not between", value1, value2, "reviewerSubmitTime");
            return (Criteria) this;
        }

        public Criteria andInjuryRecommendedTypeIsNull() {
            addCriterion("injury_recommended_type is null");
            return (Criteria) this;
        }

        public Criteria andInjuryRecommendedTypeIsNotNull() {
            addCriterion("injury_recommended_type is not null");
            return (Criteria) this;
        }

        public Criteria andInjuryRecommendedTypeEqualTo(Byte value) {
            addCriterion("injury_recommended_type =", value, "injuryRecommendedType");
            return (Criteria) this;
        }

        public Criteria andInjuryRecommendedTypeNotEqualTo(Byte value) {
            addCriterion("injury_recommended_type <>", value, "injuryRecommendedType");
            return (Criteria) this;
        }

        public Criteria andInjuryRecommendedTypeGreaterThan(Byte value) {
            addCriterion("injury_recommended_type >", value, "injuryRecommendedType");
            return (Criteria) this;
        }

        public Criteria andInjuryRecommendedTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("injury_recommended_type >=", value, "injuryRecommendedType");
            return (Criteria) this;
        }

        public Criteria andInjuryRecommendedTypeLessThan(Byte value) {
            addCriterion("injury_recommended_type <", value, "injuryRecommendedType");
            return (Criteria) this;
        }

        public Criteria andInjuryRecommendedTypeLessThanOrEqualTo(Byte value) {
            addCriterion("injury_recommended_type <=", value, "injuryRecommendedType");
            return (Criteria) this;
        }

        public Criteria andInjuryRecommendedTypeIn(List<Byte> values) {
            addCriterion("injury_recommended_type in", values, "injuryRecommendedType");
            return (Criteria) this;
        }

        public Criteria andInjuryRecommendedTypeNotIn(List<Byte> values) {
            addCriterion("injury_recommended_type not in", values, "injuryRecommendedType");
            return (Criteria) this;
        }

        public Criteria andInjuryRecommendedTypeBetween(Byte value1, Byte value2) {
            addCriterion("injury_recommended_type between", value1, value2, "injuryRecommendedType");
            return (Criteria) this;
        }

        public Criteria andInjuryRecommendedTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("injury_recommended_type not between", value1, value2, "injuryRecommendedType");
            return (Criteria) this;
        }

        public Criteria andIsQualificatSurveyIsNull() {
            addCriterion("is_qualificat_survey is null");
            return (Criteria) this;
        }

        public Criteria andIsQualificatSurveyIsNotNull() {
            addCriterion("is_qualificat_survey is not null");
            return (Criteria) this;
        }

        public Criteria andIsQualificatSurveyEqualTo(Byte value) {
            addCriterion("is_qualificat_survey =", value, "isQualificatSurvey");
            return (Criteria) this;
        }

        public Criteria andIsQualificatSurveyNotEqualTo(Byte value) {
            addCriterion("is_qualificat_survey <>", value, "isQualificatSurvey");
            return (Criteria) this;
        }

        public Criteria andIsQualificatSurveyGreaterThan(Byte value) {
            addCriterion("is_qualificat_survey >", value, "isQualificatSurvey");
            return (Criteria) this;
        }

        public Criteria andIsQualificatSurveyGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_qualificat_survey >=", value, "isQualificatSurvey");
            return (Criteria) this;
        }

        public Criteria andIsQualificatSurveyLessThan(Byte value) {
            addCriterion("is_qualificat_survey <", value, "isQualificatSurvey");
            return (Criteria) this;
        }

        public Criteria andIsQualificatSurveyLessThanOrEqualTo(Byte value) {
            addCriterion("is_qualificat_survey <=", value, "isQualificatSurvey");
            return (Criteria) this;
        }

        public Criteria andIsQualificatSurveyIn(List<Byte> values) {
            addCriterion("is_qualificat_survey in", values, "isQualificatSurvey");
            return (Criteria) this;
        }

        public Criteria andIsQualificatSurveyNotIn(List<Byte> values) {
            addCriterion("is_qualificat_survey not in", values, "isQualificatSurvey");
            return (Criteria) this;
        }

        public Criteria andIsQualificatSurveyBetween(Byte value1, Byte value2) {
            addCriterion("is_qualificat_survey between", value1, value2, "isQualificatSurvey");
            return (Criteria) this;
        }

        public Criteria andIsQualificatSurveyNotBetween(Byte value1, Byte value2) {
            addCriterion("is_qualificat_survey not between", value1, value2, "isQualificatSurvey");
            return (Criteria) this;
        }

        public Criteria andIsFeildInvestigationIsNull() {
            addCriterion("is_feild_investigation is null");
            return (Criteria) this;
        }

        public Criteria andIsFeildInvestigationIsNotNull() {
            addCriterion("is_feild_investigation is not null");
            return (Criteria) this;
        }

        public Criteria andIsFeildInvestigationEqualTo(Byte value) {
            addCriterion("is_feild_investigation =", value, "isFeildInvestigation");
            return (Criteria) this;
        }

        public Criteria andIsFeildInvestigationNotEqualTo(Byte value) {
            addCriterion("is_feild_investigation <>", value, "isFeildInvestigation");
            return (Criteria) this;
        }

        public Criteria andIsFeildInvestigationGreaterThan(Byte value) {
            addCriterion("is_feild_investigation >", value, "isFeildInvestigation");
            return (Criteria) this;
        }

        public Criteria andIsFeildInvestigationGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_feild_investigation >=", value, "isFeildInvestigation");
            return (Criteria) this;
        }

        public Criteria andIsFeildInvestigationLessThan(Byte value) {
            addCriterion("is_feild_investigation <", value, "isFeildInvestigation");
            return (Criteria) this;
        }

        public Criteria andIsFeildInvestigationLessThanOrEqualTo(Byte value) {
            addCriterion("is_feild_investigation <=", value, "isFeildInvestigation");
            return (Criteria) this;
        }

        public Criteria andIsFeildInvestigationIn(List<Byte> values) {
            addCriterion("is_feild_investigation in", values, "isFeildInvestigation");
            return (Criteria) this;
        }

        public Criteria andIsFeildInvestigationNotIn(List<Byte> values) {
            addCriterion("is_feild_investigation not in", values, "isFeildInvestigation");
            return (Criteria) this;
        }

        public Criteria andIsFeildInvestigationBetween(Byte value1, Byte value2) {
            addCriterion("is_feild_investigation between", value1, value2, "isFeildInvestigation");
            return (Criteria) this;
        }

        public Criteria andIsFeildInvestigationNotBetween(Byte value1, Byte value2) {
            addCriterion("is_feild_investigation not between", value1, value2, "isFeildInvestigation");
            return (Criteria) this;
        }

        public Criteria andFieldInvestigationTypeIsNull() {
            addCriterion("field_investigation_type is null");
            return (Criteria) this;
        }

        public Criteria andFieldInvestigationTypeIsNotNull() {
            addCriterion("field_investigation_type is not null");
            return (Criteria) this;
        }

        public Criteria andFieldInvestigationTypeEqualTo(String value) {
            addCriterion("field_investigation_type =", value, "fieldInvestigationType");
            return (Criteria) this;
        }

        public Criteria andFieldInvestigationTypeNotEqualTo(String value) {
            addCriterion("field_investigation_type <>", value, "fieldInvestigationType");
            return (Criteria) this;
        }

        public Criteria andFieldInvestigationTypeGreaterThan(String value) {
            addCriterion("field_investigation_type >", value, "fieldInvestigationType");
            return (Criteria) this;
        }

        public Criteria andFieldInvestigationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("field_investigation_type >=", value, "fieldInvestigationType");
            return (Criteria) this;
        }

        public Criteria andFieldInvestigationTypeLessThan(String value) {
            addCriterion("field_investigation_type <", value, "fieldInvestigationType");
            return (Criteria) this;
        }

        public Criteria andFieldInvestigationTypeLessThanOrEqualTo(String value) {
            addCriterion("field_investigation_type <=", value, "fieldInvestigationType");
            return (Criteria) this;
        }

        public Criteria andFieldInvestigationTypeLike(String value) {
            addCriterion("field_investigation_type like", value, "fieldInvestigationType");
            return (Criteria) this;
        }

        public Criteria andFieldInvestigationTypeNotLike(String value) {
            addCriterion("field_investigation_type not like", value, "fieldInvestigationType");
            return (Criteria) this;
        }

        public Criteria andFieldInvestigationTypeIn(List<String> values) {
            addCriterion("field_investigation_type in", values, "fieldInvestigationType");
            return (Criteria) this;
        }

        public Criteria andFieldInvestigationTypeNotIn(List<String> values) {
            addCriterion("field_investigation_type not in", values, "fieldInvestigationType");
            return (Criteria) this;
        }

        public Criteria andFieldInvestigationTypeBetween(String value1, String value2) {
            addCriterion("field_investigation_type between", value1, value2, "fieldInvestigationType");
            return (Criteria) this;
        }

        public Criteria andFieldInvestigationTypeNotBetween(String value1, String value2) {
            addCriterion("field_investigation_type not between", value1, value2, "fieldInvestigationType");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNull() {
            addCriterion("audit_opinion is null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNotNull() {
            addCriterion("audit_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionEqualTo(String value) {
            addCriterion("audit_opinion =", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotEqualTo(String value) {
            addCriterion("audit_opinion <>", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThan(String value) {
            addCriterion("audit_opinion >", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("audit_opinion >=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThan(String value) {
            addCriterion("audit_opinion <", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThanOrEqualTo(String value) {
            addCriterion("audit_opinion <=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLike(String value) {
            addCriterion("audit_opinion like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotLike(String value) {
            addCriterion("audit_opinion not like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIn(List<String> values) {
            addCriterion("audit_opinion in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotIn(List<String> values) {
            addCriterion("audit_opinion not in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionBetween(String value1, String value2) {
            addCriterion("audit_opinion between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotBetween(String value1, String value2) {
            addCriterion("audit_opinion not between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditInstrucIsNull() {
            addCriterion("audit_instruc is null");
            return (Criteria) this;
        }

        public Criteria andAuditInstrucIsNotNull() {
            addCriterion("audit_instruc is not null");
            return (Criteria) this;
        }

        public Criteria andAuditInstrucEqualTo(String value) {
            addCriterion("audit_instruc =", value, "auditInstruc");
            return (Criteria) this;
        }

        public Criteria andAuditInstrucNotEqualTo(String value) {
            addCriterion("audit_instruc <>", value, "auditInstruc");
            return (Criteria) this;
        }

        public Criteria andAuditInstrucGreaterThan(String value) {
            addCriterion("audit_instruc >", value, "auditInstruc");
            return (Criteria) this;
        }

        public Criteria andAuditInstrucGreaterThanOrEqualTo(String value) {
            addCriterion("audit_instruc >=", value, "auditInstruc");
            return (Criteria) this;
        }

        public Criteria andAuditInstrucLessThan(String value) {
            addCriterion("audit_instruc <", value, "auditInstruc");
            return (Criteria) this;
        }

        public Criteria andAuditInstrucLessThanOrEqualTo(String value) {
            addCriterion("audit_instruc <=", value, "auditInstruc");
            return (Criteria) this;
        }

        public Criteria andAuditInstrucLike(String value) {
            addCriterion("audit_instruc like", value, "auditInstruc");
            return (Criteria) this;
        }

        public Criteria andAuditInstrucNotLike(String value) {
            addCriterion("audit_instruc not like", value, "auditInstruc");
            return (Criteria) this;
        }

        public Criteria andAuditInstrucIn(List<String> values) {
            addCriterion("audit_instruc in", values, "auditInstruc");
            return (Criteria) this;
        }

        public Criteria andAuditInstrucNotIn(List<String> values) {
            addCriterion("audit_instruc not in", values, "auditInstruc");
            return (Criteria) this;
        }

        public Criteria andAuditInstrucBetween(String value1, String value2) {
            addCriterion("audit_instruc between", value1, value2, "auditInstruc");
            return (Criteria) this;
        }

        public Criteria andAuditInstrucNotBetween(String value1, String value2) {
            addCriterion("audit_instruc not between", value1, value2, "auditInstruc");
            return (Criteria) this;
        }

        public Criteria andDefaultSystemIsNull() {
            addCriterion("default_system is null");
            return (Criteria) this;
        }

        public Criteria andDefaultSystemIsNotNull() {
            addCriterion("default_system is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultSystemEqualTo(String value) {
            addCriterion("default_system =", value, "defaultSystem");
            return (Criteria) this;
        }

        public Criteria andDefaultSystemNotEqualTo(String value) {
            addCriterion("default_system <>", value, "defaultSystem");
            return (Criteria) this;
        }

        public Criteria andDefaultSystemGreaterThan(String value) {
            addCriterion("default_system >", value, "defaultSystem");
            return (Criteria) this;
        }

        public Criteria andDefaultSystemGreaterThanOrEqualTo(String value) {
            addCriterion("default_system >=", value, "defaultSystem");
            return (Criteria) this;
        }

        public Criteria andDefaultSystemLessThan(String value) {
            addCriterion("default_system <", value, "defaultSystem");
            return (Criteria) this;
        }

        public Criteria andDefaultSystemLessThanOrEqualTo(String value) {
            addCriterion("default_system <=", value, "defaultSystem");
            return (Criteria) this;
        }

        public Criteria andDefaultSystemLike(String value) {
            addCriterion("default_system like", value, "defaultSystem");
            return (Criteria) this;
        }

        public Criteria andDefaultSystemNotLike(String value) {
            addCriterion("default_system not like", value, "defaultSystem");
            return (Criteria) this;
        }

        public Criteria andDefaultSystemIn(List<String> values) {
            addCriterion("default_system in", values, "defaultSystem");
            return (Criteria) this;
        }

        public Criteria andDefaultSystemNotIn(List<String> values) {
            addCriterion("default_system not in", values, "defaultSystem");
            return (Criteria) this;
        }

        public Criteria andDefaultSystemBetween(String value1, String value2) {
            addCriterion("default_system between", value1, value2, "defaultSystem");
            return (Criteria) this;
        }

        public Criteria andDefaultSystemNotBetween(String value1, String value2) {
            addCriterion("default_system not between", value1, value2, "defaultSystem");
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

        public Criteria andNextTrackTypeIsNull() {
            addCriterion("next_track_type is null");
            return (Criteria) this;
        }

        public Criteria andNextTrackTypeIsNotNull() {
            addCriterion("next_track_type is not null");
            return (Criteria) this;
        }

        public Criteria andNextTrackTypeEqualTo(Byte value) {
            addCriterion("next_track_type =", value, "nextTrackType");
            return (Criteria) this;
        }

        public Criteria andNextTrackTypeNotEqualTo(Byte value) {
            addCriterion("next_track_type <>", value, "nextTrackType");
            return (Criteria) this;
        }

        public Criteria andNextTrackTypeGreaterThan(Byte value) {
            addCriterion("next_track_type >", value, "nextTrackType");
            return (Criteria) this;
        }

        public Criteria andNextTrackTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("next_track_type >=", value, "nextTrackType");
            return (Criteria) this;
        }

        public Criteria andNextTrackTypeLessThan(Byte value) {
            addCriterion("next_track_type <", value, "nextTrackType");
            return (Criteria) this;
        }

        public Criteria andNextTrackTypeLessThanOrEqualTo(Byte value) {
            addCriterion("next_track_type <=", value, "nextTrackType");
            return (Criteria) this;
        }

        public Criteria andNextTrackTypeIn(List<Byte> values) {
            addCriterion("next_track_type in", values, "nextTrackType");
            return (Criteria) this;
        }

        public Criteria andNextTrackTypeNotIn(List<Byte> values) {
            addCriterion("next_track_type not in", values, "nextTrackType");
            return (Criteria) this;
        }

        public Criteria andNextTrackTypeBetween(Byte value1, Byte value2) {
            addCriterion("next_track_type between", value1, value2, "nextTrackType");
            return (Criteria) this;
        }

        public Criteria andNextTrackTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("next_track_type not between", value1, value2, "nextTrackType");
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