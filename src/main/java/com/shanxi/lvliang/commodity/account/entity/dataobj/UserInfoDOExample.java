package com.shanxi.lvliang.commodity.account.entity.dataobj;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoDOExample() {
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

        public Criteria andPkUserIdIsNull() {
            addCriterion("pk_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPkUserIdIsNotNull() {
            addCriterion("pk_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPkUserIdEqualTo(Long value) {
            addCriterion("pk_user_id =", value, "pkUserId");
            return (Criteria) this;
        }

        public Criteria andPkUserIdNotEqualTo(Long value) {
            addCriterion("pk_user_id <>", value, "pkUserId");
            return (Criteria) this;
        }

        public Criteria andPkUserIdGreaterThan(Long value) {
            addCriterion("pk_user_id >", value, "pkUserId");
            return (Criteria) this;
        }

        public Criteria andPkUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pk_user_id >=", value, "pkUserId");
            return (Criteria) this;
        }

        public Criteria andPkUserIdLessThan(Long value) {
            addCriterion("pk_user_id <", value, "pkUserId");
            return (Criteria) this;
        }

        public Criteria andPkUserIdLessThanOrEqualTo(Long value) {
            addCriterion("pk_user_id <=", value, "pkUserId");
            return (Criteria) this;
        }

        public Criteria andPkUserIdIn(List<Long> values) {
            addCriterion("pk_user_id in", values, "pkUserId");
            return (Criteria) this;
        }

        public Criteria andPkUserIdNotIn(List<Long> values) {
            addCriterion("pk_user_id not in", values, "pkUserId");
            return (Criteria) this;
        }

        public Criteria andPkUserIdBetween(Long value1, Long value2) {
            addCriterion("pk_user_id between", value1, value2, "pkUserId");
            return (Criteria) this;
        }

        public Criteria andPkUserIdNotBetween(Long value1, Long value2) {
            addCriterion("pk_user_id not between", value1, value2, "pkUserId");
            return (Criteria) this;
        }

        public Criteria andUserNameCnIsNull() {
            addCriterion("user_name_cn is null");
            return (Criteria) this;
        }

        public Criteria andUserNameCnIsNotNull() {
            addCriterion("user_name_cn is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameCnEqualTo(String value) {
            addCriterion("user_name_cn =", value, "userNameCn");
            return (Criteria) this;
        }

        public Criteria andUserNameCnNotEqualTo(String value) {
            addCriterion("user_name_cn <>", value, "userNameCn");
            return (Criteria) this;
        }

        public Criteria andUserNameCnGreaterThan(String value) {
            addCriterion("user_name_cn >", value, "userNameCn");
            return (Criteria) this;
        }

        public Criteria andUserNameCnGreaterThanOrEqualTo(String value) {
            addCriterion("user_name_cn >=", value, "userNameCn");
            return (Criteria) this;
        }

        public Criteria andUserNameCnLessThan(String value) {
            addCriterion("user_name_cn <", value, "userNameCn");
            return (Criteria) this;
        }

        public Criteria andUserNameCnLessThanOrEqualTo(String value) {
            addCriterion("user_name_cn <=", value, "userNameCn");
            return (Criteria) this;
        }

        public Criteria andUserNameCnLike(String value) {
            addCriterion("user_name_cn like", value, "userNameCn");
            return (Criteria) this;
        }

        public Criteria andUserNameCnNotLike(String value) {
            addCriterion("user_name_cn not like", value, "userNameCn");
            return (Criteria) this;
        }

        public Criteria andUserNameCnIn(List<String> values) {
            addCriterion("user_name_cn in", values, "userNameCn");
            return (Criteria) this;
        }

        public Criteria andUserNameCnNotIn(List<String> values) {
            addCriterion("user_name_cn not in", values, "userNameCn");
            return (Criteria) this;
        }

        public Criteria andUserNameCnBetween(String value1, String value2) {
            addCriterion("user_name_cn between", value1, value2, "userNameCn");
            return (Criteria) this;
        }

        public Criteria andUserNameCnNotBetween(String value1, String value2) {
            addCriterion("user_name_cn not between", value1, value2, "userNameCn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnIsNull() {
            addCriterion("user_name_en is null");
            return (Criteria) this;
        }

        public Criteria andUserNameEnIsNotNull() {
            addCriterion("user_name_en is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEnEqualTo(String value) {
            addCriterion("user_name_en =", value, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnNotEqualTo(String value) {
            addCriterion("user_name_en <>", value, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnGreaterThan(String value) {
            addCriterion("user_name_en >", value, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("user_name_en >=", value, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnLessThan(String value) {
            addCriterion("user_name_en <", value, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnLessThanOrEqualTo(String value) {
            addCriterion("user_name_en <=", value, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnLike(String value) {
            addCriterion("user_name_en like", value, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnNotLike(String value) {
            addCriterion("user_name_en not like", value, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnIn(List<String> values) {
            addCriterion("user_name_en in", values, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnNotIn(List<String> values) {
            addCriterion("user_name_en not in", values, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnBetween(String value1, String value2) {
            addCriterion("user_name_en between", value1, value2, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserNameEnNotBetween(String value1, String value2) {
            addCriterion("user_name_en not between", value1, value2, "userNameEn");
            return (Criteria) this;
        }

        public Criteria andUserLoginPhoneIsNull() {
            addCriterion("user_login_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginPhoneIsNotNull() {
            addCriterion("user_login_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginPhoneEqualTo(String value) {
            addCriterion("user_login_phone =", value, "userLoginPhone");
            return (Criteria) this;
        }

        public Criteria andUserLoginPhoneNotEqualTo(String value) {
            addCriterion("user_login_phone <>", value, "userLoginPhone");
            return (Criteria) this;
        }

        public Criteria andUserLoginPhoneGreaterThan(String value) {
            addCriterion("user_login_phone >", value, "userLoginPhone");
            return (Criteria) this;
        }

        public Criteria andUserLoginPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_login_phone >=", value, "userLoginPhone");
            return (Criteria) this;
        }

        public Criteria andUserLoginPhoneLessThan(String value) {
            addCriterion("user_login_phone <", value, "userLoginPhone");
            return (Criteria) this;
        }

        public Criteria andUserLoginPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_login_phone <=", value, "userLoginPhone");
            return (Criteria) this;
        }

        public Criteria andUserLoginPhoneLike(String value) {
            addCriterion("user_login_phone like", value, "userLoginPhone");
            return (Criteria) this;
        }

        public Criteria andUserLoginPhoneNotLike(String value) {
            addCriterion("user_login_phone not like", value, "userLoginPhone");
            return (Criteria) this;
        }

        public Criteria andUserLoginPhoneIn(List<String> values) {
            addCriterion("user_login_phone in", values, "userLoginPhone");
            return (Criteria) this;
        }

        public Criteria andUserLoginPhoneNotIn(List<String> values) {
            addCriterion("user_login_phone not in", values, "userLoginPhone");
            return (Criteria) this;
        }

        public Criteria andUserLoginPhoneBetween(String value1, String value2) {
            addCriterion("user_login_phone between", value1, value2, "userLoginPhone");
            return (Criteria) this;
        }

        public Criteria andUserLoginPhoneNotBetween(String value1, String value2) {
            addCriterion("user_login_phone not between", value1, value2, "userLoginPhone");
            return (Criteria) this;
        }

        public Criteria andUserLoginEimalIsNull() {
            addCriterion("user_login_eimal is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginEimalIsNotNull() {
            addCriterion("user_login_eimal is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginEimalEqualTo(String value) {
            addCriterion("user_login_eimal =", value, "userLoginEimal");
            return (Criteria) this;
        }

        public Criteria andUserLoginEimalNotEqualTo(String value) {
            addCriterion("user_login_eimal <>", value, "userLoginEimal");
            return (Criteria) this;
        }

        public Criteria andUserLoginEimalGreaterThan(String value) {
            addCriterion("user_login_eimal >", value, "userLoginEimal");
            return (Criteria) this;
        }

        public Criteria andUserLoginEimalGreaterThanOrEqualTo(String value) {
            addCriterion("user_login_eimal >=", value, "userLoginEimal");
            return (Criteria) this;
        }

        public Criteria andUserLoginEimalLessThan(String value) {
            addCriterion("user_login_eimal <", value, "userLoginEimal");
            return (Criteria) this;
        }

        public Criteria andUserLoginEimalLessThanOrEqualTo(String value) {
            addCriterion("user_login_eimal <=", value, "userLoginEimal");
            return (Criteria) this;
        }

        public Criteria andUserLoginEimalLike(String value) {
            addCriterion("user_login_eimal like", value, "userLoginEimal");
            return (Criteria) this;
        }

        public Criteria andUserLoginEimalNotLike(String value) {
            addCriterion("user_login_eimal not like", value, "userLoginEimal");
            return (Criteria) this;
        }

        public Criteria andUserLoginEimalIn(List<String> values) {
            addCriterion("user_login_eimal in", values, "userLoginEimal");
            return (Criteria) this;
        }

        public Criteria andUserLoginEimalNotIn(List<String> values) {
            addCriterion("user_login_eimal not in", values, "userLoginEimal");
            return (Criteria) this;
        }

        public Criteria andUserLoginEimalBetween(String value1, String value2) {
            addCriterion("user_login_eimal between", value1, value2, "userLoginEimal");
            return (Criteria) this;
        }

        public Criteria andUserLoginEimalNotBetween(String value1, String value2) {
            addCriterion("user_login_eimal not between", value1, value2, "userLoginEimal");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordIsNull() {
            addCriterion("user_login_password is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordIsNotNull() {
            addCriterion("user_login_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordEqualTo(String value) {
            addCriterion("user_login_password =", value, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordNotEqualTo(String value) {
            addCriterion("user_login_password <>", value, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordGreaterThan(String value) {
            addCriterion("user_login_password >", value, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_login_password >=", value, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordLessThan(String value) {
            addCriterion("user_login_password <", value, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_login_password <=", value, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordLike(String value) {
            addCriterion("user_login_password like", value, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordNotLike(String value) {
            addCriterion("user_login_password not like", value, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordIn(List<String> values) {
            addCriterion("user_login_password in", values, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordNotIn(List<String> values) {
            addCriterion("user_login_password not in", values, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordBetween(String value1, String value2) {
            addCriterion("user_login_password between", value1, value2, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordNotBetween(String value1, String value2) {
            addCriterion("user_login_password not between", value1, value2, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("is_used is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("is_used is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(String value) {
            addCriterion("is_used =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(String value) {
            addCriterion("is_used <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(String value) {
            addCriterion("is_used >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(String value) {
            addCriterion("is_used >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(String value) {
            addCriterion("is_used <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(String value) {
            addCriterion("is_used <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLike(String value) {
            addCriterion("is_used like", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotLike(String value) {
            addCriterion("is_used not like", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<String> values) {
            addCriterion("is_used in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<String> values) {
            addCriterion("is_used not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(String value1, String value2) {
            addCriterion("is_used between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(String value1, String value2) {
            addCriterion("is_used not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserCreateIsNull() {
            addCriterion("user_create is null");
            return (Criteria) this;
        }

        public Criteria andUserCreateIsNotNull() {
            addCriterion("user_create is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreateEqualTo(Date value) {
            addCriterion("user_create =", value, "userCreate");
            return (Criteria) this;
        }

        public Criteria andUserCreateNotEqualTo(Date value) {
            addCriterion("user_create <>", value, "userCreate");
            return (Criteria) this;
        }

        public Criteria andUserCreateGreaterThan(Date value) {
            addCriterion("user_create >", value, "userCreate");
            return (Criteria) this;
        }

        public Criteria andUserCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("user_create >=", value, "userCreate");
            return (Criteria) this;
        }

        public Criteria andUserCreateLessThan(Date value) {
            addCriterion("user_create <", value, "userCreate");
            return (Criteria) this;
        }

        public Criteria andUserCreateLessThanOrEqualTo(Date value) {
            addCriterion("user_create <=", value, "userCreate");
            return (Criteria) this;
        }

        public Criteria andUserCreateIn(List<Date> values) {
            addCriterion("user_create in", values, "userCreate");
            return (Criteria) this;
        }

        public Criteria andUserCreateNotIn(List<Date> values) {
            addCriterion("user_create not in", values, "userCreate");
            return (Criteria) this;
        }

        public Criteria andUserCreateBetween(Date value1, Date value2) {
            addCriterion("user_create between", value1, value2, "userCreate");
            return (Criteria) this;
        }

        public Criteria andUserCreateNotBetween(Date value1, Date value2) {
            addCriterion("user_create not between", value1, value2, "userCreate");
            return (Criteria) this;
        }

        public Criteria andUserModifiedIsNull() {
            addCriterion("user_modified is null");
            return (Criteria) this;
        }

        public Criteria andUserModifiedIsNotNull() {
            addCriterion("user_modified is not null");
            return (Criteria) this;
        }

        public Criteria andUserModifiedEqualTo(Date value) {
            addCriterion("user_modified =", value, "userModified");
            return (Criteria) this;
        }

        public Criteria andUserModifiedNotEqualTo(Date value) {
            addCriterion("user_modified <>", value, "userModified");
            return (Criteria) this;
        }

        public Criteria andUserModifiedGreaterThan(Date value) {
            addCriterion("user_modified >", value, "userModified");
            return (Criteria) this;
        }

        public Criteria andUserModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("user_modified >=", value, "userModified");
            return (Criteria) this;
        }

        public Criteria andUserModifiedLessThan(Date value) {
            addCriterion("user_modified <", value, "userModified");
            return (Criteria) this;
        }

        public Criteria andUserModifiedLessThanOrEqualTo(Date value) {
            addCriterion("user_modified <=", value, "userModified");
            return (Criteria) this;
        }

        public Criteria andUserModifiedIn(List<Date> values) {
            addCriterion("user_modified in", values, "userModified");
            return (Criteria) this;
        }

        public Criteria andUserModifiedNotIn(List<Date> values) {
            addCriterion("user_modified not in", values, "userModified");
            return (Criteria) this;
        }

        public Criteria andUserModifiedBetween(Date value1, Date value2) {
            addCriterion("user_modified between", value1, value2, "userModified");
            return (Criteria) this;
        }

        public Criteria andUserModifiedNotBetween(Date value1, Date value2) {
            addCriterion("user_modified not between", value1, value2, "userModified");
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