package bai11_stack_queue.thuc_hanh.thuc_hanh_4_queue;

public class MyQueueClient {
    public static void main(String[] args) {
        MyQueue myQueue=new MyQueue(10);
        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        myQueue.enQueue(4);
        myQueue.dequeue();
        System.out.println("queue size : "+ myQueue.currentSize);
        //myQueue.dequeue();
        System.out.println("queue size : " +myQueue.currentSize);
        for (int i=0;i<myQueue.currentSize;i++){
            System.out.println(myQueue.queueArray[i]);
        }
    }


}
