package com.liujun.microservice.ddd.demo.interfaces.dto;

/**
 * 请假实体信息
 *
 * @author liujun
 */
public class LeaveDTO {

  /** 请假的消息内容 */
  private String message;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("LeaveDTO{");
    sb.append("message='").append(message).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
