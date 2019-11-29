package com.injured.server.api.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InjuredEstimatedLossInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InjuredEstimatedLossInfoExample() {
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

        public Criteria andEstimatedLossIdIsNull() {
            addCriterion("estimated_loss_id is null");
            return (Criteria) this;
        }

        public Criteria andEstimatedLossIdIsNotNull() {
            addCriterion("estimated_loss_id is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatedLossIdEqualTo(Long value) {
            addCriterion("estimated_loss_id =", value, "estimatedLossId");
            return (Criteria) this;
        }

        public Criteria andEstimatedLossIdNotEqualTo(Long value) {
            addCriterion("estimated_loss_id <>", value, "estimatedLossId");
            return (Criteria) this;
        }

        public Criteria andEstimatedLossIdGreaterThan(Long value) {
            addCriterion("estimated_loss_id >", value, "estimatedLossId");
            return (Criteria) this;
        }

        public Criteria andEstimatedLossIdGreaterThanOrEqualTo(Long value) {
            addCriterion("estimated_loss_id >=", value, "estimatedLossId");
            return (Criteria) this;
        }

        public Criteria andEstimatedLossIdLessThan(Long value) {
            addCriterion("estimated_loss_id <", value, "estimatedLossId");
            return (Criteria) this;
        }

        public Criteria andEstimatedLossIdLessThanOrEqualTo(Long value) {
            addCriterion("estimated_loss_id <=", value, "estimatedLossId");
            return (Criteria) this;
        }

        public Criteria andEstimatedLossIdIn(List<Long> values) {
            addCriterion("estimated_loss_id in", values, "estimatedLossId");
            return (Criteria) this;
        }

        public Criteria andEstimatedLossIdNotIn(List<Long> values) {
            addCriterion("estimated_loss_id not in", values, "estimatedLossId");
            return (Criteria) this;
        }

        public Criteria andEstimatedLossIdBetween(Long value1, Long value2) {
            addCriterion("estimated_loss_id between", value1, value2, "estimatedLossId");
            return (Criteria) this;
        }

        public Criteria andEstimatedLossIdNotBetween(Long value1, Long value2) {
            addCriterion("estimated_loss_id not between", value1, value2, "estimatedLossId");
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

        public Criteria andLossItemTypeIsNull() {
            addCriterion("loss_item_type is null");
            return (Criteria) this;
        }

        public Criteria andLossItemTypeIsNotNull() {
            addCriterion("loss_item_type is not null");
            return (Criteria) this;
        }

        public Criteria andLossItemTypeEqualTo(Long value) {
            addCriterion("loss_item_type =", value, "lossItemType");
            return (Criteria) this;
        }

        public Criteria andLossItemTypeNotEqualTo(Long value) {
            addCriterion("loss_item_type <>", value, "lossItemType");
            return (Criteria) this;
        }

        public Criteria andLossItemTypeGreaterThan(Long value) {
            addCriterion("loss_item_type >", value, "lossItemType");
            return (Criteria) this;
        }

        public Criteria andLossItemTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("loss_item_type >=", value, "lossItemType");
            return (Criteria) this;
        }

        public Criteria andLossItemTypeLessThan(Long value) {
            addCriterion("loss_item_type <", value, "lossItemType");
            return (Criteria) this;
        }

        public Criteria andLossItemTypeLessThanOrEqualTo(Long value) {
            addCriterion("loss_item_type <=", value, "lossItemType");
            return (Criteria) this;
        }

        public Criteria andLossItemTypeIn(List<Long> values) {
            addCriterion("loss_item_type in", values, "lossItemType");
            return (Criteria) this;
        }

        public Criteria andLossItemTypeNotIn(List<Long> values) {
            addCriterion("loss_item_type not in", values, "lossItemType");
            return (Criteria) this;
        }

        public Criteria andLossItemTypeBetween(Long value1, Long value2) {
            addCriterion("loss_item_type between", value1, value2, "lossItemType");
            return (Criteria) this;
        }

        public Criteria andLossItemTypeNotBetween(Long value1, Long value2) {
            addCriterion("loss_item_type not between", value1, value2, "lossItemType");
            return (Criteria) this;
        }

        public Criteria andEstimateAmountIsNull() {
            addCriterion("estimate_amount is null");
            return (Criteria) this;
        }

        public Criteria andEstimateAmountIsNotNull() {
            addCriterion("estimate_amount is not null");
            return (Criteria) this;
        }

        public Criteria andEstimateAmountEqualTo(BigDecimal value) {
            addCriterion("estimate_amount =", value, "estimateAmount");
            return (Criteria) this;
        }

        public Criteria andEstimateAmountNotEqualTo(BigDecimal value) {
            addCriterion("estimate_amount <>", value, "estimateAmount");
            return (Criteria) this;
        }

        public Criteria andEstimateAmountGreaterThan(BigDecimal value) {
            addCriterion("estimate_amount >", value, "estimateAmount");
            return (Criteria) this;
        }

        public Criteria andEstimateAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("estimate_amount >=", value, "estimateAmount");
            return (Criteria) this;
        }

        public Criteria andEstimateAmountLessThan(BigDecimal value) {
            addCriterion("estimate_amount <", value, "estimateAmount");
            return (Criteria) this;
        }

        public Criteria andEstimateAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("estimate_amount <=", value, "estimateAmount");
            return (Criteria) this;
        }

        public Criteria andEstimateAmountIn(List<BigDecimal> values) {
            addCriterion("estimate_amount in", values, "estimateAmount");
            return (Criteria) this;
        }

        public Criteria andEstimateAmountNotIn(List<BigDecimal> values) {
            addCriterion("estimate_amount not in", values, "estimateAmount");
            return (Criteria) this;
        }

        public Criteria andEstimateAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("estimate_amount between", value1, value2, "estimateAmount");
            return (Criteria) this;
        }

        public Criteria andEstimateAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("estimate_amount not between", value1, value2, "estimateAmount");
            return (Criteria) this;
        }

        public Criteria andMediationAmountIsNull() {
            addCriterion("mediation_amount is null");
            return (Criteria) this;
        }

        public Criteria andMediationAmountIsNotNull() {
            addCriterion("mediation_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMediationAmountEqualTo(BigDecimal value) {
            addCriterion("mediation_amount =", value, "mediationAmount");
            return (Criteria) this;
        }

        public Criteria andMediationAmountNotEqualTo(BigDecimal value) {
            addCriterion("mediation_amount <>", value, "mediationAmount");
            return (Criteria) this;
        }

        public Criteria andMediationAmountGreaterThan(BigDecimal value) {
            addCriterion("mediation_amount >", value, "mediationAmount");
            return (Criteria) this;
        }

        public Criteria andMediationAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mediation_amount >=", value, "mediationAmount");
            return (Criteria) this;
        }

        public Criteria andMediationAmountLessThan(BigDecimal value) {
            addCriterion("mediation_amount <", value, "mediationAmount");
            return (Criteria) this;
        }

        public Criteria andMediationAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mediation_amount <=", value, "mediationAmount");
            return (Criteria) this;
        }

        public Criteria andMediationAmountIn(List<BigDecimal> values) {
            addCriterion("mediation_amount in", values, "mediationAmount");
            return (Criteria) this;
        }

        public Criteria andMediationAmountNotIn(List<BigDecimal> values) {
            addCriterion("mediation_amount not in", values, "mediationAmount");
            return (Criteria) this;
        }

        public Criteria andMediationAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mediation_amount between", value1, value2, "mediationAmount");
            return (Criteria) this;
        }

        public Criteria andMediationAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mediation_amount not between", value1, value2, "mediationAmount");
            return (Criteria) this;
        }

        public Criteria andReviewAmountIsNull() {
            addCriterion("review_amount is null");
            return (Criteria) this;
        }

        public Criteria andReviewAmountIsNotNull() {
            addCriterion("review_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReviewAmountEqualTo(BigDecimal value) {
            addCriterion("review_amount =", value, "reviewAmount");
            return (Criteria) this;
        }

        public Criteria andReviewAmountNotEqualTo(BigDecimal value) {
            addCriterion("review_amount <>", value, "reviewAmount");
            return (Criteria) this;
        }

        public Criteria andReviewAmountGreaterThan(BigDecimal value) {
            addCriterion("review_amount >", value, "reviewAmount");
            return (Criteria) this;
        }

        public Criteria andReviewAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("review_amount >=", value, "reviewAmount");
            return (Criteria) this;
        }

        public Criteria andReviewAmountLessThan(BigDecimal value) {
            addCriterion("review_amount <", value, "reviewAmount");
            return (Criteria) this;
        }

        public Criteria andReviewAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("review_amount <=", value, "reviewAmount");
            return (Criteria) this;
        }

        public Criteria andReviewAmountIn(List<BigDecimal> values) {
            addCriterion("review_amount in", values, "reviewAmount");
            return (Criteria) this;
        }

        public Criteria andReviewAmountNotIn(List<BigDecimal> values) {
            addCriterion("review_amount not in", values, "reviewAmount");
            return (Criteria) this;
        }

        public Criteria andReviewAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("review_amount between", value1, value2, "reviewAmount");
            return (Criteria) this;
        }

        public Criteria andReviewAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("review_amount not between", value1, value2, "reviewAmount");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaIsNull() {
            addCriterion("calculation_formula is null");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaIsNotNull() {
            addCriterion("calculation_formula is not null");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaEqualTo(String value) {
            addCriterion("calculation_formula =", value, "calculationFormula");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaNotEqualTo(String value) {
            addCriterion("calculation_formula <>", value, "calculationFormula");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGreaterThan(String value) {
            addCriterion("calculation_formula >", value, "calculationFormula");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaGreaterThanOrEqualTo(String value) {
            addCriterion("calculation_formula >=", value, "calculationFormula");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaLessThan(String value) {
            addCriterion("calculation_formula <", value, "calculationFormula");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaLessThanOrEqualTo(String value) {
            addCriterion("calculation_formula <=", value, "calculationFormula");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaLike(String value) {
            addCriterion("calculation_formula like", value, "calculationFormula");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaNotLike(String value) {
            addCriterion("calculation_formula not like", value, "calculationFormula");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaIn(List<String> values) {
            addCriterion("calculation_formula in", values, "calculationFormula");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaNotIn(List<String> values) {
            addCriterion("calculation_formula not in", values, "calculationFormula");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaBetween(String value1, String value2) {
            addCriterion("calculation_formula between", value1, value2, "calculationFormula");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaNotBetween(String value1, String value2) {
            addCriterion("calculation_formula not between", value1, value2, "calculationFormula");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaIdIsNull() {
            addCriterion("calculation_formula_id is null");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaIdIsNotNull() {
            addCriterion("calculation_formula_id is not null");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaIdEqualTo(Long value) {
            addCriterion("calculation_formula_id =", value, "calculationFormulaId");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaIdNotEqualTo(Long value) {
            addCriterion("calculation_formula_id <>", value, "calculationFormulaId");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaIdGreaterThan(Long value) {
            addCriterion("calculation_formula_id >", value, "calculationFormulaId");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("calculation_formula_id >=", value, "calculationFormulaId");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaIdLessThan(Long value) {
            addCriterion("calculation_formula_id <", value, "calculationFormulaId");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaIdLessThanOrEqualTo(Long value) {
            addCriterion("calculation_formula_id <=", value, "calculationFormulaId");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaIdIn(List<Long> values) {
            addCriterion("calculation_formula_id in", values, "calculationFormulaId");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaIdNotIn(List<Long> values) {
            addCriterion("calculation_formula_id not in", values, "calculationFormulaId");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaIdBetween(Long value1, Long value2) {
            addCriterion("calculation_formula_id between", value1, value2, "calculationFormulaId");
            return (Criteria) this;
        }

        public Criteria andCalculationFormulaIdNotBetween(Long value1, Long value2) {
            addCriterion("calculation_formula_id not between", value1, value2, "calculationFormulaId");
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