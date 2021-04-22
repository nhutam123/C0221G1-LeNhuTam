package bai15_exception_debug.bai_tap;

import java.util.Scanner;

public class TriAngleException extends Throwable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            try{
                System.out.println("nhập độ dài cạnh đầu tiên : ");
                double firstLine=Double.parseDouble(scanner.nextLine());
                System.out.println("nhập độ dài cạnh thứ hai: ");
                double seconLine=Double.parseDouble(scanner.nextLine());
                System.out.println("nhập độ dài cạnh thứ ba: ");
                double thirtLine=Double.parseDouble(scanner.nextLine());
                illegalTriangleException(firstLine,seconLine,thirtLine);
                break;
            }catch (TriAngleException e){
                System.err.println("độ dài 3 cạnh không phù hợp");
            }catch (NumberFormatException e){
                System.out.println("khong dc nhap chu cai");
            }
        }
        System.out.println("bạn đã nhập chuẩn");

    }
    private static void illegalTriangleException(double a,double b,double c) throws TriAngleException {
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || b + c <= a || a + c <= b) {
            throw new TriAngleException();
        }
    }
}
