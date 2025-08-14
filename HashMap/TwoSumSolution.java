import java.util.HashMap;

public class TwoSumSolution {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            //  If complement exists in map, return the two indices
            if (mp.containsKey(complement)) {
                return new int[]{ mp.get(complement), i };
            }

            // Otherwise, store the current number with its index
            mp.put(nums[i], i);
        }

        // If no pair is found (Optional: throw exception or return {-1, -1})
        throw new IllegalArgumentException("No two sum solution found");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15,3};
        int target = 14;

        int[] result = twoSum(nums, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
        // System.out.println(result);
    }
}
