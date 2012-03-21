package com.spring.security.model;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@Table(name = "authorities")
public class Authority implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * Id of authorities table
   */
  @Id
  private int id;

  /**
   * Authority name
   */
  private String authority;

  /**
   * Bi-directional many-to-one association to User
   */
  @ManyToOne
  private User user;

  /**
   * Constructor of Authority
   */
  public Authority() {
  }

  /**
   * 
   * @return id of authorities table
   */
  public int getId() {
    return this.id;
  }

  /**
   * 
   * @param id Id of authorities to set
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * 
   * @return authority Authority name
   */
  public String getAuthority() {
    return this.authority;
  }

  /**
   * 
   * @param authority the Authority name to set
   */
  public void setAuthority(String authority) {
    this.authority = authority;
  }

  /**
   * 
   * @return user The user object 
   */
  public User getUser() {
    return this.user;
  }

  /**
   * 
   * @param user The user object to set
   */
  public void setUser(User user) {
    this.user = user;
  }

}