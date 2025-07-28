import java.util.Stack;
import java.util.Arrays;

public class Next_Greatest {

    public static int[] nextGreatest(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        // Step 1: Handle the last element directly
        res[n - 1] = -1;
        st.push(arr[n - 1]);

        // Step 2: Loop from second last to first
        for (int i = n - 2; i >= 0; i--) {
            // Pop smaller or equal elements
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            // Assign result
            res[i] = st.isEmpty() ? -1 : st.peek();

            // Push current element for future use
            st.push(arr[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 2, 1, 6, 3, 4};
        int result[] = nextGreatest(arr);

        System.out.println("Next Greater Elements:");
        System.out.println(Arrays.toString(result));
    }
}
