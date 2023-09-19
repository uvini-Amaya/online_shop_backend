package com.shop.demo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.shop.demo.entity.User;

@Service
public interface UserService {
    List<User> getAllUsers();
    User createUser(User user);
    User getUserById(Long id);
}