package com.spring.security.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.security.dao.UserDAO;
import com.spring.security.model.User;

@Repository("userDAO")
public class UserDAOImpl extends GenericHibernateDao<User> implements UserDAO {
 
  @Transactional(readOnly = true)
  @Override
  public User findByUsername(String username) { 
    Map<String, Object> params = new HashMap<String, Object>();
    params.put("username", username);
    List<User> users = findByQuery("from User where username=:username", params);
    return users.size() > 0 ? users.get(0) : null;
  }

}
