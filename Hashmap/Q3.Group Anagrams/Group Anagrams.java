import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] charCount = new int [26]; 
            for (char c : str.toCharArray()) {
                charCount[c - 'a']++;
            }
            StringBuilder keyBuilder = new StringBuilder();
            for (int count : charCount) {
                keyBuilder.append(count).append('#');
            }
            String key = keyBuilder.toString();
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
