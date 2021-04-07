package bai3.bai_tap;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4,5,6},
                {3,4,5,9,10},
                {13,4,23}
        };
        System.out.println(timMax(arr));

    }
    public static int timMax(int arr[][]){
        int max=arr[0][0];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
}
