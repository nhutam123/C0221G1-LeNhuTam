package com.example.product.model.repository;

import com.example.product.model.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface IProductRepository extends PagingAndSortingRepository<Product,Integer> {
    @Query(value = "select * from product where name like:keyword",nativeQuery = true)
    Page<Product> findAllByNameContaining(Pageable pageable,@Param("keyword") String name);
}
