package models;

import controllers.MainController;

import java.util.Scanner;

public abstract class Services {
    Scanner scanner =new Scanner(System.in);
    String id;
    String standardName;
    float areaUsing;
    int price;
    int maxCustomer;
    String type;
    public Services(){

    }

    public Services(String id, String standardName, float areaUsing, int price, int maxCustomer, String type) {
        this.id = id;
        this.standardName = standardName;
        this.areaUsing = areaUsing;
        this.price = price;
        this.maxCustomer = maxCustomer;
        this.type = type;
    }

    abstract void  showInfor();
    public void input(){
        try{

        boolean check=false;
        do {
            System.out.println("nhập id của dịch vụ: ");
            String idInput=scanner.nextLine();
            String regex="(SVVL)\\-[0-9]{4}";
            if (check=MainController.regexInput(regex,idInput)){
                id=idInput;
                check=true;
            };
        }while (check==false);
        check=false;

        System.out.println("nhập tên dịch vụ: ");
        do {
            String standardInput=scanner.nextLine();
            String regex="^([A-Z]{1}[a-z]{1,}[ ]{0,})+$";
            if (check=MainController.regexInput(regex,standardInput)){
                standardName=standardInput;
            }
        }while (check==false);
        check=false;
        System.out.println("nhập diện tích sử dụng : ");
        do {

            Float areaInput=Float.parseFloat(scanner.nextLine());

            if (areaInput>30){
                areaUsing=areaInput;
                check=true;
            }
        }while (!check);
        check=false;
        System.out.println("nhập giá dịch vụ: ");
        do {
            int priceInput=Integer.parseInt(scanner.nextLine());
            if (priceInput>0){
                price=priceInput;
                check=true;
            }
        }while (!check);
        check=false;

        System.out.println("nhập số lượng khách tối đa : ");
        do {
            int maxCustomerInput=Integer.parseInt(scanner.nextLine());
            if (0<maxCustomerInput&&maxCustomerInput<20){
                maxCustomer=maxCustomerInput;
                check=true;
            }
        }while (!check);
        check=false;
        System.out.println("nhập kiểu thuê:  ");
        String[] array=new String[]{"year","month","day","hour"};
        do {
            String typeInput=scanner.nextLine();
            for (int i=0;i<array.length;i++){
                if (array[i].equals(typeInput)){
                    type=typeInput;
                    check=true;
                }
            }
        }while (!check);
        }catch (Exception e){
            System.out.println("nhập lỗi: ");
        }


    }
    public static void showServices(){

    }

    @Override
    public String toString() {
        return "Services{" +
                ", id='" + id + '\'' +
                ", standardName='" + standardName + '\'' +
                ", areaUsing=" + areaUsing +
                ", price=" + price +
                ", maxCustomer=" + maxCustomer +
                ", type='" + type + '\'' +
                '}';
    }

    public static void main(String[] args) {

    }
}
