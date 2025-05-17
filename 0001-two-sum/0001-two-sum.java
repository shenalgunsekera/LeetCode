class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If complement is already in the map, we found the result
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise, add the current number and its index to the map
            map.put(nums[i], i);
        }

        // Return empty array if no solution found (depends on problem constraints)
        return new int[] {};
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] result = sol.twoSum(new int[] {2, 7, 11, 15}, 9);
        System.out.println("Indices: " + result[0] + ", " + result[1]); // Output: Indices: 0, 1
    }
}