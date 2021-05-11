package CaseStudy.controllers;

import CaseStudy.models.Services;
import CaseStudy.models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    public static final String PATH_FILE = "src/CaseStudy/data/data";

    List<Services> servicesList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        int choose;
        do {
            System.out.println("1. Add New Services\n" +
                    "2.Show Services\n" +
                    "3.Add New Customer\n" +
                    "4.Show Information of Customer\n" +
                    "5.Add New Booking\n" +
                    "6.Show Information of Employee\n" +
                    "7.Exit");
             choose = Integer.parseInt(scanner.nextLine());
            CURDFunction curdFunction=new CURDFunction();

            switch (choose) {
                case 1:
                    curdFunction.addSeviceMenu();
                    break;
                case 2:
                    curdFunction.showServices();
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
        }while (choose!=7);
    }
}
