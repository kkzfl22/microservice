package com.liujun.microservice.ddd.demo.interfaces.facade;

import com.liujun.microservice.ddd.demo.application.service.LoginApplicationService;
import com.liujun.microservice.ddd.demo.domain.user.entity.UserinfoDO;
import com.liujun.microservice.ddd.demo.infrastructure.common.api.ApiResonse;
import com.liujun.microservice.ddd.demo.interfaces.assembler.UserInfoAssembler;
import com.liujun.microservice.ddd.demo.interfaces.dto.UserInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/auth")
public class AuthApi {

  private static final String AUTH_API = "USER_SESSION_FLAG";

  @Autowired private LoginApplicationService loginApplicationService;

  @PostMapping("/login")
  public ApiResonse login(UserInfoDTO userInfoDTO, HttpServletRequest request) {
    // 1，转换为领域对象
    UserinfoDO userinfoDo = UserInfoAssembler.toDO(userInfoDTO);
    // 2,传输到领域对象进行登录操作
    ApiResonse userRsp = loginApplicationService.login(userinfoDo);
    request.getSession().setAttribute(AUTH_API, userRsp);

    return userRsp;
  }

  /**
   * 获取用户信息
   *
   * @param request 请求操作
   * @return 获取用户信息
   */
  @PostMapping("/getUserInfo")
  public ApiResonse getUser(HttpServletRequest request) {
    ApiResonse userRsp = (ApiResonse) request.getSession().getAttribute(AUTH_API);
    return userRsp;
  }
}
