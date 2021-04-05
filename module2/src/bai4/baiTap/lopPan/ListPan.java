package bai4.baiTap.lopPan;

public class ListPan {
    public static void main(String[] args) {

        Pan fan1=new Pan();
        fan1.setOn(true);
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        Pan fan2=new Pan();
        fan2.setOn(false);
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

    }

}
