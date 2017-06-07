package com.oa.service;

import com.oa.entity.Leave;
import com.oa.mapper.LeaveMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by bran on 2017/6/7.
 */
@Service
@Transactional
public class LeaveService {
    int askForLeave(int applicantId, String reason,
                    Date startTime, Date endTime) {
        Leave leave = new Leave();
        leave.setApplicantid(applicantId);
        leave.setReason(reason);
        leave.setStarttime(startTime);
        leave.setEndtime(endTime);
        leave.setApplicationstatus("PENDING");
//        selective 这个api比较好
        return leaveMapper.insertSelective(leave);
    }

    List<Leave> listPositiveLeaves() {
        return leaveMapper.listPositiveLeaves();
    }

    int updateVerifyOpinion(Leave leave) {
        return leaveMapper.updateVerifyOpinion(leave);
    }

    @Autowired
    LeaveMapper leaveMapper;
}
