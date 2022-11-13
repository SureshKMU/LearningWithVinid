package com.example.BookApplication.repository;

import com.example.BookApplication.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
