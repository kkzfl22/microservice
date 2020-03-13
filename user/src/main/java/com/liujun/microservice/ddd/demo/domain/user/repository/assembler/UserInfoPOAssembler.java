package com.liujun.microservice.ddd.demo.domain.user.repository.assembler;

import com.liujun.microservice.ddd.demo.domain.user.entity.UserinfoDO;
import com.liujun.microservice.ddd.demo.domain.user.repository.po.UserInfoPO;

/** 核心领域层的数据与持久化层的转化的服务 */
public class UserInfoPOAssembler {

  /**
   * 将领域层的数据转换为持久化层的数据
   *
   * @param userDO 用户实体
   * @return 持久化层的dao
   */
  public static UserInfoPO toPO(UserinfoDO userDO) {
    UserInfoPO userInfoPO = new UserInfoPO();
    userInfoPO.setUserName(userDO.getUserName());
    userInfoPO.setPassword(userDO.getPassword());
    return userInfoPO;
  }

  /**
   * 将持久化的数据交给领域层
   *
   * @param userPO 用户持久化层的数据
   * @return 用户领域数据
   */
  public static UserinfoDO toDO(UserInfoPO userPO) {
    UserinfoDO userinfoDO = new UserinfoDO();
    userinfoDO.setUserId(userPO.getUserId());
    userinfoDO.setUserName(userPO.getUserName());
    userinfoDO.setPassword(userPO.getPassword());
    userinfoDO.setMessage(userinfoDO.getMessage());

    return userinfoDO;
  }
}
