package cn.jiyun.controller;

import cn.jiyun.pojo.Student;
import cn.jiyun.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("getAll")
    public List<Student> getAll() {
        return studentService.findStudent();
    }
}
