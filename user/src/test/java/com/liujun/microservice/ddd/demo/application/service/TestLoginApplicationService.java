package com.liujun.microservice.ddd.demo.application.service;

import com.liujun.microservice.ddd.demo.TestParent;
import com.liujun.microservice.ddd.demo.domain.user.entity.UserinfoDO;
import com.liujun.microservice.ddd.demo.infrastructure.common.api.ApiResonse;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/** 测试登录的应用服务 */
public class TestLoginApplicationService extends TestParent {

  @Autowired private LoginApplicationService loginApplicationService;

  @Test
  public void login() {
    UserinfoDO userinfoDO = new UserinfoDO();
    userinfoDO.setUserName("user");
    userinfoDO.setPassword("passwd");

    ApiResonse rsp = loginApplicationService.login(userinfoDO);
    Assert.assertEquals(rsp.getStatus(), ApiResonse.Status.SUCCESS);
  }
}
