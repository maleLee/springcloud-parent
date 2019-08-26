package com.aaa.lee.springcloud.service;

import com.aaa.lee.springcloud.model.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019/8/23 21:06
 * @Description
 **/
@Component
public class UserFallBackService implements FallbackFactory<IUserService> {

    public IUserService create(Throwable throwable) {
        return new IUserService() {
            public List<User> selectAllUsers() {
                List<User> userList = new ArrayList<User>();
                User user = new User();
                user.setId(10L);
                user.setUsername("hahaha");
                user.setPassword("12345678");
                user.setSalt("9999");
                userList.add(user);
                return userList;
            }
        };
    }
}
