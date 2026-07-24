class Solution {
    public int trailingZeroes(int n) {
        if(n==0 || n<5){
            return 0;
        }
        int result=0;
        while(n>=5){
            int quotient=n/5;
            result+=quotient;
            n=quotient;
        }
        return result;
    }
}