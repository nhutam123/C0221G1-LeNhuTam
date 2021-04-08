package bai7_abstructclass_interface.thuc_hanh.so_sanh_cac_lop_hinh_hoc;

import bai7_abstructclass_interface.thuc_hanh.trien_khai_inteface_hinh_hoc.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles=new Circle[3];
        circles[0]=new Circle(3.6f);
        circles[1]=new Circle();
        circles[2]=new Circle(3.5f,"red");
        System.out.println("pre-sorted");
        for (Circle circle: circles){
            System.out.println(circle);
        }
        Comparator circleComparator=new CircleComparator();
        Arrays.sort(circles,circleComparator);
        System.out.println("apter-sorted");
        for (Circle circle:circles){
            System.out.println(circle);
        }
    }
}
