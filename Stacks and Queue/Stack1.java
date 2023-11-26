public class Stack1 {

    static final int MAX = 1000;
    int top = -1;
    int[] arr = new int[MAX];

    boolean isEmpty() {
        return (top < 0);
    }

    // push function
    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack overflow");
            return false;
        } else {
            arr[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    // pop function
    int pop() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            int x = arr[top--];
            return x;
        }
    }

    // peek function
    int peek() {
        if (top < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            int x = arr[top];
            return x;
        }
    }

    // print function
    void print() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Rom Rom Sareyane !");
        Stack1 s = new Stack1();
        s.push(10);
        s.push(11);
        s.push(12);
        s.push(13);
        s.print();
        System.out.println(s.pop());
        s.print();
    }
}
