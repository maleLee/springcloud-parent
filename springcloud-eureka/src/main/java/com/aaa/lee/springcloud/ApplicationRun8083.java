package com.aaa.lee.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019-08-18 21:25
 * @Description
 *      Eureka的自我保护机制
 *      每一个在eureka中注册过的服务，都会定时向eureka发送心跳，但是如果eureka在时间内(默认90秒)并没有接收到某一个服务的心跳时，会把这个服务踢出去
 *      但是在指定时间内eureka收不到大量服务的心跳的时候，就不会再做任何剔除操作
 **/
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRun8083 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8083.class, args);
    }

}
