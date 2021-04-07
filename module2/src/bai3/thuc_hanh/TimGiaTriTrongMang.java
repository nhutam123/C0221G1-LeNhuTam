package bai3.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] arr={"tam","pháp","tấn","hoàng","tân","kiên","đồng"};
        System.out.println("nhập tên cần tìm kiếm:");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        String result="";
        for (int i=0;i<arr.length;i++){
            if(arr[i].equals(name)){
               result=  i + "";
               break;
            }
        }
        System.out.println("vị trí là "+ result);
    }
}
