//Method 1: Using Backtracking and loop to avoid duplicates
public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        combination(0,target,res,curr,candidates);
        return res;
    }
    public void combination(int index,int target,List<List<Integer>> res,List<Integer> curr,int[] candidates){
        int n=candidates.length;
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index;i<n;i++){
            if(i>index && candidates[i]==candidates[i-1]){
                continue;
            }
            if(candidates[i]>target){
                break;
            }
            curr.add(candidates[i]);
            combination(i+1,target-candidates[i],res,curr,candidates);
            curr.remove(curr.size()-1);
        }
    }
}


//Method 2: Using Backtracking and HashSet to avoid duplicates
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        HashSet<List<Integer>> res=new HashSet<>();
        List<Integer> curr=new ArrayList<>();
        combination(0,target,res,curr,candidates);
        List<List<Integer>> result = new ArrayList<>(res);
        return result;
    }
    public void combination(int index,int target,HashSet<List<Integer>> res,List<Integer> curr,int[] candidates){
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
            combination(index+1,target-candidates[index],res,curr,candidates);
            curr.remove(curr.size()-1);
        }
        combination(index+1,target,res,curr,candidates);
    }
}
