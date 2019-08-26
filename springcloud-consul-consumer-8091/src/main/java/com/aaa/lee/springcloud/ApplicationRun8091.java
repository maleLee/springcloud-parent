package com.aaa.lee.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019-08-20 18:19
 * @Description
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationRun8091 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8091.class, args);
    }

}
