package bai_tap_lam_them_2_quan_ly_tien_dien;

import java.util.Scanner;

public class VietNamCustumer extends Custumer {
    Scanner scanner = new Scanner(System.in);
    String typeOfCustumers;
    static int norm;
    Bill bill;

    public VietNamCustumer() {
    }

    public VietNamCustumer(String id, String name, String typeOfCustumers, int norm) {
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

    public void setNorm(int norm) {
        this.norm = norm;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("nhập loại khách hàng: ");
        typeOfCustumers = scanner.nextLine();
        System.out.println("nhập ");
        norm = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public String showInfo() {
        return
                "VietNamCustumer{" +super.showInfo()+
                "typeOfCustumers='" + typeOfCustumers + '\'' +
                ", bill=" + bill +
                '}';

    }

        @Override
    public String toString() {
        return
                typeOfCustumers +
                        "," + norm + super.toString()
                ;
    }

    static class BillVietNam extends Bill {
        float money;

        public BillVietNam() {
        }

        public BillVietNam(String billId, String custumerId, String date, int numbersOfNorm, int price, int money) {
            super(billId, custumerId, date, numbersOfNorm, price);
            this.money = money;
        }



        @Override
        public  void inputBill(Custumer custumer) {
            super.inputBill(custumer);
            money = numbersOfNorm * price *norm ;
        }

        @Override
        public String toString() {
            return
                    money +
                    "," + billId  +
                    "," + custumerId +
                    "," + date  +
                    "," + numbersOfNorm +
                    "," + price
                   ;
        }
    }
}
