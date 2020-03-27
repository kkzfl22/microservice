package com.liujun.microservice.ddd.demo.interfaces.assembler;

import com.liujun.microservice.ddd.demo.domain.user.entity.UserinfoDO;
import com.liujun.microservice.ddd.demo.interfaces.dto.UserInfoDTO;

/** 用户信息的转换类 */
public class UserInfoDTOAssembler {

  /**
   * 转换为领域的模型
   *
   * @param userinfoDTO 用户的dto对象
   * @return 领域实体对象
   */
  public static UserinfoDO toDO(UserInfoDTO userinfoDTO) {
    UserinfoDO userinfoDO = new UserinfoDO();
    userinfoDO.setUserName(userinfoDTO.getUserName());
    userinfoDO.setPassword(userinfoDTO.getPassword());
    return userinfoDO;
  }

  /**
   * 将领域对象信息转换为数据传输对象
   *
   * @param userinfoDO 用户领域对象
   * @return 用户数据传输对象
   */
  public static UserInfoDTO toDTO(UserinfoDO userinfoDO) {
    UserInfoDTO userinfoDTO = new UserInfoDTO();
    userinfoDTO.setUserId(userinfoDO.getUserId());
    userinfoDTO.setUserName(userinfoDO.getUserName());

    return userinfoDTO;
  }
}
