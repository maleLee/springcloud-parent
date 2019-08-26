package com.aaa.lee.springcloud.controller;

import com.aaa.lee.springcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019-08-20 18:37
 * @Description
 **/
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/allUser")
    public List<User> selectAllUsers() {
        return restTemplate.getForObject("http://localhost:8089/userAll", List.class);
    }

}
