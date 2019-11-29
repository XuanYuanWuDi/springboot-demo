package com.injured.server.api.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InjuredStaffOperatLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InjuredStaffOperatLogExample() {
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

        public Criteria andSubmitNoIsNull() {
            addCriterion("submit_no is null");
            return (Criteria) this;
        }

        public Criteria andSubmitNoIsNotNull() {
            addCriterion("submit_no is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitNoEqualTo(String value) {
            addCriterion("submit_no =", value, "submitNo");
            return (Criteria) this;
        }

        public Criteria andSubmitNoNotEqualTo(String value) {
            addCriterion("submit_no <>", value, "submitNo");
            return (Criteria) this;
        }

        public Criteria andSubmitNoGreaterThan(String value) {
            addCriterion("submit_no >", value, "submitNo");
            return (Criteria) this;
        }

        public Criteria andSubmitNoGreaterThanOrEqualTo(String value) {
            addCriterion("submit_no >=", value, "submitNo");
            return (Criteria) this;
        }

        public Criteria andSubmitNoLessThan(String value) {
            addCriterion("submit_no <", value, "submitNo");
            return (Criteria) this;
        }

        public Criteria andSubmitNoLessThanOrEqualTo(String value) {
            addCriterion("submit_no <=", value, "submitNo");
            return (Criteria) this;
        }

        public Criteria andSubmitNoLike(String value) {
            addCriterion("submit_no like", value, "submitNo");
            return (Criteria) this;
        }

        public Criteria andSubmitNoNotLike(String value) {
            addCriterion("submit_no not like", value, "submitNo");
            return (Criteria) this;
        }

        public Criteria andSubmitNoIn(List<String> values) {
            addCriterion("submit_no in", values, "submitNo");
            return (Criteria) this;
        }

        public Criteria andSubmitNoNotIn(List<String> values) {
            addCriterion("submit_no not in", values, "submitNo");
            return (Criteria) this;
        }

        public Criteria andSubmitNoBetween(String value1, String value2) {
            addCriterion("submit_no between", value1, value2, "submitNo");
            return (Criteria) this;
        }

        public Criteria andSubmitNoNotBetween(String value1, String value2) {
            addCriterion("submit_no not between", value1, value2, "submitNo");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNull() {
            addCriterion("submit_time is null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIsNotNull() {
            addCriterion("submit_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeEqualTo(Date value) {
            addCriterion("submit_time =", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotEqualTo(Date value) {
            addCriterion("submit_time <>", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThan(Date value) {
            addCriterion("submit_time >", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("submit_time >=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThan(Date value) {
            addCriterion("submit_time <", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeLessThanOrEqualTo(Date value) {
            addCriterion("submit_time <=", value, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeIn(List<Date> values) {
            addCriterion("submit_time in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotIn(List<Date> values) {
            addCriterion("submit_time not in", values, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeBetween(Date value1, Date value2) {
            addCriterion("submit_time between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitTimeNotBetween(Date value1, Date value2) {
            addCriterion("submit_time not between", value1, value2, "submitTime");
            return (Criteria) this;
        }

        public Criteria andSubmitOpinionIsNull() {
            addCriterion("submit_opinion is null");
            return (Criteria) this;
        }

        public Criteria andSubmitOpinionIsNotNull() {
            addCriterion("submit_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitOpinionEqualTo(String value) {
            addCriterion("submit_opinion =", value, "submitOpinion");
            return (Criteria) this;
        }

        public Criteria andSubmitOpinionNotEqualTo(String value) {
            addCriterion("submit_opinion <>", value, "submitOpinion");
            return (Criteria) this;
        }

        public Criteria andSubmitOpinionGreaterThan(String value) {
            addCriterion("submit_opinion >", value, "submitOpinion");
            return (Criteria) this;
        }

        public Criteria andSubmitOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("submit_opinion >=", value, "submitOpinion");
            return (Criteria) this;
        }

        public Criteria andSubmitOpinionLessThan(String value) {
            addCriterion("submit_opinion <", value, "submitOpinion");
            return (Criteria) this;
        }

        public Criteria andSubmitOpinionLessThanOrEqualTo(String value) {
            addCriterion("submit_opinion <=", value, "submitOpinion");
            return (Criteria) this;
        }

        public Criteria andSubmitOpinionLike(String value) {
            addCriterion("submit_opinion like", value, "submitOpinion");
            return (Criteria) this;
        }

        public Criteria andSubmitOpinionNotLike(String value) {
            addCriterion("submit_opinion not like", value, "submitOpinion");
            return (Criteria) this;
        }

        public Criteria andSubmitOpinionIn(List<String> values) {
            addCriterion("submit_opinion in", values, "submitOpinion");
            return (Criteria) this;
        }

        public Criteria andSubmitOpinionNotIn(List<String> values) {
            addCriterion("submit_opinion not in", values, "submitOpinion");
            return (Criteria) this;
        }

        public Criteria andSubmitOpinionBetween(String value1, String value2) {
            addCriterion("submit_opinion between", value1, value2, "submitOpinion");
            return (Criteria) this;
        }

        public Criteria andSubmitOpinionNotBetween(String value1, String value2) {
            addCriterion("submit_opinion not between", value1, value2, "submitOpinion");
            return (Criteria) this;
        }

        public Criteria andSubmitAmountIsNull() {
            addCriterion("submit_amount is null");
            return (Criteria) this;
        }

        public Criteria andSubmitAmountIsNotNull() {
            addCriterion("submit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitAmountEqualTo(BigDecimal value) {
            addCriterion("submit_amount =", value, "submitAmount");
            return (Criteria) this;
        }

        public Criteria andSubmitAmountNotEqualTo(BigDecimal value) {
            addCriterion("submit_amount <>", value, "submitAmount");
            return (Criteria) this;
        }

        public Criteria andSubmitAmountGreaterThan(BigDecimal value) {
            addCriterion("submit_amount >", value, "submitAmount");
            return (Criteria) this;
        }

        public Criteria andSubmitAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("submit_amount >=", value, "submitAmount");
            return (Criteria) this;
        }

        public Criteria andSubmitAmountLessThan(BigDecimal value) {
            addCriterion("submit_amount <", value, "submitAmount");
            return (Criteria) this;
        }

        public Criteria andSubmitAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("submit_amount <=", value, "submitAmount");
            return (Criteria) this;
        }

        public Criteria andSubmitAmountIn(List<BigDecimal> values) {
            addCriterion("submit_amount in", values, "submitAmount");
            return (Criteria) this;
        }

        public Criteria andSubmitAmountNotIn(List<BigDecimal> values) {
            addCriterion("submit_amount not in", values, "submitAmount");
            return (Criteria) this;
        }

        public Criteria andSubmitAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("submit_amount between", value1, value2, "submitAmount");
            return (Criteria) this;
        }

        public Criteria andSubmitAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("submit_amount not between", value1, value2, "submitAmount");
            return (Criteria) this;
        }

        public Criteria andOpinionDescIsNull() {
            addCriterion("opinion_desc is null");
            return (Criteria) this;
        }

        public Criteria andOpinionDescIsNotNull() {
            addCriterion("opinion_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOpinionDescEqualTo(String value) {
            addCriterion("opinion_desc =", value, "opinionDesc");
            return (Criteria) this;
        }

        public Criteria andOpinionDescNotEqualTo(String value) {
            addCriterion("opinion_desc <>", value, "opinionDesc");
            return (Criteria) this;
        }

        public Criteria andOpinionDescGreaterThan(String value) {
            addCriterion("opinion_desc >", value, "opinionDesc");
            return (Criteria) this;
        }

        public Criteria andOpinionDescGreaterThanOrEqualTo(String value) {
            addCriterion("opinion_desc >=", value, "opinionDesc");
            return (Criteria) this;
        }

        public Criteria andOpinionDescLessThan(String value) {
            addCriterion("opinion_desc <", value, "opinionDesc");
            return (Criteria) this;
        }

        public Criteria andOpinionDescLessThanOrEqualTo(String value) {
            addCriterion("opinion_desc <=", value, "opinionDesc");
            return (Criteria) this;
        }

        public Criteria andOpinionDescLike(String value) {
            addCriterion("opinion_desc like", value, "opinionDesc");
            return (Criteria) this;
        }

        public Criteria andOpinionDescNotLike(String value) {
            addCriterion("opinion_desc not like", value, "opinionDesc");
            return (Criteria) this;
        }

        public Criteria andOpinionDescIn(List<String> values) {
            addCriterion("opinion_desc in", values, "opinionDesc");
            return (Criteria) this;
        }

        public Criteria andOpinionDescNotIn(List<String> values) {
            addCriterion("opinion_desc not in", values, "opinionDesc");
            return (Criteria) this;
        }

        public Criteria andOpinionDescBetween(String value1, String value2) {
            addCriterion("opinion_desc between", value1, value2, "opinionDesc");
            return (Criteria) this;
        }

        public Criteria andOpinionDescNotBetween(String value1, String value2) {
            addCriterion("opinion_desc not between", value1, value2, "opinionDesc");
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

        public Criteria andSubmitTaskIsNull() {
            addCriterion("submit_task is null");
            return (Criteria) this;
        }

        public Criteria andSubmitTaskIsNotNull() {
            addCriterion("submit_task is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitTaskEqualTo(Integer value) {
            addCriterion("submit_task =", value, "submitTask");
            return (Criteria) this;
        }

        public Criteria andSubmitTaskNotEqualTo(Integer value) {
            addCriterion("submit_task <>", value, "submitTask");
            return (Criteria) this;
        }

        public Criteria andSubmitTaskGreaterThan(Integer value) {
            addCriterion("submit_task >", value, "submitTask");
            return (Criteria) this;
        }

        public Criteria andSubmitTaskGreaterThanOrEqualTo(Integer value) {
            addCriterion("submit_task >=", value, "submitTask");
            return (Criteria) this;
        }

        public Criteria andSubmitTaskLessThan(Integer value) {
            addCriterion("submit_task <", value, "submitTask");
            return (Criteria) this;
        }

        public Criteria andSubmitTaskLessThanOrEqualTo(Integer value) {
            addCriterion("submit_task <=", value, "submitTask");
            return (Criteria) this;
        }

        public Criteria andSubmitTaskIn(List<Integer> values) {
            addCriterion("submit_task in", values, "submitTask");
            return (Criteria) this;
        }

        public Criteria andSubmitTaskNotIn(List<Integer> values) {
            addCriterion("submit_task not in", values, "submitTask");
            return (Criteria) this;
        }

        public Criteria andSubmitTaskBetween(Integer value1, Integer value2) {
            addCriterion("submit_task between", value1, value2, "submitTask");
            return (Criteria) this;
        }

        public Criteria andSubmitTaskNotBetween(Integer value1, Integer value2) {
            addCriterion("submit_task not between", value1, value2, "submitTask");
            return (Criteria) this;
        }

        public Criteria andSubmitNameIsNull() {
            addCriterion("submit_name is null");
            return (Criteria) this;
        }

        public Criteria andSubmitNameIsNotNull() {
            addCriterion("submit_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitNameEqualTo(String value) {
            addCriterion("submit_name =", value, "submitName");
            return (Criteria) this;
        }

        public Criteria andSubmitNameNotEqualTo(String value) {
            addCriterion("submit_name <>", value, "submitName");
            return (Criteria) this;
        }

        public Criteria andSubmitNameGreaterThan(String value) {
            addCriterion("submit_name >", value, "submitName");
            return (Criteria) this;
        }

        public Criteria andSubmitNameGreaterThanOrEqualTo(String value) {
            addCriterion("submit_name >=", value, "submitName");
            return (Criteria) this;
        }

        public Criteria andSubmitNameLessThan(String value) {
            addCriterion("submit_name <", value, "submitName");
            return (Criteria) this;
        }

        public Criteria andSubmitNameLessThanOrEqualTo(String value) {
            addCriterion("submit_name <=", value, "submitName");
            return (Criteria) this;
        }

        public Criteria andSubmitNameLike(String value) {
            addCriterion("submit_name like", value, "submitName");
            return (Criteria) this;
        }

        public Criteria andSubmitNameNotLike(String value) {
            addCriterion("submit_name not like", value, "submitName");
            return (Criteria) this;
        }

        public Criteria andSubmitNameIn(List<String> values) {
            addCriterion("submit_name in", values, "submitName");
            return (Criteria) this;
        }

        public Criteria andSubmitNameNotIn(List<String> values) {
            addCriterion("submit_name not in", values, "submitName");
            return (Criteria) this;
        }

        public Criteria andSubmitNameBetween(String value1, String value2) {
            addCriterion("submit_name between", value1, value2, "submitName");
            return (Criteria) this;
        }

        public Criteria andSubmitNameNotBetween(String value1, String value2) {
            addCriterion("submit_name not between", value1, value2, "submitName");
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