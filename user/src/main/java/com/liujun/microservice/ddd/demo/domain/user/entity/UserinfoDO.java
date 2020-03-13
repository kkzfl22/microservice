package com.liujun.microservice.ddd.demo.domain.user.entity;

/** 用户信息 */
public class UserinfoDO {

  /** 用户的密码 */
  private Integer userId;

  /** 用户名 */
  private String userName;

  /** 密码 */
  private String password;

  /** 用户层的数据 */
  private String message;

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

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("UserinfoDO{");
    sb.append("userId=").append(userId);
    sb.append(", userName='").append(userName).append('\'');
    sb.append(", password='").append(password).append('\'');
    sb.append(", message='").append(message).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
