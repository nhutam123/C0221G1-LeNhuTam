package bai1.ThucHanh;

import java.util.Scanner;

public class ChiSoBmi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        float weight;
        float height;
        System.out.println("nhập chỉ số cân nặng (kg) :");
        weight=scanner.nextFloat();
        System.out.println("nhập chỉ số chiều cao (mét) :");
        height=scanner.nextFloat();
        float bmi=weight/(height*height);
        if (bmi<18.5){
            System.out.println("bmi của bạn là: "+bmi+" : bạn quá gầy");
        }else if (bmi<25){
            System.out.println("bmi của bạn là: "+bmi+" : bạn khá cân đối");
        }else if (bmi<30){
            System.out.println("bmi của bạn là: "+bmi+ " : bạn hơi mập");
        }else {
            System.out.println("bmi của bạn là : "+bmi+ " : bạn quá béo");
        }
    }
}
