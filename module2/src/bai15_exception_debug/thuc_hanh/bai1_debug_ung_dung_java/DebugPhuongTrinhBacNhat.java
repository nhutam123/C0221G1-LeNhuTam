package bai15_exception_debug.thuc_hanh.bai1_debug_ung_dung_java;

import java.util.Scanner;

public class DebugPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập số a : ");
        double a=scanner.nextDouble();
        System.out.println("nhập số b : ");
        double b=scanner.nextDouble();
        System.out.println("nhập số c: ");
        double c=scanner.nextDouble();
        if (a != 0){
            double answer = (c-b)/a;
            System.out.println("phuong trình có nghiệm x = "+ answer);
        }else if(b==c){
            System.out.println("phuong trinh có vô số nghiêm");

        }else {
            System.out.println("phương trình vô nghiêm ");
        }
    }
}
