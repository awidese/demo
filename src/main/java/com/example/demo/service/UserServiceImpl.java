package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.entry.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserByUsername(String username) {
        User user=userDao.selectByUsername(username);
        return user;
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
