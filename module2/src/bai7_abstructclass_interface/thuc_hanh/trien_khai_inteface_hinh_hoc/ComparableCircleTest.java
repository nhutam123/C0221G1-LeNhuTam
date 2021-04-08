package bai7_abstructclass_interface.thuc_hanh.trien_khai_inteface_hinh_hoc;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles=new ComparableCircle[3];
        circles[0]=new ComparableCircle(3.6f);
        circles[1]=new ComparableCircle();
        circles[2]=new ComparableCircle(3.5f,"indigo");
        System.out.println("pre-sorted");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("after-sorted");
        for (ComparableCircle circle :circles){
            System.out.println(circle);
        }
    }

}
