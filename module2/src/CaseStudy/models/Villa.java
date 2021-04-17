package CaseStudy.models;

public class Villa extends Services {

    private String roomStandard;
    private String convenient;

    public Villa() {


    }

    public Villa(String id, String serviceName, double area, int price, int maxClients, String type, String roomStandard, String convenient) {
        super(id,serviceName,area,price,maxClients,type);
        this.roomStandard = roomStandard;
        this.convenient = convenient;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getConvenient() {
        return convenient;
    }

    public void setConvenient(String convenient) {
        this.convenient = convenient;
    }

    @Override
    void showInfor() {

    }
}
