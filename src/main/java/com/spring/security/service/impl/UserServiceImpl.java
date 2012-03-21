package com.spring.security.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.security.dao.UserDAO;
import com.spring.security.model.User;
import com.spring.security.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

  @Autowired
  UserDAO userDAO;

  @Override
  public User findByUsername(String username) {
    return userDAO.findByUsername(username);
  }
}
