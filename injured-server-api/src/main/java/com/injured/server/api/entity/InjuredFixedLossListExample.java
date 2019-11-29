package com.injured.server.api.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InjuredFixedLossListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InjuredFixedLossListExample() {
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

        public Criteria andFixedDamageIdIsNull() {
            addCriterion("fixed_damage_id is null");
            return (Criteria) this;
        }

        public Criteria andFixedDamageIdIsNotNull() {
            addCriterion("fixed_damage_id is not null");
            return (Criteria) this;
        }

        public Criteria andFixedDamageIdEqualTo(Long value) {
            addCriterion("fixed_damage_id =", value, "fixedDamageId");
            return (Criteria) this;
        }

        public Criteria andFixedDamageIdNotEqualTo(Long value) {
            addCriterion("fixed_damage_id <>", value, "fixedDamageId");
            return (Criteria) this;
        }

        public Criteria andFixedDamageIdGreaterThan(Long value) {
            addCriterion("fixed_damage_id >", value, "fixedDamageId");
            return (Criteria) this;
        }

        public Criteria andFixedDamageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("fixed_damage_id >=", value, "fixedDamageId");
            return (Criteria) this;
        }

        public Criteria andFixedDamageIdLessThan(Long value) {
            addCriterion("fixed_damage_id <", value, "fixedDamageId");
            return (Criteria) this;
        }

        public Criteria andFixedDamageIdLessThanOrEqualTo(Long value) {
            addCriterion("fixed_damage_id <=", value, "fixedDamageId");
            return (Criteria) this;
        }

        public Criteria andFixedDamageIdIn(List<Long> values) {
            addCriterion("fixed_damage_id in", values, "fixedDamageId");
            return (Criteria) this;
        }

        public Criteria andFixedDamageIdNotIn(List<Long> values) {
            addCriterion("fixed_damage_id not in", values, "fixedDamageId");
            return (Criteria) this;
        }

        public Criteria andFixedDamageIdBetween(Long value1, Long value2) {
            addCriterion("fixed_damage_id between", value1, value2, "fixedDamageId");
            return (Criteria) this;
        }

        public Criteria andFixedDamageIdNotBetween(Long value1, Long value2) {
            addCriterion("fixed_damage_id not between", value1, value2, "fixedDamageId");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNull() {
            addCriterion("info_id is null");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNotNull() {
            addCriterion("info_id is not null");
            return (Criteria) this;
        }

        public Criteria andInfoIdEqualTo(Long value) {
            addCriterion("info_id =", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotEqualTo(Long value) {
            addCriterion("info_id <>", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThan(Long value) {
            addCriterion("info_id >", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("info_id >=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThan(Long value) {
            addCriterion("info_id <", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("info_id <=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdIn(List<Long> values) {
            addCriterion("info_id in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotIn(List<Long> values) {
            addCriterion("info_id not in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdBetween(Long value1, Long value2) {
            addCriterion("info_id between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("info_id not between", value1, value2, "infoId");
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

        public Criteria andDamagesNumIsNull() {
            addCriterion("damages_num is null");
            return (Criteria) this;
        }

        public Criteria andDamagesNumIsNotNull() {
            addCriterion("damages_num is not null");
            return (Criteria) this;
        }

        public Criteria andDamagesNumEqualTo(Integer value) {
            addCriterion("damages_num =", value, "damagesNum");
            return (Criteria) this;
        }

        public Criteria andDamagesNumNotEqualTo(Integer value) {
            addCriterion("damages_num <>", value, "damagesNum");
            return (Criteria) this;
        }

        public Criteria andDamagesNumGreaterThan(Integer value) {
            addCriterion("damages_num >", value, "damagesNum");
            return (Criteria) this;
        }

        public Criteria andDamagesNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("damages_num >=", value, "damagesNum");
            return (Criteria) this;
        }

        public Criteria andDamagesNumLessThan(Integer value) {
            addCriterion("damages_num <", value, "damagesNum");
            return (Criteria) this;
        }

        public Criteria andDamagesNumLessThanOrEqualTo(Integer value) {
            addCriterion("damages_num <=", value, "damagesNum");
            return (Criteria) this;
        }

        public Criteria andDamagesNumIn(List<Integer> values) {
            addCriterion("damages_num in", values, "damagesNum");
            return (Criteria) this;
        }

        public Criteria andDamagesNumNotIn(List<Integer> values) {
            addCriterion("damages_num not in", values, "damagesNum");
            return (Criteria) this;
        }

        public Criteria andDamagesNumBetween(Integer value1, Integer value2) {
            addCriterion("damages_num between", value1, value2, "damagesNum");
            return (Criteria) this;
        }

        public Criteria andDamagesNumNotBetween(Integer value1, Integer value2) {
            addCriterion("damages_num not between", value1, value2, "damagesNum");
            return (Criteria) this;
        }

        public Criteria andLossTypeIsNull() {
            addCriterion("loss_type is null");
            return (Criteria) this;
        }

        public Criteria andLossTypeIsNotNull() {
            addCriterion("loss_type is not null");
            return (Criteria) this;
        }

        public Criteria andLossTypeEqualTo(Byte value) {
            addCriterion("loss_type =", value, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeNotEqualTo(Byte value) {
            addCriterion("loss_type <>", value, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeGreaterThan(Byte value) {
            addCriterion("loss_type >", value, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("loss_type >=", value, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeLessThan(Byte value) {
            addCriterion("loss_type <", value, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeLessThanOrEqualTo(Byte value) {
            addCriterion("loss_type <=", value, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeIn(List<Byte> values) {
            addCriterion("loss_type in", values, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeNotIn(List<Byte> values) {
            addCriterion("loss_type not in", values, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeBetween(Byte value1, Byte value2) {
            addCriterion("loss_type between", value1, value2, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("loss_type not between", value1, value2, "lossType");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemTypeIsNull() {
            addCriterion("injury_loss_item_type is null");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemTypeIsNotNull() {
            addCriterion("injury_loss_item_type is not null");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemTypeEqualTo(String value) {
            addCriterion("injury_loss_item_type =", value, "injuryLossItemType");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemTypeNotEqualTo(String value) {
            addCriterion("injury_loss_item_type <>", value, "injuryLossItemType");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemTypeGreaterThan(String value) {
            addCriterion("injury_loss_item_type >", value, "injuryLossItemType");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemTypeGreaterThanOrEqualTo(String value) {
            addCriterion("injury_loss_item_type >=", value, "injuryLossItemType");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemTypeLessThan(String value) {
            addCriterion("injury_loss_item_type <", value, "injuryLossItemType");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemTypeLessThanOrEqualTo(String value) {
            addCriterion("injury_loss_item_type <=", value, "injuryLossItemType");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemTypeLike(String value) {
            addCriterion("injury_loss_item_type like", value, "injuryLossItemType");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemTypeNotLike(String value) {
            addCriterion("injury_loss_item_type not like", value, "injuryLossItemType");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemTypeIn(List<String> values) {
            addCriterion("injury_loss_item_type in", values, "injuryLossItemType");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemTypeNotIn(List<String> values) {
            addCriterion("injury_loss_item_type not in", values, "injuryLossItemType");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemTypeBetween(String value1, String value2) {
            addCriterion("injury_loss_item_type between", value1, value2, "injuryLossItemType");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemTypeNotBetween(String value1, String value2) {
            addCriterion("injury_loss_item_type not between", value1, value2, "injuryLossItemType");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemIdIsNull() {
            addCriterion("injury_loss_item_id is null");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemIdIsNotNull() {
            addCriterion("injury_loss_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemIdEqualTo(Long value) {
            addCriterion("injury_loss_item_id =", value, "injuryLossItemId");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemIdNotEqualTo(Long value) {
            addCriterion("injury_loss_item_id <>", value, "injuryLossItemId");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemIdGreaterThan(Long value) {
            addCriterion("injury_loss_item_id >", value, "injuryLossItemId");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("injury_loss_item_id >=", value, "injuryLossItemId");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemIdLessThan(Long value) {
            addCriterion("injury_loss_item_id <", value, "injuryLossItemId");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemIdLessThanOrEqualTo(Long value) {
            addCriterion("injury_loss_item_id <=", value, "injuryLossItemId");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemIdIn(List<Long> values) {
            addCriterion("injury_loss_item_id in", values, "injuryLossItemId");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemIdNotIn(List<Long> values) {
            addCriterion("injury_loss_item_id not in", values, "injuryLossItemId");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemIdBetween(Long value1, Long value2) {
            addCriterion("injury_loss_item_id between", value1, value2, "injuryLossItemId");
            return (Criteria) this;
        }

        public Criteria andInjuryLossItemIdNotBetween(Long value1, Long value2) {
            addCriterion("injury_loss_item_id not between", value1, value2, "injuryLossItemId");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaInfoIsNull() {
            addCriterion("calculat_formula_info is null");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaInfoIsNotNull() {
            addCriterion("calculat_formula_info is not null");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaInfoEqualTo(String value) {
            addCriterion("calculat_formula_info =", value, "calculatFormulaInfo");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaInfoNotEqualTo(String value) {
            addCriterion("calculat_formula_info <>", value, "calculatFormulaInfo");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaInfoGreaterThan(String value) {
            addCriterion("calculat_formula_info >", value, "calculatFormulaInfo");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaInfoGreaterThanOrEqualTo(String value) {
            addCriterion("calculat_formula_info >=", value, "calculatFormulaInfo");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaInfoLessThan(String value) {
            addCriterion("calculat_formula_info <", value, "calculatFormulaInfo");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaInfoLessThanOrEqualTo(String value) {
            addCriterion("calculat_formula_info <=", value, "calculatFormulaInfo");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaInfoLike(String value) {
            addCriterion("calculat_formula_info like", value, "calculatFormulaInfo");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaInfoNotLike(String value) {
            addCriterion("calculat_formula_info not like", value, "calculatFormulaInfo");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaInfoIn(List<String> values) {
            addCriterion("calculat_formula_info in", values, "calculatFormulaInfo");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaInfoNotIn(List<String> values) {
            addCriterion("calculat_formula_info not in", values, "calculatFormulaInfo");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaInfoBetween(String value1, String value2) {
            addCriterion("calculat_formula_info between", value1, value2, "calculatFormulaInfo");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaInfoNotBetween(String value1, String value2) {
            addCriterion("calculat_formula_info not between", value1, value2, "calculatFormulaInfo");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaIdIsNull() {
            addCriterion("calculat_formula_id is null");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaIdIsNotNull() {
            addCriterion("calculat_formula_id is not null");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaIdEqualTo(Long value) {
            addCriterion("calculat_formula_id =", value, "calculatFormulaId");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaIdNotEqualTo(Long value) {
            addCriterion("calculat_formula_id <>", value, "calculatFormulaId");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaIdGreaterThan(Long value) {
            addCriterion("calculat_formula_id >", value, "calculatFormulaId");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("calculat_formula_id >=", value, "calculatFormulaId");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaIdLessThan(Long value) {
            addCriterion("calculat_formula_id <", value, "calculatFormulaId");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaIdLessThanOrEqualTo(Long value) {
            addCriterion("calculat_formula_id <=", value, "calculatFormulaId");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaIdIn(List<Long> values) {
            addCriterion("calculat_formula_id in", values, "calculatFormulaId");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaIdNotIn(List<Long> values) {
            addCriterion("calculat_formula_id not in", values, "calculatFormulaId");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaIdBetween(Long value1, Long value2) {
            addCriterion("calculat_formula_id between", value1, value2, "calculatFormulaId");
            return (Criteria) this;
        }

        public Criteria andCalculatFormulaIdNotBetween(Long value1, Long value2) {
            addCriterion("calculat_formula_id not between", value1, value2, "calculatFormulaId");
            return (Criteria) this;
        }

        public Criteria andReportLossAmountIsNull() {
            addCriterion("report_loss_amount is null");
            return (Criteria) this;
        }

        public Criteria andReportLossAmountIsNotNull() {
            addCriterion("report_loss_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReportLossAmountEqualTo(BigDecimal value) {
            addCriterion("report_loss_amount =", value, "reportLossAmount");
            return (Criteria) this;
        }

        public Criteria andReportLossAmountNotEqualTo(BigDecimal value) {
            addCriterion("report_loss_amount <>", value, "reportLossAmount");
            return (Criteria) this;
        }

        public Criteria andReportLossAmountGreaterThan(BigDecimal value) {
            addCriterion("report_loss_amount >", value, "reportLossAmount");
            return (Criteria) this;
        }

        public Criteria andReportLossAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("report_loss_amount >=", value, "reportLossAmount");
            return (Criteria) this;
        }

        public Criteria andReportLossAmountLessThan(BigDecimal value) {
            addCriterion("report_loss_amount <", value, "reportLossAmount");
            return (Criteria) this;
        }

        public Criteria andReportLossAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("report_loss_amount <=", value, "reportLossAmount");
            return (Criteria) this;
        }

        public Criteria andReportLossAmountIn(List<BigDecimal> values) {
            addCriterion("report_loss_amount in", values, "reportLossAmount");
            return (Criteria) this;
        }

        public Criteria andReportLossAmountNotIn(List<BigDecimal> values) {
            addCriterion("report_loss_amount not in", values, "reportLossAmount");
            return (Criteria) this;
        }

        public Criteria andReportLossAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("report_loss_amount between", value1, value2, "reportLossAmount");
            return (Criteria) this;
        }

        public Criteria andReportLossAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("report_loss_amount not between", value1, value2, "reportLossAmount");
            return (Criteria) this;
        }

        public Criteria andAdjustAmountIsNull() {
            addCriterion("adjust_amount is null");
            return (Criteria) this;
        }

        public Criteria andAdjustAmountIsNotNull() {
            addCriterion("adjust_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustAmountEqualTo(BigDecimal value) {
            addCriterion("adjust_amount =", value, "adjustAmount");
            return (Criteria) this;
        }

        public Criteria andAdjustAmountNotEqualTo(BigDecimal value) {
            addCriterion("adjust_amount <>", value, "adjustAmount");
            return (Criteria) this;
        }

        public Criteria andAdjustAmountGreaterThan(BigDecimal value) {
            addCriterion("adjust_amount >", value, "adjustAmount");
            return (Criteria) this;
        }

        public Criteria andAdjustAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("adjust_amount >=", value, "adjustAmount");
            return (Criteria) this;
        }

        public Criteria andAdjustAmountLessThan(BigDecimal value) {
            addCriterion("adjust_amount <", value, "adjustAmount");
            return (Criteria) this;
        }

        public Criteria andAdjustAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("adjust_amount <=", value, "adjustAmount");
            return (Criteria) this;
        }

        public Criteria andAdjustAmountIn(List<BigDecimal> values) {
            addCriterion("adjust_amount in", values, "adjustAmount");
            return (Criteria) this;
        }

        public Criteria andAdjustAmountNotIn(List<BigDecimal> values) {
            addCriterion("adjust_amount not in", values, "adjustAmount");
            return (Criteria) this;
        }

        public Criteria andAdjustAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("adjust_amount between", value1, value2, "adjustAmount");
            return (Criteria) this;
        }

        public Criteria andAdjustAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("adjust_amount not between", value1, value2, "adjustAmount");
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

        public Criteria andAdditReasonIsNull() {
            addCriterion("addit_reason is null");
            return (Criteria) this;
        }

        public Criteria andAdditReasonIsNotNull() {
            addCriterion("addit_reason is not null");
            return (Criteria) this;
        }

        public Criteria andAdditReasonEqualTo(BigDecimal value) {
            addCriterion("addit_reason =", value, "additReason");
            return (Criteria) this;
        }

        public Criteria andAdditReasonNotEqualTo(BigDecimal value) {
            addCriterion("addit_reason <>", value, "additReason");
            return (Criteria) this;
        }

        public Criteria andAdditReasonGreaterThan(BigDecimal value) {
            addCriterion("addit_reason >", value, "additReason");
            return (Criteria) this;
        }

        public Criteria andAdditReasonGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("addit_reason >=", value, "additReason");
            return (Criteria) this;
        }

        public Criteria andAdditReasonLessThan(BigDecimal value) {
            addCriterion("addit_reason <", value, "additReason");
            return (Criteria) this;
        }

        public Criteria andAdditReasonLessThanOrEqualTo(BigDecimal value) {
            addCriterion("addit_reason <=", value, "additReason");
            return (Criteria) this;
        }

        public Criteria andAdditReasonIn(List<BigDecimal> values) {
            addCriterion("addit_reason in", values, "additReason");
            return (Criteria) this;
        }

        public Criteria andAdditReasonNotIn(List<BigDecimal> values) {
            addCriterion("addit_reason not in", values, "additReason");
            return (Criteria) this;
        }

        public Criteria andAdditReasonBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("addit_reason between", value1, value2, "additReason");
            return (Criteria) this;
        }

        public Criteria andAdditReasonNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("addit_reason not between", value1, value2, "additReason");
            return (Criteria) this;
        }

        public Criteria andAdjustInstructIsNull() {
            addCriterion("adjust_instruct is null");
            return (Criteria) this;
        }

        public Criteria andAdjustInstructIsNotNull() {
            addCriterion("adjust_instruct is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustInstructEqualTo(String value) {
            addCriterion("adjust_instruct =", value, "adjustInstruct");
            return (Criteria) this;
        }

        public Criteria andAdjustInstructNotEqualTo(String value) {
            addCriterion("adjust_instruct <>", value, "adjustInstruct");
            return (Criteria) this;
        }

        public Criteria andAdjustInstructGreaterThan(String value) {
            addCriterion("adjust_instruct >", value, "adjustInstruct");
            return (Criteria) this;
        }

        public Criteria andAdjustInstructGreaterThanOrEqualTo(String value) {
            addCriterion("adjust_instruct >=", value, "adjustInstruct");
            return (Criteria) this;
        }

        public Criteria andAdjustInstructLessThan(String value) {
            addCriterion("adjust_instruct <", value, "adjustInstruct");
            return (Criteria) this;
        }

        public Criteria andAdjustInstructLessThanOrEqualTo(String value) {
            addCriterion("adjust_instruct <=", value, "adjustInstruct");
            return (Criteria) this;
        }

        public Criteria andAdjustInstructLike(String value) {
            addCriterion("adjust_instruct like", value, "adjustInstruct");
            return (Criteria) this;
        }

        public Criteria andAdjustInstructNotLike(String value) {
            addCriterion("adjust_instruct not like", value, "adjustInstruct");
            return (Criteria) this;
        }

        public Criteria andAdjustInstructIn(List<String> values) {
            addCriterion("adjust_instruct in", values, "adjustInstruct");
            return (Criteria) this;
        }

        public Criteria andAdjustInstructNotIn(List<String> values) {
            addCriterion("adjust_instruct not in", values, "adjustInstruct");
            return (Criteria) this;
        }

        public Criteria andAdjustInstructBetween(String value1, String value2) {
            addCriterion("adjust_instruct between", value1, value2, "adjustInstruct");
            return (Criteria) this;
        }

        public Criteria andAdjustInstructNotBetween(String value1, String value2) {
            addCriterion("adjust_instruct not between", value1, value2, "adjustInstruct");
            return (Criteria) this;
        }

        public Criteria andFixedLossTypeFirstIsNull() {
            addCriterion("fixed_loss_type_first is null");
            return (Criteria) this;
        }

        public Criteria andFixedLossTypeFirstIsNotNull() {
            addCriterion("fixed_loss_type_first is not null");
            return (Criteria) this;
        }

        public Criteria andFixedLossTypeFirstEqualTo(Long value) {
            addCriterion("fixed_loss_type_first =", value, "fixedLossTypeFirst");
            return (Criteria) this;
        }

        public Criteria andFixedLossTypeFirstNotEqualTo(Long value) {
            addCriterion("fixed_loss_type_first <>", value, "fixedLossTypeFirst");
            return (Criteria) this;
        }

        public Criteria andFixedLossTypeFirstGreaterThan(Long value) {
            addCriterion("fixed_loss_type_first >", value, "fixedLossTypeFirst");
            return (Criteria) this;
        }

        public Criteria andFixedLossTypeFirstGreaterThanOrEqualTo(Long value) {
            addCriterion("fixed_loss_type_first >=", value, "fixedLossTypeFirst");
            return (Criteria) this;
        }

        public Criteria andFixedLossTypeFirstLessThan(Long value) {
            addCriterion("fixed_loss_type_first <", value, "fixedLossTypeFirst");
            return (Criteria) this;
        }

        public Criteria andFixedLossTypeFirstLessThanOrEqualTo(Long value) {
            addCriterion("fixed_loss_type_first <=", value, "fixedLossTypeFirst");
            return (Criteria) this;
        }

        public Criteria andFixedLossTypeFirstIn(List<Long> values) {
            addCriterion("fixed_loss_type_first in", values, "fixedLossTypeFirst");
            return (Criteria) this;
        }

        public Criteria andFixedLossTypeFirstNotIn(List<Long> values) {
            addCriterion("fixed_loss_type_first not in", values, "fixedLossTypeFirst");
            return (Criteria) this;
        }

        public Criteria andFixedLossTypeFirstBetween(Long value1, Long value2) {
            addCriterion("fixed_loss_type_first between", value1, value2, "fixedLossTypeFirst");
            return (Criteria) this;
        }

        public Criteria andFixedLossTypeFirstNotBetween(Long value1, Long value2) {
            addCriterion("fixed_loss_type_first not between", value1, value2, "fixedLossTypeFirst");
            return (Criteria) this;
        }

        public Criteria andFixedLossTypeSecondIsNull() {
            addCriterion("fixed_loss_type_second is null");
            return (Criteria) this;
        }

        public Criteria andFixedLossTypeSecondIsNotNull() {
            addCriterion("fixed_loss_type_second is not null");
            return (Criteria) this;
        }

        public Criteria andFixedLossTypeSecondEqualTo(Long value) {
            addCriterion("fixed_loss_type_second =", value, "fixedLossTypeSecond");
            return (Criteria) this;
        }

        public Criteria andFixedLossTypeSecondNotEqualTo(Long value) {
            addCriterion("fixed_loss_type_second <>", value, "fixedLossTypeSecond");
            return (Criteria) this;
        }

        public Criteria andFixedLossTypeSecondGreaterThan(Long value) {
            addCriterion("fixed_loss_type_second >", value, "fixedLossTypeSecond");
            return (Criteria) this;
        }

        public Criteria andFixedLossTypeSecondGreaterThanOrEqualTo(Long value) {
            addCriterion("fixed_loss_type_second >=", value, "fixedLossTypeSecond");
            return (Criteria) this;
        }

        public Criteria andFixedLossTypeSecondLessThan(Long value) {
            addCriterion("fixed_loss_type_second <", value, "fixedLossTypeSecond");
            return (Criteria) this;
        }

        public Criteria andFixedLossTypeSecondLessThanOrEqualTo(Long value) {
            addCriterion("fixed_loss_type_second <=", value, "fixedLossTypeSecond");
            return (Criteria) this;
        }

        public Criteria andFixedLossTypeSecondIn(List<Long> values) {
            addCriterion("fixed_loss_type_second in", values, "fixedLossTypeSecond");
            return (Criteria) this;
        }

        public Criteria andFixedLossTypeSecondNotIn(List<Long> values) {
            addCriterion("fixed_loss_type_second not in", values, "fixedLossTypeSecond");
            return (Criteria) this;
        }

        public Criteria andFixedLossTypeSecondBetween(Long value1, Long value2) {
            addCriterion("fixed_loss_type_second between", value1, value2, "fixedLossTypeSecond");
            return (Criteria) this;
        }

        public Criteria andFixedLossTypeSecondNotBetween(Long value1, Long value2) {
            addCriterion("fixed_loss_type_second not between", value1, value2, "fixedLossTypeSecond");
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