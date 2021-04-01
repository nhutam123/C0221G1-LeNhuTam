package bai3.thucHanh;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
   public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("hãy chọn mục chuyển đổi\n" +
                "1. Fahrenheit to Celsius\n" +
                "\n" +
                "2. Celsius to Fahrenheit\n" +
                "\n" +
                "0. Exit ");
        System.out.println("hãy nhập mục bạn chon: ");
        byte choose=scanner.nextByte();
        System.out.println(chuyenDoiNhietDo1(choose));
    }
    public static String chuyenDoiNhietDo1(byte choose){
        String result="";
        if (choose == 1) {
            System.out.println("hãy nhập nhiệt độ muốn đổi");
            float num=scanner.nextFloat();
            result="nhiệt độ theo độ c là: "+(num-32)*5/9;
        }else if (choose==2){
            System.out.println("hãy nhập nhiệt độ muốn đổi");
            float num=scanner.nextFloat();
            result="nhiệt độ theo độ f là: "+ (num*9/5+32);
        }
        return result;
    }
}
