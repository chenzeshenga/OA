package com.oa.mapper;

import com.hazelcast.spi.annotation.PrivateApi;
import com.oa.entity.Leave;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

/**.
 * Created by bran on 2017/6/7.
 */
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/dispatcher-servlet.xml"})
@Transactional
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class LeaverMapperTest {
    @Autowired
    LeaveMapper mapper;
    Leave leave;

    @Before
    public void setup() {
        leave = new Leave();
        leave.setApplicantid(1);
        leave.setReason("今天不想码代码");
        leave.setApplicationstatus("PENDING");
    }

    @Test
    public void testInsert() {

        mapper.insertSelective(leave);
        assertFalse(mapper.listPositiveLeaves().size() == 2);
    }

    @Test
    public void testVerify() {
        mapper.insertSelective(leave);
        assertTrue(mapper.listPositiveLeaves().size() == 1);
        leave = mapper.listPositiveLeaves().get(0);
        leave.setApplicationstatus("NO");
        System.out.println(leave.getId());
        mapper.updateVerifyOpinion(leave);
        assertTrue(mapper.listPositiveLeaves().size() == 0);

    }
}
