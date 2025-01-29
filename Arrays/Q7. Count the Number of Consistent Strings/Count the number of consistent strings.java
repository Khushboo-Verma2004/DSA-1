class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0; i<allowed.length(); i++){
            map.put(allowed.charAt(i), map.getOrDefault(allowed.charAt(i),0)+1);
        }
        int count = 0;
        for(int i = 0; i<words.length; i++){
            String word = words[i];
            int x = 0;
            for(int j = 0; j<word.length(); j++){
                if(!map.containsKey(word.charAt(j))){
                    break;
                }
                x++;
            }
            if(x==word.length()){
                count++;
            }
        }
        return count;
    }
}
