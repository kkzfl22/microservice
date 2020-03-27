package com.liujun.microservice.ddd.demo.infrastructure.util.mq;

import com.liujun.microservice.ddd.demo.TestParent;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

/** 测试消息队列 */
public class TestRabbitMQSendAdapter extends TestParent {

  @Autowired private RabbitMQSendAdapter mqAdapter;

  @Test
  public void send() throws Exception {
    Map<String, Object> sendData = new HashMap<>();
    sendData.put("data", "field data");
    mqAdapter.send("this is test Msg", sendData);
  }
}
