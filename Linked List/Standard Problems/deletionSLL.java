public class deletionSLL {

    Node head;
    Node tail;

    int size;

    deletionSLL() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(int data) {
            this.data = data;
        }
    }

    // deletion
    void deleteLast(){
        if(size<=1){
            deleteFirst();
            return;
        }

        Node cur = head;
        while(cur.next.next != null){
            cur = cur.next;
        }

        cur.next = null;
        size--;
    }

    void deleteFirst(){
        if(head == null){
            head = tail;
            return;
        }
        head = head.next;

        size--;
    }

    void insert(int value, int index){
        if(head == null){
            insertFirst(value);
            return;
        }else if(size == index){
            insertLast(value);
            return;
        }

        Node cur = head;
        for(int i=1; i<index; i++){
            cur = cur.next;
        }

        Node temp  = new Node(value, cur.next);
        cur.next = temp; 

        size++;
    }

    void insertLast(int value) {
        Node temp = new Node(value);
        if (head == null) {
            head = temp;
            return;
        }

        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }

        cur.next = temp;
        temp.next = null;

        size++;
    }

    void insertFirst(int value) {
        Node temp = new Node(value);
        if (head == null) {
            head = temp;
            return;
        }
        temp.next = head;
        head = temp;

        size++;
    }

    void show() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        deletionSLL LL = new deletionSLL();

        LL.insertFirst(10);
        LL.show();

        LL.insertFirst(10);
        LL.show();

        LL.insert(13,2);
        LL.show();
        

        LL.insertFirst(10);
        LL.show();

        LL.insert(13,2);
        LL.show();
        
        LL.deleteFirst();
        LL.show();
        
        LL.deleteLast();
        LL.show();

    }
}
