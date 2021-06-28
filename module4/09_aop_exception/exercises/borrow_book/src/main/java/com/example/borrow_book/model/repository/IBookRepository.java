package com.example.borrow_book.model.repository;

import com.example.borrow_book.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book,Integer> {
}
