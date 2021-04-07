package bai2Loop.bai_tap;

import java.util.Scanner;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập số bạn muốn in ra các số nguyên tố nhỏ hơn");
        int n=scanner.nextInt();
        System.out.println(inRaDaySoNt(n));
    }
    public static String inRaDaySoNt(int n){
        String result="";
        int i=0;
        int num=0;
        while (i<n){
            if (kiemTra(num)!=""){
                result += kiemTra(num);
            }
            num++;
            i++;
        }
        return result;
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
            return num+",";
        }else {
            return "";
        }
    }
}
