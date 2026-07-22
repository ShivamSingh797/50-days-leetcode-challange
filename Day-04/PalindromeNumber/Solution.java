class Solution {
    public boolean isPalindrome(int x) {
        int x_org=x;
        int base=10;
        int sum=0;
        if(x<0){
            return false;
        }
        while(x>0){
            int temp=x%10;
            sum=sum*base+temp;
            x=x/10;
        }
        if(x_org==sum){
            return true;
        }
        return false;
    }
}