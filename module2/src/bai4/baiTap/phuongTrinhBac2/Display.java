package bai4.baiTap.phuongTrinhBac2;

import java.util.Scanner;

public class Display {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào số a: ");
        int a=scanner.nextInt();
        System.out.println("nhâp vào số b: ");
        int b=scanner.nextInt();
        System.out.println("nhập váo số c: ");
        int c=scanner.nextInt();
        QuadraticEquation quadraticEquation=new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant()>0){
            double r1=quadraticEquation.getRoot1();
            System.out.println("nghiệm thứ nhất là: " +r1);
            double r2=quadraticEquation.getRoot2();
            System.out.println("nghiệm thứ 2 là: "+r2);
        }else if (quadraticEquation.getDiscriminant()==0){
            double r=-b/(2*a);
            System.out.println("phương trình có nghiệm kép : r1=r2="+r);
        }else {
            System.out.println("phương trình vô nghiệm");
        }


    }
}
