package cn.jiyun.service.impl;

import cn.jiyun.mapper.UserMapper;
import cn.jiyun.pojo.Teacher;
import cn.jiyun.pojo.User;
import cn.jiyun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public List<User> findAll() {
        return userMapper.selectList(null);
    }

    @Override
    public User getId(String id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<Teacher> getAll() {
//        List<Teacher> forObject = restTemplate.getForObject("http://teacher/getAll", List.class);
        return null;
    }
}
