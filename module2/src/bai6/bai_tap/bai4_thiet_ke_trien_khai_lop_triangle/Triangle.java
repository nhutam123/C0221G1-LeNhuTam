package bai6.bai_tap.bai4_thiet_ke_trien_khai_lop_triangle;

import java.util.Scanner;

public class Triangle extends Shape {
    private float side1=1.0f;
    private float side2=1.0f;
    private float side3=1.0f;
    Triangle(){}
    Triangle(float side1,float side2,float side3,String color,Boolean filled){
        super(color,filled);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    private float getSide1(){
        return this.side1;
    }
    private void setSide1(float side1){
        this.side1=side1;
    }
    private float getSide2(){
        return  this.side2;
    }
    private void setSide2(float side2){
        this.side2=side2;
    }
    private float getSide3(){
        return  this.side3;
    }
    private void setSide3(float side3){
        this.side3=side3;
    }
    private  float getPerimeter(){
        return side1+side2+side3;
    }
    private float getArea(){
        float p=getPerimeter()/2;
        return (float)Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}'
                +super.toString();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập độ dài cạnh thứ nhất của tam giác");
        float side1=Float.parseFloat(scanner.nextLine());
        System.out.println("nhập độ dài cạnh thứ hai của tam giác");
        float side2=Float.parseFloat(scanner.nextLine());
        System.out.println("nhâp vào độ dài cạnh thứ 3 của tam giác");
        float side3=Float.parseFloat(scanner.nextLine());
        System.out.println("nhập vào màu sắc cho hình tam giác");
        String color=scanner.nextLine();
        boolean filled=true;
        Triangle triangle=new Triangle(side1,side2,side3,color,filled);
        System.out.println(triangle.toString());
    }
}
