package Concepts;
class Node {
    int num;
    Node next;
    Node(int x){
        this.num = x;
        this.next = null;
    }
}
public class LinkedList {
    Node head;

    //print the list
    void printList(){
        Node currentNode = head;
        if(head == null){
            System.out.println("empty list");
        }
        while (currentNode.next != null) {
            System.out.print(currentNode.num+" -> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    //add node at first place
    void addFirst(int a){
        Node newNode = new Node(a);
        if(head == null){
            head = newNode;
            return;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    public static void main(String[] args) {
        LinkedList myList  = new LinkedList();
        myList.addFirst(100);
        myList.printList();
        
        myList.addFirst(200);
        myList.printList();

        myList.addFirst(300);
        myList.printList();
    }
}
