package bai_tap_lam_them_2_quan_ly_tien_dien;

public class NNCustomer extends Custumer {
    String nationality;

    public NNCustomer() {
    }

    public NNCustomer(String id, String name, String mationality) {
        super(id, name);
        this.nationality = mationality;

    }

    public String getMationality() {
        return nationality;
    }

    public void setMationality(String mationality) {
        this.nationality = mationality;
    }

    @Override
    public String toString() {
        return
                nationality + super.toString()
                ;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("nhập vào quốc tich: ");
        nationality = scanner.nextLine();
    }

    static class NNBill extends Bill {
        float money;

        public NNBill() {
        }

        public NNBill(String billId, String custumerId, String date, int numbersOfNorm, int price, float money) {
            super(billId, custumerId, date, numbersOfNorm, price);
            this.money = money;
        }

        @Override
        public void inputBill(Custumer custumer) {
            super.inputBill(custumer);
            money = numbersOfNorm * price;
        }

        public String showInfo() {
            return "NNBill{" +
                    "money=" + money +
                    ", scanner=" + scanner +
                    ", billId='" + billId + '\'' +
                    ", custumerId='" + custumerId + '\'' +
                    ", date='" + date + '\'' +
                    ", numbersOfNorm=" + numbersOfNorm +
                    ", price=" + price +
                    '}';
        }

        @Override
        public String toString() {
            return
                    money +
                            "," + billId +
                            "," + custumerId +
                            "," + date +
                            "," + numbersOfNorm +
                            "," + price
                    ;
        }

    }
}
