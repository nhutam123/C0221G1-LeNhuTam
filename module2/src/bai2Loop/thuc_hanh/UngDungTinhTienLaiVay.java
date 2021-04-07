package bai2Loop.thucHanh;

import java.util.Scanner;

public class UngDungTinhTienLaiVay {
    public static double b;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập số tiền gửi");
        double money=scanner.nextDouble();
        System.out.println("nhập số tháng gửi");
        int months=scanner.nextInt();
        System.out.println("nhập lãi suất theo năm");
        float earning=scanner.nextFloat();
        tongTien(money,months,earning);
        System.out.println(b);

    }
    public static Double tongTien(double money,int months,float earning){
        b = money*earning/12*months;
        return b;
    }
}
