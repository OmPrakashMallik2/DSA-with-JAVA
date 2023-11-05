
class StackExp extends Exception {
    public StackExp(String msg){
        super(msg);
    }
}

public class MyStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    // pointer
    int ptr = -1;

    public MyStack() {
        this.data = new int[DEFAULT_SIZE];
    }

    public MyStack(int size) {
        this.data = new int[size];
    }


    // Peek 
    public int peek() throws StackExp{
        if (isEmpty()) {
            throw new StackExp("Can not peek, Stack is Empty.");
        }
        return data[ptr];
    }


    // remove item
    public int pop() throws StackExp {
        if (isEmpty()) {
            throw new StackExp("Stack is Empty.");
        }
        int remove = data[ptr];
        ptr--;
        return remove;
    }

    // add item
    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full.");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    

    public boolean isFull() {
        return data.length - 1 == ptr;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }



    public static void main(String[] args) throws StackExp {
        MyStack stk = new MyStack();

        stk.push(11);
        stk.push(12);
        stk.push(13);
        stk.push(14);
        stk.push(15);

        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());

    }


}