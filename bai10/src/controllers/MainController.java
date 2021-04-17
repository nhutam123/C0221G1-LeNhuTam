package controllers;

import models.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    public MainController() {
    }

    public MainController(List list) {
        this.list = list;
    }

    List list=new ArrayList();
    Scanner scanner=new Scanner(System.in);
    public void display(){
        System.out.println("1. Add New Services\n" +
                "2.Show Services\n" +
                "3.Add New Customer\n" +
                "4.Show Information of Customer\n" +
                "5.Add New Booking\n" +
                "6.Show Information of Employee\n" +
                "7.Exit");
        int choose=Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                addNewService();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
    }
    public void addNewService(){
        System.out.println("nhập dịch vụ muốn thêm vào");
        System.out.println("1.Add New Villa\n" +
                "2.Add New House\n" +
                "3.Add New Room\n" +
                "4.Back to menu\n" +
                "5.Exit");
        int choose=Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }



    }
    public void ShowService(){
        System.out.println(list);
    }
}
