package com.example.borrow_book.model.entity;


import javax.persistence.*;

@Entity
public class Book {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer Id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "quantity",referencedColumnName = "id")
    private BookQuantity bookQuantity;

    public Book() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BookQuantity getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(BookQuantity bookQuantity) {
        this.bookQuantity = bookQuantity;
    }
}
