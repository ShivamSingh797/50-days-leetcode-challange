class Solution {
    public int countOdds(int low, int high) {
        long n=high-low+1;
        if(n%2!=0){
            if(low%2!=0 || high%2!=0){
                return (int)(n/2+1);
            }
        }
        return (int)(n/2);
    }
}