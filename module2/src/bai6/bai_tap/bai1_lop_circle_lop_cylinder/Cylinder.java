package bai6.baiTap.bai1_lop_circle_lop_cylinder;

public class Cylinder extends Circle {
    private float height;
    Cylinder(){};
    Cylinder(float height, float radius, String color){
        super(radius,color);
        this.height=height;
    }
    private double getVolume(){
        return height* super.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}'
                +super.toString();
    }

    public static void main(String[] args) {
        Cylinder neCylinder=new Cylinder(5,5,"blue");
        System.out.println(neCylinder.toString());
        System.out.println(neCylinder.getVolume());
    }
}
