package bai3.baiTap;

import java.util.Scanner;

public class TinhTongCacSoCungDong {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
        };
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(tinhTongTrenDong(arr,n));

    }
    public static int tinhTongTrenDong(int arr[][] , int n){
        int result=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (j==n){
                    result+=arr[i][j];
                }
            }
        }
        return result;
    }
}
