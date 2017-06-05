package com.oa.entity;

/**
 * Created by somed on 2017/6/2.
 */
public class Admin {
    private String adminId;
    private String adminName;
    private String adminPassword;
    private String sex;
    private String email;
    private String AdminInfo;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdminInfo() {
        return AdminInfo;
    }

    public void setAdminInfo(String adminInfo) {
        AdminInfo = adminInfo;
    }
}
