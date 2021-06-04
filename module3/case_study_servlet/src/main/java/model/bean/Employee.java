package model.bean;

public class Employee {
    private int id;
    private String name;
    private Degree degree;
    private Department department;
    private Position position;
    private String birthday;
    private String card;
    private String phoneNumber;
    private String email;
    private String address;

    public Employee() {
    }

    public Employee(int id, String name, Degree degree, Department department, Position position, String birthday, String card, String phoneNumber, String email, String address) {
        this.id = id;
        this.name = name;
        this.degree = degree;
        this.department = department;
        this.position = position;
        this.birthday = birthday;
        this.card = card;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public Employee(String name, Degree degree, Department department, Position position, String birthday, String card, String phoneNumber, String email, String address) {
        this.name=name;
        this.degree=degree;
        this.department=department;
        this.position=position;
        this.birthday=birthday;
        this.card=card;
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.address=address;
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

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
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
}