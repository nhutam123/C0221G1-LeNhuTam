package bai7_abstructclass_interface.bai_tap.trien_khai_interface_resizeable;

import java.util.Arrays;

public class Text {
    public static void main(String[] args) {
        double percen=Math.random()*100;
        Shape[] shapes= new Shape[3];
        shapes[0]=new Circle(1, "red");
        shapes[1]=new Rectangle(2, 4,"blue",true);
        shapes[2]=new Square(3);

        for (Shape circle1 : shapes){
            circle1.resized(percen);
            System.out.println(circle1);
        }

    }

}
