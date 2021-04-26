package bai_tap_lam_lem_1_quan_ly_phuong_tien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Vehicle> list = new ArrayList<>();
        int choose = 0;

        do {
            try {
                showMenu();
                choose = Integer.parseInt(input.nextLine());

            } catch (Exception e) {
                System.out.println("bạn đã nhập sai lựa chọn , hãy nhập lại: ");
            }
            switch (choose) {
                case 1:
                    showMenu1();

                    int choos;
                    while (true) {
                        try {
                            choos = Integer.parseInt(input.nextLine());
                            break;
                        } catch (Exception e) {
                            System.out.println("bạn đã nhập sai, hãy nhập lại ");
                        }
                    }

                    switch (choos) {
                        case 1:
                            Vehicle oto = new Oto();
                            oto.inputVehicle();
                            list.add(oto);
                            break;
                        case 2:
                            Vehicle bikecircle = new BikeCircle();
                            bikecircle.inputVehicle();
                            list.add(bikecircle);
                            break;
                        case 3:
                            Vehicle truck = new Truck();
                            truck.inputVehicle();
                            list.add(truck);
                            break;
                        default:
                            System.out.println("bạn nhập sai: ");
                            break;

                    }
                    fileWrite("src/bai_tap_lam_lem_1_quan_ly_phuong_tien/data", list);
                    break;

                case 2:
                    System.out.println(readFile("src/bai_tap_lam_lem_1_quan_ly_phuong_tien/data"));

                    break;
                case 3:
                    String bienSo = input.nextLine();
                    delete(bienSo);
                    break;

            }

        } while (choose != 4);

    }

    public static void showMenu() {
        System.out.println("Chọn chức năng:\n" +
                "1. Thêm mới phương tiện.\n" +
                "2. Hiện thị phương tiện\n" +
                "3. Xóa phương tiện\n" +
                "4. Thoát");
    }

    public static void showMenu1() {
        System.out.println("chon phuong tien muốn thêm vào: \n" +
                "1. oto\n" +
                "2. truck\n" +
                "3. bikecircle");
    }

    public static void fileWrite(String pathFlie, List list) {
        try {

            FileWriter writer = new FileWriter(pathFlie);
            BufferedWriter bw = new BufferedWriter(writer);
            String line = "";
            for (int i = 0; i < list.size(); i++) {
                line = list.get(i).toString();

                bw.write(line);
                bw.newLine();

            }
            bw.close();
            writer.close();
        } catch (Exception e) {
            System.out.println("t");
            System.out.println(e.getMessage());
        }

    }

    public static ArrayList<String> readFile(String pathFile) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                arrayList.add(line);
            }

        } catch (Exception e) {
            System.out.println("file khong ton tai");
        }
        return arrayList;
    }

    public static void showInfo(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void delete(String licensePlate) {
        ArrayList<String> list;
        int count = 0;
        list = readFile("src/bai_tap_lam_lem_1_quan_ly_phuong_tien/data");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).split(",")[0].equalsIgnoreCase(licensePlate)) {
                list.remove(i);
                count++;
            }

        }
        if (count != 0) {
            Scanner scanner = new Scanner(System.in);
            int choose = 0;
            System.out.println("ạn có muốn xóa :\n" +
                    "1. yes\n" +
                    "2. no");
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("bien kiểm soat khong tồn tại");
            }

            if (choose == 1) {
                fileWrite("src/bai_tap_lam_lem_1_quan_ly_phuong_tien/data", list);
            }
        } else {
            System.out.println("khong co phuong tien can xoa.");
        }


    }

}
