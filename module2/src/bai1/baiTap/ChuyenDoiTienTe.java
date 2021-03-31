package bai1.baiTap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        int rate=23000;
        long num;
        System.out.println("hãy nhập số tiền tính theo usd :" );
        Scanner scanner=new Scanner(System.in);
        num=scanner.nextLong();
        System.out.println("số tiền việt nam đồng là : " + num*rate);
    }
}
