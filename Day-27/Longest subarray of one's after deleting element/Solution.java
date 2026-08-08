class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int r=0;
        int l=0;
        int zeroes=0;
        int maxl=0;
        while(r<n){
            if(nums[r]==0){
                zeroes++;
            }
            while(zeroes>1){
                if(nums[l]==0){
                    zeroes--;
                }
                l++;
            }
            maxl=Math.max(maxl,r-l);
            r++;
        }
        return maxl;
    }
}