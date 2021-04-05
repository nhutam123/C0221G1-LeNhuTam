package bai4.baiTap.lopPan;

public class Pan {
    final int SLOW=1;
    final int MEDIUM=2;
    final int FAST=3;
    int speed=SLOW;
    boolean on=false;
    private double radius=5;
    private String color="blue";
   public Pan(){}

    public int getSpeed() {
        return speed;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public boolean getOn(){
       return true;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setOn(boolean on){
       this.on=on;
    }

    @Override
    public String toString() {
       if (on){
           return "Fan is on {" +
                   " speed=" + getSpeed() +
                   ", radius=" + getRadius() +
                   ", color='" + getColor() + '\'' +
                   '}';
       }else{
           return "Fan is off {" +
                   " radius=" + getRadius() +
                   ", color='" + getColor() + '\'' +
                   '}';
       }

    }
}
