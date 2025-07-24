import java.util.Arrays;
import java.util.Stack;

public class Next_Greatest {

   public static int[] nextGreatest(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop all elements smaller or equal to arr[i]
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            // If stack is empty, no greater element
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }

            // Push current element to stack
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
