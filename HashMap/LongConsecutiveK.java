// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

import java.util.HashMap;
import java.util.Map;

public class LongConsecutiveK {
     public int longestConsecutive(int[] nums) {
        int longestLength = 0;
        Map<Integer, Boolean> mp = new HashMap<>();

        // Mark all numbers as not visited
        for (int num : nums) {
            mp.put(num, false);
        }

        for (int num : nums) {
            if (mp.get(num)) continue; // skip if already visited

            int currLength = 1;
            mp.put(num, true);

            // Check forward direction
            int nextNum = num + 1;
            while (mp.containsKey(nextNum) && !mp.get(nextNum)) {
                currLength++;
                mp.put(nextNum, true);
                nextNum++;
            }

            // Check backward direction
            int prevNum = num - 1;
            while (mp.containsKey(prevNum) && !mp.get(prevNum)) {
                mp.put(prevNum, true);
                currLength++;
                prevNum--;
            }

            longestLength = Math.max(longestLength, currLength);
        }

        return longestLength;
    }

      public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};

        LongConsecutiveK sol = new LongConsecutiveK();
        int result = sol.longestConsecutive(nums);

        System.out.println("Longest Consecutive Sequence Length: " + result);
    }
}


  

