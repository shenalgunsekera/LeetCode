import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] findWords(String[] words) {

        String[] one = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p"};
        String[] two = {"a", "s", "d", "f", "g", "h", "j", "k", "l"};
        String[] three = {"z", "x", "c", "v", "b", "n", "m"};

        List<String> result = new ArrayList<>();

        for (String word : words) {
            String lower = word.toLowerCase();
            String[] row = null;

            char firstChar = lower.charAt(0);
            if (isInRow(firstChar, one)) {
                row = one;
            } else if (isInRow(firstChar, two)) {
                row = two;
            } else if (isInRow(firstChar, three)) {
                row = three;
            }

            boolean valid = true;
            for (int i = 1; i < lower.length(); i++) {
                if (!isInRow(lower.charAt(i), row)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    private boolean isInRow(char c, String[] row) {
        for (String s : row) {
            if (s.equals(String.valueOf(c))) {
                return true;
            }
        }
        return false;
    }
}
