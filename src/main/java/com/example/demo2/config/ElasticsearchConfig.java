package com.example.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.reactive.ReactiveElasticsearchClient;
import org.springframework.data.elasticsearch.client.reactive.ReactiveRestClients;

@Configuration
public class ElasticsearchConfig {

  @Bean
  ReactiveElasticsearchClient client() {
    ClientConfiguration clientConfiguration = ClientConfiguration.builder()
      .connectedTo("localhost:9200")
      .build();
    
    return ReactiveRestClients.create(clientConfiguration);
  }

  // @Bean
  // RestHighLevelClient client() {
  //   ClientConfiguration clientConfiguration = ClientConfiguration.builder()
  //     .connectedTo("localhost:9200")
  //     .build();
    
  //   return RestClients.create(clientConfiguration).rest();
  // }

}