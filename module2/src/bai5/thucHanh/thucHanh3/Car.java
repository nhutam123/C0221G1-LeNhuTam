package bai5.thucHanh.thucHanh3;

public class Car {
    public static int numberOfCar;
    private String name;
    private String engine;
    public Car(String name, String engine){
        this.name=name;
        this.engine=engine;
        numberOfCar++;
    }

}
