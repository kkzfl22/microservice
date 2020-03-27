package com.liujun.microservice.ddd.demo.infrastructure.util.mq;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;


/** 进行消息中间件的操作 */
@Service
public class RabbitMQReceiverAdapter {

  @RabbitListener(
      bindings =
          @QueueBinding(
              value = @Queue(value = "vhost-queue", durable = "true"),
              exchange =
                  @Exchange(
                      value = "vhost_cp",
                      durable = "true",
                      type = "topic",
                      ignoreDeclarationExceptions = "true"),
              key = "spring-boo-test"))
  @RabbitHandler
  public void onMessage(Message message, Channel channel) throws Exception {
    System.err.println("--------------------------------------");
    System.err.println("消费端Payload: " + message.getPayload());
    Long deliveryTag = (Long) message.getHeaders().get(AmqpHeaders.DELIVERY_TAG);
    // 手工ACK,获取deliveryTag
    channel.basicAck(deliveryTag, false);
  }
}
