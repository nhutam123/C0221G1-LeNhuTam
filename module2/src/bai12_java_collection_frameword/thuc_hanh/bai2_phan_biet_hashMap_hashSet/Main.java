package bai12_java_collection_frameword.thuc_hanh.bai2_phan_biet_hashMap_hashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student firstStudent =new Student("nam",20,"HN");
        Student secondStudent =new Student("Hung",21,"HN");
        Student thirtStudent =new Student("Ha",22,"HN");
        Map<Integer,Student> studentMap=new HashMap<Integer, Student>();
        studentMap.put(1,firstStudent);
        studentMap.put(2,secondStudent);
        studentMap.put(3,thirtStudent);
        studentMap.put(4,firstStudent);
        for (Map.Entry<Integer,Student> studentEntry: studentMap.entrySet()){
            System.out.println(studentEntry.toString());
        }
        Set<Student> students=new HashSet<Student>();
        students.add(firstStudent);
        students.add(secondStudent);
        students.add(thirtStudent);
        students.add(firstStudent);
        System.out.println("_________set");
        for (Student student:students){
            System.out.println(student.toString());
        }

    }

}
