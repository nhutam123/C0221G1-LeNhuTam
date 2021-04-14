package bai11_stack_queue.bai_tap.bai5_to_chuc_du_lieu_hop_ly;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyClassText {

    public static void main(String[] args) {
        String name;
        String gender;
        String birthDay;
        List<NhanSu> list=new ArrayList<NhanSu>(5);
        NhanSu newNhanSu=new NhanSu("tam","male","22/3/1994");

        list.add(new NhanSu("tho","male","3/4/1994"));
        list.add(newNhanSu);
        list.add(new NhanSu("tan","male","15/5/1990"));
        Collections.sort(list, new Comparator<NhanSu>() {
            @Override
            public int compare(NhanSu o1, NhanSu o2) {
                DateFormat date = new SimpleDateFormat("dd/MM/yyyy");

                try {
                    return date.parse(o1.getBirthDay()).compareTo(date.parse(o2.getBirthDay()));
                } catch (ParseException e) {
                    throw new IllegalArgumentException(e);
                }
            }
        });
        System.out.println(list);


    }
}
