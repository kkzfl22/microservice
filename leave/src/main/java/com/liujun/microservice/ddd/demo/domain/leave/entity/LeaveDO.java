package com.liujun.microservice.ddd.demo.domain.leave.entity;

import com.liujun.microservice.ddd.demo.domain.leave.constant.LeaveStatus;

/**
 * 请假的领域对象
 *
 * @author liujun
 */
public class LeaveDO {

  /** 用户信息 */
  private Integer userId;

  /** 请假的消息 */
  private String message;

  /** 请假的状态 */
  private LeaveStatus status;

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

  public LeaveStatus getStatus() {
    return status;
  }

  public void setStatus(LeaveStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("LeaveDO{");
    sb.append("userId=").append(userId);
    sb.append(", message='").append(message).append('\'');
    sb.append(", status=").append(status);
    sb.append('}');
    return sb.toString();
  }
}
