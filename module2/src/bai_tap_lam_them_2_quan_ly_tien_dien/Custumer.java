package bai_tap_lam_them_2_quan_ly_tien_dien;

import java.util.List;
import java.util.Scanner;

public abstract class Custumer {
    Scanner scanner =new Scanner(System.in);
    String id;
    String name;
    Bill bill=new VietNamCustumer.BillVietNam();

    public Custumer() {
    }

    public Custumer(String id, String name) {
        this.id = id;
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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
                ","+id +
                "," + name
               ;
    }


    public String showInfo(){
        return
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", bill=" + bill
                ;
    }
}
