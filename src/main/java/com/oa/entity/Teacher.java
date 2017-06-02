package com.oa.entity;

import java.util.Date;

/**
 * Created by somed on 2017/6/2.
 */
public class Teacher {
    private int teacher_id;
    private String teacher_name;
    private String teacher_password;
    private String sex;
    private String ManagerClass;
    private String teacherInfo;
    private String email;
    private String WorkState;
    private String Tel;
    private String Department;
    private String age;
    private String NativePlace;
    private Date EntryTime;
    private String Register;

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getTeacher_password() {
        return teacher_password;
    }

    public void setTeacher_password(String teacher_password) {
        this.teacher_password = teacher_password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getManagerClass() {
        return ManagerClass;
    }

    public void setManagerClass(String managerClass) {
        ManagerClass = managerClass;
    }

    public String getTeacherInfo() {
        return teacherInfo;
    }

    public void setTeacherInfo(String teacherInfo) {
        this.teacherInfo = teacherInfo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWorkState() {
        return WorkState;
    }

    public void setWorkState(String workState) {
        WorkState = workState;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNativePlace() {
        return NativePlace;
    }

    public void setNativePlace(String nativePlace) {
        NativePlace = nativePlace;
    }

    public Date getEntryTime() {
        return EntryTime;
    }

    public void setEntryTime(Date entryTime) {
        EntryTime = entryTime;
    }

    public String getRegister() {
        return Register;
    }

    public void setRegister(String register) {
        Register = register;
    }
}
