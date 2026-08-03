import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> has=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(has.containsKey(nums[i])){
                int a=has.get(nums[i]);
                has.put(nums[i],a+1);
            }else{
                has.put(nums[i],1);
            }
            
        }
        int maxFreq = 0;
        int answer = 0;

        for (Map.Entry<Integer, Integer> entry : has.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                answer = entry.getKey();
            }
        }

        return answer;
    }
}