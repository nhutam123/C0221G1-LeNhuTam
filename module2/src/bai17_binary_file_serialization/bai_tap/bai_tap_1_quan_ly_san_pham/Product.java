package bai17_binary_file_serialization.bai_tap.bai_tap_1_quan_ly_san_pham;

import java.util.Scanner;

public class Product {
    Scanner scanner=new Scanner(System.in);
    private String id;
    private  String productName;
    private String producer;
    private int price;
    private String other;

    public Product() {
    }

    public Product(String id, String productName, String producer, int price, String other) {
        this.id = id;
        this.productName = productName;
        this.producer = producer;
        this.price = price;
        this.other = other;
    }

    public  void input(){
        try {
            System.out.println("nhập mã sản phẩm ");
            id=scanner.nextLine();
            System.out.println("nhập tên sản phẩm");
            productName=scanner.nextLine();
            System.out.println("nhập hãng sản xuât:");
            producer=scanner.nextLine();
            System.out.println("nhập giá: ");
            price=Integer.parseInt(scanner.nextLine());
            System.out.println("nhập vào mô tả khác cho sản phẩm : ");
            other=scanner.nextLine();

        }catch (NumberFormatException e){
            System.out.println("nhập sai giá ");
        }

    }
}
