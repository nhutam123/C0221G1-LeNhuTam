import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][]  arr={
                {-1,-2,-3,-6},
                {2,3,4,5},
                {2,3,4,5},
                {2,3,7,5}
        };
        int[] arr1={1,3,5,4,6};
        ArrayList<Integer> arrayList=new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(3);



        System.out.println(Arrays.toString(play("abcaabcdef")));
//        sort_ascending(arrayList);
//        System.out.println(arrayList);

    }
    public static String[] play(String string) {
        String[] arr;
        String[] arr1 = new String[string.length()];
        String a = "";
        arr = string.split("");

        for (int i = 0; i < arr.length; i++) {
            int count =0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }
            if (count > 0 && !a.contains(arr[i])) {
                a+=arr[i];
            }
        }
        arr1 =a.split("");
        return arr1;
    }
}


//    public static int[]  findMax(int[][] arr){
//        int[] arr1=new int[4];
//
//        for (int i=0;i<4;i++){
//            int max=arr[i][0];
//            for (int j=0;j<4;j++){
//                if (arr[i][j]>max){
//                    max=arr[i][j];
//                }
//            }
//            arr1[i]=max;
//        }
//        return arr1;
//
//    }
//    public static int[] sortDESC(int [] arr) {
//        int temp ;
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//                if(arr[i]>arr[j]){
//                    temp=arr[j];
//                    arr[j]=arr[i];
//                    arr[i]=temp;
//                }
//            }
//        }
//        // code here
//        return arr;
//    }
//    public static int totalDigitsOfNumber(int n) {
//        int total = 0;
//
//        while(n>10){
//            total += n%10;
//            n=n/10;}
//        total+=n;
//        // code here
//        return total;
//    }
//    public static <E> int search_element(java.util.ArrayList<E> arrayList, E element) {
//        //Your code here
//        int a=0;
//        for(int i=0;i<arrayList.size();i++){
//            if(element==arrayList.get(i)){
//                a=i;
//                break;
//            }
//
//        }
//        return a;
//    }
//    public static <E> void reverse_element (java.util.ArrayList<E> arrayList) {
//        //Your code here
//        E temp = arrayList.get(0);
//        int n=arrayList.size();
//        for(int i=0; i<=(n-1)/2;i++){
//            temp=arrayList.get(n-i-1);
//            arrayList.set(n-i-1,arrayList.get(i));
//            arrayList.set(i,temp);
//
//        }
//    }
//    public static void sort_ascending (java.util.ArrayList<Integer> arrayList) {
//        //Your code here
//        Integer temp;
//        for(int i=0;i< arrayList.size();i++){
//            for(int j=0;j< arrayList.size();j++){
//                if(arrayList.get(i)<arrayList.get(j)){
//                    temp=arrayList.get(j);
//                    arrayList.set(j,arrayList.get(i));
//                    arrayList.set(i,temp);
//                }
//            }
//        }
//    }


