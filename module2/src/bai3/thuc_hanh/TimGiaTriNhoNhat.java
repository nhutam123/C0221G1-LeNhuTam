package bai3.thucHanh;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println("gia trị nhỏ nhất là :"+timMin(arr));
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
