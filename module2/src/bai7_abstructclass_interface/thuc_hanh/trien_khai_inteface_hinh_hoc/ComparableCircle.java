package bai7_abstructclass_interface.thuc_hanh.trien_khai_inteface_hinh_hoc;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
public ComparableCircle(){

}
public ComparableCircle(float radius){
    super(radius);
}
public ComparableCircle(float radius, String color){
    super(radius, color);
}
    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius()>o.getRadius()){
            return 1;
        }else if (getRadius()<o.getRadius()){
            return -1;
        }else return 1;
    }

}
