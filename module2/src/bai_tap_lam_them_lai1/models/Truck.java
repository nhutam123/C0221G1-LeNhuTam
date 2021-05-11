package bai_tap_lam_them_lai1.models;

public class Truck extends Vehicle {
    int payload;

    public Truck() {
    }

    public Truck(String licencePlate, String producer, String productYear, String owner, int payload) {
        super(licencePlate, producer, productYear, owner);
        this.payload = payload;
    }
    
    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    @Override
    void add() {

    }

    @Override
    public String toString() {
        return "Truck{" +
                "payload=" + payload +
                super.toString()+
                '}';
    }
}
