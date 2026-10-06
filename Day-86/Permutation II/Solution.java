class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>> has=new HashSet<>();
        recursive(0,nums,has);
        List<List<Integer>> ans=new ArrayList<>(has);
        return ans;
    }
    public void recursive(int index,int[] nums, HashSet<List<Integer>> has){
        if(index==nums.length){
            List<Integer> ds=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            has.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            recursive(index+1,nums,has);
            swap(i,index,nums);
        }
    }
    public void swap(int a,int b,int[] nums){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}