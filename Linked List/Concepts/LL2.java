package Concepts;
class Node {
    int data;
    Node next;
    
    Node (int saman) {
        this.data = saman;
        this.next = null;
    }
}

public class LL2 {

    Node head;

    // add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add last
    void addLast(int data){
        Node newNode =  new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curNode = head;
        while(curNode.next != null){
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    //print list
    void printList(){
        Node curNode = head;
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        while(curNode != null){
            System.out.print(curNode.data+" -> ");
            curNode = curNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LL2 op = new LL2();
        op.addFirst(5);
        op.addFirst(10);
        op.printList();
        op.addLast(10);
        op.printList();
    }
}
