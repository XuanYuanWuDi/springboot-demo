package com.injured.server.api.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CeDictConvertExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CeDictConvertExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNull() {
            addCriterion("company_code is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNotNull() {
            addCriterion("company_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeEqualTo(String value) {
            addCriterion("company_code =", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotEqualTo(String value) {
            addCriterion("company_code <>", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThan(String value) {
            addCriterion("company_code >", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("company_code >=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThan(String value) {
            addCriterion("company_code <", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("company_code <=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLike(String value) {
            addCriterion("company_code like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotLike(String value) {
            addCriterion("company_code not like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIn(List<String> values) {
            addCriterion("company_code in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotIn(List<String> values) {
            addCriterion("company_code not in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeBetween(String value1, String value2) {
            addCriterion("company_code between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("company_code not between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeCodeIsNull() {
            addCriterion("insurance_type_code is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeCodeIsNotNull() {
            addCriterion("insurance_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeCodeEqualTo(String value) {
            addCriterion("insurance_type_code =", value, "insuranceTypeCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeCodeNotEqualTo(String value) {
            addCriterion("insurance_type_code <>", value, "insuranceTypeCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeCodeGreaterThan(String value) {
            addCriterion("insurance_type_code >", value, "insuranceTypeCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_type_code >=", value, "insuranceTypeCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeCodeLessThan(String value) {
            addCriterion("insurance_type_code <", value, "insuranceTypeCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("insurance_type_code <=", value, "insuranceTypeCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeCodeLike(String value) {
            addCriterion("insurance_type_code like", value, "insuranceTypeCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeCodeNotLike(String value) {
            addCriterion("insurance_type_code not like", value, "insuranceTypeCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeCodeIn(List<String> values) {
            addCriterion("insurance_type_code in", values, "insuranceTypeCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeCodeNotIn(List<String> values) {
            addCriterion("insurance_type_code not in", values, "insuranceTypeCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeCodeBetween(String value1, String value2) {
            addCriterion("insurance_type_code between", value1, value2, "insuranceTypeCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeCodeNotBetween(String value1, String value2) {
            addCriterion("insurance_type_code not between", value1, value2, "insuranceTypeCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNameIsNull() {
            addCriterion("insurance_type_name is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNameIsNotNull() {
            addCriterion("insurance_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNameEqualTo(String value) {
            addCriterion("insurance_type_name =", value, "insuranceTypeName");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNameNotEqualTo(String value) {
            addCriterion("insurance_type_name <>", value, "insuranceTypeName");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNameGreaterThan(String value) {
            addCriterion("insurance_type_name >", value, "insuranceTypeName");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_type_name >=", value, "insuranceTypeName");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNameLessThan(String value) {
            addCriterion("insurance_type_name <", value, "insuranceTypeName");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNameLessThanOrEqualTo(String value) {
            addCriterion("insurance_type_name <=", value, "insuranceTypeName");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNameLike(String value) {
            addCriterion("insurance_type_name like", value, "insuranceTypeName");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNameNotLike(String value) {
            addCriterion("insurance_type_name not like", value, "insuranceTypeName");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNameIn(List<String> values) {
            addCriterion("insurance_type_name in", values, "insuranceTypeName");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNameNotIn(List<String> values) {
            addCriterion("insurance_type_name not in", values, "insuranceTypeName");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNameBetween(String value1, String value2) {
            addCriterion("insurance_type_name between", value1, value2, "insuranceTypeName");
            return (Criteria) this;
        }

        public Criteria andInsuranceTypeNameNotBetween(String value1, String value2) {
            addCriterion("insurance_type_name not between", value1, value2, "insuranceTypeName");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictCodeIsNull() {
            addCriterion("insurance_dict_code is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictCodeIsNotNull() {
            addCriterion("insurance_dict_code is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictCodeEqualTo(String value) {
            addCriterion("insurance_dict_code =", value, "insuranceDictCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictCodeNotEqualTo(String value) {
            addCriterion("insurance_dict_code <>", value, "insuranceDictCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictCodeGreaterThan(String value) {
            addCriterion("insurance_dict_code >", value, "insuranceDictCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictCodeGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_dict_code >=", value, "insuranceDictCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictCodeLessThan(String value) {
            addCriterion("insurance_dict_code <", value, "insuranceDictCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictCodeLessThanOrEqualTo(String value) {
            addCriterion("insurance_dict_code <=", value, "insuranceDictCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictCodeLike(String value) {
            addCriterion("insurance_dict_code like", value, "insuranceDictCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictCodeNotLike(String value) {
            addCriterion("insurance_dict_code not like", value, "insuranceDictCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictCodeIn(List<String> values) {
            addCriterion("insurance_dict_code in", values, "insuranceDictCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictCodeNotIn(List<String> values) {
            addCriterion("insurance_dict_code not in", values, "insuranceDictCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictCodeBetween(String value1, String value2) {
            addCriterion("insurance_dict_code between", value1, value2, "insuranceDictCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictCodeNotBetween(String value1, String value2) {
            addCriterion("insurance_dict_code not between", value1, value2, "insuranceDictCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictNameIsNull() {
            addCriterion("insurance_dict_name is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictNameIsNotNull() {
            addCriterion("insurance_dict_name is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictNameEqualTo(String value) {
            addCriterion("insurance_dict_name =", value, "insuranceDictName");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictNameNotEqualTo(String value) {
            addCriterion("insurance_dict_name <>", value, "insuranceDictName");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictNameGreaterThan(String value) {
            addCriterion("insurance_dict_name >", value, "insuranceDictName");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictNameGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_dict_name >=", value, "insuranceDictName");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictNameLessThan(String value) {
            addCriterion("insurance_dict_name <", value, "insuranceDictName");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictNameLessThanOrEqualTo(String value) {
            addCriterion("insurance_dict_name <=", value, "insuranceDictName");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictNameLike(String value) {
            addCriterion("insurance_dict_name like", value, "insuranceDictName");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictNameNotLike(String value) {
            addCriterion("insurance_dict_name not like", value, "insuranceDictName");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictNameIn(List<String> values) {
            addCriterion("insurance_dict_name in", values, "insuranceDictName");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictNameNotIn(List<String> values) {
            addCriterion("insurance_dict_name not in", values, "insuranceDictName");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictNameBetween(String value1, String value2) {
            addCriterion("insurance_dict_name between", value1, value2, "insuranceDictName");
            return (Criteria) this;
        }

        public Criteria andInsuranceDictNameNotBetween(String value1, String value2) {
            addCriterion("insurance_dict_name not between", value1, value2, "insuranceDictName");
            return (Criteria) this;
        }

        public Criteria andCeTypeCodeIsNull() {
            addCriterion("ce_type_code is null");
            return (Criteria) this;
        }

        public Criteria andCeTypeCodeIsNotNull() {
            addCriterion("ce_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andCeTypeCodeEqualTo(Integer value) {
            addCriterion("ce_type_code =", value, "ceTypeCode");
            return (Criteria) this;
        }

        public Criteria andCeTypeCodeNotEqualTo(Integer value) {
            addCriterion("ce_type_code <>", value, "ceTypeCode");
            return (Criteria) this;
        }

        public Criteria andCeTypeCodeGreaterThan(Integer value) {
            addCriterion("ce_type_code >", value, "ceTypeCode");
            return (Criteria) this;
        }

        public Criteria andCeTypeCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ce_type_code >=", value, "ceTypeCode");
            return (Criteria) this;
        }

        public Criteria andCeTypeCodeLessThan(Integer value) {
            addCriterion("ce_type_code <", value, "ceTypeCode");
            return (Criteria) this;
        }

        public Criteria andCeTypeCodeLessThanOrEqualTo(Integer value) {
            addCriterion("ce_type_code <=", value, "ceTypeCode");
            return (Criteria) this;
        }

        public Criteria andCeTypeCodeIn(List<Integer> values) {
            addCriterion("ce_type_code in", values, "ceTypeCode");
            return (Criteria) this;
        }

        public Criteria andCeTypeCodeNotIn(List<Integer> values) {
            addCriterion("ce_type_code not in", values, "ceTypeCode");
            return (Criteria) this;
        }

        public Criteria andCeTypeCodeBetween(Integer value1, Integer value2) {
            addCriterion("ce_type_code between", value1, value2, "ceTypeCode");
            return (Criteria) this;
        }

        public Criteria andCeTypeCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("ce_type_code not between", value1, value2, "ceTypeCode");
            return (Criteria) this;
        }

        public Criteria andCeDictCodeIsNull() {
            addCriterion("ce_dict_code is null");
            return (Criteria) this;
        }

        public Criteria andCeDictCodeIsNotNull() {
            addCriterion("ce_dict_code is not null");
            return (Criteria) this;
        }

        public Criteria andCeDictCodeEqualTo(String value) {
            addCriterion("ce_dict_code =", value, "ceDictCode");
            return (Criteria) this;
        }

        public Criteria andCeDictCodeNotEqualTo(String value) {
            addCriterion("ce_dict_code <>", value, "ceDictCode");
            return (Criteria) this;
        }

        public Criteria andCeDictCodeGreaterThan(String value) {
            addCriterion("ce_dict_code >", value, "ceDictCode");
            return (Criteria) this;
        }

        public Criteria andCeDictCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ce_dict_code >=", value, "ceDictCode");
            return (Criteria) this;
        }

        public Criteria andCeDictCodeLessThan(String value) {
            addCriterion("ce_dict_code <", value, "ceDictCode");
            return (Criteria) this;
        }

        public Criteria andCeDictCodeLessThanOrEqualTo(String value) {
            addCriterion("ce_dict_code <=", value, "ceDictCode");
            return (Criteria) this;
        }

        public Criteria andCeDictCodeLike(String value) {
            addCriterion("ce_dict_code like", value, "ceDictCode");
            return (Criteria) this;
        }

        public Criteria andCeDictCodeNotLike(String value) {
            addCriterion("ce_dict_code not like", value, "ceDictCode");
            return (Criteria) this;
        }

        public Criteria andCeDictCodeIn(List<String> values) {
            addCriterion("ce_dict_code in", values, "ceDictCode");
            return (Criteria) this;
        }

        public Criteria andCeDictCodeNotIn(List<String> values) {
            addCriterion("ce_dict_code not in", values, "ceDictCode");
            return (Criteria) this;
        }

        public Criteria andCeDictCodeBetween(String value1, String value2) {
            addCriterion("ce_dict_code between", value1, value2, "ceDictCode");
            return (Criteria) this;
        }

        public Criteria andCeDictCodeNotBetween(String value1, String value2) {
            addCriterion("ce_dict_code not between", value1, value2, "ceDictCode");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("is_valid is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("is_valid is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(Boolean value) {
            addCriterion("is_valid =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(Boolean value) {
            addCriterion("is_valid <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(Boolean value) {
            addCriterion("is_valid >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_valid >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(Boolean value) {
            addCriterion("is_valid <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(Boolean value) {
            addCriterion("is_valid <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<Boolean> values) {
            addCriterion("is_valid in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<Boolean> values) {
            addCriterion("is_valid not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(Boolean value1, Boolean value2) {
            addCriterion("is_valid between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_valid not between", value1, value2, "isValid");
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