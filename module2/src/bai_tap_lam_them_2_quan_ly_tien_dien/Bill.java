package bai_tap_lam_them_2_quan_ly_tien_dien;

public class Bill {
    //numbersOfNorm: số lượng tiêu thụ
    String billId;
    String custumerId;
    String date;
    int numbersOfNorm;
    int price;
    int money;

    public Bill() {
    }

    public Bill(String billId, String custumerId, String date, int numbersOfNorm, int price, int money) {
        this.billId = billId;
        this.custumerId = custumerId;
        this.date = date;
        this.numbersOfNorm = numbersOfNorm;
        this.price = price;
        this.money = money;
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

    public int getNumbersOfNorm() {
        return numbersOfNorm;
    }

    public void setNumbersOfNorm(int numbersOfNorm) {
        this.numbersOfNorm = numbersOfNorm;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
