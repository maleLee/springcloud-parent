package com.aaa.lee.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019/8/23 19:27
 * @Description
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.aaa.lee.springcloud"})
public class ApplicationRun8092 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8092.class, args);
    }

}
