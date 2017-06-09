package com.oa.mapper;

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
public class LoginTest {
    @Autowired
    TeacherMapper teacherMapper;
    @Autowired
    AdminMapper adminMapper;
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    LeaderMapper leaderMapper;

    @Test
    public void testAdmin() {
        assertTrue(1 == adminMapper.selectByUserName("admin").getId());
    }

    @Test
    public void testStudent() {
        assertTrue("admin".equals(studentMapper.selectByUserName("student").getPassword()));
    }
    @Test
    public void testLeader(){
        assertTrue("admin".equals(leaderMapper.selectByUserName("leader").getPassword()));
    }
}
