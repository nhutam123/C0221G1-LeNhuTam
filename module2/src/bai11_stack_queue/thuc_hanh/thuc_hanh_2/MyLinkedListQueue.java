package bai11_stack_queue.thuc_hanh.thuc_hanh_2;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;
    public MyLinkedListQueue(){
        this.head=null;
        this.tail=null;
    }
    public void enqueue(int key){
        Node element=new Node(key);
        if (this.tail==null){
            this.head=this.tail=element;
            return;
        }
        this.tail.next=element;
        this.tail=element;
    }
    public Node dequeue(){
        if (this.head==null)
            return null;
            Node element=this.head;
            this.head=this.head.next;

        if (this.head==null)
            this.tail=null;
            return element;


    }
}
