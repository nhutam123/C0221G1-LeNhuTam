package bai7_abstructclass_interface.bai_tap.trien_khai_interface_resizeable;

public class Shape implements iResizeable{
    private String color;
    private boolean filled;
    Shape(){
        this.color="green";
        this.filled=true;
    }
    Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    protected  String getColor(){
        return this.color;
    }
    protected void  setColor(String color){
        this.color=color;
    }
    protected boolean getFilled(){
        return this.filled;
    }
    protected void setFilled(boolean filled){
        this.filled=filled;
    }

    @Override
    public void resized(double percent) {

    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
