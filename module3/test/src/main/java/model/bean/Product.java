package model.bean;

public class Product {
    private int id;
    private String name;
    private int price;
    private String color;
    private String describe;

    public Product() {
    }

    public Product(int id, String name, int price, String color, String describe) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
        this.describe = describe;
    }

    public Product(String name, int price, String color, String describe) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.describe = describe;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
