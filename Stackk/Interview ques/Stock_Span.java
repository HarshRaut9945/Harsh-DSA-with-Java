import java.util.Stack;
import java.util.Arrays;

public class Stock_Span {

    public static int[] calculateSpan(int[] arr) {
        int n = arr.length;
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();
        
        // First day span is always 1
        span[0] = 1;
        st.push(0); // Push index, not value

        for (int i = 1; i < n; i++) {
            // Pop all elements from stack that are less or equal to current price
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            // If stack is empty, all previous elements are smaller
            if (st.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }

            // Push current index to stack
            st.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        int[] result = calculateSpan(arr);

        System.out.println("Stock Spans:");
        System.out.println(Arrays.toString(result));
    }
}
