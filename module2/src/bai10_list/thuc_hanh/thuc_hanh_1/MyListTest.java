package bai10_list.thuc_hanh.thuc_hanh_1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger =new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        System.out.println("element4: "+ listInteger.get(4));
        System.out.println("element1: "+ listInteger.get(1));
        System.out.println("element2: "+ listInteger.get(2));
        //listInteger.add(6);
        //System.out.println("element6: "+ listInteger.get(6));
//        listInteger.get(-1);
//        System.out.println("element -1: " + listInteger.get(-1));
    }
}
