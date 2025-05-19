import java.util.*;

class Solution {
    public List<String> fizzBuzz(int n) {

        String a = "FizzBuzz";
        String b = "Fizz";
        String c = "Buzz";

        List<String> result = new ArrayList<>(); 

        for (int i = 0; i < n; i++) {
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
                result.add(a);
            } else if ((i + 1) % 3 == 0) {
                result.add(b);
            } else if ((i + 1) % 5 == 0) {
                result.add(c);
            } else {
                result.add(Integer.toString(i + 1));
            }
        }

        return result; 
    }
}

public class Main{
    public static void Main(String[] args){
        Solution sol = new Solution();
        List <String> output = sol.fizzBuzz(15);

        for (int i = 0; i < output.size(); i++) {
        String s = output.get(i);
        System.out.println(s);
        }
    }
}
