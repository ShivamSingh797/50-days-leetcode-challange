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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        if (root == null) {
            return arr;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean var = true;
        while (!q.isEmpty()) {

            ArrayList<Integer> a = new ArrayList<>();
            int count = q.size();
            for (int i=0;i<count;i++) {
                TreeNode curr = q.poll();
                a.add(curr.val);

                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            if (!var) {
                Collections.reverse(a);
            }
            arr.add(a);
            var = !var;
        }
        return arr;
    }
}