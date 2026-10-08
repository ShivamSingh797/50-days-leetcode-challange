//Method 1:Optimal solution
class Solution {
    public String getPermutation(int n, int k) {
        int fact=1;
        List<Integer> arr=new ArrayList<>();
        for(int i=1;i<n;i++){
            fact=fact*i;
            arr.add(i);
        }
        arr.add(n);
        k=k-1;
        String ans="";
        while(true){
            ans=ans+arr.get(k/fact);
            arr.remove(k/fact);
            if(arr.size()==0){
                break;
            }
            k=k%fact;
            fact=fact/arr.size();
        }
        return ans;
    }
}



//Method 2:Brute force
class Solution {
    int count=0;
    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        count = 0;
        for (int i = 1; i <= n; i++) {
            sb.append(i);
        }
        String s = sb.toString();
        List<String> curr=new ArrayList<>();
        partation(0,s,k,curr);
        return curr.get(0);
    }
    public void partation(int index,String s,int k,List<String> curr){
        int len=s.length();
        if (!curr.isEmpty()) {
            return;
        }
        if(index==len){
            count++;
            if(count==k){
                curr.add(s);
            }
            return;
        }
        for(int i=index;i<len;i++){
            s=swap(s,i,index);
            partation(index+1,s,k,curr);
            s=swap(s,i,index);
            if (!curr.isEmpty()) {
                return;
            }
        }
    }
    public String swap(String s, int a, int b) {
        char[] ch = s.toCharArray();
        char temp = ch[a];
        ch[a] = ch[b];
        ch[b] = temp;
        return new String(ch);
    }
}