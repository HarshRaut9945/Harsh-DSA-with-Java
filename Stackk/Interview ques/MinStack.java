import java.util.Stack;

class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {
        // constructor
    }

    public void push(int val) {
        if (st.size() == 0) {
            st.push(val);
            min.push(val);
        } else {
            st.push(val);
            if (min.peek() < val) {
                min.push(min.peek());
            } else {
                min.push(val);
            }
        }
    }

    public void pop() {
        st.pop();
        min.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(5);
        obj.push(3);
        obj.push(7);
        obj.push(2);

        System.out.println("Top: " + obj.top());        // Output: 2
        System.out.println("Min: " + obj.getMin());     // Output: 2

        obj.pop();
        System.out.println("Top after pop: " + obj.top());    // Output: 7
        System.out.println("Min after pop: " + obj.getMin()); // Output: 3
    }
}
