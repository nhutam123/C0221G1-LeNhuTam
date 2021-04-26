package bai_tap_lam_lem_1_quan_ly_phuong_tien;

import java.util.Scanner;

public class BikeCircle extends Vehicle {
    Scanner scanner=new Scanner(System.in);
    // wattage :công suất
    private String wattage;

    public BikeCircle() {
    }

    public BikeCircle(String licensePlate, String producer, int yearProduct, String ownerName, String wattage) {
        super(licensePlate, producer, yearProduct, ownerName);
        this.wattage = wattage;
    }

    public String getWattage() {
        return wattage;
    }

    public void setWattage(String wattage) {
        this.wattage = wattage;
    }

    @Override
    public void inputVehicle() {
        super.inputVehicle();
        System.out.println("nhập vào công suât: ");
        wattage=scanner.nextLine();
    }

    @Override
    public String toString() {
        return
                wattage +"," +super.toString()
               ;
    }
}
