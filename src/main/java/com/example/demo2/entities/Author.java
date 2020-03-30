package com.example.app.entities;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Builder;

@Builder
@Document(indexName = "author")
public class Author {
  @Id
  private UUID id;

  private String name;
}