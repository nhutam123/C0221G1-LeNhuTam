package bai7_abstructclass_interface.bai_tap.trien_khai_interface_resizeable;

public class Rectangle extends Shape implements iResizeable {
    private double width=1;
    private double length=1;
    @Override
    public void resized(double percent) {
        this.width=width*percent;
        this.length=length*percent;

    }

    Rectangle(){
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

}
