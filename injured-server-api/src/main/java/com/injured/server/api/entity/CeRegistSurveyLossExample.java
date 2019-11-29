package com.injured.server.api.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CeRegistSurveyLossExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CeRegistSurveyLossExample() {
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

        public Criteria andLossNameIsNull() {
            addCriterion("loss_name is null");
            return (Criteria) this;
        }

        public Criteria andLossNameIsNotNull() {
            addCriterion("loss_name is not null");
            return (Criteria) this;
        }

        public Criteria andLossNameEqualTo(String value) {
            addCriterion("loss_name =", value, "lossName");
            return (Criteria) this;
        }

        public Criteria andLossNameNotEqualTo(String value) {
            addCriterion("loss_name <>", value, "lossName");
            return (Criteria) this;
        }

        public Criteria andLossNameGreaterThan(String value) {
            addCriterion("loss_name >", value, "lossName");
            return (Criteria) this;
        }

        public Criteria andLossNameGreaterThanOrEqualTo(String value) {
            addCriterion("loss_name >=", value, "lossName");
            return (Criteria) this;
        }

        public Criteria andLossNameLessThan(String value) {
            addCriterion("loss_name <", value, "lossName");
            return (Criteria) this;
        }

        public Criteria andLossNameLessThanOrEqualTo(String value) {
            addCriterion("loss_name <=", value, "lossName");
            return (Criteria) this;
        }

        public Criteria andLossNameLike(String value) {
            addCriterion("loss_name like", value, "lossName");
            return (Criteria) this;
        }

        public Criteria andLossNameNotLike(String value) {
            addCriterion("loss_name not like", value, "lossName");
            return (Criteria) this;
        }

        public Criteria andLossNameIn(List<String> values) {
            addCriterion("loss_name in", values, "lossName");
            return (Criteria) this;
        }

        public Criteria andLossNameNotIn(List<String> values) {
            addCriterion("loss_name not in", values, "lossName");
            return (Criteria) this;
        }

        public Criteria andLossNameBetween(String value1, String value2) {
            addCriterion("loss_name between", value1, value2, "lossName");
            return (Criteria) this;
        }

        public Criteria andLossNameNotBetween(String value1, String value2) {
            addCriterion("loss_name not between", value1, value2, "lossName");
            return (Criteria) this;
        }

        public Criteria andNewOldDegreeIsNull() {
            addCriterion("new_old_degree is null");
            return (Criteria) this;
        }

        public Criteria andNewOldDegreeIsNotNull() {
            addCriterion("new_old_degree is not null");
            return (Criteria) this;
        }

        public Criteria andNewOldDegreeEqualTo(String value) {
            addCriterion("new_old_degree =", value, "newOldDegree");
            return (Criteria) this;
        }

        public Criteria andNewOldDegreeNotEqualTo(String value) {
            addCriterion("new_old_degree <>", value, "newOldDegree");
            return (Criteria) this;
        }

        public Criteria andNewOldDegreeGreaterThan(String value) {
            addCriterion("new_old_degree >", value, "newOldDegree");
            return (Criteria) this;
        }

        public Criteria andNewOldDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("new_old_degree >=", value, "newOldDegree");
            return (Criteria) this;
        }

        public Criteria andNewOldDegreeLessThan(String value) {
            addCriterion("new_old_degree <", value, "newOldDegree");
            return (Criteria) this;
        }

        public Criteria andNewOldDegreeLessThanOrEqualTo(String value) {
            addCriterion("new_old_degree <=", value, "newOldDegree");
            return (Criteria) this;
        }

        public Criteria andNewOldDegreeLike(String value) {
            addCriterion("new_old_degree like", value, "newOldDegree");
            return (Criteria) this;
        }

        public Criteria andNewOldDegreeNotLike(String value) {
            addCriterion("new_old_degree not like", value, "newOldDegree");
            return (Criteria) this;
        }

        public Criteria andNewOldDegreeIn(List<String> values) {
            addCriterion("new_old_degree in", values, "newOldDegree");
            return (Criteria) this;
        }

        public Criteria andNewOldDegreeNotIn(List<String> values) {
            addCriterion("new_old_degree not in", values, "newOldDegree");
            return (Criteria) this;
        }

        public Criteria andNewOldDegreeBetween(String value1, String value2) {
            addCriterion("new_old_degree between", value1, value2, "newOldDegree");
            return (Criteria) this;
        }

        public Criteria andNewOldDegreeNotBetween(String value1, String value2) {
            addCriterion("new_old_degree not between", value1, value2, "newOldDegree");
            return (Criteria) this;
        }

        public Criteria andLossScopeIsNull() {
            addCriterion("loss_scope is null");
            return (Criteria) this;
        }

        public Criteria andLossScopeIsNotNull() {
            addCriterion("loss_scope is not null");
            return (Criteria) this;
        }

        public Criteria andLossScopeEqualTo(String value) {
            addCriterion("loss_scope =", value, "lossScope");
            return (Criteria) this;
        }

        public Criteria andLossScopeNotEqualTo(String value) {
            addCriterion("loss_scope <>", value, "lossScope");
            return (Criteria) this;
        }

        public Criteria andLossScopeGreaterThan(String value) {
            addCriterion("loss_scope >", value, "lossScope");
            return (Criteria) this;
        }

        public Criteria andLossScopeGreaterThanOrEqualTo(String value) {
            addCriterion("loss_scope >=", value, "lossScope");
            return (Criteria) this;
        }

        public Criteria andLossScopeLessThan(String value) {
            addCriterion("loss_scope <", value, "lossScope");
            return (Criteria) this;
        }

        public Criteria andLossScopeLessThanOrEqualTo(String value) {
            addCriterion("loss_scope <=", value, "lossScope");
            return (Criteria) this;
        }

        public Criteria andLossScopeLike(String value) {
            addCriterion("loss_scope like", value, "lossScope");
            return (Criteria) this;
        }

        public Criteria andLossScopeNotLike(String value) {
            addCriterion("loss_scope not like", value, "lossScope");
            return (Criteria) this;
        }

        public Criteria andLossScopeIn(List<String> values) {
            addCriterion("loss_scope in", values, "lossScope");
            return (Criteria) this;
        }

        public Criteria andLossScopeNotIn(List<String> values) {
            addCriterion("loss_scope not in", values, "lossScope");
            return (Criteria) this;
        }

        public Criteria andLossScopeBetween(String value1, String value2) {
            addCriterion("loss_scope between", value1, value2, "lossScope");
            return (Criteria) this;
        }

        public Criteria andLossScopeNotBetween(String value1, String value2) {
            addCriterion("loss_scope not between", value1, value2, "lossScope");
            return (Criteria) this;
        }

        public Criteria andLossDescIsNull() {
            addCriterion("loss_desc is null");
            return (Criteria) this;
        }

        public Criteria andLossDescIsNotNull() {
            addCriterion("loss_desc is not null");
            return (Criteria) this;
        }

        public Criteria andLossDescEqualTo(String value) {
            addCriterion("loss_desc =", value, "lossDesc");
            return (Criteria) this;
        }

        public Criteria andLossDescNotEqualTo(String value) {
            addCriterion("loss_desc <>", value, "lossDesc");
            return (Criteria) this;
        }

        public Criteria andLossDescGreaterThan(String value) {
            addCriterion("loss_desc >", value, "lossDesc");
            return (Criteria) this;
        }

        public Criteria andLossDescGreaterThanOrEqualTo(String value) {
            addCriterion("loss_desc >=", value, "lossDesc");
            return (Criteria) this;
        }

        public Criteria andLossDescLessThan(String value) {
            addCriterion("loss_desc <", value, "lossDesc");
            return (Criteria) this;
        }

        public Criteria andLossDescLessThanOrEqualTo(String value) {
            addCriterion("loss_desc <=", value, "lossDesc");
            return (Criteria) this;
        }

        public Criteria andLossDescLike(String value) {
            addCriterion("loss_desc like", value, "lossDesc");
            return (Criteria) this;
        }

        public Criteria andLossDescNotLike(String value) {
            addCriterion("loss_desc not like", value, "lossDesc");
            return (Criteria) this;
        }

        public Criteria andLossDescIn(List<String> values) {
            addCriterion("loss_desc in", values, "lossDesc");
            return (Criteria) this;
        }

        public Criteria andLossDescNotIn(List<String> values) {
            addCriterion("loss_desc not in", values, "lossDesc");
            return (Criteria) this;
        }

        public Criteria andLossDescBetween(String value1, String value2) {
            addCriterion("loss_desc between", value1, value2, "lossDesc");
            return (Criteria) this;
        }

        public Criteria andLossDescNotBetween(String value1, String value2) {
            addCriterion("loss_desc not between", value1, value2, "lossDesc");
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