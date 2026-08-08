class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int r=0;
        int l=0;
        int maxl=0;
        int vowel=0;
        while(r<k){
            char c=s.charAt(r);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vowel++;
            }
            r++;
        }
        maxl=vowel;
        while(r<n){
            char c1=s.charAt(l);
            if(c1=='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u'){
                vowel--;
            }
            l++;
            char c2=s.charAt(r);
            if(c2=='a' || c2=='e' || c2=='i' || c2=='o' || c2=='u'){
                vowel++;
            }
            maxl=Math.max(vowel,maxl);
            r++;
        }
        return maxl;
    }
}