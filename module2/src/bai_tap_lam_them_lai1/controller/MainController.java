package bai_tap_lam_them_lai1.controller;

import bai_tap_lam_them_lai1.models.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    public static void display(){
        Scanner scanner=new Scanner(System.in);
        List<Vehicle> list=new ArrayList<>();
        int choose=0;
        do {
            showMenu();
            try{
                choose=Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                e.getMessage();
            }

            switch (choose){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
            }

        }while (choose!=4);


    }
    public static void showMenu(){
        System.out.println("Chọn chức năng:\n" +
                "1. Thêm mới phương tiện.\n" +
                "2. Hiện thị phương tiện\n" +
                "3. Xóa phương tiện\n" +
                "4. Thoát");
    }
}
