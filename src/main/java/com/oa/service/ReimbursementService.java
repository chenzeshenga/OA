package com.oa.service;

import com.oa.entity.Reimbursement;
import com.oa.mapper.LeaderMapper;
import com.oa.mapper.ReimbursementMapper;
import com.oa.mapper.StudentMapper;
import com.oa.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

/**
 * Created by bran on 2017/6/8.
 */
@Service
@Transactional
public class ReimbursementService {
    @Autowired
    ReimbursementMapper mapper;

    @Autowired
    TeacherMapper teacherMapper;
    @Autowired
    LeaderMapper leaderMapper;
    @Autowired
    StudentMapper studentMapper;

    public int askForReimbursement(int id, int money, String type) throws ParseException {
        Reimbursement reimbursement = new Reimbursement();
        reimbursement.setType(type);
        reimbursement.setMoney(money);
        reimbursement.setApplytime(new Date());
        reimbursement.setApplicantid(id);
        return mapper.insertSelective(reimbursement);
    }

    public List<Reimbursement> listPositiveReimbursement() {
        return mapper.listPositiveReimbursement();
    }

    public int updateVerifyOpinion(Reimbursement reimbursement) {
        return mapper.updateVerifyOpinion(reimbursement);
    }

    public List<Reimbursement> listRemibursementofAperson(int applicantId){
        return mapper.listRemibursementofAperson(applicantId);
    }

    public String getNameFromApplicantId(int applicantId) {
        if (applicantId < 1000)
            return teacherMapper.getNameFromId(applicantId);
        if (applicantId < 2000)
            return leaderMapper.getNameFromId(applicantId - 1000);
        return studentMapper.getNameFromId(applicantId - 2000);
    }

}
