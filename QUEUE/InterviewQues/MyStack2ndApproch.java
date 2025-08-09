
import java.util.LinkedList;
import java.util.Queue;

public class MyStack2ndApproch {
    Queue<Integer> Q = new LinkedList<>();

    // Constructor
    public MyStack2ndApproch() {
    }

    // Push operation:
    // If queue is empty, just add element
    // Else, add element to rear, then rotate the queue so it becomes the front (LIFO behavior)
    public void push(int x) {
        if (Q.size() == 0) {
            Q.add(x);
        } else {
            Q.add(x);
            for (int i = 1; i <= Q.size() - 1; i++) {
                Q.add(Q.remove());
            }
        }
    }

    // Pop: remove front element (which is the last pushed element in LIFO order)
    public int pop() {
        return Q.remove();
    }

    // Top: get front element without removing it
    public int top() {
        return Q.peek();
    }

    // Empty check
    public boolean empty() {
        return Q.size() == 0;
    }

    // Main method for testing in VS Code
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(10);
        obj.push(20);
        obj.push(30);

        System.out.println("Top: " + obj.top()); // 30
        System.out.println("Pop: " + obj.pop()); // 30
        System.out.println("Top: " + obj.top()); // 20
        System.out.println("Empty? " + obj.empty()); // false
        obj.pop();
        obj.pop();
        System.out.println("Empty? " + obj.empty()); // true
    }
}
