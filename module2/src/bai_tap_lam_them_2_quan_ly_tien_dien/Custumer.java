package bai_tap_lam_them_2_quan_ly_tien_dien;

import java.util.Scanner;

public abstract class Custumer {
    Scanner scanner =new Scanner(System.in);
    String id;
    String name;

    public Custumer() {
    }

    public Custumer(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public void checkBill(){

    }
    public void input(){
        System.out.println("nhập mã khách hàng: ");
        id=scanner.nextLine();
        System.out.println("nhập tên khách hang: ");
        name=scanner.nextLine();

    }

    @Override
    public String toString() {
        return
               scanner +
                "," + id +
                "," + name
                ;
    }
}
