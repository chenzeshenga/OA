package com.oa.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Leader implements Serializable {
    private Integer leadersId;

    private String leadername;

    private String leaderpassword;

    private String sex;

    private String managerdepartment;

    private String email;

    private String leaderinfo;

    private String tel;

    private String workstate;

    private String register;

    private Date entrytime;

    private String nativeplace;

    private String age;

    private static final long serialVersionUID = 1L;

    public Integer getLeadersId() {
        return leadersId;
    }

    public void setLeadersId(Integer leadersId) {
        this.leadersId = leadersId;
    }

    public String getLeadername() {
        return leadername;
    }

    public void setLeadername(String leadername) {
        this.leadername = leadername;
    }

    public String getLeaderpassword() {
        return leaderpassword;
    }

    public void setLeaderpassword(String leaderpassword) {
        this.leaderpassword = leaderpassword;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getManagerdepartment() {
        return managerdepartment;
    }

    public void setManagerdepartment(String managerdepartment) {
        this.managerdepartment = managerdepartment;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLeaderinfo() {
        return leaderinfo;
    }

    public void setLeaderinfo(String leaderinfo) {
        this.leaderinfo = leaderinfo;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getWorkstate() {
        return workstate;
    }

    public void setWorkstate(String workstate) {
        this.workstate = workstate;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public Date getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}