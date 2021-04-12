package bai10_list.bai_tap.bai2;



public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList elements=new MyLinkedList();
        elements.addFirst(12);
        elements.addLast(5);
        elements.addLast(5);
        elements.printList();
        System.out.println("add");
        elements.add1(1,2);
        elements.printList();
        System.out.println("get");
        System.out.println(elements.get(2));
        System.out.println(elements.getFirst());
        System.out.println(elements.getLast());
        System.out.println("remove");
        System.out.println(elements.remove(1));
        System.out.println("list");
        elements.printList();

    }
}
