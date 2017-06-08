package com.oa.service;

import com.oa.entity.Admin;
import com.oa.entity.Leader;
import com.oa.entity.Student;
import com.oa.entity.Teacher;
import com.oa.mapper.AdminMapper;
import com.oa.mapper.LeaderMapper;
import com.oa.mapper.StudentMapper;
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
        if (userType.equalsIgnoreCase("teacher")) {
            Teacher teacher;
            teacher = teacherMapper.selectByUserName(username);
//            System.err.println(teacher.getPassword());
            return teacher.getPassword();
        } else if (userType.equalsIgnoreCase("admin")) {
            Admin admin;
            admin = adminMapper.selectByUserName(username);
            return admin.getPassword();
        } else if (userType.equalsIgnoreCase("student")) {
            Student student;
            student = studentMapper.selectByUserName(username);
            return student.getPassword();
        } else if (username.equalsIgnoreCase("leader")) {
            Leader leader;
            leader = leaderMapper.selectByUserName(username);
            return leader.getPassword();
        } else return null;
    }

    public Teacher getTeacherByUsername(String username) {
        return teacherMapper.selectByUserName(username);
    }

    public Admin getAdminByUsername(String username) {
        return adminMapper.selectByUserName(username);
    }

    public Student getStudentByUsername(String username) {
        return studentMapper.selectByUserName(username);
    }

    public Leader getLeaderByUsername(String username) {
        return leaderMapper.selectByUserName(username);
    }

    @Autowired
    TeacherMapper teacherMapper;
    @Autowired
    AdminMapper adminMapper;
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    LeaderMapper leaderMapper;
}
