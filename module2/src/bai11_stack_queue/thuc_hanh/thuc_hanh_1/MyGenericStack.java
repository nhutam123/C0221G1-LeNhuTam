package bai11_stack_queue.thuc_hanh.thuc_hanh_1;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;
    public MyGenericStack(){
        stack=new LinkedList<>();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop (){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return  stack.removeFirst();
    }
    public  boolean isEmpty() {
        if (stack.size()==0) {
            return  true;
        }
        return false;
    }
    public int size() {
        return stack.size();
    }
    public static void stackOfIntegers() {
        MyGenericStack<Integer> stack =new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println( "2.1 Size of stack after push operation"+ stack.size());
        System.out.println("2.2 Pop elements from stack");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\\n3.3 Size of stack after pop operations : "+stack.size());
    }
}
