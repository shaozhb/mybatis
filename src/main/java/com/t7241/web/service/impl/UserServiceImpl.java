package com.t7241.web.service.impl;

import com.t7241.web.mapper.UserMapper;
import com.t7241.web.model.User;
import com.t7241.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;
    @Override
    public User getUser(int id) {
        return userMapper.getUser(id);
    }
}
