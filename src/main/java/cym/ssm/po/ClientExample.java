package cym.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClientExample() {
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

        public Criteria andClientNameIsNull() {
            addCriterion("client_name is null");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNotNull() {
            addCriterion("client_name is not null");
            return (Criteria) this;
        }

        public Criteria andClientNameEqualTo(String value) {
            addCriterion("client_name =", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotEqualTo(String value) {
            addCriterion("client_name <>", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThan(String value) {
            addCriterion("client_name >", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThanOrEqualTo(String value) {
            addCriterion("client_name >=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThan(String value) {
            addCriterion("client_name <", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThanOrEqualTo(String value) {
            addCriterion("client_name <=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLike(String value) {
            addCriterion("client_name like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotLike(String value) {
            addCriterion("client_name not like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameIn(List<String> values) {
            addCriterion("client_name in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotIn(List<String> values) {
            addCriterion("client_name not in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameBetween(String value1, String value2) {
            addCriterion("client_name between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotBetween(String value1, String value2) {
            addCriterion("client_name not between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientAddressIsNull() {
            addCriterion("client_address is null");
            return (Criteria) this;
        }

        public Criteria andClientAddressIsNotNull() {
            addCriterion("client_address is not null");
            return (Criteria) this;
        }

        public Criteria andClientAddressEqualTo(String value) {
            addCriterion("client_address =", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressNotEqualTo(String value) {
            addCriterion("client_address <>", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressGreaterThan(String value) {
            addCriterion("client_address >", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressGreaterThanOrEqualTo(String value) {
            addCriterion("client_address >=", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressLessThan(String value) {
            addCriterion("client_address <", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressLessThanOrEqualTo(String value) {
            addCriterion("client_address <=", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressLike(String value) {
            addCriterion("client_address like", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressNotLike(String value) {
            addCriterion("client_address not like", value, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressIn(List<String> values) {
            addCriterion("client_address in", values, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressNotIn(List<String> values) {
            addCriterion("client_address not in", values, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressBetween(String value1, String value2) {
            addCriterion("client_address between", value1, value2, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientAddressNotBetween(String value1, String value2) {
            addCriterion("client_address not between", value1, value2, "clientAddress");
            return (Criteria) this;
        }

        public Criteria andClientTelIsNull() {
            addCriterion("client_tel is null");
            return (Criteria) this;
        }

        public Criteria andClientTelIsNotNull() {
            addCriterion("client_tel is not null");
            return (Criteria) this;
        }

        public Criteria andClientTelEqualTo(String value) {
            addCriterion("client_tel =", value, "clientTel");
            return (Criteria) this;
        }

        public Criteria andClientTelNotEqualTo(String value) {
            addCriterion("client_tel <>", value, "clientTel");
            return (Criteria) this;
        }

        public Criteria andClientTelGreaterThan(String value) {
            addCriterion("client_tel >", value, "clientTel");
            return (Criteria) this;
        }

        public Criteria andClientTelGreaterThanOrEqualTo(String value) {
            addCriterion("client_tel >=", value, "clientTel");
            return (Criteria) this;
        }

        public Criteria andClientTelLessThan(String value) {
            addCriterion("client_tel <", value, "clientTel");
            return (Criteria) this;
        }

        public Criteria andClientTelLessThanOrEqualTo(String value) {
            addCriterion("client_tel <=", value, "clientTel");
            return (Criteria) this;
        }

        public Criteria andClientTelLike(String value) {
            addCriterion("client_tel like", value, "clientTel");
            return (Criteria) this;
        }

        public Criteria andClientTelNotLike(String value) {
            addCriterion("client_tel not like", value, "clientTel");
            return (Criteria) this;
        }

        public Criteria andClientTelIn(List<String> values) {
            addCriterion("client_tel in", values, "clientTel");
            return (Criteria) this;
        }

        public Criteria andClientTelNotIn(List<String> values) {
            addCriterion("client_tel not in", values, "clientTel");
            return (Criteria) this;
        }

        public Criteria andClientTelBetween(String value1, String value2) {
            addCriterion("client_tel between", value1, value2, "clientTel");
            return (Criteria) this;
        }

        public Criteria andClientTelNotBetween(String value1, String value2) {
            addCriterion("client_tel not between", value1, value2, "clientTel");
            return (Criteria) this;
        }

        public Criteria andClientSexIsNull() {
            addCriterion("client_sex is null");
            return (Criteria) this;
        }

        public Criteria andClientSexIsNotNull() {
            addCriterion("client_sex is not null");
            return (Criteria) this;
        }

        public Criteria andClientSexEqualTo(String value) {
            addCriterion("client_sex =", value, "clientSex");
            return (Criteria) this;
        }

        public Criteria andClientSexNotEqualTo(String value) {
            addCriterion("client_sex <>", value, "clientSex");
            return (Criteria) this;
        }

        public Criteria andClientSexGreaterThan(String value) {
            addCriterion("client_sex >", value, "clientSex");
            return (Criteria) this;
        }

        public Criteria andClientSexGreaterThanOrEqualTo(String value) {
            addCriterion("client_sex >=", value, "clientSex");
            return (Criteria) this;
        }

        public Criteria andClientSexLessThan(String value) {
            addCriterion("client_sex <", value, "clientSex");
            return (Criteria) this;
        }

        public Criteria andClientSexLessThanOrEqualTo(String value) {
            addCriterion("client_sex <=", value, "clientSex");
            return (Criteria) this;
        }

        public Criteria andClientSexLike(String value) {
            addCriterion("client_sex like", value, "clientSex");
            return (Criteria) this;
        }

        public Criteria andClientSexNotLike(String value) {
            addCriterion("client_sex not like", value, "clientSex");
            return (Criteria) this;
        }

        public Criteria andClientSexIn(List<String> values) {
            addCriterion("client_sex in", values, "clientSex");
            return (Criteria) this;
        }

        public Criteria andClientSexNotIn(List<String> values) {
            addCriterion("client_sex not in", values, "clientSex");
            return (Criteria) this;
        }

        public Criteria andClientSexBetween(String value1, String value2) {
            addCriterion("client_sex between", value1, value2, "clientSex");
            return (Criteria) this;
        }

        public Criteria andClientSexNotBetween(String value1, String value2) {
            addCriterion("client_sex not between", value1, value2, "clientSex");
            return (Criteria) this;
        }

        public Criteria andClientEmailIsNull() {
            addCriterion("client_email is null");
            return (Criteria) this;
        }

        public Criteria andClientEmailIsNotNull() {
            addCriterion("client_email is not null");
            return (Criteria) this;
        }

        public Criteria andClientEmailEqualTo(String value) {
            addCriterion("client_email =", value, "clientEmail");
            return (Criteria) this;
        }

        public Criteria andClientEmailNotEqualTo(String value) {
            addCriterion("client_email <>", value, "clientEmail");
            return (Criteria) this;
        }

        public Criteria andClientEmailGreaterThan(String value) {
            addCriterion("client_email >", value, "clientEmail");
            return (Criteria) this;
        }

        public Criteria andClientEmailGreaterThanOrEqualTo(String value) {
            addCriterion("client_email >=", value, "clientEmail");
            return (Criteria) this;
        }

        public Criteria andClientEmailLessThan(String value) {
            addCriterion("client_email <", value, "clientEmail");
            return (Criteria) this;
        }

        public Criteria andClientEmailLessThanOrEqualTo(String value) {
            addCriterion("client_email <=", value, "clientEmail");
            return (Criteria) this;
        }

        public Criteria andClientEmailLike(String value) {
            addCriterion("client_email like", value, "clientEmail");
            return (Criteria) this;
        }

        public Criteria andClientEmailNotLike(String value) {
            addCriterion("client_email not like", value, "clientEmail");
            return (Criteria) this;
        }

        public Criteria andClientEmailIn(List<String> values) {
            addCriterion("client_email in", values, "clientEmail");
            return (Criteria) this;
        }

        public Criteria andClientEmailNotIn(List<String> values) {
            addCriterion("client_email not in", values, "clientEmail");
            return (Criteria) this;
        }

        public Criteria andClientEmailBetween(String value1, String value2) {
            addCriterion("client_email between", value1, value2, "clientEmail");
            return (Criteria) this;
        }

        public Criteria andClientEmailNotBetween(String value1, String value2) {
            addCriterion("client_email not between", value1, value2, "clientEmail");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNull() {
            addCriterion("client_type is null");
            return (Criteria) this;
        }

        public Criteria andClientTypeIsNotNull() {
            addCriterion("client_type is not null");
            return (Criteria) this;
        }

        public Criteria andClientTypeEqualTo(String value) {
            addCriterion("client_type =", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotEqualTo(String value) {
            addCriterion("client_type <>", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThan(String value) {
            addCriterion("client_type >", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeGreaterThanOrEqualTo(String value) {
            addCriterion("client_type >=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThan(String value) {
            addCriterion("client_type <", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLessThanOrEqualTo(String value) {
            addCriterion("client_type <=", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeLike(String value) {
            addCriterion("client_type like", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotLike(String value) {
            addCriterion("client_type not like", value, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeIn(List<String> values) {
            addCriterion("client_type in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotIn(List<String> values) {
            addCriterion("client_type not in", values, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeBetween(String value1, String value2) {
            addCriterion("client_type between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientTypeNotBetween(String value1, String value2) {
            addCriterion("client_type not between", value1, value2, "clientType");
            return (Criteria) this;
        }

        public Criteria andClientBusinessIsNull() {
            addCriterion("client_business is null");
            return (Criteria) this;
        }

        public Criteria andClientBusinessIsNotNull() {
            addCriterion("client_business is not null");
            return (Criteria) this;
        }

        public Criteria andClientBusinessEqualTo(String value) {
            addCriterion("client_business =", value, "clientBusiness");
            return (Criteria) this;
        }

        public Criteria andClientBusinessNotEqualTo(String value) {
            addCriterion("client_business <>", value, "clientBusiness");
            return (Criteria) this;
        }

        public Criteria andClientBusinessGreaterThan(String value) {
            addCriterion("client_business >", value, "clientBusiness");
            return (Criteria) this;
        }

        public Criteria andClientBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("client_business >=", value, "clientBusiness");
            return (Criteria) this;
        }

        public Criteria andClientBusinessLessThan(String value) {
            addCriterion("client_business <", value, "clientBusiness");
            return (Criteria) this;
        }

        public Criteria andClientBusinessLessThanOrEqualTo(String value) {
            addCriterion("client_business <=", value, "clientBusiness");
            return (Criteria) this;
        }

        public Criteria andClientBusinessLike(String value) {
            addCriterion("client_business like", value, "clientBusiness");
            return (Criteria) this;
        }

        public Criteria andClientBusinessNotLike(String value) {
            addCriterion("client_business not like", value, "clientBusiness");
            return (Criteria) this;
        }

        public Criteria andClientBusinessIn(List<String> values) {
            addCriterion("client_business in", values, "clientBusiness");
            return (Criteria) this;
        }

        public Criteria andClientBusinessNotIn(List<String> values) {
            addCriterion("client_business not in", values, "clientBusiness");
            return (Criteria) this;
        }

        public Criteria andClientBusinessBetween(String value1, String value2) {
            addCriterion("client_business between", value1, value2, "clientBusiness");
            return (Criteria) this;
        }

        public Criteria andClientBusinessNotBetween(String value1, String value2) {
            addCriterion("client_business not between", value1, value2, "clientBusiness");
            return (Criteria) this;
        }

        public Criteria andClientAddtimeIsNull() {
            addCriterion("client_addtime is null");
            return (Criteria) this;
        }

        public Criteria andClientAddtimeIsNotNull() {
            addCriterion("client_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andClientAddtimeEqualTo(Date value) {
            addCriterion("client_addtime =", value, "clientAddtime");
            return (Criteria) this;
        }

        public Criteria andClientAddtimeNotEqualTo(Date value) {
            addCriterion("client_addtime <>", value, "clientAddtime");
            return (Criteria) this;
        }

        public Criteria andClientAddtimeGreaterThan(Date value) {
            addCriterion("client_addtime >", value, "clientAddtime");
            return (Criteria) this;
        }

        public Criteria andClientAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("client_addtime >=", value, "clientAddtime");
            return (Criteria) this;
        }

        public Criteria andClientAddtimeLessThan(Date value) {
            addCriterion("client_addtime <", value, "clientAddtime");
            return (Criteria) this;
        }

        public Criteria andClientAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("client_addtime <=", value, "clientAddtime");
            return (Criteria) this;
        }

        public Criteria andClientAddtimeIn(List<Date> values) {
            addCriterion("client_addtime in", values, "clientAddtime");
            return (Criteria) this;
        }

        public Criteria andClientAddtimeNotIn(List<Date> values) {
            addCriterion("client_addtime not in", values, "clientAddtime");
            return (Criteria) this;
        }

        public Criteria andClientAddtimeBetween(Date value1, Date value2) {
            addCriterion("client_addtime between", value1, value2, "clientAddtime");
            return (Criteria) this;
        }

        public Criteria andClientAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("client_addtime not between", value1, value2, "clientAddtime");
            return (Criteria) this;
        }

        public Criteria andClientMobileIsNull() {
            addCriterion("client_mobile is null");
            return (Criteria) this;
        }

        public Criteria andClientMobileIsNotNull() {
            addCriterion("client_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andClientMobileEqualTo(String value) {
            addCriterion("client_mobile =", value, "clientMobile");
            return (Criteria) this;
        }

        public Criteria andClientMobileNotEqualTo(String value) {
            addCriterion("client_mobile <>", value, "clientMobile");
            return (Criteria) this;
        }

        public Criteria andClientMobileGreaterThan(String value) {
            addCriterion("client_mobile >", value, "clientMobile");
            return (Criteria) this;
        }

        public Criteria andClientMobileGreaterThanOrEqualTo(String value) {
            addCriterion("client_mobile >=", value, "clientMobile");
            return (Criteria) this;
        }

        public Criteria andClientMobileLessThan(String value) {
            addCriterion("client_mobile <", value, "clientMobile");
            return (Criteria) this;
        }

        public Criteria andClientMobileLessThanOrEqualTo(String value) {
            addCriterion("client_mobile <=", value, "clientMobile");
            return (Criteria) this;
        }

        public Criteria andClientMobileLike(String value) {
            addCriterion("client_mobile like", value, "clientMobile");
            return (Criteria) this;
        }

        public Criteria andClientMobileNotLike(String value) {
            addCriterion("client_mobile not like", value, "clientMobile");
            return (Criteria) this;
        }

        public Criteria andClientMobileIn(List<String> values) {
            addCriterion("client_mobile in", values, "clientMobile");
            return (Criteria) this;
        }

        public Criteria andClientMobileNotIn(List<String> values) {
            addCriterion("client_mobile not in", values, "clientMobile");
            return (Criteria) this;
        }

        public Criteria andClientMobileBetween(String value1, String value2) {
            addCriterion("client_mobile between", value1, value2, "clientMobile");
            return (Criteria) this;
        }

        public Criteria andClientMobileNotBetween(String value1, String value2) {
            addCriterion("client_mobile not between", value1, value2, "clientMobile");
            return (Criteria) this;
        }

        public Criteria andClientIsdelIsNull() {
            addCriterion("client_isdel is null");
            return (Criteria) this;
        }

        public Criteria andClientIsdelIsNotNull() {
            addCriterion("client_isdel is not null");
            return (Criteria) this;
        }

        public Criteria andClientIsdelEqualTo(Integer value) {
            addCriterion("client_isdel =", value, "clientIsdel");
            return (Criteria) this;
        }

        public Criteria andClientIsdelNotEqualTo(Integer value) {
            addCriterion("client_isdel <>", value, "clientIsdel");
            return (Criteria) this;
        }

        public Criteria andClientIsdelGreaterThan(Integer value) {
            addCriterion("client_isdel >", value, "clientIsdel");
            return (Criteria) this;
        }

        public Criteria andClientIsdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("client_isdel >=", value, "clientIsdel");
            return (Criteria) this;
        }

        public Criteria andClientIsdelLessThan(Integer value) {
            addCriterion("client_isdel <", value, "clientIsdel");
            return (Criteria) this;
        }

        public Criteria andClientIsdelLessThanOrEqualTo(Integer value) {
            addCriterion("client_isdel <=", value, "clientIsdel");
            return (Criteria) this;
        }

        public Criteria andClientIsdelIn(List<Integer> values) {
            addCriterion("client_isdel in", values, "clientIsdel");
            return (Criteria) this;
        }

        public Criteria andClientIsdelNotIn(List<Integer> values) {
            addCriterion("client_isdel not in", values, "clientIsdel");
            return (Criteria) this;
        }

        public Criteria andClientIsdelBetween(Integer value1, Integer value2) {
            addCriterion("client_isdel between", value1, value2, "clientIsdel");
            return (Criteria) this;
        }

        public Criteria andClientIsdelNotBetween(Integer value1, Integer value2) {
            addCriterion("client_isdel not between", value1, value2, "clientIsdel");
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