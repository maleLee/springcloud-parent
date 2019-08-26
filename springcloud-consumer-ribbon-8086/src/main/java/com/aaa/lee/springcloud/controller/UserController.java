package com.aaa.lee.springcloud.controller;

import com.aaa.lee.springcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019-08-20 15:15
 * @Description
 **/
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    /**
     * @author Seven Lee
     * @description
     *      riboon集成eureka的负载均衡
     * @param []
     * @date 2019-08-20
     * @return java.util.List<com.aaa.lee.springcloud.model.User>
     * @throws 
    **/
    @RequestMapping("/allUser")
    public List<User> selectAllUsers() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("springcloud-provider");
        System.out.println(serviceInstance.getPort());
        return restTemplate.getForObject("http://SPRINGCLOUD-PROVIDER/userAll", List.class);
    }

    /**
     * @author Seven Lee
     * @description
     *      ribbon脱离eureka的负载均衡
     * @param []
     * @date 2019-08-20
     * @return java.util.List<com.aaa.lee.springcloud.model.User>
     * @throws 
    **/
    @RequestMapping("/allUserNoEureka")
    public List<User> selectUsers() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("springcloud-provider");
        System.out.println(serviceInstance.getPort());
        System.out.println(serviceInstance.getHost()+":"+serviceInstance.getPort()+"/userAll");
        return restTemplate.getForObject("http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/userAll", List.class);
    }

}
