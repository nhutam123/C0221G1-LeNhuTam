package bai10_list.thuc_hanh.thuc_hanh_2;

import javax.xml.soap.Node;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("TEST");
        MyLinkedList myLinkedList=new MyLinkedList(10);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);
        myLinkedList.add(4,15);
        myLinkedList.add(4,15);
        myLinkedList.printList();
    }
}
