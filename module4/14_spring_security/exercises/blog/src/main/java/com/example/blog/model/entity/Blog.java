package com.example.blog.model.entity;


import javax.persistence.*;
import java.util.Date;


@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String author;
    private String content;
    @Column(columnDefinition = "DATETIME")
    private Date date;

    @ManyToOne
    @JoinColumn(name="category_id",referencedColumnName = "id")
    private Category category;

    public Blog() {
    }

    public Blog(Integer id, String author, String content, Date date, Category category) {
        this.id = id;
        this.author = author;
        this.content = content;
        this.date = date;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
