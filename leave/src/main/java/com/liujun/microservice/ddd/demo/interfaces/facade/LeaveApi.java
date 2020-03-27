package com.liujun.microservice.ddd.demo.interfaces.facade;

import com.liujun.microservice.ddd.demo.application.LeaveApplicationService;
import com.liujun.microservice.ddd.demo.domain.leave.entity.LeaveDO;
import com.liujun.microservice.ddd.demo.infrastructure.api.ApiResonse;
import com.liujun.microservice.ddd.demo.interfaces.assembler.LeaveDTOAssembler;
import com.liujun.microservice.ddd.demo.interfaces.dto.LeaveDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 进行请假的提交
 *
 * @author liujun
 */
@RestController
@RequestMapping("/leave")
public class LeaveApi {

  /** 请假操作 */
  @Autowired private LeaveApplicationService leaveApplicationService;

  @PostMapping
  public ApiResonse create(@RequestBody LeaveDTO leaveDTO) {
    // 1，转换为领域对象
    LeaveDO userinfoDo = LeaveDTOAssembler.toDO(leaveDTO);

    return leaveApplicationService.create(userinfoDo);
  }

  @DeleteMapping("/{userId}")
  public ApiResonse delete(@PathVariable String userId) {
    return ApiResonse.ok();
  }

  /**
   * 查询用户的请假信息
   *
   * @return
   */
  @GetMapping
  public ApiResonse query() {
    return ApiResonse.ok();
  }
}
