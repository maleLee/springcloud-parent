package com.aaa.lee.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019/8/25 18:41
 * @Description
 **/
@SpringBootApplication
@EnableConfigServer
public class ApplicationRun8096 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8096.class, args);
    }

}
