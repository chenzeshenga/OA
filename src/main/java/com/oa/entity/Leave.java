package com.oa.entity;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by LHD on 2017/6/2.
 */
public class Leave {
    private int leaveNo;        //请假信息编号
    private String applicantName;   //请假人姓名
    private String applicantDepartment;   //请假人所在部门
    private String applicantJob;      //请假人所在职位
    private String startTime;        //请假开始时间
    private String endTime;      //截止时间
    private String reason;       //请假原因
    private String approverName;   //批准人姓名
    private String approveTime;     //批准时间
    private String approveDepartment;   //批准人所在部门
    private String applicantStatus;       //请假单状态

    public int getLeaveNo() {
        return leaveNo;
    }

    public void setLeaveNo(int leaveNo) {
        this.leaveNo = leaveNo;
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

    public Date getStartTime() throws java.text.ParseException{
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(startTime);
    }

    public void setStartTime(Date startTime) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.startTime = sdf.format(startTime);
    }

    public Date getEndTime() throws java.text.ParseException{
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(endTime);
    }

    public void setEndTime(Date endTime) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.endTime = sdf.format(endTime);
    }
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getApproverName() {
        return approverName;
    }

    public void setApproverName(String approverName) {
        this.approverName = approverName;
    }

    public Date getApproveTime() throws java.text.ParseException{
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(approveTime);
    }

    public void setApproveTime(Date approveTime) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.approveTime = sdf.format(approveTime);
    }

    public String getApproveDepartment() {
        return approveDepartment;
    }

    public void setApproveDepartment(String approveDepartment) {
        this.approveDepartment = approveDepartment;
    }

    public String getApplicantStatus() {
        return applicantStatus;
    }

    public void setApplicantStatus(String applicantStatus) {
        this.applicantStatus = applicantStatus;
    }
}
