package com.liujun.microservice.ddd.demo.application;

import com.liujun.microservice.ddd.demo.TestParent;
import com.liujun.microservice.ddd.demo.domain.leave.constant.LeaveStatus;
import com.liujun.microservice.ddd.demo.domain.leave.entity.LeaveDO;
import com.liujun.microservice.ddd.demo.infrastructure.api.ApiResonse;
import com.liujun.microservice.ddd.demo.infrastructure.client.AuthUserClient;
import com.liujun.microservice.ddd.demo.infrastructure.client.dto.UserInfoDTO;
import mockit.Capturing;
import mockit.Expectations;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/** 测试请假的应用服务 */
public class TestLeaveApplicationService extends TestParent {

  @Autowired private LeaveApplicationService leaveApplicationService;

  @Test
  public void create(@Capturing final AuthUserClient client) {
    new Expectations() {
      {
        client.getUserinfo();
        ApiResonse rsp = ApiResonse.ok();
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userInfoDTO.setUserId(RandomUtils.nextInt());
        rsp.setData(userInfoDTO);
        result = rsp;
      }
    };

    LeaveDO leaveDO = new LeaveDO();
    leaveDO.setLeaveId(RandomUtils.nextInt());
    leaveDO.setMessage("this is test msg");
    leaveDO.setStatus(LeaveStatus.PASS);

    leaveApplicationService.create(leaveDO);
  }
}
