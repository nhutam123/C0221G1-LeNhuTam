package bai_tap_them_quan_ly_sinh_vien;

public class Teacher extends Person {
    private int salary;
    private String classes;
    private int times;
    private int timesInNight;

    public Teacher() {
    }

    public Teacher(String name, String gender, String birthday, String address, int salary, String classes, int times) {
        super(name, gender, birthday, address);
        this.salary = salary;
        this.classes = classes;
        this.times = times;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }
//    public int countSalary(){
//
//    }

    @Override
    public void inputInfo() {
        super.inputInfo();
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }
}
