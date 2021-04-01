package bai2Loop.thucHanh;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào số thứ nhất");
        int num1=scanner.nextInt();
        System.out.println("nhập vào số thứ hai");
        int num2=scanner.nextInt();
        System.out.println(uocChungLonNhat(num1,num2));
    }
    public static String uocChungLonNhat(int num1, int num2){
       String result="";
       int num3=0;
        if (num1==0&&num2==0){
            result="không có ước chung của 2 số";
        }else if (num1==0){
            result="ước chung lớn nhất là: "+num2;
        }else if(num2==0){
            result="ước chung lớn nhất của 2 số là: "+num1;
        }else {
            for (int i=1;i<=num1;i++){
                if (num1%i==0 && num2%i==0){
                    num3=i;
                }
            }
            result = "ước chung lớn nhất của 2 số là " + num3;
        }
        return result;

    }
}
