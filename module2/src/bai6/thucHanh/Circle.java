package bai6.thucHanh;

public class Circle extends Shape {
    private double radius;
    Circle(){
        this.radius=1.0;
    }
    Circle(double radius){
        this.radius=radius;
    }
    Circle(double radius,String color,boolean fillter){
        super(color,fillter);
        this.radius=radius;
    }
    protected double getArea(){
        return Math.PI*radius*radius;
    }
    protected double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "A Circle with{" +
                "radius=" + radius +
                '}'
                +super.toString();
    }

    public static void main(String[] args) {
        Circle newCircle=new Circle(5,"red",true);
        System.out.println(newCircle);
        System.out.println(newCircle.getArea());
    }
}
