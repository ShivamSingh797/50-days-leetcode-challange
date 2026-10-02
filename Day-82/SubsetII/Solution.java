class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> has=new HashSet<>();
        ArrayList<Integer> curr =new ArrayList<>();
        subsequences(0,nums,has,curr);
        return new ArrayList<>(has);
        
    }
    public void subsequences(int index,int[] nums,HashSet<List<Integer>> has,ArrayList<Integer> curr){
        int n=nums.length;
        if(index>=n){
            has.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        subsequences(index+1,nums,has,curr);
        curr.remove(curr.size()-1);
        subsequences(index+1,nums,has,curr);
    }
}
