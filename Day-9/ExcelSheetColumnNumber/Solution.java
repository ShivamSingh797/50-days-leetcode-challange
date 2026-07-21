class Solution {
    public int titleToNumber(String columnTitle) {
        char[] s=columnTitle.toCharArray();
        int result=0;
        for(char s1:s){
            result=result*26+(s1-'A'+1);
        }
        return result;
    }
}
