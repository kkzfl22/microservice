package com.liujun.microservice.ddd.demo.infrastructure.api;

import lombok.Builder;

@Builder
public class ApiResonse {

  /** 返回的枚举信息 */
  private Status status;

  /** 错误码 */
  private int code;

  /** 错误信息 */
  private String msg;

  /** 返回结果 */
  private Object data;

  public static ApiResonse ok() {
    return ApiResonse.builder().status(Status.SUCCESS).build();
  }

  public static ApiResonse ok(Object data) {
    return ApiResonse.builder().status(Status.SUCCESS).data(data).build();
  }

  public static ApiResonse fail(Object data) {
    return ApiResonse.builder().status(Status.FAIL).data(data).build();
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public static enum Status {
    SUCCESS,
    FAIL;
  }
}
