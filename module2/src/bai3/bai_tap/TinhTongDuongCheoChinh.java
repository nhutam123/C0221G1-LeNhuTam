package bai3.bai_tap;

public class TinhTongDuongCheoChinh {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5},
                {1,2,3,4,5}
        };

        System.out.println(tinhTongDuongCheo(arr));

    }
    public static int tinhTongDuongCheo(int arr[][]){
        int result=0;
        for (byte i=0;i<arr.length;i++)
            for (byte j=0;j<arr[i].length;j++){
                if (i==j){
                    result+=arr[i][j];
                }
            }
        return result;
    }
}
