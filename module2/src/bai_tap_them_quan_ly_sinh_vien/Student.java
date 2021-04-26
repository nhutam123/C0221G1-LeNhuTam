package bai_tap_them_quan_ly_sinh_vien;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student<E> extends Person {
    private String id;
    private float averageMark;
    private String email;

    public Student() {
    }

    public Student(String name, String gender, String birthday, String address, String id, float averageMark, String email) {
        super(name, gender, birthday, address);
        this.id = id;
        this.averageMark = averageMark;
        this.email = email;
    }

    public Student(String name, String gender, String birthday, String id, float averageMark, String email) {

    }
    public static void sort(ArrayList<Student> list){
      list.sort(Comparator.comparing(Student::getAverageMark));
    }
    public static void search(String id, ArrayList list){
        for (int i=0;i<list.size();i++){

        }

    }

    public String getId() {
        return id;
    }

    public boolean setId(String id) {
        if (id.length() == 4) {
            this.id = id;
            return true;
        } else {
            return false;
        }

    }

    public float getAverageMark() {
        return averageMark;
    }

    public boolean setAverageMark(float averageMark) {
        if (averageMark >= 0 && averageMark <= 10) {
            this.averageMark = averageMark;
            return true;
        } else {
            return false;
        }

    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {

        return "Student{" +
                "id='" + id + '\'' +
                ", averageMark=" + averageMark +
                ", email='" + email + '\'' +super.toString()+
                '}'+"\n";


    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        System.out.println("nhap id : ");
        while (true) {
            String id = scanner.nextLine();
            boolean check = setId(id);
            if (check) {
                break;
            }else {
                System.out.println("id phai co 4 ky tu: ");
            }
        }
        System.out.println("nhap diem trung binh: ");
        while (true) {
            float average = Float.parseFloat(scanner.nextLine());
            boolean check = setAverageMark(average);
            if (check) {
                break;
            }
        }
        System.out.println("nhap vao email");
        while (true) {
            String email = scanner.nextLine();
            boolean check = setEmail(email);
            if (check) {
                break;
            }

        }
    }

    @Override
    public void showInfo() {
        super.toString();
        toString();
    }

}
