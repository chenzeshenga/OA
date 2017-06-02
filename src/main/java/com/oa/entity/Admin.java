package com.oa.entity;

/**
 * Created by somed on 2017/6/2.
 */
public class Admin {
    private String admin_id;
    private String admin_name;
    private String admin_password;
    private String sex;
    private String email;
    private String AdminInfo;

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
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
