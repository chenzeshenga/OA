package com.oa.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by LHD on 2017/6/2.
 */
//报销信息
public class Reimbursement {
    private int reimbursementNo;      //主键id
    private String applicantName;     //申报人名称
    private String applicantDepartment;   //申报人所在部门
    private String applicantJob;     //申报人的职位
    private String reimbursementType;   //申报类型
    private int reimbursementMoney;   //申报金额
    private String approveTime;      //审核通过时间
    private String approverName;    //审核人姓名
    private String approverDepartment;     //审核人所在部门
    private String reimbursementStatus;     //报销单状态

    public Date getApproveTime() throws java.text.ParseException{
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(approveTime);
    }

    public void setApproveTime(Date approveTime) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.approveTime = sdf.format(approveTime);
    }

    public int getReimbursementNo() {
        return reimbursementNo;
    }

    public void setReimbursementNo(int reimbursementNo) {
        this.reimbursementNo = reimbursementNo;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getApplicantDepartment() {
        return applicantDepartment;
    }

    public void setApplicantDepartment(String applicantDepartment) {
        this.applicantDepartment = applicantDepartment;
    }

    public String getApplicantJob() {
        return applicantJob;
    }

    public void setApplicantJob(String applicantJob) {
        this.applicantJob = applicantJob;
    }

    public String getReimbursementType() {
        return reimbursementType;
    }

    public void setReimbursementType(String reimbursementType) {
        this.reimbursementType = reimbursementType;
    }

    public int getReimbursementMoney() {
        return reimbursementMoney;
    }

    public void setReimbursementMoney(int reimbursementMoney) {
        this.reimbursementMoney = reimbursementMoney;
    }

    public String getApproverName() {
        return approverName;
    }

    public void setApproverName(String approverName) {
        this.approverName = approverName;
    }

    public String getApproverDepartment() {
        return approverDepartment;
    }

    public void setApproverDepartment(String approverDepartment) {
        this.approverDepartment = approverDepartment;
    }

    public String getReimbursementStatus() {
        return reimbursementStatus;
    }

    public void setReimbursementStatus(String reimbursementStatus) {
        this.reimbursementStatus = reimbursementStatus;
    }
}
