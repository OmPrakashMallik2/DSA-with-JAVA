import java.util.LinkedList;

public class StackUsingLinkedList {

    LinkedList<Integer> list;

    public StackUsingLinkedList() {
        list = new LinkedList<>();
    }

    void push(int x) {
        list.add(x);
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        int popped = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return popped;
    }

    int peek() {
        int popped = list.get(list.size() - 1);
        return popped;
    }

    void print() {
        System.out.print("[ ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("]");
    }

    boolean isEmpty() {
        return list.isEmpty();
    }

    int size() {
        return list.size();
    }

    public static void main(String[] args) {
        System.out.println("STACK USING LINKEDLIST XD");

        StackUsingLinkedList s = new StackUsingLinkedList();

        s.push(10);
        s.push(12);
        s.push(14);

        s.print();
        s.pop();
        s.print();
        System.out.println(s.peek());
    }
}
