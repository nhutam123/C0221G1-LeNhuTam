package com.example.borrow_book.model.repository;

import com.example.borrow_book.model.entity.BookQuantity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookQuantityRepository extends JpaRepository<BookQuantity,Integer> {
}
