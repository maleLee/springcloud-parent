package com.aaa.lee.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019-08-20 13:05
 * @Description
 **/
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRun8084 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8084.class, args);
    }

}
