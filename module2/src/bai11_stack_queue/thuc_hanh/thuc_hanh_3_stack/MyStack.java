package bai11_stack_queue.thuc_hanh.thuc_hanh_3_stack;

import bai11_stack_queue.thuc_hanh.thuc_hanh_2.Node;

public class MyStack {
    int arrayOfNumber[];
    int size;
    int index=0;
    MyStack(int size){
        this.size=size;
        arrayOfNumber=new int[size];
    }
    public void push(int element){
        if (isFull()){
            throw new StackOverflowError("Stack is full ");

        }
        arrayOfNumber[index]=element;
        index++;
    }
    public int pop(){
        if (isEmpty()){
            throw new  StackOverflowError("Stack is Empty");
        }
        int element = arrayOfNumber[index-1];
        arrayOfNumber[index]=0;
        size--;
        return element;
    }
    public boolean isFull(){
        if(index==size){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if (index==0){
            return true;
        }else
            return false;
    }
    public int size(){
        return index;
    }
}
