package bai_tap_lam_them_2_quan_ly_tien_dien;

import java.util.Scanner;

public class VietNamCustumer extends Custumer {
    Scanner scanner =new Scanner(System.in);
    String typeOfCustumers;
    float norm;
    Bill bill;

    public VietNamCustumer() {
    }

    public VietNamCustumer(String id, String name, String typeOfCustumers, float norm) {
        super(id, name);
        this.typeOfCustumers = typeOfCustumers;
        this.norm = norm;
    }

    public String getTypeOfCustumers() {
        return typeOfCustumers;
    }

    public void setTypeOfCustumers(String typeOfCustumers) {
        this.typeOfCustumers = typeOfCustumers;
    }

    public float getNorm() {
        return norm;
    }

    public void setNorm(float norm) {
        this.norm = norm;
    }

    @Override
    public void checkBill() {

    }

    @Override
    public void input() {
        super.input();
        typeOfCustumers=scanner.nextLine();
        norm=Float.parseFloat(scanner.nextLine());
    }
}
