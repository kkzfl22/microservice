package com.liujun.microservice.ddd.demo.domain.leave.service;

import com.liujun.microservice.ddd.demo.domain.leave.entity.LeaveDO;
import com.liujun.microservice.ddd.demo.domain.leave.repository.assembler.LeavePOAssembler;
import com.liujun.microservice.ddd.demo.domain.leave.repository.facade.LeaveRepository;
import com.liujun.microservice.ddd.demo.domain.leave.repository.po.LeavePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 进行请假的领服域调用
 *
 * @author liujun
 */
@Service
public class LeaveDomainService {

  /** 请假的服务 */
  @Autowired private LeaveRepository leaveRepository;

  /**
   * 请假的服务
   *
   * @return
   */
  public boolean create(LeaveDO leave) {
    LeavePO leavePO = LeavePOAssembler.toPO(leave);
    return leaveRepository.save(leavePO);
  }

  public boolean updateStatus(LeaveDO leaveDO) {
    LeavePO leavePO = LeavePOAssembler.toPO(leaveDO);
    return leaveRepository.updateStatus(leavePO);
  }

  /**
   * 删除操作
   *
   * @param leaveId 请假的id
   * @return
   */
  public boolean deleteById(Integer leaveId) {
    return leaveRepository.deleteById(leaveId);
  }

  /**
   * 查询用户请假的信息
   *
   * @param leaveId 请假的id
   * @return
   */
  public LeaveDO queryById(Integer leaveId) {

    LeavePO dataRsp = leaveRepository.queryById(leaveId);

    if (null != dataRsp) {
      return LeavePOAssembler.toDO(dataRsp);
    }

    return null;
  }
}
