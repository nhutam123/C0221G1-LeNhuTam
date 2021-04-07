package bai5.thuc_hanh.thucHanh4;

public class CheckPerson {
    CheckPerson(String name){}
    CheckPerson person=new CheckPerson("tam");

    public static void main(String[] args) {
        Person newPerson=new Person("tien");
        System.out.println(newPerson.getName());
        newPerson.setName("tình");
        System.out.println(newPerson.getName());
    }


}
