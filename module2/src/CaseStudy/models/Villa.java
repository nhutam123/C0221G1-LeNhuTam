package CaseStudy.models;

public class Villa extends Services {
    private String roomStandard;
    private String other;
    private Float poolArea;
    private int floor;

    public Villa() {
    }

    public Villa(String name, float usingArea, int price, int maxCustomer, String type, String roomStandard, String other, Float poolArea, int floor) {
        super(name, usingArea, price, maxCustomer, type);
        this.roomStandard = roomStandard;
        this.other = other;
        this.poolArea = poolArea;
        this.floor = floor;
    }

    @Override
    public void inPut() {
        try{
            super.inPut();
            System.out.println("nhập tiêu chuẩn phòn: ");
            roomStandard=scanner.nextLine();
            System.out.println("nhập tiện nghi khác: ");
            other=scanner.nextLine();
            System.out.println("nhập diện tích bể bơi: ");
            poolArea=Float.parseFloat(scanner.nextLine());
            System.out.println("nhập số tầng :");
            floor=Integer.parseInt(scanner.nextLine());
        }catch (Exception e){
            e.getMessage();
        }
    }

    @Override
    public String toString() {
        ;
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", other='" + other + '\'' +
                ", poolArea=" + poolArea +
                ", floor=" + floor +super.toString()+
                '}';
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

    public Float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(Float poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
