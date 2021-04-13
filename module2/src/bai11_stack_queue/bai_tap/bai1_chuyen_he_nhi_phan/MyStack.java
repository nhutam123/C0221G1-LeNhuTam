package bai11_stack_queue.bai_tap.bai1_chuyen_he_nhi_phan;

public class MyStack {
    int arrayOfMyStack[];
    int capacity;
    int index=0;
    MyStack(int size){
        this.capacity=size;
        arrayOfMyStack=new int [size];
    }
    public void push(int element){
        if (isFull()){
            System.out.println("stack is full");
        }else {
            arrayOfMyStack[index]=element;
            index++;
        }

    }
    public int side(){
        return capacity;
    }
    boolean isFull(){
        if (index==capacity){
            return true;
        }
        return false;
    }

}
