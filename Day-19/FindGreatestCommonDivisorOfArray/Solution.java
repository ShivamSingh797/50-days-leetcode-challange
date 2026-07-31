import java.util.*;
class Solution {
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=nums.length-2;i++){
            max=Math.max(max,Math.max(nums[i],nums[i+1]));
            min=Math.min(min,Math.min(nums[i],nums[i+1]));
        }
        while(max!=0){
            int temp=max;
            max=min%max;
            min=temp;
        }
        return Math.abs(min);
    }
}