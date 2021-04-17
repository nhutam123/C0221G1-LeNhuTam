package models;

public abstract class Services {
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


}
