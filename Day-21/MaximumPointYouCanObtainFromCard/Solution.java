class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l=0;
        int r=k-1;
        int e=cardPoints.length-1;
        int eNum=0;
        int sum=0;
        int maxSum=0;
        for(int i=0;i<k;i++){
            sum=sum+cardPoints[i];
            maxSum=Math.max(maxSum,sum);
        }
        while(eNum<k){
            sum=sum-cardPoints[r];
            r--;
            sum=sum+cardPoints[e];
            maxSum=Math.max(maxSum,sum);
            e--;
            eNum++;
        }
        
        return maxSum;
    }
}