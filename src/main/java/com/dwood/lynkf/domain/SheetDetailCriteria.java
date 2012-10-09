package com.dwood.lynkf.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SheetDetailCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SheetDetailCriteria() {
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

        public Criteria andCustomerIsNull() {
            addCriterion("customer is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNotNull() {
            addCriterion("customer is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEqualTo(String value) {
            addCriterion("customer =", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotEqualTo(String value) {
            addCriterion("customer <>", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThan(String value) {
            addCriterion("customer >", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("customer >=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThan(String value) {
            addCriterion("customer <", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThanOrEqualTo(String value) {
            addCriterion("customer <=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLike(String value) {
            addCriterion("customer like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotLike(String value) {
            addCriterion("customer not like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerIn(List<String> values) {
            addCriterion("customer in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotIn(List<String> values) {
            addCriterion("customer not in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerBetween(String value1, String value2) {
            addCriterion("customer between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotBetween(String value1, String value2) {
            addCriterion("customer not between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andProductIsNull() {
            addCriterion("product is null");
            return (Criteria) this;
        }

        public Criteria andProductIsNotNull() {
            addCriterion("product is not null");
            return (Criteria) this;
        }

        public Criteria andProductEqualTo(String value) {
            addCriterion("product =", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotEqualTo(String value) {
            addCriterion("product <>", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThan(String value) {
            addCriterion("product >", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThanOrEqualTo(String value) {
            addCriterion("product >=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThan(String value) {
            addCriterion("product <", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThanOrEqualTo(String value) {
            addCriterion("product <=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLike(String value) {
            addCriterion("product like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotLike(String value) {
            addCriterion("product not like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductIn(List<String> values) {
            addCriterion("product in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotIn(List<String> values) {
            addCriterion("product not in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductBetween(String value1, String value2) {
            addCriterion("product between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotBetween(String value1, String value2) {
            addCriterion("product not between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andRingSideIsNull() {
            addCriterion("ring_side is null");
            return (Criteria) this;
        }

        public Criteria andRingSideIsNotNull() {
            addCriterion("ring_side is not null");
            return (Criteria) this;
        }

        public Criteria andRingSideEqualTo(String value) {
            addCriterion("ring_side =", value, "ringSide");
            return (Criteria) this;
        }

        public Criteria andRingSideNotEqualTo(String value) {
            addCriterion("ring_side <>", value, "ringSide");
            return (Criteria) this;
        }

        public Criteria andRingSideGreaterThan(String value) {
            addCriterion("ring_side >", value, "ringSide");
            return (Criteria) this;
        }

        public Criteria andRingSideGreaterThanOrEqualTo(String value) {
            addCriterion("ring_side >=", value, "ringSide");
            return (Criteria) this;
        }

        public Criteria andRingSideLessThan(String value) {
            addCriterion("ring_side <", value, "ringSide");
            return (Criteria) this;
        }

        public Criteria andRingSideLessThanOrEqualTo(String value) {
            addCriterion("ring_side <=", value, "ringSide");
            return (Criteria) this;
        }

        public Criteria andRingSideLike(String value) {
            addCriterion("ring_side like", value, "ringSide");
            return (Criteria) this;
        }

        public Criteria andRingSideNotLike(String value) {
            addCriterion("ring_side not like", value, "ringSide");
            return (Criteria) this;
        }

        public Criteria andRingSideIn(List<String> values) {
            addCriterion("ring_side in", values, "ringSide");
            return (Criteria) this;
        }

        public Criteria andRingSideNotIn(List<String> values) {
            addCriterion("ring_side not in", values, "ringSide");
            return (Criteria) this;
        }

        public Criteria andRingSideBetween(String value1, String value2) {
            addCriterion("ring_side between", value1, value2, "ringSide");
            return (Criteria) this;
        }

        public Criteria andRingSideNotBetween(String value1, String value2) {
            addCriterion("ring_side not between", value1, value2, "ringSide");
            return (Criteria) this;
        }

        public Criteria andSealingIsNull() {
            addCriterion("sealing is null");
            return (Criteria) this;
        }

        public Criteria andSealingIsNotNull() {
            addCriterion("sealing is not null");
            return (Criteria) this;
        }

        public Criteria andSealingEqualTo(String value) {
            addCriterion("sealing =", value, "sealing");
            return (Criteria) this;
        }

        public Criteria andSealingNotEqualTo(String value) {
            addCriterion("sealing <>", value, "sealing");
            return (Criteria) this;
        }

        public Criteria andSealingGreaterThan(String value) {
            addCriterion("sealing >", value, "sealing");
            return (Criteria) this;
        }

        public Criteria andSealingGreaterThanOrEqualTo(String value) {
            addCriterion("sealing >=", value, "sealing");
            return (Criteria) this;
        }

        public Criteria andSealingLessThan(String value) {
            addCriterion("sealing <", value, "sealing");
            return (Criteria) this;
        }

        public Criteria andSealingLessThanOrEqualTo(String value) {
            addCriterion("sealing <=", value, "sealing");
            return (Criteria) this;
        }

        public Criteria andSealingLike(String value) {
            addCriterion("sealing like", value, "sealing");
            return (Criteria) this;
        }

        public Criteria andSealingNotLike(String value) {
            addCriterion("sealing not like", value, "sealing");
            return (Criteria) this;
        }

        public Criteria andSealingIn(List<String> values) {
            addCriterion("sealing in", values, "sealing");
            return (Criteria) this;
        }

        public Criteria andSealingNotIn(List<String> values) {
            addCriterion("sealing not in", values, "sealing");
            return (Criteria) this;
        }

        public Criteria andSealingBetween(String value1, String value2) {
            addCriterion("sealing between", value1, value2, "sealing");
            return (Criteria) this;
        }

        public Criteria andSealingNotBetween(String value1, String value2) {
            addCriterion("sealing not between", value1, value2, "sealing");
            return (Criteria) this;
        }

        public Criteria andProductionPlanIsNull() {
            addCriterion("production_plan is null");
            return (Criteria) this;
        }

        public Criteria andProductionPlanIsNotNull() {
            addCriterion("production_plan is not null");
            return (Criteria) this;
        }

        public Criteria andProductionPlanEqualTo(BigDecimal value) {
            addCriterion("production_plan =", value, "productionPlan");
            return (Criteria) this;
        }

        public Criteria andProductionPlanNotEqualTo(BigDecimal value) {
            addCriterion("production_plan <>", value, "productionPlan");
            return (Criteria) this;
        }

        public Criteria andProductionPlanGreaterThan(BigDecimal value) {
            addCriterion("production_plan >", value, "productionPlan");
            return (Criteria) this;
        }

        public Criteria andProductionPlanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("production_plan >=", value, "productionPlan");
            return (Criteria) this;
        }

        public Criteria andProductionPlanLessThan(BigDecimal value) {
            addCriterion("production_plan <", value, "productionPlan");
            return (Criteria) this;
        }

        public Criteria andProductionPlanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("production_plan <=", value, "productionPlan");
            return (Criteria) this;
        }

        public Criteria andProductionPlanLike(BigDecimal value) {
            addCriterion("production_plan like", value, "productionPlan");
            return (Criteria) this;
        }

        public Criteria andProductionPlanNotLike(BigDecimal value) {
            addCriterion("production_plan not like", value, "productionPlan");
            return (Criteria) this;
        }

        public Criteria andProductionPlanIn(List<BigDecimal> values) {
            addCriterion("production_plan in", values, "productionPlan");
            return (Criteria) this;
        }

        public Criteria andProductionPlanNotIn(List<BigDecimal> values) {
            addCriterion("production_plan not in", values, "productionPlan");
            return (Criteria) this;
        }

        public Criteria andProductionPlanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("production_plan between", value1, value2, "productionPlan");
            return (Criteria) this;
        }

        public Criteria andProductionPlanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("production_plan not between", value1, value2, "productionPlan");
            return (Criteria) this;
        }

        public Criteria andRawIsNull() {
            addCriterion("raw is null");
            return (Criteria) this;
        }

        public Criteria andRawIsNotNull() {
            addCriterion("raw is not null");
            return (Criteria) this;
        }

        public Criteria andRawEqualTo(String value) {
            addCriterion("raw =", value, "raw");
            return (Criteria) this;
        }

        public Criteria andRawNotEqualTo(String value) {
            addCriterion("raw <>", value, "raw");
            return (Criteria) this;
        }

        public Criteria andRawGreaterThan(String value) {
            addCriterion("raw >", value, "raw");
            return (Criteria) this;
        }

        public Criteria andRawGreaterThanOrEqualTo(String value) {
            addCriterion("raw >=", value, "raw");
            return (Criteria) this;
        }

        public Criteria andRawLessThan(String value) {
            addCriterion("raw <", value, "raw");
            return (Criteria) this;
        }

        public Criteria andRawLessThanOrEqualTo(String value) {
            addCriterion("raw <=", value, "raw");
            return (Criteria) this;
        }

        public Criteria andRawLike(String value) {
            addCriterion("raw like", value, "raw");
            return (Criteria) this;
        }

        public Criteria andRawNotLike(String value) {
            addCriterion("raw not like", value, "raw");
            return (Criteria) this;
        }

        public Criteria andRawIn(List<String> values) {
            addCriterion("raw in", values, "raw");
            return (Criteria) this;
        }

        public Criteria andRawNotIn(List<String> values) {
            addCriterion("raw not in", values, "raw");
            return (Criteria) this;
        }

        public Criteria andRawBetween(String value1, String value2) {
            addCriterion("raw between", value1, value2, "raw");
            return (Criteria) this;
        }

        public Criteria andRawNotBetween(String value1, String value2) {
            addCriterion("raw not between", value1, value2, "raw");
            return (Criteria) this;
        }

        public Criteria andBundleIsNull() {
            addCriterion("bundle is null");
            return (Criteria) this;
        }

        public Criteria andBundleIsNotNull() {
            addCriterion("bundle is not null");
            return (Criteria) this;
        }

        public Criteria andBundleEqualTo(String value) {
            addCriterion("bundle =", value, "bundle");
            return (Criteria) this;
        }

        public Criteria andBundleNotEqualTo(String value) {
            addCriterion("bundle <>", value, "bundle");
            return (Criteria) this;
        }

        public Criteria andBundleGreaterThan(String value) {
            addCriterion("bundle >", value, "bundle");
            return (Criteria) this;
        }

        public Criteria andBundleGreaterThanOrEqualTo(String value) {
            addCriterion("bundle >=", value, "bundle");
            return (Criteria) this;
        }

        public Criteria andBundleLessThan(String value) {
            addCriterion("bundle <", value, "bundle");
            return (Criteria) this;
        }

        public Criteria andBundleLessThanOrEqualTo(String value) {
            addCriterion("bundle <=", value, "bundle");
            return (Criteria) this;
        }

        public Criteria andBundleLike(String value) {
            addCriterion("bundle like", value, "bundle");
            return (Criteria) this;
        }

        public Criteria andBundleNotLike(String value) {
            addCriterion("bundle not like", value, "bundle");
            return (Criteria) this;
        }

        public Criteria andBundleIn(List<String> values) {
            addCriterion("bundle in", values, "bundle");
            return (Criteria) this;
        }

        public Criteria andBundleNotIn(List<String> values) {
            addCriterion("bundle not in", values, "bundle");
            return (Criteria) this;
        }

        public Criteria andBundleBetween(String value1, String value2) {
            addCriterion("bundle between", value1, value2, "bundle");
            return (Criteria) this;
        }

        public Criteria andBundleNotBetween(String value1, String value2) {
            addCriterion("bundle not between", value1, value2, "bundle");
            return (Criteria) this;
        }

        public Criteria andBatchIsNull() {
            addCriterion("batch is null");
            return (Criteria) this;
        }

        public Criteria andBatchIsNotNull() {
            addCriterion("batch is not null");
            return (Criteria) this;
        }

        public Criteria andBatchEqualTo(String value) {
            addCriterion("batch =", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotEqualTo(String value) {
            addCriterion("batch <>", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThan(String value) {
            addCriterion("batch >", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThanOrEqualTo(String value) {
            addCriterion("batch >=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThan(String value) {
            addCriterion("batch <", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThanOrEqualTo(String value) {
            addCriterion("batch <=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLike(String value) {
            addCriterion("batch like", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotLike(String value) {
            addCriterion("batch not like", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchIn(List<String> values) {
            addCriterion("batch in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotIn(List<String> values) {
            addCriterion("batch not in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchBetween(String value1, String value2) {
            addCriterion("batch between", value1, value2, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotBetween(String value1, String value2) {
            addCriterion("batch not between", value1, value2, "batch");
            return (Criteria) this;
        }

        public Criteria andLineIsNull() {
            addCriterion("line is null");
            return (Criteria) this;
        }

        public Criteria andLineIsNotNull() {
            addCriterion("line is not null");
            return (Criteria) this;
        }

        public Criteria andLineEqualTo(String value) {
            addCriterion("line =", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineNotEqualTo(String value) {
            addCriterion("line <>", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineGreaterThan(String value) {
            addCriterion("line >", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineGreaterThanOrEqualTo(String value) {
            addCriterion("line >=", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineLessThan(String value) {
            addCriterion("line <", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineLessThanOrEqualTo(String value) {
            addCriterion("line <=", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineLike(String value) {
            addCriterion("line like", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineNotLike(String value) {
            addCriterion("line not like", value, "line");
            return (Criteria) this;
        }

        public Criteria andLineIn(List<String> values) {
            addCriterion("line in", values, "line");
            return (Criteria) this;
        }

        public Criteria andLineNotIn(List<String> values) {
            addCriterion("line not in", values, "line");
            return (Criteria) this;
        }

        public Criteria andLineBetween(String value1, String value2) {
            addCriterion("line between", value1, value2, "line");
            return (Criteria) this;
        }

        public Criteria andLineNotBetween(String value1, String value2) {
            addCriterion("line not between", value1, value2, "line");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNull() {
            addCriterion("work_time is null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNotNull() {
            addCriterion("work_time is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEqualTo(BigDecimal value) {
            addCriterion("work_time =", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotEqualTo(BigDecimal value) {
            addCriterion("work_time <>", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThan(BigDecimal value) {
            addCriterion("work_time >", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("work_time >=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThan(BigDecimal value) {
            addCriterion("work_time <", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("work_time <=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLike(BigDecimal value) {
            addCriterion("work_time like", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotLike(BigDecimal value) {
            addCriterion("work_time not like", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIn(List<BigDecimal> values) {
            addCriterion("work_time in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotIn(List<BigDecimal> values) {
            addCriterion("work_time not in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("work_time between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("work_time not between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andYieldIsNull() {
            addCriterion("yield is null");
            return (Criteria) this;
        }

        public Criteria andYieldIsNotNull() {
            addCriterion("yield is not null");
            return (Criteria) this;
        }

        public Criteria andYieldEqualTo(BigDecimal value) {
            addCriterion("yield =", value, "yield");
            return (Criteria) this;
        }

        public Criteria andYieldNotEqualTo(BigDecimal value) {
            addCriterion("yield <>", value, "yield");
            return (Criteria) this;
        }

        public Criteria andYieldGreaterThan(BigDecimal value) {
            addCriterion("yield >", value, "yield");
            return (Criteria) this;
        }

        public Criteria andYieldGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yield >=", value, "yield");
            return (Criteria) this;
        }

        public Criteria andYieldLessThan(BigDecimal value) {
            addCriterion("yield <", value, "yield");
            return (Criteria) this;
        }

        public Criteria andYieldLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yield <=", value, "yield");
            return (Criteria) this;
        }

        public Criteria andYieldLike(BigDecimal value) {
            addCriterion("yield like", value, "yield");
            return (Criteria) this;
        }

        public Criteria andYieldNotLike(BigDecimal value) {
            addCriterion("yield not like", value, "yield");
            return (Criteria) this;
        }

        public Criteria andYieldIn(List<BigDecimal> values) {
            addCriterion("yield in", values, "yield");
            return (Criteria) this;
        }

        public Criteria andYieldNotIn(List<BigDecimal> values) {
            addCriterion("yield not in", values, "yield");
            return (Criteria) this;
        }

        public Criteria andYieldBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yield between", value1, value2, "yield");
            return (Criteria) this;
        }

        public Criteria andYieldNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yield not between", value1, value2, "yield");
            return (Criteria) this;
        }

        public Criteria andBadIsNull() {
            addCriterion("bad is null");
            return (Criteria) this;
        }

        public Criteria andBadIsNotNull() {
            addCriterion("bad is not null");
            return (Criteria) this;
        }

        public Criteria andBadEqualTo(BigDecimal value) {
            addCriterion("bad =", value, "bad");
            return (Criteria) this;
        }

        public Criteria andBadNotEqualTo(BigDecimal value) {
            addCriterion("bad <>", value, "bad");
            return (Criteria) this;
        }

        public Criteria andBadGreaterThan(BigDecimal value) {
            addCriterion("bad >", value, "bad");
            return (Criteria) this;
        }

        public Criteria andBadGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bad >=", value, "bad");
            return (Criteria) this;
        }

        public Criteria andBadLessThan(BigDecimal value) {
            addCriterion("bad <", value, "bad");
            return (Criteria) this;
        }

        public Criteria andBadLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bad <=", value, "bad");
            return (Criteria) this;
        }

        public Criteria andBadLike(BigDecimal value) {
            addCriterion("bad like", value, "bad");
            return (Criteria) this;
        }

        public Criteria andBadNotLike(BigDecimal value) {
            addCriterion("bad not like", value, "bad");
            return (Criteria) this;
        }

        public Criteria andBadIn(List<BigDecimal> values) {
            addCriterion("bad in", values, "bad");
            return (Criteria) this;
        }

        public Criteria andBadNotIn(List<BigDecimal> values) {
            addCriterion("bad not in", values, "bad");
            return (Criteria) this;
        }

        public Criteria andBadBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bad between", value1, value2, "bad");
            return (Criteria) this;
        }

        public Criteria andBadNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bad not between", value1, value2, "bad");
            return (Criteria) this;
        }

        public Criteria andRepairIsNull() {
            addCriterion("repair is null");
            return (Criteria) this;
        }

        public Criteria andRepairIsNotNull() {
            addCriterion("repair is not null");
            return (Criteria) this;
        }

        public Criteria andRepairEqualTo(BigDecimal value) {
            addCriterion("repair =", value, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairNotEqualTo(BigDecimal value) {
            addCriterion("repair <>", value, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairGreaterThan(BigDecimal value) {
            addCriterion("repair >", value, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("repair >=", value, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairLessThan(BigDecimal value) {
            addCriterion("repair <", value, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairLessThanOrEqualTo(BigDecimal value) {
            addCriterion("repair <=", value, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairLike(BigDecimal value) {
            addCriterion("repair like", value, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairNotLike(BigDecimal value) {
            addCriterion("repair not like", value, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairIn(List<BigDecimal> values) {
            addCriterion("repair in", values, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairNotIn(List<BigDecimal> values) {
            addCriterion("repair not in", values, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair between", value1, value2, "repair");
            return (Criteria) this;
        }

        public Criteria andRepairNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("repair not between", value1, value2, "repair");
            return (Criteria) this;
        }

        public Criteria andMachineAnomalyIsNull() {
            addCriterion("machine_anomaly is null");
            return (Criteria) this;
        }

        public Criteria andMachineAnomalyIsNotNull() {
            addCriterion("machine_anomaly is not null");
            return (Criteria) this;
        }

        public Criteria andMachineAnomalyEqualTo(BigDecimal value) {
            addCriterion("machine_anomaly =", value, "machineAnomaly");
            return (Criteria) this;
        }

        public Criteria andMachineAnomalyNotEqualTo(BigDecimal value) {
            addCriterion("machine_anomaly <>", value, "machineAnomaly");
            return (Criteria) this;
        }

        public Criteria andMachineAnomalyGreaterThan(BigDecimal value) {
            addCriterion("machine_anomaly >", value, "machineAnomaly");
            return (Criteria) this;
        }

        public Criteria andMachineAnomalyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("machine_anomaly >=", value, "machineAnomaly");
            return (Criteria) this;
        }

        public Criteria andMachineAnomalyLessThan(BigDecimal value) {
            addCriterion("machine_anomaly <", value, "machineAnomaly");
            return (Criteria) this;
        }

        public Criteria andMachineAnomalyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("machine_anomaly <=", value, "machineAnomaly");
            return (Criteria) this;
        }

        public Criteria andMachineAnomalyLike(BigDecimal value) {
            addCriterion("machine_anomaly like", value, "machineAnomaly");
            return (Criteria) this;
        }

        public Criteria andMachineAnomalyNotLike(BigDecimal value) {
            addCriterion("machine_anomaly not like", value, "machineAnomaly");
            return (Criteria) this;
        }

        public Criteria andMachineAnomalyIn(List<BigDecimal> values) {
            addCriterion("machine_anomaly in", values, "machineAnomaly");
            return (Criteria) this;
        }

        public Criteria andMachineAnomalyNotIn(List<BigDecimal> values) {
            addCriterion("machine_anomaly not in", values, "machineAnomaly");
            return (Criteria) this;
        }

        public Criteria andMachineAnomalyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("machine_anomaly between", value1, value2, "machineAnomaly");
            return (Criteria) this;
        }

        public Criteria andMachineAnomalyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("machine_anomaly not between", value1, value2, "machineAnomaly");
            return (Criteria) this;
        }

        public Criteria andToolAnomalyIsNull() {
            addCriterion("tool_anomaly is null");
            return (Criteria) this;
        }

        public Criteria andToolAnomalyIsNotNull() {
            addCriterion("tool_anomaly is not null");
            return (Criteria) this;
        }

        public Criteria andToolAnomalyEqualTo(BigDecimal value) {
            addCriterion("tool_anomaly =", value, "toolAnomaly");
            return (Criteria) this;
        }

        public Criteria andToolAnomalyNotEqualTo(BigDecimal value) {
            addCriterion("tool_anomaly <>", value, "toolAnomaly");
            return (Criteria) this;
        }

        public Criteria andToolAnomalyGreaterThan(BigDecimal value) {
            addCriterion("tool_anomaly >", value, "toolAnomaly");
            return (Criteria) this;
        }

        public Criteria andToolAnomalyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tool_anomaly >=", value, "toolAnomaly");
            return (Criteria) this;
        }

        public Criteria andToolAnomalyLessThan(BigDecimal value) {
            addCriterion("tool_anomaly <", value, "toolAnomaly");
            return (Criteria) this;
        }

        public Criteria andToolAnomalyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tool_anomaly <=", value, "toolAnomaly");
            return (Criteria) this;
        }

        public Criteria andToolAnomalyLike(BigDecimal value) {
            addCriterion("tool_anomaly like", value, "toolAnomaly");
            return (Criteria) this;
        }

        public Criteria andToolAnomalyNotLike(BigDecimal value) {
            addCriterion("tool_anomaly not like", value, "toolAnomaly");
            return (Criteria) this;
        }

        public Criteria andToolAnomalyIn(List<BigDecimal> values) {
            addCriterion("tool_anomaly in", values, "toolAnomaly");
            return (Criteria) this;
        }

        public Criteria andToolAnomalyNotIn(List<BigDecimal> values) {
            addCriterion("tool_anomaly not in", values, "toolAnomaly");
            return (Criteria) this;
        }

        public Criteria andToolAnomalyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tool_anomaly between", value1, value2, "toolAnomaly");
            return (Criteria) this;
        }

        public Criteria andToolAnomalyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tool_anomaly not between", value1, value2, "toolAnomaly");
            return (Criteria) this;
        }

        public Criteria andModelSwitchPlanIsNull() {
            addCriterion("model_switch_plan is null");
            return (Criteria) this;
        }

        public Criteria andModelSwitchPlanIsNotNull() {
            addCriterion("model_switch_plan is not null");
            return (Criteria) this;
        }

        public Criteria andModelSwitchPlanEqualTo(BigDecimal value) {
            addCriterion("model_switch_plan =", value, "modelSwitchPlan");
            return (Criteria) this;
        }

        public Criteria andModelSwitchPlanNotEqualTo(BigDecimal value) {
            addCriterion("model_switch_plan <>", value, "modelSwitchPlan");
            return (Criteria) this;
        }

        public Criteria andModelSwitchPlanGreaterThan(BigDecimal value) {
            addCriterion("model_switch_plan >", value, "modelSwitchPlan");
            return (Criteria) this;
        }

        public Criteria andModelSwitchPlanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("model_switch_plan >=", value, "modelSwitchPlan");
            return (Criteria) this;
        }

        public Criteria andModelSwitchPlanLessThan(BigDecimal value) {
            addCriterion("model_switch_plan <", value, "modelSwitchPlan");
            return (Criteria) this;
        }

        public Criteria andModelSwitchPlanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("model_switch_plan <=", value, "modelSwitchPlan");
            return (Criteria) this;
        }

        public Criteria andModelSwitchPlanLike(BigDecimal value) {
            addCriterion("model_switch_plan like", value, "modelSwitchPlan");
            return (Criteria) this;
        }

        public Criteria andModelSwitchPlanNotLike(BigDecimal value) {
            addCriterion("model_switch_plan not like", value, "modelSwitchPlan");
            return (Criteria) this;
        }

        public Criteria andModelSwitchPlanIn(List<BigDecimal> values) {
            addCriterion("model_switch_plan in", values, "modelSwitchPlan");
            return (Criteria) this;
        }

        public Criteria andModelSwitchPlanNotIn(List<BigDecimal> values) {
            addCriterion("model_switch_plan not in", values, "modelSwitchPlan");
            return (Criteria) this;
        }

        public Criteria andModelSwitchPlanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("model_switch_plan between", value1, value2, "modelSwitchPlan");
            return (Criteria) this;
        }

        public Criteria andModelSwitchPlanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("model_switch_plan not between", value1, value2, "modelSwitchPlan");
            return (Criteria) this;
        }

        public Criteria andModelSwitchActualIsNull() {
            addCriterion("model_switch_actual is null");
            return (Criteria) this;
        }

        public Criteria andModelSwitchActualIsNotNull() {
            addCriterion("model_switch_actual is not null");
            return (Criteria) this;
        }

        public Criteria andModelSwitchActualEqualTo(BigDecimal value) {
            addCriterion("model_switch_actual =", value, "modelSwitchActual");
            return (Criteria) this;
        }

        public Criteria andModelSwitchActualNotEqualTo(BigDecimal value) {
            addCriterion("model_switch_actual <>", value, "modelSwitchActual");
            return (Criteria) this;
        }

        public Criteria andModelSwitchActualGreaterThan(BigDecimal value) {
            addCriterion("model_switch_actual >", value, "modelSwitchActual");
            return (Criteria) this;
        }

        public Criteria andModelSwitchActualGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("model_switch_actual >=", value, "modelSwitchActual");
            return (Criteria) this;
        }

        public Criteria andModelSwitchActualLessThan(BigDecimal value) {
            addCriterion("model_switch_actual <", value, "modelSwitchActual");
            return (Criteria) this;
        }

        public Criteria andModelSwitchActualLessThanOrEqualTo(BigDecimal value) {
            addCriterion("model_switch_actual <=", value, "modelSwitchActual");
            return (Criteria) this;
        }

        public Criteria andModelSwitchActualLike(BigDecimal value) {
            addCriterion("model_switch_actual like", value, "modelSwitchActual");
            return (Criteria) this;
        }

        public Criteria andModelSwitchActualNotLike(BigDecimal value) {
            addCriterion("model_switch_actual not like", value, "modelSwitchActual");
            return (Criteria) this;
        }

        public Criteria andModelSwitchActualIn(List<BigDecimal> values) {
            addCriterion("model_switch_actual in", values, "modelSwitchActual");
            return (Criteria) this;
        }

        public Criteria andModelSwitchActualNotIn(List<BigDecimal> values) {
            addCriterion("model_switch_actual not in", values, "modelSwitchActual");
            return (Criteria) this;
        }

        public Criteria andModelSwitchActualBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("model_switch_actual between", value1, value2, "modelSwitchActual");
            return (Criteria) this;
        }

        public Criteria andModelSwitchActualNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("model_switch_actual not between", value1, value2, "modelSwitchActual");
            return (Criteria) this;
        }

        public Criteria andQualityDeviationIsNull() {
            addCriterion("quality_deviation is null");
            return (Criteria) this;
        }

        public Criteria andQualityDeviationIsNotNull() {
            addCriterion("quality_deviation is not null");
            return (Criteria) this;
        }

        public Criteria andQualityDeviationEqualTo(BigDecimal value) {
            addCriterion("quality_deviation =", value, "qualityDeviation");
            return (Criteria) this;
        }

        public Criteria andQualityDeviationNotEqualTo(BigDecimal value) {
            addCriterion("quality_deviation <>", value, "qualityDeviation");
            return (Criteria) this;
        }

        public Criteria andQualityDeviationGreaterThan(BigDecimal value) {
            addCriterion("quality_deviation >", value, "qualityDeviation");
            return (Criteria) this;
        }

        public Criteria andQualityDeviationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("quality_deviation >=", value, "qualityDeviation");
            return (Criteria) this;
        }

        public Criteria andQualityDeviationLessThan(BigDecimal value) {
            addCriterion("quality_deviation <", value, "qualityDeviation");
            return (Criteria) this;
        }

        public Criteria andQualityDeviationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("quality_deviation <=", value, "qualityDeviation");
            return (Criteria) this;
        }

        public Criteria andQualityDeviationLike(BigDecimal value) {
            addCriterion("quality_deviation like", value, "qualityDeviation");
            return (Criteria) this;
        }

        public Criteria andQualityDeviationNotLike(BigDecimal value) {
            addCriterion("quality_deviation not like", value, "qualityDeviation");
            return (Criteria) this;
        }

        public Criteria andQualityDeviationIn(List<BigDecimal> values) {
            addCriterion("quality_deviation in", values, "qualityDeviation");
            return (Criteria) this;
        }

        public Criteria andQualityDeviationNotIn(List<BigDecimal> values) {
            addCriterion("quality_deviation not in", values, "qualityDeviation");
            return (Criteria) this;
        }

        public Criteria andQualityDeviationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quality_deviation between", value1, value2, "qualityDeviation");
            return (Criteria) this;
        }

        public Criteria andQualityDeviationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quality_deviation not between", value1, value2, "qualityDeviation");
            return (Criteria) this;
        }

        public Criteria andNotOvertimeIsNull() {
            addCriterion("not_overtime is null");
            return (Criteria) this;
        }

        public Criteria andNotOvertimeIsNotNull() {
            addCriterion("not_overtime is not null");
            return (Criteria) this;
        }

        public Criteria andNotOvertimeEqualTo(BigDecimal value) {
            addCriterion("not_overtime =", value, "notOvertime");
            return (Criteria) this;
        }

        public Criteria andNotOvertimeNotEqualTo(BigDecimal value) {
            addCriterion("not_overtime <>", value, "notOvertime");
            return (Criteria) this;
        }

        public Criteria andNotOvertimeGreaterThan(BigDecimal value) {
            addCriterion("not_overtime >", value, "notOvertime");
            return (Criteria) this;
        }

        public Criteria andNotOvertimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("not_overtime >=", value, "notOvertime");
            return (Criteria) this;
        }

        public Criteria andNotOvertimeLessThan(BigDecimal value) {
            addCriterion("not_overtime <", value, "notOvertime");
            return (Criteria) this;
        }

        public Criteria andNotOvertimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("not_overtime <=", value, "notOvertime");
            return (Criteria) this;
        }

        public Criteria andNotOvertimeLike(BigDecimal value) {
            addCriterion("not_overtime like", value, "notOvertime");
            return (Criteria) this;
        }

        public Criteria andNotOvertimeNotLike(BigDecimal value) {
            addCriterion("not_overtime not like", value, "notOvertime");
            return (Criteria) this;
        }

        public Criteria andNotOvertimeIn(List<BigDecimal> values) {
            addCriterion("not_overtime in", values, "notOvertime");
            return (Criteria) this;
        }

        public Criteria andNotOvertimeNotIn(List<BigDecimal> values) {
            addCriterion("not_overtime not in", values, "notOvertime");
            return (Criteria) this;
        }

        public Criteria andNotOvertimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("not_overtime between", value1, value2, "notOvertime");
            return (Criteria) this;
        }

        public Criteria andNotOvertimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("not_overtime not between", value1, value2, "notOvertime");
            return (Criteria) this;
        }

        public Criteria andStaffLeaveIsNull() {
            addCriterion("staff_leave is null");
            return (Criteria) this;
        }

        public Criteria andStaffLeaveIsNotNull() {
            addCriterion("staff_leave is not null");
            return (Criteria) this;
        }

        public Criteria andStaffLeaveEqualTo(BigDecimal value) {
            addCriterion("staff_leave =", value, "staffLeave");
            return (Criteria) this;
        }

        public Criteria andStaffLeaveNotEqualTo(BigDecimal value) {
            addCriterion("staff_leave <>", value, "staffLeave");
            return (Criteria) this;
        }

        public Criteria andStaffLeaveGreaterThan(BigDecimal value) {
            addCriterion("staff_leave >", value, "staffLeave");
            return (Criteria) this;
        }

        public Criteria andStaffLeaveGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("staff_leave >=", value, "staffLeave");
            return (Criteria) this;
        }

        public Criteria andStaffLeaveLessThan(BigDecimal value) {
            addCriterion("staff_leave <", value, "staffLeave");
            return (Criteria) this;
        }

        public Criteria andStaffLeaveLessThanOrEqualTo(BigDecimal value) {
            addCriterion("staff_leave <=", value, "staffLeave");
            return (Criteria) this;
        }

        public Criteria andStaffLeaveLike(BigDecimal value) {
            addCriterion("staff_leave like", value, "staffLeave");
            return (Criteria) this;
        }

        public Criteria andStaffLeaveNotLike(BigDecimal value) {
            addCriterion("staff_leave not like", value, "staffLeave");
            return (Criteria) this;
        }

        public Criteria andStaffLeaveIn(List<BigDecimal> values) {
            addCriterion("staff_leave in", values, "staffLeave");
            return (Criteria) this;
        }

        public Criteria andStaffLeaveNotIn(List<BigDecimal> values) {
            addCriterion("staff_leave not in", values, "staffLeave");
            return (Criteria) this;
        }

        public Criteria andStaffLeaveBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("staff_leave between", value1, value2, "staffLeave");
            return (Criteria) this;
        }

        public Criteria andStaffLeaveNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("staff_leave not between", value1, value2, "staffLeave");
            return (Criteria) this;
        }

        public Criteria andStopPlanIsNull() {
            addCriterion("stop_plan is null");
            return (Criteria) this;
        }

        public Criteria andStopPlanIsNotNull() {
            addCriterion("stop_plan is not null");
            return (Criteria) this;
        }

        public Criteria andStopPlanEqualTo(BigDecimal value) {
            addCriterion("stop_plan =", value, "stopPlan");
            return (Criteria) this;
        }

        public Criteria andStopPlanNotEqualTo(BigDecimal value) {
            addCriterion("stop_plan <>", value, "stopPlan");
            return (Criteria) this;
        }

        public Criteria andStopPlanGreaterThan(BigDecimal value) {
            addCriterion("stop_plan >", value, "stopPlan");
            return (Criteria) this;
        }

        public Criteria andStopPlanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stop_plan >=", value, "stopPlan");
            return (Criteria) this;
        }

        public Criteria andStopPlanLessThan(BigDecimal value) {
            addCriterion("stop_plan <", value, "stopPlan");
            return (Criteria) this;
        }

        public Criteria andStopPlanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stop_plan <=", value, "stopPlan");
            return (Criteria) this;
        }

        public Criteria andStopPlanLike(BigDecimal value) {
            addCriterion("stop_plan like", value, "stopPlan");
            return (Criteria) this;
        }

        public Criteria andStopPlanNotLike(BigDecimal value) {
            addCriterion("stop_plan not like", value, "stopPlan");
            return (Criteria) this;
        }

        public Criteria andStopPlanIn(List<BigDecimal> values) {
            addCriterion("stop_plan in", values, "stopPlan");
            return (Criteria) this;
        }

        public Criteria andStopPlanNotIn(List<BigDecimal> values) {
            addCriterion("stop_plan not in", values, "stopPlan");
            return (Criteria) this;
        }

        public Criteria andStopPlanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stop_plan between", value1, value2, "stopPlan");
            return (Criteria) this;
        }

        public Criteria andStopPlanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stop_plan not between", value1, value2, "stopPlan");
            return (Criteria) this;
        }

        public Criteria andFivesPlanIsNull() {
            addCriterion("fives_plan is null");
            return (Criteria) this;
        }

        public Criteria andFivesPlanIsNotNull() {
            addCriterion("fives_plan is not null");
            return (Criteria) this;
        }

        public Criteria andFivesPlanEqualTo(BigDecimal value) {
            addCriterion("fives_plan =", value, "fivesPlan");
            return (Criteria) this;
        }

        public Criteria andFivesPlanNotEqualTo(BigDecimal value) {
            addCriterion("fives_plan <>", value, "fivesPlan");
            return (Criteria) this;
        }

        public Criteria andFivesPlanGreaterThan(BigDecimal value) {
            addCriterion("fives_plan >", value, "fivesPlan");
            return (Criteria) this;
        }

        public Criteria andFivesPlanGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fives_plan >=", value, "fivesPlan");
            return (Criteria) this;
        }

        public Criteria andFivesPlanLessThan(BigDecimal value) {
            addCriterion("fives_plan <", value, "fivesPlan");
            return (Criteria) this;
        }

        public Criteria andFivesPlanLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fives_plan <=", value, "fivesPlan");
            return (Criteria) this;
        }

        public Criteria andFivesPlanLike(BigDecimal value) {
            addCriterion("fives_plan like", value, "fivesPlan");
            return (Criteria) this;
        }

        public Criteria andFivesPlanNotLike(BigDecimal value) {
            addCriterion("fives_plan not like", value, "fivesPlan");
            return (Criteria) this;
        }

        public Criteria andFivesPlanIn(List<BigDecimal> values) {
            addCriterion("fives_plan in", values, "fivesPlan");
            return (Criteria) this;
        }

        public Criteria andFivesPlanNotIn(List<BigDecimal> values) {
            addCriterion("fives_plan not in", values, "fivesPlan");
            return (Criteria) this;
        }

        public Criteria andFivesPlanBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fives_plan between", value1, value2, "fivesPlan");
            return (Criteria) this;
        }

        public Criteria andFivesPlanNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fives_plan not between", value1, value2, "fivesPlan");
            return (Criteria) this;
        }

        public Criteria andForeAnomalyIsNull() {
            addCriterion("fore_anomaly is null");
            return (Criteria) this;
        }

        public Criteria andForeAnomalyIsNotNull() {
            addCriterion("fore_anomaly is not null");
            return (Criteria) this;
        }

        public Criteria andForeAnomalyEqualTo(BigDecimal value) {
            addCriterion("fore_anomaly =", value, "foreAnomaly");
            return (Criteria) this;
        }

        public Criteria andForeAnomalyNotEqualTo(BigDecimal value) {
            addCriterion("fore_anomaly <>", value, "foreAnomaly");
            return (Criteria) this;
        }

        public Criteria andForeAnomalyGreaterThan(BigDecimal value) {
            addCriterion("fore_anomaly >", value, "foreAnomaly");
            return (Criteria) this;
        }

        public Criteria andForeAnomalyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fore_anomaly >=", value, "foreAnomaly");
            return (Criteria) this;
        }

        public Criteria andForeAnomalyLessThan(BigDecimal value) {
            addCriterion("fore_anomaly <", value, "foreAnomaly");
            return (Criteria) this;
        }

        public Criteria andForeAnomalyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fore_anomaly <=", value, "foreAnomaly");
            return (Criteria) this;
        }

        public Criteria andForeAnomalyLike(BigDecimal value) {
            addCriterion("fore_anomaly like", value, "foreAnomaly");
            return (Criteria) this;
        }

        public Criteria andForeAnomalyNotLike(BigDecimal value) {
            addCriterion("fore_anomaly not like", value, "foreAnomaly");
            return (Criteria) this;
        }

        public Criteria andForeAnomalyIn(List<BigDecimal> values) {
            addCriterion("fore_anomaly in", values, "foreAnomaly");
            return (Criteria) this;
        }

        public Criteria andForeAnomalyNotIn(List<BigDecimal> values) {
            addCriterion("fore_anomaly not in", values, "foreAnomaly");
            return (Criteria) this;
        }

        public Criteria andForeAnomalyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fore_anomaly between", value1, value2, "foreAnomaly");
            return (Criteria) this;
        }

        public Criteria andForeAnomalyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fore_anomaly not between", value1, value2, "foreAnomaly");
            return (Criteria) this;
        }

        public Criteria andPowerAnomalyIsNull() {
            addCriterion("power_anomaly is null");
            return (Criteria) this;
        }

        public Criteria andPowerAnomalyIsNotNull() {
            addCriterion("power_anomaly is not null");
            return (Criteria) this;
        }

        public Criteria andPowerAnomalyEqualTo(BigDecimal value) {
            addCriterion("power_anomaly =", value, "powerAnomaly");
            return (Criteria) this;
        }

        public Criteria andPowerAnomalyNotEqualTo(BigDecimal value) {
            addCriterion("power_anomaly <>", value, "powerAnomaly");
            return (Criteria) this;
        }

        public Criteria andPowerAnomalyGreaterThan(BigDecimal value) {
            addCriterion("power_anomaly >", value, "powerAnomaly");
            return (Criteria) this;
        }

        public Criteria andPowerAnomalyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("power_anomaly >=", value, "powerAnomaly");
            return (Criteria) this;
        }

        public Criteria andPowerAnomalyLessThan(BigDecimal value) {
            addCriterion("power_anomaly <", value, "powerAnomaly");
            return (Criteria) this;
        }

        public Criteria andPowerAnomalyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("power_anomaly <=", value, "powerAnomaly");
            return (Criteria) this;
        }

        public Criteria andPowerAnomalyLike(BigDecimal value) {
            addCriterion("power_anomaly like", value, "powerAnomaly");
            return (Criteria) this;
        }

        public Criteria andPowerAnomalyNotLike(BigDecimal value) {
            addCriterion("power_anomaly not like", value, "powerAnomaly");
            return (Criteria) this;
        }

        public Criteria andPowerAnomalyIn(List<BigDecimal> values) {
            addCriterion("power_anomaly in", values, "powerAnomaly");
            return (Criteria) this;
        }

        public Criteria andPowerAnomalyNotIn(List<BigDecimal> values) {
            addCriterion("power_anomaly not in", values, "powerAnomaly");
            return (Criteria) this;
        }

        public Criteria andPowerAnomalyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("power_anomaly between", value1, value2, "powerAnomaly");
            return (Criteria) this;
        }

        public Criteria andPowerAnomalyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("power_anomaly not between", value1, value2, "powerAnomaly");
            return (Criteria) this;
        }

        public Criteria andTrainingIsNull() {
            addCriterion("training is null");
            return (Criteria) this;
        }

        public Criteria andTrainingIsNotNull() {
            addCriterion("training is not null");
            return (Criteria) this;
        }

        public Criteria andTrainingEqualTo(BigDecimal value) {
            addCriterion("training =", value, "training");
            return (Criteria) this;
        }

        public Criteria andTrainingNotEqualTo(BigDecimal value) {
            addCriterion("training <>", value, "training");
            return (Criteria) this;
        }

        public Criteria andTrainingGreaterThan(BigDecimal value) {
            addCriterion("training >", value, "training");
            return (Criteria) this;
        }

        public Criteria andTrainingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("training >=", value, "training");
            return (Criteria) this;
        }

        public Criteria andTrainingLessThan(BigDecimal value) {
            addCriterion("training <", value, "training");
            return (Criteria) this;
        }

        public Criteria andTrainingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("training <=", value, "training");
            return (Criteria) this;
        }

        public Criteria andTrainingLike(BigDecimal value) {
            addCriterion("training like", value, "training");
            return (Criteria) this;
        }

        public Criteria andTrainingNotLike(BigDecimal value) {
            addCriterion("training not like", value, "training");
            return (Criteria) this;
        }

        public Criteria andTrainingIn(List<BigDecimal> values) {
            addCriterion("training in", values, "training");
            return (Criteria) this;
        }

        public Criteria andTrainingNotIn(List<BigDecimal> values) {
            addCriterion("training not in", values, "training");
            return (Criteria) this;
        }

        public Criteria andTrainingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("training between", value1, value2, "training");
            return (Criteria) this;
        }

        public Criteria andTrainingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("training not between", value1, value2, "training");
            return (Criteria) this;
        }

        public Criteria andOutsBoxIsNull() {
            addCriterion("outs_box is null");
            return (Criteria) this;
        }

        public Criteria andOutsBoxIsNotNull() {
            addCriterion("outs_box is not null");
            return (Criteria) this;
        }

        public Criteria andOutsBoxEqualTo(BigDecimal value) {
            addCriterion("outs_box =", value, "outsBox");
            return (Criteria) this;
        }

        public Criteria andOutsBoxNotEqualTo(BigDecimal value) {
            addCriterion("outs_box <>", value, "outsBox");
            return (Criteria) this;
        }

        public Criteria andOutsBoxGreaterThan(BigDecimal value) {
            addCriterion("outs_box >", value, "outsBox");
            return (Criteria) this;
        }

        public Criteria andOutsBoxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("outs_box >=", value, "outsBox");
            return (Criteria) this;
        }

        public Criteria andOutsBoxLessThan(BigDecimal value) {
            addCriterion("outs_box <", value, "outsBox");
            return (Criteria) this;
        }

        public Criteria andOutsBoxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("outs_box <=", value, "outsBox");
            return (Criteria) this;
        }

        public Criteria andOutsBoxLike(BigDecimal value) {
            addCriterion("outs_box like", value, "outsBox");
            return (Criteria) this;
        }

        public Criteria andOutsBoxNotLike(BigDecimal value) {
            addCriterion("outs_box not like", value, "outsBox");
            return (Criteria) this;
        }

        public Criteria andOutsBoxIn(List<BigDecimal> values) {
            addCriterion("outs_box in", values, "outsBox");
            return (Criteria) this;
        }

        public Criteria andOutsBoxNotIn(List<BigDecimal> values) {
            addCriterion("outs_box not in", values, "outsBox");
            return (Criteria) this;
        }

        public Criteria andOutsBoxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("outs_box between", value1, value2, "outsBox");
            return (Criteria) this;
        }

        public Criteria andOutsBoxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("outs_box not between", value1, value2, "outsBox");
            return (Criteria) this;
        }

        public Criteria andWaitRawIsNull() {
            addCriterion("wait_raw is null");
            return (Criteria) this;
        }

        public Criteria andWaitRawIsNotNull() {
            addCriterion("wait_raw is not null");
            return (Criteria) this;
        }

        public Criteria andWaitRawEqualTo(BigDecimal value) {
            addCriterion("wait_raw =", value, "waitRaw");
            return (Criteria) this;
        }

        public Criteria andWaitRawNotEqualTo(BigDecimal value) {
            addCriterion("wait_raw <>", value, "waitRaw");
            return (Criteria) this;
        }

        public Criteria andWaitRawGreaterThan(BigDecimal value) {
            addCriterion("wait_raw >", value, "waitRaw");
            return (Criteria) this;
        }

        public Criteria andWaitRawGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wait_raw >=", value, "waitRaw");
            return (Criteria) this;
        }

        public Criteria andWaitRawLessThan(BigDecimal value) {
            addCriterion("wait_raw <", value, "waitRaw");
            return (Criteria) this;
        }

        public Criteria andWaitRawLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wait_raw <=", value, "waitRaw");
            return (Criteria) this;
        }

        public Criteria andWaitRawLike(BigDecimal value) {
            addCriterion("wait_raw like", value, "waitRaw");
            return (Criteria) this;
        }

        public Criteria andWaitRawNotLike(BigDecimal value) {
            addCriterion("wait_raw not like", value, "waitRaw");
            return (Criteria) this;
        }

        public Criteria andWaitRawIn(List<BigDecimal> values) {
            addCriterion("wait_raw in", values, "waitRaw");
            return (Criteria) this;
        }

        public Criteria andWaitRawNotIn(List<BigDecimal> values) {
            addCriterion("wait_raw not in", values, "waitRaw");
            return (Criteria) this;
        }

        public Criteria andWaitRawBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wait_raw between", value1, value2, "waitRaw");
            return (Criteria) this;
        }

        public Criteria andWaitRawNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wait_raw not between", value1, value2, "waitRaw");
            return (Criteria) this;
        }

        public Criteria andTryWorkIsNull() {
            addCriterion("try_work is null");
            return (Criteria) this;
        }

        public Criteria andTryWorkIsNotNull() {
            addCriterion("try_work is not null");
            return (Criteria) this;
        }

        public Criteria andTryWorkEqualTo(BigDecimal value) {
            addCriterion("try_work =", value, "tryWork");
            return (Criteria) this;
        }

        public Criteria andTryWorkNotEqualTo(BigDecimal value) {
            addCriterion("try_work <>", value, "tryWork");
            return (Criteria) this;
        }

        public Criteria andTryWorkGreaterThan(BigDecimal value) {
            addCriterion("try_work >", value, "tryWork");
            return (Criteria) this;
        }

        public Criteria andTryWorkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("try_work >=", value, "tryWork");
            return (Criteria) this;
        }

        public Criteria andTryWorkLessThan(BigDecimal value) {
            addCriterion("try_work <", value, "tryWork");
            return (Criteria) this;
        }

        public Criteria andTryWorkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("try_work <=", value, "tryWork");
            return (Criteria) this;
        }

        public Criteria andTryWorkLike(BigDecimal value) {
            addCriterion("try_work like", value, "tryWork");
            return (Criteria) this;
        }

        public Criteria andTryWorkNotLike(BigDecimal value) {
            addCriterion("try_work not like", value, "tryWork");
            return (Criteria) this;
        }

        public Criteria andTryWorkIn(List<BigDecimal> values) {
            addCriterion("try_work in", values, "tryWork");
            return (Criteria) this;
        }

        public Criteria andTryWorkNotIn(List<BigDecimal> values) {
            addCriterion("try_work not in", values, "tryWork");
            return (Criteria) this;
        }

        public Criteria andTryWorkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("try_work between", value1, value2, "tryWork");
            return (Criteria) this;
        }

        public Criteria andTryWorkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("try_work not between", value1, value2, "tryWork");
            return (Criteria) this;
        }

        public Criteria andWheelTruingIsNull() {
            addCriterion("wheel_truing is null");
            return (Criteria) this;
        }

        public Criteria andWheelTruingIsNotNull() {
            addCriterion("wheel_truing is not null");
            return (Criteria) this;
        }

        public Criteria andWheelTruingEqualTo(BigDecimal value) {
            addCriterion("wheel_truing =", value, "wheelTruing");
            return (Criteria) this;
        }

        public Criteria andWheelTruingNotEqualTo(BigDecimal value) {
            addCriterion("wheel_truing <>", value, "wheelTruing");
            return (Criteria) this;
        }

        public Criteria andWheelTruingGreaterThan(BigDecimal value) {
            addCriterion("wheel_truing >", value, "wheelTruing");
            return (Criteria) this;
        }

        public Criteria andWheelTruingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wheel_truing >=", value, "wheelTruing");
            return (Criteria) this;
        }

        public Criteria andWheelTruingLessThan(BigDecimal value) {
            addCriterion("wheel_truing <", value, "wheelTruing");
            return (Criteria) this;
        }

        public Criteria andWheelTruingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wheel_truing <=", value, "wheelTruing");
            return (Criteria) this;
        }

        public Criteria andWheelTruingLike(BigDecimal value) {
            addCriterion("wheel_truing like", value, "wheelTruing");
            return (Criteria) this;
        }

        public Criteria andWheelTruingNotLike(BigDecimal value) {
            addCriterion("wheel_truing not like", value, "wheelTruing");
            return (Criteria) this;
        }

        public Criteria andWheelTruingIn(List<BigDecimal> values) {
            addCriterion("wheel_truing in", values, "wheelTruing");
            return (Criteria) this;
        }

        public Criteria andWheelTruingNotIn(List<BigDecimal> values) {
            addCriterion("wheel_truing not in", values, "wheelTruing");
            return (Criteria) this;
        }

        public Criteria andWheelTruingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wheel_truing between", value1, value2, "wheelTruing");
            return (Criteria) this;
        }

        public Criteria andWheelTruingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wheel_truing not between", value1, value2, "wheelTruing");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(BigDecimal value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(BigDecimal value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(BigDecimal value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(BigDecimal value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(BigDecimal value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(BigDecimal value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(BigDecimal value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<BigDecimal> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<BigDecimal> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("other not between", value1, value2, "other");
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