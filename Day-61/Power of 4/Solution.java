class Solution {
    public boolean isPowerOfFour(int n) {
        int s=n&(n-1);
        int v=(n-1)%3;
        return (s==0 && v==0);
    }
}