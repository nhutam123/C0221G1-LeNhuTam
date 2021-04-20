package bai14_thuat_toan_sap_xep.bai_tap.bai1_sap_xep_chen;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 6, 2, 3, 9, 46, 55, 34};
        insertionSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int element=list[i];
            int k;
            for (k=i-1;k>=0&&list[k]>element;k--){
                list[k+1]=list[k];
            }
            list[k+1]=element;
        }
    }
}
