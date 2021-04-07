package bai1.baiTap;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("hãy nhập tên của bạn");
        String name;
        name=scanner.nextLine();
        System.out.println("Hello "+name);
    }
}
