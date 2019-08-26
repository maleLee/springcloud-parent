package com.aaa.lee.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019/8/25 20:26
 * @Description
 **/
@RestController
@RefreshScope
public class TestController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/config")
    public String config() {
        return port;
    }
}
