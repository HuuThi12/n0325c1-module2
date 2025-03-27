package ss6.Exercise2;

public class MyLinkedList<T> {
    private class Node{
        T value;
        Node next; // null // next: là node tròn tròn bên trong

        public Node(T value) {
            this.value = value;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    //
    public void addFirst(T value){
        Node newNode = new Node(value);
        if (head == null){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node temp = head;
        for (int i = 0; i < size; i++){
            stringBuilder.append(temp.value).append("\t");
            temp = temp.next;
        }
        return stringBuilder.toString();
    }
}
