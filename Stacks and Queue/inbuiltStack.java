import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// IN BUILD STACK

public class inbuiltStack {
    public static void main(String[] args) {
        

        // // STACK
        // Stack<Integer> stck = new Stack<>();

        // stck.push(10);
        // stck.push(20);
        // stck.push(30);

        // int res = stck.pop();
        // System.out.println(res);

        // stck.push(40);
        // stck.push(50);
        // stck.push(60);
        // stck.push(70);

        // int res2 = stck.pop();
        // System.out.println(res2);




        // // QURUES

        // Queue<Integer> q  = new LinkedList<>();

        // q.add(100);
        // q.add(500);
        // q.add(1000);

        // System.out.println(q.remove ());



        // De queue

        Deque<Integer> dq = new ArrayDeque<>();

        dq.add(10);
        dq.add(20);
        dq.add(30);
        dq.add(40);

        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());


    }
}