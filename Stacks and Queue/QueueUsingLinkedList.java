import java.util.LinkedList;

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(8);
        q.enQueue(10);
        q.enQueue(12);
        q.enQueue(14);
        q.enQueue(16);

        System.out.println(q.getTop());
        q.deQueue();
        System.out.println(q.getTop());

    }
}

class Queue {
    LinkedList<Integer> list;

    Queue() {
        list = new LinkedList<>();
    }

    void enQueue(int data) {
        list.add(data);
    }

    int deQueue() {
        int popped = list.getFirst();
        list.removeFirst();
        return popped;
    }

    void display() {
        System.out.println(list);
    }

    // size
    int size() {
        if (isEmpty()) {
            return -1;
        }
        return list.size();
    }

    // get top
    int getTop() {
        int popped = list.getFirst();
        return popped;
    }

    // isEmpty
    boolean isEmpty() {
        return list.isEmpty();
    }

}
