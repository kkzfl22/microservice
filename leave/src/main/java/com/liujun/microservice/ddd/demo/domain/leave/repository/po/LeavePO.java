package com.liujun.microservice.ddd.demo.domain.leave.repository.po;

/**
 * 用户请假操作的持久操作数据
 *
 * @author liujun
 */
public class LeavePO {

  /** 请假的id */
  private Integer leaveId;

  /** 用户信息 */
  private Integer userId;

  /** 请假消息 */
  private String message;

  /** 请假状态 */
  private int leaveStatus;

  public Integer getLeaveId() {
    return leaveId;
  }

  public void setLeaveId(Integer leaveId) {
    this.leaveId = leaveId;
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

  public int getLeaveStatus() {
    return leaveStatus;
  }

  public void setLeaveStatus(int leaveStatus) {
    this.leaveStatus = leaveStatus;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("LeavePO{");
    sb.append("leaveId=").append(leaveId);
    sb.append("userId=").append(userId);
    sb.append(", message='").append(message).append('\'');
    sb.append(", leaveStatus=").append(leaveStatus);
    sb.append('}');
    return sb.toString();
  }
}
