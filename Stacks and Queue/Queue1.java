public class Queue1 {
    int size = 1000;
    int arr[] = new int[size];
    int start = 0;
    int end = -1;

    boolean push(int x) {
        if (end > size - 1) {
            System.out.println("Queue overflow");
            return false;
        }

        arr[++end] = x;
        return true;
    }

    int pop() {
        if (end < 0) {
            System.out.println("Queue underflow");
            return 0;
        }

        return arr[start++];
    }

    int peek() {
        if (end < 0) {
            System.out.println("Queue underflow");
            return 0;
        }

        return arr[end];
    }

    void print() {
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Ram Ram Bhai Sareyane 🚩🚩");

        Queue1 q = new Queue1();
        q.push(10);
        q.push(20);
        q.push(30);
        q.print();
        q.pop();
        q.print();
        System.out.println(q.peek());

    }
}
