package cn.jiyun.service;

import cn.jiyun.pojo.Student;
import cn.jiyun.pojo.Teacher;
import cn.jiyun.pojo.User;

import java.util.List;

public interface UserService {
    List<User>findAll();

    User getId(String id);

    List<Teacher> getAll();

    List<Student> getS();

}
