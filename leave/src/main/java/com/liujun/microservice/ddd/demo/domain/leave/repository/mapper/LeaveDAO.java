package com.liujun.microservice.ddd.demo.domain.leave.repository.mapper;

import com.liujun.microservice.ddd.demo.domain.leave.repository.po.LeavePO;

import java.util.List;

/**
 * 请假的mybatis的实现
 *
 * @author liujun
 */
public interface LeaveDAO {

  /**
   * 数据保存操作
   *
   * @param leavePO 请假信息
   * @return
   */
  int insert(LeavePO leavePO);

  /**
   * 数据修改操作
   *
   * @param leavePO 请假信息
   * @return 操作
   */
  int updateStatus(LeavePO leavePO);

  /**
   * 查询操作
   *
   * @param leavePO 请假查询条件
   * @return 结果
   */
  List<LeavePO> query(LeavePO leavePO);

  /**
   * 数据库持久化层的删除操作
   *
   * @param leavePO 持久化实体
   * @return 删除操作
   */
  int delete(LeavePO leavePO);
}
