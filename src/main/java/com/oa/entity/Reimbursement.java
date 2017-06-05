package com.oa.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Reimbursement implements Serializable {
    private Byte reimbursementno;

    private String applicantname;

    private String applicantdepartment;

    private String applicantjob;

    private String reimbursementtype;

    private Integer reimbursementmoney;

    private Date approvetime;

    private String approvename;

    private String approverdepartment;

    private String reimbursementstatus;

    private static final long serialVersionUID = 1L;

    public Byte getReimbursementno() {
        return reimbursementno;
    }

    public void setReimbursementno(Byte reimbursementno) {
        this.reimbursementno = reimbursementno;
    }

    public String getApplicantname() {
        return applicantname;
    }

    public void setApplicantname(String applicantname) {
        this.applicantname = applicantname;
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

    public String getReimbursementtype() {
        return reimbursementtype;
    }

    public void setReimbursementtype(String reimbursementtype) {
        this.reimbursementtype = reimbursementtype;
    }

    public Integer getReimbursementmoney() {
        return reimbursementmoney;
    }

    public void setReimbursementmoney(Integer reimbursementmoney) {
        this.reimbursementmoney = reimbursementmoney;
    }

    public Date getApprovetime() {
        return approvetime;
    }

    public void setApprovetime(Date approvetime) {
        this.approvetime = approvetime;
    }

    public String getApprovename() {
        return approvename;
    }

    public void setApprovename(String approvename) {
        this.approvename = approvename;
    }

    public String getApproverdepartment() {
        return approverdepartment;
    }

    public void setApproverdepartment(String approverdepartment) {
        this.approverdepartment = approverdepartment;
    }

    public String getReimbursementstatus() {
        return reimbursementstatus;
    }

    public void setReimbursementstatus(String reimbursementstatus) {
        this.reimbursementstatus = reimbursementstatus;
    }
}