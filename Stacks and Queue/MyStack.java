
public class MyStack {

    static final int size = 1000;
    int[] data = new int[size];

    // pointer
    int ptr = -1;

    // is array is full
    public boolean isFull() {
        return ptr > size - 1;
    }

    // is array is empty
    public boolean isEmpty() {
        return ptr < 0;
    }

    // add item
    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack overflow");
            return false;
        }

        data[++ptr] = item;
        return true;
    }

    // remove item
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return 0;
        }

        return data[ptr--];
    }

    // Peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return 0;
        }
        return data[ptr];
    }

    public static void main(String[] args) {
        MyStack stk = new MyStack();

        stk.push(11);
        stk.push(12);
        stk.push(13);
        stk.push(14);
        stk.push(15);

        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());

    }
}