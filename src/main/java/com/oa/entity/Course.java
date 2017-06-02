package com.oa.entity;

import sun.tools.jstat.ParserException;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by LHD on 2017/6/2.
 */
public class Course {
    private enum courseType{
        专业课 ,必修课 ,其他
    }

    private  int courseNo;                   //课程编号
    private int courseTeacherId;       //任课老师
    private String courseName;         //课程名称
    private String courseIntro;          //课程介绍
    private int credit;                          //学分
    private String classRoom;             //上课教室
    private String courseGrade;         //上课班级
    private courseType type;               //课程类型
    private String classTime;               //上课时间

    public Date getClassTime() throws java.text.ParseException{
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(classTime);
    }

    public void setClassTime(Date classTime) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.classTime = sdf.format(classTime);
    }

    public courseType getType() {
        return type;
    }

    public void setType(courseType type) {
        this.type = type;
    }

    public int getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(int courseNo) {
        this.courseNo = courseNo;
    }

    public int getCourseTeacherId() {
        return courseTeacherId;
    }

    public void setCourseTeacherId(int courseTeacherId) {
        this.courseTeacherId = courseTeacherId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseIntro() {
        return courseIntro;
    }

    public void setCourseIntro(String courseIntro) {
        this.courseIntro = courseIntro;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(String courseGrade) {
        this.courseGrade = courseGrade;
    }

}
