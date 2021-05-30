package model.service;

import model.bean.Product;
import model.repository.ProductRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements iProductService {
    ProductRepository productRepository=new ProductRepository();
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }


    public  int maxId(ArrayList<Product> list){
        int maxid=0;
        for (int i=0;i<list.size();i++){
            if(list.get(i).getId()>maxid){
                maxid=list.get(i).getId();
            }
        }
        return maxid;
    }

    @Override
    public void save(Product product) {
        productRepository.update(product.getId(),product);

    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {
        productRepository.remove(id);

    }

    @Override
    public Product search(String name,ArrayList<Product> list) {
        Product product=null;
        boolean check=false;
        for (int i=0;i<list.size();i++){
            if (list.get(i).getName().equals(name)){
                product= list.get(i);
                check=true;
                break;
            }
        }
        if (check){
            return product;
        }else {
            return null;
        }

    }
}
