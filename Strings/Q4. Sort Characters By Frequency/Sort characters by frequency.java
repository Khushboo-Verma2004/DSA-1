
class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[128];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        StringBuilder result = new StringBuilder();
        while (true) {
            int maxFreq = 0;
            char maxChar = 0;
            for (int i = 0; i < 128; i++) {
                if (freq[i] > maxFreq) {
                    maxFreq = freq[i];
                    maxChar = (char) i;
                }
            }
            if (maxFreq == 0) {
                break;
            }
            while (maxFreq-- > 0) {
                result.append(maxChar);
            }
            freq[maxChar] = 0;
        }
        return result.toString();
    }
}
