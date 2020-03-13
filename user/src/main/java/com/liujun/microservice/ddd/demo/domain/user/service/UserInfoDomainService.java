package com.liujun.microservice.ddd.demo.domain.user.service;

import com.liujun.microservice.ddd.demo.domain.user.entity.UserinfoDO;
import com.liujun.microservice.ddd.demo.domain.user.repository.assembler.UserInfoPOAssembler;
import com.liujun.microservice.ddd.demo.domain.user.repository.facade.UserInfoRepository;
import com.liujun.microservice.ddd.demo.domain.user.repository.po.UserInfoPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 执行用户的核心领域服务
 *
 * @author liujun
 */
@Service
public class UserInfoDomainService {

  /** 当前用户与持久化层的操作 */
  @Autowired private UserInfoRepository userInfoRepositoryImpl;

  public UserinfoDO login(UserinfoDO userinfoDO) {

    UserInfoPO userPOQuery = UserInfoPOAssembler.toPO(userinfoDO);
    UserInfoPO userData = userInfoRepositoryImpl.getUserInfo(userPOQuery);

    if (null == userData) {
      return null;
    } else {
      return UserInfoPOAssembler.toDO(userData);
    }
  }
}
