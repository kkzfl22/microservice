package com.liujun.microservice.ddd.demo.domain.leave.repository.assembler;

import com.liujun.microservice.ddd.demo.domain.leave.constant.LeaveStatus;
import com.liujun.microservice.ddd.demo.domain.leave.entity.LeaveDO;
import com.liujun.microservice.ddd.demo.domain.leave.repository.po.LeavePO;
import com.liujun.microservice.ddd.demo.interfaces.dto.LeaveDTO;

/**
 * 请假的领域服务与数据库实体之间的转化
 *
 * @author liujun
 */
public class LeavePOAssembler {

  public static LeavePO toPO(LeaveDO doData) {
    LeavePO datapo = new LeavePO();

    datapo.setUserId(doData.getUserId());
    datapo.setMessage(doData.getMessage());
    datapo.setLeaveStatus(doData.getStatus().getStatus());
    return datapo;
  }

  public static LeaveDO toDO(LeavePO dataPO) {
    LeaveDO leaveToPo = new LeaveDO();
    leaveToPo.setUserId(dataPO.getUserId());
    leaveToPo.setStatus(LeaveStatus.parse(dataPO.getLeaveStatus()));
    leaveToPo.setMessage(dataPO.getMessage());

    return leaveToPo;
  }
}
