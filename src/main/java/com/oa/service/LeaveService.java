package com.oa.service;

import com.oa.entity.Leader;
import com.oa.entity.Leave;
import com.oa.mapper.LeaderMapper;
import com.oa.mapper.LeaveMapper;
import com.oa.mapper.StudentMapper;
import com.oa.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by bran on 2017/6/7.
 */
@Service
@Transactional
public class LeaveService {

//    public int askForLeave(int applicantId, String reason,
//                           String startTime, String endTime) throws ParseException {
//            return askForLeave(applicantId, reason, format.parse(startTime), format.parse(endTime));
//    }

    public int askForLeave(int applicantId, String reason,
                           String startTime, String endTime) throws ParseException {
        Leave leave = new Leave();
        leave.setApplicantid(applicantId);
        leave.setReason(reason);
        leave.setStarttime(startTime);
        leave.setEndtime(endTime);
        leave.setApplicationstatus("PENDING");
//        selective 这个api比较好
        return leaveMapper.insertSelective(leave);
    }

    public List<Leave> listPositiveLeaves() {
        return leaveMapper.listPositiveLeaves();
    }

    public int updateVerifyOpinion(Leave leave) {
        return leaveMapper.updateVerifyOpinion(leave);
    }

    public List<Leave> listLeavesOfAPerson(int applicantId) {
        return leaveMapper.listLeavesOfAPerson(applicantId);
    }

    public String getNameFromApplicantId(int applicantId) {
        if (applicantId < 1000)
            return teacherMapper.getNameFromId(applicantId);
        if (applicantId < 2000)
            return leaderMapper.getNameFromId(applicantId - 1000);
        return studentMapper.getNameFromId(applicantId - 2000);
    }

    @Autowired
    LeaveMapper leaveMapper;

    @Autowired
    TeacherMapper teacherMapper;
    @Autowired
    LeaderMapper leaderMapper;
    @Autowired
    StudentMapper studentMapper;
}
