class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] s=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            s[i]=sum;
        }
        return s;
    }
}