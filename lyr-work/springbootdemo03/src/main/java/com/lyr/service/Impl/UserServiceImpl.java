package com.lyr.service.Impl;

import com.lyr.dao.UserDao;
import com.lyr.pojo.User;
import com.lyr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }
}
