package com.example.app.messaging;

import org.springframework.stereotype.Component;

import com.example.app.dtos.BookDTO;
import com.example.app.entities.Author;
import com.example.app.entities.Book;
import com.example.app.repositories.BookRepository;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;

@Component
public class Receiver {

  // @Autowired
  // BookRepository bookRepository;

  // @RabbitListener(queuesToDeclare = @Queue(name = "${receiver.queue.name}"))
  // public void receiveMessage(BookDTO bookDTO) {
  //   System.out.println(bookDTO);
    
  //   Author author = Author.builder()
  //     .name(bookDTO.getAuthor())
  //     .build();
    
  //     Book book = Book.builder()
  //     .author(author)
  //     .title(bookDTO.getTitle())
  //     .build();
    
  //   bookRepository.save(book);
  //   System.out.println("Books: " + bookRepository.count());
  // }
}