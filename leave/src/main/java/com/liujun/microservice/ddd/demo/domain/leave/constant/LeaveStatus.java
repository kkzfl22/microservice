package com.liujun.microservice.ddd.demo.domain.leave.constant;

/**
 * 请假的状态信息
 *
 * @author liujun
 */
public enum LeaveStatus {
  INIT(1),
  PASS(2),
  BREAK(-1);
  private int status;

  LeaveStatus(int status) {
    this.status = status;
  }

  public int getStatus() {
    return status;
  }

  public static LeaveStatus parse(int code) {
    for (LeaveStatus status : values()) {
      if (status.status == code) {
        return status;
      }
    }

    return LeaveStatus.BREAK;
  }
}
