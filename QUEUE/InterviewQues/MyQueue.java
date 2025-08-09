import java.util.Stack;

public class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    public MyQueue() {
        // Constructor
    }

    public void push(int x) {
        if (st.size() == 0) {
            st.push(x); // Add directly if main stack is empty
        } else {
            // Move all elements to helper stack
            while (!st.isEmpty()) {
                helper.push(st.pop());
            }

            // Push new element to empty main stack
            st.push(x);

            // Move elements back from helper to main stack
            while (!helper.isEmpty()) {
                st.push(helper.pop());
            }
        }
    }

    public int pop() {
        return st.pop(); // Remove element from front
    }

    public int peek() {
        return st.peek(); // Peek front element
    }

    public boolean empty() {
        return st.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        obj.push(3);

        System.out.println(obj.pop());   // 1
        System.out.println(obj.peek());  // 2
        System.out.println(obj.empty()); // false
    }
}
