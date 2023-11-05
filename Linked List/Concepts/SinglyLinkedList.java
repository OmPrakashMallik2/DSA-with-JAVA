package Concepts;

public class SinglyLinkedList {

    Node first;
    Node last;

    int size;

    public SinglyLinkedList() {
        this.size = 0;
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public int length() {
        return size;
    }

    public void insert(int value, int index) {
        if(size == 0){
            newNode(value);
            return;
        }
        if(index == size){
            newNodeLast(value);
        }
    }

    public void removeLast() {

        Node temp;
        temp = first;
        while (temp.next != last) {
            temp = temp.next;
        }
        temp.next = last;
        last.next = null;
        size--;
    }

    public void removeFirst() {
        if (first == null) {
            return;
        }
        first = first.next;
        size--;
    }

    public void newNode(int value) {
        Node temp = new Node(value);

        if (first == null) {
            first = temp;
            last = first;
        } else {
            temp.next = first;
            first = temp;
        }
        size++;
    }

    public void newNodeLast(int value) {
        Node temp = new Node(value);
        if (last.next == null) {
            last.next = temp;
            temp.next = null;
        }
        size++;
    }

    public void show() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("none");
    }

    public static void main(String[] args) {

        SinglyLinkedList myLL = new SinglyLinkedList();

        myLL.newNode(10);
        myLL.newNode(20);
        myLL.newNode(30);

        myLL.show();

    }
}