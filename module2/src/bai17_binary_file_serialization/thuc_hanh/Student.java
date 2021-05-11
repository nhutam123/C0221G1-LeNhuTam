package bai17_binary_file_serialization.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable {

    public static final String PATH_FILE = "src/bai17_binary_file_serialization/thuc_hanh/student";

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        writeToFile(PATH_FILE,students);
        List<Student> studentList=readFile(PATH_FILE);
        for (Student student:studentList){
            System.out.println(student);
        }
    }
    private int id;
    private  String name;
    private  String address;

    public Student() {
    }

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public static List<Student> readFile(String pathFile){
        List<Student> studentList=new ArrayList<>();
        try{
            FileInputStream fileInputStream=new FileInputStream(pathFile);
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            studentList=(List<Student>) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        }catch (Exception e){
            e.getMessage();
        }
        return studentList;
    }
    public static void writeToFile(String pathFile, List<Student> list){
        try {
            FileOutputStream fileOutputStream=new FileOutputStream(pathFile);
            ObjectOutputStream outputStream=new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(list);
            outputStream.close();
            fileOutputStream.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
