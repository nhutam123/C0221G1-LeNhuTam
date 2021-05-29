package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public interface iProductService {
    List<Product> findAll();
    void save(Product product);
    Product findById(int id);
    void update(int id, Product product);
    void  remove(int id);
    Product search(String name,ArrayList<Product> list);
    int maxId(ArrayList<Product> list);


}
