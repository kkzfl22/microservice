package com.liujun.microservice.ddd.demo.domain.user.service;

import com.liujun.microservice.ddd.demo.TestParent;
import com.liujun.microservice.ddd.demo.domain.user.entity.UserinfoDO;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/** 测试领域层的核心服务 */
public class TestUserInfoDomainService extends TestParent {

  /** 领域层的核心服务 */
  @Autowired private UserInfoDomainService userInfoDomainService;

  @Test
  public void userLogin() {
    UserinfoDO userinfoDO = new UserinfoDO();
    userinfoDO.setUserName("user");
    userinfoDO.setPassword("passwd");
    UserinfoDO userRsp = userInfoDomainService.login(userinfoDO);
    Assert.assertNotNull(userinfoDO);
  }
}
