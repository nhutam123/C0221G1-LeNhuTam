package bai7_abstructclass_interface.bai_tap.trien_khai_interface_resizeable;

public class Circle extends Shape implements iResizeable {

    @Override
    public void resized(double percent) {
        this.radius=getRadius()*percent;

    }
    private double radius;
    private String color;
    public Circle(){}
    public Circle(float radius,String color){
        this.radius=radius;
        this.color=color;
    }

    public Circle(float radius) {
        this.radius=radius;
    }


    protected double getRadius() {
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
        Circle newCircle=new Circle(2,"red");
        double percent=Math.random()*100;
        System.out.println(newCircle.getRadius());
        newCircle.resized(percent);
        System.out.println(newCircle.getRadius());

    }

}
