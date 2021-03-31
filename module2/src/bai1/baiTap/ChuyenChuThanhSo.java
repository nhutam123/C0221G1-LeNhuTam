package bai1.baiTap;

import java.util.Scanner;

public class ChuyenChuThanhSo {
    static String b = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số :");
        int num = scanner.nextInt();
        if (num==0){
            b="zero";
        }else if (0 <= num && num <= 20) {
            chuyenSoTu0Den20(num);
        } else if (20 < num && num < 100) {
            chuyenSoTu21Den99(num);
        } else if (100 <= num && num < 1000) {
            chuyenSo2(num);
        }
        System.out.println(b);
    }

    public static String chuyenSoTu0Den20(int num) {
        switch (num) {
            case 0:
                b = "";
                break;
            case 1:
                b = "one";
                break;
            case 2:
                b = "two";
                break;
            case 3:
                b = "three";
                break;
            case 4:
                b = "four";
                break;
            case 5:
                b = "five";
                break;
            case 6:
                b = "six";
                break;
            case 7:
                b = "seven";
                break;
            case 8:
                b = "eight";
                break;
            case 9:
                b = "nine";
                break;
            case 10:
                b = "ten";
                break;
            case 11:
                b = "eleven";
                break;
            case 12:
                b = "twelfth";
                break;
            case 13:
                b = "thirty";
                break;
            case 14:
                b = "fourteen";
                break;
            case 15:
                b = "fifteen";
                break;
            case 16:
                b="sixteen";
                break;
            case 17:
                b="seventeen";
                break;
            case 18:
                b="eightteen";
                break;
            case 19:
                b="nineteen";
                break;
            case 20:
                b = "twenty";
                break;
        }
        return b;
    }

    public static String chuyenSoTu21Den99(int num) {
        if (num >= 20 && num < 30) {
            b = ("twenty " + chuyenSoTu0Den20(num % 20));
        } else if (num <= 30 && num < 40) {
            b = "thirty " + chuyenSoTu0Den20(num % 30);
        } else if (num >= 50 && num < 60) {
            b = "fifty " + chuyenSoTu0Den20(num % 50);
        } else if ((40 <= num && 50 > num) || (60 <= num && num < 100)) {
            b = chuyenSoTu0Den20(num / 10) + "ty " + chuyenSoTu0Den20(num % 10);
        }
        return b;
    }

    public static String chuyenSo2(int num) {
        if (num % 100 <= 10 && num%100>0) {
            b = chuyenSoTu0Den20(num / 100) + " hunderus and "+chuyenSoTu0Den20(num%100) ;
        } else if (num%100<=20){
            b = chuyenSoTu0Den20(num / 100) + " hunderus " + chuyenSoTu0Den20(num % 100);
        }else {
            b=chuyenSoTu0Den20(num/100)+" hunderus " +chuyenSoTu21Den99(num%100);
        }
        return b;
    }
}

