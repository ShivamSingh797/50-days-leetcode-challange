class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        int count=0;
        boolean[] bool=new boolean[n+1];
        for(int i=0;i<n;i++){
            bool[i]=true;
        }
        for(int i=2;i*i<=n;i++){
            if(bool[i]){
                for(int j=i*i;j<=n;j+=i){
                    bool[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(bool[i]){
                count++;
            }
        }
        return count;
    }
}