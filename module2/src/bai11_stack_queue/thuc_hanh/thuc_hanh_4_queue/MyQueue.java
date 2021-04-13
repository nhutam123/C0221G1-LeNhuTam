package bai11_stack_queue.thuc_hanh.thuc_hanh_4_queue;

public class MyQueue {
    int capacity;
    int queueArray[];
    int head=0;
    int tail=-1;
    int currentSize=0;
   protected MyQueue(int queueSize){
        this.capacity=queueSize;
        queueArray=new int[this.capacity];

    }
    public void enQueue(int element){
        if (isQueueFull()){
            System.out.println("overFlow");
        }else {
            tail++;
            if (tail==capacity-1){
                tail=0;
            }
            queueArray[tail]=element;
            currentSize++;
            System.out.println("element "+ element+"is pushed to queue");
        }

    }
    public void dequeue(){
       if (isEmpty()){
           System.out.println(" queue is empty");
       }else {
           head++;
           if (head==capacity-1){
               System.out.println("pop operation done ! remove: " +queueArray[head-1]);
               head=0;
           }
           else {
               System.out.println("ttt");
           }
           currentSize--;
       }
    }
    boolean isQueueFull(){
        if (currentSize==capacity){
            return true;
        }
        return false;
    }
    boolean isEmpty(){
        if (currentSize==0){
            return true;
        }
        return false;
    }
    int getCurrentSize(){
        return currentSize;
    }
}
