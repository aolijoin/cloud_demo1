package cn.jiyun.controller;

import cn.jiyun.pojo.Teacher;
import cn.jiyun.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping("findAll")
//    @CrossOrigin
    public List<Teacher> getTeacherAll() {
        return teacherService.getAll();
    }
}
