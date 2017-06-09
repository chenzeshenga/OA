package com.oa.mapper;

import com.oa.service.LeaveService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

/**
 * Created by bran on 2017/6/8.
 */
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/dispatcher-servlet.xml"})
@Transactional
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class LeaveServiceTest {
    @Autowired
    LeaveService service;
    @Test
    public void testGetName(){
        assertEquals("LX",service.getNameFromApplicantId(1));
        assertEquals("leader",service.getNameFromApplicantId(1001));
        assertEquals("student",service.getNameFromApplicantId(2001));
    }
}
