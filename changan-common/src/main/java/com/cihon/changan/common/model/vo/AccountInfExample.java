package com.cihon.changan.common.model.vo;

import java.util.ArrayList;
import java.util.List;

public class AccountInfExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 08 10:40:50 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 08 10:40:50 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 08 10:40:50 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 08 10:40:50 CST 2019
     */
    public AccountInfExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 08 10:40:50 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 08 10:40:50 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 08 10:40:50 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 08 10:40:50 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 08 10:40:50 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 08 10:40:50 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 08 10:40:50 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 08 10:40:50 CST 2019
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
     * This method corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 08 10:40:50 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 08 10:40:50 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 08 10:40:50 CST 2019
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

        public Criteria andHeadimgIsNull() {
            addCriterion("headimg is null");
            return (Criteria) this;
        }

        public Criteria andHeadimgIsNotNull() {
            addCriterion("headimg is not null");
            return (Criteria) this;
        }

        public Criteria andHeadimgEqualTo(String value) {
            addCriterion("headimg =", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotEqualTo(String value) {
            addCriterion("headimg <>", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgGreaterThan(String value) {
            addCriterion("headimg >", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgGreaterThanOrEqualTo(String value) {
            addCriterion("headimg >=", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgLessThan(String value) {
            addCriterion("headimg <", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgLessThanOrEqualTo(String value) {
            addCriterion("headimg <=", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgLike(String value) {
            addCriterion("headimg like", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotLike(String value) {
            addCriterion("headimg not like", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgIn(List<String> values) {
            addCriterion("headimg in", values, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotIn(List<String> values) {
            addCriterion("headimg not in", values, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgBetween(String value1, String value2) {
            addCriterion("headimg between", value1, value2, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotBetween(String value1, String value2) {
            addCriterion("headimg not between", value1, value2, "headimg");
            return (Criteria) this;
        }

        public Criteria andWeixingaccountIsNull() {
            addCriterion("weixingAccount is null");
            return (Criteria) this;
        }

        public Criteria andWeixingaccountIsNotNull() {
            addCriterion("weixingAccount is not null");
            return (Criteria) this;
        }

        public Criteria andWeixingaccountEqualTo(String value) {
            addCriterion("weixingAccount =", value, "weixingaccount");
            return (Criteria) this;
        }

        public Criteria andWeixingaccountNotEqualTo(String value) {
            addCriterion("weixingAccount <>", value, "weixingaccount");
            return (Criteria) this;
        }

        public Criteria andWeixingaccountGreaterThan(String value) {
            addCriterion("weixingAccount >", value, "weixingaccount");
            return (Criteria) this;
        }

        public Criteria andWeixingaccountGreaterThanOrEqualTo(String value) {
            addCriterion("weixingAccount >=", value, "weixingaccount");
            return (Criteria) this;
        }

        public Criteria andWeixingaccountLessThan(String value) {
            addCriterion("weixingAccount <", value, "weixingaccount");
            return (Criteria) this;
        }

        public Criteria andWeixingaccountLessThanOrEqualTo(String value) {
            addCriterion("weixingAccount <=", value, "weixingaccount");
            return (Criteria) this;
        }

        public Criteria andWeixingaccountLike(String value) {
            addCriterion("weixingAccount like", value, "weixingaccount");
            return (Criteria) this;
        }

        public Criteria andWeixingaccountNotLike(String value) {
            addCriterion("weixingAccount not like", value, "weixingaccount");
            return (Criteria) this;
        }

        public Criteria andWeixingaccountIn(List<String> values) {
            addCriterion("weixingAccount in", values, "weixingaccount");
            return (Criteria) this;
        }

        public Criteria andWeixingaccountNotIn(List<String> values) {
            addCriterion("weixingAccount not in", values, "weixingaccount");
            return (Criteria) this;
        }

        public Criteria andWeixingaccountBetween(String value1, String value2) {
            addCriterion("weixingAccount between", value1, value2, "weixingaccount");
            return (Criteria) this;
        }

        public Criteria andWeixingaccountNotBetween(String value1, String value2) {
            addCriterion("weixingAccount not between", value1, value2, "weixingaccount");
            return (Criteria) this;
        }

        public Criteria andZhifubaoaccountIsNull() {
            addCriterion("zhifubaoAccount is null");
            return (Criteria) this;
        }

        public Criteria andZhifubaoaccountIsNotNull() {
            addCriterion("zhifubaoAccount is not null");
            return (Criteria) this;
        }

        public Criteria andZhifubaoaccountEqualTo(String value) {
            addCriterion("zhifubaoAccount =", value, "zhifubaoaccount");
            return (Criteria) this;
        }

        public Criteria andZhifubaoaccountNotEqualTo(String value) {
            addCriterion("zhifubaoAccount <>", value, "zhifubaoaccount");
            return (Criteria) this;
        }

        public Criteria andZhifubaoaccountGreaterThan(String value) {
            addCriterion("zhifubaoAccount >", value, "zhifubaoaccount");
            return (Criteria) this;
        }

        public Criteria andZhifubaoaccountGreaterThanOrEqualTo(String value) {
            addCriterion("zhifubaoAccount >=", value, "zhifubaoaccount");
            return (Criteria) this;
        }

        public Criteria andZhifubaoaccountLessThan(String value) {
            addCriterion("zhifubaoAccount <", value, "zhifubaoaccount");
            return (Criteria) this;
        }

        public Criteria andZhifubaoaccountLessThanOrEqualTo(String value) {
            addCriterion("zhifubaoAccount <=", value, "zhifubaoaccount");
            return (Criteria) this;
        }

        public Criteria andZhifubaoaccountLike(String value) {
            addCriterion("zhifubaoAccount like", value, "zhifubaoaccount");
            return (Criteria) this;
        }

        public Criteria andZhifubaoaccountNotLike(String value) {
            addCriterion("zhifubaoAccount not like", value, "zhifubaoaccount");
            return (Criteria) this;
        }

        public Criteria andZhifubaoaccountIn(List<String> values) {
            addCriterion("zhifubaoAccount in", values, "zhifubaoaccount");
            return (Criteria) this;
        }

        public Criteria andZhifubaoaccountNotIn(List<String> values) {
            addCriterion("zhifubaoAccount not in", values, "zhifubaoaccount");
            return (Criteria) this;
        }

        public Criteria andZhifubaoaccountBetween(String value1, String value2) {
            addCriterion("zhifubaoAccount between", value1, value2, "zhifubaoaccount");
            return (Criteria) this;
        }

        public Criteria andZhifubaoaccountNotBetween(String value1, String value2) {
            addCriterion("zhifubaoAccount not between", value1, value2, "zhifubaoaccount");
            return (Criteria) this;
        }

        public Criteria andZhifubaonameIsNull() {
            addCriterion("zhifubaoname is null");
            return (Criteria) this;
        }

        public Criteria andZhifubaonameIsNotNull() {
            addCriterion("zhifubaoname is not null");
            return (Criteria) this;
        }

        public Criteria andZhifubaonameEqualTo(String value) {
            addCriterion("zhifubaoname =", value, "zhifubaoname");
            return (Criteria) this;
        }

        public Criteria andZhifubaonameNotEqualTo(String value) {
            addCriterion("zhifubaoname <>", value, "zhifubaoname");
            return (Criteria) this;
        }

        public Criteria andZhifubaonameGreaterThan(String value) {
            addCriterion("zhifubaoname >", value, "zhifubaoname");
            return (Criteria) this;
        }

        public Criteria andZhifubaonameGreaterThanOrEqualTo(String value) {
            addCriterion("zhifubaoname >=", value, "zhifubaoname");
            return (Criteria) this;
        }

        public Criteria andZhifubaonameLessThan(String value) {
            addCriterion("zhifubaoname <", value, "zhifubaoname");
            return (Criteria) this;
        }

        public Criteria andZhifubaonameLessThanOrEqualTo(String value) {
            addCriterion("zhifubaoname <=", value, "zhifubaoname");
            return (Criteria) this;
        }

        public Criteria andZhifubaonameLike(String value) {
            addCriterion("zhifubaoname like", value, "zhifubaoname");
            return (Criteria) this;
        }

        public Criteria andZhifubaonameNotLike(String value) {
            addCriterion("zhifubaoname not like", value, "zhifubaoname");
            return (Criteria) this;
        }

        public Criteria andZhifubaonameIn(List<String> values) {
            addCriterion("zhifubaoname in", values, "zhifubaoname");
            return (Criteria) this;
        }

        public Criteria andZhifubaonameNotIn(List<String> values) {
            addCriterion("zhifubaoname not in", values, "zhifubaoname");
            return (Criteria) this;
        }

        public Criteria andZhifubaonameBetween(String value1, String value2) {
            addCriterion("zhifubaoname between", value1, value2, "zhifubaoname");
            return (Criteria) this;
        }

        public Criteria andZhifubaonameNotBetween(String value1, String value2) {
            addCriterion("zhifubaoname not between", value1, value2, "zhifubaoname");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(Integer value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(Integer value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(Integer value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(Integer value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(Integer value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(Integer value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<Integer> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<Integer> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(Integer value1, Integer value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(Integer value1, Integer value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andSuperiorIsNull() {
            addCriterion("Superior is null");
            return (Criteria) this;
        }

        public Criteria andSuperiorIsNotNull() {
            addCriterion("Superior is not null");
            return (Criteria) this;
        }

        public Criteria andSuperiorEqualTo(String value) {
            addCriterion("Superior =", value, "superior");
            return (Criteria) this;
        }

        public Criteria andSuperiorNotEqualTo(String value) {
            addCriterion("Superior <>", value, "superior");
            return (Criteria) this;
        }

        public Criteria andSuperiorGreaterThan(String value) {
            addCriterion("Superior >", value, "superior");
            return (Criteria) this;
        }

        public Criteria andSuperiorGreaterThanOrEqualTo(String value) {
            addCriterion("Superior >=", value, "superior");
            return (Criteria) this;
        }

        public Criteria andSuperiorLessThan(String value) {
            addCriterion("Superior <", value, "superior");
            return (Criteria) this;
        }

        public Criteria andSuperiorLessThanOrEqualTo(String value) {
            addCriterion("Superior <=", value, "superior");
            return (Criteria) this;
        }

        public Criteria andSuperiorLike(String value) {
            addCriterion("Superior like", value, "superior");
            return (Criteria) this;
        }

        public Criteria andSuperiorNotLike(String value) {
            addCriterion("Superior not like", value, "superior");
            return (Criteria) this;
        }

        public Criteria andSuperiorIn(List<String> values) {
            addCriterion("Superior in", values, "superior");
            return (Criteria) this;
        }

        public Criteria andSuperiorNotIn(List<String> values) {
            addCriterion("Superior not in", values, "superior");
            return (Criteria) this;
        }

        public Criteria andSuperiorBetween(String value1, String value2) {
            addCriterion("Superior between", value1, value2, "superior");
            return (Criteria) this;
        }

        public Criteria andSuperiorNotBetween(String value1, String value2) {
            addCriterion("Superior not between", value1, value2, "superior");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table account_inf
     *
     * @mbg.generated do_not_delete_during_merge Sat Jun 08 10:40:50 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table account_inf
     *
     * @mbg.generated Sat Jun 08 10:40:50 CST 2019
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