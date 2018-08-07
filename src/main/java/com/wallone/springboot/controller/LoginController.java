package com.wallone.springboot.controller;

import com.wallone.springboot.dao.UserMapper;
import com.wallone.springboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LoginController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping(value="cs")
    public User cs() {
        User user = userMapper.selectUserByName("wallone");
        return user;
    }
}
