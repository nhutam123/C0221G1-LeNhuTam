package bai_tap_lam_them_lai1.models;

import java.util.Scanner;

public abstract class Vehicle {
    private String licencePlate;
    private String producer;
    private String productYear;
    private String owner;

    public Vehicle() {
    }

    public Vehicle(String licencePlate, String producer, String productYear, String owner) {
        this.licencePlate = licencePlate;
        this.producer = producer;
        this.productYear = productYear;
        this.owner = owner;
    }
    abstract void add();
    public void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập biển số xê:");
        licencePlate=scanner.nextLine();
        System.out.println("nhập hãng sản xuât:");
        producer=scanner.nextLine();
        System.out.println("nhập năm sản xuât:");
        productYear=scanner.nextLine();
        System.out.println("nhập chủ sở hữu:");
        owner=scanner.nextLine();
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProductYear() {
        return productYear;
    }

    public void setProductYear(String productYear) {
        this.productYear = productYear;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return
                "licencePlate='" + licencePlate + '\'' +
                ", producer='" + producer + '\'' +
                ", productYear='" + productYear + '\'' +
                ", owner='" + owner
                ;
    }
}
