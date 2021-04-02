package bai3.baiTap;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,0,0,0};

        System.out.println( themPhanTuVaomang(5,4, arr));



    }
    public static String themPhanTuVaomang(int num,int x , int arr[]){
        String result="";
        for (int i=arr.length-1;i>x;i--){
            arr[i]=arr[i-1];
            arr[x]=num;
        }
        for (int i=0;i<arr.length;i++) {
            result += arr[i] + " ";
        }
        return result;
    }
}
