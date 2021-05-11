package CaseStudy.models;

import java.util.Scanner;

public abstract class  Services {
    Scanner scanner=new Scanner(System.in);
   private String name;
   private float usingArea;
   private int price;
   private int maxCustomer;
   private String type;

    public Services() {
    }

    public Services(String name, float usingArea, int price, int maxCustomer, String type) {
        this.name = name;
        this.usingArea = usingArea;
        this.price = price;
        this.maxCustomer = maxCustomer;
        this.type = type;
    }
    public void inPut(){
        try{
            System.out.println("nhập tên dịch vụ: ");
            name=scanner.nextLine();
            System.out.println("nhập diện tích sử dụng: ");
            usingArea=Float.parseFloat(scanner.nextLine());
            System.out.println("nhập giá dịch vụ: ");
            price=Integer.parseInt(scanner.nextLine());
            System.out.println("nhập số lượng khách tối đa: ");
            maxCustomer=Integer.parseInt(scanner.nextLine());
            System.out.println("nhập loại dịch vụ: ");
            type=scanner.nextLine();

        }catch (Exception e){
            e.getMessage();
        }

    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", usingArea=" + usingArea +
                ", price=" + price +
                ", maxCustomer=" + maxCustomer +
                ", type='" + type
                ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getUsingArea() {
        return usingArea;
    }

    public void setUsingArea(float usingArea) {
        this.usingArea = usingArea;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxCustomer() {
        return maxCustomer;
    }

    public void setMaxCustomer(int maxCustomer) {
        this.maxCustomer = maxCustomer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
