package com.liushiyu.dao;

import java.util.ArrayList;
import java.util.List;

public class WechatDaoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WechatDaoExample() {
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

        public Criteria andResnameIsNull() {
            addCriterion("resName is null");
            return (Criteria) this;
        }

        public Criteria andResnameIsNotNull() {
            addCriterion("resName is not null");
            return (Criteria) this;
        }

        public Criteria andResnameEqualTo(String value) {
            addCriterion("resName =", value, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameNotEqualTo(String value) {
            addCriterion("resName <>", value, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameGreaterThan(String value) {
            addCriterion("resName >", value, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameGreaterThanOrEqualTo(String value) {
            addCriterion("resName >=", value, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameLessThan(String value) {
            addCriterion("resName <", value, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameLessThanOrEqualTo(String value) {
            addCriterion("resName <=", value, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameLike(String value) {
            addCriterion("resName like", value, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameNotLike(String value) {
            addCriterion("resName not like", value, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameIn(List<String> values) {
            addCriterion("resName in", values, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameNotIn(List<String> values) {
            addCriterion("resName not in", values, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameBetween(String value1, String value2) {
            addCriterion("resName between", value1, value2, "resname");
            return (Criteria) this;
        }

        public Criteria andResnameNotBetween(String value1, String value2) {
            addCriterion("resName not between", value1, value2, "resname");
            return (Criteria) this;
        }

        public Criteria andRestypeIsNull() {
            addCriterion("resType is null");
            return (Criteria) this;
        }

        public Criteria andRestypeIsNotNull() {
            addCriterion("resType is not null");
            return (Criteria) this;
        }

        public Criteria andRestypeEqualTo(String value) {
            addCriterion("resType =", value, "restype");
            return (Criteria) this;
        }

        public Criteria andRestypeNotEqualTo(String value) {
            addCriterion("resType <>", value, "restype");
            return (Criteria) this;
        }

        public Criteria andRestypeGreaterThan(String value) {
            addCriterion("resType >", value, "restype");
            return (Criteria) this;
        }

        public Criteria andRestypeGreaterThanOrEqualTo(String value) {
            addCriterion("resType >=", value, "restype");
            return (Criteria) this;
        }

        public Criteria andRestypeLessThan(String value) {
            addCriterion("resType <", value, "restype");
            return (Criteria) this;
        }

        public Criteria andRestypeLessThanOrEqualTo(String value) {
            addCriterion("resType <=", value, "restype");
            return (Criteria) this;
        }

        public Criteria andRestypeLike(String value) {
            addCriterion("resType like", value, "restype");
            return (Criteria) this;
        }

        public Criteria andRestypeNotLike(String value) {
            addCriterion("resType not like", value, "restype");
            return (Criteria) this;
        }

        public Criteria andRestypeIn(List<String> values) {
            addCriterion("resType in", values, "restype");
            return (Criteria) this;
        }

        public Criteria andRestypeNotIn(List<String> values) {
            addCriterion("resType not in", values, "restype");
            return (Criteria) this;
        }

        public Criteria andRestypeBetween(String value1, String value2) {
            addCriterion("resType between", value1, value2, "restype");
            return (Criteria) this;
        }

        public Criteria andRestypeNotBetween(String value1, String value2) {
            addCriterion("resType not between", value1, value2, "restype");
            return (Criteria) this;
        }

        public Criteria andResdescIsNull() {
            addCriterion("resDesc is null");
            return (Criteria) this;
        }

        public Criteria andResdescIsNotNull() {
            addCriterion("resDesc is not null");
            return (Criteria) this;
        }

        public Criteria andResdescEqualTo(String value) {
            addCriterion("resDesc =", value, "resdesc");
            return (Criteria) this;
        }

        public Criteria andResdescNotEqualTo(String value) {
            addCriterion("resDesc <>", value, "resdesc");
            return (Criteria) this;
        }

        public Criteria andResdescGreaterThan(String value) {
            addCriterion("resDesc >", value, "resdesc");
            return (Criteria) this;
        }

        public Criteria andResdescGreaterThanOrEqualTo(String value) {
            addCriterion("resDesc >=", value, "resdesc");
            return (Criteria) this;
        }

        public Criteria andResdescLessThan(String value) {
            addCriterion("resDesc <", value, "resdesc");
            return (Criteria) this;
        }

        public Criteria andResdescLessThanOrEqualTo(String value) {
            addCriterion("resDesc <=", value, "resdesc");
            return (Criteria) this;
        }

        public Criteria andResdescLike(String value) {
            addCriterion("resDesc like", value, "resdesc");
            return (Criteria) this;
        }

        public Criteria andResdescNotLike(String value) {
            addCriterion("resDesc not like", value, "resdesc");
            return (Criteria) this;
        }

        public Criteria andResdescIn(List<String> values) {
            addCriterion("resDesc in", values, "resdesc");
            return (Criteria) this;
        }

        public Criteria andResdescNotIn(List<String> values) {
            addCriterion("resDesc not in", values, "resdesc");
            return (Criteria) this;
        }

        public Criteria andResdescBetween(String value1, String value2) {
            addCriterion("resDesc between", value1, value2, "resdesc");
            return (Criteria) this;
        }

        public Criteria andResdescNotBetween(String value1, String value2) {
            addCriterion("resDesc not between", value1, value2, "resdesc");
            return (Criteria) this;
        }

        public Criteria andResimageIsNull() {
            addCriterion("resImage is null");
            return (Criteria) this;
        }

        public Criteria andResimageIsNotNull() {
            addCriterion("resImage is not null");
            return (Criteria) this;
        }

        public Criteria andResimageEqualTo(String value) {
            addCriterion("resImage =", value, "resimage");
            return (Criteria) this;
        }

        public Criteria andResimageNotEqualTo(String value) {
            addCriterion("resImage <>", value, "resimage");
            return (Criteria) this;
        }

        public Criteria andResimageGreaterThan(String value) {
            addCriterion("resImage >", value, "resimage");
            return (Criteria) this;
        }

        public Criteria andResimageGreaterThanOrEqualTo(String value) {
            addCriterion("resImage >=", value, "resimage");
            return (Criteria) this;
        }

        public Criteria andResimageLessThan(String value) {
            addCriterion("resImage <", value, "resimage");
            return (Criteria) this;
        }

        public Criteria andResimageLessThanOrEqualTo(String value) {
            addCriterion("resImage <=", value, "resimage");
            return (Criteria) this;
        }

        public Criteria andResimageLike(String value) {
            addCriterion("resImage like", value, "resimage");
            return (Criteria) this;
        }

        public Criteria andResimageNotLike(String value) {
            addCriterion("resImage not like", value, "resimage");
            return (Criteria) this;
        }

        public Criteria andResimageIn(List<String> values) {
            addCriterion("resImage in", values, "resimage");
            return (Criteria) this;
        }

        public Criteria andResimageNotIn(List<String> values) {
            addCriterion("resImage not in", values, "resimage");
            return (Criteria) this;
        }

        public Criteria andResimageBetween(String value1, String value2) {
            addCriterion("resImage between", value1, value2, "resimage");
            return (Criteria) this;
        }

        public Criteria andResimageNotBetween(String value1, String value2) {
            addCriterion("resImage not between", value1, value2, "resimage");
            return (Criteria) this;
        }

        public Criteria andResurlIsNull() {
            addCriterion("resUrl is null");
            return (Criteria) this;
        }

        public Criteria andResurlIsNotNull() {
            addCriterion("resUrl is not null");
            return (Criteria) this;
        }

        public Criteria andResurlEqualTo(String value) {
            addCriterion("resUrl =", value, "resurl");
            return (Criteria) this;
        }

        public Criteria andResurlNotEqualTo(String value) {
            addCriterion("resUrl <>", value, "resurl");
            return (Criteria) this;
        }

        public Criteria andResurlGreaterThan(String value) {
            addCriterion("resUrl >", value, "resurl");
            return (Criteria) this;
        }

        public Criteria andResurlGreaterThanOrEqualTo(String value) {
            addCriterion("resUrl >=", value, "resurl");
            return (Criteria) this;
        }

        public Criteria andResurlLessThan(String value) {
            addCriterion("resUrl <", value, "resurl");
            return (Criteria) this;
        }

        public Criteria andResurlLessThanOrEqualTo(String value) {
            addCriterion("resUrl <=", value, "resurl");
            return (Criteria) this;
        }

        public Criteria andResurlLike(String value) {
            addCriterion("resUrl like", value, "resurl");
            return (Criteria) this;
        }

        public Criteria andResurlNotLike(String value) {
            addCriterion("resUrl not like", value, "resurl");
            return (Criteria) this;
        }

        public Criteria andResurlIn(List<String> values) {
            addCriterion("resUrl in", values, "resurl");
            return (Criteria) this;
        }

        public Criteria andResurlNotIn(List<String> values) {
            addCriterion("resUrl not in", values, "resurl");
            return (Criteria) this;
        }

        public Criteria andResurlBetween(String value1, String value2) {
            addCriterion("resUrl between", value1, value2, "resurl");
            return (Criteria) this;
        }

        public Criteria andResurlNotBetween(String value1, String value2) {
            addCriterion("resUrl not between", value1, value2, "resurl");
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