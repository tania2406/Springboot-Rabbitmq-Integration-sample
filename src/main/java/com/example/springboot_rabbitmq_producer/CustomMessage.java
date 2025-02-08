package com.example.springboot_rabbitmq_producer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomMessage
{
    String messageId;
    String message;
    Date messageDate;

}
