package com.dwood.lynkf.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DailySheetCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DailySheetCriteria() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWorkDateIsNull() {
            addCriterion("work_date is null");
            return (Criteria) this;
        }

        public Criteria andWorkDateIsNotNull() {
            addCriterion("work_date is not null");
            return (Criteria) this;
        }

        public Criteria andWorkDateEqualTo(String value) {
            addCriterion("work_date =", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateNotEqualTo(String value) {
            addCriterion("work_date <>", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateGreaterThan(String value) {
            addCriterion("work_date >", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateGreaterThanOrEqualTo(String value) {
            addCriterion("work_date >=", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateLessThan(String value) {
            addCriterion("work_date <", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateLessThanOrEqualTo(String value) {
            addCriterion("work_date <=", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateLike(String value) {
            addCriterion("work_date like", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateNotLike(String value) {
            addCriterion("work_date not like", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateIn(List<String> values) {
            addCriterion("work_date in", values, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateNotIn(List<String> values) {
            addCriterion("work_date not in", values, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateBetween(String value1, String value2) {
            addCriterion("work_date between", value1, value2, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateNotBetween(String value1, String value2) {
            addCriterion("work_date not between", value1, value2, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkShiftIsNull() {
            addCriterion("work_shift is null");
            return (Criteria) this;
        }

        public Criteria andWorkShiftIsNotNull() {
            addCriterion("work_shift is not null");
            return (Criteria) this;
        }

        public Criteria andWorkShiftEqualTo(String value) {
            addCriterion("work_shift =", value, "workShift");
            return (Criteria) this;
        }

        public Criteria andWorkShiftNotEqualTo(String value) {
            addCriterion("work_shift <>", value, "workShift");
            return (Criteria) this;
        }

        public Criteria andWorkShiftGreaterThan(String value) {
            addCriterion("work_shift >", value, "workShift");
            return (Criteria) this;
        }

        public Criteria andWorkShiftGreaterThanOrEqualTo(String value) {
            addCriterion("work_shift >=", value, "workShift");
            return (Criteria) this;
        }

        public Criteria andWorkShiftLessThan(String value) {
            addCriterion("work_shift <", value, "workShift");
            return (Criteria) this;
        }

        public Criteria andWorkShiftLessThanOrEqualTo(String value) {
            addCriterion("work_shift <=", value, "workShift");
            return (Criteria) this;
        }

        public Criteria andWorkShiftLike(String value) {
            addCriterion("work_shift like", value, "workShift");
            return (Criteria) this;
        }

        public Criteria andWorkShiftNotLike(String value) {
            addCriterion("work_shift not like", value, "workShift");
            return (Criteria) this;
        }

        public Criteria andWorkShiftIn(List<String> values) {
            addCriterion("work_shift in", values, "workShift");
            return (Criteria) this;
        }

        public Criteria andWorkShiftNotIn(List<String> values) {
            addCriterion("work_shift not in", values, "workShift");
            return (Criteria) this;
        }

        public Criteria andWorkShiftBetween(String value1, String value2) {
            addCriterion("work_shift between", value1, value2, "workShift");
            return (Criteria) this;
        }

        public Criteria andWorkShiftNotBetween(String value1, String value2) {
            addCriterion("work_shift not between", value1, value2, "workShift");
            return (Criteria) this;
        }

        public Criteria andDeptIsNull() {
            addCriterion("dept is null");
            return (Criteria) this;
        }

        public Criteria andDeptIsNotNull() {
            addCriterion("dept is not null");
            return (Criteria) this;
        }

        public Criteria andDeptEqualTo(String value) {
            addCriterion("dept =", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotEqualTo(String value) {
            addCriterion("dept <>", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThan(String value) {
            addCriterion("dept >", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThanOrEqualTo(String value) {
            addCriterion("dept >=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThan(String value) {
            addCriterion("dept <", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThanOrEqualTo(String value) {
            addCriterion("dept <=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLike(String value) {
            addCriterion("dept like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotLike(String value) {
            addCriterion("dept not like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptIn(List<String> values) {
            addCriterion("dept in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotIn(List<String> values) {
            addCriterion("dept not in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptBetween(String value1, String value2) {
            addCriterion("dept between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotBetween(String value1, String value2) {
            addCriterion("dept not between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andForemanIsNull() {
            addCriterion("foreman is null");
            return (Criteria) this;
        }

        public Criteria andForemanIsNotNull() {
            addCriterion("foreman is not null");
            return (Criteria) this;
        }

        public Criteria andForemanEqualTo(String value) {
            addCriterion("foreman =", value, "foreman");
            return (Criteria) this;
        }

        public Criteria andForemanNotEqualTo(String value) {
            addCriterion("foreman <>", value, "foreman");
            return (Criteria) this;
        }

        public Criteria andForemanGreaterThan(String value) {
            addCriterion("foreman >", value, "foreman");
            return (Criteria) this;
        }

        public Criteria andForemanGreaterThanOrEqualTo(String value) {
            addCriterion("foreman >=", value, "foreman");
            return (Criteria) this;
        }

        public Criteria andForemanLessThan(String value) {
            addCriterion("foreman <", value, "foreman");
            return (Criteria) this;
        }

        public Criteria andForemanLessThanOrEqualTo(String value) {
            addCriterion("foreman <=", value, "foreman");
            return (Criteria) this;
        }

        public Criteria andForemanLike(String value) {
            addCriterion("foreman like", value, "foreman");
            return (Criteria) this;
        }

        public Criteria andForemanNotLike(String value) {
            addCriterion("foreman not like", value, "foreman");
            return (Criteria) this;
        }

        public Criteria andForemanIn(List<String> values) {
            addCriterion("foreman in", values, "foreman");
            return (Criteria) this;
        }

        public Criteria andForemanNotIn(List<String> values) {
            addCriterion("foreman not in", values, "foreman");
            return (Criteria) this;
        }

        public Criteria andForemanBetween(String value1, String value2) {
            addCriterion("foreman between", value1, value2, "foreman");
            return (Criteria) this;
        }

        public Criteria andForemanNotBetween(String value1, String value2) {
            addCriterion("foreman not between", value1, value2, "foreman");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andTimePlanIsNull() {
            addCriterion("time_plan is null");
            return (Criteria) this;
        }

        public Criteria andTimePlanIsNotNull() {
            addCriterion("time_plan is not null");
            return (Criteria) this;
        }

        public Criteria andTimePlanEqualTo(BigDecimal value) {
            addCriterion("time_plan =", value, "timePlan");
            return (Criteria) this;
        }

        public Criteria andTimePlanNotEqualTo(BigDecimal value) {
            addCriterion("time_plan <>", value, "timePlan");
            return (Criteria) this;
        }

        public Criteria andTimePlanGreaterThan(BigDecimal value) {
            addCriterion("time_plan >", value, "timePlan");
            return (Criteria) this;
        }

        public Criteria andTimePlanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("time_plan >=", value, "timePlan");
            return (Criteria) this;
        }

        public Criteria andTimePlanLessThan(BigDecimal value) {
            addCriterion("time_plan <", value, "timePlan");
            return (Criteria) this;
        }

        public Criteria andTimePlanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("time_plan <=", value, "timePlan");
            return (Criteria) this;
        }

        public Criteria andTimePlanLike(BigDecimal value) {
            addCriterion("time_plan like", value, "timePlan");
            return (Criteria) this;
        }

        public Criteria andTimePlanNotLike(BigDecimal value) {
            addCriterion("time_plan not like", value, "timePlan");
            return (Criteria) this;
        }

        public Criteria andTimePlanIn(List<BigDecimal> values) {
            addCriterion("time_plan in", values, "timePlan");
            return (Criteria) this;
        }

        public Criteria andTimePlanNotIn(List<BigDecimal> values) {
            addCriterion("time_plan not in", values, "timePlan");
            return (Criteria) this;
        }

        public Criteria andTimePlanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("time_plan between", value1, value2, "timePlan");
            return (Criteria) this;
        }

        public Criteria andTimePlanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("time_plan not between", value1, value2, "timePlan");
            return (Criteria) this;
        }

        public Criteria andTimeActualIsNull() {
            addCriterion("time_actual is null");
            return (Criteria) this;
        }

        public Criteria andTimeActualIsNotNull() {
            addCriterion("time_actual is not null");
            return (Criteria) this;
        }

        public Criteria andTimeActualEqualTo(BigDecimal value) {
            addCriterion("time_actual =", value, "timeActual");
            return (Criteria) this;
        }

        public Criteria andTimeActualNotEqualTo(BigDecimal value) {
            addCriterion("time_actual <>", value, "timeActual");
            return (Criteria) this;
        }

        public Criteria andTimeActualGreaterThan(BigDecimal value) {
            addCriterion("time_actual >", value, "timeActual");
            return (Criteria) this;
        }

        public Criteria andTimeActualGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("time_actual >=", value, "timeActual");
            return (Criteria) this;
        }

        public Criteria andTimeActualLessThan(BigDecimal value) {
            addCriterion("time_actual <", value, "timeActual");
            return (Criteria) this;
        }

        public Criteria andTimeActualLessThanOrEqualTo(BigDecimal value) {
            addCriterion("time_actual <=", value, "timeActual");
            return (Criteria) this;
        }

        public Criteria andTimeActualLike(BigDecimal value) {
            addCriterion("time_actual like", value, "timeActual");
            return (Criteria) this;
        }

        public Criteria andTimeActualNotLike(BigDecimal value) {
            addCriterion("time_actual not like", value, "timeActual");
            return (Criteria) this;
        }

        public Criteria andTimeActualIn(List<BigDecimal> values) {
            addCriterion("time_actual in", values, "timeActual");
            return (Criteria) this;
        }

        public Criteria andTimeActualNotIn(List<BigDecimal> values) {
            addCriterion("time_actual not in", values, "timeActual");
            return (Criteria) this;
        }

        public Criteria andTimeActualBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("time_actual between", value1, value2, "timeActual");
            return (Criteria) this;
        }

        public Criteria andTimeActualNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("time_actual not between", value1, value2, "timeActual");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andInputUserIsNull() {
            addCriterion("input_user is null");
            return (Criteria) this;
        }

        public Criteria andInputUserIsNotNull() {
            addCriterion("input_user is not null");
            return (Criteria) this;
        }

        public Criteria andInputUserEqualTo(String value) {
            addCriterion("input_user =", value, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserNotEqualTo(String value) {
            addCriterion("input_user <>", value, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserGreaterThan(String value) {
            addCriterion("input_user >", value, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserGreaterThanOrEqualTo(String value) {
            addCriterion("input_user >=", value, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserLessThan(String value) {
            addCriterion("input_user <", value, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserLessThanOrEqualTo(String value) {
            addCriterion("input_user <=", value, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserLike(String value) {
            addCriterion("input_user like", value, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserNotLike(String value) {
            addCriterion("input_user not like", value, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserIn(List<String> values) {
            addCriterion("input_user in", values, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserNotIn(List<String> values) {
            addCriterion("input_user not in", values, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserBetween(String value1, String value2) {
            addCriterion("input_user between", value1, value2, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputUserNotBetween(String value1, String value2) {
            addCriterion("input_user not between", value1, value2, "inputUser");
            return (Criteria) this;
        }

        public Criteria andInputDateIsNull() {
            addCriterion("input_date is null");
            return (Criteria) this;
        }

        public Criteria andInputDateIsNotNull() {
            addCriterion("input_date is not null");
            return (Criteria) this;
        }

        public Criteria andInputDateEqualTo(String value) {
            addCriterion("input_date =", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotEqualTo(String value) {
            addCriterion("input_date <>", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateGreaterThan(String value) {
            addCriterion("input_date >", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateGreaterThanOrEqualTo(String value) {
            addCriterion("input_date >=", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLessThan(String value) {
            addCriterion("input_date <", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLessThanOrEqualTo(String value) {
            addCriterion("input_date <=", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLike(String value) {
            addCriterion("input_date like", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotLike(String value) {
            addCriterion("input_date not like", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateIn(List<String> values) {
            addCriterion("input_date in", values, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotIn(List<String> values) {
            addCriterion("input_date not in", values, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateBetween(String value1, String value2) {
            addCriterion("input_date between", value1, value2, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotBetween(String value1, String value2) {
            addCriterion("input_date not between", value1, value2, "inputDate");
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