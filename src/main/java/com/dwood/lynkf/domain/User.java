package com.dwood.lynkf.domain;

public class User {
    private String id;

    private String name;

    private String password;

    private String canInput;

    private String loginTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getCanInput() {
        return canInput;
    }

    public void setCanInput(String canInput) {
        this.canInput = canInput == null ? null : canInput.trim();
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime == null ? null : loginTime.trim();
    }
}