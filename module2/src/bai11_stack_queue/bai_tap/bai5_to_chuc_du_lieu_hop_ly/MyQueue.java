package bai11_stack_queue.bai_tap.bai5_to_chuc_du_lieu_hop_ly;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Collection;

public class MyQueue {
    public static void main(String[] args) {
        Queue maleQueue=new LinkedList();
        Queue femaleQueue=new LinkedList();
        List<NhanSu> nhanSus=new ArrayList<NhanSu>(10);
        Scanner scanner=new Scanner(System.in);
        int numberOfNhanVien=0;
        String name;
        String gender;
        String birthDay;
        NhanSu nhanSu;
        do {
            System.out.println("nhập tên nhân viên : ");
            name =scanner.nextLine();
            System.out.println("nhập giới tính nhân viên : ");
            gender=scanner.nextLine();
            System.out.println("nhập ngày sinh  nhân viên : ");
            birthDay= scanner.nextLine();
             nhanSu=new NhanSu(name,gender,birthDay);
            nhanSus.add(nhanSu);
        }while (nhanSus.size()<3);
       Collections.sort(nhanSus, new Comparator<NhanSu>() {
           DateFormat f = new SimpleDateFormat("MM/dd/yyyy");
           @Override
           public int compare(NhanSu o1, NhanSu o2) {
               try {
                   return f.parse(o1.getBirthDay()).compareTo(f.parse(o2.getBirthDay()));
               } catch (ParseException e) {
                   throw new IllegalArgumentException(e);
               }
           }
       });

        int size=nhanSus.size();
        for (int i=0;i<size;i++){
            if (nhanSus.get(i).getGender().equals("male")){
                maleQueue.add(nhanSus.get(i));
            }else {
                femaleQueue.add(nhanSus.get(i));
            }
        }
        for (Object s: maleQueue){
            System.out.println("danh sach nhân viên nam: "+s.toString());
        }
        for (Object s: femaleQueue){
            System.out.println("danh sach nhan vien nu" + s.toString());
        }


    }

}
