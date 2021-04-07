package bai6.thucHanh;

public class Rectangle extends Shape {
    private double width;
    private double length;
    Rectangle(){
        this.width=1.0;
        this.length=1.0;
    }
    Rectangle(double width, double length){
        this.width=width;
        this.length=length;

    }

    Rectangle(double width, double length, String color,boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    protected double getWidth(){
        return this.width;
    }

    protected void setWidth(double width){
        this.width=width;
    }

    protected double getLength(){
        return this.length;
    }

    protected void setLength(double length){
        this.length=length;
    }

    protected double getArea(){
        return this.width*this.length;
    }

    protected double getPerimeter(){
        return 2*(this.length+this.width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}'
                +super.toString();
    }

    public static void main(String[] args) {

    }
}
