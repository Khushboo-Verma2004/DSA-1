import java.util.StringTokenizer;
class Solution {
    public String reverseWords(String s) {
       StringTokenizer tokenizer = new StringTokenizer(s, " ");
        StringBuilder reversed = new StringBuilder();

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            reversed.insert(0, word + " ");
        }

        return reversed.toString().trim(); 
    }
}
