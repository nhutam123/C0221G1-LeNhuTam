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
                    arrayList = IOFunction.readFile(PATH_FILE);
                    showServices(arrayList);
                    break;
                case 3:
                    Customer customer=new Customer();
                    customer.inputCustomer();
                    listCustomer.add(customer);
                    //IOFunction.writeFile(DATA_CUSTUMER, listCustomer);
                    IOFunction ioFunction=new IOFunction();
                    break;
                case 4:
                    ArrayList<String> arrayListCustomer;
                    arrayListCustomer = IOFunction.readFile(DATA_CUSTUMER);
                    for (int i = 0; i < arrayListCustomer.size(); i++) {
                        System.out.println(arrayListCustomer.get(i));
                    }
                    break;
                case 5:
                   ArrayList<String> list=IOFunction.readFile(DATA_CUSTUMER);
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
                    arrayList1 = IOFunction.readFile(PATH_FILE);
                    switch (choose2) {
                        case 1:
                            System.out.println("danh sach Villa: ");
                            ShowFunction.showVilla(arrayList1);
                            break;
                        case 2:
                            System.out.println("danh sach House: ");
                            ShowFunction.showHouse(arrayList1);
                            break;
                        case 3:
                            System.out.println("danh sach Room: ");
                            ShowFunction.showRoom(arrayList1);
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
                    System.out.println("nhập tên nhân viên muốn tìm kiếm: ");
                    String name1=scanner.nextLine();
                    ArrayList<String> employeeList=IOFunction.readFile("src/data/Employee");
                   searchEmployee(employeeList,name1);
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
        IOFunction.writeFile(PATH_FILE, list);


    }



    public void showServices(ArrayList<String> arrayList) {
        int choose = 0;
        do {
            ShowFunction.showMenuServices();
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("danh sach Villa: ");
                    ShowFunction.showVilla(arrayList);
                    break;
                case 2:
                    System.out.println("danh sach House: ");
                    ShowFunction.showHouse(arrayList);
                    break;
                case 3:
                    System.out.println("danh sach Room: ");
                    ShowFunction.showRoom(arrayList);
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
    public void searchEmployee(List<String> list,String name){
        System.out.println("nhập tên nhân viên muốn tìm kiếm: ");
        for (int i=0;i<list.size();i++){
            if (list.get(i).split(",")[0].equals(name)){
                System.out.println(list.get(i));
            }else {
                System.out.println("không tìm thấy nhân viên: ");
            }
        }

    }

}

