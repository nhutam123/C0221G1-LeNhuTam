package bai1.thuc_hanh;

import java.util.Scanner;

public class TinhSoNgayTrngThang {
    public static void main(String[] args) {
        int n;
        System.out.println("nhập tháng muốn tính");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        switch (n){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("tháng có 31 ngày");
                break;
            case 2:
                System.out.println("thang có 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("tháng có 30 ngày");
                break;
            default:
                System.out.println("bạn đã nhập sai tháng");
        }
    }
}
