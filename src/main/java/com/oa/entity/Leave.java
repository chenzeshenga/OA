package com.oa.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Leave implements Serializable {
    private Byte leaveno;

    private String applicantname;

    private Byte applicantstarttime;

    private Date applicantendtime;

    private Date approvetime;

    private String approvername;

    private String leavereason;

    private String applicantdepartment;

    private String applicantjob;

    private String applicationstatus;

    private String approverdepartment;

    private static final long serialVersionUID = 1L;

    public Byte getLeaveno() {
        return leaveno;
    }

    public void setLeaveno(Byte leaveno) {
        this.leaveno = leaveno;
    }

    public String getApplicantname() {
        return applicantname;
    }

    public void setApplicantname(String applicantname) {
        this.applicantname = applicantname;
    }

    public Byte getApplicantstarttime() {
        return applicantstarttime;
    }

    public void setApplicantstarttime(Byte applicantstarttime) {
        this.applicantstarttime = applicantstarttime;
    }

    public Date getApplicantendtime() {
        return applicantendtime;
    }

    public void setApplicantendtime(Date applicantendtime) {
        this.applicantendtime = applicantendtime;
    }

    public Date getApprovetime() {
        return approvetime;
    }

    public void setApprovetime(Date approvetime) {
        this.approvetime = approvetime;
    }

    public String getApprovername() {
        return approvername;
    }

    public void setApprovername(String approvername) {
        this.approvername = approvername;
    }

    public String getLeavereason() {
        return leavereason;
    }

    public void setLeavereason(String leavereason) {
        this.leavereason = leavereason;
    }

    public String getApplicantdepartment() {
        return applicantdepartment;
    }

    public void setApplicantdepartment(String applicantdepartment) {
        this.applicantdepartment = applicantdepartment;
    }

    public String getApplicantjob() {
        return applicantjob;
    }

    public void setApplicantjob(String applicantjob) {
        this.applicantjob = applicantjob;
    }

    public String getApplicationstatus() {
        return applicationstatus;
    }

    public void setApplicationstatus(String applicationstatus) {
        this.applicationstatus = applicationstatus;
    }

    public String getApproverdepartment() {
        return approverdepartment;
    }

    public void setApproverdepartment(String approverdepartment) {
        this.approverdepartment = approverdepartment;
    }
}