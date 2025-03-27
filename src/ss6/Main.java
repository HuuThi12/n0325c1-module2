package ss6;

import ss6.Exercise2.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList();

        myLinkedList.addFirst(10);
        myLinkedList.addFirst(20);
        myLinkedList.addFirst(30);
        myLinkedList.addFirst(40);
        myLinkedList.addFirst(50);

        System.out.println(myLinkedList);
    }
}
