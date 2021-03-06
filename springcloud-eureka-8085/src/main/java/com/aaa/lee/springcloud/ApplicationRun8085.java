package com.aaa.lee.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019-08-20 13:13
 * @Description
 **/
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRun8085 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8085.class, args);
    }

}
