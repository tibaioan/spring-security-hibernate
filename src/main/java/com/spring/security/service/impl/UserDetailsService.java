 

package com.spring.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import com.spring.security.dao.Assembler;
import com.spring.security.dao.UserDAO;
import com.spring.security.model.User;


 
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

 
  @Autowired
  private UserDAO userDAO;
 
  @Autowired
  private Assembler assember;
   
  @Transactional(readOnly = true)
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {
    User user = userDAO.findByUsername(username);
    if (user == null) {
      throw new UsernameNotFoundException("No such user");
    }
    return assember.buildUserFromUserEntity(user);
  }

}
