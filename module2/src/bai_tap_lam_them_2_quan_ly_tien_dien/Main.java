package bai_tap_lam_them_2_quan_ly_tien_dien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Custumer> arrayList = new ArrayList<>();
        int choose = 0;
        do {
            showMenu();
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("bạn đã nhập sai");
            }
            switch (choose) {
                case 1:
//                    Custumer custumer = new VietNamCustumer();
//                    custumer.input();
//                    arrayList.add(custumer);
                    addCustomer(arrayList);
                    writeFile("src/bai_tap_lam_them_2_quan_ly_tien_dien/data", arrayList);

                    break;
                case 2:
                    ArrayList list = readFile("src/bai_tap_lam_them_2_quan_ly_tien_dien/data");
                    System.out.println(list.toString());
                    break;
                case 3:
                    System.out.println("nhập id khách hàng cần tìm: ");
                    String id = scanner.nextLine();
                    search(id, "src/bai_tap_lam_them_2_quan_ly_tien_dien/data");
                    break;
                case 4:
                    System.out.println("nhập id càn tim ");
                    String id1 = scanner.nextLine();
                    ArrayList<String> list1 = readFile("src/bai_tap_lam_them_2_quan_ly_tien_dien/data");
                    for (int i = 0; i < list1.size(); i++) {

                        if (list1.get(i).split(",")[0].equals(id1)) {
                            try {
                                String string = list1.get(i);
                                String[] array = string.split(",");
                                VietNamCustumer custumer1;

                                custumer1 = new VietNamCustumer(array[0], array[1], array[2], Integer.parseInt(array[3]));

                                VietNamCustumer.BillVietNam billVietNam = new VietNamCustumer.BillVietNam();
                                billVietNam.inputBill(custumer1);
                                System.out.println(billVietNam.toString());
                                break;
                            } catch (Exception e) {
                                e.getMessage();
                            }
                        }
                    }
                case 5:
            }

        } while (choose != 7);


    }
    public static   void addCustomer(List list){
        Custumer custumer = new VietNamCustumer();
        custumer.input();
        list.add(custumer);
    }

    public static void writeFile(String pathFile, ArrayList list) {
        try {
            FileWriter writer = new FileWriter(pathFile);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            String line = "";
            for (int i = 0; i < list.size(); i++) {
                line = list.get(i).toString();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            writer.close();

        } catch (Exception e) {
           e.getMessage();
        }

    }

    public static ArrayList<String> readFile(String pathFile) {
        ArrayList<String> list = new ArrayList();
        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.split(",").length==4){
                    //khởi tạo đối tượng;
                    //add đối tượng vào list để khi in ra ta gọi hàm showInfo thông qua đối tượng
                }
                list.add(line);

            }
        } catch (FileNotFoundException e) {
            System.out.println("khong tim thay file");
        } catch (Exception e) {
            e.getMessage();
        }

        return list;
    }


//    public static void showInfo(ArrayList list) {
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).toString());
//        }
//    }

    public static void search(String id, String pathFile) {
        ArrayList<String> list = readFile(pathFile);
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).split(",")[0].equals(id)) {
                System.out.println(list.get(i).toString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("không tìm thấy khách hàng ");
        }
    }

    public static void showMenu() {
        System.out.println("Chọn chức năng:\n" +
                "1. Thêm mới khách hàng.\n" +
                "2. Hiện thị thông tin khách hàng\n" +
                "3. Tìm kiếm khách hàng\n" +
                "4. Thêm mới hóa đơn\n" +
                "5. Chỉnh sửa hóa đơn\n" +
                "6. Hiện thị thông  tin chi tiết hóa đơn\n" +
                "7. Thoát");

    }

}
