package com.letv.service;

import com.letv.mapper.UserMapper;
import com.letv.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:Administrator
 * @Date: 2019/12/7 16:22
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
}
