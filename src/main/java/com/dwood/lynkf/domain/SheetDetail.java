package com.dwood.lynkf.domain;

import java.math.BigDecimal;

public class SheetDetail {
    private String id;

    private String customer;

    private String product;

    private String ringSide;

    private String sealing;

    private BigDecimal productionPlan;

    private String raw;

    private String bundle;

    private String batch;

    private String line;

    private BigDecimal workTime;

    private BigDecimal yield;

    private BigDecimal bad;

    private BigDecimal repair;

    private BigDecimal machineAnomaly;

    private BigDecimal toolAnomaly;

    private BigDecimal modelSwitchPlan;

    private BigDecimal modelSwitchActual;

    private BigDecimal qualityDeviation;

    private BigDecimal notOvertime;

    private BigDecimal staffLeave;

    private BigDecimal stopPlan;

    private BigDecimal fivesPlan;

    private BigDecimal foreAnomaly;

    private BigDecimal powerAnomaly;

    private BigDecimal training;

    private BigDecimal outsBox;

    private BigDecimal waitRaw;

    private BigDecimal tryWork;

    private BigDecimal wheelTruing;

    private BigDecimal other;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product == null ? null : product.trim();
    }

    public String getRingSide() {
        return ringSide;
    }

    public void setRingSide(String ringSide) {
        this.ringSide = ringSide == null ? null : ringSide.trim();
    }

    public String getSealing() {
        return sealing;
    }

    public void setSealing(String sealing) {
        this.sealing = sealing == null ? null : sealing.trim();
    }

    public BigDecimal getProductionPlan() {
        return productionPlan;
    }

    public void setProductionPlan(BigDecimal productionPlan) {
        this.productionPlan = productionPlan;
    }

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw == null ? null : raw.trim();
    }

    public String getBundle() {
        return bundle;
    }

    public void setBundle(String bundle) {
        this.bundle = bundle == null ? null : bundle.trim();
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch == null ? null : batch.trim();
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line == null ? null : line.trim();
    }

    public BigDecimal getWorkTime() {
        return workTime;
    }

    public void setWorkTime(BigDecimal workTime) {
        this.workTime = workTime;
    }

    public BigDecimal getYield() {
        return yield;
    }

    public void setYield(BigDecimal yield) {
        this.yield = yield;
    }

    public BigDecimal getBad() {
        return bad;
    }

    public void setBad(BigDecimal bad) {
        this.bad = bad;
    }

    public BigDecimal getRepair() {
        return repair;
    }

    public void setRepair(BigDecimal repair) {
        this.repair = repair;
    }

    public BigDecimal getMachineAnomaly() {
        return machineAnomaly;
    }

    public void setMachineAnomaly(BigDecimal machineAnomaly) {
        this.machineAnomaly = machineAnomaly;
    }

    public BigDecimal getToolAnomaly() {
        return toolAnomaly;
    }

    public void setToolAnomaly(BigDecimal toolAnomaly) {
        this.toolAnomaly = toolAnomaly;
    }

    public BigDecimal getModelSwitchPlan() {
        return modelSwitchPlan;
    }

    public void setModelSwitchPlan(BigDecimal modelSwitchPlan) {
        this.modelSwitchPlan = modelSwitchPlan;
    }

    public BigDecimal getModelSwitchActual() {
        return modelSwitchActual;
    }

    public void setModelSwitchActual(BigDecimal modelSwitchActual) {
        this.modelSwitchActual = modelSwitchActual;
    }

    public BigDecimal getQualityDeviation() {
        return qualityDeviation;
    }

    public void setQualityDeviation(BigDecimal qualityDeviation) {
        this.qualityDeviation = qualityDeviation;
    }

    public BigDecimal getNotOvertime() {
        return notOvertime;
    }

    public void setNotOvertime(BigDecimal notOvertime) {
        this.notOvertime = notOvertime;
    }

    public BigDecimal getStaffLeave() {
        return staffLeave;
    }

    public void setStaffLeave(BigDecimal staffLeave) {
        this.staffLeave = staffLeave;
    }

    public BigDecimal getStopPlan() {
        return stopPlan;
    }

    public void setStopPlan(BigDecimal stopPlan) {
        this.stopPlan = stopPlan;
    }

    public BigDecimal getFivesPlan() {
        return fivesPlan;
    }

    public void setFivesPlan(BigDecimal fivesPlan) {
        this.fivesPlan = fivesPlan;
    }

    public BigDecimal getForeAnomaly() {
        return foreAnomaly;
    }

    public void setForeAnomaly(BigDecimal foreAnomaly) {
        this.foreAnomaly = foreAnomaly;
    }

    public BigDecimal getPowerAnomaly() {
        return powerAnomaly;
    }

    public void setPowerAnomaly(BigDecimal powerAnomaly) {
        this.powerAnomaly = powerAnomaly;
    }

    public BigDecimal getTraining() {
        return training;
    }

    public void setTraining(BigDecimal training) {
        this.training = training;
    }

    public BigDecimal getOutsBox() {
        return outsBox;
    }

    public void setOutsBox(BigDecimal outsBox) {
        this.outsBox = outsBox;
    }

    public BigDecimal getWaitRaw() {
        return waitRaw;
    }

    public void setWaitRaw(BigDecimal waitRaw) {
        this.waitRaw = waitRaw;
    }

    public BigDecimal getTryWork() {
        return tryWork;
    }

    public void setTryWork(BigDecimal tryWork) {
        this.tryWork = tryWork;
    }

    public BigDecimal getWheelTruing() {
        return wheelTruing;
    }

    public void setWheelTruing(BigDecimal wheelTruing) {
        this.wheelTruing = wheelTruing;
    }

    public BigDecimal getOther() {
        return other;
    }

    public void setOther(BigDecimal other) {
        this.other = other;
    }
}