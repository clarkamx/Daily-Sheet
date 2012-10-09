package com.dwood.lynkf.domain;

import java.math.BigDecimal;

public class DailySheet {
    private String id;

    private String workDate;

    private String workShift;

    private String dept;

    private String foreman;

    private String operator;

    private BigDecimal timePlan;

    private BigDecimal timeActual;

    private String note;

    private String inputUser;

    private String inputDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate == null ? null : workDate.trim();
    }

    public String getWorkShift() {
        return workShift;
    }

    public void setWorkShift(String workShift) {
        this.workShift = workShift == null ? null : workShift.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public String getForeman() {
        return foreman;
    }

    public void setForeman(String foreman) {
        this.foreman = foreman == null ? null : foreman.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public BigDecimal getTimePlan() {
        return timePlan;
    }

    public void setTimePlan(BigDecimal timePlan) {
        this.timePlan = timePlan;
    }

    public BigDecimal getTimeActual() {
        return timeActual;
    }

    public void setTimeActual(BigDecimal timeActual) {
        this.timeActual = timeActual;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public String getInputUser() {
        return inputUser;
    }

    public void setInputUser(String inputUser) {
        this.inputUser = inputUser == null ? null : inputUser.trim();
    }

    public String getInputDate() {
        return inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate == null ? null : inputDate.trim();
    }
}