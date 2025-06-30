/**
 * Problem: Distribute chocolates such that the difference between the max and
 * min
 * chocolates received by students is minimized.
 * 
 * You are given an array of packets where each element represents the number of
 * chocolates
 * in that packet, and a number 'm' which is the number of students.
 * 
 * Each student gets exactly one packet, and the goal is to minimize the
 * **maximum number of
 * chocolates** a student receives while ensuring fair distribution.
 */

public class ChoclateProblem {

    // Helper method to check if it's possible to divide packets such that
    // no student gets more than 'maxChoclateAllowed' chocolates.
    static boolean IsDivisonPossible(int arr[], int m, int maxChoclateAllowed) {
        int NoOfStudent = 1; // Start with first student
        int choc = 0; // Track total chocolates assigned to the current student

        for (int i = 0; i < arr.length; i++) {
            // If a single packet exceeds the allowed maximum, return false
            if (arr[i] > maxChoclateAllowed)
                return false;

            // If current packet can be assigned to current student
            if (choc + arr[i] <= maxChoclateAllowed) {
                choc += arr[i];
            } else {
                // Assign this packet to a new student
                NoOfStudent++;
                choc = arr[i];
            }
        }

        // If more students needed than available, return false
        return NoOfStudent <= m;
    }

    // Binary search function to find the minimum possible maximum chocolates a
    // student can get
    static int distributeChoclate(int arr[], int m) {
        if (arr.length < m)
            return -1; // Not enough packets for each student

        int ans = 0;
        int st = 1; // Start of binary search range
        int end = (int) 1e9; // End of range (max possible chocolates)

        while (st <= end) {
            int mid = st + (end - st) / 2; // Midpoint of current range

            // Check if it's possible to divide packets within 'mid' chocolates per student
            if (IsDivisonPossible(arr, m, mid)) {
                ans = mid; // Save this possible answer
                end = mid - 1; // Try to find smaller max by searching left
            } else {
                st = mid + 1; // Mid was too small, search right
            }
        }
        return ans; // Final answer: minimum max chocolates any student would get
    }

    public static void main(String[] args) {
        int arr[] = { 12, 34, 67, 90 }; // Chocolate packets
        int m = 2; // Number of students
        System.out.println(distributeChoclate(arr, m)); // Output: 113
    }
}
