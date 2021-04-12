package bai10_list.thuc_hanh.thuc_hanh_2;


public class MyLinkedList {
    private Node head;
    private  int numNodes;
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public  MyLinkedList(Object data){
        head = new Node(data);
    }
    public void add(int index, Object data){
        Node node=head;
        Node holder;
        for (int i = 0; i< index-1 && node.next !=null; i++){
            node = node.next;
        }
        holder= node.next;
        node.next=new Node(data);
        node.next.next=holder;
        numNodes++;
    }
    public void addFirst(Object data){
        Node node=head;
        head=new Node(data);
        head.next= node;
        numNodes++;
    }
    public  Node get(int index){
        Node node=head;
        for (int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public void printList(){
        Node node=head;
        while (node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }

}
