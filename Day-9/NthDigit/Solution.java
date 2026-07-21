class Solution {
    public int findNthDigit(int n) {
        if(n<=9){
            return n;
        }
        int digits=1;
        long start=1;
        long count=9;
        while(n>digits*count){
            n-=digits*count;
            digits++;
            count=count*10;
            start=start*10;
        }

        long num=start+(n-1)/digits;
        int index=(n-1)%digits;

        String s=String.valueOf(num);
        return (s.charAt(index)-'0');
    }
}