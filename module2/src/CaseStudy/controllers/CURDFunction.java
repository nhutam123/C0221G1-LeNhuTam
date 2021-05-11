package CaseStudy.controllers;

import CaseStudy.models.Services;
import CaseStudy.models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CURDFunction {
    Scanner scanner=new Scanner(System.in);
    List<Services> servicesList = new ArrayList<>();
    public static final String PATH_FILE = "src/CaseStudy/data/data";
    public void showServices() {
        List list = IOFuntion.readFile(PATH_FILE);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void addSeviceMenu() {
        int choosing;
        do {
            System.out.println("chọn dịch vụ cần thêm:\n" +
                    "1. thêm villa:\n" +
                    "2. thêm House:\n" +
                    "3. thêm Room:\n" +
                    "4. về menu  chính:");
            choosing = Integer.parseInt(scanner.nextLine());
            switch (choosing) {
                case 1:
                    Services villa = new Villa();
                    villa.inPut();
                    servicesList.add(villa);
                    IOFuntion.writeFile(PATH_FILE, servicesList);

                    break;
                case 2:

                    break;
                case 3:
                    break;
                case 4:
                    MainController mainController=new MainController();
                    mainController.displayMainMenu();
                    break;
            }

        } while (choosing != 4);


    }
}
