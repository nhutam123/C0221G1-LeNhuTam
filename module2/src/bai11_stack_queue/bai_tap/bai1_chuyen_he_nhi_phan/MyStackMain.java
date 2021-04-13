package bai11_stack_queue.bai_tap.bai1_chuyen_he_nhi_phan;

import java.util.Scanner;

public class MyStackMain {
    public static void main(String[] args) {
        MyStack myStack=new MyStack(10);
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("NHẬP số vào stack " );
            int firstNumber=scanner.nextInt();
            myStack.push(firstNumber%2);
        }while (myStack.index!=myStack.side());
        for (int i=0;i<myStack.side();i++){
            System.out.print(myStack.arrayOfMyStack[i]);
        }

    }
}
