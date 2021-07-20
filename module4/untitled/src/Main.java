import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][]  arr={
                {-1,-2,-3,-6},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,7,5}
        };


        System.out.println(Arrays.toString(findMax(arr)));

    }

    public static int[]  findMax(int[][] arr){
        int[] arr1=new int[4];

        for (int i=0;i<4;i++){
            int max=arr[i][0];
            for (int j=0;j<4;j++){
                if (arr[i][j]>max){
                    max=arr[i][j];
                }
            }
            arr1[i]=max;
        }
        return arr1;

    }
}
