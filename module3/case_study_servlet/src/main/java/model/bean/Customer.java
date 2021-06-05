package model.bean;

public class Customer {
    private int id;
    private String name;
    private String birthday;
    private String card;
    private String phoneNumber;
    private String email;
    private String address;
    private  CustomerType type;

    public Customer() {
    }


    public Customer(int id, String name, String birthday, String card, String phoneNumber, String email, String address, CustomerType type) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.card = card;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.type = type;
    }

    public Customer(String name, String birthday, String card, String phoneNumber, String email, String address, CustomerType type) {
        this.name = name;
        this.birthday = birthday;
        this.card = card;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerType getType() {
        return type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }
}
