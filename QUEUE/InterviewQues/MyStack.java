// leetcode -225 implementation of satck using queue
import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    // Using a single queue to simulate a stack (LIFO)
    Queue<Integer> Q = new LinkedList<>();

    // Constructor
    public MyStack() {
    }

    // Push operation: simply add element to the queue
    // Logic: Push in queue's natural way (FIFO), adjustment happens in pop/top
    public void push(int x) {
        Q.add(x);
    }

    // Pop operation: remove the last inserted element
    // Logic:
    // 1. Move first (size-1) elements from front to rear to bring the last pushed element to front
    // 2. Remove and return that element (this is the "stack pop")
    public int pop() {
        for (int i = 1; i <= Q.size() - 1; i++) {
            Q.add(Q.remove());
        }
        int x = Q.remove(); // now front has the last pushed element
        return x;
    }

    // Top operation: get the last pushed element without removing it
    // Logic:
    // 1. Move first (size-1) elements from front to rear to bring last pushed element to front
    // 2. Peek at it (get value without removing)
    // 3. Put it back into the queue to restore original order
    public int top() {
        for (int i = 1; i <= Q.size() - 1; i++) {
            Q.add(Q.remove());
        }
        int x = Q.peek();
        Q.add(Q.remove()); // put it back in queue
        return x;
    }

    // Empty check
    // Logic: return true if queue has no elements
    public boolean empty() {
        return Q.size() == 0;
    }

    // Main method for quick testing
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(10);
        obj.push(20);
        obj.push(30);

        System.out.println("Top element: " + obj.top()); // should be 30
        System.out.println("Pop: " + obj.pop());         // should remove 30
        System.out.println("Top element: " + obj.top()); // should be 20
        System.out.println("Is empty? " + obj.empty());  // should be false
        obj.pop();
        obj.pop();
        System.out.println("Is empty? " + obj.empty());  // should be true
    }
}

