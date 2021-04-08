package bai7_abstructclass_interface.thuc_hanh.so_sanh_cac_lop_hinh_hoc;

import bai7_abstructclass_interface.thuc_hanh.trien_khai_inteface_hinh_hoc.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius()>o2.getRadius()) return 1;
        else if (o1.getRadius()<o2.getRadius())return -1;
        else
        return 0;
    }
}
