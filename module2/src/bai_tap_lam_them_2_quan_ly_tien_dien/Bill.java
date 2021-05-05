package bai_tap_lam_them_2_quan_ly_tien_dien;

import java.util.Scanner;

public class Bill {
    Scanner scanner=new Scanner(System.in);
    //numbersOfNorm: số lượng tiêu thụ
    String billId;
    String custumerId;
    String date;
    float numbersOfNorm;
    int price;



    public Bill() {
    }

    public Bill(String billId, String custumerId, String date, int numbersOfNorm, int price) {
        this.billId = billId;
        this.custumerId = custumerId;
        this.date = date;
        this.numbersOfNorm = numbersOfNorm;
        this.price = price;


    }
    public void inputBill(Custumer custumer){
        System.out.println("nhập ngày ra hóa đon");
        date=scanner.nextLine();
        System.out.println("nhập số lượng tiêu thụ: ");
        numbersOfNorm=Integer.parseInt(scanner.nextLine());
        System.out.println("nhập đơn giá: ");
        price=Integer.parseInt(scanner.nextLine());
        billId=custumer.id;
        custumerId=custumer.id;




    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getCustumerId() {
        return custumerId;
    }

    public void setCustumerId(String custumerId) {
        this.custumerId = custumerId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getNumbersOfNorm() {
        return numbersOfNorm;
    }

    public void setNumbersOfNorm(float numbersOfNorm) {
        this.numbersOfNorm = numbersOfNorm;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billId='" + billId + '\'' +
                ", custumerId='" + custumerId + '\'' +
                ", date='" + date + '\'' +
                ", numbersOfNorm=" + numbersOfNorm +
                ", price=" + price +
                '}';
    }
}
