package com.oa.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class Admin implements Serializable {
    private Integer adminid;

    private String adminname;

    private String adminpassword;

    private String sex;

    private String email;

    private String admininfo;

    private static final long serialVersionUID = 1L;

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword;
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

    public String getAdmininfo() {
        return admininfo;
    }

    public void setAdmininfo(String admininfo) {
        this.admininfo = admininfo;
    }
}