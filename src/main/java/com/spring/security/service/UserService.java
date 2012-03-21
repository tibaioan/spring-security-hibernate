package com.spring.security.service;


import com.spring.security.model.User;

public interface UserService {

  public User findByUsername(String username);
}
