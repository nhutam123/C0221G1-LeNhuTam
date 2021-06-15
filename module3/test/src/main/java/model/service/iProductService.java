package model.service;

import model.bean.Product;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface iProductService<E> {
    public List<E> selectAll();
    public Map<String,String> insertProduct(Product product) throws SQLException;
    public Product selectProduct(int id);
    public void update(Product product);
    public void delete(int id);
    public List<Product> search(String name);
}

