package com.ccctop.crowd.entity.po;

import java.util.ArrayList;
import java.util.List;

public class OrderProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderProjectExample() {
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

        public Criteria andProjectNameIsNull() {
            addCriterion("project_name is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("project_name is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("project_name =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("project_name <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("project_name >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("project_name >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("project_name <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("project_name <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("project_name like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("project_name not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("project_name in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("project_name not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("project_name between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("project_name not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andLaunchNameIsNull() {
            addCriterion("launch_name is null");
            return (Criteria) this;
        }

        public Criteria andLaunchNameIsNotNull() {
            addCriterion("launch_name is not null");
            return (Criteria) this;
        }

        public Criteria andLaunchNameEqualTo(String value) {
            addCriterion("launch_name =", value, "launchName");
            return (Criteria) this;
        }

        public Criteria andLaunchNameNotEqualTo(String value) {
            addCriterion("launch_name <>", value, "launchName");
            return (Criteria) this;
        }

        public Criteria andLaunchNameGreaterThan(String value) {
            addCriterion("launch_name >", value, "launchName");
            return (Criteria) this;
        }

        public Criteria andLaunchNameGreaterThanOrEqualTo(String value) {
            addCriterion("launch_name >=", value, "launchName");
            return (Criteria) this;
        }

        public Criteria andLaunchNameLessThan(String value) {
            addCriterion("launch_name <", value, "launchName");
            return (Criteria) this;
        }

        public Criteria andLaunchNameLessThanOrEqualTo(String value) {
            addCriterion("launch_name <=", value, "launchName");
            return (Criteria) this;
        }

        public Criteria andLaunchNameLike(String value) {
            addCriterion("launch_name like", value, "launchName");
            return (Criteria) this;
        }

        public Criteria andLaunchNameNotLike(String value) {
            addCriterion("launch_name not like", value, "launchName");
            return (Criteria) this;
        }

        public Criteria andLaunchNameIn(List<String> values) {
            addCriterion("launch_name in", values, "launchName");
            return (Criteria) this;
        }

        public Criteria andLaunchNameNotIn(List<String> values) {
            addCriterion("launch_name not in", values, "launchName");
            return (Criteria) this;
        }

        public Criteria andLaunchNameBetween(String value1, String value2) {
            addCriterion("launch_name between", value1, value2, "launchName");
            return (Criteria) this;
        }

        public Criteria andLaunchNameNotBetween(String value1, String value2) {
            addCriterion("launch_name not between", value1, value2, "launchName");
            return (Criteria) this;
        }

        public Criteria andReturnContentIsNull() {
            addCriterion("return_content is null");
            return (Criteria) this;
        }

        public Criteria andReturnContentIsNotNull() {
            addCriterion("return_content is not null");
            return (Criteria) this;
        }

        public Criteria andReturnContentEqualTo(String value) {
            addCriterion("return_content =", value, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentNotEqualTo(String value) {
            addCriterion("return_content <>", value, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentGreaterThan(String value) {
            addCriterion("return_content >", value, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentGreaterThanOrEqualTo(String value) {
            addCriterion("return_content >=", value, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentLessThan(String value) {
            addCriterion("return_content <", value, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentLessThanOrEqualTo(String value) {
            addCriterion("return_content <=", value, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentLike(String value) {
            addCriterion("return_content like", value, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentNotLike(String value) {
            addCriterion("return_content not like", value, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentIn(List<String> values) {
            addCriterion("return_content in", values, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentNotIn(List<String> values) {
            addCriterion("return_content not in", values, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentBetween(String value1, String value2) {
            addCriterion("return_content between", value1, value2, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnContentNotBetween(String value1, String value2) {
            addCriterion("return_content not between", value1, value2, "returnContent");
            return (Criteria) this;
        }

        public Criteria andReturnCountIsNull() {
            addCriterion("return_count is null");
            return (Criteria) this;
        }

        public Criteria andReturnCountIsNotNull() {
            addCriterion("return_count is not null");
            return (Criteria) this;
        }

        public Criteria andReturnCountEqualTo(Integer value) {
            addCriterion("return_count =", value, "returnCount");
            return (Criteria) this;
        }

        public Criteria andReturnCountNotEqualTo(Integer value) {
            addCriterion("return_count <>", value, "returnCount");
            return (Criteria) this;
        }

        public Criteria andReturnCountGreaterThan(Integer value) {
            addCriterion("return_count >", value, "returnCount");
            return (Criteria) this;
        }

        public Criteria andReturnCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_count >=", value, "returnCount");
            return (Criteria) this;
        }

        public Criteria andReturnCountLessThan(Integer value) {
            addCriterion("return_count <", value, "returnCount");
            return (Criteria) this;
        }

        public Criteria andReturnCountLessThanOrEqualTo(Integer value) {
            addCriterion("return_count <=", value, "returnCount");
            return (Criteria) this;
        }

        public Criteria andReturnCountIn(List<Integer> values) {
            addCriterion("return_count in", values, "returnCount");
            return (Criteria) this;
        }

        public Criteria andReturnCountNotIn(List<Integer> values) {
            addCriterion("return_count not in", values, "returnCount");
            return (Criteria) this;
        }

        public Criteria andReturnCountBetween(Integer value1, Integer value2) {
            addCriterion("return_count between", value1, value2, "returnCount");
            return (Criteria) this;
        }

        public Criteria andReturnCountNotBetween(Integer value1, Integer value2) {
            addCriterion("return_count not between", value1, value2, "returnCount");
            return (Criteria) this;
        }

        public Criteria andSupportPriceIsNull() {
            addCriterion("support_price is null");
            return (Criteria) this;
        }

        public Criteria andSupportPriceIsNotNull() {
            addCriterion("support_price is not null");
            return (Criteria) this;
        }

        public Criteria andSupportPriceEqualTo(Integer value) {
            addCriterion("support_price =", value, "supportPrice");
            return (Criteria) this;
        }

        public Criteria andSupportPriceNotEqualTo(Integer value) {
            addCriterion("support_price <>", value, "supportPrice");
            return (Criteria) this;
        }

        public Criteria andSupportPriceGreaterThan(Integer value) {
            addCriterion("support_price >", value, "supportPrice");
            return (Criteria) this;
        }

        public Criteria andSupportPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("support_price >=", value, "supportPrice");
            return (Criteria) this;
        }

        public Criteria andSupportPriceLessThan(Integer value) {
            addCriterion("support_price <", value, "supportPrice");
            return (Criteria) this;
        }

        public Criteria andSupportPriceLessThanOrEqualTo(Integer value) {
            addCriterion("support_price <=", value, "supportPrice");
            return (Criteria) this;
        }

        public Criteria andSupportPriceIn(List<Integer> values) {
            addCriterion("support_price in", values, "supportPrice");
            return (Criteria) this;
        }

        public Criteria andSupportPriceNotIn(List<Integer> values) {
            addCriterion("support_price not in", values, "supportPrice");
            return (Criteria) this;
        }

        public Criteria andSupportPriceBetween(Integer value1, Integer value2) {
            addCriterion("support_price between", value1, value2, "supportPrice");
            return (Criteria) this;
        }

        public Criteria andSupportPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("support_price not between", value1, value2, "supportPrice");
            return (Criteria) this;
        }

        public Criteria andFreightIsNull() {
            addCriterion("freight is null");
            return (Criteria) this;
        }

        public Criteria andFreightIsNotNull() {
            addCriterion("freight is not null");
            return (Criteria) this;
        }

        public Criteria andFreightEqualTo(Integer value) {
            addCriterion("freight =", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotEqualTo(Integer value) {
            addCriterion("freight <>", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThan(Integer value) {
            addCriterion("freight >", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThanOrEqualTo(Integer value) {
            addCriterion("freight >=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThan(Integer value) {
            addCriterion("freight <", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThanOrEqualTo(Integer value) {
            addCriterion("freight <=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightIn(List<Integer> values) {
            addCriterion("freight in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotIn(List<Integer> values) {
            addCriterion("freight not in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightBetween(Integer value1, Integer value2) {
            addCriterion("freight between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotBetween(Integer value1, Integer value2) {
            addCriterion("freight not between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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