package cn.jiyun.controller;


import cn.jiyun.pojo.Student;
import cn.jiyun.pojo.Teacher;
import cn.jiyun.pojo.User;
import cn.jiyun.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getId/{id}")
    public User getId(@PathVariable String id) {
        log.info("{}", id);
        return userService.getId(id);
    }

    @GetMapping("/getAll")
    public List<Teacher> getAll() {
        log.info("请求进来啦: {}", userService.getAll());
        return userService.getAll();
    }
    @GetMapping("/getS")
    public List<Student> getS(){
        return userService.getS();
    }

}
