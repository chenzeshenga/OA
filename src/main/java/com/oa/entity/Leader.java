package com.oa.entity;

import java.util.Date;

/**
 * Created by somed on 2017/6/2.
 */
public class Leader {
    private int leader_id;
    private String leader_name;
    private String leader_password;
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

    public int getLeader_id() {
        return leader_id;
    }

    public void setLeader_id(int leader_id) {
        this.leader_id = leader_id;
    }

    public String getLeader_name() {
        return leader_name;
    }

    public void setLeader_name(String leader_name) {
        this.leader_name = leader_name;
    }

    public String getLeader_password() {
        return leader_password;
    }

    public void setLeader_password(String leader_password) {
        this.leader_password = leader_password;
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
