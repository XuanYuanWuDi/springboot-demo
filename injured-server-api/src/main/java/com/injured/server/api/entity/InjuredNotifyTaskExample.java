package com.injured.server.api.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InjuredNotifyTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InjuredNotifyTaskExample() {
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

        public Criteria andBusinessIdIsNull() {
            addCriterion("business_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("business_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(Long value) {
            addCriterion("business_id =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(Long value) {
            addCriterion("business_id <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(Long value) {
            addCriterion("business_id >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(Long value) {
            addCriterion("business_id >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(Long value) {
            addCriterion("business_id <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(Long value) {
            addCriterion("business_id <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<Long> values) {
            addCriterion("business_id in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<Long> values) {
            addCriterion("business_id not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(Long value1, Long value2) {
            addCriterion("business_id between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(Long value1, Long value2) {
            addCriterion("business_id not between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNull() {
            addCriterion("biz_type is null");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNotNull() {
            addCriterion("biz_type is not null");
            return (Criteria) this;
        }

        public Criteria andBizTypeEqualTo(String value) {
            addCriterion("biz_type =", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotEqualTo(String value) {
            addCriterion("biz_type <>", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThan(String value) {
            addCriterion("biz_type >", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThanOrEqualTo(String value) {
            addCriterion("biz_type >=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThan(String value) {
            addCriterion("biz_type <", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThanOrEqualTo(String value) {
            addCriterion("biz_type <=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLike(String value) {
            addCriterion("biz_type like", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotLike(String value) {
            addCriterion("biz_type not like", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeIn(List<String> values) {
            addCriterion("biz_type in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotIn(List<String> values) {
            addCriterion("biz_type not in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeBetween(String value1, String value2) {
            addCriterion("biz_type between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotBetween(String value1, String value2) {
            addCriterion("biz_type not between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andNotifyLastTimeIsNull() {
            addCriterion("notify_last_time is null");
            return (Criteria) this;
        }

        public Criteria andNotifyLastTimeIsNotNull() {
            addCriterion("notify_last_time is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyLastTimeEqualTo(Date value) {
            addCriterion("notify_last_time =", value, "notifyLastTime");
            return (Criteria) this;
        }

        public Criteria andNotifyLastTimeNotEqualTo(Date value) {
            addCriterion("notify_last_time <>", value, "notifyLastTime");
            return (Criteria) this;
        }

        public Criteria andNotifyLastTimeGreaterThan(Date value) {
            addCriterion("notify_last_time >", value, "notifyLastTime");
            return (Criteria) this;
        }

        public Criteria andNotifyLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("notify_last_time >=", value, "notifyLastTime");
            return (Criteria) this;
        }

        public Criteria andNotifyLastTimeLessThan(Date value) {
            addCriterion("notify_last_time <", value, "notifyLastTime");
            return (Criteria) this;
        }

        public Criteria andNotifyLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("notify_last_time <=", value, "notifyLastTime");
            return (Criteria) this;
        }

        public Criteria andNotifyLastTimeIn(List<Date> values) {
            addCriterion("notify_last_time in", values, "notifyLastTime");
            return (Criteria) this;
        }

        public Criteria andNotifyLastTimeNotIn(List<Date> values) {
            addCriterion("notify_last_time not in", values, "notifyLastTime");
            return (Criteria) this;
        }

        public Criteria andNotifyLastTimeBetween(Date value1, Date value2) {
            addCriterion("notify_last_time between", value1, value2, "notifyLastTime");
            return (Criteria) this;
        }

        public Criteria andNotifyLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("notify_last_time not between", value1, value2, "notifyLastTime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andNotifyNumberIsNull() {
            addCriterion("notify_number is null");
            return (Criteria) this;
        }

        public Criteria andNotifyNumberIsNotNull() {
            addCriterion("notify_number is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyNumberEqualTo(Integer value) {
            addCriterion("notify_number =", value, "notifyNumber");
            return (Criteria) this;
        }

        public Criteria andNotifyNumberNotEqualTo(Integer value) {
            addCriterion("notify_number <>", value, "notifyNumber");
            return (Criteria) this;
        }

        public Criteria andNotifyNumberGreaterThan(Integer value) {
            addCriterion("notify_number >", value, "notifyNumber");
            return (Criteria) this;
        }

        public Criteria andNotifyNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("notify_number >=", value, "notifyNumber");
            return (Criteria) this;
        }

        public Criteria andNotifyNumberLessThan(Integer value) {
            addCriterion("notify_number <", value, "notifyNumber");
            return (Criteria) this;
        }

        public Criteria andNotifyNumberLessThanOrEqualTo(Integer value) {
            addCriterion("notify_number <=", value, "notifyNumber");
            return (Criteria) this;
        }

        public Criteria andNotifyNumberIn(List<Integer> values) {
            addCriterion("notify_number in", values, "notifyNumber");
            return (Criteria) this;
        }

        public Criteria andNotifyNumberNotIn(List<Integer> values) {
            addCriterion("notify_number not in", values, "notifyNumber");
            return (Criteria) this;
        }

        public Criteria andNotifyNumberBetween(Integer value1, Integer value2) {
            addCriterion("notify_number between", value1, value2, "notifyNumber");
            return (Criteria) this;
        }

        public Criteria andNotifyNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("notify_number not between", value1, value2, "notifyNumber");
            return (Criteria) this;
        }

        public Criteria andNotifyParamIsNull() {
            addCriterion("notify_param is null");
            return (Criteria) this;
        }

        public Criteria andNotifyParamIsNotNull() {
            addCriterion("notify_param is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyParamEqualTo(String value) {
            addCriterion("notify_param =", value, "notifyParam");
            return (Criteria) this;
        }

        public Criteria andNotifyParamNotEqualTo(String value) {
            addCriterion("notify_param <>", value, "notifyParam");
            return (Criteria) this;
        }

        public Criteria andNotifyParamGreaterThan(String value) {
            addCriterion("notify_param >", value, "notifyParam");
            return (Criteria) this;
        }

        public Criteria andNotifyParamGreaterThanOrEqualTo(String value) {
            addCriterion("notify_param >=", value, "notifyParam");
            return (Criteria) this;
        }

        public Criteria andNotifyParamLessThan(String value) {
            addCriterion("notify_param <", value, "notifyParam");
            return (Criteria) this;
        }

        public Criteria andNotifyParamLessThanOrEqualTo(String value) {
            addCriterion("notify_param <=", value, "notifyParam");
            return (Criteria) this;
        }

        public Criteria andNotifyParamLike(String value) {
            addCriterion("notify_param like", value, "notifyParam");
            return (Criteria) this;
        }

        public Criteria andNotifyParamNotLike(String value) {
            addCriterion("notify_param not like", value, "notifyParam");
            return (Criteria) this;
        }

        public Criteria andNotifyParamIn(List<String> values) {
            addCriterion("notify_param in", values, "notifyParam");
            return (Criteria) this;
        }

        public Criteria andNotifyParamNotIn(List<String> values) {
            addCriterion("notify_param not in", values, "notifyParam");
            return (Criteria) this;
        }

        public Criteria andNotifyParamBetween(String value1, String value2) {
            addCriterion("notify_param between", value1, value2, "notifyParam");
            return (Criteria) this;
        }

        public Criteria andNotifyParamNotBetween(String value1, String value2) {
            addCriterion("notify_param not between", value1, value2, "notifyParam");
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

        public Criteria andNotifyResultIsNull() {
            addCriterion("notify_result is null");
            return (Criteria) this;
        }

        public Criteria andNotifyResultIsNotNull() {
            addCriterion("notify_result is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyResultEqualTo(String value) {
            addCriterion("notify_result =", value, "notifyResult");
            return (Criteria) this;
        }

        public Criteria andNotifyResultNotEqualTo(String value) {
            addCriterion("notify_result <>", value, "notifyResult");
            return (Criteria) this;
        }

        public Criteria andNotifyResultGreaterThan(String value) {
            addCriterion("notify_result >", value, "notifyResult");
            return (Criteria) this;
        }

        public Criteria andNotifyResultGreaterThanOrEqualTo(String value) {
            addCriterion("notify_result >=", value, "notifyResult");
            return (Criteria) this;
        }

        public Criteria andNotifyResultLessThan(String value) {
            addCriterion("notify_result <", value, "notifyResult");
            return (Criteria) this;
        }

        public Criteria andNotifyResultLessThanOrEqualTo(String value) {
            addCriterion("notify_result <=", value, "notifyResult");
            return (Criteria) this;
        }

        public Criteria andNotifyResultLike(String value) {
            addCriterion("notify_result like", value, "notifyResult");
            return (Criteria) this;
        }

        public Criteria andNotifyResultNotLike(String value) {
            addCriterion("notify_result not like", value, "notifyResult");
            return (Criteria) this;
        }

        public Criteria andNotifyResultIn(List<String> values) {
            addCriterion("notify_result in", values, "notifyResult");
            return (Criteria) this;
        }

        public Criteria andNotifyResultNotIn(List<String> values) {
            addCriterion("notify_result not in", values, "notifyResult");
            return (Criteria) this;
        }

        public Criteria andNotifyResultBetween(String value1, String value2) {
            addCriterion("notify_result between", value1, value2, "notifyResult");
            return (Criteria) this;
        }

        public Criteria andNotifyResultNotBetween(String value1, String value2) {
            addCriterion("notify_result not between", value1, value2, "notifyResult");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusIsNull() {
            addCriterion("notify_status is null");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusIsNotNull() {
            addCriterion("notify_status is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusEqualTo(String value) {
            addCriterion("notify_status =", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusNotEqualTo(String value) {
            addCriterion("notify_status <>", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusGreaterThan(String value) {
            addCriterion("notify_status >", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("notify_status >=", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusLessThan(String value) {
            addCriterion("notify_status <", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusLessThanOrEqualTo(String value) {
            addCriterion("notify_status <=", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusLike(String value) {
            addCriterion("notify_status like", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusNotLike(String value) {
            addCriterion("notify_status not like", value, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusIn(List<String> values) {
            addCriterion("notify_status in", values, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusNotIn(List<String> values) {
            addCriterion("notify_status not in", values, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusBetween(String value1, String value2) {
            addCriterion("notify_status between", value1, value2, "notifyStatus");
            return (Criteria) this;
        }

        public Criteria andNotifyStatusNotBetween(String value1, String value2) {
            addCriterion("notify_status not between", value1, value2, "notifyStatus");
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

        public Criteria andNotifyParamTypeIsNull() {
            addCriterion("notify_param_type is null");
            return (Criteria) this;
        }

        public Criteria andNotifyParamTypeIsNotNull() {
            addCriterion("notify_param_type is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyParamTypeEqualTo(String value) {
            addCriterion("notify_param_type =", value, "notifyParamType");
            return (Criteria) this;
        }

        public Criteria andNotifyParamTypeNotEqualTo(String value) {
            addCriterion("notify_param_type <>", value, "notifyParamType");
            return (Criteria) this;
        }

        public Criteria andNotifyParamTypeGreaterThan(String value) {
            addCriterion("notify_param_type >", value, "notifyParamType");
            return (Criteria) this;
        }

        public Criteria andNotifyParamTypeGreaterThanOrEqualTo(String value) {
            addCriterion("notify_param_type >=", value, "notifyParamType");
            return (Criteria) this;
        }

        public Criteria andNotifyParamTypeLessThan(String value) {
            addCriterion("notify_param_type <", value, "notifyParamType");
            return (Criteria) this;
        }

        public Criteria andNotifyParamTypeLessThanOrEqualTo(String value) {
            addCriterion("notify_param_type <=", value, "notifyParamType");
            return (Criteria) this;
        }

        public Criteria andNotifyParamTypeLike(String value) {
            addCriterion("notify_param_type like", value, "notifyParamType");
            return (Criteria) this;
        }

        public Criteria andNotifyParamTypeNotLike(String value) {
            addCriterion("notify_param_type not like", value, "notifyParamType");
            return (Criteria) this;
        }

        public Criteria andNotifyParamTypeIn(List<String> values) {
            addCriterion("notify_param_type in", values, "notifyParamType");
            return (Criteria) this;
        }

        public Criteria andNotifyParamTypeNotIn(List<String> values) {
            addCriterion("notify_param_type not in", values, "notifyParamType");
            return (Criteria) this;
        }

        public Criteria andNotifyParamTypeBetween(String value1, String value2) {
            addCriterion("notify_param_type between", value1, value2, "notifyParamType");
            return (Criteria) this;
        }

        public Criteria andNotifyParamTypeNotBetween(String value1, String value2) {
            addCriterion("notify_param_type not between", value1, value2, "notifyParamType");
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