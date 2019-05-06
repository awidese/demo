package com.example.demo.dao;

import com.example.demo.entry.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    User selectByUsername(String username);

    int addUser(User user);
}
