package com.liujun.microservice.ddd.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"com.liujun.microservice.ddd.demo.**.repository.mapper"})
public class UserApplication {

  public static void main(String[] args) throws InterruptedException {

    SpringApplication.run(UserApplication.class, args);
  }
}
