package com.liujun.microservice.ddd.demo.domain.user.repository.mapper;

import com.liujun.microservice.ddd.demo.domain.user.repository.facade.UserInfoRepository;
import com.liujun.microservice.ddd.demo.domain.user.repository.po.UserInfoPO;

/**
 * 用户操作的实现
 *
 * @author liujun
 */
public interface UserInfoDAO {

  /**
   * 保存用户信息
   *
   * @param userinfoPO
   * @return
   */
  int insert(UserInfoPO userinfoPO);

  /**
   * 获取用户信息
   *
   * @param userPO 用户的数据库操作实体
   * @return 查询的用户信息
   */
  UserInfoPO getUserInfo(UserInfoPO userPO);

  /**
   * 删除用户信息
   *
   * @param userinfoPO
   * @return
   */
  int delete(UserInfoPO userinfoPO);
}
