package bai3.baiTap;

import java.util.Scanner;

public class TimSoLanXuatHien {
    public static void main(String[] args) {
        String string="toi la tam dep trai";
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập ký tự muốn kiểm tra");
        char kyTu=scanner.next().charAt(0);
        System.out.println(timSoLanXuatHien(string,kyTu));
    }
    public static int timSoLanXuatHien(String string , char kyTu){
        int result=0;
        for (int i=0;i<string.length();i++){
            if (kyTu==string.charAt(i)){
                result++;
            }
        }
        return result;
    }
}
