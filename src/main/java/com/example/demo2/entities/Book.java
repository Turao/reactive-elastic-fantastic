package com.example.app.entities;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Builder;

@Builder
@Document(indexName = "book")
public class Book {
  @Id
  private UUID id;

  private String title;

  private Author author;
}