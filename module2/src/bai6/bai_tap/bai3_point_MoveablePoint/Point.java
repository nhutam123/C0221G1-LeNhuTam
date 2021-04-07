package bai6.bai_tap.bai3_point_MoveablePoint;

import java.util.Arrays;

public class Point {
    private float x=0.0f;
    private float y=0.0f;
    Point(){}
    Point(float x,float y){
        this.x=x;
        this.y=y;
    }
    protected float getX(){
        return this.x;
    }
    protected float getY(){
        return this.y;
    }
    protected void setX(float x){
        this.x=x;
    }
    protected void setY(float y){
        this.y=y;
    }
    protected float[] getXY(){
        float arr[]={x,y};
        return arr;
    }
    protected void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point point=new Point(1,3);

        System.out.println(Arrays.toString(point.getXY()));
    }
}
