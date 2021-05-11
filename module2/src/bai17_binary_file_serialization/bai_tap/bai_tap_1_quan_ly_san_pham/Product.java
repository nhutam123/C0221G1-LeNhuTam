package bai17_binary_file_serialization.bai_tap.bai_tap_1_quan_ly_san_pham;



import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product implements Serializable {

//    public static Scanner inx(){
//        Scanner scanner=new Scanner(System.in);
//        return scanner;
//    }

//    public static void main(String[] args) {
//        List<Product> productList=new ArrayList<>();

//        int count=0;
//        do {
//            Product product=new Product();
//            product.input();
//            productList.add(product);
//            count++;
//        }while (count !=1);
//        writeFile(PRODUCT,productList);
//        List<Product> productList1 = readFile(PRODUCT);
//        for (Product product : productList1){
//            System.out.println(product);
//        }
//    }
    private int id;
    private  String productName;
    private String producer;
    private int price;
//    private String other;

    public Product() {
    }

    public  Product(String id, String productName, String producer) {

        this.productName = productName;
        this.producer = producer;
//        this.price = price;
//        this.other = other;
    }
    public static void writeFile(String pathFile, List<Product> list){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(pathFile);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(list);
            outputStream.close();
            fileOutputStream.close();
        }catch (Exception e){
            e.getMessage();
        }

    }
    public static List<Product> readFile(String pathFile){
        List<Product> studentList=new ArrayList<>();
        try{
            FileInputStream fileInputStream=new FileInputStream(pathFile);
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            studentList=(List<Product>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        }catch (Exception e){
            e.getMessage();
        }
        return studentList;
    }

    public  void input(){
        Scanner scanner=new Scanner(System.in);
        List<Product> list=readFile("src/bai17_binary_file_serialization/bai_tap/bai_tap_1_quan_ly_san_pham/product");
        if (list.size()==0){
            id = 1;
        }else {

        }

        try {
            System.out.println("nhập tên sản phẩm");
            productName=scanner.nextLine();
            System.out.println("nhập hãng sản xuât:");
            producer=scanner.nextLine();
//            System.out.println("nhập giá: ");
//            price=Integer.parseInt(scanner.nextLine());
            System.out.println("nhập vào mô tả khác cho sản phẩm : ");
//            other=scanner.nextLine();

        }catch (NumberFormatException e){
            System.out.println("nhập sai giá ");
        }

    }


    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", productName='" + productName + '\'' +
                ", producer='" + producer + '\'' +

                '}';
    }
}
