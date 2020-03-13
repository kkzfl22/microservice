package com.liujun.microservice.ddd.demo.domain.user.repository.persistence;

import com.liujun.microservice.ddd.demo.TestParent;
import com.liujun.microservice.ddd.demo.domain.user.repository.facade.UserInfoRepository;
import com.liujun.microservice.ddd.demo.domain.user.repository.po.UserInfoPO;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/** 测试数据读取操作 */
public class TestUserInfoRepository extends TestParent {


  @Autowired
  @Qualifier("userInfoRepository")
  private UserInfoRepository userInfoRepository;

  @Test
  public void testGet() {
    UserInfoPO userInfoPO = new UserInfoPO();
    userInfoPO.setUserName("user");
    userInfoPO.setPassword("passwd");

    UserInfoPO userRsp = userInfoRepository.getUserInfo(userInfoPO);
    Assert.assertNotNull(userRsp);
  }
}
