class Solution {
    public int squareSumOfNumber(int n){
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum+=dig*dig;
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n>0){
            if(set.contains(n)){
                return false;
            }

            set.add(n);
            int res=squareSumOfNumber(n);
            if(res==1){
                return true;
            }else{
                n=res;
            }
        }
        return false;
    }
}