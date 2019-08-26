package com.aaa.lee.springcloud.controller;

import com.aaa.lee.springcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019-08-18 20:50
 * @Description
 **/
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/userAll")
    public List<User> selectAllUsers() {
        return restTemplate.getForObject("http://localhost:8081/userAll", List.class);
    }

}
