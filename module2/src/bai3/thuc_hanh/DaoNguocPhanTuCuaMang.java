package bai3.thuc_hanh;
import java.util.Scanner;
public class DaoNguocPhanTuCuaMang {

    public static void main(String[] args) {
         int num;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("nhập số phần tử của mảng(<=20)");
            num=scanner.nextInt();
        }while (num>20);
        int [] arr = new int[num];
        for (int i=0;i<num;i++){
            System.out.println("nhập phần tử :");
            arr[i]=scanner.nextInt();
        }
       // System.out.printf("%-20s%s", "Elements in array: ", "");
        String result="";
        for (int j = 0; j < arr.length; j++) {
            result += arr[j]+" ";
        }
        System.out.print("mảng vừa nhập là: "+result+"\n");
        String result1="";
        for (int i=0;i<arr.length/2;i++){
            int c=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=c;
        }
        //System.out.printf("%-20s%s", "Elements in array đảo ngược: ", "");
        for (int j = 0; j < arr.length; j++) {
         result1 += arr[j]+" ";
        }
        System.out.print("mảng vừa đảo ngược là: "+result1);
    }
}
