/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        Stack<TreeNode> st = new Stack<>();
        Stack<Integer> sum = new Stack<>();
        st.push(root);
        sum.push(targetSum - root.val);
        while (!st.isEmpty()) {
            TreeNode curr = st.pop();
            int remaining = sum.pop();
            if (curr.left == null && curr.right == null) {
                if (remaining == 0) {
                    return true;
                }
            }
            if (curr.right != null) {
                st.push(curr.right);
                sum.push(remaining - curr.right.val);
            }
            if (curr.left != null) {
                st.push(curr.left);
                sum.push(remaining - curr.left.val);
            }
        }
        return false;
    }
}