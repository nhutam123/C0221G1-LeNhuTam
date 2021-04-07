package bai3.bai_tap;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,9};
        int[] arr3=new int[9];
        for (int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for (int j=0;j<arr2.length;j++){
            arr3[j+arr1.length]=arr2[j];
        }
        String result="";
        for (int i=0;i<arr3.length;i++){
           result+=arr3[i]+" ";
        }
        System.out.println(result);
    }
}
