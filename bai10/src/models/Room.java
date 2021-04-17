package models;

public class Room extends Services {
    private String freeServices;

    public Room() {

    }

    public Room(String id, String standardName, float areaUsing, int price, int maxCustomer, String type, String freeServices) {
        super(id, standardName, areaUsing, price, maxCustomer, type);
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    void showInfor() {
        System.out.println(toString());

    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServices='" + freeServices + '\'' +
                ", id='" + id + '\'' +
                ", standardName='" + standardName + '\'' +
                ", areaUsing=" + areaUsing +
                ", price=" + price +
                ", maxCustomer=" + maxCustomer +
                ", type='" + type + '\'' +
                '}';
    }
}
