package com.aaa.lee.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019/8/23 22:01
 * @Description
 **/
@SpringBootApplication
@EnableZuulProxy
public class ApplicationRun8094 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8094.class, args);
    }

}
