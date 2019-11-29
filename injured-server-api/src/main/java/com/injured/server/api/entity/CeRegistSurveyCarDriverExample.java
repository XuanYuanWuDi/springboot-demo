package com.injured.server.api.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CeRegistSurveyCarDriverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CeRegistSurveyCarDriverExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andCeRegistSurveyCarIdIsNull() {
            addCriterion("ce_regist_survey_car_id is null");
            return (Criteria) this;
        }

        public Criteria andCeRegistSurveyCarIdIsNotNull() {
            addCriterion("ce_regist_survey_car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCeRegistSurveyCarIdEqualTo(Long value) {
            addCriterion("ce_regist_survey_car_id =", value, "ceRegistSurveyCarId");
            return (Criteria) this;
        }

        public Criteria andCeRegistSurveyCarIdNotEqualTo(Long value) {
            addCriterion("ce_regist_survey_car_id <>", value, "ceRegistSurveyCarId");
            return (Criteria) this;
        }

        public Criteria andCeRegistSurveyCarIdGreaterThan(Long value) {
            addCriterion("ce_regist_survey_car_id >", value, "ceRegistSurveyCarId");
            return (Criteria) this;
        }

        public Criteria andCeRegistSurveyCarIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ce_regist_survey_car_id >=", value, "ceRegistSurveyCarId");
            return (Criteria) this;
        }

        public Criteria andCeRegistSurveyCarIdLessThan(Long value) {
            addCriterion("ce_regist_survey_car_id <", value, "ceRegistSurveyCarId");
            return (Criteria) this;
        }

        public Criteria andCeRegistSurveyCarIdLessThanOrEqualTo(Long value) {
            addCriterion("ce_regist_survey_car_id <=", value, "ceRegistSurveyCarId");
            return (Criteria) this;
        }

        public Criteria andCeRegistSurveyCarIdIn(List<Long> values) {
            addCriterion("ce_regist_survey_car_id in", values, "ceRegistSurveyCarId");
            return (Criteria) this;
        }

        public Criteria andCeRegistSurveyCarIdNotIn(List<Long> values) {
            addCriterion("ce_regist_survey_car_id not in", values, "ceRegistSurveyCarId");
            return (Criteria) this;
        }

        public Criteria andCeRegistSurveyCarIdBetween(Long value1, Long value2) {
            addCriterion("ce_regist_survey_car_id between", value1, value2, "ceRegistSurveyCarId");
            return (Criteria) this;
        }

        public Criteria andCeRegistSurveyCarIdNotBetween(Long value1, Long value2) {
            addCriterion("ce_regist_survey_car_id not between", value1, value2, "ceRegistSurveyCarId");
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

        public Criteria andDriverBirthIsNull() {
            addCriterion("driver_birth is null");
            return (Criteria) this;
        }

        public Criteria andDriverBirthIsNotNull() {
            addCriterion("driver_birth is not null");
            return (Criteria) this;
        }

        public Criteria andDriverBirthEqualTo(Date value) {
            addCriterionForJDBCDate("driver_birth =", value, "driverBirth");
            return (Criteria) this;
        }

        public Criteria andDriverBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("driver_birth <>", value, "driverBirth");
            return (Criteria) this;
        }

        public Criteria andDriverBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("driver_birth >", value, "driverBirth");
            return (Criteria) this;
        }

        public Criteria andDriverBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("driver_birth >=", value, "driverBirth");
            return (Criteria) this;
        }

        public Criteria andDriverBirthLessThan(Date value) {
            addCriterionForJDBCDate("driver_birth <", value, "driverBirth");
            return (Criteria) this;
        }

        public Criteria andDriverBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("driver_birth <=", value, "driverBirth");
            return (Criteria) this;
        }

        public Criteria andDriverBirthIn(List<Date> values) {
            addCriterionForJDBCDate("driver_birth in", values, "driverBirth");
            return (Criteria) this;
        }

        public Criteria andDriverBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("driver_birth not in", values, "driverBirth");
            return (Criteria) this;
        }

        public Criteria andDriverBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("driver_birth between", value1, value2, "driverBirth");
            return (Criteria) this;
        }

        public Criteria andDriverBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("driver_birth not between", value1, value2, "driverBirth");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeIsNull() {
            addCriterion("identify_type is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeIsNotNull() {
            addCriterion("identify_type is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeEqualTo(String value) {
            addCriterion("identify_type =", value, "identifyType");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeNotEqualTo(String value) {
            addCriterion("identify_type <>", value, "identifyType");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeGreaterThan(String value) {
            addCriterion("identify_type >", value, "identifyType");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("identify_type >=", value, "identifyType");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeLessThan(String value) {
            addCriterion("identify_type <", value, "identifyType");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeLessThanOrEqualTo(String value) {
            addCriterion("identify_type <=", value, "identifyType");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeLike(String value) {
            addCriterion("identify_type like", value, "identifyType");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeNotLike(String value) {
            addCriterion("identify_type not like", value, "identifyType");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeIn(List<String> values) {
            addCriterion("identify_type in", values, "identifyType");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeNotIn(List<String> values) {
            addCriterion("identify_type not in", values, "identifyType");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeBetween(String value1, String value2) {
            addCriterion("identify_type between", value1, value2, "identifyType");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeNotBetween(String value1, String value2) {
            addCriterion("identify_type not between", value1, value2, "identifyType");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberIsNull() {
            addCriterion("identify_number is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberIsNotNull() {
            addCriterion("identify_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberEqualTo(String value) {
            addCriterion("identify_number =", value, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberNotEqualTo(String value) {
            addCriterion("identify_number <>", value, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberGreaterThan(String value) {
            addCriterion("identify_number >", value, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberGreaterThanOrEqualTo(String value) {
            addCriterion("identify_number >=", value, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberLessThan(String value) {
            addCriterion("identify_number <", value, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberLessThanOrEqualTo(String value) {
            addCriterion("identify_number <=", value, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberLike(String value) {
            addCriterion("identify_number like", value, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberNotLike(String value) {
            addCriterion("identify_number not like", value, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberIn(List<String> values) {
            addCriterion("identify_number in", values, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberNotIn(List<String> values) {
            addCriterion("identify_number not in", values, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberBetween(String value1, String value2) {
            addCriterion("identify_number between", value1, value2, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberNotBetween(String value1, String value2) {
            addCriterion("identify_number not between", value1, value2, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseNoIsNull() {
            addCriterion("driving_license_no is null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseNoIsNotNull() {
            addCriterion("driving_license_no is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseNoEqualTo(String value) {
            addCriterion("driving_license_no =", value, "drivingLicenseNo");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseNoNotEqualTo(String value) {
            addCriterion("driving_license_no <>", value, "drivingLicenseNo");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseNoGreaterThan(String value) {
            addCriterion("driving_license_no >", value, "drivingLicenseNo");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseNoGreaterThanOrEqualTo(String value) {
            addCriterion("driving_license_no >=", value, "drivingLicenseNo");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseNoLessThan(String value) {
            addCriterion("driving_license_no <", value, "drivingLicenseNo");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseNoLessThanOrEqualTo(String value) {
            addCriterion("driving_license_no <=", value, "drivingLicenseNo");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseNoLike(String value) {
            addCriterion("driving_license_no like", value, "drivingLicenseNo");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseNoNotLike(String value) {
            addCriterion("driving_license_no not like", value, "drivingLicenseNo");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseNoIn(List<String> values) {
            addCriterion("driving_license_no in", values, "drivingLicenseNo");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseNoNotIn(List<String> values) {
            addCriterion("driving_license_no not in", values, "drivingLicenseNo");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseNoBetween(String value1, String value2) {
            addCriterion("driving_license_no between", value1, value2, "drivingLicenseNo");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseNoNotBetween(String value1, String value2) {
            addCriterion("driving_license_no not between", value1, value2, "drivingLicenseNo");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseArchivesNoIsNull() {
            addCriterion("driving_license_archives_no is null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseArchivesNoIsNotNull() {
            addCriterion("driving_license_archives_no is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseArchivesNoEqualTo(String value) {
            addCriterion("driving_license_archives_no =", value, "drivingLicenseArchivesNo");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseArchivesNoNotEqualTo(String value) {
            addCriterion("driving_license_archives_no <>", value, "drivingLicenseArchivesNo");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseArchivesNoGreaterThan(String value) {
            addCriterion("driving_license_archives_no >", value, "drivingLicenseArchivesNo");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseArchivesNoGreaterThanOrEqualTo(String value) {
            addCriterion("driving_license_archives_no >=", value, "drivingLicenseArchivesNo");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseArchivesNoLessThan(String value) {
            addCriterion("driving_license_archives_no <", value, "drivingLicenseArchivesNo");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseArchivesNoLessThanOrEqualTo(String value) {
            addCriterion("driving_license_archives_no <=", value, "drivingLicenseArchivesNo");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseArchivesNoLike(String value) {
            addCriterion("driving_license_archives_no like", value, "drivingLicenseArchivesNo");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseArchivesNoNotLike(String value) {
            addCriterion("driving_license_archives_no not like", value, "drivingLicenseArchivesNo");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseArchivesNoIn(List<String> values) {
            addCriterion("driving_license_archives_no in", values, "drivingLicenseArchivesNo");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseArchivesNoNotIn(List<String> values) {
            addCriterion("driving_license_archives_no not in", values, "drivingLicenseArchivesNo");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseArchivesNoBetween(String value1, String value2) {
            addCriterion("driving_license_archives_no between", value1, value2, "drivingLicenseArchivesNo");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseArchivesNoNotBetween(String value1, String value2) {
            addCriterion("driving_license_archives_no not between", value1, value2, "drivingLicenseArchivesNo");
            return (Criteria) this;
        }

        public Criteria andDrivingIdentifyTypeIsNull() {
            addCriterion("driving_identify_type is null");
            return (Criteria) this;
        }

        public Criteria andDrivingIdentifyTypeIsNotNull() {
            addCriterion("driving_identify_type is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingIdentifyTypeEqualTo(String value) {
            addCriterion("driving_identify_type =", value, "drivingIdentifyType");
            return (Criteria) this;
        }

        public Criteria andDrivingIdentifyTypeNotEqualTo(String value) {
            addCriterion("driving_identify_type <>", value, "drivingIdentifyType");
            return (Criteria) this;
        }

        public Criteria andDrivingIdentifyTypeGreaterThan(String value) {
            addCriterion("driving_identify_type >", value, "drivingIdentifyType");
            return (Criteria) this;
        }

        public Criteria andDrivingIdentifyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("driving_identify_type >=", value, "drivingIdentifyType");
            return (Criteria) this;
        }

        public Criteria andDrivingIdentifyTypeLessThan(String value) {
            addCriterion("driving_identify_type <", value, "drivingIdentifyType");
            return (Criteria) this;
        }

        public Criteria andDrivingIdentifyTypeLessThanOrEqualTo(String value) {
            addCriterion("driving_identify_type <=", value, "drivingIdentifyType");
            return (Criteria) this;
        }

        public Criteria andDrivingIdentifyTypeLike(String value) {
            addCriterion("driving_identify_type like", value, "drivingIdentifyType");
            return (Criteria) this;
        }

        public Criteria andDrivingIdentifyTypeNotLike(String value) {
            addCriterion("driving_identify_type not like", value, "drivingIdentifyType");
            return (Criteria) this;
        }

        public Criteria andDrivingIdentifyTypeIn(List<String> values) {
            addCriterion("driving_identify_type in", values, "drivingIdentifyType");
            return (Criteria) this;
        }

        public Criteria andDrivingIdentifyTypeNotIn(List<String> values) {
            addCriterion("driving_identify_type not in", values, "drivingIdentifyType");
            return (Criteria) this;
        }

        public Criteria andDrivingIdentifyTypeBetween(String value1, String value2) {
            addCriterion("driving_identify_type between", value1, value2, "drivingIdentifyType");
            return (Criteria) this;
        }

        public Criteria andDrivingIdentifyTypeNotBetween(String value1, String value2) {
            addCriterion("driving_identify_type not between", value1, value2, "drivingIdentifyType");
            return (Criteria) this;
        }

        public Criteria andAllowDrivingVehicleIsNull() {
            addCriterion("allow_driving_vehicle is null");
            return (Criteria) this;
        }

        public Criteria andAllowDrivingVehicleIsNotNull() {
            addCriterion("allow_driving_vehicle is not null");
            return (Criteria) this;
        }

        public Criteria andAllowDrivingVehicleEqualTo(String value) {
            addCriterion("allow_driving_vehicle =", value, "allowDrivingVehicle");
            return (Criteria) this;
        }

        public Criteria andAllowDrivingVehicleNotEqualTo(String value) {
            addCriterion("allow_driving_vehicle <>", value, "allowDrivingVehicle");
            return (Criteria) this;
        }

        public Criteria andAllowDrivingVehicleGreaterThan(String value) {
            addCriterion("allow_driving_vehicle >", value, "allowDrivingVehicle");
            return (Criteria) this;
        }

        public Criteria andAllowDrivingVehicleGreaterThanOrEqualTo(String value) {
            addCriterion("allow_driving_vehicle >=", value, "allowDrivingVehicle");
            return (Criteria) this;
        }

        public Criteria andAllowDrivingVehicleLessThan(String value) {
            addCriterion("allow_driving_vehicle <", value, "allowDrivingVehicle");
            return (Criteria) this;
        }

        public Criteria andAllowDrivingVehicleLessThanOrEqualTo(String value) {
            addCriterion("allow_driving_vehicle <=", value, "allowDrivingVehicle");
            return (Criteria) this;
        }

        public Criteria andAllowDrivingVehicleLike(String value) {
            addCriterion("allow_driving_vehicle like", value, "allowDrivingVehicle");
            return (Criteria) this;
        }

        public Criteria andAllowDrivingVehicleNotLike(String value) {
            addCriterion("allow_driving_vehicle not like", value, "allowDrivingVehicle");
            return (Criteria) this;
        }

        public Criteria andAllowDrivingVehicleIn(List<String> values) {
            addCriterion("allow_driving_vehicle in", values, "allowDrivingVehicle");
            return (Criteria) this;
        }

        public Criteria andAllowDrivingVehicleNotIn(List<String> values) {
            addCriterion("allow_driving_vehicle not in", values, "allowDrivingVehicle");
            return (Criteria) this;
        }

        public Criteria andAllowDrivingVehicleBetween(String value1, String value2) {
            addCriterion("allow_driving_vehicle between", value1, value2, "allowDrivingVehicle");
            return (Criteria) this;
        }

        public Criteria andAllowDrivingVehicleNotBetween(String value1, String value2) {
            addCriterion("allow_driving_vehicle not between", value1, value2, "allowDrivingVehicle");
            return (Criteria) this;
        }

        public Criteria andDriverOccupationIsNull() {
            addCriterion("driver_occupation is null");
            return (Criteria) this;
        }

        public Criteria andDriverOccupationIsNotNull() {
            addCriterion("driver_occupation is not null");
            return (Criteria) this;
        }

        public Criteria andDriverOccupationEqualTo(String value) {
            addCriterion("driver_occupation =", value, "driverOccupation");
            return (Criteria) this;
        }

        public Criteria andDriverOccupationNotEqualTo(String value) {
            addCriterion("driver_occupation <>", value, "driverOccupation");
            return (Criteria) this;
        }

        public Criteria andDriverOccupationGreaterThan(String value) {
            addCriterion("driver_occupation >", value, "driverOccupation");
            return (Criteria) this;
        }

        public Criteria andDriverOccupationGreaterThanOrEqualTo(String value) {
            addCriterion("driver_occupation >=", value, "driverOccupation");
            return (Criteria) this;
        }

        public Criteria andDriverOccupationLessThan(String value) {
            addCriterion("driver_occupation <", value, "driverOccupation");
            return (Criteria) this;
        }

        public Criteria andDriverOccupationLessThanOrEqualTo(String value) {
            addCriterion("driver_occupation <=", value, "driverOccupation");
            return (Criteria) this;
        }

        public Criteria andDriverOccupationLike(String value) {
            addCriterion("driver_occupation like", value, "driverOccupation");
            return (Criteria) this;
        }

        public Criteria andDriverOccupationNotLike(String value) {
            addCriterion("driver_occupation not like", value, "driverOccupation");
            return (Criteria) this;
        }

        public Criteria andDriverOccupationIn(List<String> values) {
            addCriterion("driver_occupation in", values, "driverOccupation");
            return (Criteria) this;
        }

        public Criteria andDriverOccupationNotIn(List<String> values) {
            addCriterion("driver_occupation not in", values, "driverOccupation");
            return (Criteria) this;
        }

        public Criteria andDriverOccupationBetween(String value1, String value2) {
            addCriterion("driver_occupation between", value1, value2, "driverOccupation");
            return (Criteria) this;
        }

        public Criteria andDriverOccupationNotBetween(String value1, String value2) {
            addCriterion("driver_occupation not between", value1, value2, "driverOccupation");
            return (Criteria) this;
        }

        public Criteria andDriverSexIsNull() {
            addCriterion("driver_sex is null");
            return (Criteria) this;
        }

        public Criteria andDriverSexIsNotNull() {
            addCriterion("driver_sex is not null");
            return (Criteria) this;
        }

        public Criteria andDriverSexEqualTo(String value) {
            addCriterion("driver_sex =", value, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexNotEqualTo(String value) {
            addCriterion("driver_sex <>", value, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexGreaterThan(String value) {
            addCriterion("driver_sex >", value, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexGreaterThanOrEqualTo(String value) {
            addCriterion("driver_sex >=", value, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexLessThan(String value) {
            addCriterion("driver_sex <", value, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexLessThanOrEqualTo(String value) {
            addCriterion("driver_sex <=", value, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexLike(String value) {
            addCriterion("driver_sex like", value, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexNotLike(String value) {
            addCriterion("driver_sex not like", value, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexIn(List<String> values) {
            addCriterion("driver_sex in", values, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexNotIn(List<String> values) {
            addCriterion("driver_sex not in", values, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexBetween(String value1, String value2) {
            addCriterion("driver_sex between", value1, value2, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexNotBetween(String value1, String value2) {
            addCriterion("driver_sex not between", value1, value2, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverAgeIsNull() {
            addCriterion("driver_age is null");
            return (Criteria) this;
        }

        public Criteria andDriverAgeIsNotNull() {
            addCriterion("driver_age is not null");
            return (Criteria) this;
        }

        public Criteria andDriverAgeEqualTo(Integer value) {
            addCriterion("driver_age =", value, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeNotEqualTo(Integer value) {
            addCriterion("driver_age <>", value, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeGreaterThan(Integer value) {
            addCriterion("driver_age >", value, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("driver_age >=", value, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeLessThan(Integer value) {
            addCriterion("driver_age <", value, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeLessThanOrEqualTo(Integer value) {
            addCriterion("driver_age <=", value, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeIn(List<Integer> values) {
            addCriterion("driver_age in", values, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeNotIn(List<Integer> values) {
            addCriterion("driver_age not in", values, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeBetween(Integer value1, Integer value2) {
            addCriterion("driver_age between", value1, value2, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("driver_age not between", value1, value2, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneIsNull() {
            addCriterion("driver_phone is null");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneIsNotNull() {
            addCriterion("driver_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneEqualTo(String value) {
            addCriterion("driver_phone =", value, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNotEqualTo(String value) {
            addCriterion("driver_phone <>", value, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneGreaterThan(String value) {
            addCriterion("driver_phone >", value, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("driver_phone >=", value, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneLessThan(String value) {
            addCriterion("driver_phone <", value, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneLessThanOrEqualTo(String value) {
            addCriterion("driver_phone <=", value, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneLike(String value) {
            addCriterion("driver_phone like", value, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNotLike(String value) {
            addCriterion("driver_phone not like", value, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneIn(List<String> values) {
            addCriterion("driver_phone in", values, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNotIn(List<String> values) {
            addCriterion("driver_phone not in", values, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneBetween(String value1, String value2) {
            addCriterion("driver_phone between", value1, value2, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andDriverPhoneNotBetween(String value1, String value2) {
            addCriterion("driver_phone not between", value1, value2, "driverPhone");
            return (Criteria) this;
        }

        public Criteria andIsDrivingLicenseEffectiveIsNull() {
            addCriterion("is_driving_license_effective is null");
            return (Criteria) this;
        }

        public Criteria andIsDrivingLicenseEffectiveIsNotNull() {
            addCriterion("is_driving_license_effective is not null");
            return (Criteria) this;
        }

        public Criteria andIsDrivingLicenseEffectiveEqualTo(Boolean value) {
            addCriterion("is_driving_license_effective =", value, "isDrivingLicenseEffective");
            return (Criteria) this;
        }

        public Criteria andIsDrivingLicenseEffectiveNotEqualTo(Boolean value) {
            addCriterion("is_driving_license_effective <>", value, "isDrivingLicenseEffective");
            return (Criteria) this;
        }

        public Criteria andIsDrivingLicenseEffectiveGreaterThan(Boolean value) {
            addCriterion("is_driving_license_effective >", value, "isDrivingLicenseEffective");
            return (Criteria) this;
        }

        public Criteria andIsDrivingLicenseEffectiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_driving_license_effective >=", value, "isDrivingLicenseEffective");
            return (Criteria) this;
        }

        public Criteria andIsDrivingLicenseEffectiveLessThan(Boolean value) {
            addCriterion("is_driving_license_effective <", value, "isDrivingLicenseEffective");
            return (Criteria) this;
        }

        public Criteria andIsDrivingLicenseEffectiveLessThanOrEqualTo(Boolean value) {
            addCriterion("is_driving_license_effective <=", value, "isDrivingLicenseEffective");
            return (Criteria) this;
        }

        public Criteria andIsDrivingLicenseEffectiveIn(List<Boolean> values) {
            addCriterion("is_driving_license_effective in", values, "isDrivingLicenseEffective");
            return (Criteria) this;
        }

        public Criteria andIsDrivingLicenseEffectiveNotIn(List<Boolean> values) {
            addCriterion("is_driving_license_effective not in", values, "isDrivingLicenseEffective");
            return (Criteria) this;
        }

        public Criteria andIsDrivingLicenseEffectiveBetween(Boolean value1, Boolean value2) {
            addCriterion("is_driving_license_effective between", value1, value2, "isDrivingLicenseEffective");
            return (Criteria) this;
        }

        public Criteria andIsDrivingLicenseEffectiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_driving_license_effective not between", value1, value2, "isDrivingLicenseEffective");
            return (Criteria) this;
        }

        public Criteria andDriverAddressIsNull() {
            addCriterion("driver_address is null");
            return (Criteria) this;
        }

        public Criteria andDriverAddressIsNotNull() {
            addCriterion("driver_address is not null");
            return (Criteria) this;
        }

        public Criteria andDriverAddressEqualTo(String value) {
            addCriterion("driver_address =", value, "driverAddress");
            return (Criteria) this;
        }

        public Criteria andDriverAddressNotEqualTo(String value) {
            addCriterion("driver_address <>", value, "driverAddress");
            return (Criteria) this;
        }

        public Criteria andDriverAddressGreaterThan(String value) {
            addCriterion("driver_address >", value, "driverAddress");
            return (Criteria) this;
        }

        public Criteria andDriverAddressGreaterThanOrEqualTo(String value) {
            addCriterion("driver_address >=", value, "driverAddress");
            return (Criteria) this;
        }

        public Criteria andDriverAddressLessThan(String value) {
            addCriterion("driver_address <", value, "driverAddress");
            return (Criteria) this;
        }

        public Criteria andDriverAddressLessThanOrEqualTo(String value) {
            addCriterion("driver_address <=", value, "driverAddress");
            return (Criteria) this;
        }

        public Criteria andDriverAddressLike(String value) {
            addCriterion("driver_address like", value, "driverAddress");
            return (Criteria) this;
        }

        public Criteria andDriverAddressNotLike(String value) {
            addCriterion("driver_address not like", value, "driverAddress");
            return (Criteria) this;
        }

        public Criteria andDriverAddressIn(List<String> values) {
            addCriterion("driver_address in", values, "driverAddress");
            return (Criteria) this;
        }

        public Criteria andDriverAddressNotIn(List<String> values) {
            addCriterion("driver_address not in", values, "driverAddress");
            return (Criteria) this;
        }

        public Criteria andDriverAddressBetween(String value1, String value2) {
            addCriterion("driver_address between", value1, value2, "driverAddress");
            return (Criteria) this;
        }

        public Criteria andDriverAddressNotBetween(String value1, String value2) {
            addCriterion("driver_address not between", value1, value2, "driverAddress");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseDateIsNull() {
            addCriterion("driving_license_date is null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseDateIsNotNull() {
            addCriterion("driving_license_date is not null");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseDateEqualTo(Date value) {
            addCriterionForJDBCDate("driving_license_date =", value, "drivingLicenseDate");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("driving_license_date <>", value, "drivingLicenseDate");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("driving_license_date >", value, "drivingLicenseDate");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("driving_license_date >=", value, "drivingLicenseDate");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseDateLessThan(Date value) {
            addCriterionForJDBCDate("driving_license_date <", value, "drivingLicenseDate");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("driving_license_date <=", value, "drivingLicenseDate");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseDateIn(List<Date> values) {
            addCriterionForJDBCDate("driving_license_date in", values, "drivingLicenseDate");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("driving_license_date not in", values, "drivingLicenseDate");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("driving_license_date between", value1, value2, "drivingLicenseDate");
            return (Criteria) this;
        }

        public Criteria andDrivingLicenseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("driving_license_date not between", value1, value2, "drivingLicenseDate");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseInstitutionIsNull() {
            addCriterion("driver_license_institution is null");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseInstitutionIsNotNull() {
            addCriterion("driver_license_institution is not null");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseInstitutionEqualTo(String value) {
            addCriterion("driver_license_institution =", value, "driverLicenseInstitution");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseInstitutionNotEqualTo(String value) {
            addCriterion("driver_license_institution <>", value, "driverLicenseInstitution");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseInstitutionGreaterThan(String value) {
            addCriterion("driver_license_institution >", value, "driverLicenseInstitution");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseInstitutionGreaterThanOrEqualTo(String value) {
            addCriterion("driver_license_institution >=", value, "driverLicenseInstitution");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseInstitutionLessThan(String value) {
            addCriterion("driver_license_institution <", value, "driverLicenseInstitution");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseInstitutionLessThanOrEqualTo(String value) {
            addCriterion("driver_license_institution <=", value, "driverLicenseInstitution");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseInstitutionLike(String value) {
            addCriterion("driver_license_institution like", value, "driverLicenseInstitution");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseInstitutionNotLike(String value) {
            addCriterion("driver_license_institution not like", value, "driverLicenseInstitution");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseInstitutionIn(List<String> values) {
            addCriterion("driver_license_institution in", values, "driverLicenseInstitution");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseInstitutionNotIn(List<String> values) {
            addCriterion("driver_license_institution not in", values, "driverLicenseInstitution");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseInstitutionBetween(String value1, String value2) {
            addCriterion("driver_license_institution between", value1, value2, "driverLicenseInstitution");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseInstitutionNotBetween(String value1, String value2) {
            addCriterion("driver_license_institution not between", value1, value2, "driverLicenseInstitution");
            return (Criteria) this;
        }

        public Criteria andIsDrinkingDrivingIsNull() {
            addCriterion("is_drinking_driving is null");
            return (Criteria) this;
        }

        public Criteria andIsDrinkingDrivingIsNotNull() {
            addCriterion("is_drinking_driving is not null");
            return (Criteria) this;
        }

        public Criteria andIsDrinkingDrivingEqualTo(Boolean value) {
            addCriterion("is_drinking_driving =", value, "isDrinkingDriving");
            return (Criteria) this;
        }

        public Criteria andIsDrinkingDrivingNotEqualTo(Boolean value) {
            addCriterion("is_drinking_driving <>", value, "isDrinkingDriving");
            return (Criteria) this;
        }

        public Criteria andIsDrinkingDrivingGreaterThan(Boolean value) {
            addCriterion("is_drinking_driving >", value, "isDrinkingDriving");
            return (Criteria) this;
        }

        public Criteria andIsDrinkingDrivingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_drinking_driving >=", value, "isDrinkingDriving");
            return (Criteria) this;
        }

        public Criteria andIsDrinkingDrivingLessThan(Boolean value) {
            addCriterion("is_drinking_driving <", value, "isDrinkingDriving");
            return (Criteria) this;
        }

        public Criteria andIsDrinkingDrivingLessThanOrEqualTo(Boolean value) {
            addCriterion("is_drinking_driving <=", value, "isDrinkingDriving");
            return (Criteria) this;
        }

        public Criteria andIsDrinkingDrivingIn(List<Boolean> values) {
            addCriterion("is_drinking_driving in", values, "isDrinkingDriving");
            return (Criteria) this;
        }

        public Criteria andIsDrinkingDrivingNotIn(List<Boolean> values) {
            addCriterion("is_drinking_driving not in", values, "isDrinkingDriving");
            return (Criteria) this;
        }

        public Criteria andIsDrinkingDrivingBetween(Boolean value1, Boolean value2) {
            addCriterion("is_drinking_driving between", value1, value2, "isDrinkingDriving");
            return (Criteria) this;
        }

        public Criteria andIsDrinkingDrivingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_drinking_driving not between", value1, value2, "isDrinkingDriving");
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