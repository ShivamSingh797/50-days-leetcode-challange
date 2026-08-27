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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        if(root==null){
            return 0;
        }
        TreeNode temp=root;
        while(temp!=null || st.isEmpty()==false){
            while(temp!=null){
                st.push(temp);
                temp=temp.left;
            }
            temp=st.pop();
            arr.add(temp.val);
            temp=temp.right;
        }
        return arr.get(k-1);
    }
}