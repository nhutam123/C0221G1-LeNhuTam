package controllers;

import java.util.ArrayList;

public class ShowFunction {


    public static void showVilla(ArrayList<String> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).split(",").length == 10) {
                System.out.println(arrayList.get(i));
            }
        }


    }

    public static void showHouse(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).split(",").length == 9) {
                System.out.println(arrayList.get(i));
            }
        }

    }

    public static void showRoom(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).split(",").length == 7) {
                System.out.println(arrayList.get(i));
            }
        }

    }

    public static void showMenuServices() {
        System.out.println("1.Show all Villa\n" +
                "2.Show all House\n" +
                "3.Show all Room\n" +
                "4.Show All Name Villa Not Duplicate\n" +
                "5.Show All Name House Not Duplicate\n" +
                "6.Show All Name Name Not Duplicate\n" +
                "7.Back to menu\n" +
                "8.Exit");
    }
}
