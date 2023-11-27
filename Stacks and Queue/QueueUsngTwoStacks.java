import java.util.Stack;

public class QueueUsngTwoStacks {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    int pointer = -1;

    // funtion to push element into Queue
    void enQueue(int x) {

        // move all elems from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        // push x item into s1
        s1.push(x);
        pointer++;

        // push everything back to s1 now
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    // funtion to deQueue form queue
    int deQueue() {
        if (s1.isEmpty()) {
            System.out.println("Queue underflow");
            return -1;
        }

        pointer--;
        return s1.pop();
    }

    // funtion to peek element
    int peek() {
        if (s1.isEmpty()) {
            System.out.println("Queue underflow");
            return -1;
        }

        return s1.peek();
    }

    // funtion to display the Queue
    void display() {
        Stack<Integer> temp = new Stack<>();
        while (!s1.isEmpty()) {
            temp.push(s1.pop());
        }

        while (!temp.isEmpty()) {
            int element = temp.peek();
            System.out.print(element + " ");
            s1.push(temp.pop());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Queue from 2 stacks in java :)");
        QueueUsngTwoStacks q = new QueueUsngTwoStacks();
        q.enQueue(10);
        q.enQueue(12);
        q.enQueue(14);
        q.enQueue(16);
        q.display();
        q.deQueue();
        q.display();
    }
}
