package com.liujun.microservice.ddd.demo.application;

import com.liujun.microservice.ddd.demo.domain.leave.constant.LeaveStatus;
import com.liujun.microservice.ddd.demo.domain.leave.entity.LeaveDO;
import com.liujun.microservice.ddd.demo.domain.leave.service.LeaveDomainService;
import com.liujun.microservice.ddd.demo.infrastructure.api.ApiResonse;
import com.liujun.microservice.ddd.demo.infrastructure.client.AuthUserClient;
import com.liujun.microservice.ddd.demo.infrastructure.client.dto.AuthResponse;
import com.liujun.microservice.ddd.demo.infrastructure.client.dto.UserInfoDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 请假的应用服务
 *
 * @author liujun
 */
@Service
@Slf4j
public class LeaveApplicationService {

  @Autowired private AuthUserClient authUserClient;

  @Autowired private LeaveDomainService leaveDomainService;

  public ApiResonse create(LeaveDO leaveDO) {
    // 1,获取当前的用户信息"
    AuthResponse userRsp = authUserClient.getUserinfo();
    // 2,获取用户的信息
    UserInfoDTO userinfoDTO = userRsp.getData();

    log.info("create user {}", userinfoDTO);

    leaveDO.setUserId(userinfoDTO.getUserId());
    leaveDO.setLeaveId(RandomUtils.nextInt());
    leaveDO.setStatus(LeaveStatus.INIT);

    boolean createRsp = leaveDomainService.create(leaveDO);

    if (createRsp) {

      return ApiResonse.ok();
    } else {
      return ApiResonse.fail("errormsg");
    }
  }
}
