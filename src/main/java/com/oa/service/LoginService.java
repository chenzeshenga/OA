package com.oa.service;

import com.oa.entity.Teacher;
import com.oa.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by bran on 2017/6/6.
 */
@Service
@Transactional
public class LoginService {
    public String getPasswordFromUsernameAndType(String username, String userType) {
        Teacher teacher;
        if (userType.equalsIgnoreCase("teacher")) {
            teacher = teacherMapper.selectByUserName(username);
//            System.err.println(teacher.getPassword());
            return teacher.getPassword();
        } else return null;
    }

    @Autowired
    TeacherMapper teacherMapper;
}
