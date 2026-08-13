class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int maxi=nums[0];
        int mini=nums[0];
        int ans=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]<0){
                int temp=maxi;
                maxi=mini;
                mini=temp;
            }
            maxi=Math.max(nums[i],nums[i]*maxi);
            mini=Math.min(nums[i],nums[i]*mini);
            ans=Math.max(ans,maxi);
        }
        return ans;
    }
}