package com.liujun.microservice.ddd.demo.domain.user.repository.persistence;

import com.liujun.microservice.ddd.demo.TestParent;
import com.liujun.microservice.ddd.demo.comm.DatabaseComm;
import com.liujun.microservice.ddd.demo.domain.user.repository.facade.UserInfoRepository;
import com.liujun.microservice.ddd.demo.domain.user.repository.po.UserInfoPO;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.*;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Statement;
import java.util.List;

/** 测试数据读取操作 */
public class TestUserInfoRepository extends TestParent {

  @Autowired private UserInfoRepository userInfoRepository;

  private UserInfoPO userInfoPO;

  @Before
  public void before() {
    userInfoPO = new UserInfoPO();
    userInfoPO.setUserName(RandomStringUtils.randomAlphabetic(5));
    userInfoPO.setPassword(RandomStringUtils.randomAlphabetic(5));
    userInfoPO.setUserId(RandomUtils.nextInt());
    userInfoPO.setMessage(RandomStringUtils.randomAlphabetic(10));

    userInfoRepository.save(userInfoPO);
  }

  @Test
  public void testGet() {
    UserInfoPO userInfoPOQuery = new UserInfoPO();
    userInfoPOQuery.setUserName(userInfoPO.getUserName());
    userInfoPOQuery.setPassword(userInfoPO.getPassword());

    UserInfoPO userRsp = userInfoRepository.getUserInfo(userInfoPOQuery);
    Assert.assertNotNull(userRsp);
  }

  @After
  public void clean() {
    userInfoRepository.delete(userInfoPO);
  }
}
