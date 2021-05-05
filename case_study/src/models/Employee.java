package models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {
    public static final String DATA_EMPLOYEE = "src/data/Employee";
    private String name;
    private int age;
    private String address;

    public Employee() {
    }

    public Employee(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public Map<Integer,Employee> getEmployee(){
        List<String> list;
        list=readFile(DATA_EMPLOYEE);
        Map<Integer,Employee> map=new HashMap<>();
        String[] array=new String[3];
        int id=1;
        for (int i=0;i<list.size();i++){
            array=list.get(i).split(",");
            String name=array[0];
            int age=Integer.parseInt(array[1]);
            String address=array[2];
            Employee employee=new Employee(name,age,address);
            map.put(id++,employee);
        }
        return map;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return
               name +
                "," + age +
                "," + address
               ;
    }
    public String showInfo(){
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
