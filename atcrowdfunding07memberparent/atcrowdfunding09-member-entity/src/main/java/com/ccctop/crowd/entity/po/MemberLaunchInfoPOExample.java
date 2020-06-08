package com.ccctop.crowd.entity.po;

import java.util.ArrayList;
import java.util.List;

public class MemberLaunchInfoPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberLaunchInfoPOExample() {
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

        public Criteria andMemberidIsNull() {
            addCriterion("memberid is null");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNotNull() {
            addCriterion("memberid is not null");
            return (Criteria) this;
        }

        public Criteria andMemberidEqualTo(Integer value) {
            addCriterion("memberid =", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotEqualTo(Integer value) {
            addCriterion("memberid <>", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThan(Integer value) {
            addCriterion("memberid >", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("memberid >=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThan(Integer value) {
            addCriterion("memberid <", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThanOrEqualTo(Integer value) {
            addCriterion("memberid <=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidIn(List<Integer> values) {
            addCriterion("memberid in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotIn(List<Integer> values) {
            addCriterion("memberid not in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidBetween(Integer value1, Integer value2) {
            addCriterion("memberid between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("memberid not between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andDescriptionSimpleIsNull() {
            addCriterion("description_simple is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionSimpleIsNotNull() {
            addCriterion("description_simple is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionSimpleEqualTo(String value) {
            addCriterion("description_simple =", value, "descriptionSimple");
            return (Criteria) this;
        }

        public Criteria andDescriptionSimpleNotEqualTo(String value) {
            addCriterion("description_simple <>", value, "descriptionSimple");
            return (Criteria) this;
        }

        public Criteria andDescriptionSimpleGreaterThan(String value) {
            addCriterion("description_simple >", value, "descriptionSimple");
            return (Criteria) this;
        }

        public Criteria andDescriptionSimpleGreaterThanOrEqualTo(String value) {
            addCriterion("description_simple >=", value, "descriptionSimple");
            return (Criteria) this;
        }

        public Criteria andDescriptionSimpleLessThan(String value) {
            addCriterion("description_simple <", value, "descriptionSimple");
            return (Criteria) this;
        }

        public Criteria andDescriptionSimpleLessThanOrEqualTo(String value) {
            addCriterion("description_simple <=", value, "descriptionSimple");
            return (Criteria) this;
        }

        public Criteria andDescriptionSimpleLike(String value) {
            addCriterion("description_simple like", value, "descriptionSimple");
            return (Criteria) this;
        }

        public Criteria andDescriptionSimpleNotLike(String value) {
            addCriterion("description_simple not like", value, "descriptionSimple");
            return (Criteria) this;
        }

        public Criteria andDescriptionSimpleIn(List<String> values) {
            addCriterion("description_simple in", values, "descriptionSimple");
            return (Criteria) this;
        }

        public Criteria andDescriptionSimpleNotIn(List<String> values) {
            addCriterion("description_simple not in", values, "descriptionSimple");
            return (Criteria) this;
        }

        public Criteria andDescriptionSimpleBetween(String value1, String value2) {
            addCriterion("description_simple between", value1, value2, "descriptionSimple");
            return (Criteria) this;
        }

        public Criteria andDescriptionSimpleNotBetween(String value1, String value2) {
            addCriterion("description_simple not between", value1, value2, "descriptionSimple");
            return (Criteria) this;
        }

        public Criteria andDescriptionDetailIsNull() {
            addCriterion("description_detail is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionDetailIsNotNull() {
            addCriterion("description_detail is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionDetailEqualTo(String value) {
            addCriterion("description_detail =", value, "descriptionDetail");
            return (Criteria) this;
        }

        public Criteria andDescriptionDetailNotEqualTo(String value) {
            addCriterion("description_detail <>", value, "descriptionDetail");
            return (Criteria) this;
        }

        public Criteria andDescriptionDetailGreaterThan(String value) {
            addCriterion("description_detail >", value, "descriptionDetail");
            return (Criteria) this;
        }

        public Criteria andDescriptionDetailGreaterThanOrEqualTo(String value) {
            addCriterion("description_detail >=", value, "descriptionDetail");
            return (Criteria) this;
        }

        public Criteria andDescriptionDetailLessThan(String value) {
            addCriterion("description_detail <", value, "descriptionDetail");
            return (Criteria) this;
        }

        public Criteria andDescriptionDetailLessThanOrEqualTo(String value) {
            addCriterion("description_detail <=", value, "descriptionDetail");
            return (Criteria) this;
        }

        public Criteria andDescriptionDetailLike(String value) {
            addCriterion("description_detail like", value, "descriptionDetail");
            return (Criteria) this;
        }

        public Criteria andDescriptionDetailNotLike(String value) {
            addCriterion("description_detail not like", value, "descriptionDetail");
            return (Criteria) this;
        }

        public Criteria andDescriptionDetailIn(List<String> values) {
            addCriterion("description_detail in", values, "descriptionDetail");
            return (Criteria) this;
        }

        public Criteria andDescriptionDetailNotIn(List<String> values) {
            addCriterion("description_detail not in", values, "descriptionDetail");
            return (Criteria) this;
        }

        public Criteria andDescriptionDetailBetween(String value1, String value2) {
            addCriterion("description_detail between", value1, value2, "descriptionDetail");
            return (Criteria) this;
        }

        public Criteria andDescriptionDetailNotBetween(String value1, String value2) {
            addCriterion("description_detail not between", value1, value2, "descriptionDetail");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNull() {
            addCriterion("phone_num is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIsNotNull() {
            addCriterion("phone_num is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumEqualTo(String value) {
            addCriterion("phone_num =", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotEqualTo(String value) {
            addCriterion("phone_num <>", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThan(String value) {
            addCriterion("phone_num >", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumGreaterThanOrEqualTo(String value) {
            addCriterion("phone_num >=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThan(String value) {
            addCriterion("phone_num <", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLessThanOrEqualTo(String value) {
            addCriterion("phone_num <=", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumLike(String value) {
            addCriterion("phone_num like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotLike(String value) {
            addCriterion("phone_num not like", value, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumIn(List<String> values) {
            addCriterion("phone_num in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotIn(List<String> values) {
            addCriterion("phone_num not in", values, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumBetween(String value1, String value2) {
            addCriterion("phone_num between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andPhoneNumNotBetween(String value1, String value2) {
            addCriterion("phone_num not between", value1, value2, "phoneNum");
            return (Criteria) this;
        }

        public Criteria andServiceNumIsNull() {
            addCriterion("service_num is null");
            return (Criteria) this;
        }

        public Criteria andServiceNumIsNotNull() {
            addCriterion("service_num is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNumEqualTo(String value) {
            addCriterion("service_num =", value, "serviceNum");
            return (Criteria) this;
        }

        public Criteria andServiceNumNotEqualTo(String value) {
            addCriterion("service_num <>", value, "serviceNum");
            return (Criteria) this;
        }

        public Criteria andServiceNumGreaterThan(String value) {
            addCriterion("service_num >", value, "serviceNum");
            return (Criteria) this;
        }

        public Criteria andServiceNumGreaterThanOrEqualTo(String value) {
            addCriterion("service_num >=", value, "serviceNum");
            return (Criteria) this;
        }

        public Criteria andServiceNumLessThan(String value) {
            addCriterion("service_num <", value, "serviceNum");
            return (Criteria) this;
        }

        public Criteria andServiceNumLessThanOrEqualTo(String value) {
            addCriterion("service_num <=", value, "serviceNum");
            return (Criteria) this;
        }

        public Criteria andServiceNumLike(String value) {
            addCriterion("service_num like", value, "serviceNum");
            return (Criteria) this;
        }

        public Criteria andServiceNumNotLike(String value) {
            addCriterion("service_num not like", value, "serviceNum");
            return (Criteria) this;
        }

        public Criteria andServiceNumIn(List<String> values) {
            addCriterion("service_num in", values, "serviceNum");
            return (Criteria) this;
        }

        public Criteria andServiceNumNotIn(List<String> values) {
            addCriterion("service_num not in", values, "serviceNum");
            return (Criteria) this;
        }

        public Criteria andServiceNumBetween(String value1, String value2) {
            addCriterion("service_num between", value1, value2, "serviceNum");
            return (Criteria) this;
        }

        public Criteria andServiceNumNotBetween(String value1, String value2) {
            addCriterion("service_num not between", value1, value2, "serviceNum");
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