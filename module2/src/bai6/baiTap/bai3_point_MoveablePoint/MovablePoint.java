package bai6.baiTap.bai3_point_MoveablePoint;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;
    MovablePoint(){
    }
    MovablePoint(float xSpeed, float ySpeed,float x,float y){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    private float getxSpeed(){
        return this.xSpeed;
    }
    private float getySpeed(){
        return this.ySpeed;
    }
    private void setxSpeed(float xSpeed){
        this.xSpeed=xSpeed;
    }
    private void  setySpeed(float ySpeed){
        this.ySpeed=ySpeed;
    }
    private void  setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    private float[] getSpeed(){
        float arr[]={getxSpeed(),getySpeed()};
        return arr;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}'
                +super.toString();
    }

    public static void main(String[] args) {
        MovablePoint m1=new MovablePoint(1,2,3,4);
        System.out.println(Arrays.toString(m1.getSpeed()));
        System.out.println(m1.toString());
    }
}
