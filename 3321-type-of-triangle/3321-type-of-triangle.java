class Solution {
    public String triangleType(int[] nums) {
        if (nums.length != 3) {
            return "none";
        }

        int a = nums[0], b = nums[1], c = nums[2];

        if (a + b <= c || a + c <= b || b + c <= a) {
            return "none";
        }

        if (a == b && b == c) {
            return "equilateral";
        } else if (a == b || b == c || a == c) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {3, 3, 3};
        System.out.println(sol.triangleType(nums1));

        int[] nums2 = {3, 4, 5};
        System.out.println(sol.triangleType(nums2)); 

        int[] nums3 = {1, 1, 2};
        System.out.println(sol.triangleType(nums3)); 
    }
}
