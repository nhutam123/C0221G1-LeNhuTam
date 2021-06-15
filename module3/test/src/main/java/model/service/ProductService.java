package model.service;

import model.bean.Product;
import model.repository.ProductRepo;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements iProductService {
    ProductRepo productRepo=new ProductRepo();
    @Override
    public List<Product> selectAll() {
        return productRepo.selectAll();
    }

    @Override
    public Map<String, String> insertProduct(Product product) throws SQLException {
        Map<String, String> mapMsg = new HashMap<>();
        boolean flag = true;

        if ("".equals(product.getName())) {
            mapMsg.put("name", "Please input name");
            flag = false;
        } else if (!product.getName().matches("^[0-9a-zA-Z]{1,}$")) {
            mapMsg.put("name","Invalid format name : no symboy");
            flag=false;
        }
        if (flag) {
            productRepo.insert(product);
        }
        return mapMsg;
    }

    @Override
    public Product selectProduct(int id) {
        return productRepo.select(id);
    }

    @Override
    public void update(Product product) {
        productRepo.update(product);
    }

    @Override
    public void delete(int id) {
        productRepo.delete(id);
    }

    @Override
    public List<Product> search(String name) {
        return productRepo.search(name);
    }
}
