package bai2Loop.baiTap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static
    int chieuCao;
    public static
    int chieuRong;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập chiều cao");
        chieuCao=scanner.nextInt();
        System.out.println("nhập chiều rộng");
        chieuRong=scanner.nextInt();
        System.out.println(inHinhChuNhat(chieuCao,chieuRong));
        System.out.println(inHInhTamGiacVuong(chieuCao,chieuRong));
        System.out.println(inHinhTamGiacNguoc(chieuCao,chieuRong));
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

