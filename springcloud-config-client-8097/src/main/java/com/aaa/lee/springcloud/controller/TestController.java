package com.aaa.lee.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019/8/25 19:47
 * @Description
 **/
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @Value("${mybatis.type-aliases-package}")
    private String mybatisTypePackage;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @RequestMapping("/config")
    public String config() {
        return port+"----"+mybatisTypePackage+"------"+driverClassName;
    }
}
