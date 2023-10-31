package cn.jiyun.controller;


import cn.jiyun.pojo.Student;
import cn.jiyun.pojo.Teacher;
import cn.jiyun.pojo.User;
import cn.jiyun.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
    @HystrixCommand(fallbackMethod = "onError")
    public List<Student> getS() {
        return userService.getS();
    }


    //备选方案，这里直接返回空列表了
    //注意参数和返回值要和上面的一致
    List<Student> onError() {
        System.out.println("执行补救措施");
        ArrayList<Student> students = new ArrayList<>();
        return students;
    }
}
