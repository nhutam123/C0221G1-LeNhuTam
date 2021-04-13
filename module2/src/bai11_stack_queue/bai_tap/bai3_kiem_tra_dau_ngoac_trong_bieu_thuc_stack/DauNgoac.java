package bai11_stack_queue.bai_tap.bai3_kiem_tra_dau_ngoac_trong_bieu_thuc_stack;

import java.util.Scanner;
import java.util.Stack;

public class DauNgoac {
    public static void main(String[] args) {
        Stack stackLeft=new Stack();
        Stack stackRight=new Stack();
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập biểu thức vào;" );
        String string=scanner.nextLine();
        int length=string.length();
        boolean check=true;
        for (int i=0;i<length;i++){
            if (string.charAt(i)=='('){
                stackLeft.push(string.charAt(i));
            }
            if ( !stackLeft.empty() && string.charAt(i)==')'){
                stackRight.push('(');
            }

        }
        if (stackLeft.empty()){
            check=false;
        }else if (stackLeft.size()==stackRight.size()){
            check=true;
        }else {
            check=false;
        }
        System.out.println(check);
    }



}
