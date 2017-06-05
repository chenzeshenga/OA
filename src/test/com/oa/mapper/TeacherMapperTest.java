package com.oa.mapper;

import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by bran on 2017/6/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration
public class TeacherMapperTest extends TestCase {
    @Autowired
    TeacherMapper mapper;
    public void testListTeacher() throws Exception {
        mapper.listTeacher()
                .forEach(teacher-> System.out.println(teacher.getTeacherName()));
    }

}