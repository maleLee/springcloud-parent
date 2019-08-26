package com.aaa.lee.springcloud.config;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019-08-20 15:02
 * @Description
 **/
@SpringBootApplication
public class RestConfig {

    // 负载均衡
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    /*@Bean
    public IRule randomRule() {
        // 随机算法
        return new RandomRule();
    }*/

    /*@Bean
    public IRule bestAvailableRule() {
        // 选择一个最小的请求
        return new BestAvailableRule();
    }*/

}
