package controllers;

import models.*;

import java.io.*;
import java.util.*;
import java.util.jar.JarOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainController<E> {

    public static final String PATH_FILE = "src/data/service";
    public static final String DATA_CUSTUMER = "src/data/Custumer";

    public MainController() {
    }

    public MainController(List list) {
        this.list = list;
    }
    List<Employee> employeeList=new ArrayList<>();
    List<Services> list = new ArrayList<>();
    List<Customer> listCustomer=new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void display() {
        int choose = 0;
        do {
            System.out.println("1. Add New Services\n" +
                    "2.Show Services\n" +
                    "3.Add New Customer\n" +
                    "4.Show Information of Customer\n" +
                    "5.Add New Booking\n" +
                    "6.Show Information of Employee\n" +
                    "7.mua vé xem phim\n"+
                    "8.tìm kiếm hồ sơ nhân viên\n"+
                    "9.Exit");
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("t");
            }


            switch (choose) {
                case 1:
                    addNewService();
                    break;
                case 2:
                    ArrayList<String> arrayList ;
                    arrayList = readFile(PATH_FILE);
                    showServices(arrayList);
                    break;
                case 3:
                    Customer customer=new Customer();
                    customer.inputCustomer();
                    listCustomer.add(customer);
                    writeFile(DATA_CUSTUMER, listCustomer);
                    break;
                case 4:
                    ArrayList<String> arrayListCustomer;
                    arrayListCustomer = readFile(DATA_CUSTUMER);
                    for (int i = 0; i < arrayListCustomer.size(); i++) {
                        System.out.println(arrayListCustomer.get(i));
                    }
                    break;
                case 5:
                   ArrayList<String> list=readFile(DATA_CUSTUMER);
                   for (int i=0;i<list.size();i++){
                       System.out.print(i+1+",");
                       System.out.println(list.get(i));
                   }
                    System.out.println("hãy chọn khách hàng cần booking: ");
                   int choose1=Integer.parseInt(scanner.nextLine());
                    System.out.println("chọn dịch vụ: \n"+
                            "1.Booking Villa\n" +
                            "2.Booking House\n" +
                            "3.Booking Room");
                    int choose2=Integer.parseInt(scanner.nextLine());
                    ArrayList<String> arrayList1 ;
                    arrayList1 = readFile(PATH_FILE);
                    switch (choose2) {
                        case 1:
                            System.out.println("danh sach Villa: ");
                            showVilla(arrayList1);
                            break;
                        case 2:
                            System.out.println("danh sach House: ");
                            showHouse(arrayList1);
                            break;
                        case 3:
                            System.out.println("danh sach Room: ");
                            showRoom(arrayList1);
                            break;
                    }
                    break;
                case 6:
                    Employee employee=new Employee();
                    Map<Integer,Employee> map=employee.getEmployee();

                    for (Map.Entry<Integer,Employee> entry : map.entrySet()){
                        System.out.println(entry.getKey()+" "+entry.getValue());
                    }

                    break;
                case 7:
                    int count=0;
                    int choose7;
                   String name;
                   Queue<String> queue=new ArrayDeque<>();
                  do{
                      System.out.println("hãy chon\n" +
                              "1.mua vé:\n" +
                              "2.thoát:");
                       choose7=Integer.parseInt(scanner.nextLine());
                      switch (choose7){
                          case 1:
                              System.out.println("nhập tên khách hàng muốn mua vé: ");
                              name=scanner.nextLine();
                              queue.add(buyTicket(name));
                              System.out.println(queue);
                              count++;
                              break;
                          case 2:
                              choose7=2;
                              break;
                      }
                      if(count==5){
                          System.out.println("da het ve: ");
                      }


                   }while (count !=5&& choose7 !=2);
                    break;

                case 8:
                    int count1=0;
                    System.out.println("nhập tên nhân viên muốn tìm kiếm: ");
                    String name1=scanner.nextLine();
                    Stack<String> stack=new Stack<>();
                    ArrayList<String> employeeList=readFile("src/data/Employee");
                    for (int i=0;i<employeeList.size();i++){
                        stack.push(employeeList.get(i));
                    }
                    for (int i=0;i<stack.size();i++){
                        if(stack.get(i).split(",")[0].equals(name1)){
                            System.out.println(stack.get(i));
                            count1++;
                        }
                    }
                    if (count1==0){
                        System.out.println("không tìm thấy nhân viên: ");
                    }

                    break;
                case 9:
                    break;
            }
        } while (choose != 9);
    }


    public void addNewService() {
        System.out.println("nhập dịch vụ muốn thêm vào");
        System.out.println(
                "1.Add New Villa\n" +
                        "2.Add New House\n" +
                        "3.Add New Room\n" +
                        "4.Back to menu\n" +
                        "5.Exit");
        int choos = Integer.parseInt(scanner.nextLine());
        switch (choos) {

            case 1:
                Services villa = new Villa();
                villa.input();
                list.add(villa);
                break;
            case 2:
                Services house = new House();
                house.input();
                list.add(house);
                break;
            case 3:
                Services room = new Room();
                room.input();
                list.add(room);
                break;
            case 4:
                display();
                break;
            case 5:
                break;
        }
        writeFile(PATH_FILE, list);


    }


    public void writeFile(String pathFile, List list) {
        try {
            FileWriter fileWriter = new FileWriter(pathFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (int i = 0; i < list.size(); i++) {
                line = list.get(i).toString();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("t");
        }


    }

    public ArrayList<String> readFile(String pathFile) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            File file = new File(pathFile);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                // tạo đối tượng để add list đối tượng ở đây;
                arrayList.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("không tìm thấy file");
        } catch (Exception e) {
            System.out.println("t");
        }
        return arrayList;
    }

    public void showServices(ArrayList<String> arrayList) {
        int choose = 0;
        do {
            showMenuServices();
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("danh sach Villa: ");
                    showVilla(arrayList);
                    break;
                case 2:
                    System.out.println("danh sach House: ");
                    showHouse(arrayList);
                    break;
                case 3:
                    System.out.println("danh sach Room: ");
                    showRoom(arrayList);
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
            }
        } while (choose != 8);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).toString());
        }
    }

    public void showVilla(ArrayList<String> arrayList) {

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).split(",").length == 10) {
                System.out.println(arrayList.get(i));
            }
        }


    }

    public void showHouse(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).split(",").length == 9) {
                System.out.println(arrayList.get(i));
            }
        }

    }

    public void showRoom(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).split(",").length == 7) {
                System.out.println(arrayList.get(i));
            }
        }

    }

    public void showMenuServices() {
        System.out.println("1.Show all Villa\n" +
                "2.Show all House\n" +
                "3.Show all Room\n" +
                "4.Show All Name Villa Not Duplicate\n" +
                "5.Show All Name House Not Duplicate\n" +
                "6.Show All Name Name Not Duplicate\n" +
                "7.Back to menu\n" +
                "8.Exit");
    }

    public static boolean regexInput(String regex, String string) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
//          return string.matches(regex);
    }
    public  String buyTicket(String name){
        Queue queue=new ArrayDeque(5);
        if (queue.size()<=5){
            queue.add(name);
        }else {
            System.out.println("đã hết vé: ");
        }
        return name;


    }
    public void searchEmployee(ArrayList<String> list){
        System.out.println("nhập tên nhân viên muốn tìm kiếm: ");
        String name=scanner.nextLine();
        for (int i=0;i<list.size();i++){
            if (list.get(i).split(",")[0].equals(name)){
                System.out.println(list.get(i));
            }else {
                System.out.println("không tìm thấy nhân viên: ");
            }
        }

    }

}

