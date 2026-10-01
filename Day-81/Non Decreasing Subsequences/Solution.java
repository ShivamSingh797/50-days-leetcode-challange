class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> curr = new ArrayList<>();
        subsequence(0, Integer.MIN_VALUE, nums, curr, set);
        return new ArrayList<>(set);
    }
    public void subsequence(int index, int prev, int[] nums,
                            List<Integer> curr,
                            Set<List<Integer>> set) {
        if (index == nums.length) {
            if (curr.size() >= 2) {
                set.add(new ArrayList<>(curr));
            }
            return;
        }
        if (nums[index] >= prev) {
            curr.add(nums[index]);
            subsequence(index + 1, nums[index],
                        nums, curr, set);
            curr.remove(curr.size() - 1);
        }
        subsequence(index + 1, prev,
                    nums, curr, set);
    }
}