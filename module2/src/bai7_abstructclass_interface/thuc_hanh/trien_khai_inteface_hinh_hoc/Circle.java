package bai7_abstructclass_interface.thuc_hanh.trien_khai_inteface_hinh_hoc;

public class Circle {
    private float radius;
    private String color;
   public Circle(){}
    public Circle(float radius,String color){
        this.radius=radius;
        this.color=color;
    }

    public Circle(float radius) {
        this.radius=radius;
    }


    public float getRadius(){
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


}
