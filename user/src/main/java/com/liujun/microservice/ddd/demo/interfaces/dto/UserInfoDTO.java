package com.liujun.microservice.ddd.demo.interfaces.dto;

/** 用户信息 */
public class UserInfoDTO {

  private String userName;

  private String password;

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
