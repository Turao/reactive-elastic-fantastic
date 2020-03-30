package com.example.app.repositories;

import org.springframework.stereotype.Repository;

import java.util.UUID;

import com.example.app.entities.Book;

import org.springframework.data.repository.PagingAndSortingRepository;

@Repository
public interface BookRepository extends PagingAndSortingRepository<Book, UUID> {};