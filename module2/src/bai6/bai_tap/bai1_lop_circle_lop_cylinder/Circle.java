package bai6.bai_tap.bai1_lop_circle_lop_cylinder;

public class Circle {
    private float radius;
    private String color;
    Circle(){}
    Circle(float radius,String color){
        this.radius=radius;
        this.color=color;
    }
    protected float getRadius(){
        return this.radius;
    }
    protected String getColor(){
        return this.color;
    }
    protected  double getArea(){
        return ((Math.PI)*getRadius()*getRadius()) ;
    }
    protected double getPerimeter(){
        return 2*Math.PI*getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Circle circle=new Circle(5,"red");
        System.out.println(circle.getArea());
    }
}
