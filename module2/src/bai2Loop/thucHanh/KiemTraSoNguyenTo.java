package bai2Loop.thucHanh;

import java.util.Scanner;


public class KiemTraSoNguyenTo {
    static String b="";
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập số cần kiểm tra");
        int num=scanner.nextInt();
        kiemTra(num);
        System.out.println(b);

    }
    public static String kiemTra(int num){
        boolean check=true;
        if (num<2){
            check=false;
        }else {
            for (int i=2;i<=num/2;i++){
                if (num%i==0){
                    check=false;
                }
            }
        }
        if (check){
            b=num+" là số nguyên tố";
        }else {
            b=num+" không phải là số nguyên tố";
        }
        return b;
    }
}
