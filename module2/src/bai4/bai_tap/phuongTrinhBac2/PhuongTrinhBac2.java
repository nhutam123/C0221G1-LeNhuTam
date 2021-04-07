package bai4.baiTap.phuongTrinhBac2;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    double a;
    double b;
    double c;
    double r1;
    double r2;
    PhuongTrinhBac2(){}
    PhuongTrinhBac2(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    double getA(){
        return a;
    }
    double getB(){
        return b;
    }
    double getC(){
        return c;
    }
    double getDelta(){
        return b*b-4*a*c;
    }
    double getR1(){
        return  r1=(-b+Math.sqrt(getDelta()))/(2*a);
    }
    double getR2(){
        return r2=(-b-Math.sqrt(getDelta()))/(2*a);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào số a:");
        double a=scanner.nextDouble();
        System.out.println("nhập vào số b:");
        double b=scanner.nextDouble();
        System.out.println("nhập vào số c:");
        double c=scanner.nextDouble();
        PhuongTrinhBac2 phuongTrinhBac2=new PhuongTrinhBac2(a,b,c);
        if (phuongTrinhBac2.getDelta()>0){
            System.out.println(" phuong trình có 2 nghiệm là r1="+phuongTrinhBac2.getR1()+" r2= "+phuongTrinhBac2.getR2());
        }else if (phuongTrinhBac2.getDelta()==0){
            System.out.println("phương trình có nghiệm kép r1=r2= "+phuongTrinhBac2.getR1());
        }else {
            System.out.println("phuong trình vô nghiệm");
        }

    }
}
