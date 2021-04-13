package bai11_stack_queue.thuc_hanh.thuc_hanh_2;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<Integer>();
        queue.add(10);
        queue.add(9);
       // queue.enqueue(8);
       // queue.enqueue(7);
        queue.add(12);
      //  queue.dequeue();
        queue.add(30);
        queue.add(40);
        queue.add(59);
        System.out.println("Dequued item is "+queue.remove());
        for (Integer s :queue){
            System.out.println(s);
        }
    }
}
