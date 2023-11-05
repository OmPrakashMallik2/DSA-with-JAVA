public class MyQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 5;

    // there will be two pointers
    int start = -1;
    int end = 0;

    // cunstructors
    public MyQueue() {
        this.data = new int[DEFAULT_SIZE];
    }

    public MyQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() {

    }

    public boolean isFull() {
        return data.length == end + 1;
    }

    public boolean isEmpty() {
        return end == -1;
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.insert(10);
        q.insert(10);
        q.insert(10);
    }
}
