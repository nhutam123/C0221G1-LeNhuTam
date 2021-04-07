package bai6.baiTap.bai4_thiet_ke_trien_khai_lop_triangle;

public class Shape {
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
    public String toString() {
        return "A Shape with {" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
