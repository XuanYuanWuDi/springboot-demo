package com.injured.server.api.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InjuredRaisePersonInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InjuredRaisePersonInfoExample() {
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

        public Criteria andRaisePersonNameIsNull() {
            addCriterion("raise_person_name is null");
            return (Criteria) this;
        }

        public Criteria andRaisePersonNameIsNotNull() {
            addCriterion("raise_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andRaisePersonNameEqualTo(String value) {
            addCriterion("raise_person_name =", value, "raisePersonName");
            return (Criteria) this;
        }

        public Criteria andRaisePersonNameNotEqualTo(String value) {
            addCriterion("raise_person_name <>", value, "raisePersonName");
            return (Criteria) this;
        }

        public Criteria andRaisePersonNameGreaterThan(String value) {
            addCriterion("raise_person_name >", value, "raisePersonName");
            return (Criteria) this;
        }

        public Criteria andRaisePersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("raise_person_name >=", value, "raisePersonName");
            return (Criteria) this;
        }

        public Criteria andRaisePersonNameLessThan(String value) {
            addCriterion("raise_person_name <", value, "raisePersonName");
            return (Criteria) this;
        }

        public Criteria andRaisePersonNameLessThanOrEqualTo(String value) {
            addCriterion("raise_person_name <=", value, "raisePersonName");
            return (Criteria) this;
        }

        public Criteria andRaisePersonNameLike(String value) {
            addCriterion("raise_person_name like", value, "raisePersonName");
            return (Criteria) this;
        }

        public Criteria andRaisePersonNameNotLike(String value) {
            addCriterion("raise_person_name not like", value, "raisePersonName");
            return (Criteria) this;
        }

        public Criteria andRaisePersonNameIn(List<String> values) {
            addCriterion("raise_person_name in", values, "raisePersonName");
            return (Criteria) this;
        }

        public Criteria andRaisePersonNameNotIn(List<String> values) {
            addCriterion("raise_person_name not in", values, "raisePersonName");
            return (Criteria) this;
        }

        public Criteria andRaisePersonNameBetween(String value1, String value2) {
            addCriterion("raise_person_name between", value1, value2, "raisePersonName");
            return (Criteria) this;
        }

        public Criteria andRaisePersonNameNotBetween(String value1, String value2) {
            addCriterion("raise_person_name not between", value1, value2, "raisePersonName");
            return (Criteria) this;
        }

        public Criteria andRaisePersonSexIsNull() {
            addCriterion("raise_person_sex is null");
            return (Criteria) this;
        }

        public Criteria andRaisePersonSexIsNotNull() {
            addCriterion("raise_person_sex is not null");
            return (Criteria) this;
        }

        public Criteria andRaisePersonSexEqualTo(Integer value) {
            addCriterion("raise_person_sex =", value, "raisePersonSex");
            return (Criteria) this;
        }

        public Criteria andRaisePersonSexNotEqualTo(Integer value) {
            addCriterion("raise_person_sex <>", value, "raisePersonSex");
            return (Criteria) this;
        }

        public Criteria andRaisePersonSexGreaterThan(Integer value) {
            addCriterion("raise_person_sex >", value, "raisePersonSex");
            return (Criteria) this;
        }

        public Criteria andRaisePersonSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("raise_person_sex >=", value, "raisePersonSex");
            return (Criteria) this;
        }

        public Criteria andRaisePersonSexLessThan(Integer value) {
            addCriterion("raise_person_sex <", value, "raisePersonSex");
            return (Criteria) this;
        }

        public Criteria andRaisePersonSexLessThanOrEqualTo(Integer value) {
            addCriterion("raise_person_sex <=", value, "raisePersonSex");
            return (Criteria) this;
        }

        public Criteria andRaisePersonSexIn(List<Integer> values) {
            addCriterion("raise_person_sex in", values, "raisePersonSex");
            return (Criteria) this;
        }

        public Criteria andRaisePersonSexNotIn(List<Integer> values) {
            addCriterion("raise_person_sex not in", values, "raisePersonSex");
            return (Criteria) this;
        }

        public Criteria andRaisePersonSexBetween(Integer value1, Integer value2) {
            addCriterion("raise_person_sex between", value1, value2, "raisePersonSex");
            return (Criteria) this;
        }

        public Criteria andRaisePersonSexNotBetween(Integer value1, Integer value2) {
            addCriterion("raise_person_sex not between", value1, value2, "raisePersonSex");
            return (Criteria) this;
        }

        public Criteria andRaisePersonAgeIsNull() {
            addCriterion("raise_person_age is null");
            return (Criteria) this;
        }

        public Criteria andRaisePersonAgeIsNotNull() {
            addCriterion("raise_person_age is not null");
            return (Criteria) this;
        }

        public Criteria andRaisePersonAgeEqualTo(Integer value) {
            addCriterion("raise_person_age =", value, "raisePersonAge");
            return (Criteria) this;
        }

        public Criteria andRaisePersonAgeNotEqualTo(Integer value) {
            addCriterion("raise_person_age <>", value, "raisePersonAge");
            return (Criteria) this;
        }

        public Criteria andRaisePersonAgeGreaterThan(Integer value) {
            addCriterion("raise_person_age >", value, "raisePersonAge");
            return (Criteria) this;
        }

        public Criteria andRaisePersonAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("raise_person_age >=", value, "raisePersonAge");
            return (Criteria) this;
        }

        public Criteria andRaisePersonAgeLessThan(Integer value) {
            addCriterion("raise_person_age <", value, "raisePersonAge");
            return (Criteria) this;
        }

        public Criteria andRaisePersonAgeLessThanOrEqualTo(Integer value) {
            addCriterion("raise_person_age <=", value, "raisePersonAge");
            return (Criteria) this;
        }

        public Criteria andRaisePersonAgeIn(List<Integer> values) {
            addCriterion("raise_person_age in", values, "raisePersonAge");
            return (Criteria) this;
        }

        public Criteria andRaisePersonAgeNotIn(List<Integer> values) {
            addCriterion("raise_person_age not in", values, "raisePersonAge");
            return (Criteria) this;
        }

        public Criteria andRaisePersonAgeBetween(Integer value1, Integer value2) {
            addCriterion("raise_person_age between", value1, value2, "raisePersonAge");
            return (Criteria) this;
        }

        public Criteria andRaisePersonAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("raise_person_age not between", value1, value2, "raisePersonAge");
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

        public Criteria andInjuRelationIsNull() {
            addCriterion("inju_relation is null");
            return (Criteria) this;
        }

        public Criteria andInjuRelationIsNotNull() {
            addCriterion("inju_relation is not null");
            return (Criteria) this;
        }

        public Criteria andInjuRelationEqualTo(Integer value) {
            addCriterion("inju_relation =", value, "injuRelation");
            return (Criteria) this;
        }

        public Criteria andInjuRelationNotEqualTo(Integer value) {
            addCriterion("inju_relation <>", value, "injuRelation");
            return (Criteria) this;
        }

        public Criteria andInjuRelationGreaterThan(Integer value) {
            addCriterion("inju_relation >", value, "injuRelation");
            return (Criteria) this;
        }

        public Criteria andInjuRelationGreaterThanOrEqualTo(Integer value) {
            addCriterion("inju_relation >=", value, "injuRelation");
            return (Criteria) this;
        }

        public Criteria andInjuRelationLessThan(Integer value) {
            addCriterion("inju_relation <", value, "injuRelation");
            return (Criteria) this;
        }

        public Criteria andInjuRelationLessThanOrEqualTo(Integer value) {
            addCriterion("inju_relation <=", value, "injuRelation");
            return (Criteria) this;
        }

        public Criteria andInjuRelationIn(List<Integer> values) {
            addCriterion("inju_relation in", values, "injuRelation");
            return (Criteria) this;
        }

        public Criteria andInjuRelationNotIn(List<Integer> values) {
            addCriterion("inju_relation not in", values, "injuRelation");
            return (Criteria) this;
        }

        public Criteria andInjuRelationBetween(Integer value1, Integer value2) {
            addCriterion("inju_relation between", value1, value2, "injuRelation");
            return (Criteria) this;
        }

        public Criteria andInjuRelationNotBetween(Integer value1, Integer value2) {
            addCriterion("inju_relation not between", value1, value2, "injuRelation");
            return (Criteria) this;
        }

        public Criteria andRaiseYearsIsNull() {
            addCriterion("raise_years is null");
            return (Criteria) this;
        }

        public Criteria andRaiseYearsIsNotNull() {
            addCriterion("raise_years is not null");
            return (Criteria) this;
        }

        public Criteria andRaiseYearsEqualTo(Integer value) {
            addCriterion("raise_years =", value, "raiseYears");
            return (Criteria) this;
        }

        public Criteria andRaiseYearsNotEqualTo(Integer value) {
            addCriterion("raise_years <>", value, "raiseYears");
            return (Criteria) this;
        }

        public Criteria andRaiseYearsGreaterThan(Integer value) {
            addCriterion("raise_years >", value, "raiseYears");
            return (Criteria) this;
        }

        public Criteria andRaiseYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("raise_years >=", value, "raiseYears");
            return (Criteria) this;
        }

        public Criteria andRaiseYearsLessThan(Integer value) {
            addCriterion("raise_years <", value, "raiseYears");
            return (Criteria) this;
        }

        public Criteria andRaiseYearsLessThanOrEqualTo(Integer value) {
            addCriterion("raise_years <=", value, "raiseYears");
            return (Criteria) this;
        }

        public Criteria andRaiseYearsIn(List<Integer> values) {
            addCriterion("raise_years in", values, "raiseYears");
            return (Criteria) this;
        }

        public Criteria andRaiseYearsNotIn(List<Integer> values) {
            addCriterion("raise_years not in", values, "raiseYears");
            return (Criteria) this;
        }

        public Criteria andRaiseYearsBetween(Integer value1, Integer value2) {
            addCriterion("raise_years between", value1, value2, "raiseYears");
            return (Criteria) this;
        }

        public Criteria andRaiseYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("raise_years not between", value1, value2, "raiseYears");
            return (Criteria) this;
        }

        public Criteria andCoRaiseNumIsNull() {
            addCriterion("co_raise_num is null");
            return (Criteria) this;
        }

        public Criteria andCoRaiseNumIsNotNull() {
            addCriterion("co_raise_num is not null");
            return (Criteria) this;
        }

        public Criteria andCoRaiseNumEqualTo(Integer value) {
            addCriterion("co_raise_num =", value, "coRaiseNum");
            return (Criteria) this;
        }

        public Criteria andCoRaiseNumNotEqualTo(Integer value) {
            addCriterion("co_raise_num <>", value, "coRaiseNum");
            return (Criteria) this;
        }

        public Criteria andCoRaiseNumGreaterThan(Integer value) {
            addCriterion("co_raise_num >", value, "coRaiseNum");
            return (Criteria) this;
        }

        public Criteria andCoRaiseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("co_raise_num >=", value, "coRaiseNum");
            return (Criteria) this;
        }

        public Criteria andCoRaiseNumLessThan(Integer value) {
            addCriterion("co_raise_num <", value, "coRaiseNum");
            return (Criteria) this;
        }

        public Criteria andCoRaiseNumLessThanOrEqualTo(Integer value) {
            addCriterion("co_raise_num <=", value, "coRaiseNum");
            return (Criteria) this;
        }

        public Criteria andCoRaiseNumIn(List<Integer> values) {
            addCriterion("co_raise_num in", values, "coRaiseNum");
            return (Criteria) this;
        }

        public Criteria andCoRaiseNumNotIn(List<Integer> values) {
            addCriterion("co_raise_num not in", values, "coRaiseNum");
            return (Criteria) this;
        }

        public Criteria andCoRaiseNumBetween(Integer value1, Integer value2) {
            addCriterion("co_raise_num between", value1, value2, "coRaiseNum");
            return (Criteria) this;
        }

        public Criteria andCoRaiseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("co_raise_num not between", value1, value2, "coRaiseNum");
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

        public Criteria andAppUserStandardIsNull() {
            addCriterion("app_user_standard is null");
            return (Criteria) this;
        }

        public Criteria andAppUserStandardIsNotNull() {
            addCriterion("app_user_standard is not null");
            return (Criteria) this;
        }

        public Criteria andAppUserStandardEqualTo(Integer value) {
            addCriterion("app_user_standard =", value, "appUserStandard");
            return (Criteria) this;
        }

        public Criteria andAppUserStandardNotEqualTo(Integer value) {
            addCriterion("app_user_standard <>", value, "appUserStandard");
            return (Criteria) this;
        }

        public Criteria andAppUserStandardGreaterThan(Integer value) {
            addCriterion("app_user_standard >", value, "appUserStandard");
            return (Criteria) this;
        }

        public Criteria andAppUserStandardGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_user_standard >=", value, "appUserStandard");
            return (Criteria) this;
        }

        public Criteria andAppUserStandardLessThan(Integer value) {
            addCriterion("app_user_standard <", value, "appUserStandard");
            return (Criteria) this;
        }

        public Criteria andAppUserStandardLessThanOrEqualTo(Integer value) {
            addCriterion("app_user_standard <=", value, "appUserStandard");
            return (Criteria) this;
        }

        public Criteria andAppUserStandardIn(List<Integer> values) {
            addCriterion("app_user_standard in", values, "appUserStandard");
            return (Criteria) this;
        }

        public Criteria andAppUserStandardNotIn(List<Integer> values) {
            addCriterion("app_user_standard not in", values, "appUserStandard");
            return (Criteria) this;
        }

        public Criteria andAppUserStandardBetween(Integer value1, Integer value2) {
            addCriterion("app_user_standard between", value1, value2, "appUserStandard");
            return (Criteria) this;
        }

        public Criteria andAppUserStandardNotBetween(Integer value1, Integer value2) {
            addCriterion("app_user_standard not between", value1, value2, "appUserStandard");
            return (Criteria) this;
        }

        public Criteria andIsOtherSourcesIncomeIsNull() {
            addCriterion("is_other_sources_income is null");
            return (Criteria) this;
        }

        public Criteria andIsOtherSourcesIncomeIsNotNull() {
            addCriterion("is_other_sources_income is not null");
            return (Criteria) this;
        }

        public Criteria andIsOtherSourcesIncomeEqualTo(Integer value) {
            addCriterion("is_other_sources_income =", value, "isOtherSourcesIncome");
            return (Criteria) this;
        }

        public Criteria andIsOtherSourcesIncomeNotEqualTo(Integer value) {
            addCriterion("is_other_sources_income <>", value, "isOtherSourcesIncome");
            return (Criteria) this;
        }

        public Criteria andIsOtherSourcesIncomeGreaterThan(Integer value) {
            addCriterion("is_other_sources_income >", value, "isOtherSourcesIncome");
            return (Criteria) this;
        }

        public Criteria andIsOtherSourcesIncomeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_other_sources_income >=", value, "isOtherSourcesIncome");
            return (Criteria) this;
        }

        public Criteria andIsOtherSourcesIncomeLessThan(Integer value) {
            addCriterion("is_other_sources_income <", value, "isOtherSourcesIncome");
            return (Criteria) this;
        }

        public Criteria andIsOtherSourcesIncomeLessThanOrEqualTo(Integer value) {
            addCriterion("is_other_sources_income <=", value, "isOtherSourcesIncome");
            return (Criteria) this;
        }

        public Criteria andIsOtherSourcesIncomeIn(List<Integer> values) {
            addCriterion("is_other_sources_income in", values, "isOtherSourcesIncome");
            return (Criteria) this;
        }

        public Criteria andIsOtherSourcesIncomeNotIn(List<Integer> values) {
            addCriterion("is_other_sources_income not in", values, "isOtherSourcesIncome");
            return (Criteria) this;
        }

        public Criteria andIsOtherSourcesIncomeBetween(Integer value1, Integer value2) {
            addCriterion("is_other_sources_income between", value1, value2, "isOtherSourcesIncome");
            return (Criteria) this;
        }

        public Criteria andIsOtherSourcesIncomeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_other_sources_income not between", value1, value2, "isOtherSourcesIncome");
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