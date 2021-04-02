package bai3.thucHanh;


import java.util.Scanner;

public class UngDungTinhSoLuongSinhVienDo {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println(tinhSoSvDo(array));

    }
    public static int tinhSoSvDo(int arr[]){
        int result=0;
        for (byte i=0;i<arr.length;i++){
            if (arr[i]>=5){
                result ++;
            }
        }
        return result;
    }
}
