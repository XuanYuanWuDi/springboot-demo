package com.injured.server.api.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CeRegistSurveyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CeRegistSurveyExample() {
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

        public Criteria andCeTaskNoIsNull() {
            addCriterion("ce_task_no is null");
            return (Criteria) this;
        }

        public Criteria andCeTaskNoIsNotNull() {
            addCriterion("ce_task_no is not null");
            return (Criteria) this;
        }

        public Criteria andCeTaskNoEqualTo(String value) {
            addCriterion("ce_task_no =", value, "ceTaskNo");
            return (Criteria) this;
        }

        public Criteria andCeTaskNoNotEqualTo(String value) {
            addCriterion("ce_task_no <>", value, "ceTaskNo");
            return (Criteria) this;
        }

        public Criteria andCeTaskNoGreaterThan(String value) {
            addCriterion("ce_task_no >", value, "ceTaskNo");
            return (Criteria) this;
        }

        public Criteria andCeTaskNoGreaterThanOrEqualTo(String value) {
            addCriterion("ce_task_no >=", value, "ceTaskNo");
            return (Criteria) this;
        }

        public Criteria andCeTaskNoLessThan(String value) {
            addCriterion("ce_task_no <", value, "ceTaskNo");
            return (Criteria) this;
        }

        public Criteria andCeTaskNoLessThanOrEqualTo(String value) {
            addCriterion("ce_task_no <=", value, "ceTaskNo");
            return (Criteria) this;
        }

        public Criteria andCeTaskNoLike(String value) {
            addCriterion("ce_task_no like", value, "ceTaskNo");
            return (Criteria) this;
        }

        public Criteria andCeTaskNoNotLike(String value) {
            addCriterion("ce_task_no not like", value, "ceTaskNo");
            return (Criteria) this;
        }

        public Criteria andCeTaskNoIn(List<String> values) {
            addCriterion("ce_task_no in", values, "ceTaskNo");
            return (Criteria) this;
        }

        public Criteria andCeTaskNoNotIn(List<String> values) {
            addCriterion("ce_task_no not in", values, "ceTaskNo");
            return (Criteria) this;
        }

        public Criteria andCeTaskNoBetween(String value1, String value2) {
            addCriterion("ce_task_no between", value1, value2, "ceTaskNo");
            return (Criteria) this;
        }

        public Criteria andCeTaskNoNotBetween(String value1, String value2) {
            addCriterion("ce_task_no not between", value1, value2, "ceTaskNo");
            return (Criteria) this;
        }

        public Criteria andCheckStartTimeIsNull() {
            addCriterion("check_start_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckStartTimeIsNotNull() {
            addCriterion("check_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStartTimeEqualTo(Date value) {
            addCriterion("check_start_time =", value, "checkStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckStartTimeNotEqualTo(Date value) {
            addCriterion("check_start_time <>", value, "checkStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckStartTimeGreaterThan(Date value) {
            addCriterion("check_start_time >", value, "checkStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("check_start_time >=", value, "checkStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckStartTimeLessThan(Date value) {
            addCriterion("check_start_time <", value, "checkStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("check_start_time <=", value, "checkStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckStartTimeIn(List<Date> values) {
            addCriterion("check_start_time in", values, "checkStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckStartTimeNotIn(List<Date> values) {
            addCriterion("check_start_time not in", values, "checkStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckStartTimeBetween(Date value1, Date value2) {
            addCriterion("check_start_time between", value1, value2, "checkStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("check_start_time not between", value1, value2, "checkStartTime");
            return (Criteria) this;
        }

        public Criteria andCheckEndTimeIsNull() {
            addCriterion("check_end_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckEndTimeIsNotNull() {
            addCriterion("check_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckEndTimeEqualTo(Date value) {
            addCriterion("check_end_time =", value, "checkEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckEndTimeNotEqualTo(Date value) {
            addCriterion("check_end_time <>", value, "checkEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckEndTimeGreaterThan(Date value) {
            addCriterion("check_end_time >", value, "checkEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("check_end_time >=", value, "checkEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckEndTimeLessThan(Date value) {
            addCriterion("check_end_time <", value, "checkEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("check_end_time <=", value, "checkEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckEndTimeIn(List<Date> values) {
            addCriterion("check_end_time in", values, "checkEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckEndTimeNotIn(List<Date> values) {
            addCriterion("check_end_time not in", values, "checkEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckEndTimeBetween(Date value1, Date value2) {
            addCriterion("check_end_time between", value1, value2, "checkEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("check_end_time not between", value1, value2, "checkEndTime");
            return (Criteria) this;
        }

        public Criteria andCheckAddrIsNull() {
            addCriterion("check_addr is null");
            return (Criteria) this;
        }

        public Criteria andCheckAddrIsNotNull() {
            addCriterion("check_addr is not null");
            return (Criteria) this;
        }

        public Criteria andCheckAddrEqualTo(String value) {
            addCriterion("check_addr =", value, "checkAddr");
            return (Criteria) this;
        }

        public Criteria andCheckAddrNotEqualTo(String value) {
            addCriterion("check_addr <>", value, "checkAddr");
            return (Criteria) this;
        }

        public Criteria andCheckAddrGreaterThan(String value) {
            addCriterion("check_addr >", value, "checkAddr");
            return (Criteria) this;
        }

        public Criteria andCheckAddrGreaterThanOrEqualTo(String value) {
            addCriterion("check_addr >=", value, "checkAddr");
            return (Criteria) this;
        }

        public Criteria andCheckAddrLessThan(String value) {
            addCriterion("check_addr <", value, "checkAddr");
            return (Criteria) this;
        }

        public Criteria andCheckAddrLessThanOrEqualTo(String value) {
            addCriterion("check_addr <=", value, "checkAddr");
            return (Criteria) this;
        }

        public Criteria andCheckAddrLike(String value) {
            addCriterion("check_addr like", value, "checkAddr");
            return (Criteria) this;
        }

        public Criteria andCheckAddrNotLike(String value) {
            addCriterion("check_addr not like", value, "checkAddr");
            return (Criteria) this;
        }

        public Criteria andCheckAddrIn(List<String> values) {
            addCriterion("check_addr in", values, "checkAddr");
            return (Criteria) this;
        }

        public Criteria andCheckAddrNotIn(List<String> values) {
            addCriterion("check_addr not in", values, "checkAddr");
            return (Criteria) this;
        }

        public Criteria andCheckAddrBetween(String value1, String value2) {
            addCriterion("check_addr between", value1, value2, "checkAddr");
            return (Criteria) this;
        }

        public Criteria andCheckAddrNotBetween(String value1, String value2) {
            addCriterion("check_addr not between", value1, value2, "checkAddr");
            return (Criteria) this;
        }

        public Criteria andAppointCheckAddrIsNull() {
            addCriterion("appoint_check_addr is null");
            return (Criteria) this;
        }

        public Criteria andAppointCheckAddrIsNotNull() {
            addCriterion("appoint_check_addr is not null");
            return (Criteria) this;
        }

        public Criteria andAppointCheckAddrEqualTo(String value) {
            addCriterion("appoint_check_addr =", value, "appointCheckAddr");
            return (Criteria) this;
        }

        public Criteria andAppointCheckAddrNotEqualTo(String value) {
            addCriterion("appoint_check_addr <>", value, "appointCheckAddr");
            return (Criteria) this;
        }

        public Criteria andAppointCheckAddrGreaterThan(String value) {
            addCriterion("appoint_check_addr >", value, "appointCheckAddr");
            return (Criteria) this;
        }

        public Criteria andAppointCheckAddrGreaterThanOrEqualTo(String value) {
            addCriterion("appoint_check_addr >=", value, "appointCheckAddr");
            return (Criteria) this;
        }

        public Criteria andAppointCheckAddrLessThan(String value) {
            addCriterion("appoint_check_addr <", value, "appointCheckAddr");
            return (Criteria) this;
        }

        public Criteria andAppointCheckAddrLessThanOrEqualTo(String value) {
            addCriterion("appoint_check_addr <=", value, "appointCheckAddr");
            return (Criteria) this;
        }

        public Criteria andAppointCheckAddrLike(String value) {
            addCriterion("appoint_check_addr like", value, "appointCheckAddr");
            return (Criteria) this;
        }

        public Criteria andAppointCheckAddrNotLike(String value) {
            addCriterion("appoint_check_addr not like", value, "appointCheckAddr");
            return (Criteria) this;
        }

        public Criteria andAppointCheckAddrIn(List<String> values) {
            addCriterion("appoint_check_addr in", values, "appointCheckAddr");
            return (Criteria) this;
        }

        public Criteria andAppointCheckAddrNotIn(List<String> values) {
            addCriterion("appoint_check_addr not in", values, "appointCheckAddr");
            return (Criteria) this;
        }

        public Criteria andAppointCheckAddrBetween(String value1, String value2) {
            addCriterion("appoint_check_addr between", value1, value2, "appointCheckAddr");
            return (Criteria) this;
        }

        public Criteria andAppointCheckAddrNotBetween(String value1, String value2) {
            addCriterion("appoint_check_addr not between", value1, value2, "appointCheckAddr");
            return (Criteria) this;
        }

        public Criteria andLossTaskIsNull() {
            addCriterion("loss_task is null");
            return (Criteria) this;
        }

        public Criteria andLossTaskIsNotNull() {
            addCriterion("loss_task is not null");
            return (Criteria) this;
        }

        public Criteria andLossTaskEqualTo(String value) {
            addCriterion("loss_task =", value, "lossTask");
            return (Criteria) this;
        }

        public Criteria andLossTaskNotEqualTo(String value) {
            addCriterion("loss_task <>", value, "lossTask");
            return (Criteria) this;
        }

        public Criteria andLossTaskGreaterThan(String value) {
            addCriterion("loss_task >", value, "lossTask");
            return (Criteria) this;
        }

        public Criteria andLossTaskGreaterThanOrEqualTo(String value) {
            addCriterion("loss_task >=", value, "lossTask");
            return (Criteria) this;
        }

        public Criteria andLossTaskLessThan(String value) {
            addCriterion("loss_task <", value, "lossTask");
            return (Criteria) this;
        }

        public Criteria andLossTaskLessThanOrEqualTo(String value) {
            addCriterion("loss_task <=", value, "lossTask");
            return (Criteria) this;
        }

        public Criteria andLossTaskLike(String value) {
            addCriterion("loss_task like", value, "lossTask");
            return (Criteria) this;
        }

        public Criteria andLossTaskNotLike(String value) {
            addCriterion("loss_task not like", value, "lossTask");
            return (Criteria) this;
        }

        public Criteria andLossTaskIn(List<String> values) {
            addCriterion("loss_task in", values, "lossTask");
            return (Criteria) this;
        }

        public Criteria andLossTaskNotIn(List<String> values) {
            addCriterion("loss_task not in", values, "lossTask");
            return (Criteria) this;
        }

        public Criteria andLossTaskBetween(String value1, String value2) {
            addCriterion("loss_task between", value1, value2, "lossTask");
            return (Criteria) this;
        }

        public Criteria andLossTaskNotBetween(String value1, String value2) {
            addCriterion("loss_task not between", value1, value2, "lossTask");
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

        public Criteria andIsAppointDriverIsNull() {
            addCriterion("is_appoint_driver is null");
            return (Criteria) this;
        }

        public Criteria andIsAppointDriverIsNotNull() {
            addCriterion("is_appoint_driver is not null");
            return (Criteria) this;
        }

        public Criteria andIsAppointDriverEqualTo(String value) {
            addCriterion("is_appoint_driver =", value, "isAppointDriver");
            return (Criteria) this;
        }

        public Criteria andIsAppointDriverNotEqualTo(String value) {
            addCriterion("is_appoint_driver <>", value, "isAppointDriver");
            return (Criteria) this;
        }

        public Criteria andIsAppointDriverGreaterThan(String value) {
            addCriterion("is_appoint_driver >", value, "isAppointDriver");
            return (Criteria) this;
        }

        public Criteria andIsAppointDriverGreaterThanOrEqualTo(String value) {
            addCriterion("is_appoint_driver >=", value, "isAppointDriver");
            return (Criteria) this;
        }

        public Criteria andIsAppointDriverLessThan(String value) {
            addCriterion("is_appoint_driver <", value, "isAppointDriver");
            return (Criteria) this;
        }

        public Criteria andIsAppointDriverLessThanOrEqualTo(String value) {
            addCriterion("is_appoint_driver <=", value, "isAppointDriver");
            return (Criteria) this;
        }

        public Criteria andIsAppointDriverLike(String value) {
            addCriterion("is_appoint_driver like", value, "isAppointDriver");
            return (Criteria) this;
        }

        public Criteria andIsAppointDriverNotLike(String value) {
            addCriterion("is_appoint_driver not like", value, "isAppointDriver");
            return (Criteria) this;
        }

        public Criteria andIsAppointDriverIn(List<String> values) {
            addCriterion("is_appoint_driver in", values, "isAppointDriver");
            return (Criteria) this;
        }

        public Criteria andIsAppointDriverNotIn(List<String> values) {
            addCriterion("is_appoint_driver not in", values, "isAppointDriver");
            return (Criteria) this;
        }

        public Criteria andIsAppointDriverBetween(String value1, String value2) {
            addCriterion("is_appoint_driver between", value1, value2, "isAppointDriver");
            return (Criteria) this;
        }

        public Criteria andIsAppointDriverNotBetween(String value1, String value2) {
            addCriterion("is_appoint_driver not between", value1, value2, "isAppointDriver");
            return (Criteria) this;
        }

        public Criteria andCheckerNameIsNull() {
            addCriterion("checker_name is null");
            return (Criteria) this;
        }

        public Criteria andCheckerNameIsNotNull() {
            addCriterion("checker_name is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerNameEqualTo(String value) {
            addCriterion("checker_name =", value, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameNotEqualTo(String value) {
            addCriterion("checker_name <>", value, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameGreaterThan(String value) {
            addCriterion("checker_name >", value, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameGreaterThanOrEqualTo(String value) {
            addCriterion("checker_name >=", value, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameLessThan(String value) {
            addCriterion("checker_name <", value, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameLessThanOrEqualTo(String value) {
            addCriterion("checker_name <=", value, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameLike(String value) {
            addCriterion("checker_name like", value, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameNotLike(String value) {
            addCriterion("checker_name not like", value, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameIn(List<String> values) {
            addCriterion("checker_name in", values, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameNotIn(List<String> values) {
            addCriterion("checker_name not in", values, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameBetween(String value1, String value2) {
            addCriterion("checker_name between", value1, value2, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerNameNotBetween(String value1, String value2) {
            addCriterion("checker_name not between", value1, value2, "checkerName");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeIsNull() {
            addCriterion("checker_code is null");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeIsNotNull() {
            addCriterion("checker_code is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeEqualTo(String value) {
            addCriterion("checker_code =", value, "checkerCode");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeNotEqualTo(String value) {
            addCriterion("checker_code <>", value, "checkerCode");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeGreaterThan(String value) {
            addCriterion("checker_code >", value, "checkerCode");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("checker_code >=", value, "checkerCode");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeLessThan(String value) {
            addCriterion("checker_code <", value, "checkerCode");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeLessThanOrEqualTo(String value) {
            addCriterion("checker_code <=", value, "checkerCode");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeLike(String value) {
            addCriterion("checker_code like", value, "checkerCode");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeNotLike(String value) {
            addCriterion("checker_code not like", value, "checkerCode");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeIn(List<String> values) {
            addCriterion("checker_code in", values, "checkerCode");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeNotIn(List<String> values) {
            addCriterion("checker_code not in", values, "checkerCode");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeBetween(String value1, String value2) {
            addCriterion("checker_code between", value1, value2, "checkerCode");
            return (Criteria) this;
        }

        public Criteria andCheckerCodeNotBetween(String value1, String value2) {
            addCriterion("checker_code not between", value1, value2, "checkerCode");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone1IsNull() {
            addCriterion("checker_phone1 is null");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone1IsNotNull() {
            addCriterion("checker_phone1 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone1EqualTo(String value) {
            addCriterion("checker_phone1 =", value, "checkerPhone1");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone1NotEqualTo(String value) {
            addCriterion("checker_phone1 <>", value, "checkerPhone1");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone1GreaterThan(String value) {
            addCriterion("checker_phone1 >", value, "checkerPhone1");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone1GreaterThanOrEqualTo(String value) {
            addCriterion("checker_phone1 >=", value, "checkerPhone1");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone1LessThan(String value) {
            addCriterion("checker_phone1 <", value, "checkerPhone1");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone1LessThanOrEqualTo(String value) {
            addCriterion("checker_phone1 <=", value, "checkerPhone1");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone1Like(String value) {
            addCriterion("checker_phone1 like", value, "checkerPhone1");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone1NotLike(String value) {
            addCriterion("checker_phone1 not like", value, "checkerPhone1");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone1In(List<String> values) {
            addCriterion("checker_phone1 in", values, "checkerPhone1");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone1NotIn(List<String> values) {
            addCriterion("checker_phone1 not in", values, "checkerPhone1");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone1Between(String value1, String value2) {
            addCriterion("checker_phone1 between", value1, value2, "checkerPhone1");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone1NotBetween(String value1, String value2) {
            addCriterion("checker_phone1 not between", value1, value2, "checkerPhone1");
            return (Criteria) this;
        }

        public Criteria andCheckerName2IsNull() {
            addCriterion("checker_name2 is null");
            return (Criteria) this;
        }

        public Criteria andCheckerName2IsNotNull() {
            addCriterion("checker_name2 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerName2EqualTo(String value) {
            addCriterion("checker_name2 =", value, "checkerName2");
            return (Criteria) this;
        }

        public Criteria andCheckerName2NotEqualTo(String value) {
            addCriterion("checker_name2 <>", value, "checkerName2");
            return (Criteria) this;
        }

        public Criteria andCheckerName2GreaterThan(String value) {
            addCriterion("checker_name2 >", value, "checkerName2");
            return (Criteria) this;
        }

        public Criteria andCheckerName2GreaterThanOrEqualTo(String value) {
            addCriterion("checker_name2 >=", value, "checkerName2");
            return (Criteria) this;
        }

        public Criteria andCheckerName2LessThan(String value) {
            addCriterion("checker_name2 <", value, "checkerName2");
            return (Criteria) this;
        }

        public Criteria andCheckerName2LessThanOrEqualTo(String value) {
            addCriterion("checker_name2 <=", value, "checkerName2");
            return (Criteria) this;
        }

        public Criteria andCheckerName2Like(String value) {
            addCriterion("checker_name2 like", value, "checkerName2");
            return (Criteria) this;
        }

        public Criteria andCheckerName2NotLike(String value) {
            addCriterion("checker_name2 not like", value, "checkerName2");
            return (Criteria) this;
        }

        public Criteria andCheckerName2In(List<String> values) {
            addCriterion("checker_name2 in", values, "checkerName2");
            return (Criteria) this;
        }

        public Criteria andCheckerName2NotIn(List<String> values) {
            addCriterion("checker_name2 not in", values, "checkerName2");
            return (Criteria) this;
        }

        public Criteria andCheckerName2Between(String value1, String value2) {
            addCriterion("checker_name2 between", value1, value2, "checkerName2");
            return (Criteria) this;
        }

        public Criteria andCheckerName2NotBetween(String value1, String value2) {
            addCriterion("checker_name2 not between", value1, value2, "checkerName2");
            return (Criteria) this;
        }

        public Criteria andCheckerCode2IsNull() {
            addCriterion("checker_code2 is null");
            return (Criteria) this;
        }

        public Criteria andCheckerCode2IsNotNull() {
            addCriterion("checker_code2 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerCode2EqualTo(String value) {
            addCriterion("checker_code2 =", value, "checkerCode2");
            return (Criteria) this;
        }

        public Criteria andCheckerCode2NotEqualTo(String value) {
            addCriterion("checker_code2 <>", value, "checkerCode2");
            return (Criteria) this;
        }

        public Criteria andCheckerCode2GreaterThan(String value) {
            addCriterion("checker_code2 >", value, "checkerCode2");
            return (Criteria) this;
        }

        public Criteria andCheckerCode2GreaterThanOrEqualTo(String value) {
            addCriterion("checker_code2 >=", value, "checkerCode2");
            return (Criteria) this;
        }

        public Criteria andCheckerCode2LessThan(String value) {
            addCriterion("checker_code2 <", value, "checkerCode2");
            return (Criteria) this;
        }

        public Criteria andCheckerCode2LessThanOrEqualTo(String value) {
            addCriterion("checker_code2 <=", value, "checkerCode2");
            return (Criteria) this;
        }

        public Criteria andCheckerCode2Like(String value) {
            addCriterion("checker_code2 like", value, "checkerCode2");
            return (Criteria) this;
        }

        public Criteria andCheckerCode2NotLike(String value) {
            addCriterion("checker_code2 not like", value, "checkerCode2");
            return (Criteria) this;
        }

        public Criteria andCheckerCode2In(List<String> values) {
            addCriterion("checker_code2 in", values, "checkerCode2");
            return (Criteria) this;
        }

        public Criteria andCheckerCode2NotIn(List<String> values) {
            addCriterion("checker_code2 not in", values, "checkerCode2");
            return (Criteria) this;
        }

        public Criteria andCheckerCode2Between(String value1, String value2) {
            addCriterion("checker_code2 between", value1, value2, "checkerCode2");
            return (Criteria) this;
        }

        public Criteria andCheckerCode2NotBetween(String value1, String value2) {
            addCriterion("checker_code2 not between", value1, value2, "checkerCode2");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone2IsNull() {
            addCriterion("checker_phone2 is null");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone2IsNotNull() {
            addCriterion("checker_phone2 is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone2EqualTo(String value) {
            addCriterion("checker_phone2 =", value, "checkerPhone2");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone2NotEqualTo(String value) {
            addCriterion("checker_phone2 <>", value, "checkerPhone2");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone2GreaterThan(String value) {
            addCriterion("checker_phone2 >", value, "checkerPhone2");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone2GreaterThanOrEqualTo(String value) {
            addCriterion("checker_phone2 >=", value, "checkerPhone2");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone2LessThan(String value) {
            addCriterion("checker_phone2 <", value, "checkerPhone2");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone2LessThanOrEqualTo(String value) {
            addCriterion("checker_phone2 <=", value, "checkerPhone2");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone2Like(String value) {
            addCriterion("checker_phone2 like", value, "checkerPhone2");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone2NotLike(String value) {
            addCriterion("checker_phone2 not like", value, "checkerPhone2");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone2In(List<String> values) {
            addCriterion("checker_phone2 in", values, "checkerPhone2");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone2NotIn(List<String> values) {
            addCriterion("checker_phone2 not in", values, "checkerPhone2");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone2Between(String value1, String value2) {
            addCriterion("checker_phone2 between", value1, value2, "checkerPhone2");
            return (Criteria) this;
        }

        public Criteria andCheckerPhone2NotBetween(String value1, String value2) {
            addCriterion("checker_phone2 not between", value1, value2, "checkerPhone2");
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

        public Criteria andEventTypeIsNull() {
            addCriterion("event_type is null");
            return (Criteria) this;
        }

        public Criteria andEventTypeIsNotNull() {
            addCriterion("event_type is not null");
            return (Criteria) this;
        }

        public Criteria andEventTypeEqualTo(String value) {
            addCriterion("event_type =", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotEqualTo(String value) {
            addCriterion("event_type <>", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeGreaterThan(String value) {
            addCriterion("event_type >", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeGreaterThanOrEqualTo(String value) {
            addCriterion("event_type >=", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLessThan(String value) {
            addCriterion("event_type <", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLessThanOrEqualTo(String value) {
            addCriterion("event_type <=", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLike(String value) {
            addCriterion("event_type like", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotLike(String value) {
            addCriterion("event_type not like", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeIn(List<String> values) {
            addCriterion("event_type in", values, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotIn(List<String> values) {
            addCriterion("event_type not in", values, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeBetween(String value1, String value2) {
            addCriterion("event_type between", value1, value2, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotBetween(String value1, String value2) {
            addCriterion("event_type not between", value1, value2, "eventType");
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

        public Criteria andEventAccidentLiabilityIsNull() {
            addCriterion("event_accident_liability is null");
            return (Criteria) this;
        }

        public Criteria andEventAccidentLiabilityIsNotNull() {
            addCriterion("event_accident_liability is not null");
            return (Criteria) this;
        }

        public Criteria andEventAccidentLiabilityEqualTo(String value) {
            addCriterion("event_accident_liability =", value, "eventAccidentLiability");
            return (Criteria) this;
        }

        public Criteria andEventAccidentLiabilityNotEqualTo(String value) {
            addCriterion("event_accident_liability <>", value, "eventAccidentLiability");
            return (Criteria) this;
        }

        public Criteria andEventAccidentLiabilityGreaterThan(String value) {
            addCriterion("event_accident_liability >", value, "eventAccidentLiability");
            return (Criteria) this;
        }

        public Criteria andEventAccidentLiabilityGreaterThanOrEqualTo(String value) {
            addCriterion("event_accident_liability >=", value, "eventAccidentLiability");
            return (Criteria) this;
        }

        public Criteria andEventAccidentLiabilityLessThan(String value) {
            addCriterion("event_accident_liability <", value, "eventAccidentLiability");
            return (Criteria) this;
        }

        public Criteria andEventAccidentLiabilityLessThanOrEqualTo(String value) {
            addCriterion("event_accident_liability <=", value, "eventAccidentLiability");
            return (Criteria) this;
        }

        public Criteria andEventAccidentLiabilityLike(String value) {
            addCriterion("event_accident_liability like", value, "eventAccidentLiability");
            return (Criteria) this;
        }

        public Criteria andEventAccidentLiabilityNotLike(String value) {
            addCriterion("event_accident_liability not like", value, "eventAccidentLiability");
            return (Criteria) this;
        }

        public Criteria andEventAccidentLiabilityIn(List<String> values) {
            addCriterion("event_accident_liability in", values, "eventAccidentLiability");
            return (Criteria) this;
        }

        public Criteria andEventAccidentLiabilityNotIn(List<String> values) {
            addCriterion("event_accident_liability not in", values, "eventAccidentLiability");
            return (Criteria) this;
        }

        public Criteria andEventAccidentLiabilityBetween(String value1, String value2) {
            addCriterion("event_accident_liability between", value1, value2, "eventAccidentLiability");
            return (Criteria) this;
        }

        public Criteria andEventAccidentLiabilityNotBetween(String value1, String value2) {
            addCriterion("event_accident_liability not between", value1, value2, "eventAccidentLiability");
            return (Criteria) this;
        }

        public Criteria andEventDutyRatioIsNull() {
            addCriterion("event_duty_ratio is null");
            return (Criteria) this;
        }

        public Criteria andEventDutyRatioIsNotNull() {
            addCriterion("event_duty_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andEventDutyRatioEqualTo(BigDecimal value) {
            addCriterion("event_duty_ratio =", value, "eventDutyRatio");
            return (Criteria) this;
        }

        public Criteria andEventDutyRatioNotEqualTo(BigDecimal value) {
            addCriterion("event_duty_ratio <>", value, "eventDutyRatio");
            return (Criteria) this;
        }

        public Criteria andEventDutyRatioGreaterThan(BigDecimal value) {
            addCriterion("event_duty_ratio >", value, "eventDutyRatio");
            return (Criteria) this;
        }

        public Criteria andEventDutyRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("event_duty_ratio >=", value, "eventDutyRatio");
            return (Criteria) this;
        }

        public Criteria andEventDutyRatioLessThan(BigDecimal value) {
            addCriterion("event_duty_ratio <", value, "eventDutyRatio");
            return (Criteria) this;
        }

        public Criteria andEventDutyRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("event_duty_ratio <=", value, "eventDutyRatio");
            return (Criteria) this;
        }

        public Criteria andEventDutyRatioIn(List<BigDecimal> values) {
            addCriterion("event_duty_ratio in", values, "eventDutyRatio");
            return (Criteria) this;
        }

        public Criteria andEventDutyRatioNotIn(List<BigDecimal> values) {
            addCriterion("event_duty_ratio not in", values, "eventDutyRatio");
            return (Criteria) this;
        }

        public Criteria andEventDutyRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("event_duty_ratio between", value1, value2, "eventDutyRatio");
            return (Criteria) this;
        }

        public Criteria andEventDutyRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("event_duty_ratio not between", value1, value2, "eventDutyRatio");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationIsNull() {
            addCriterion("insured_relation is null");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationIsNotNull() {
            addCriterion("insured_relation is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationEqualTo(String value) {
            addCriterion("insured_relation =", value, "insuredRelation");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationNotEqualTo(String value) {
            addCriterion("insured_relation <>", value, "insuredRelation");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationGreaterThan(String value) {
            addCriterion("insured_relation >", value, "insuredRelation");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationGreaterThanOrEqualTo(String value) {
            addCriterion("insured_relation >=", value, "insuredRelation");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationLessThan(String value) {
            addCriterion("insured_relation <", value, "insuredRelation");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationLessThanOrEqualTo(String value) {
            addCriterion("insured_relation <=", value, "insuredRelation");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationLike(String value) {
            addCriterion("insured_relation like", value, "insuredRelation");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationNotLike(String value) {
            addCriterion("insured_relation not like", value, "insuredRelation");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationIn(List<String> values) {
            addCriterion("insured_relation in", values, "insuredRelation");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationNotIn(List<String> values) {
            addCriterion("insured_relation not in", values, "insuredRelation");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationBetween(String value1, String value2) {
            addCriterion("insured_relation between", value1, value2, "insuredRelation");
            return (Criteria) this;
        }

        public Criteria andInsuredRelationNotBetween(String value1, String value2) {
            addCriterion("insured_relation not between", value1, value2, "insuredRelation");
            return (Criteria) this;
        }

        public Criteria andNoFaultCompensateIsNull() {
            addCriterion("no_fault_compensate is null");
            return (Criteria) this;
        }

        public Criteria andNoFaultCompensateIsNotNull() {
            addCriterion("no_fault_compensate is not null");
            return (Criteria) this;
        }

        public Criteria andNoFaultCompensateEqualTo(String value) {
            addCriterion("no_fault_compensate =", value, "noFaultCompensate");
            return (Criteria) this;
        }

        public Criteria andNoFaultCompensateNotEqualTo(String value) {
            addCriterion("no_fault_compensate <>", value, "noFaultCompensate");
            return (Criteria) this;
        }

        public Criteria andNoFaultCompensateGreaterThan(String value) {
            addCriterion("no_fault_compensate >", value, "noFaultCompensate");
            return (Criteria) this;
        }

        public Criteria andNoFaultCompensateGreaterThanOrEqualTo(String value) {
            addCriterion("no_fault_compensate >=", value, "noFaultCompensate");
            return (Criteria) this;
        }

        public Criteria andNoFaultCompensateLessThan(String value) {
            addCriterion("no_fault_compensate <", value, "noFaultCompensate");
            return (Criteria) this;
        }

        public Criteria andNoFaultCompensateLessThanOrEqualTo(String value) {
            addCriterion("no_fault_compensate <=", value, "noFaultCompensate");
            return (Criteria) this;
        }

        public Criteria andNoFaultCompensateLike(String value) {
            addCriterion("no_fault_compensate like", value, "noFaultCompensate");
            return (Criteria) this;
        }

        public Criteria andNoFaultCompensateNotLike(String value) {
            addCriterion("no_fault_compensate not like", value, "noFaultCompensate");
            return (Criteria) this;
        }

        public Criteria andNoFaultCompensateIn(List<String> values) {
            addCriterion("no_fault_compensate in", values, "noFaultCompensate");
            return (Criteria) this;
        }

        public Criteria andNoFaultCompensateNotIn(List<String> values) {
            addCriterion("no_fault_compensate not in", values, "noFaultCompensate");
            return (Criteria) this;
        }

        public Criteria andNoFaultCompensateBetween(String value1, String value2) {
            addCriterion("no_fault_compensate between", value1, value2, "noFaultCompensate");
            return (Criteria) this;
        }

        public Criteria andNoFaultCompensateNotBetween(String value1, String value2) {
            addCriterion("no_fault_compensate not between", value1, value2, "noFaultCompensate");
            return (Criteria) this;
        }

        public Criteria andWaterLevelIsNull() {
            addCriterion("water_level is null");
            return (Criteria) this;
        }

        public Criteria andWaterLevelIsNotNull() {
            addCriterion("water_level is not null");
            return (Criteria) this;
        }

        public Criteria andWaterLevelEqualTo(String value) {
            addCriterion("water_level =", value, "waterLevel");
            return (Criteria) this;
        }

        public Criteria andWaterLevelNotEqualTo(String value) {
            addCriterion("water_level <>", value, "waterLevel");
            return (Criteria) this;
        }

        public Criteria andWaterLevelGreaterThan(String value) {
            addCriterion("water_level >", value, "waterLevel");
            return (Criteria) this;
        }

        public Criteria andWaterLevelGreaterThanOrEqualTo(String value) {
            addCriterion("water_level >=", value, "waterLevel");
            return (Criteria) this;
        }

        public Criteria andWaterLevelLessThan(String value) {
            addCriterion("water_level <", value, "waterLevel");
            return (Criteria) this;
        }

        public Criteria andWaterLevelLessThanOrEqualTo(String value) {
            addCriterion("water_level <=", value, "waterLevel");
            return (Criteria) this;
        }

        public Criteria andWaterLevelLike(String value) {
            addCriterion("water_level like", value, "waterLevel");
            return (Criteria) this;
        }

        public Criteria andWaterLevelNotLike(String value) {
            addCriterion("water_level not like", value, "waterLevel");
            return (Criteria) this;
        }

        public Criteria andWaterLevelIn(List<String> values) {
            addCriterion("water_level in", values, "waterLevel");
            return (Criteria) this;
        }

        public Criteria andWaterLevelNotIn(List<String> values) {
            addCriterion("water_level not in", values, "waterLevel");
            return (Criteria) this;
        }

        public Criteria andWaterLevelBetween(String value1, String value2) {
            addCriterion("water_level between", value1, value2, "waterLevel");
            return (Criteria) this;
        }

        public Criteria andWaterLevelNotBetween(String value1, String value2) {
            addCriterion("water_level not between", value1, value2, "waterLevel");
            return (Criteria) this;
        }

        public Criteria andFallVictimDriverIsNull() {
            addCriterion("fall_victim_driver is null");
            return (Criteria) this;
        }

        public Criteria andFallVictimDriverIsNotNull() {
            addCriterion("fall_victim_driver is not null");
            return (Criteria) this;
        }

        public Criteria andFallVictimDriverEqualTo(String value) {
            addCriterion("fall_victim_driver =", value, "fallVictimDriver");
            return (Criteria) this;
        }

        public Criteria andFallVictimDriverNotEqualTo(String value) {
            addCriterion("fall_victim_driver <>", value, "fallVictimDriver");
            return (Criteria) this;
        }

        public Criteria andFallVictimDriverGreaterThan(String value) {
            addCriterion("fall_victim_driver >", value, "fallVictimDriver");
            return (Criteria) this;
        }

        public Criteria andFallVictimDriverGreaterThanOrEqualTo(String value) {
            addCriterion("fall_victim_driver >=", value, "fallVictimDriver");
            return (Criteria) this;
        }

        public Criteria andFallVictimDriverLessThan(String value) {
            addCriterion("fall_victim_driver <", value, "fallVictimDriver");
            return (Criteria) this;
        }

        public Criteria andFallVictimDriverLessThanOrEqualTo(String value) {
            addCriterion("fall_victim_driver <=", value, "fallVictimDriver");
            return (Criteria) this;
        }

        public Criteria andFallVictimDriverLike(String value) {
            addCriterion("fall_victim_driver like", value, "fallVictimDriver");
            return (Criteria) this;
        }

        public Criteria andFallVictimDriverNotLike(String value) {
            addCriterion("fall_victim_driver not like", value, "fallVictimDriver");
            return (Criteria) this;
        }

        public Criteria andFallVictimDriverIn(List<String> values) {
            addCriterion("fall_victim_driver in", values, "fallVictimDriver");
            return (Criteria) this;
        }

        public Criteria andFallVictimDriverNotIn(List<String> values) {
            addCriterion("fall_victim_driver not in", values, "fallVictimDriver");
            return (Criteria) this;
        }

        public Criteria andFallVictimDriverBetween(String value1, String value2) {
            addCriterion("fall_victim_driver between", value1, value2, "fallVictimDriver");
            return (Criteria) this;
        }

        public Criteria andFallVictimDriverNotBetween(String value1, String value2) {
            addCriterion("fall_victim_driver not between", value1, value2, "fallVictimDriver");
            return (Criteria) this;
        }

        public Criteria andFallVictimInsuredIsNull() {
            addCriterion("fall_victim_insured is null");
            return (Criteria) this;
        }

        public Criteria andFallVictimInsuredIsNotNull() {
            addCriterion("fall_victim_insured is not null");
            return (Criteria) this;
        }

        public Criteria andFallVictimInsuredEqualTo(String value) {
            addCriterion("fall_victim_insured =", value, "fallVictimInsured");
            return (Criteria) this;
        }

        public Criteria andFallVictimInsuredNotEqualTo(String value) {
            addCriterion("fall_victim_insured <>", value, "fallVictimInsured");
            return (Criteria) this;
        }

        public Criteria andFallVictimInsuredGreaterThan(String value) {
            addCriterion("fall_victim_insured >", value, "fallVictimInsured");
            return (Criteria) this;
        }

        public Criteria andFallVictimInsuredGreaterThanOrEqualTo(String value) {
            addCriterion("fall_victim_insured >=", value, "fallVictimInsured");
            return (Criteria) this;
        }

        public Criteria andFallVictimInsuredLessThan(String value) {
            addCriterion("fall_victim_insured <", value, "fallVictimInsured");
            return (Criteria) this;
        }

        public Criteria andFallVictimInsuredLessThanOrEqualTo(String value) {
            addCriterion("fall_victim_insured <=", value, "fallVictimInsured");
            return (Criteria) this;
        }

        public Criteria andFallVictimInsuredLike(String value) {
            addCriterion("fall_victim_insured like", value, "fallVictimInsured");
            return (Criteria) this;
        }

        public Criteria andFallVictimInsuredNotLike(String value) {
            addCriterion("fall_victim_insured not like", value, "fallVictimInsured");
            return (Criteria) this;
        }

        public Criteria andFallVictimInsuredIn(List<String> values) {
            addCriterion("fall_victim_insured in", values, "fallVictimInsured");
            return (Criteria) this;
        }

        public Criteria andFallVictimInsuredNotIn(List<String> values) {
            addCriterion("fall_victim_insured not in", values, "fallVictimInsured");
            return (Criteria) this;
        }

        public Criteria andFallVictimInsuredBetween(String value1, String value2) {
            addCriterion("fall_victim_insured between", value1, value2, "fallVictimInsured");
            return (Criteria) this;
        }

        public Criteria andFallVictimInsuredNotBetween(String value1, String value2) {
            addCriterion("fall_victim_insured not between", value1, value2, "fallVictimInsured");
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

        public Criteria andIsFirstSceneIsNull() {
            addCriterion("is_first_scene is null");
            return (Criteria) this;
        }

        public Criteria andIsFirstSceneIsNotNull() {
            addCriterion("is_first_scene is not null");
            return (Criteria) this;
        }

        public Criteria andIsFirstSceneEqualTo(Byte value) {
            addCriterion("is_first_scene =", value, "isFirstScene");
            return (Criteria) this;
        }

        public Criteria andIsFirstSceneNotEqualTo(Byte value) {
            addCriterion("is_first_scene <>", value, "isFirstScene");
            return (Criteria) this;
        }

        public Criteria andIsFirstSceneGreaterThan(Byte value) {
            addCriterion("is_first_scene >", value, "isFirstScene");
            return (Criteria) this;
        }

        public Criteria andIsFirstSceneGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_first_scene >=", value, "isFirstScene");
            return (Criteria) this;
        }

        public Criteria andIsFirstSceneLessThan(Byte value) {
            addCriterion("is_first_scene <", value, "isFirstScene");
            return (Criteria) this;
        }

        public Criteria andIsFirstSceneLessThanOrEqualTo(Byte value) {
            addCriterion("is_first_scene <=", value, "isFirstScene");
            return (Criteria) this;
        }

        public Criteria andIsFirstSceneIn(List<Byte> values) {
            addCriterion("is_first_scene in", values, "isFirstScene");
            return (Criteria) this;
        }

        public Criteria andIsFirstSceneNotIn(List<Byte> values) {
            addCriterion("is_first_scene not in", values, "isFirstScene");
            return (Criteria) this;
        }

        public Criteria andIsFirstSceneBetween(Byte value1, Byte value2) {
            addCriterion("is_first_scene between", value1, value2, "isFirstScene");
            return (Criteria) this;
        }

        public Criteria andIsFirstSceneNotBetween(Byte value1, Byte value2) {
            addCriterion("is_first_scene not between", value1, value2, "isFirstScene");
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

        public Criteria andIsPersonInjuredEqualTo(Boolean value) {
            addCriterion("is_person_injured =", value, "isPersonInjured");
            return (Criteria) this;
        }

        public Criteria andIsPersonInjuredNotEqualTo(Boolean value) {
            addCriterion("is_person_injured <>", value, "isPersonInjured");
            return (Criteria) this;
        }

        public Criteria andIsPersonInjuredGreaterThan(Boolean value) {
            addCriterion("is_person_injured >", value, "isPersonInjured");
            return (Criteria) this;
        }

        public Criteria andIsPersonInjuredGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_person_injured >=", value, "isPersonInjured");
            return (Criteria) this;
        }

        public Criteria andIsPersonInjuredLessThan(Boolean value) {
            addCriterion("is_person_injured <", value, "isPersonInjured");
            return (Criteria) this;
        }

        public Criteria andIsPersonInjuredLessThanOrEqualTo(Boolean value) {
            addCriterion("is_person_injured <=", value, "isPersonInjured");
            return (Criteria) this;
        }

        public Criteria andIsPersonInjuredIn(List<Boolean> values) {
            addCriterion("is_person_injured in", values, "isPersonInjured");
            return (Criteria) this;
        }

        public Criteria andIsPersonInjuredNotIn(List<Boolean> values) {
            addCriterion("is_person_injured not in", values, "isPersonInjured");
            return (Criteria) this;
        }

        public Criteria andIsPersonInjuredBetween(Boolean value1, Boolean value2) {
            addCriterion("is_person_injured between", value1, value2, "isPersonInjured");
            return (Criteria) this;
        }

        public Criteria andIsPersonInjuredNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_person_injured not between", value1, value2, "isPersonInjured");
            return (Criteria) this;
        }

        public Criteria andClaimTypeIsNull() {
            addCriterion("claim_type is null");
            return (Criteria) this;
        }

        public Criteria andClaimTypeIsNotNull() {
            addCriterion("claim_type is not null");
            return (Criteria) this;
        }

        public Criteria andClaimTypeEqualTo(String value) {
            addCriterion("claim_type =", value, "claimType");
            return (Criteria) this;
        }

        public Criteria andClaimTypeNotEqualTo(String value) {
            addCriterion("claim_type <>", value, "claimType");
            return (Criteria) this;
        }

        public Criteria andClaimTypeGreaterThan(String value) {
            addCriterion("claim_type >", value, "claimType");
            return (Criteria) this;
        }

        public Criteria andClaimTypeGreaterThanOrEqualTo(String value) {
            addCriterion("claim_type >=", value, "claimType");
            return (Criteria) this;
        }

        public Criteria andClaimTypeLessThan(String value) {
            addCriterion("claim_type <", value, "claimType");
            return (Criteria) this;
        }

        public Criteria andClaimTypeLessThanOrEqualTo(String value) {
            addCriterion("claim_type <=", value, "claimType");
            return (Criteria) this;
        }

        public Criteria andClaimTypeLike(String value) {
            addCriterion("claim_type like", value, "claimType");
            return (Criteria) this;
        }

        public Criteria andClaimTypeNotLike(String value) {
            addCriterion("claim_type not like", value, "claimType");
            return (Criteria) this;
        }

        public Criteria andClaimTypeIn(List<String> values) {
            addCriterion("claim_type in", values, "claimType");
            return (Criteria) this;
        }

        public Criteria andClaimTypeNotIn(List<String> values) {
            addCriterion("claim_type not in", values, "claimType");
            return (Criteria) this;
        }

        public Criteria andClaimTypeBetween(String value1, String value2) {
            addCriterion("claim_type between", value1, value2, "claimType");
            return (Criteria) this;
        }

        public Criteria andClaimTypeNotBetween(String value1, String value2) {
            addCriterion("claim_type not between", value1, value2, "claimType");
            return (Criteria) this;
        }

        public Criteria andSubCertiTypeIsNull() {
            addCriterion("sub_certi_type is null");
            return (Criteria) this;
        }

        public Criteria andSubCertiTypeIsNotNull() {
            addCriterion("sub_certi_type is not null");
            return (Criteria) this;
        }

        public Criteria andSubCertiTypeEqualTo(String value) {
            addCriterion("sub_certi_type =", value, "subCertiType");
            return (Criteria) this;
        }

        public Criteria andSubCertiTypeNotEqualTo(String value) {
            addCriterion("sub_certi_type <>", value, "subCertiType");
            return (Criteria) this;
        }

        public Criteria andSubCertiTypeGreaterThan(String value) {
            addCriterion("sub_certi_type >", value, "subCertiType");
            return (Criteria) this;
        }

        public Criteria andSubCertiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sub_certi_type >=", value, "subCertiType");
            return (Criteria) this;
        }

        public Criteria andSubCertiTypeLessThan(String value) {
            addCriterion("sub_certi_type <", value, "subCertiType");
            return (Criteria) this;
        }

        public Criteria andSubCertiTypeLessThanOrEqualTo(String value) {
            addCriterion("sub_certi_type <=", value, "subCertiType");
            return (Criteria) this;
        }

        public Criteria andSubCertiTypeLike(String value) {
            addCriterion("sub_certi_type like", value, "subCertiType");
            return (Criteria) this;
        }

        public Criteria andSubCertiTypeNotLike(String value) {
            addCriterion("sub_certi_type not like", value, "subCertiType");
            return (Criteria) this;
        }

        public Criteria andSubCertiTypeIn(List<String> values) {
            addCriterion("sub_certi_type in", values, "subCertiType");
            return (Criteria) this;
        }

        public Criteria andSubCertiTypeNotIn(List<String> values) {
            addCriterion("sub_certi_type not in", values, "subCertiType");
            return (Criteria) this;
        }

        public Criteria andSubCertiTypeBetween(String value1, String value2) {
            addCriterion("sub_certi_type between", value1, value2, "subCertiType");
            return (Criteria) this;
        }

        public Criteria andSubCertiTypeNotBetween(String value1, String value2) {
            addCriterion("sub_certi_type not between", value1, value2, "subCertiType");
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

        public Criteria andVerifierNameIsNull() {
            addCriterion("verifier_name is null");
            return (Criteria) this;
        }

        public Criteria andVerifierNameIsNotNull() {
            addCriterion("verifier_name is not null");
            return (Criteria) this;
        }

        public Criteria andVerifierNameEqualTo(String value) {
            addCriterion("verifier_name =", value, "verifierName");
            return (Criteria) this;
        }

        public Criteria andVerifierNameNotEqualTo(String value) {
            addCriterion("verifier_name <>", value, "verifierName");
            return (Criteria) this;
        }

        public Criteria andVerifierNameGreaterThan(String value) {
            addCriterion("verifier_name >", value, "verifierName");
            return (Criteria) this;
        }

        public Criteria andVerifierNameGreaterThanOrEqualTo(String value) {
            addCriterion("verifier_name >=", value, "verifierName");
            return (Criteria) this;
        }

        public Criteria andVerifierNameLessThan(String value) {
            addCriterion("verifier_name <", value, "verifierName");
            return (Criteria) this;
        }

        public Criteria andVerifierNameLessThanOrEqualTo(String value) {
            addCriterion("verifier_name <=", value, "verifierName");
            return (Criteria) this;
        }

        public Criteria andVerifierNameLike(String value) {
            addCriterion("verifier_name like", value, "verifierName");
            return (Criteria) this;
        }

        public Criteria andVerifierNameNotLike(String value) {
            addCriterion("verifier_name not like", value, "verifierName");
            return (Criteria) this;
        }

        public Criteria andVerifierNameIn(List<String> values) {
            addCriterion("verifier_name in", values, "verifierName");
            return (Criteria) this;
        }

        public Criteria andVerifierNameNotIn(List<String> values) {
            addCriterion("verifier_name not in", values, "verifierName");
            return (Criteria) this;
        }

        public Criteria andVerifierNameBetween(String value1, String value2) {
            addCriterion("verifier_name between", value1, value2, "verifierName");
            return (Criteria) this;
        }

        public Criteria andVerifierNameNotBetween(String value1, String value2) {
            addCriterion("verifier_name not between", value1, value2, "verifierName");
            return (Criteria) this;
        }

        public Criteria andVerifierCodeIsNull() {
            addCriterion("verifier_code is null");
            return (Criteria) this;
        }

        public Criteria andVerifierCodeIsNotNull() {
            addCriterion("verifier_code is not null");
            return (Criteria) this;
        }

        public Criteria andVerifierCodeEqualTo(String value) {
            addCriterion("verifier_code =", value, "verifierCode");
            return (Criteria) this;
        }

        public Criteria andVerifierCodeNotEqualTo(String value) {
            addCriterion("verifier_code <>", value, "verifierCode");
            return (Criteria) this;
        }

        public Criteria andVerifierCodeGreaterThan(String value) {
            addCriterion("verifier_code >", value, "verifierCode");
            return (Criteria) this;
        }

        public Criteria andVerifierCodeGreaterThanOrEqualTo(String value) {
            addCriterion("verifier_code >=", value, "verifierCode");
            return (Criteria) this;
        }

        public Criteria andVerifierCodeLessThan(String value) {
            addCriterion("verifier_code <", value, "verifierCode");
            return (Criteria) this;
        }

        public Criteria andVerifierCodeLessThanOrEqualTo(String value) {
            addCriterion("verifier_code <=", value, "verifierCode");
            return (Criteria) this;
        }

        public Criteria andVerifierCodeLike(String value) {
            addCriterion("verifier_code like", value, "verifierCode");
            return (Criteria) this;
        }

        public Criteria andVerifierCodeNotLike(String value) {
            addCriterion("verifier_code not like", value, "verifierCode");
            return (Criteria) this;
        }

        public Criteria andVerifierCodeIn(List<String> values) {
            addCriterion("verifier_code in", values, "verifierCode");
            return (Criteria) this;
        }

        public Criteria andVerifierCodeNotIn(List<String> values) {
            addCriterion("verifier_code not in", values, "verifierCode");
            return (Criteria) this;
        }

        public Criteria andVerifierCodeBetween(String value1, String value2) {
            addCriterion("verifier_code between", value1, value2, "verifierCode");
            return (Criteria) this;
        }

        public Criteria andVerifierCodeNotBetween(String value1, String value2) {
            addCriterion("verifier_code not between", value1, value2, "verifierCode");
            return (Criteria) this;
        }

        public Criteria andBuckleDedReasonIsNull() {
            addCriterion("buckle_ded_reason is null");
            return (Criteria) this;
        }

        public Criteria andBuckleDedReasonIsNotNull() {
            addCriterion("buckle_ded_reason is not null");
            return (Criteria) this;
        }

        public Criteria andBuckleDedReasonEqualTo(String value) {
            addCriterion("buckle_ded_reason =", value, "buckleDedReason");
            return (Criteria) this;
        }

        public Criteria andBuckleDedReasonNotEqualTo(String value) {
            addCriterion("buckle_ded_reason <>", value, "buckleDedReason");
            return (Criteria) this;
        }

        public Criteria andBuckleDedReasonGreaterThan(String value) {
            addCriterion("buckle_ded_reason >", value, "buckleDedReason");
            return (Criteria) this;
        }

        public Criteria andBuckleDedReasonGreaterThanOrEqualTo(String value) {
            addCriterion("buckle_ded_reason >=", value, "buckleDedReason");
            return (Criteria) this;
        }

        public Criteria andBuckleDedReasonLessThan(String value) {
            addCriterion("buckle_ded_reason <", value, "buckleDedReason");
            return (Criteria) this;
        }

        public Criteria andBuckleDedReasonLessThanOrEqualTo(String value) {
            addCriterion("buckle_ded_reason <=", value, "buckleDedReason");
            return (Criteria) this;
        }

        public Criteria andBuckleDedReasonLike(String value) {
            addCriterion("buckle_ded_reason like", value, "buckleDedReason");
            return (Criteria) this;
        }

        public Criteria andBuckleDedReasonNotLike(String value) {
            addCriterion("buckle_ded_reason not like", value, "buckleDedReason");
            return (Criteria) this;
        }

        public Criteria andBuckleDedReasonIn(List<String> values) {
            addCriterion("buckle_ded_reason in", values, "buckleDedReason");
            return (Criteria) this;
        }

        public Criteria andBuckleDedReasonNotIn(List<String> values) {
            addCriterion("buckle_ded_reason not in", values, "buckleDedReason");
            return (Criteria) this;
        }

        public Criteria andBuckleDedReasonBetween(String value1, String value2) {
            addCriterion("buckle_ded_reason between", value1, value2, "buckleDedReason");
            return (Criteria) this;
        }

        public Criteria andBuckleDedReasonNotBetween(String value1, String value2) {
            addCriterion("buckle_ded_reason not between", value1, value2, "buckleDedReason");
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

        public Criteria andDriverReviewIsNull() {
            addCriterion("driver_review is null");
            return (Criteria) this;
        }

        public Criteria andDriverReviewIsNotNull() {
            addCriterion("driver_review is not null");
            return (Criteria) this;
        }

        public Criteria andDriverReviewEqualTo(String value) {
            addCriterion("driver_review =", value, "driverReview");
            return (Criteria) this;
        }

        public Criteria andDriverReviewNotEqualTo(String value) {
            addCriterion("driver_review <>", value, "driverReview");
            return (Criteria) this;
        }

        public Criteria andDriverReviewGreaterThan(String value) {
            addCriterion("driver_review >", value, "driverReview");
            return (Criteria) this;
        }

        public Criteria andDriverReviewGreaterThanOrEqualTo(String value) {
            addCriterion("driver_review >=", value, "driverReview");
            return (Criteria) this;
        }

        public Criteria andDriverReviewLessThan(String value) {
            addCriterion("driver_review <", value, "driverReview");
            return (Criteria) this;
        }

        public Criteria andDriverReviewLessThanOrEqualTo(String value) {
            addCriterion("driver_review <=", value, "driverReview");
            return (Criteria) this;
        }

        public Criteria andDriverReviewLike(String value) {
            addCriterion("driver_review like", value, "driverReview");
            return (Criteria) this;
        }

        public Criteria andDriverReviewNotLike(String value) {
            addCriterion("driver_review not like", value, "driverReview");
            return (Criteria) this;
        }

        public Criteria andDriverReviewIn(List<String> values) {
            addCriterion("driver_review in", values, "driverReview");
            return (Criteria) this;
        }

        public Criteria andDriverReviewNotIn(List<String> values) {
            addCriterion("driver_review not in", values, "driverReview");
            return (Criteria) this;
        }

        public Criteria andDriverReviewBetween(String value1, String value2) {
            addCriterion("driver_review between", value1, value2, "driverReview");
            return (Criteria) this;
        }

        public Criteria andDriverReviewNotBetween(String value1, String value2) {
            addCriterion("driver_review not between", value1, value2, "driverReview");
            return (Criteria) this;
        }

        public Criteria andIsCarInsuranceIsNull() {
            addCriterion("is_car_insurance is null");
            return (Criteria) this;
        }

        public Criteria andIsCarInsuranceIsNotNull() {
            addCriterion("is_car_insurance is not null");
            return (Criteria) this;
        }

        public Criteria andIsCarInsuranceEqualTo(String value) {
            addCriterion("is_car_insurance =", value, "isCarInsurance");
            return (Criteria) this;
        }

        public Criteria andIsCarInsuranceNotEqualTo(String value) {
            addCriterion("is_car_insurance <>", value, "isCarInsurance");
            return (Criteria) this;
        }

        public Criteria andIsCarInsuranceGreaterThan(String value) {
            addCriterion("is_car_insurance >", value, "isCarInsurance");
            return (Criteria) this;
        }

        public Criteria andIsCarInsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("is_car_insurance >=", value, "isCarInsurance");
            return (Criteria) this;
        }

        public Criteria andIsCarInsuranceLessThan(String value) {
            addCriterion("is_car_insurance <", value, "isCarInsurance");
            return (Criteria) this;
        }

        public Criteria andIsCarInsuranceLessThanOrEqualTo(String value) {
            addCriterion("is_car_insurance <=", value, "isCarInsurance");
            return (Criteria) this;
        }

        public Criteria andIsCarInsuranceLike(String value) {
            addCriterion("is_car_insurance like", value, "isCarInsurance");
            return (Criteria) this;
        }

        public Criteria andIsCarInsuranceNotLike(String value) {
            addCriterion("is_car_insurance not like", value, "isCarInsurance");
            return (Criteria) this;
        }

        public Criteria andIsCarInsuranceIn(List<String> values) {
            addCriterion("is_car_insurance in", values, "isCarInsurance");
            return (Criteria) this;
        }

        public Criteria andIsCarInsuranceNotIn(List<String> values) {
            addCriterion("is_car_insurance not in", values, "isCarInsurance");
            return (Criteria) this;
        }

        public Criteria andIsCarInsuranceBetween(String value1, String value2) {
            addCriterion("is_car_insurance between", value1, value2, "isCarInsurance");
            return (Criteria) this;
        }

        public Criteria andIsCarInsuranceNotBetween(String value1, String value2) {
            addCriterion("is_car_insurance not between", value1, value2, "isCarInsurance");
            return (Criteria) this;
        }

        public Criteria andIsCarAnnualIsNull() {
            addCriterion("is_car_annual is null");
            return (Criteria) this;
        }

        public Criteria andIsCarAnnualIsNotNull() {
            addCriterion("is_car_annual is not null");
            return (Criteria) this;
        }

        public Criteria andIsCarAnnualEqualTo(String value) {
            addCriterion("is_car_annual =", value, "isCarAnnual");
            return (Criteria) this;
        }

        public Criteria andIsCarAnnualNotEqualTo(String value) {
            addCriterion("is_car_annual <>", value, "isCarAnnual");
            return (Criteria) this;
        }

        public Criteria andIsCarAnnualGreaterThan(String value) {
            addCriterion("is_car_annual >", value, "isCarAnnual");
            return (Criteria) this;
        }

        public Criteria andIsCarAnnualGreaterThanOrEqualTo(String value) {
            addCriterion("is_car_annual >=", value, "isCarAnnual");
            return (Criteria) this;
        }

        public Criteria andIsCarAnnualLessThan(String value) {
            addCriterion("is_car_annual <", value, "isCarAnnual");
            return (Criteria) this;
        }

        public Criteria andIsCarAnnualLessThanOrEqualTo(String value) {
            addCriterion("is_car_annual <=", value, "isCarAnnual");
            return (Criteria) this;
        }

        public Criteria andIsCarAnnualLike(String value) {
            addCriterion("is_car_annual like", value, "isCarAnnual");
            return (Criteria) this;
        }

        public Criteria andIsCarAnnualNotLike(String value) {
            addCriterion("is_car_annual not like", value, "isCarAnnual");
            return (Criteria) this;
        }

        public Criteria andIsCarAnnualIn(List<String> values) {
            addCriterion("is_car_annual in", values, "isCarAnnual");
            return (Criteria) this;
        }

        public Criteria andIsCarAnnualNotIn(List<String> values) {
            addCriterion("is_car_annual not in", values, "isCarAnnual");
            return (Criteria) this;
        }

        public Criteria andIsCarAnnualBetween(String value1, String value2) {
            addCriterion("is_car_annual between", value1, value2, "isCarAnnual");
            return (Criteria) this;
        }

        public Criteria andIsCarAnnualNotBetween(String value1, String value2) {
            addCriterion("is_car_annual not between", value1, value2, "isCarAnnual");
            return (Criteria) this;
        }

        public Criteria andLoadingConditionIsNull() {
            addCriterion("loading_condition is null");
            return (Criteria) this;
        }

        public Criteria andLoadingConditionIsNotNull() {
            addCriterion("loading_condition is not null");
            return (Criteria) this;
        }

        public Criteria andLoadingConditionEqualTo(String value) {
            addCriterion("loading_condition =", value, "loadingCondition");
            return (Criteria) this;
        }

        public Criteria andLoadingConditionNotEqualTo(String value) {
            addCriterion("loading_condition <>", value, "loadingCondition");
            return (Criteria) this;
        }

        public Criteria andLoadingConditionGreaterThan(String value) {
            addCriterion("loading_condition >", value, "loadingCondition");
            return (Criteria) this;
        }

        public Criteria andLoadingConditionGreaterThanOrEqualTo(String value) {
            addCriterion("loading_condition >=", value, "loadingCondition");
            return (Criteria) this;
        }

        public Criteria andLoadingConditionLessThan(String value) {
            addCriterion("loading_condition <", value, "loadingCondition");
            return (Criteria) this;
        }

        public Criteria andLoadingConditionLessThanOrEqualTo(String value) {
            addCriterion("loading_condition <=", value, "loadingCondition");
            return (Criteria) this;
        }

        public Criteria andLoadingConditionLike(String value) {
            addCriterion("loading_condition like", value, "loadingCondition");
            return (Criteria) this;
        }

        public Criteria andLoadingConditionNotLike(String value) {
            addCriterion("loading_condition not like", value, "loadingCondition");
            return (Criteria) this;
        }

        public Criteria andLoadingConditionIn(List<String> values) {
            addCriterion("loading_condition in", values, "loadingCondition");
            return (Criteria) this;
        }

        public Criteria andLoadingConditionNotIn(List<String> values) {
            addCriterion("loading_condition not in", values, "loadingCondition");
            return (Criteria) this;
        }

        public Criteria andLoadingConditionBetween(String value1, String value2) {
            addCriterion("loading_condition between", value1, value2, "loadingCondition");
            return (Criteria) this;
        }

        public Criteria andLoadingConditionNotBetween(String value1, String value2) {
            addCriterion("loading_condition not between", value1, value2, "loadingCondition");
            return (Criteria) this;
        }

        public Criteria andCheckDescIsNull() {
            addCriterion("check_desc is null");
            return (Criteria) this;
        }

        public Criteria andCheckDescIsNotNull() {
            addCriterion("check_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDescEqualTo(String value) {
            addCriterion("check_desc =", value, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescNotEqualTo(String value) {
            addCriterion("check_desc <>", value, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescGreaterThan(String value) {
            addCriterion("check_desc >", value, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescGreaterThanOrEqualTo(String value) {
            addCriterion("check_desc >=", value, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescLessThan(String value) {
            addCriterion("check_desc <", value, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescLessThanOrEqualTo(String value) {
            addCriterion("check_desc <=", value, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescLike(String value) {
            addCriterion("check_desc like", value, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescNotLike(String value) {
            addCriterion("check_desc not like", value, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescIn(List<String> values) {
            addCriterion("check_desc in", values, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescNotIn(List<String> values) {
            addCriterion("check_desc not in", values, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescBetween(String value1, String value2) {
            addCriterion("check_desc between", value1, value2, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescNotBetween(String value1, String value2) {
            addCriterion("check_desc not between", value1, value2, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckTypeIsNull() {
            addCriterion("check_type is null");
            return (Criteria) this;
        }

        public Criteria andCheckTypeIsNotNull() {
            addCriterion("check_type is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTypeEqualTo(String value) {
            addCriterion("check_type =", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotEqualTo(String value) {
            addCriterion("check_type <>", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeGreaterThan(String value) {
            addCriterion("check_type >", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeGreaterThanOrEqualTo(String value) {
            addCriterion("check_type >=", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeLessThan(String value) {
            addCriterion("check_type <", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeLessThanOrEqualTo(String value) {
            addCriterion("check_type <=", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeLike(String value) {
            addCriterion("check_type like", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotLike(String value) {
            addCriterion("check_type not like", value, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeIn(List<String> values) {
            addCriterion("check_type in", values, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotIn(List<String> values) {
            addCriterion("check_type not in", values, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeBetween(String value1, String value2) {
            addCriterion("check_type between", value1, value2, "checkType");
            return (Criteria) this;
        }

        public Criteria andCheckTypeNotBetween(String value1, String value2) {
            addCriterion("check_type not between", value1, value2, "checkType");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultContentIsNull() {
            addCriterion("feedback_result_content is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultContentIsNotNull() {
            addCriterion("feedback_result_content is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultContentEqualTo(String value) {
            addCriterion("feedback_result_content =", value, "feedbackResultContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultContentNotEqualTo(String value) {
            addCriterion("feedback_result_content <>", value, "feedbackResultContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultContentGreaterThan(String value) {
            addCriterion("feedback_result_content >", value, "feedbackResultContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultContentGreaterThanOrEqualTo(String value) {
            addCriterion("feedback_result_content >=", value, "feedbackResultContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultContentLessThan(String value) {
            addCriterion("feedback_result_content <", value, "feedbackResultContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultContentLessThanOrEqualTo(String value) {
            addCriterion("feedback_result_content <=", value, "feedbackResultContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultContentLike(String value) {
            addCriterion("feedback_result_content like", value, "feedbackResultContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultContentNotLike(String value) {
            addCriterion("feedback_result_content not like", value, "feedbackResultContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultContentIn(List<String> values) {
            addCriterion("feedback_result_content in", values, "feedbackResultContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultContentNotIn(List<String> values) {
            addCriterion("feedback_result_content not in", values, "feedbackResultContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultContentBetween(String value1, String value2) {
            addCriterion("feedback_result_content between", value1, value2, "feedbackResultContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultContentNotBetween(String value1, String value2) {
            addCriterion("feedback_result_content not between", value1, value2, "feedbackResultContent");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultIsNull() {
            addCriterion("feedback_result is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultIsNotNull() {
            addCriterion("feedback_result is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultEqualTo(String value) {
            addCriterion("feedback_result =", value, "feedbackResult");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultNotEqualTo(String value) {
            addCriterion("feedback_result <>", value, "feedbackResult");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultGreaterThan(String value) {
            addCriterion("feedback_result >", value, "feedbackResult");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultGreaterThanOrEqualTo(String value) {
            addCriterion("feedback_result >=", value, "feedbackResult");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultLessThan(String value) {
            addCriterion("feedback_result <", value, "feedbackResult");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultLessThanOrEqualTo(String value) {
            addCriterion("feedback_result <=", value, "feedbackResult");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultLike(String value) {
            addCriterion("feedback_result like", value, "feedbackResult");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultNotLike(String value) {
            addCriterion("feedback_result not like", value, "feedbackResult");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultIn(List<String> values) {
            addCriterion("feedback_result in", values, "feedbackResult");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultNotIn(List<String> values) {
            addCriterion("feedback_result not in", values, "feedbackResult");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultBetween(String value1, String value2) {
            addCriterion("feedback_result between", value1, value2, "feedbackResult");
            return (Criteria) this;
        }

        public Criteria andFeedbackResultNotBetween(String value1, String value2) {
            addCriterion("feedback_result not between", value1, value2, "feedbackResult");
            return (Criteria) this;
        }

        public Criteria andAuditNameIsNull() {
            addCriterion("audit_name is null");
            return (Criteria) this;
        }

        public Criteria andAuditNameIsNotNull() {
            addCriterion("audit_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuditNameEqualTo(String value) {
            addCriterion("audit_name =", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameNotEqualTo(String value) {
            addCriterion("audit_name <>", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameGreaterThan(String value) {
            addCriterion("audit_name >", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameGreaterThanOrEqualTo(String value) {
            addCriterion("audit_name >=", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameLessThan(String value) {
            addCriterion("audit_name <", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameLessThanOrEqualTo(String value) {
            addCriterion("audit_name <=", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameLike(String value) {
            addCriterion("audit_name like", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameNotLike(String value) {
            addCriterion("audit_name not like", value, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameIn(List<String> values) {
            addCriterion("audit_name in", values, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameNotIn(List<String> values) {
            addCriterion("audit_name not in", values, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameBetween(String value1, String value2) {
            addCriterion("audit_name between", value1, value2, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditNameNotBetween(String value1, String value2) {
            addCriterion("audit_name not between", value1, value2, "auditName");
            return (Criteria) this;
        }

        public Criteria andAuditCodeIsNull() {
            addCriterion("audit_code is null");
            return (Criteria) this;
        }

        public Criteria andAuditCodeIsNotNull() {
            addCriterion("audit_code is not null");
            return (Criteria) this;
        }

        public Criteria andAuditCodeEqualTo(String value) {
            addCriterion("audit_code =", value, "auditCode");
            return (Criteria) this;
        }

        public Criteria andAuditCodeNotEqualTo(String value) {
            addCriterion("audit_code <>", value, "auditCode");
            return (Criteria) this;
        }

        public Criteria andAuditCodeGreaterThan(String value) {
            addCriterion("audit_code >", value, "auditCode");
            return (Criteria) this;
        }

        public Criteria andAuditCodeGreaterThanOrEqualTo(String value) {
            addCriterion("audit_code >=", value, "auditCode");
            return (Criteria) this;
        }

        public Criteria andAuditCodeLessThan(String value) {
            addCriterion("audit_code <", value, "auditCode");
            return (Criteria) this;
        }

        public Criteria andAuditCodeLessThanOrEqualTo(String value) {
            addCriterion("audit_code <=", value, "auditCode");
            return (Criteria) this;
        }

        public Criteria andAuditCodeLike(String value) {
            addCriterion("audit_code like", value, "auditCode");
            return (Criteria) this;
        }

        public Criteria andAuditCodeNotLike(String value) {
            addCriterion("audit_code not like", value, "auditCode");
            return (Criteria) this;
        }

        public Criteria andAuditCodeIn(List<String> values) {
            addCriterion("audit_code in", values, "auditCode");
            return (Criteria) this;
        }

        public Criteria andAuditCodeNotIn(List<String> values) {
            addCriterion("audit_code not in", values, "auditCode");
            return (Criteria) this;
        }

        public Criteria andAuditCodeBetween(String value1, String value2) {
            addCriterion("audit_code between", value1, value2, "auditCode");
            return (Criteria) this;
        }

        public Criteria andAuditCodeNotBetween(String value1, String value2) {
            addCriterion("audit_code not between", value1, value2, "auditCode");
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

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeIsNull() {
            addCriterion("receipt_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeIsNotNull() {
            addCriterion("receipt_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeEqualTo(Date value) {
            addCriterion("receipt_time =", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeNotEqualTo(Date value) {
            addCriterion("receipt_time <>", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeGreaterThan(Date value) {
            addCriterion("receipt_time >", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receipt_time >=", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeLessThan(Date value) {
            addCriterion("receipt_time <", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeLessThanOrEqualTo(Date value) {
            addCriterion("receipt_time <=", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeIn(List<Date> values) {
            addCriterion("receipt_time in", values, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeNotIn(List<Date> values) {
            addCriterion("receipt_time not in", values, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeBetween(Date value1, Date value2) {
            addCriterion("receipt_time between", value1, value2, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeNotBetween(Date value1, Date value2) {
            addCriterion("receipt_time not between", value1, value2, "receiptTime");
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

        public Criteria andDispatchTimeIsNull() {
            addCriterion("dispatch_time is null");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeIsNotNull() {
            addCriterion("dispatch_time is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeEqualTo(Date value) {
            addCriterion("dispatch_time =", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeNotEqualTo(Date value) {
            addCriterion("dispatch_time <>", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeGreaterThan(Date value) {
            addCriterion("dispatch_time >", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dispatch_time >=", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeLessThan(Date value) {
            addCriterion("dispatch_time <", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeLessThanOrEqualTo(Date value) {
            addCriterion("dispatch_time <=", value, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeIn(List<Date> values) {
            addCriterion("dispatch_time in", values, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeNotIn(List<Date> values) {
            addCriterion("dispatch_time not in", values, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeBetween(Date value1, Date value2) {
            addCriterion("dispatch_time between", value1, value2, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andDispatchTimeNotBetween(Date value1, Date value2) {
            addCriterion("dispatch_time not between", value1, value2, "dispatchTime");
            return (Criteria) this;
        }

        public Criteria andRiskStatusIsNull() {
            addCriterion("risk_status is null");
            return (Criteria) this;
        }

        public Criteria andRiskStatusIsNotNull() {
            addCriterion("risk_status is not null");
            return (Criteria) this;
        }

        public Criteria andRiskStatusEqualTo(String value) {
            addCriterion("risk_status =", value, "riskStatus");
            return (Criteria) this;
        }

        public Criteria andRiskStatusNotEqualTo(String value) {
            addCriterion("risk_status <>", value, "riskStatus");
            return (Criteria) this;
        }

        public Criteria andRiskStatusGreaterThan(String value) {
            addCriterion("risk_status >", value, "riskStatus");
            return (Criteria) this;
        }

        public Criteria andRiskStatusGreaterThanOrEqualTo(String value) {
            addCriterion("risk_status >=", value, "riskStatus");
            return (Criteria) this;
        }

        public Criteria andRiskStatusLessThan(String value) {
            addCriterion("risk_status <", value, "riskStatus");
            return (Criteria) this;
        }

        public Criteria andRiskStatusLessThanOrEqualTo(String value) {
            addCriterion("risk_status <=", value, "riskStatus");
            return (Criteria) this;
        }

        public Criteria andRiskStatusLike(String value) {
            addCriterion("risk_status like", value, "riskStatus");
            return (Criteria) this;
        }

        public Criteria andRiskStatusNotLike(String value) {
            addCriterion("risk_status not like", value, "riskStatus");
            return (Criteria) this;
        }

        public Criteria andRiskStatusIn(List<String> values) {
            addCriterion("risk_status in", values, "riskStatus");
            return (Criteria) this;
        }

        public Criteria andRiskStatusNotIn(List<String> values) {
            addCriterion("risk_status not in", values, "riskStatus");
            return (Criteria) this;
        }

        public Criteria andRiskStatusBetween(String value1, String value2) {
            addCriterion("risk_status between", value1, value2, "riskStatus");
            return (Criteria) this;
        }

        public Criteria andRiskStatusNotBetween(String value1, String value2) {
            addCriterion("risk_status not between", value1, value2, "riskStatus");
            return (Criteria) this;
        }

        public Criteria andSurveyStatusIsNull() {
            addCriterion("survey_status is null");
            return (Criteria) this;
        }

        public Criteria andSurveyStatusIsNotNull() {
            addCriterion("survey_status is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyStatusEqualTo(String value) {
            addCriterion("survey_status =", value, "surveyStatus");
            return (Criteria) this;
        }

        public Criteria andSurveyStatusNotEqualTo(String value) {
            addCriterion("survey_status <>", value, "surveyStatus");
            return (Criteria) this;
        }

        public Criteria andSurveyStatusGreaterThan(String value) {
            addCriterion("survey_status >", value, "surveyStatus");
            return (Criteria) this;
        }

        public Criteria andSurveyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("survey_status >=", value, "surveyStatus");
            return (Criteria) this;
        }

        public Criteria andSurveyStatusLessThan(String value) {
            addCriterion("survey_status <", value, "surveyStatus");
            return (Criteria) this;
        }

        public Criteria andSurveyStatusLessThanOrEqualTo(String value) {
            addCriterion("survey_status <=", value, "surveyStatus");
            return (Criteria) this;
        }

        public Criteria andSurveyStatusLike(String value) {
            addCriterion("survey_status like", value, "surveyStatus");
            return (Criteria) this;
        }

        public Criteria andSurveyStatusNotLike(String value) {
            addCriterion("survey_status not like", value, "surveyStatus");
            return (Criteria) this;
        }

        public Criteria andSurveyStatusIn(List<String> values) {
            addCriterion("survey_status in", values, "surveyStatus");
            return (Criteria) this;
        }

        public Criteria andSurveyStatusNotIn(List<String> values) {
            addCriterion("survey_status not in", values, "surveyStatus");
            return (Criteria) this;
        }

        public Criteria andSurveyStatusBetween(String value1, String value2) {
            addCriterion("survey_status between", value1, value2, "surveyStatus");
            return (Criteria) this;
        }

        public Criteria andSurveyStatusNotBetween(String value1, String value2) {
            addCriterion("survey_status not between", value1, value2, "surveyStatus");
            return (Criteria) this;
        }

        public Criteria andOperationBusinessIsNull() {
            addCriterion("operation_business is null");
            return (Criteria) this;
        }

        public Criteria andOperationBusinessIsNotNull() {
            addCriterion("operation_business is not null");
            return (Criteria) this;
        }

        public Criteria andOperationBusinessEqualTo(String value) {
            addCriterion("operation_business =", value, "operationBusiness");
            return (Criteria) this;
        }

        public Criteria andOperationBusinessNotEqualTo(String value) {
            addCriterion("operation_business <>", value, "operationBusiness");
            return (Criteria) this;
        }

        public Criteria andOperationBusinessGreaterThan(String value) {
            addCriterion("operation_business >", value, "operationBusiness");
            return (Criteria) this;
        }

        public Criteria andOperationBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("operation_business >=", value, "operationBusiness");
            return (Criteria) this;
        }

        public Criteria andOperationBusinessLessThan(String value) {
            addCriterion("operation_business <", value, "operationBusiness");
            return (Criteria) this;
        }

        public Criteria andOperationBusinessLessThanOrEqualTo(String value) {
            addCriterion("operation_business <=", value, "operationBusiness");
            return (Criteria) this;
        }

        public Criteria andOperationBusinessLike(String value) {
            addCriterion("operation_business like", value, "operationBusiness");
            return (Criteria) this;
        }

        public Criteria andOperationBusinessNotLike(String value) {
            addCriterion("operation_business not like", value, "operationBusiness");
            return (Criteria) this;
        }

        public Criteria andOperationBusinessIn(List<String> values) {
            addCriterion("operation_business in", values, "operationBusiness");
            return (Criteria) this;
        }

        public Criteria andOperationBusinessNotIn(List<String> values) {
            addCriterion("operation_business not in", values, "operationBusiness");
            return (Criteria) this;
        }

        public Criteria andOperationBusinessBetween(String value1, String value2) {
            addCriterion("operation_business between", value1, value2, "operationBusiness");
            return (Criteria) this;
        }

        public Criteria andOperationBusinessNotBetween(String value1, String value2) {
            addCriterion("operation_business not between", value1, value2, "operationBusiness");
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