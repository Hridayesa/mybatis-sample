package org.vs.mbsample.entity.gen;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BbbExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Bbb
     *
     * @mbggenerated Mon Feb 16 15:19:48 MSK 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Bbb
     *
     * @mbggenerated Mon Feb 16 15:19:48 MSK 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Bbb
     *
     * @mbggenerated Mon Feb 16 15:19:48 MSK 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Bbb
     *
     * @mbggenerated Mon Feb 16 15:19:48 MSK 2015
     */
    public BbbExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Bbb
     *
     * @mbggenerated Mon Feb 16 15:19:48 MSK 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Bbb
     *
     * @mbggenerated Mon Feb 16 15:19:48 MSK 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Bbb
     *
     * @mbggenerated Mon Feb 16 15:19:48 MSK 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Bbb
     *
     * @mbggenerated Mon Feb 16 15:19:48 MSK 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Bbb
     *
     * @mbggenerated Mon Feb 16 15:19:48 MSK 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Bbb
     *
     * @mbggenerated Mon Feb 16 15:19:48 MSK 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Bbb
     *
     * @mbggenerated Mon Feb 16 15:19:48 MSK 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Bbb
     *
     * @mbggenerated Mon Feb 16 15:19:48 MSK 2015
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
     * This method corresponds to the database table Bbb
     *
     * @mbggenerated Mon Feb 16 15:19:48 MSK 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Bbb
     *
     * @mbggenerated Mon Feb 16 15:19:48 MSK 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Bbb
     *
     * @mbggenerated Mon Feb 16 15:19:48 MSK 2015
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
            addCriterion("b.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("b.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("b.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("b.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("b.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("b.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("b.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("b.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("b.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("b.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("b.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("b.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("b.code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("b.code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("b.code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("b.code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("b.code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("b.code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("b.code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("b.code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("b.code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("b.code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("b.code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("b.code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("b.code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("b.code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("b.money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("b.money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("b.money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("b.money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("b.money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("b.money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("b.money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("b.money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("b.money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("b.money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("b.money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("b.money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andDtIsNull() {
            addCriterion("b.dt is null");
            return (Criteria) this;
        }

        public Criteria andDtIsNotNull() {
            addCriterion("b.dt is not null");
            return (Criteria) this;
        }

        public Criteria andDtEqualTo(Date value) {
            addCriterion("b.dt =", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtNotEqualTo(Date value) {
            addCriterion("b.dt <>", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtGreaterThan(Date value) {
            addCriterion("b.dt >", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtGreaterThanOrEqualTo(Date value) {
            addCriterion("b.dt >=", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtLessThan(Date value) {
            addCriterion("b.dt <", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtLessThanOrEqualTo(Date value) {
            addCriterion("b.dt <=", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtIn(List<Date> values) {
            addCriterion("b.dt in", values, "dt");
            return (Criteria) this;
        }

        public Criteria andDtNotIn(List<Date> values) {
            addCriterion("b.dt not in", values, "dt");
            return (Criteria) this;
        }

        public Criteria andDtBetween(Date value1, Date value2) {
            addCriterion("b.dt between", value1, value2, "dt");
            return (Criteria) this;
        }

        public Criteria andDtNotBetween(Date value1, Date value2) {
            addCriterion("b.dt not between", value1, value2, "dt");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("b.flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("b.flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("b.flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("b.flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("b.flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("b.flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("b.flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("b.flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("b.flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("b.flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("b.flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("b.flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andAaaIdIsNull() {
            addCriterion("b.aaa_id is null");
            return (Criteria) this;
        }

        public Criteria andAaaIdIsNotNull() {
            addCriterion("b.aaa_id is not null");
            return (Criteria) this;
        }

        public Criteria andAaaIdEqualTo(Long value) {
            addCriterion("b.aaa_id =", value, "aaaId");
            return (Criteria) this;
        }

        public Criteria andAaaIdNotEqualTo(Long value) {
            addCriterion("b.aaa_id <>", value, "aaaId");
            return (Criteria) this;
        }

        public Criteria andAaaIdGreaterThan(Long value) {
            addCriterion("b.aaa_id >", value, "aaaId");
            return (Criteria) this;
        }

        public Criteria andAaaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("b.aaa_id >=", value, "aaaId");
            return (Criteria) this;
        }

        public Criteria andAaaIdLessThan(Long value) {
            addCriterion("b.aaa_id <", value, "aaaId");
            return (Criteria) this;
        }

        public Criteria andAaaIdLessThanOrEqualTo(Long value) {
            addCriterion("b.aaa_id <=", value, "aaaId");
            return (Criteria) this;
        }

        public Criteria andAaaIdIn(List<Long> values) {
            addCriterion("b.aaa_id in", values, "aaaId");
            return (Criteria) this;
        }

        public Criteria andAaaIdNotIn(List<Long> values) {
            addCriterion("b.aaa_id not in", values, "aaaId");
            return (Criteria) this;
        }

        public Criteria andAaaIdBetween(Long value1, Long value2) {
            addCriterion("b.aaa_id between", value1, value2, "aaaId");
            return (Criteria) this;
        }

        public Criteria andAaaIdNotBetween(Long value1, Long value2) {
            addCriterion("b.aaa_id not between", value1, value2, "aaaId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Bbb
     *
     * @mbggenerated do_not_delete_during_merge Mon Feb 16 15:19:48 MSK 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Bbb
     *
     * @mbggenerated Mon Feb 16 15:19:48 MSK 2015
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