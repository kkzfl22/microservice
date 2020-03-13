package com.liujun.microservice.ddd.demo.interfaces.assembler;

import com.liujun.microservice.ddd.demo.domain.leave.entity.LeaveDO;
import com.liujun.microservice.ddd.demo.interfaces.dto.LeaveDTO;

/**
 * 前端交互数据dto与do对象数拓的交换
 *
 * @author liujun
 */
public class LeaveDTOAssembler {

  public static LeaveDO toDO(LeaveDTO leaveDTO) {
    LeaveDO leaveDO = new LeaveDO();
    leaveDO.setMessage(leaveDTO.getMessage());
    return leaveDO;
  }
}
