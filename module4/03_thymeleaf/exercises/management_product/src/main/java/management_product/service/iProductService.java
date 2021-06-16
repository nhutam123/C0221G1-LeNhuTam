package management_product.service;

import management_product.model.bean.Product;

import java.util.List;

public interface iProductService {
 List<Product> findAll();
 void save(Product product);
}
