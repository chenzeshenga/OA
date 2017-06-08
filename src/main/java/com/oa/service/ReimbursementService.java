package com.oa.service;

import com.oa.entity.Reimbursement;
import com.oa.mapper.ReimbursementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    public int askForReimbursement(int id, int money, String type) {
        Reimbursement reimbursement = new Reimbursement();
        reimbursement.setType(type);
        reimbursement.setMoney(money);
        reimbursement.setApplytime(new Date());
        reimbursement.setApplicantid(id);
        return mapper.insertSelective(reimbursement);
    }

    List<Reimbursement> listPositiveReimbursement() {
        return mapper.listPositiveReimbursement();
    }

    int updateVerifyOpinion(Reimbursement reimbursement) {
        return mapper.updateVerifyOpinion(reimbursement);
    }
}
