package com.spring.security.dao;

import org.springframework.security.core.userdetails.User;

public interface Assembler {

  User buildUserFromUserEntity(com.spring.security.model.User user);
}
