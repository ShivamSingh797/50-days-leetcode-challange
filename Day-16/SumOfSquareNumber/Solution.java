class Solution {
    public boolean judgeSquareSum(int c) {
        int s=(int)Math.sqrt(c);
        int i=0;
        int j=s;
        while(i<=j){
            long res = (long) i * i + (long) j * j;
            if(res==c){
                return true;
            }else if(res>c){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}