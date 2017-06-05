package com.oa.entity;

import java.util.Date;

/**
 * Created by somed on 2017/6/2.
 */
public class Leader {
    private int leaderId;
    private String leaderName;
    private String leaderPassword;
    private String sex;
    private String ManagerDepartment;
    private String email;
    private String leaderInfo;
    private String Tel;
    private String WorkState;
    private String Register;
    private Date EntryTime;
    private String NativePlace;
    private String age;

    public int getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(int leaderId) {
        this.leaderId = leaderId;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public String getLeaderPassword() {
        return leaderPassword;
    }

    public void setLeaderPassword(String leaderPassword) {
        this.leaderPassword = leaderPassword;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getManagerDepartment() {
        return ManagerDepartment;
    }

    public void setManagerDepartment(String managerDepartment) {
        ManagerDepartment = managerDepartment;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLeaderInfo() {
        return leaderInfo;
    }

    public void setLeaderInfo(String leaderInfo) {
        this.leaderInfo = leaderInfo;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getWorkState() {
        return WorkState;
    }

    public void setWorkState(String workState) {
        WorkState = workState;
    }

    public String getRegister() {
        return Register;
    }

    public void setRegister(String register) {
        Register = register;
    }

    public Date getEntryTime() {
        return EntryTime;
    }

    public void setEntryTime(Date entryTime) {
        EntryTime = entryTime;
    }

    public String getNativePlace() {
        return NativePlace;
    }

    public void setNativePlace(String nativePlace) {
        NativePlace = nativePlace;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
