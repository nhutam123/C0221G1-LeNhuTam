package bai10_list.bai_tap.bai2;



public class MyLinkedList<E> {

   private class Node {
       protected Node next;
       private Object element;
       public Node(Object element){
           this.element=element;
       }
       public Object getElement(){
           return this.element;
       }
   }
   private Node head;
   private Node tail;
    private  int numNodes;
    int side=0;
    MyLinkedList(){}
    public void add(int index,E element){

    }
    public void addFirst(E element){
        Node newNode=new Node (element);
        newNode.next=head;
        head=newNode;
        side++;
    }
    public void addLast(E element){
       Node temp=head;
       while (temp.next!=null){
           temp=temp.next;
       }
       temp.next=new Node(element);
        side++;

    }
    public void add1(E element, int index){
        Node nodeBeforeElement = head;
        Node holder;
        for (int i = 0; i<index-1 && nodeBeforeElement.next!=null; i++){
            nodeBeforeElement = nodeBeforeElement.next;
        }
        holder= nodeBeforeElement.next;
        nodeBeforeElement.next=new Node(element);
        nodeBeforeElement.next.next=holder;
        side++;
    }
    E get(int index){
        Node element=head;
        for (int i=0;i<index;i++){
            element=element.next;
        }
        return (E) element.element;
    }
    E getFirst(){
        Node element=head;
        return (E) element.element;
    }
    E getLast(){
        Node element=head;
         for (int i=0;i<side-1;i++){
             element=element.next;
     }
        return (E) element.element;

    }
    E remove(int index){
        Node node=head;
        for (int i=0;i<index-1;i++){
            node=node.next;
        }
        node.next=node.next.next;
        return (E) node.next.element;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.element);
            temp = temp.next;
        }
    }
}
