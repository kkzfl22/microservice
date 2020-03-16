package com.liujun.microservice.ddd.demo.domain.leave.repository.persistence;

import com.liujun.microservice.ddd.demo.domain.leave.repository.facade.LeaveRepository;
import com.liujun.microservice.ddd.demo.domain.leave.repository.mapper.LeaveDAO;
import com.liujun.microservice.ddd.demo.domain.leave.repository.po.LeavePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 请假的数据库实现
 *
 * @author liujun
 */
@Repository
public class LeaveRepositoryImpl implements LeaveRepository {

  /** 请假数据库操作 */
  @Autowired private LeaveDAO leaveDAO;

  public boolean save(LeavePO leavePO) {

    int rs = leaveDAO.insert(leavePO);

    if (rs > 0) {
      return true;
    }

    return false;
  }

  public List<LeavePO> query(LeavePO leavePO) {
    return leaveDAO.query(leavePO);
  }

  public boolean delete(LeavePO leavePo) {
    return false;
  }
}
