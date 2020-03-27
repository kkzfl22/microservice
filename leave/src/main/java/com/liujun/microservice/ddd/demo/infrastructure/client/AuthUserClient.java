package com.liujun.microservice.ddd.demo.infrastructure.client;

import com.liujun.microservice.ddd.demo.infrastructure.api.ApiResonse;
import com.liujun.microservice.ddd.demo.infrastructure.client.dto.AuthResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 引用其他服务
 *
 * @author liujun
 */
@FeignClient(name = "microservice", url = "http://127.0.0.1:8080/microservice")
public interface AuthUserClient {

  @PostMapping(value = "/auth/getUserInfo")
  AuthResponse getUserinfo();
}
