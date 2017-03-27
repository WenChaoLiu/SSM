package cym.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class ProviderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProviderExample() {
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

        public Criteria andProviderNameIsNull() {
            addCriterion("provider_name is null");
            return (Criteria) this;
        }

        public Criteria andProviderNameIsNotNull() {
            addCriterion("provider_name is not null");
            return (Criteria) this;
        }

        public Criteria andProviderNameEqualTo(String value) {
            addCriterion("provider_name =", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotEqualTo(String value) {
            addCriterion("provider_name <>", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameGreaterThan(String value) {
            addCriterion("provider_name >", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameGreaterThanOrEqualTo(String value) {
            addCriterion("provider_name >=", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameLessThan(String value) {
            addCriterion("provider_name <", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameLessThanOrEqualTo(String value) {
            addCriterion("provider_name <=", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameLike(String value) {
            addCriterion("provider_name like", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotLike(String value) {
            addCriterion("provider_name not like", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameIn(List<String> values) {
            addCriterion("provider_name in", values, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotIn(List<String> values) {
            addCriterion("provider_name not in", values, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameBetween(String value1, String value2) {
            addCriterion("provider_name between", value1, value2, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotBetween(String value1, String value2) {
            addCriterion("provider_name not between", value1, value2, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderAddressIsNull() {
            addCriterion("provider_address is null");
            return (Criteria) this;
        }

        public Criteria andProviderAddressIsNotNull() {
            addCriterion("provider_address is not null");
            return (Criteria) this;
        }

        public Criteria andProviderAddressEqualTo(String value) {
            addCriterion("provider_address =", value, "providerAddress");
            return (Criteria) this;
        }

        public Criteria andProviderAddressNotEqualTo(String value) {
            addCriterion("provider_address <>", value, "providerAddress");
            return (Criteria) this;
        }

        public Criteria andProviderAddressGreaterThan(String value) {
            addCriterion("provider_address >", value, "providerAddress");
            return (Criteria) this;
        }

        public Criteria andProviderAddressGreaterThanOrEqualTo(String value) {
            addCriterion("provider_address >=", value, "providerAddress");
            return (Criteria) this;
        }

        public Criteria andProviderAddressLessThan(String value) {
            addCriterion("provider_address <", value, "providerAddress");
            return (Criteria) this;
        }

        public Criteria andProviderAddressLessThanOrEqualTo(String value) {
            addCriterion("provider_address <=", value, "providerAddress");
            return (Criteria) this;
        }

        public Criteria andProviderAddressLike(String value) {
            addCriterion("provider_address like", value, "providerAddress");
            return (Criteria) this;
        }

        public Criteria andProviderAddressNotLike(String value) {
            addCriterion("provider_address not like", value, "providerAddress");
            return (Criteria) this;
        }

        public Criteria andProviderAddressIn(List<String> values) {
            addCriterion("provider_address in", values, "providerAddress");
            return (Criteria) this;
        }

        public Criteria andProviderAddressNotIn(List<String> values) {
            addCriterion("provider_address not in", values, "providerAddress");
            return (Criteria) this;
        }

        public Criteria andProviderAddressBetween(String value1, String value2) {
            addCriterion("provider_address between", value1, value2, "providerAddress");
            return (Criteria) this;
        }

        public Criteria andProviderAddressNotBetween(String value1, String value2) {
            addCriterion("provider_address not between", value1, value2, "providerAddress");
            return (Criteria) this;
        }

        public Criteria andProviderLinkmaleIsNull() {
            addCriterion("provider_linkmale is null");
            return (Criteria) this;
        }

        public Criteria andProviderLinkmaleIsNotNull() {
            addCriterion("provider_linkmale is not null");
            return (Criteria) this;
        }

        public Criteria andProviderLinkmaleEqualTo(String value) {
            addCriterion("provider_linkmale =", value, "providerLinkmale");
            return (Criteria) this;
        }

        public Criteria andProviderLinkmaleNotEqualTo(String value) {
            addCriterion("provider_linkmale <>", value, "providerLinkmale");
            return (Criteria) this;
        }

        public Criteria andProviderLinkmaleGreaterThan(String value) {
            addCriterion("provider_linkmale >", value, "providerLinkmale");
            return (Criteria) this;
        }

        public Criteria andProviderLinkmaleGreaterThanOrEqualTo(String value) {
            addCriterion("provider_linkmale >=", value, "providerLinkmale");
            return (Criteria) this;
        }

        public Criteria andProviderLinkmaleLessThan(String value) {
            addCriterion("provider_linkmale <", value, "providerLinkmale");
            return (Criteria) this;
        }

        public Criteria andProviderLinkmaleLessThanOrEqualTo(String value) {
            addCriterion("provider_linkmale <=", value, "providerLinkmale");
            return (Criteria) this;
        }

        public Criteria andProviderLinkmaleLike(String value) {
            addCriterion("provider_linkmale like", value, "providerLinkmale");
            return (Criteria) this;
        }

        public Criteria andProviderLinkmaleNotLike(String value) {
            addCriterion("provider_linkmale not like", value, "providerLinkmale");
            return (Criteria) this;
        }

        public Criteria andProviderLinkmaleIn(List<String> values) {
            addCriterion("provider_linkmale in", values, "providerLinkmale");
            return (Criteria) this;
        }

        public Criteria andProviderLinkmaleNotIn(List<String> values) {
            addCriterion("provider_linkmale not in", values, "providerLinkmale");
            return (Criteria) this;
        }

        public Criteria andProviderLinkmaleBetween(String value1, String value2) {
            addCriterion("provider_linkmale between", value1, value2, "providerLinkmale");
            return (Criteria) this;
        }

        public Criteria andProviderLinkmaleNotBetween(String value1, String value2) {
            addCriterion("provider_linkmale not between", value1, value2, "providerLinkmale");
            return (Criteria) this;
        }

        public Criteria andProviderTelIsNull() {
            addCriterion("provider_tel is null");
            return (Criteria) this;
        }

        public Criteria andProviderTelIsNotNull() {
            addCriterion("provider_tel is not null");
            return (Criteria) this;
        }

        public Criteria andProviderTelEqualTo(String value) {
            addCriterion("provider_tel =", value, "providerTel");
            return (Criteria) this;
        }

        public Criteria andProviderTelNotEqualTo(String value) {
            addCriterion("provider_tel <>", value, "providerTel");
            return (Criteria) this;
        }

        public Criteria andProviderTelGreaterThan(String value) {
            addCriterion("provider_tel >", value, "providerTel");
            return (Criteria) this;
        }

        public Criteria andProviderTelGreaterThanOrEqualTo(String value) {
            addCriterion("provider_tel >=", value, "providerTel");
            return (Criteria) this;
        }

        public Criteria andProviderTelLessThan(String value) {
            addCriterion("provider_tel <", value, "providerTel");
            return (Criteria) this;
        }

        public Criteria andProviderTelLessThanOrEqualTo(String value) {
            addCriterion("provider_tel <=", value, "providerTel");
            return (Criteria) this;
        }

        public Criteria andProviderTelLike(String value) {
            addCriterion("provider_tel like", value, "providerTel");
            return (Criteria) this;
        }

        public Criteria andProviderTelNotLike(String value) {
            addCriterion("provider_tel not like", value, "providerTel");
            return (Criteria) this;
        }

        public Criteria andProviderTelIn(List<String> values) {
            addCriterion("provider_tel in", values, "providerTel");
            return (Criteria) this;
        }

        public Criteria andProviderTelNotIn(List<String> values) {
            addCriterion("provider_tel not in", values, "providerTel");
            return (Criteria) this;
        }

        public Criteria andProviderTelBetween(String value1, String value2) {
            addCriterion("provider_tel between", value1, value2, "providerTel");
            return (Criteria) this;
        }

        public Criteria andProviderTelNotBetween(String value1, String value2) {
            addCriterion("provider_tel not between", value1, value2, "providerTel");
            return (Criteria) this;
        }
    }

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