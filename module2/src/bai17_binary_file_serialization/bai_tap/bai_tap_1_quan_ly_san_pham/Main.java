package bai17_binary_file_serialization.bai_tap.bai_tap_1_quan_ly_san_pham;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String PRODUCT = "src/bai17_binary_file_serialization/bai_tap/bai_tap_1_quan_ly_san_pham/product";
    public static void main(String[] args) {

        List<Product> productList=new ArrayList<>();
        int count=0;
        do {
            Product product=new Product();
            product.input();
            productList.add(product);
            count++;
        }while (count !=1);
        Product.writeFile(PRODUCT,productList);
        List<Product> productList1 = Product.readFile(PRODUCT);
        for (Product product : productList1){
            System.out.println(product);
        }
    }
}
