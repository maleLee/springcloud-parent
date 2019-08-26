package com.aaa.lee.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019/8/23 23:03
 * @Description
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer
public class ApplicationRun8095 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8095.class, args);
    }

}
