package CaseStudy.models;

public abstract class  Services {
    String id;
    protected String serviceName;
    protected double area;
    protected int price;
    protected int maxClients;
    protected String type;
    abstract void showInfor();
    public Services(){

    }

    public Services(String id, String serviceName, double area, int price, int maxClients, String type) {
        this.id = id;
        this.serviceName = serviceName;
        this.area = area;
        this.price = price;
        this.maxClients = maxClients;
        this.type = type;
    }
}
