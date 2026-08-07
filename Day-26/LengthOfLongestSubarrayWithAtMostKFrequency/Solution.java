class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        int r=0;
        int l=0;
        int maxl=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(r<n){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.getOrDefault(nums[r],0)>k){
                map.put(nums[l],map.getOrDefault(nums[l],0)-1);
                l++;
            }
            maxl=Math.max(maxl,r-l+1);
            r++;
        }
        return maxl;
    }
}