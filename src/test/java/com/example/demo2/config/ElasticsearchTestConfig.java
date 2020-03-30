package com.example.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.reactive.ReactiveElasticsearchClient;
import org.springframework.data.elasticsearch.client.reactive.ReactiveRestClients;
import org.testcontainers.elasticsearch.ElasticsearchContainer;
import org.testcontainers.junit.jupiter.Testcontainers;

@Configuration
@Testcontainers
public class ElasticsearchTestConfig {
  
  private ElasticsearchContainer elasticsearch = new ElasticsearchContainer();
  @Bean
  ReactiveElasticsearchClient client() {
    ClientConfiguration clientConfiguration = ClientConfiguration.builder()
      .connectedTo(elasticsearch.getContainerIpAddress())
      .build();
    
    return ReactiveRestClients.create(clientConfiguration);
  }
  
}