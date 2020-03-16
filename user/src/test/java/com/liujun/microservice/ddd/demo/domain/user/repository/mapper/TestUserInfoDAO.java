package com.liujun.microservice.ddd.demo.domain.user.repository.mapper;

import com.liujun.microservice.ddd.demo.TestParent;
import com.liujun.microservice.ddd.demo.domain.user.repository.po.UserInfoPO;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class TestUserInfoDAO extends TestParent {

  @Autowired private UserInfoDAO userInfoDAO;

  private UserInfoPO userInfoPO;

  @Before
  public void before() {
    userInfoPO = new UserInfoPO();
    userInfoPO.setUserName(RandomStringUtils.randomAlphabetic(5));
    userInfoPO.setPassword(RandomStringUtils.randomAlphabetic(5));
    userInfoPO.setUserId(RandomUtils.nextInt());
    userInfoPO.setMessage(RandomStringUtils.randomAlphabetic(10));

    userInfoDAO.insert(userInfoPO);
  }

  @Test
  public void testGetData() {

    UserInfoPO userRsp = userInfoDAO.getUserInfo(userInfoPO);
    Assert.assertNotNull(userRsp);
  }

  @After
  public void clean() {
    userInfoDAO.delete(userInfoPO);
  }
}
