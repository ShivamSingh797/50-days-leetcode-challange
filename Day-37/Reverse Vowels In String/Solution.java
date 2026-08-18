class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        int l=0;
        int r=n-1;
         char[] arr = s.toCharArray();
        String v="aeiouAEIOU";
        while(l<r){
            char ch1=arr[l];
            char ch2=arr[r];
            if(v.indexOf(ch1)==-1){
                l++;
            }
            if(v.indexOf(ch2)==-1){
                r--;
            }
            if(v.indexOf(ch1)!=-1 && v.indexOf(ch2)!=-1){
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        return new String(arr);
    }
}