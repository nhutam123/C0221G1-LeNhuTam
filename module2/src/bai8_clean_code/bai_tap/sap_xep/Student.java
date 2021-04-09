package bai8_clean_code.bai_tap.sap_xep;

import java.util.Arrays;

public class Student implements Comparable<Student>{
    String name ;
    int age;
    Student(){};
    Student(String name, int age){
        this.name=name;
        this.age=age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student[] students=new Student[3];
        students[0]=new Student("tam",12);
        students[1]=new Student("dep",13);
        students[2]=new Student("am",14);
        Arrays.sort(students);
        for (Student student:students){
            System.out.println(student);
        }
    }


    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.getName());
    }
}
