package bai1.ThucHanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập năm bạn muốn kiểm tra :");
        int year=scanner.nextInt();
        if (year%4==0){
            if (year%100!=0){
                System.out.println(year+": là năm nhuân");
            }else if (year%400==0){
                System.out.println(year+ ": là năm nhuân");
            }else {
                System.out.println(year+ "không phải là năm nhuận");
            }
        }else {
            System.out.println(year+ ": không phải là năm nhuận");
        }

    }
}
