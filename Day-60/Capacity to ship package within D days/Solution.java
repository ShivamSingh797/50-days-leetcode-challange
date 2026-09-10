class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int weight:weights){
            low=Math.max(low,weight);
            high+=weight;
        }
        while(low<high){
            int mid=low+(high-low)/2;
            int ans=1;
            int sum=0;
            for(int weight:weights){
                if(sum+weight>mid){
                    ans++;
                    sum=weight;
                }else{
                    sum+=weight;
                }
            }
            if(ans <= days) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
