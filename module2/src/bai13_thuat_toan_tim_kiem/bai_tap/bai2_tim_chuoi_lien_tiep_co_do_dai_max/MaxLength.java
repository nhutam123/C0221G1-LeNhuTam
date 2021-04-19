package bai13_thuat_toan_tim_kiem.bai_tap.bai2_tim_chuoi_lien_tiep_co_do_dai_max;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MaxLength {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        LinkedList<Character> max=new LinkedList<>();
        LinkedList<Character> list=new LinkedList<>();
        System.out.println("nhập vào chuỗi");
        String string=scanner.nextLine();
        for (int i=0;i<string.length();i++){
            if (list.size()>1&&string.charAt(i)<=list.getLast()&&list.contains(string.charAt(i))){
                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
        }
        for (Character cha:max){
            System.err.print(cha);
        }

    }
}
