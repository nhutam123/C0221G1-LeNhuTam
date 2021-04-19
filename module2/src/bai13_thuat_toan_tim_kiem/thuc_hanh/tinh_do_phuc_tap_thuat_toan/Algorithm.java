package bai13_thuat_toan_tim_kiem.thuc_hanh.tinh_do_phuc_tap_thuat_toan;

import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string");
        String inputString=scanner.nextLine();
        int[] frequentChar=new int[225];
        for (int i=0;i<inputString.length();i++){
            int ascii= inputString.charAt(i);
            frequentChar[ascii]+=1;
        }
        int max=0;
        char character=(char) 255;
        for (int j=0;j<225;j++){
            if (frequentChar[j]>max){
                max=frequentChar[j];
                character=(char) j;
            }
        }
        System.out.println("the most appearing letter is "+ character+"with a of  "+max+"time");
    }
}
