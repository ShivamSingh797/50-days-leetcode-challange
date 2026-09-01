class Solution {
    public int findJudge(int n, int[][] trust) {
        int n1=trust.length;
        //int m=trust[0].length;
        int[] res=new int[n+1];
        for(int i=0;i<n1;i++){
            int a=trust[i][0];
            int b=trust[i][1];

            res[a]--;
            res[b]++;
        }
        for(int i=1;i<=n;i++){
            if(res[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}