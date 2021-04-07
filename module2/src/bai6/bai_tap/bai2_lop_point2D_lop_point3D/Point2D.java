package bai6.baiTap.bai2_lop_point2D_lop_point3D;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;
    Point2D(){}
    Point2D(float x,float y){
        this.x=x;
        this.y=y;
    }
    protected float getX(){
        return this.x;
    }
    protected void setX(float x){
        this.x=x;
    }
    protected float getY(){
        return this.y;
    }
    protected void setY(float y){
        this.y=y;
    }
    protected  float[] getXY(){
        float[] arr={x,y};
        return arr;
    }
    protected void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point2D point2D=new Point2D(2,3);
        System.out.println(point2D.toString());
    }
}
