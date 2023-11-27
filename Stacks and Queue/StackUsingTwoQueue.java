import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueue {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public StackUsingTwoQueue() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }

    void push(int x) {
        q2.add(x);

        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        // swap
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    int pop() {
        if (q1.isEmpty()) {
            return -1;
        }
        return q1.poll();
    }

    int peek() {
        if (q1.isEmpty()) {
            return -1;
        }
        return q1.peek();
    }

    void display() {
        Queue<Integer> temp = new LinkedList<>();
        while (!q1.isEmpty()) {
            temp.add(q1.poll());
        }
        while (!temp.isEmpty()) {
            System.out.print(temp.peek() + " ");
            q1.add(temp.poll());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackUsingTwoQueue s = new StackUsingTwoQueue();

        s.push(10);
        s.push(12);
        s.push(14);
        s.push(16);
        s.display();

        System.out.println(s.pop());
        s.display();
        System.out.println(s.pop());
        s.display();
    }
}
