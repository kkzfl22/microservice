package com.liujun.microservice.ddd.demo.interfaces.dto;

import lombok.Data;
import lombok.ToString;

/** 用户信息 */
@Data
@ToString
public class UserInfoDTO {

  /** 用户的密码 */
  private Integer userId;

  private String userName;

  private String password;
}
