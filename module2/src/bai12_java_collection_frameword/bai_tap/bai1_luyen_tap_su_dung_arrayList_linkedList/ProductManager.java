package bai12_java_collection_frameword.bai_tap.bai1_luyen_tap_su_dung_arrayList_linkedList;

import java.util.*;

public class ProductManager  {

    List<Product> list;
    ProductManager(){
        this.list=new ArrayList<>();
    }

    Scanner scanner=new Scanner(System.in);

    public  void addProduct(){
        System.out.println("nhập id sản phẩm mơi");
        int id= Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên sản phẩm mới");
        String name=scanner.nextLine();
        System.out.println("nhập giá sản phẩm");
        int price= Integer.parseInt(scanner.nextLine());
        Product product=new Product(id,name,price);
        list.add(product);
    }
    public void  setProduct(Product product){
        System.out.println("sửa id sản phẩm");

        int id= Integer.parseInt(scanner.nextLine());
        product.setId(id);
        System.out.println("sửa tên sản phẩm");
        String name=scanner.nextLine();
        product.setName(name);
        System.out.println("sửa giá sản phẩm");
        int price= Integer.parseInt(scanner.nextLine());
        product.setPrice(price);
    }
    public void deleteProduct(Product product){
        list.remove(product);
    }
    public void showList(){
        System.out.println(list);
    }
    public Product searchProduct(int id){
        Product product=list.get(id);
        return product;
    }
    public void sortList(){
       list.sort(Comparator.comparing(Product::getId));

    }


   }
