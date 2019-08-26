package com.aaa.lee.springcloud.rest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019-08-18 20:46
 * @Description
 **/
@SpringBootApplication
public class ConfigRest {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
