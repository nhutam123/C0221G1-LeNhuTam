package bai11_stack_queue.bai_tap.bai2_Kiem_tra_chuoi_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class MyStack<E> {
    public static void main(String[] args) {
        Stack<Character> stack=new Stack<Character>();
        Queue<Character> queue=new LinkedList<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào chuỗi cần kiểm tra");
        String string=scanner.nextLine();
        int length=string.length();
            for (int i=0;i<length;i++){
                if(i<=length/2){
                    stack.push(string.charAt(i));
                }
                if (i>=length/2) {
                    queue.add(string.charAt(i));
                }
            }
            boolean check=true;
            for (int i=0; i<=length/2;i++){
                if(stack.pop()!=queue.remove()){
                    check=false;
                    break;
                }
            }
            if (check){
                System.out.println("là chuoi palindorome");
            }else {
                System.out.println("khong phải");
            }



    }



}
