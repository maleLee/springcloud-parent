package com.aaa.lee.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019-08-20 18:11
 * @Description
 **/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.aaa.lee.springcloud.mapper")
public class ApplicationRun8089 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8089.class, args);
    }

}
