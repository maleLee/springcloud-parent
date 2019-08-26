package com.aaa.lee.springcloud.service;

import com.aaa.lee.springcloud.mapper.UserMapper;
import com.aaa.lee.springcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2019-08-18 20:25
 * @Description
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * @author Seven Lee
     * @description
     *      查询所有的用户信息
     * @param []
     * @date 2019-08-18
     * @return java.util.List<com.aaa.lee.springcloud.model.User>
     * @throws
    **/
    public List<User> selectAllUsers() {
        return userMapper.selectAll();
    }

}
