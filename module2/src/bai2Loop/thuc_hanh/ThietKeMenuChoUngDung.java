package bai2Loop.thucHanh;

import java.util.Scanner;

public class ThietKeMenuChoUngDung {
    public static
    int chieuCao=7;
    public static
    int chieuRong=6;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        byte num=0;
        do {
            System.out.println("nhập vào ứng dụng bạn muốn chon\n" +
                    "1. vẽ hình chữ nhât\n" +
                    "2.vẽ hình tam giác\n" +
                    "3.vẽ hình tam giác ngược");
            num=scanner.nextByte();
            switch (num){
                case 1:
                    System.out.println(inHinhChuNhat(chieuCao,chieuRong));
                    break;
                case 2:
                    System.out.println(inHInhTamGiacVuong(chieuCao,chieuRong));
                    break;
                case 3:
                    System.out.println(inHinhTamGiacNguoc(chieuCao,chieuRong));
                    break;
            }
        }while (num>3);

    }
    public static  String inHinhChuNhat(int chieuCao,int chieuRong){
        String result="";
        for (int i=0;i<chieuCao;i++){
            for (int j=0;j<chieuRong;j++){
                result += "*";
            }
            result+="\n";
        }
        return result;
    }
    public static String inHInhTamGiacVuong(int chieuCao,int chieuRong){
        String result="";
        for (int i=1;i<chieuCao;i++){
            for (int j=1;j<chieuRong;j++){
                if (i>j){
                    result += "*";
                }
            }
            result+="\n";
        }
        return result;
    }
    public static String inHinhTamGiacNguoc(int chieuCao , int chieuRong){
        String result="";
        for (int i=1;i<chieuCao;i++){
            for (int j=1;j<chieuRong;j++){
                if (i+j<chieuCao){
                    result += "*";
                }
            }
            result+="\n";
        }
        return result;
    }
}
