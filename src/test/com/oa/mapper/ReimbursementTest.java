package com.oa.mapper;

import com.oa.entity.Reimbursement;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by bran on 2017/6/8.
 */
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/dispatcher-servlet.xml"})
@Transactional
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class ReimbursementTest {
    @Autowired
    ReimbursementMapper mapper;
    private List<Reimbursement> reimbursements;

    @Test
    public void test() {
        Reimbursement reimbursement = new Reimbursement();
        reimbursement.setApplicantid(1);
        reimbursement.setApplytime(new Date());
        reimbursement.setMoney(100);
        reimbursement.setType("出行");
        mapper.insertSelective(reimbursement);
        reimbursements = mapper.listPositiveReimbursement();
        assertTrue(2== reimbursements.size());
        for (Reimbursement reimbursement1 : reimbursements) {
            reimbursement1.setApprovetime(new Date());
            reimbursement1.setReimbursementstatus("YES");
            mapper.updateVerifyOpinion(reimbursement1);
        }
        reimbursements = mapper.listPositiveReimbursement();
        assertTrue(0==reimbursements.size());
    }
}
