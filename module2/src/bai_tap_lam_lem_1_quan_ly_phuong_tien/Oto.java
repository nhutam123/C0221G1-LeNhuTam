package bai_tap_lam_lem_1_quan_ly_phuong_tien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Oto extends Vehicle {
    Scanner scanner=new Scanner(System.in);
    private int numbersOFSeat;
    private String modle;
    public Oto(){}

    public Oto(String licensePlate, String producer, int yearProduct, String ownerName, int numberOFSeat, String modle) {
        super(licensePlate, producer, yearProduct, ownerName);
        this.numbersOFSeat = numberOFSeat;
        this.modle = modle;
    }

    @Override
    public String toString() {
        return
                 numbersOFSeat +
                "," + modle + ","  +super.toString()
                ;
    }

    @Override
    public void inputVehicle() {
        super.inputVehicle();
        System.out.println("nhập vào số ghế");
        numbersOFSeat=Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào modle:");
        modle=scanner.nextLine();
    }



    public int getNumbersOFSeat() {
        return numbersOFSeat;
    }

    public void setNumbersOFSeat(int numbersOFSeat) {
        this.numbersOFSeat = numbersOFSeat;
    }

    public String getModle() {
        return modle;
    }

    public void setModle(String modle) {
        this.modle = modle;
    }
}



