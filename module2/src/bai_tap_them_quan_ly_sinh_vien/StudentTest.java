package bai_tap_them_quan_ly_sinh_vien;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class StudentTest<E> {
    static void showMenu(){
            System.out.println("chọn chức năng: ");
            System.out.println(
                    "1. nhập vào n sinh viên:\n" +
                    "2. hiển thị thông tin tất cả sinh viên:\n" +
                    "3. hiển thị sinh viên có điểm trung bình cao nhất và thấp nhât:\n" +
                    "4. tìm kiếm sinh viên theo mã sinh viên:\n" +
                    "5. hiển thị tất cả sinh viên theo thứ tự bảng chữ cái :\n" +
                    "6. hiển thị tất cả sinh viên được học bổng:\n" +
                    "7. thoát\n");

            }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choose;
        ArrayList<Student> arrayList=new ArrayList<>();
        Student student;
        try {
            do {
                showMenu();
                choose=Integer.parseInt(scanner.nextLine());
                switch (choose){
                    case 1:
                        System.out.println("nhap so luong sinh vien: ");
                        int n=Integer.parseInt(scanner.nextLine());
                        for (int i=0;i<n;i++){
                            student=new Student();
                            student.inputInfo();
                            arrayList.add(student);
                        }
                        break;
                    case 2:
                        System.out.println(arrayList);
                        break;
                    case 3:
                        Student.sort(arrayList);
                        System.out.println("sinh vien co diem cao nhat la: ");
                        System.out.println(arrayList.get(arrayList.size()-1));
                        System.out.println("sinh vien co diem thap naht la: ");
                        System.out.println(arrayList.get(0));
                        break;
                    case 4:
                        int count=0;

                        String id=scanner.nextLine();
                        for (Student student1:arrayList){
                            if (student1.getId().equals(id)){
                                System.out.println(student1);
                                count++;
                            }
                        }
                        if (count==0){
                            System.out.println("khong co sinh vien : ");
                        }

                        break;
                    case 5:
                        arrayList.sort(Comparator.comparing(Student::getName));
                        System.out.println(arrayList);

                        break;
                    case 6:
                        arrayList.sort(Comparator.comparing(Student::getAverageMark));
                        for (Student student2:arrayList){
                            if (student2.getAverageMark()>=8){
                                System.out.println(student2);
                            }
                        }
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("ban nhap thong tin khong dung");
                }
            }while (choose !=7);

        }catch (Exception e){
            System.out.println("ban da nhap sai lua chon: ");
        }





    }
}
