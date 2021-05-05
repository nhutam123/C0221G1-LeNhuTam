package models;

import java.util.Scanner;

public class House extends Services {
    Scanner scanner=new Scanner(System.in);
    private String roomStandard;
    private String other;
    private int floor;

    public House() {
    }

    public House(String id, String standardName, float areaUsing, int price, int maxCustomer, String type, String roomStandard, String other, int floor) {
        super(id, standardName, areaUsing, price, maxCustomer, type);
        this.roomStandard = roomStandard;
        this.other = other;
        this.floor = floor;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("nhập tiêu chuẩn phòng: ");
        roomStandard=scanner.nextLine();
        System.out.println("nhập dịch vụ khác: ");
        other=scanner.nextLine();
        System.out.println("nhập số tầng: ");
        floor=Integer.parseInt(scanner.nextLine());

    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
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
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", other='" + other + '\'' +
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
