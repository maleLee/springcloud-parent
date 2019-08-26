package com.aaa.lee.springcloud.service;

import com.aaa.lee.springcloud.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019/8/23 19:32
 * @Description
 **/
@FeignClient(value = "springcloud-provider", fallbackFactory = UserFallBackService.class)
public interface IUserService {

    @RequestMapping("/userAll")
    List<User> selectAllUsers();

}
