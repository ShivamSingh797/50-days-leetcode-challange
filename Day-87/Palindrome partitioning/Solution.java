class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> curr=new ArrayList<>();
        partation(s,0,curr,ans);
        return ans;
    }

    public void partation(String s,int index,List<String> curr,List<List<String>> ans){
        int n=s.length();
        if(index==n){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index;i<n;i++){
            if(palindrome(s,index,i)){
                curr.add(s.substring(index,i+1));
                partation(s,i+1,curr,ans);
                curr.remove(curr.size()-1);
            }
        }
    }
    public boolean palindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}