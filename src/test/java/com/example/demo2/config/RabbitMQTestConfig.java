package com.example.app.config;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.testcontainers.containers.RabbitMQContainer;
import org.testcontainers.junit.jupiter.Testcontainers;

@Configuration
@Testcontainers
public class RabbitMQTestConfig {
  
  private RabbitMQContainer rabbitmq = new RabbitMQContainer();
  
  @Bean
  public ConnectionFactory connectionFactory() {
    return new CachingConnectionFactory(rabbitmq.getContainerIpAddress());
  }

  @Bean
  public AmqpAdmin amqpAdmin() {
    return new RabbitAdmin(connectionFactory());
  }

  @Bean
  public RabbitTemplate rabbitTemplate() {
    return new RabbitTemplate(connectionFactory());
  }

  @Bean
  public Jackson2JsonMessageConverter jsonMessageConverter() {
    return new Jackson2JsonMessageConverter();
  }
}