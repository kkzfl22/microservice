package com.liujun.microservice.ddd.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@MapperScan(value = {"com.liujun.microservice.ddd.demo.**.repository.mapper"})
public class LeaveApplication {

  public static void main(String[] args) throws InterruptedException {

    SpringApplication.run(LeaveApplication.class, args);
  }
}
