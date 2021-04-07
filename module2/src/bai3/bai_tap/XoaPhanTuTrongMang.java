package bai3.baiTap;

import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5,6,7,8,9};
        Scanner scanner=new Scanner(System.in);
        System.out.println("hãy nhập số bạn muốn xóa");
        int num=scanner.nextInt();
        System.out.println(xoaPhanTuTrongMang(num,arr));
    }
    public static String xoaPhanTuTrongMang(int num, int arr[]){
        String result="";
        for (byte i=0;i<arr.length;i++){
            if (num==arr[i]){
                for (int j=i;j<arr.length-1;j++) {
                    arr[j] = arr[j + 1];
                }
                i--;
                arr[arr.length-1]=0;
            }
        }
        for (int i=0;i<arr.length;i++){
            result += arr[i]+",";
        }
        return result;
    }

}
