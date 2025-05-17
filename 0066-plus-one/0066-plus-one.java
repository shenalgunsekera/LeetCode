class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1; 
        return result;
    }
}

public class Main{
    public static void Main(String[] args){

        Solution sol = new Solution();
        int[] result = sol.plusOne(new int[]{9}); 

    }
}