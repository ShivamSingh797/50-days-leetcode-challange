class Solution {
    public boolean palindrome(String s){
        int n=s.length();
        int l=0;
        int r=n-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            r--;
            l++;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        int n1=words.length;
        String empty="";
        for(int i=0;i<n1;i++){
            if(palindrome(words[i])){
                return words[i];
            }
        }
        return empty;
    }
}