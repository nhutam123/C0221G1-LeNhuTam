package model.bean;

public class Service {
    private int id;
    private String name;
    private  int area;
    private double price;
    private int maxCustomer;
    private ServiceType Type;
    private RentalType rentalType;
    private String status;

    public Service() {
    }

    public Service(int id, String name, int area, double price, int maxCustomer, ServiceType type, RentalType rentalType, String status) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.price = price;
        this.maxCustomer = maxCustomer;
        this.Type = type;
        this.rentalType = rentalType;
        this.status = status;
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

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMaxCustomer() {
        return maxCustomer;
    }

    public void setMaxCustomer(int maxCustomer) {
        this.maxCustomer = maxCustomer;
    }

    public ServiceType getType() {
        return Type;
    }

    public void setType(ServiceType type) {
        Type = type;
    }

    public RentalType getRentalType() {
        return rentalType;
    }

    public void setRentalType(RentalType rentalType) {
        this.rentalType = rentalType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
