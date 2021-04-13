package bai11_stack_queue.thuc_hanh.thuc_hanh_3_stack;

public class MyStackClient {
    public static void main(String[] args) {
        MyStack  stack=new MyStack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("size of stack: "+stack.size());
        System.out.println("elment pop "+stack.pop());

    }
}
