package com.example.app;

import com.example.app.entities.Author;
import com.example.app.entities.Book;
import com.example.app.repositories.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DoOnStartup {
  // @Autowired
  // BookRepository bookRepository;
  // Book book;
  
  // @EventListener(ApplicationReadyEvent.class)
  // public void createBook() {
  //   book = Book.builder()
  //     .title("Sapiens")
  //     .author(Author.builder().name("Yuval Harari").build())  
  //     .build();
  //   bookRepository.save(book);

  //   System.out.println("Books: " + bookRepository.count());    
  // }

}