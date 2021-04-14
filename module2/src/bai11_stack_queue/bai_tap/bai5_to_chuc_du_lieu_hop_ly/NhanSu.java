package bai11_stack_queue.bai_tap.bai5_to_chuc_du_lieu_hop_ly;

import java.util.Collection;
import java.util.Comparator;

public class NhanSu<E> {
    String name;
    String gender;
    String birthDay;
    NhanSu(){}
    NhanSu(String name, String gender, String birthDay){
        this.name=name;
        this.gender=gender;
        this.birthDay=birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "NhanSu{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }

//
//    @Override
//    public int compare(NhanSu o1, NhanSu o2) {
//        return o1.getBirthDay().compareTo(o2.getBirthDay());
//    }


}
