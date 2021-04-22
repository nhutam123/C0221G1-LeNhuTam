package bai15_exception_debug.thuc_hanh.bai2;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random random=new Random();
        Integer[] arr =new Integer[100];
        System.out.println("danh sách phần tử của mảng: ");
        for (int i=0;i<100;i++){
            arr[i]=random.nextInt(100);
            System.out.println(arr[i]+" ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample=new ArrayExample();
        Integer[] arr=arrayExample.createRandom();
        Scanner scanner=new Scanner(System.in);
        System.out.println("vui long nhập chỉ số của một phần tử bất kỳ: ");
        int x=scanner.nextInt();
        try {
            System.out.println("giá trịn của phần tử có chỉ số là 5 : "+x+" la " +arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("chỉ số vượt quá giới hạn của mảng");

        }
    }
}
