import java.util.*;

public class AvwalKaur_Q3_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] arr) {
        List<List<String>> ans=new ArrayList<>();
        if(arr.length==0) return ans; // return an empty arraylist
        
        // for every word in the array, if we sort that word and corresponding to that we store the 
        // actual words, then we will be able to store the anagrams at one plsce
        Map<String, List<String>> mpp=new HashMap<>();
        for(String s:arr) {
            char[] word=s.toCharArray();
            Arrays.sort(word);
            String sortedWord=String.valueOf(word);

            if(!mpp.containsKey(sortedWord)) mpp.put(sortedWord, new ArrayList<>());
            // if the word is already present push the new string in arraylist
            mpp.get(sortedWord).add(s);
        }
        return new ArrayList<>(mpp.values());
    }
}