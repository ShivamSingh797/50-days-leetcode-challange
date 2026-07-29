import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> a= new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            int sum=target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==sum){
                    a.add(i);
                    a.add(j);
                }
            }
        }
        int[] res=new int[a.size()];
        for(int i=0;i<a.size();i++){
            res[i]=a.get(i);
        }
        return res;
    }
}