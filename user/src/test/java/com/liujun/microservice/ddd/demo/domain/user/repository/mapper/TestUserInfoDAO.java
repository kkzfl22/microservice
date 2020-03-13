package com.liujun.microservice.ddd.demo.domain.user.repository.mapper;

import com.liujun.microservice.ddd.demo.TestParent;
import com.liujun.microservice.ddd.demo.domain.user.repository.po.UserInfoPO;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestUserInfoDAO extends TestParent {

  @Autowired private UserInfoDAO userInfoDAO;

  @Test
  public void testGetData() {
    UserInfoPO userInfoPO = new UserInfoPO();
    userInfoPO.setUserName("user");
    userInfoPO.setPassword("passwd");

    UserInfoPO userRsp = userInfoDAO.getUserInfo(userInfoPO);
    Assert.assertNotNull(userRsp);
  }
}
