import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static int[] firstNegInt(int arr[], int k) {
        int n = arr.length;
        int[] res = new int[n - k + 1];  // ✅ array, not int

        Queue<Integer> q = new LinkedList<>();

        // Store indices of negative elements
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                q.add(i);
            }
        }

        // Process each window
        for (int i = 0; i <= n - k; i++) {
            // Remove negatives that are out of this window
            while (!q.isEmpty() && q.peek() < i) {
                q.remove();
            }

            // If queue has a negative index in range
            if (!q.isEmpty() && q.peek() <= i + k - 1) {
                res[i] = arr[q.peek()];
            } else {
                res[i] = 0;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        int[] result = firstNegInt(arr, k);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
