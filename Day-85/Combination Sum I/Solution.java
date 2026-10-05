class Solution {
    public List<List<Integer>> combinationSum(int[] candidates,int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        combination(0,target,candidates,res,curr);
        return res;
    }
    public void combination(int index,int target,int[] candidates,List<List<Integer>> res,List<Integer> curr){
        int n=candidates.length;
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(index==n){
            return;
        }
        if(target>=candidates[index]){
            curr.add(candidates[index]);
            combination(index,target-candidates[index],candidates,res,curr);
            curr.remove(curr.size()-1);
        }
        combination(index+1,target,candidates,res,curr);
    }
}