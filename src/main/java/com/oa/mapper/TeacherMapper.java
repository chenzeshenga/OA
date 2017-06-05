package com.oa.mapper;

import com.oa.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * Created by bran on 2017/6/2.
 */
@Mapper
public interface TeacherMapper {
    public List<Teacher> listTeacher();
}
