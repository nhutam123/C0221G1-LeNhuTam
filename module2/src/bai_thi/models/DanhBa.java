package bai_thi.models;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DanhBa {
    private String name;
    private String phoneNumber;
    private String address;
    private String email;
    private String facebook;

    public DanhBa() {
    }

    public DanhBa(String name, String phoneNumber, String address, String email, String facebook) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.facebook = facebook;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên: ");
        name = scanner.nextLine();
        System.out.println("nhập số điện thoại");
        phoneNumber = scanner.nextLine();
        System.out.println("địa chỉ : ");
        address = scanner.nextLine();
        System.out.println("nhập vào email: ");
        email = scanner.nextLine();
        System.out.println("nhập vào facebook: ");
        facebook = scanner.nextLine();
    }

    public boolean regexInput(String string, String regex) {
        Pattern pattern = Pattern.compile(string);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String showInfo() {
        return "DanhBa{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", facebook='" + facebook + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return
                name +
                        "," + phoneNumber +
                        "," + address +
                        "," + email +
                        "," + facebook
                ;
    }
}
