package com.liujun.microservice.ddd.demo.application.service;

import com.liujun.microservice.ddd.demo.domain.user.entity.UserinfoDO;
import com.liujun.microservice.ddd.demo.domain.user.service.UserInfoDomainService;
import com.liujun.microservice.ddd.demo.infrastructure.common.api.ApiResonse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 登录的应用服务
 *
 * @author liujun
 */
@Service
public class LoginApplicationService {

  /** 领域层的核心服务 */
  @Autowired private UserInfoDomainService userInfoDomainService;

  /**
   * 执行登录操作
   *
   * @param userinfoDO
   * @return
   */
  public ApiResonse login(UserinfoDO userinfoDO) {
    UserinfoDO userinfoDOResult = userInfoDomainService.login(userinfoDO);

    ApiResonse rs = null;
    if (null == userinfoDOResult) {
      rs = ApiResonse.fail("登录失败，用户名或者密码失败");
    } else {
      rs = ApiResonse.ok(userinfoDOResult);
    }

    return rs;
  }
}
