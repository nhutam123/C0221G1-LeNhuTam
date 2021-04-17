package models;

public class Villa extends Services {
    private String roomStandard;
    private int floor;
    Villa(String id, String standardName, float areaUsing, int price, int maxCustomer, String type,String roomStandard,int floor){
        super(id, standardName, areaUsing, price, maxCustomer, type);
        this.roomStandard=roomStandard;
        this.floor=floor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    void showInfor() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", floor=" + floor +
                ", id='" + id + '\'' +
                ", standardName='" + standardName + '\'' +
                ", areaUsing=" + areaUsing +
                ", price=" + price +
                ", maxCustomer=" + maxCustomer +
                ", type='" + type + '\'' +
                '}';
    }
}
