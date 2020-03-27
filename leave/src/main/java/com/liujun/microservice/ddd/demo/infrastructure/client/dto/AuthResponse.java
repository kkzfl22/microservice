package com.liujun.microservice.ddd.demo.infrastructure.client.dto;

import com.liujun.microservice.ddd.demo.infrastructure.api.ApiResonse;
import lombok.Data;

/** 授权响应操作 */
@Data
public class AuthResponse {

  /** 返回的枚举信息 */
  private ApiResonse.Status status;

  /** 错误码 */
  private int code;

  /** 错误信息 */
  private String msg;

  /** 数据操作响应 */
  private UserInfoDTO data;
}
