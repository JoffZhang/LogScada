package com.hx.vr.logscada.modules.log.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BoxOperationLogCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BoxOperationLogCriteria() {
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

        public Criteria andSysTypeIsNull() {
            addCriterion("sys_type is null");
            return (Criteria) this;
        }

        public Criteria andSysTypeIsNotNull() {
            addCriterion("sys_type is not null");
            return (Criteria) this;
        }

        public Criteria andSysTypeEqualTo(Byte value) {
            addCriterion("sys_type =", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeNotEqualTo(Byte value) {
            addCriterion("sys_type <>", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeGreaterThan(Byte value) {
            addCriterion("sys_type >", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("sys_type >=", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeLessThan(Byte value) {
            addCriterion("sys_type <", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeLessThanOrEqualTo(Byte value) {
            addCriterion("sys_type <=", value, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeIn(List<Byte> values) {
            addCriterion("sys_type in", values, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeNotIn(List<Byte> values) {
            addCriterion("sys_type not in", values, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeBetween(Byte value1, Byte value2) {
            addCriterion("sys_type between", value1, value2, "sysType");
            return (Criteria) this;
        }

        public Criteria andSysTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("sys_type not between", value1, value2, "sysType");
            return (Criteria) this;
        }

        public Criteria andStateCodeIsNull() {
            addCriterion("state_code is null");
            return (Criteria) this;
        }

        public Criteria andStateCodeIsNotNull() {
            addCriterion("state_code is not null");
            return (Criteria) this;
        }

        public Criteria andStateCodeEqualTo(Short value) {
            addCriterion("state_code =", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotEqualTo(Short value) {
            addCriterion("state_code <>", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeGreaterThan(Short value) {
            addCriterion("state_code >", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeGreaterThanOrEqualTo(Short value) {
            addCriterion("state_code >=", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeLessThan(Short value) {
            addCriterion("state_code <", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeLessThanOrEqualTo(Short value) {
            addCriterion("state_code <=", value, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeIn(List<Short> values) {
            addCriterion("state_code in", values, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotIn(List<Short> values) {
            addCriterion("state_code not in", values, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeBetween(Short value1, Short value2) {
            addCriterion("state_code between", value1, value2, "stateCode");
            return (Criteria) this;
        }

        public Criteria andStateCodeNotBetween(Short value1, Short value2) {
            addCriterion("state_code not between", value1, value2, "stateCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeIsNull() {
            addCriterion("sub_code is null");
            return (Criteria) this;
        }

        public Criteria andSubCodeIsNotNull() {
            addCriterion("sub_code is not null");
            return (Criteria) this;
        }

        public Criteria andSubCodeEqualTo(Byte value) {
            addCriterion("sub_code =", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeNotEqualTo(Byte value) {
            addCriterion("sub_code <>", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeGreaterThan(Byte value) {
            addCriterion("sub_code >", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeGreaterThanOrEqualTo(Byte value) {
            addCriterion("sub_code >=", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeLessThan(Byte value) {
            addCriterion("sub_code <", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeLessThanOrEqualTo(Byte value) {
            addCriterion("sub_code <=", value, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeIn(List<Byte> values) {
            addCriterion("sub_code in", values, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeNotIn(List<Byte> values) {
            addCriterion("sub_code not in", values, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeBetween(Byte value1, Byte value2) {
            addCriterion("sub_code between", value1, value2, "subCode");
            return (Criteria) this;
        }

        public Criteria andSubCodeNotBetween(Byte value1, Byte value2) {
            addCriterion("sub_code not between", value1, value2, "subCode");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(String value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(String value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(String value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(String value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(String value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(String value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLike(String value) {
            addCriterion("device_id like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotLike(String value) {
            addCriterion("device_id not like", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<String> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<String> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(String value1, String value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(String value1, String value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andMacAddrIsNull() {
            addCriterion("mac_addr is null");
            return (Criteria) this;
        }

        public Criteria andMacAddrIsNotNull() {
            addCriterion("mac_addr is not null");
            return (Criteria) this;
        }

        public Criteria andMacAddrEqualTo(String value) {
            addCriterion("mac_addr =", value, "macAddr");
            return (Criteria) this;
        }

        public Criteria andMacAddrNotEqualTo(String value) {
            addCriterion("mac_addr <>", value, "macAddr");
            return (Criteria) this;
        }

        public Criteria andMacAddrGreaterThan(String value) {
            addCriterion("mac_addr >", value, "macAddr");
            return (Criteria) this;
        }

        public Criteria andMacAddrGreaterThanOrEqualTo(String value) {
            addCriterion("mac_addr >=", value, "macAddr");
            return (Criteria) this;
        }

        public Criteria andMacAddrLessThan(String value) {
            addCriterion("mac_addr <", value, "macAddr");
            return (Criteria) this;
        }

        public Criteria andMacAddrLessThanOrEqualTo(String value) {
            addCriterion("mac_addr <=", value, "macAddr");
            return (Criteria) this;
        }

        public Criteria andMacAddrLike(String value) {
            addCriterion("mac_addr like", value, "macAddr");
            return (Criteria) this;
        }

        public Criteria andMacAddrNotLike(String value) {
            addCriterion("mac_addr not like", value, "macAddr");
            return (Criteria) this;
        }

        public Criteria andMacAddrIn(List<String> values) {
            addCriterion("mac_addr in", values, "macAddr");
            return (Criteria) this;
        }

        public Criteria andMacAddrNotIn(List<String> values) {
            addCriterion("mac_addr not in", values, "macAddr");
            return (Criteria) this;
        }

        public Criteria andMacAddrBetween(String value1, String value2) {
            addCriterion("mac_addr between", value1, value2, "macAddr");
            return (Criteria) this;
        }

        public Criteria andMacAddrNotBetween(String value1, String value2) {
            addCriterion("mac_addr not between", value1, value2, "macAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceModelIsNull() {
            addCriterion("device_model is null");
            return (Criteria) this;
        }

        public Criteria andDeviceModelIsNotNull() {
            addCriterion("device_model is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceModelEqualTo(String value) {
            addCriterion("device_model =", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNotEqualTo(String value) {
            addCriterion("device_model <>", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelGreaterThan(String value) {
            addCriterion("device_model >", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelGreaterThanOrEqualTo(String value) {
            addCriterion("device_model >=", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelLessThan(String value) {
            addCriterion("device_model <", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelLessThanOrEqualTo(String value) {
            addCriterion("device_model <=", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelLike(String value) {
            addCriterion("device_model like", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNotLike(String value) {
            addCriterion("device_model not like", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelIn(List<String> values) {
            addCriterion("device_model in", values, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNotIn(List<String> values) {
            addCriterion("device_model not in", values, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelBetween(String value1, String value2) {
            addCriterion("device_model between", value1, value2, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNotBetween(String value1, String value2) {
            addCriterion("device_model not between", value1, value2, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("channel_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(String value) {
            addCriterion("channel_id =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(String value) {
            addCriterion("channel_id <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(String value) {
            addCriterion("channel_id >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("channel_id >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(String value) {
            addCriterion("channel_id <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(String value) {
            addCriterion("channel_id <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLike(String value) {
            addCriterion("channel_id like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotLike(String value) {
            addCriterion("channel_id not like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<String> values) {
            addCriterion("channel_id in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<String> values) {
            addCriterion("channel_id not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(String value1, String value2) {
            addCriterion("channel_id between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(String value1, String value2) {
            addCriterion("channel_id not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andAppVersionIsNull() {
            addCriterion("app_version is null");
            return (Criteria) this;
        }

        public Criteria andAppVersionIsNotNull() {
            addCriterion("app_version is not null");
            return (Criteria) this;
        }

        public Criteria andAppVersionEqualTo(String value) {
            addCriterion("app_version =", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotEqualTo(String value) {
            addCriterion("app_version <>", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionGreaterThan(String value) {
            addCriterion("app_version >", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionGreaterThanOrEqualTo(String value) {
            addCriterion("app_version >=", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLessThan(String value) {
            addCriterion("app_version <", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLessThanOrEqualTo(String value) {
            addCriterion("app_version <=", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLike(String value) {
            addCriterion("app_version like", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotLike(String value) {
            addCriterion("app_version not like", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionIn(List<String> values) {
            addCriterion("app_version in", values, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotIn(List<String> values) {
            addCriterion("app_version not in", values, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionBetween(String value1, String value2) {
            addCriterion("app_version between", value1, value2, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotBetween(String value1, String value2) {
            addCriterion("app_version not between", value1, value2, "appVersion");
            return (Criteria) this;
        }

        public Criteria andLabel1IsNull() {
            addCriterion("label1 is null");
            return (Criteria) this;
        }

        public Criteria andLabel1IsNotNull() {
            addCriterion("label1 is not null");
            return (Criteria) this;
        }

        public Criteria andLabel1EqualTo(String value) {
            addCriterion("label1 =", value, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1NotEqualTo(String value) {
            addCriterion("label1 <>", value, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1GreaterThan(String value) {
            addCriterion("label1 >", value, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1GreaterThanOrEqualTo(String value) {
            addCriterion("label1 >=", value, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1LessThan(String value) {
            addCriterion("label1 <", value, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1LessThanOrEqualTo(String value) {
            addCriterion("label1 <=", value, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1Like(String value) {
            addCriterion("label1 like", value, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1NotLike(String value) {
            addCriterion("label1 not like", value, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1In(List<String> values) {
            addCriterion("label1 in", values, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1NotIn(List<String> values) {
            addCriterion("label1 not in", values, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1Between(String value1, String value2) {
            addCriterion("label1 between", value1, value2, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel1NotBetween(String value1, String value2) {
            addCriterion("label1 not between", value1, value2, "label1");
            return (Criteria) this;
        }

        public Criteria andLabel2IsNull() {
            addCriterion("label2 is null");
            return (Criteria) this;
        }

        public Criteria andLabel2IsNotNull() {
            addCriterion("label2 is not null");
            return (Criteria) this;
        }

        public Criteria andLabel2EqualTo(String value) {
            addCriterion("label2 =", value, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2NotEqualTo(String value) {
            addCriterion("label2 <>", value, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2GreaterThan(String value) {
            addCriterion("label2 >", value, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2GreaterThanOrEqualTo(String value) {
            addCriterion("label2 >=", value, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2LessThan(String value) {
            addCriterion("label2 <", value, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2LessThanOrEqualTo(String value) {
            addCriterion("label2 <=", value, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2Like(String value) {
            addCriterion("label2 like", value, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2NotLike(String value) {
            addCriterion("label2 not like", value, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2In(List<String> values) {
            addCriterion("label2 in", values, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2NotIn(List<String> values) {
            addCriterion("label2 not in", values, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2Between(String value1, String value2) {
            addCriterion("label2 between", value1, value2, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel2NotBetween(String value1, String value2) {
            addCriterion("label2 not between", value1, value2, "label2");
            return (Criteria) this;
        }

        public Criteria andLabel3IsNull() {
            addCriterion("label3 is null");
            return (Criteria) this;
        }

        public Criteria andLabel3IsNotNull() {
            addCriterion("label3 is not null");
            return (Criteria) this;
        }

        public Criteria andLabel3EqualTo(String value) {
            addCriterion("label3 =", value, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3NotEqualTo(String value) {
            addCriterion("label3 <>", value, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3GreaterThan(String value) {
            addCriterion("label3 >", value, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3GreaterThanOrEqualTo(String value) {
            addCriterion("label3 >=", value, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3LessThan(String value) {
            addCriterion("label3 <", value, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3LessThanOrEqualTo(String value) {
            addCriterion("label3 <=", value, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3Like(String value) {
            addCriterion("label3 like", value, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3NotLike(String value) {
            addCriterion("label3 not like", value, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3In(List<String> values) {
            addCriterion("label3 in", values, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3NotIn(List<String> values) {
            addCriterion("label3 not in", values, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3Between(String value1, String value2) {
            addCriterion("label3 between", value1, value2, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel3NotBetween(String value1, String value2) {
            addCriterion("label3 not between", value1, value2, "label3");
            return (Criteria) this;
        }

        public Criteria andLabel4IsNull() {
            addCriterion("label4 is null");
            return (Criteria) this;
        }

        public Criteria andLabel4IsNotNull() {
            addCriterion("label4 is not null");
            return (Criteria) this;
        }

        public Criteria andLabel4EqualTo(String value) {
            addCriterion("label4 =", value, "label4");
            return (Criteria) this;
        }

        public Criteria andLabel4NotEqualTo(String value) {
            addCriterion("label4 <>", value, "label4");
            return (Criteria) this;
        }

        public Criteria andLabel4GreaterThan(String value) {
            addCriterion("label4 >", value, "label4");
            return (Criteria) this;
        }

        public Criteria andLabel4GreaterThanOrEqualTo(String value) {
            addCriterion("label4 >=", value, "label4");
            return (Criteria) this;
        }

        public Criteria andLabel4LessThan(String value) {
            addCriterion("label4 <", value, "label4");
            return (Criteria) this;
        }

        public Criteria andLabel4LessThanOrEqualTo(String value) {
            addCriterion("label4 <=", value, "label4");
            return (Criteria) this;
        }

        public Criteria andLabel4Like(String value) {
            addCriterion("label4 like", value, "label4");
            return (Criteria) this;
        }

        public Criteria andLabel4NotLike(String value) {
            addCriterion("label4 not like", value, "label4");
            return (Criteria) this;
        }

        public Criteria andLabel4In(List<String> values) {
            addCriterion("label4 in", values, "label4");
            return (Criteria) this;
        }

        public Criteria andLabel4NotIn(List<String> values) {
            addCriterion("label4 not in", values, "label4");
            return (Criteria) this;
        }

        public Criteria andLabel4Between(String value1, String value2) {
            addCriterion("label4 between", value1, value2, "label4");
            return (Criteria) this;
        }

        public Criteria andLabel4NotBetween(String value1, String value2) {
            addCriterion("label4 not between", value1, value2, "label4");
            return (Criteria) this;
        }

        public Criteria andLabel5IsNull() {
            addCriterion("label5 is null");
            return (Criteria) this;
        }

        public Criteria andLabel5IsNotNull() {
            addCriterion("label5 is not null");
            return (Criteria) this;
        }

        public Criteria andLabel5EqualTo(String value) {
            addCriterion("label5 =", value, "label5");
            return (Criteria) this;
        }

        public Criteria andLabel5NotEqualTo(String value) {
            addCriterion("label5 <>", value, "label5");
            return (Criteria) this;
        }

        public Criteria andLabel5GreaterThan(String value) {
            addCriterion("label5 >", value, "label5");
            return (Criteria) this;
        }

        public Criteria andLabel5GreaterThanOrEqualTo(String value) {
            addCriterion("label5 >=", value, "label5");
            return (Criteria) this;
        }

        public Criteria andLabel5LessThan(String value) {
            addCriterion("label5 <", value, "label5");
            return (Criteria) this;
        }

        public Criteria andLabel5LessThanOrEqualTo(String value) {
            addCriterion("label5 <=", value, "label5");
            return (Criteria) this;
        }

        public Criteria andLabel5Like(String value) {
            addCriterion("label5 like", value, "label5");
            return (Criteria) this;
        }

        public Criteria andLabel5NotLike(String value) {
            addCriterion("label5 not like", value, "label5");
            return (Criteria) this;
        }

        public Criteria andLabel5In(List<String> values) {
            addCriterion("label5 in", values, "label5");
            return (Criteria) this;
        }

        public Criteria andLabel5NotIn(List<String> values) {
            addCriterion("label5 not in", values, "label5");
            return (Criteria) this;
        }

        public Criteria andLabel5Between(String value1, String value2) {
            addCriterion("label5 between", value1, value2, "label5");
            return (Criteria) this;
        }

        public Criteria andLabel5NotBetween(String value1, String value2) {
            addCriterion("label5 not between", value1, value2, "label5");
            return (Criteria) this;
        }

        public Criteria andLabel6IsNull() {
            addCriterion("label6 is null");
            return (Criteria) this;
        }

        public Criteria andLabel6IsNotNull() {
            addCriterion("label6 is not null");
            return (Criteria) this;
        }

        public Criteria andLabel6EqualTo(String value) {
            addCriterion("label6 =", value, "label6");
            return (Criteria) this;
        }

        public Criteria andLabel6NotEqualTo(String value) {
            addCriterion("label6 <>", value, "label6");
            return (Criteria) this;
        }

        public Criteria andLabel6GreaterThan(String value) {
            addCriterion("label6 >", value, "label6");
            return (Criteria) this;
        }

        public Criteria andLabel6GreaterThanOrEqualTo(String value) {
            addCriterion("label6 >=", value, "label6");
            return (Criteria) this;
        }

        public Criteria andLabel6LessThan(String value) {
            addCriterion("label6 <", value, "label6");
            return (Criteria) this;
        }

        public Criteria andLabel6LessThanOrEqualTo(String value) {
            addCriterion("label6 <=", value, "label6");
            return (Criteria) this;
        }

        public Criteria andLabel6Like(String value) {
            addCriterion("label6 like", value, "label6");
            return (Criteria) this;
        }

        public Criteria andLabel6NotLike(String value) {
            addCriterion("label6 not like", value, "label6");
            return (Criteria) this;
        }

        public Criteria andLabel6In(List<String> values) {
            addCriterion("label6 in", values, "label6");
            return (Criteria) this;
        }

        public Criteria andLabel6NotIn(List<String> values) {
            addCriterion("label6 not in", values, "label6");
            return (Criteria) this;
        }

        public Criteria andLabel6Between(String value1, String value2) {
            addCriterion("label6 between", value1, value2, "label6");
            return (Criteria) this;
        }

        public Criteria andLabel6NotBetween(String value1, String value2) {
            addCriterion("label6 not between", value1, value2, "label6");
            return (Criteria) this;
        }

        public Criteria andJsonMsgIsNull() {
            addCriterion("json_msg is null");
            return (Criteria) this;
        }

        public Criteria andJsonMsgIsNotNull() {
            addCriterion("json_msg is not null");
            return (Criteria) this;
        }

        public Criteria andJsonMsgEqualTo(String value) {
            addCriterion("json_msg =", value, "jsonMsg");
            return (Criteria) this;
        }

        public Criteria andJsonMsgNotEqualTo(String value) {
            addCriterion("json_msg <>", value, "jsonMsg");
            return (Criteria) this;
        }

        public Criteria andJsonMsgGreaterThan(String value) {
            addCriterion("json_msg >", value, "jsonMsg");
            return (Criteria) this;
        }

        public Criteria andJsonMsgGreaterThanOrEqualTo(String value) {
            addCriterion("json_msg >=", value, "jsonMsg");
            return (Criteria) this;
        }

        public Criteria andJsonMsgLessThan(String value) {
            addCriterion("json_msg <", value, "jsonMsg");
            return (Criteria) this;
        }

        public Criteria andJsonMsgLessThanOrEqualTo(String value) {
            addCriterion("json_msg <=", value, "jsonMsg");
            return (Criteria) this;
        }

        public Criteria andJsonMsgLike(String value) {
            addCriterion("json_msg like", value, "jsonMsg");
            return (Criteria) this;
        }

        public Criteria andJsonMsgNotLike(String value) {
            addCriterion("json_msg not like", value, "jsonMsg");
            return (Criteria) this;
        }

        public Criteria andJsonMsgIn(List<String> values) {
            addCriterion("json_msg in", values, "jsonMsg");
            return (Criteria) this;
        }

        public Criteria andJsonMsgNotIn(List<String> values) {
            addCriterion("json_msg not in", values, "jsonMsg");
            return (Criteria) this;
        }

        public Criteria andJsonMsgBetween(String value1, String value2) {
            addCriterion("json_msg between", value1, value2, "jsonMsg");
            return (Criteria) this;
        }

        public Criteria andJsonMsgNotBetween(String value1, String value2) {
            addCriterion("json_msg not between", value1, value2, "jsonMsg");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNull() {
            addCriterion("operate_time is null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNotNull() {
            addCriterion("operate_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeEqualTo(Date value) {
            addCriterion("operate_time =", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotEqualTo(Date value) {
            addCriterion("operate_time <>", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThan(Date value) {
            addCriterion("operate_time >", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("operate_time >=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThan(Date value) {
            addCriterion("operate_time <", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThanOrEqualTo(Date value) {
            addCriterion("operate_time <=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIn(List<Date> values) {
            addCriterion("operate_time in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotIn(List<Date> values) {
            addCriterion("operate_time not in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeBetween(Date value1, Date value2) {
            addCriterion("operate_time between", value1, value2, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotBetween(Date value1, Date value2) {
            addCriterion("operate_time not between", value1, value2, "operateTime");
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