package bai3.thucHanh;

import sun.security.mscapi.CPublicKey;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongmang {

    public static void main(String[] args) {
        int[] arr=new int [10];
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<10;i++){
            System.out.println("nhập phần tử cho mảng");
            arr[i]=scanner.nextInt();
        }
        System.out.println("giá trị lớn nhất là : "+timMax(arr));
    }

    public static int timMax(int arr[]){
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
