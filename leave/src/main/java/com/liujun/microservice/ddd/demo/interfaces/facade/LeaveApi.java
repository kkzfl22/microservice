package com.liujun.microservice.ddd.demo.interfaces.facade;

import com.liujun.microservice.ddd.demo.infrastructure.api.ApiResonse;
import com.liujun.microservice.ddd.demo.interfaces.dto.LeaveDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 进行请假的提交
 *
 * @author liujun
 */
@RestController
@RequestMapping("/leave")
public class LeaveApi {

  @PostMapping
  public ApiResonse create(LeaveDTO leaveDTO) {
    return ApiResonse.ok();
  }
}
