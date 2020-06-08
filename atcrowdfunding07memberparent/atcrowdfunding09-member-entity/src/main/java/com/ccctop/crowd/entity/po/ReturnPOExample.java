package com.ccctop.crowd.entity.po;

import java.util.ArrayList;
import java.util.List;

public class ReturnPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReturnPOExample() {
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

        public Criteria andProjectidIsNull() {
            addCriterion("projectid is null");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNotNull() {
            addCriterion("projectid is not null");
            return (Criteria) this;
        }

        public Criteria andProjectidEqualTo(Integer value) {
            addCriterion("projectid =", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotEqualTo(Integer value) {
            addCriterion("projectid <>", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThan(Integer value) {
            addCriterion("projectid >", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("projectid >=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThan(Integer value) {
            addCriterion("projectid <", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThanOrEqualTo(Integer value) {
            addCriterion("projectid <=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidIn(List<Integer> values) {
            addCriterion("projectid in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotIn(List<Integer> values) {
            addCriterion("projectid not in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidBetween(Integer value1, Integer value2) {
            addCriterion("projectid between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("projectid not between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andSupportmoneyIsNull() {
            addCriterion("supportmoney is null");
            return (Criteria) this;
        }

        public Criteria andSupportmoneyIsNotNull() {
            addCriterion("supportmoney is not null");
            return (Criteria) this;
        }

        public Criteria andSupportmoneyEqualTo(Integer value) {
            addCriterion("supportmoney =", value, "supportmoney");
            return (Criteria) this;
        }

        public Criteria andSupportmoneyNotEqualTo(Integer value) {
            addCriterion("supportmoney <>", value, "supportmoney");
            return (Criteria) this;
        }

        public Criteria andSupportmoneyGreaterThan(Integer value) {
            addCriterion("supportmoney >", value, "supportmoney");
            return (Criteria) this;
        }

        public Criteria andSupportmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("supportmoney >=", value, "supportmoney");
            return (Criteria) this;
        }

        public Criteria andSupportmoneyLessThan(Integer value) {
            addCriterion("supportmoney <", value, "supportmoney");
            return (Criteria) this;
        }

        public Criteria andSupportmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("supportmoney <=", value, "supportmoney");
            return (Criteria) this;
        }

        public Criteria andSupportmoneyIn(List<Integer> values) {
            addCriterion("supportmoney in", values, "supportmoney");
            return (Criteria) this;
        }

        public Criteria andSupportmoneyNotIn(List<Integer> values) {
            addCriterion("supportmoney not in", values, "supportmoney");
            return (Criteria) this;
        }

        public Criteria andSupportmoneyBetween(Integer value1, Integer value2) {
            addCriterion("supportmoney between", value1, value2, "supportmoney");
            return (Criteria) this;
        }

        public Criteria andSupportmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("supportmoney not between", value1, value2, "supportmoney");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andSignalpurchaseIsNull() {
            addCriterion("signalpurchase is null");
            return (Criteria) this;
        }

        public Criteria andSignalpurchaseIsNotNull() {
            addCriterion("signalpurchase is not null");
            return (Criteria) this;
        }

        public Criteria andSignalpurchaseEqualTo(Integer value) {
            addCriterion("signalpurchase =", value, "signalpurchase");
            return (Criteria) this;
        }

        public Criteria andSignalpurchaseNotEqualTo(Integer value) {
            addCriterion("signalpurchase <>", value, "signalpurchase");
            return (Criteria) this;
        }

        public Criteria andSignalpurchaseGreaterThan(Integer value) {
            addCriterion("signalpurchase >", value, "signalpurchase");
            return (Criteria) this;
        }

        public Criteria andSignalpurchaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("signalpurchase >=", value, "signalpurchase");
            return (Criteria) this;
        }

        public Criteria andSignalpurchaseLessThan(Integer value) {
            addCriterion("signalpurchase <", value, "signalpurchase");
            return (Criteria) this;
        }

        public Criteria andSignalpurchaseLessThanOrEqualTo(Integer value) {
            addCriterion("signalpurchase <=", value, "signalpurchase");
            return (Criteria) this;
        }

        public Criteria andSignalpurchaseIn(List<Integer> values) {
            addCriterion("signalpurchase in", values, "signalpurchase");
            return (Criteria) this;
        }

        public Criteria andSignalpurchaseNotIn(List<Integer> values) {
            addCriterion("signalpurchase not in", values, "signalpurchase");
            return (Criteria) this;
        }

        public Criteria andSignalpurchaseBetween(Integer value1, Integer value2) {
            addCriterion("signalpurchase between", value1, value2, "signalpurchase");
            return (Criteria) this;
        }

        public Criteria andSignalpurchaseNotBetween(Integer value1, Integer value2) {
            addCriterion("signalpurchase not between", value1, value2, "signalpurchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseIsNull() {
            addCriterion("purchase is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseIsNotNull() {
            addCriterion("purchase is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseEqualTo(Integer value) {
            addCriterion("purchase =", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseNotEqualTo(Integer value) {
            addCriterion("purchase <>", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseGreaterThan(Integer value) {
            addCriterion("purchase >", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase >=", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseLessThan(Integer value) {
            addCriterion("purchase <", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseLessThanOrEqualTo(Integer value) {
            addCriterion("purchase <=", value, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseIn(List<Integer> values) {
            addCriterion("purchase in", values, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseNotIn(List<Integer> values) {
            addCriterion("purchase not in", values, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseBetween(Integer value1, Integer value2) {
            addCriterion("purchase between", value1, value2, "purchase");
            return (Criteria) this;
        }

        public Criteria andPurchaseNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase not between", value1, value2, "purchase");
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

        public Criteria andInvoiceIsNull() {
            addCriterion("invoice is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("invoice is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(Integer value) {
            addCriterion("invoice =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(Integer value) {
            addCriterion("invoice <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(Integer value) {
            addCriterion("invoice >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("invoice >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(Integer value) {
            addCriterion("invoice <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(Integer value) {
            addCriterion("invoice <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<Integer> values) {
            addCriterion("invoice in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<Integer> values) {
            addCriterion("invoice not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(Integer value1, Integer value2) {
            addCriterion("invoice between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(Integer value1, Integer value2) {
            addCriterion("invoice not between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andReturndateIsNull() {
            addCriterion("returndate is null");
            return (Criteria) this;
        }

        public Criteria andReturndateIsNotNull() {
            addCriterion("returndate is not null");
            return (Criteria) this;
        }

        public Criteria andReturndateEqualTo(Integer value) {
            addCriterion("returndate =", value, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateNotEqualTo(Integer value) {
            addCriterion("returndate <>", value, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateGreaterThan(Integer value) {
            addCriterion("returndate >", value, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateGreaterThanOrEqualTo(Integer value) {
            addCriterion("returndate >=", value, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateLessThan(Integer value) {
            addCriterion("returndate <", value, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateLessThanOrEqualTo(Integer value) {
            addCriterion("returndate <=", value, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateIn(List<Integer> values) {
            addCriterion("returndate in", values, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateNotIn(List<Integer> values) {
            addCriterion("returndate not in", values, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateBetween(Integer value1, Integer value2) {
            addCriterion("returndate between", value1, value2, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateNotBetween(Integer value1, Integer value2) {
            addCriterion("returndate not between", value1, value2, "returndate");
            return (Criteria) this;
        }

        public Criteria andDescribPicPathIsNull() {
            addCriterion("describ_pic_path is null");
            return (Criteria) this;
        }

        public Criteria andDescribPicPathIsNotNull() {
            addCriterion("describ_pic_path is not null");
            return (Criteria) this;
        }

        public Criteria andDescribPicPathEqualTo(String value) {
            addCriterion("describ_pic_path =", value, "describPicPath");
            return (Criteria) this;
        }

        public Criteria andDescribPicPathNotEqualTo(String value) {
            addCriterion("describ_pic_path <>", value, "describPicPath");
            return (Criteria) this;
        }

        public Criteria andDescribPicPathGreaterThan(String value) {
            addCriterion("describ_pic_path >", value, "describPicPath");
            return (Criteria) this;
        }

        public Criteria andDescribPicPathGreaterThanOrEqualTo(String value) {
            addCriterion("describ_pic_path >=", value, "describPicPath");
            return (Criteria) this;
        }

        public Criteria andDescribPicPathLessThan(String value) {
            addCriterion("describ_pic_path <", value, "describPicPath");
            return (Criteria) this;
        }

        public Criteria andDescribPicPathLessThanOrEqualTo(String value) {
            addCriterion("describ_pic_path <=", value, "describPicPath");
            return (Criteria) this;
        }

        public Criteria andDescribPicPathLike(String value) {
            addCriterion("describ_pic_path like", value, "describPicPath");
            return (Criteria) this;
        }

        public Criteria andDescribPicPathNotLike(String value) {
            addCriterion("describ_pic_path not like", value, "describPicPath");
            return (Criteria) this;
        }

        public Criteria andDescribPicPathIn(List<String> values) {
            addCriterion("describ_pic_path in", values, "describPicPath");
            return (Criteria) this;
        }

        public Criteria andDescribPicPathNotIn(List<String> values) {
            addCriterion("describ_pic_path not in", values, "describPicPath");
            return (Criteria) this;
        }

        public Criteria andDescribPicPathBetween(String value1, String value2) {
            addCriterion("describ_pic_path between", value1, value2, "describPicPath");
            return (Criteria) this;
        }

        public Criteria andDescribPicPathNotBetween(String value1, String value2) {
            addCriterion("describ_pic_path not between", value1, value2, "describPicPath");
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