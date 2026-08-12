class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] a=new int[n];
        int r=n-1;
        int l=0;
        int k=a.length-1;
        while(l<=r){
            if(Math.abs(nums[l])<=Math.abs(nums[r])){
                a[k]=nums[r]*nums[r];
                r--;
            }else{
                a[k]=nums[l]*nums[l];
                l++;
            }
            k--;
        }
        return a;
    }
}