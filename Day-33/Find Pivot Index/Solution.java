class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum=0;
        int total=0;
        int maxSum=Integer.MIN_VALUE;
        int index=0;
        for(int x:nums){
            total+=x;
        }
        for(int i=0;i<nums.length;i++){
            total-=nums[i];
            if(leftSum==total){
                maxSum=leftSum;
                index=i;
                return index;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
}