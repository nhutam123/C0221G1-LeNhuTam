package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements iProductService {
    private static Map<Integer, Product> list=new HashMap<>();
    static {
       list.put(1,new Product(1,"iphone5", 12.5));
       list.put(2,new Product(2,"iphone6", 15));
       list.put(3,new Product(3,"iphone7", 17));
       list.put(4,new Product(4,"iphone8", 18));
       list.put(5,new Product(5,"iphone9", 20));
       list.put(6,new Product(6,"iphone10", 30));
    }


    @Override
    public List<Product> findAll() {
        return new ArrayList<Product>(list.values());
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
        list.put(product.getId(),product);

    }

    @Override
    public Product findById(int id) {
        return list.get(id);
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {
        list.remove(id);

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
