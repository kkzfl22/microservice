package com.liujun.microservice.ddd.demo.domain.user.repository.facade;

import com.liujun.microservice.ddd.demo.domain.user.repository.po.UserInfoPO;

/**
 * 用户信息存储的Repository操作
 *
 * @author liujun
 */
public interface UserInfoRepository {

  /**
   * 获取用户信息
   *
   * @param userPO 用户的数据库操作实体
   * @return 查询的用户信息
   */
  UserInfoPO getUserInfo(UserInfoPO userPO);
}
