// package DoublyLL;

public class doublyLinkedList {

    Node head;
    Node tail;

    int size;

    doublyLinkedList() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    void deleteLast() {

        Node cur = head;
        while(cur.next.next != null){
            cur = cur.next;
        }
        
        cur.next = null;

        // if(head == null){
        //     insertFirst(data);
        //     size++;
        //     return;
        // }

        size--;
    }

    void deleteFirst(){
        Node cur = head;
        head = cur.next;
        cur.prev = null;
        size--;
    }

    void len(){
        System.out.println("The Size Of Doubly LinkedList is : "+size);
    }

    void insertLast(int data) {

        if(head == null){
            insertFirst(data);
            size++;
            return;
        }

        Node newNode = new Node(data);

        Node cur = head;
        while(cur.next != null){
            cur = cur.next;
        }

        cur.next = newNode;
        newNode.next = null;
        newNode.prev = cur;

        size++;
    }

    void insertFirst(int data) {
        
        Node newNode = new Node(data);
        if(head == null){
            newNode.next = null;
            newNode.prev = null;
            head = newNode;
            size++;
            return;
        }

        newNode.next = head;
        newNode.prev = null;
        head = newNode;

        size++;
    }

    void display() {

        Node temp = head;
        while (temp != null) {
            System.out.print(+temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {

        doublyLinkedList dll = new doublyLinkedList();
        dll.len();
        
        dll.insertFirst(10);
        dll.display();

        dll.insertFirst(11);
        dll.display();

        dll.insertFirst(12);
        dll.display();

        dll.insertLast(15);
        dll.display();

        dll.insertLast(16);
        dll.display();

        dll.deleteFirst();
        dll.display();

        dll.deleteLast();
        dll.display();

        dll.len();

        System.out.println(dll.head.data);
    }
}
