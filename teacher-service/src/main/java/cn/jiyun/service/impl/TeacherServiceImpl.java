package cn.jiyun.service.impl;

import cn.jiyun.mapper.TeacherMapper;
import cn.jiyun.pojo.Teacher;
import cn.jiyun.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> getAll() {
        return teacherMapper.selectList(null);
    }
}
