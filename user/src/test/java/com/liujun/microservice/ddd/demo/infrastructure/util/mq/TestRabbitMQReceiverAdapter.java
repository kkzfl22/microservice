package com.liujun.microservice.ddd.demo.infrastructure.util.mq;

import com.liujun.microservice.ddd.demo.TestParent;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/** 测试消息的接收 */
public class TestRabbitMQReceiverAdapter extends TestParent {

  @Autowired private RabbitMQReceiverAdapter receiverAdapter;

  @Test
  public void dataReceive() throws InterruptedException {
    Thread.sleep(1000000);
  }
}
