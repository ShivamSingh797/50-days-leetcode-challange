class Solution {
    public int maxArea(int[] height) {
        int res=Integer.MIN_VALUE;
        int i=0;
        int j=height.length-1;
        while(i<j){
            int ind=j-i;
            int val=Math.min(height[i],height[j]);
            res=Math.max(res,val*ind);
            if(height[i]<=height[j]){
                i++;
            }else{
                j--;
            }
        }
        return res;
    }
}
