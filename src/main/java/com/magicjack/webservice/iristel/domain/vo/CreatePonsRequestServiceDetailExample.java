package com.magicjack.webservice.iristel.domain.vo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CreatePonsRequestServiceDetailExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    public CreatePonsRequestServiceDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSeqIsNull() {
            addCriterion("SEQ is null");
            return (Criteria) this;
        }

        public Criteria andSeqIsNotNull() {
            addCriterion("SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andSeqEqualTo(BigDecimal value) {
            addCriterion("SEQ =", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotEqualTo(BigDecimal value) {
            addCriterion("SEQ <>", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThan(BigDecimal value) {
            addCriterion("SEQ >", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQ >=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThan(BigDecimal value) {
            addCriterion("SEQ <", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SEQ <=", value, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqIn(List<BigDecimal> values) {
            addCriterion("SEQ in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotIn(List<BigDecimal> values) {
            addCriterion("SEQ not in", values, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQ between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andSeqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEQ not between", value1, value2, "seq");
            return (Criteria) this;
        }

        public Criteria andActivityIsNull() {
            addCriterion("ACTIVITY is null");
            return (Criteria) this;
        }

        public Criteria andActivityIsNotNull() {
            addCriterion("ACTIVITY is not null");
            return (Criteria) this;
        }

        public Criteria andActivityEqualTo(String value) {
            addCriterion("ACTIVITY =", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotEqualTo(String value) {
            addCriterion("ACTIVITY <>", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThan(String value) {
            addCriterion("ACTIVITY >", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY >=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThan(String value) {
            addCriterion("ACTIVITY <", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY <=", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityLike(String value) {
            addCriterion("ACTIVITY like", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotLike(String value) {
            addCriterion("ACTIVITY not like", value, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityIn(List<String> values) {
            addCriterion("ACTIVITY in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotIn(List<String> values) {
            addCriterion("ACTIVITY not in", values, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityBetween(String value1, String value2) {
            addCriterion("ACTIVITY between", value1, value2, "activity");
            return (Criteria) this;
        }

        public Criteria andActivityNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY not between", value1, value2, "activity");
            return (Criteria) this;
        }

        public Criteria andExistingAccountNumberIsNull() {
            addCriterion("EXISTING_ACCOUNT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andExistingAccountNumberIsNotNull() {
            addCriterion("EXISTING_ACCOUNT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andExistingAccountNumberEqualTo(String value) {
            addCriterion("EXISTING_ACCOUNT_NUMBER =", value, "existingAccountNumber");
            return (Criteria) this;
        }

        public Criteria andExistingAccountNumberNotEqualTo(String value) {
            addCriterion("EXISTING_ACCOUNT_NUMBER <>", value, "existingAccountNumber");
            return (Criteria) this;
        }

        public Criteria andExistingAccountNumberGreaterThan(String value) {
            addCriterion("EXISTING_ACCOUNT_NUMBER >", value, "existingAccountNumber");
            return (Criteria) this;
        }

        public Criteria andExistingAccountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("EXISTING_ACCOUNT_NUMBER >=", value, "existingAccountNumber");
            return (Criteria) this;
        }

        public Criteria andExistingAccountNumberLessThan(String value) {
            addCriterion("EXISTING_ACCOUNT_NUMBER <", value, "existingAccountNumber");
            return (Criteria) this;
        }

        public Criteria andExistingAccountNumberLessThanOrEqualTo(String value) {
            addCriterion("EXISTING_ACCOUNT_NUMBER <=", value, "existingAccountNumber");
            return (Criteria) this;
        }

        public Criteria andExistingAccountNumberLike(String value) {
            addCriterion("EXISTING_ACCOUNT_NUMBER like", value, "existingAccountNumber");
            return (Criteria) this;
        }

        public Criteria andExistingAccountNumberNotLike(String value) {
            addCriterion("EXISTING_ACCOUNT_NUMBER not like", value, "existingAccountNumber");
            return (Criteria) this;
        }

        public Criteria andExistingAccountNumberIn(List<String> values) {
            addCriterion("EXISTING_ACCOUNT_NUMBER in", values, "existingAccountNumber");
            return (Criteria) this;
        }

        public Criteria andExistingAccountNumberNotIn(List<String> values) {
            addCriterion("EXISTING_ACCOUNT_NUMBER not in", values, "existingAccountNumber");
            return (Criteria) this;
        }

        public Criteria andExistingAccountNumberBetween(String value1, String value2) {
            addCriterion("EXISTING_ACCOUNT_NUMBER between", value1, value2, "existingAccountNumber");
            return (Criteria) this;
        }

        public Criteria andExistingAccountNumberNotBetween(String value1, String value2) {
            addCriterion("EXISTING_ACCOUNT_NUMBER not between", value1, value2, "existingAccountNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberIsNull() {
            addCriterion("START_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andStartNumberIsNotNull() {
            addCriterion("START_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andStartNumberEqualTo(String value) {
            addCriterion("START_NUMBER =", value, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberNotEqualTo(String value) {
            addCriterion("START_NUMBER <>", value, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberGreaterThan(String value) {
            addCriterion("START_NUMBER >", value, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberGreaterThanOrEqualTo(String value) {
            addCriterion("START_NUMBER >=", value, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberLessThan(String value) {
            addCriterion("START_NUMBER <", value, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberLessThanOrEqualTo(String value) {
            addCriterion("START_NUMBER <=", value, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberLike(String value) {
            addCriterion("START_NUMBER like", value, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberNotLike(String value) {
            addCriterion("START_NUMBER not like", value, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberIn(List<String> values) {
            addCriterion("START_NUMBER in", values, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberNotIn(List<String> values) {
            addCriterion("START_NUMBER not in", values, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberBetween(String value1, String value2) {
            addCriterion("START_NUMBER between", value1, value2, "startNumber");
            return (Criteria) this;
        }

        public Criteria andStartNumberNotBetween(String value1, String value2) {
            addCriterion("START_NUMBER not between", value1, value2, "startNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberIsNull() {
            addCriterion("END_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andEndNumberIsNotNull() {
            addCriterion("END_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andEndNumberEqualTo(String value) {
            addCriterion("END_NUMBER =", value, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberNotEqualTo(String value) {
            addCriterion("END_NUMBER <>", value, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberGreaterThan(String value) {
            addCriterion("END_NUMBER >", value, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberGreaterThanOrEqualTo(String value) {
            addCriterion("END_NUMBER >=", value, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberLessThan(String value) {
            addCriterion("END_NUMBER <", value, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberLessThanOrEqualTo(String value) {
            addCriterion("END_NUMBER <=", value, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberLike(String value) {
            addCriterion("END_NUMBER like", value, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberNotLike(String value) {
            addCriterion("END_NUMBER not like", value, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberIn(List<String> values) {
            addCriterion("END_NUMBER in", values, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberNotIn(List<String> values) {
            addCriterion("END_NUMBER not in", values, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberBetween(String value1, String value2) {
            addCriterion("END_NUMBER between", value1, value2, "endNumber");
            return (Criteria) this;
        }

        public Criteria andEndNumberNotBetween(String value1, String value2) {
            addCriterion("END_NUMBER not between", value1, value2, "endNumber");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated do_not_delete_during_merge Thu May 24 14:15:07 CDT 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table MSUN.CREATE_PONS_REQ_SVS_DETAILS
     *
     * @mbg.generated Thu May 24 14:15:07 CDT 2018
     */
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