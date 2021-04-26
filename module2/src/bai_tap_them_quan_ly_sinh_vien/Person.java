package bai_tap_them_quan_ly_sinh_vien;

import java.util.Scanner;

public class Person<E> {
    Scanner scanner=new Scanner(System.in);
    private String name;
    private String gender;
    private String birthday;
    private String address;

    public Person() {
    }

    public Person(String name, String gender, String birthday, String address) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (name!=null){
            this.name = name;
            return true;
        }else {
            return false;
        }

    }

    public String getGender() {
        return gender;
    }

    public boolean setGender(String gender) {
        if (gender!=null){
            this.gender = gender;
            return true;
        }else {
            return false;

        }

    }

    public String getBirthday() {
        return birthday;
    }

    public boolean  setBirthday(String birthday) {
        if (birthday!=null){
            this.birthday = birthday;
            return true;
        }else {
            return false;
        }

    }

    public String getAddress() {
        return address;
    }

    public boolean setAddress(String address) {
        if (address!=null){
            this.address = address;
            return true;
        }else {
            return false;
        }

    }
    public  void inputInfo(){

        System.out.println("nhập tên: ");
        while (true){
            String name=scanner.nextLine();
            boolean check=setName(name);
            if (check){
                break;
            }
        }
        System.out.println("nhập giới tính");
        while (true){
            String gender=scanner.nextLine();
            boolean check=setGender(gender);
            if (check){
                break;
            }
        }

        System.out.println("nhập ngày sinh: ");
        while (true){
            String birthDay=scanner.nextLine();
            boolean check=setBirthday(birthDay);
            if (check){
                break;
            }
        }

        System.out.println("nhập địa chỉ: ");
        while (true){
            String address=scanner.nextLine();
            boolean check=setAddress(address);
            if (check){
                break;
            }
        }

    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' ;
    }

    public void showInfo(){
        toString();
    }
}
