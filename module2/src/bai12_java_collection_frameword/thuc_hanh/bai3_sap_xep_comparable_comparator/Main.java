package bai12_java_collection_frameword.thuc_hanh.bai3_sap_xep_comparable_comparator;

import sun.management.Agent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student0=new Student("Kien",30,"HT");
        Student student1=new Student("Nam",26,"HN");
        Student student2=new Student("Anh",38,"HT");
        Student student3=new Student("Tung",38,"HT");
        List<Student> list=new ArrayList<Student>();
        list.add(student0);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        for (Student student : list){
            System.out.println(student.toString());
        }
        System.out.println("sắp xép theo tuổi");
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });
        for (Student student:list){
            System.out.println(student);
        }

    }
}
