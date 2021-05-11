package bai_thi.controllers;

import bai_thi.models.DanhBa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    public static final String PATH_FILE = "src/bai_thi/data/danhBa";
    public static final String CONTACTS_CSV = "data/contacts.csv";
    Scanner scanner = new Scanner(System.in);

    public void display() {
        List<DanhBa> list = new ArrayList<>();
        int choose = 0;
        do {
            showMenu();
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Nhập sai lựa chọn rồi");
            }

            switch (choose) {
                case 1:
                    showDirectory();
                    break;
                case 2:
                    DanhBa danhBa = new DanhBa();
                    danhBa.input();
                    list.add(danhBa);
                    IOFunction.writeFile(PATH_FILE, list);
                    break;
                case 3:
                    System.out.println("Nhập số điện thoại muốn cập nhật: ");
                    String number = scanner.nextLine();
                    List<String> stringList = IOFunction.readFile(PATH_FILE);
                    update(stringList, number);

                    break;
                case 4:
                    System.out.println("nhập tên danh bạ cần xóa: ");
                    String inputName = scanner.nextLine();
                    delete(inputName, PATH_FILE);
                    break;
                case 5:
                    List<String> list1 = IOFunction.readFile(PATH_FILE);
                    System.out.println("nhập tên danh bạ cần tìm kiếm: ");
                    String name = scanner.nextLine();
                    searchDirectory(list1, name);
                    break;
                case 6:
                    IOFunction.readFile(CONTACTS_CSV);
                    break;
                case 7:
                    IOFunction.writeFile(CONTACTS_CSV, list);
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Nhập chưa đúng");
            }

        } while (choose != 8);


    }

    public static void showMenu() {
        System.out.println("chọn chức năng theo số: \n" +
                "1. xem danh sách:\n" +
                "2. thêm mới:\n" +
                "3.cập nhật:\n" +
                "4. xóa:\n" +
                "5.tìm kiếm:\n" +
                "6.đọc từ file:\n" +
                "7.ghi vào file:\n" +
                "8. thoát");
    }

    public static void showDirectory() {
        List<String> list = IOFunction.readFile(PATH_FILE);
        for (int i = 0; i < list.size(); i++) {
            String[] array = new String[5];
            array = list.get(i).split(",");
            DanhBa danhBa1 = new DanhBa(array[0], array[1], array[2], array[3], array[4]);
            System.out.println(danhBa1.showInfo());
        }
    }

    public void delete(String name, String pathFile) {
        List<String> list = IOFunction.readFile(PATH_FILE);
        List<DanhBa> danhBas = new ArrayList<>();
        int count = 0;
        System.out.println("bạn có muốn xóa đối tượng trên không: \n" +
                "1. ok\n" +
                "2. cancel");
        int choose = 0;
        try {
            choose = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            e.getMessage();
        }
        if (choose == 1) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).split(",")[0].equals(name)) {
                    list.remove(list.get(i));
                    count++;
                }
            }
            for (int i = 0; i < list.size(); i++) {
                String[] array = new String[5];
                array = list.get(i).split(",");
                DanhBa danhBa = new DanhBa(array[0], array[1], array[2], array[3], array[4]);
                danhBas.add(danhBa);
            }
            IOFunction.writeFile(PATH_FILE, danhBas);
            if (count == 0) {
                System.out.println("không tìm thấy : ");
            }
        }
    }

    public void searchDirectory(List<String> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).split(",")[0].equals(name)) {
                System.out.println(list.get(i));
            } else {
                System.out.println("không tìm thấy danh bạ trên: ");
            }
        }

    }

    public void update(List<String> list, String phoneNumber) {
        int count = 0;
        List<DanhBa> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).split(",")[1].equals(phoneNumber)) {
                DanhBa danhBa = new DanhBa();
                danhBa.input();
                String string = danhBa.toString();
                System.out.println(list.set(i, string));
                count++;

            }

        }
        for (int j = 0; j < list.size(); j++) {
            String[] array = new String[5];
            array = list.get(j).split(",");
            DanhBa danhBa1 = new DanhBa(array[0], array[1], array[2], array[3], array[4]);
            list1.add(danhBa1);
            IOFunction.writeFile(PATH_FILE, list1);
        }
        if (count == 0) {
            System.out.println("không tìm thấy danh bạ trên: ");
        }

    }


}
