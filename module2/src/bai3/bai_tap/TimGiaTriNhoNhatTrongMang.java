package bai3.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int[] arr=new int [10];
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<10;i++){
            System.out.println("nhập phần tử cho mảng");
            arr[i]=scanner.nextInt();
        }
        System.out.println("giá trị nhỏ nhất là : "+timMin(arr));
    }
    public static int timMin(int arr[]){
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
