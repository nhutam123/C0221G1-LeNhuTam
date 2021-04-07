package bai4.thuc_hanh;

import java.util.Scanner;

public class DisplayRectangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập chiều rộng hình chữ nhât: ");
        float width=scanner.nextFloat();
        System.out.println("nhập chiều cao hình chữ nhật");
        float height=scanner.nextFloat();
        Rectangle rectangle=new Rectangle(width,height);
        System.out.println(rectangle.display());
        System.out.println("hiện tích hình chữ nhật là: "+rectangle.getArea()+"\n chu vi hình chữ nhật là : "+rectangle.gePerimeter());
    }
}
