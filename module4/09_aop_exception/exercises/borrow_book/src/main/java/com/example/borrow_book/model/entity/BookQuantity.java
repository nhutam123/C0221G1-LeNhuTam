package com.example.borrow_book.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class BookQuantity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private Integer quantity;

    @OneToMany(mappedBy ="bookQuantity")
    private List<Book> bookList;

    public BookQuantity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
