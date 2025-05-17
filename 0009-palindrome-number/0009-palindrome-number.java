class Solution {
    public boolean isPalindrome(int x) {

        int rev = 0;
        int org = x;
        
        if (x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
            while (x > 0){
                int digit = x % 10;
                rev = rev * 10 + digit;
                x = x /10;
            }
            return rev == org;
     }

}


public class Main{
    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println (sol.isPalindrome(101));
    }
}