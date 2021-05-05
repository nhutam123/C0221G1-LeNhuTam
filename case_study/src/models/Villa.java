package models;

import java.util.Scanner;

public class Villa extends Services {
    Scanner scanner=new Scanner(System.in);
    private String roomStandard;
    private String other;
    private float poolArea;
    private int floor;

    public Villa() {
    }

    public Villa(String id, String standardName, float areaUsing, int price, int maxCustomer, String type, String roomStandard, String other, float poolArea, int floor) {
        super(id, standardName, areaUsing, price, maxCustomer, type);
        this.roomStandard = roomStandard;
        this.other = other;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    @Override
    public void input() {
        boolean check=false;
        super.input();
        System.out.println("nhập tiêu chuẩn phong: ");
        String[] array=new String[]{"massage","karaoke","food","drink","car"};
        do {
            String roomStandardInput=scanner.nextLine();
            for (int i=0;i<array.length;i++){
                if (array[i].equals(roomStandardInput)){
                    roomStandard=roomStandardInput;
                    check=true;
                }
            }

        }while (!check);
        System.out.println("nhập dịch vụ khác: ");
        other=scanner.nextLine();
        System.out.println("nhập diện tích bể bơi: ");
        poolArea=Float.parseFloat(scanner.nextLine());
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

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
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
                ", other='" + other + '\'' +
                ", poolArea=" + poolArea +
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
