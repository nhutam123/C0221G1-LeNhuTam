package bai4.bai_tap.lopPan;

public class Quat {
    final int SLOW=1;
    final int MEDIUM=2;
    final int FAST=3;
    Quat(){}
    private  int speed=SLOW;
    private boolean on=false;
    private double radius=5;
    private String color="blue";
    private int getSpeed(){
        return this.speed;
    }
    private boolean getOn(){
        return this.on;
    }
    private double getRadius(){
        return this.radius;
    }
    private  String getColor(){
        return this.color;
    }
    private  void setSpeed(int speed){
        this.speed=speed;
    }
    private void setOn(boolean on){
        this.on=on;
    }
    private void setRadius(double radius){
        this.radius=radius;
    }
    private void setColor(String color){
        this.color =color;
    }

    @Override
    public String toString() {
        if (getOn()){
            return "Quat is on{" +
                    ", speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }else {
            return "Quat is off{" +
                    ", speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }

    }

    public static void main(String[] args) {
     Quat quat1=new Quat();
     quat1.setOn(true);
     quat1.setSpeed(3);
     quat1.setColor("red");
     quat1.setRadius(10);
        Quat quat2 =new Quat();
        quat2.setOn(false);
        quat2.setSpeed(2);
        quat2.setRadius(5);
        quat2.setColor("yellow");
        System.out.println(quat1.toString());
        System.out.println(quat2.toString());

    }


}
