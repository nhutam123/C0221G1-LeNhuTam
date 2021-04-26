package bai_tap_lam_lem_1_quan_ly_phuong_tien;


import java.util.Scanner;

public abstract class Vehicle {

    // license plate : biển số xe;
    private String licensePlate;
    private String producer;
    private int productYear;
    private String ownerName;
    public  Vehicle(){}


    public Vehicle(String licensePlate, String producer, int yearProduct, String ownerName) {
        this.licensePlate = licensePlate;
        this.producer = producer;
        this.productYear = yearProduct;
        this.ownerName = ownerName;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getProductYear() {
        return productYear;
    }

    public void setProductYear(int productYear) {
        this.productYear = productYear;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return
                 licensePlate +
                        "," + producer +
                        "," + productYear +
                        "," + ownerName
                ;
    }

    public void showInfo() {
        toString();

    }

    public  void inputVehicle() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập biển số xe: ");
         licensePlate=scanner.nextLine();
        System.out.println("nhập tên nhà sản xuât: ");
         producer=scanner.nextLine();
        System.out.println("nhập năm sản xuât: ");
         productYear=Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên chủ sở hữu: ");
         ownerName=scanner.nextLine();
    }


}
