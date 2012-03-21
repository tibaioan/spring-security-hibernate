package com.spring.security.dao;

import com.spring.security.model.User;

public interface UserDAO {

  public User findByUsername(String username);

}
