package com.example.blog.model.repository;

import com.example.blog.model.entity.Blog;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository implements IRepository{
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<Blog> findAll() {
        TypedQuery<Blog> query = entityManager.createQuery("select c from Blog c", Blog.class);
        return query.getResultList();
    }

    @Override
    public void save(Blog blog) {
        if (blog.getId() != null) {
            entityManager.merge(blog);
        } else {
            entityManager.persist(blog);
        }
    }

    @Override
    public Blog findById(int id) {
        return null;
    }
}
