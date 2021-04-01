package bai3.baiTap;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {



    }
    public static int[] themPhanTuVaomang(int num,int x){
        int arr[]={1,2,3,4,5,6,0,0,0,0};
        for (int i=0;i<arr.length;i++){
            if (i==x){
                int c=arr[i];
                arr[i] =num;
            for (int j=i+1;j<arr.length-1;j++)
                arr[j+1]=arr[j];
            }
        }
        return arr;
    }
}
