package bai1.ThucHanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        System.out.println("nhập a: ");
        Scanner scanner=new Scanner(System.in);
        double a=scanner.nextDouble();
        System.out.println("nhập b: ");
        double b=scanner.nextDouble();
        System.out.println("nhập c: ");
        double c=scanner.nextDouble();
        if (a!=0){
            System.out.println("nghiệm của phương trinhg là:"+ (c-b)/a);
        }else if (c-b==0){
            System.out.println("phương trình có vô số nghiêm ");
        }else {
            System.out.println("phương trình vô nghiêm");
        }
    }
}
