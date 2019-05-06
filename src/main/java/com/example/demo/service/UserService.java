package com.example.demo.service;

import com.example.demo.entry.User;

public interface UserService {
    User getUserByUsername(String username);

    int addUser(User user);
}
