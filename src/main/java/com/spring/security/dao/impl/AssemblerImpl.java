package com.spring.security.dao.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.security.dao.Assembler;
import com.spring.security.model.Authority;

 
@Repository("assembler")
public class AssemblerImpl implements Assembler {
  @Override
  @Transactional(readOnly = true)
  public User buildUserFromUserEntity(com.spring.security.model.User user) { 
    Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
    for (Authority authority : user.getAuthorities()) {
      authorities.add(new GrantedAuthorityImpl(authority.getAuthority()));
    }
    User userDetails = new User(user.getUsername(), user.getPassword(), user.isEnabled(), true, true, true, authorities);
    return userDetails;
  }
}