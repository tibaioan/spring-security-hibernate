/* Copyright(c) Tata Communications 2011 */
/**
 * 
 */
package com.spring.security.service.impl;

import org.springframework.security.acls.domain.AclAuthorizationStrategy;
import org.springframework.security.acls.model.Acl;

/**
 * Null Acl authorization strategy to circumvent authorization for Acl modifications.
 */
public class NullAclAuthorizationStrategyImpl implements AclAuthorizationStrategy {

  /*
   * (non-Javadoc)
   * @see org.springframework.security.acls.domain.AclAuthorizationStrategy#securityCheck(
   * org.springframework.security.acls.model.Acl, int)
   */
  
  @Override
  public void securityCheck(Acl acl, int changeType) {
  }

}
