package bai2Loop.baiTap;

import java.util.Scanner;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập số lượng số nguyên tố muốn in ra");
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
                i++;
            }
            num++;
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
