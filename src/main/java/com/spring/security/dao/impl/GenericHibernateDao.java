package com.spring.security.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class GenericHibernateDao<T> {

  private SessionFactory sessionFactory;

  @Resource(name = "sessionFactory")
  public void setSessionFactory(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  private Session getSession() {
    return sessionFactory.getCurrentSession();
  }

  @SuppressWarnings("unchecked")
  public List<T> findByQuery(String queryStr, Map<String, Object> params) { 
    Query query = getSession().createQuery(queryStr);
    if (params != null) {
      for (Map.Entry<String, Object> entry : params.entrySet()) {
        query.setParameter(entry.getKey(), entry.getValue());
      }
    }
    return query.list();
  }
}
