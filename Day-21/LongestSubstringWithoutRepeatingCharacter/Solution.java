import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hash=new HashMap<>();
        int l=0;
        int maxLength=0;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            if(hash.containsKey(c) && hash.get(c)>=l){
                l=hash.get(c)+1;
            }
            hash.put(c,r);
            maxLength=Math.max(maxLength,r-l+1);
        }
        return maxLength;
    }
}