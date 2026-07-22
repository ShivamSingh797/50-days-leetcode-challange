class Solution {
    public String reverseWords(String s) {
        s=s.trim().replaceAll("\\s+", " ");
        String[] str=s.split(" ");
        int i=0;
        int j=str.length-1;
        while(i<j){
            String temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }

        StringBuilder sb=new StringBuilder();
        for(int k=0;k<str.length-1;k++){
            sb.append(str[k]+" ");
        }
        sb.append(str[str.length-1]);
        return sb.toString();
    }
}