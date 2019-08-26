package com.aaa.lee.springcloud.controller;

import com.aaa.lee.springcloud.model.User;
import com.aaa.lee.springcloud.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019-08-18 20:27
 * @Description
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/userAll")
    @HystrixCommand(fallbackMethod = "dueToAllUsers")
    public List<User> selectAllUsers() throws Exception {
        System.out.println("8081");
        List<User> userList = userService.selectAllUsers();
        if (userList.size() > 0) {
            throw new Exception("测试异常");
        } else {

        }
        return userList;
    }

    public List<User> dueToAllUsers() {
        List<User> userList = new ArrayList<User>();
        User user = new User();
        user.setId(10L);
        user.setUsername("hahaha");
        user.setPassword("12345678");
        user.setSalt("9999");
        userList.add(user);
        return userList;
    }

}
