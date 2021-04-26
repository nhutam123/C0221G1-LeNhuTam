package bai_tap_lam_lem_1_quan_ly_phuong_tien;

import java.util.Scanner;

public class Truck extends Vehicle {
    Scanner scanner=new Scanner(System.in);
    private float weight;

    public Truck(String licensePlate, String producer, int yearProduct, String ownerName) {
        super(licensePlate, producer, yearProduct, ownerName);
    }

    public Truck(String licensePlate, String producer, int yearProduct, String ownerName, float weight) {
        super(licensePlate, producer, yearProduct, ownerName);
        this.weight = weight;
    }

    public Truck() {
    }

    @Override
    public void inputVehicle() {
        super.inputVehicle();
        weight=Float.parseFloat(scanner.nextLine());
    }
}
