package com.oa.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class Course implements Serializable {
    private String courseno;

    private String coursename;

    private Byte courseteacherid;

    private String courseintro;

    private BigDecimal credit;

    private String classroom;

    private Date time;

    private String coursegrade;

    private String coursetype;

    private static final long serialVersionUID = 1L;

    public String getCourseno() {
        return courseno;
    }

    public void setCourseno(String courseno) {
        this.courseno = courseno;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public Byte getCourseteacherid() {
        return courseteacherid;
    }

    public void setCourseteacherid(Byte courseteacherid) {
        this.courseteacherid = courseteacherid;
    }

    public String getCourseintro() {
        return courseintro;
    }

    public void setCourseintro(String courseintro) {
        this.courseintro = courseintro;
    }

    public BigDecimal getCredit() {
        return credit;
    }

    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getCoursegrade() {
        return coursegrade;
    }

    public void setCoursegrade(String coursegrade) {
        this.coursegrade = coursegrade;
    }

    public String getCoursetype() {
        return coursetype;
    }

    public void setCoursetype(String coursetype) {
        this.coursetype = coursetype;
    }
}