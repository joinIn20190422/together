package com.acan.service.impl;

import com.acan.dao.UserDao;
import com.acan.entity.User;
import com.acan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User selUserByName(String name){
        User user = userDao.selByName(name);
        return user;
    }
}
