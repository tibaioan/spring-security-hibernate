
package com.spring.security.model;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;
@Entity
@Table(name = "users")
public class User implements Serializable{

  private static final long serialVersionUID = 1L;

  /**
   * Database id of User table
   */
  @Id
  private Long id;

  /**
   * User Password
   */
  private String password;

  /**
   * Username
   */
  private String username;
  
  /**
   * Firstname of the user
   */
  @Basic(optional = false)
  @Column(name = "firstname")
  private String firstname;
  
  /**
   * Lastname of the user
   */
  @Basic(optional = false)
  @Column(name = "lastname")
  private String lastname;
  
  /**
   * Email ID
   */
  @Basic(optional = false)
  @Column(name = "email")
  private String email;

  /**
   * Account enabled
   */
  @Basic(optional = false)
  @Column(name = "enabled")
  private short enabled;

  /**
   * Authorities of User
   */
  @OneToMany(mappedBy = "user")
  private List<Authority> authorities;

  /**
   * User Constructor
   */
  public User() {
  }

  /**
   * @return id Database ID
   */
  public Long getId() {
    return this.id;
  }

  /**
   * @param id Database ID to set
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * @return password Password
   */
  public String getPassword() {
    return this.password;
  }

  /**
   * @param password Password to set
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * @return username Username
   */
  public String getUsername() {
    return this.username;
  }

  /**
   * @param username Username to set
   */
  public void setUsername(String username) {
    this.username = username;
  }
  
  /**
   * 
   * @return firstname Firstname
   */
  public String getFirstname() {
    return firstname;
  }

  /**
   * 
   * @param firstname Firstname to set
   */
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  /**
   * 
   * @return lastname Lastname
   */
  public String getLastname() {
    return lastname;
  }

  /**
   * 
   * @param lastname Lastname to set
   */
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  /**
   * 
   * @return email Email ID
   */
  public String getEmail() {
    return email;
  }

  /**
   * 
   * @param email Email ID to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * @return enabled 0 means disaled and 1 means enabled
   */
  public short getEnabled() {
    return enabled;
  }

  /**
   * @param enabled 0 means disaled and 1 means enabled
   */
  public void setEnabled(short enabled) {
    this.enabled = enabled;
  }

  /**
   * @return authorities Authorities List of User
   */
  public List<Authority> getAuthorities() {
    return this.authorities;
  }

  /**
   * @param authorities Authorities List to set for User
   */
  public void setAuthorities(List<Authority> authorities) {
    this.authorities = authorities;
  }

  /**
   * Checking whether user account is enabled
   * 
   * @return boolean
   */
  public boolean isEnabled() {
    return enabled == 1 ? true : false;
  }
}