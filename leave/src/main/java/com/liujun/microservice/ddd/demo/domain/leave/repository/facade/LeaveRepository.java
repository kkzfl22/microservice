package com.liujun.microservice.ddd.demo.domain.leave.repository.facade;

import com.liujun.microservice.ddd.demo.domain.leave.repository.po.LeavePO;

import java.util.List;

/**
 * 请假持久化操作的接口
 *
 * @author liujun
 */
public interface LeaveRepository {

  /**
   * 数据保存操作
   *
   * @param leavePO 请假信息
   * @return
   */
  boolean save(LeavePO leavePO);

  /**
   * 数据修改操作
   *
   * @param leavePO
   * @return
   */
  boolean updateStatus(LeavePO leavePO);

  /**
   * 查询操作
   *
   * @param leaveId 请假的id
   * @return 结果
   */
  LeavePO queryById(int leaveId);

  /**
   * 执行数据数据库删除操作
   *
   * @param leaveId 请假的id
   * @return 结果
   */
  boolean deleteById(int leaveId);
}
