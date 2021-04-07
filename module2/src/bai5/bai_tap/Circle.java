package bai5.bai_tap;

public class Circle {
    private double radius=5;
    private String color="red";
    Circle(){}
    Circle(double r){
        this.radius=r;

    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return (Math.PI)*radius*getRadius();
    }

    public static void main(String[] args) {
        Circle circle2=new Circle(3);
        System.out.println(circle2.getArea());
    }

}
