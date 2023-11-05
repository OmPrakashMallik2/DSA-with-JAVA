// package Standard Problems;

public class insertSLL {

    private Node head;
    private Node tail;

    private int size;

    public insertSLL(){
        this.size = 0;
    }

    //Node
    private class Node{
        private int data;
        private Node next;

        Node (int data) {
            this.data = data;
        }

        Node (int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    public void insert(int val, int index){

        if(index == 0){
            insertFirst(val);
            return;
        }else if(size == index){
            insertLast(val);
            return;
        }

        Node cur = head;
        for(int i=1; i<index; i++){
            cur = cur.next;
        }

        Node temp = new Node(100, cur.next);
        cur.next = temp;

        size++;
    }

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node temp = new Node(val);
        
        tail.next = temp;
        tail = temp;
        size++;
    }

    public void insertFirst(int val){
        Node temp = new Node(val);

        temp.next = head;
        head = temp;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    void show(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        insertSLL ll = new insertSLL();
        ll.insertFirst(4);
        ll.insertFirst(2);
        ll.insertLast(6);
        ll.insert(100, 2);

        ll.show();
    }
}
