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
   * 查询操作
   *
   * @param leavePO 请假查询条件
   * @return 结果
   */
  List<LeavePO> query(LeavePO leavePO);
}
