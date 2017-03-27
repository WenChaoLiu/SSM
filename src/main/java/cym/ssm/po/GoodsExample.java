package cym.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsMaxNumIsNull() {
            addCriterion("goods_max_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodsMaxNumIsNotNull() {
            addCriterion("goods_max_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsMaxNumEqualTo(Integer value) {
            addCriterion("goods_max_num =", value, "goodsMaxNum");
            return (Criteria) this;
        }

        public Criteria andGoodsMaxNumNotEqualTo(Integer value) {
            addCriterion("goods_max_num <>", value, "goodsMaxNum");
            return (Criteria) this;
        }

        public Criteria andGoodsMaxNumGreaterThan(Integer value) {
            addCriterion("goods_max_num >", value, "goodsMaxNum");
            return (Criteria) this;
        }

        public Criteria andGoodsMaxNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_max_num >=", value, "goodsMaxNum");
            return (Criteria) this;
        }

        public Criteria andGoodsMaxNumLessThan(Integer value) {
            addCriterion("goods_max_num <", value, "goodsMaxNum");
            return (Criteria) this;
        }

        public Criteria andGoodsMaxNumLessThanOrEqualTo(Integer value) {
            addCriterion("goods_max_num <=", value, "goodsMaxNum");
            return (Criteria) this;
        }

        public Criteria andGoodsMaxNumIn(List<Integer> values) {
            addCriterion("goods_max_num in", values, "goodsMaxNum");
            return (Criteria) this;
        }

        public Criteria andGoodsMaxNumNotIn(List<Integer> values) {
            addCriterion("goods_max_num not in", values, "goodsMaxNum");
            return (Criteria) this;
        }

        public Criteria andGoodsMaxNumBetween(Integer value1, Integer value2) {
            addCriterion("goods_max_num between", value1, value2, "goodsMaxNum");
            return (Criteria) this;
        }

        public Criteria andGoodsMaxNumNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_max_num not between", value1, value2, "goodsMaxNum");
            return (Criteria) this;
        }

        public Criteria andGoodsMinNumIsNull() {
            addCriterion("goods_min_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodsMinNumIsNotNull() {
            addCriterion("goods_min_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsMinNumEqualTo(Integer value) {
            addCriterion("goods_min_num =", value, "goodsMinNum");
            return (Criteria) this;
        }

        public Criteria andGoodsMinNumNotEqualTo(Integer value) {
            addCriterion("goods_min_num <>", value, "goodsMinNum");
            return (Criteria) this;
        }

        public Criteria andGoodsMinNumGreaterThan(Integer value) {
            addCriterion("goods_min_num >", value, "goodsMinNum");
            return (Criteria) this;
        }

        public Criteria andGoodsMinNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_min_num >=", value, "goodsMinNum");
            return (Criteria) this;
        }

        public Criteria andGoodsMinNumLessThan(Integer value) {
            addCriterion("goods_min_num <", value, "goodsMinNum");
            return (Criteria) this;
        }

        public Criteria andGoodsMinNumLessThanOrEqualTo(Integer value) {
            addCriterion("goods_min_num <=", value, "goodsMinNum");
            return (Criteria) this;
        }

        public Criteria andGoodsMinNumIn(List<Integer> values) {
            addCriterion("goods_min_num in", values, "goodsMinNum");
            return (Criteria) this;
        }

        public Criteria andGoodsMinNumNotIn(List<Integer> values) {
            addCriterion("goods_min_num not in", values, "goodsMinNum");
            return (Criteria) this;
        }

        public Criteria andGoodsMinNumBetween(Integer value1, Integer value2) {
            addCriterion("goods_min_num between", value1, value2, "goodsMinNum");
            return (Criteria) this;
        }

        public Criteria andGoodsMinNumNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_min_num not between", value1, value2, "goodsMinNum");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(Double value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(Double value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(Double value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(Double value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(Double value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<Double> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<Double> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(Double value1, Double value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(Double value1, Double value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIsNull() {
            addCriterion("goods_unit is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIsNotNull() {
            addCriterion("goods_unit is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitEqualTo(String value) {
            addCriterion("goods_unit =", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotEqualTo(String value) {
            addCriterion("goods_unit <>", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitGreaterThan(String value) {
            addCriterion("goods_unit >", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitGreaterThanOrEqualTo(String value) {
            addCriterion("goods_unit >=", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLessThan(String value) {
            addCriterion("goods_unit <", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLessThanOrEqualTo(String value) {
            addCriterion("goods_unit <=", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLike(String value) {
            addCriterion("goods_unit like", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotLike(String value) {
            addCriterion("goods_unit not like", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIn(List<String> values) {
            addCriterion("goods_unit in", values, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotIn(List<String> values) {
            addCriterion("goods_unit not in", values, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitBetween(String value1, String value2) {
            addCriterion("goods_unit between", value1, value2, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotBetween(String value1, String value2) {
            addCriterion("goods_unit not between", value1, value2, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsAmnoutIsNull() {
            addCriterion("goods_amnout is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmnoutIsNotNull() {
            addCriterion("goods_amnout is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmnoutEqualTo(Integer value) {
            addCriterion("goods_amnout =", value, "goodsAmnout");
            return (Criteria) this;
        }

        public Criteria andGoodsAmnoutNotEqualTo(Integer value) {
            addCriterion("goods_amnout <>", value, "goodsAmnout");
            return (Criteria) this;
        }

        public Criteria andGoodsAmnoutGreaterThan(Integer value) {
            addCriterion("goods_amnout >", value, "goodsAmnout");
            return (Criteria) this;
        }

        public Criteria andGoodsAmnoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_amnout >=", value, "goodsAmnout");
            return (Criteria) this;
        }

        public Criteria andGoodsAmnoutLessThan(Integer value) {
            addCriterion("goods_amnout <", value, "goodsAmnout");
            return (Criteria) this;
        }

        public Criteria andGoodsAmnoutLessThanOrEqualTo(Integer value) {
            addCriterion("goods_amnout <=", value, "goodsAmnout");
            return (Criteria) this;
        }

        public Criteria andGoodsAmnoutIn(List<Integer> values) {
            addCriterion("goods_amnout in", values, "goodsAmnout");
            return (Criteria) this;
        }

        public Criteria andGoodsAmnoutNotIn(List<Integer> values) {
            addCriterion("goods_amnout not in", values, "goodsAmnout");
            return (Criteria) this;
        }

        public Criteria andGoodsAmnoutBetween(Integer value1, Integer value2) {
            addCriterion("goods_amnout between", value1, value2, "goodsAmnout");
            return (Criteria) this;
        }

        public Criteria andGoodsAmnoutNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_amnout not between", value1, value2, "goodsAmnout");
            return (Criteria) this;
        }

        public Criteria andGoodsIsdeleteIsNull() {
            addCriterion("goods_isDelete is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIsdeleteIsNotNull() {
            addCriterion("goods_isDelete is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIsdeleteEqualTo(Boolean value) {
            addCriterion("goods_isDelete =", value, "goodsIsdelete");
            return (Criteria) this;
        }

        public Criteria andGoodsIsdeleteNotEqualTo(Boolean value) {
            addCriterion("goods_isDelete <>", value, "goodsIsdelete");
            return (Criteria) this;
        }

        public Criteria andGoodsIsdeleteGreaterThan(Boolean value) {
            addCriterion("goods_isDelete >", value, "goodsIsdelete");
            return (Criteria) this;
        }

        public Criteria andGoodsIsdeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("goods_isDelete >=", value, "goodsIsdelete");
            return (Criteria) this;
        }

        public Criteria andGoodsIsdeleteLessThan(Boolean value) {
            addCriterion("goods_isDelete <", value, "goodsIsdelete");
            return (Criteria) this;
        }

        public Criteria andGoodsIsdeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("goods_isDelete <=", value, "goodsIsdelete");
            return (Criteria) this;
        }

        public Criteria andGoodsIsdeleteIn(List<Boolean> values) {
            addCriterion("goods_isDelete in", values, "goodsIsdelete");
            return (Criteria) this;
        }

        public Criteria andGoodsIsdeleteNotIn(List<Boolean> values) {
            addCriterion("goods_isDelete not in", values, "goodsIsdelete");
            return (Criteria) this;
        }

        public Criteria andGoodsIsdeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("goods_isDelete between", value1, value2, "goodsIsdelete");
            return (Criteria) this;
        }

        public Criteria andGoodsIsdeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("goods_isDelete not between", value1, value2, "goodsIsdelete");
            return (Criteria) this;
        }

        public Criteria andGoodsImgpathIsNull() {
            addCriterion("goods_imgPath is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgpathIsNotNull() {
            addCriterion("goods_imgPath is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgpathEqualTo(String value) {
            addCriterion("goods_imgPath =", value, "goodsImgpath");
            return (Criteria) this;
        }

        public Criteria andGoodsImgpathNotEqualTo(String value) {
            addCriterion("goods_imgPath <>", value, "goodsImgpath");
            return (Criteria) this;
        }

        public Criteria andGoodsImgpathGreaterThan(String value) {
            addCriterion("goods_imgPath >", value, "goodsImgpath");
            return (Criteria) this;
        }

        public Criteria andGoodsImgpathGreaterThanOrEqualTo(String value) {
            addCriterion("goods_imgPath >=", value, "goodsImgpath");
            return (Criteria) this;
        }

        public Criteria andGoodsImgpathLessThan(String value) {
            addCriterion("goods_imgPath <", value, "goodsImgpath");
            return (Criteria) this;
        }

        public Criteria andGoodsImgpathLessThanOrEqualTo(String value) {
            addCriterion("goods_imgPath <=", value, "goodsImgpath");
            return (Criteria) this;
        }

        public Criteria andGoodsImgpathLike(String value) {
            addCriterion("goods_imgPath like", value, "goodsImgpath");
            return (Criteria) this;
        }

        public Criteria andGoodsImgpathNotLike(String value) {
            addCriterion("goods_imgPath not like", value, "goodsImgpath");
            return (Criteria) this;
        }

        public Criteria andGoodsImgpathIn(List<String> values) {
            addCriterion("goods_imgPath in", values, "goodsImgpath");
            return (Criteria) this;
        }

        public Criteria andGoodsImgpathNotIn(List<String> values) {
            addCriterion("goods_imgPath not in", values, "goodsImgpath");
            return (Criteria) this;
        }

        public Criteria andGoodsImgpathBetween(String value1, String value2) {
            addCriterion("goods_imgPath between", value1, value2, "goodsImgpath");
            return (Criteria) this;
        }

        public Criteria andGoodsImgpathNotBetween(String value1, String value2) {
            addCriterion("goods_imgPath not between", value1, value2, "goodsImgpath");
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