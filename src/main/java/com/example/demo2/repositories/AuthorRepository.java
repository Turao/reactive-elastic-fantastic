package com.example.app.repositories;

import org.springframework.stereotype.Repository;

import java.util.UUID;

import com.example.app.entities.Author;

import org.springframework.data.repository.PagingAndSortingRepository;

@Repository
public interface AuthorRepository extends PagingAndSortingRepository<Author, UUID> {};