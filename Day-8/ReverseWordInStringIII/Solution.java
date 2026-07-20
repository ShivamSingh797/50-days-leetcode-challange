class Solution {
public String reverseString(String str) {
    char[] arr = str.toCharArray();

    int i = 0;
    int j = arr.length - 1;

    while (i < j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        i++;
        j--;
    }

    return new String(arr);
}
    public String reverseWords(String s) {
        s=s.trim().replaceAll("\\s+"," ");
        String[] s1=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s1.length-1;i++){
            String rev=reverseString(s1[i]);
            sb.append(rev+" ");
        }
        String revl=reverseString(s1[s1.length-1]);
        sb.append(revl);
        return sb.toString();
    }
}