package bai10_list.bai_tap.bai1;

import javax.xml.bind.Element;

public class MyListTest {
    public static void main(String[] args) {
        Mylist<Integer> elements=new Mylist(6);
        elements.add(0,1);
        elements.add(1,2);
        elements.add(2,3);
        elements.add(3,4);
        elements.add(2,5);
        for (int i=0;i<elements.size;i++){
            System.out.println(elements.get(i));
        }
        System.out.println("remove");
        elements.remove(2);
        for (int i=0;i<elements.size;i++){
            System.out.println(elements.get(i));
        }
        System.out.println(elements.size());
        System.out.println(elements.contains(6));
        System.out.println(elements.indexOf(4));
        System.out.println("clear");
        elements.clear();
       for (int i=0;i<elements.size;i++){
           System.out.println(elements.get(i));
       }


    }
}
