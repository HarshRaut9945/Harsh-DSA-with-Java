import java.util.Stack;

public class ReverseStackRecursive {

    // Function to insert at bottom
    public static void insertAtBottom(Stack<Integer> st, int val) {
        if (st.isEmpty()) {
            st.push(val);
            return;
        }
        int top = st.pop();
        insertAtBottom(st, val);
        st.push(top);
    }

    // Recursive function to reverse the stack
    public static void reverseStack(Stack<Integer> st) {
        if (st.isEmpty()) return;

        int top = st.pop();
        reverseStack(st);         // reverse remaining stack
        insertAtBottom(st, top);  // insert this element at bottom
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Original Stack: " + st);

        reverseStack(st);

        System.out.println("Reversed Stack: " + st);
    }
}
