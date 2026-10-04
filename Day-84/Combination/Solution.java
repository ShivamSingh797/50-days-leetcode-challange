//SOLUTION 1
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> a = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=i+1;
        }
        subsequences(0,nums,curr,a,k);
        return a;
    }
    public void subsequences(int index,int[] nums,List<Integer>curr,List<List<Integer>> a,int k){
        if(index==nums.length){
            if(curr.size()==k){
                a.add(new ArrayList<>(curr));
            }
            return;
        }
        curr.add(nums[index]);
        subsequences(index+1,nums,curr,a,k);
        curr.remove(curr.size()-1);
        subsequences(index+1,nums,curr,a,k);
    }
}



//SOLUTION 2
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        combinations(1, n, k, curr, ans);
        return ans;
    }
    public void combinations(int start, int n, int k,List<Integer> curr,List<List<Integer>> ans) {
        if (curr.size() == k) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i = start; i <= n; i++) {
            curr.add(i);
            combinations(i + 1, n, k, curr, ans);
            curr.remove(curr.size() - 1);
        }
    }
}