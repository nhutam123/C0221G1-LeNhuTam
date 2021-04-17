package bai12_java_collection_frameword.bai_tap.bai1_luyen_tap_su_dung_arrayList_linkedList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       ProductManager productManager=new ProductManager();
       int count=0;
       do {
           productManager.addProduct();
           count++;
       }while (count<5);
       //productManager.sortList();
       productManager.showList();



    }
}
