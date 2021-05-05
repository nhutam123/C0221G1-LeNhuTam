package models;

import controllers.MainController;

import java.util.*;
import java.util.regex.Pattern;

public class Customer<E> {
    Scanner scanner=new Scanner(System.in);
    String name;
    String birthDay;
    String gender;
    String idCard;
    String phoneNumber;
    String email;
    String customerType;
    String address;

    public Customer() {
    }

    public Customer(String name, String birthDay, String gender, String idCard, String phoneNumber, String email, String customerType, String address) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
    }
    public Queue<Customer>  buyTicket(Customer customer){
        Queue queue=new ArrayDeque(5);
        if (queue.size()<=5){
            queue.add(customer);
        }else {
            System.out.println("đã hết vé");
        }
        return queue;

    }
    public void showTicketList(Queue<Customer> queue){
        System.out.println(queue.element().toString());

    }
    public  void inputCustomer(){
        boolean check=true;
        String regex;
        System.out.println("nhập tên khách hàng: ");
        do {
            String nameInput=scanner.nextLine();
            regex="^([A-Z][a-z]{1,}[ ]{0,1})+";
            if (MainController.regexInput(regex,nameInput)) {
                name = nameInput;
                check = false;
            }
            else {
                System.out.println("tên khách hàng phải bắt đầu bằng chữ hoa : ");
            }
        }while (check);
        check=false;
        System.out.println("nhập ngày sinh khách hàng: ");
        do {

            regex="^[0-9]{1,2}\\/[0-9]{1,2}\\/[0-9]{4}$";
            String birthDayInput=scanner.nextLine();
            if (MainController.regexInput(regex,birthDayInput)){
                birthDay=birthDayInput;
                check=true;
            }else {System.out.println("bạn nhập sai, hãy nhập lại: ");}
        }while (!check);
        check=false;
        System.out.println("nhập giới tính");
        gender=scanner.nextLine();
        System.out.println("nhập số cmnd: ");
        idCard=scanner.nextLine();
        System.out.println("nhập số điện thoại: ");
        phoneNumber=scanner.nextLine();
        System.out.println("nhập email: ");
        email=scanner.nextLine();
        System.out.println("nhập loại khách hang: ");
        customerType=scanner.nextLine();
        System.out.println("nhập địa chỉ: ");
        address=scanner.nextLine();

    }
    public TreeSet<String> showServicesTreeSet(ArrayList<String> list){
        TreeSet<String> treeSet=new TreeSet<>();
        for (int i=0;i<list.size();i++){
            treeSet.add(list.get(i).split(",")[1]);
        }
        return treeSet;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", gender='" + gender + '\'' +
                ", cmnd='" + idCard + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void showInfo(){
        System.out.println(toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCmnd() {
        return idCard;
    }

    public void setCmnd(String cmnd) {
        this.idCard = cmnd;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
