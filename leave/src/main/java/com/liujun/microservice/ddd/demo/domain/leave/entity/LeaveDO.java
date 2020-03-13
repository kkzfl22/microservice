package com.liujun.microservice.ddd.demo.domain.leave.entity;

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
  private STATUS status;

  public static enum STATUS {
    INIT(1),
    PASS(2),
    BREAK(-1);
    private int status;

    STATUS(int status) {
      this.status = status;
    }

    public int getStatus() {
      return status;
    }
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

  public STATUS getStatus() {
    return status;
  }

  public void setStatus(STATUS status) {
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
