package com.example.springboot_rabbitmq_producer.Consumer;

import com.example.springboot_rabbitmq_producer.CustomMessage;
import com.example.springboot_rabbitmq_producer.MqConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener
{
    @RabbitListener(queues = MqConfig.QUEUE)
    public void Consume (CustomMessage message)
    {
        System.out.println(message);
    }
}
