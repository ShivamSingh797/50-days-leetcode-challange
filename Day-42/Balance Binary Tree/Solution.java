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
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return 1+Math.max(lh,rh);
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(q.isEmpty()==false){
            int count=q.size();
            for(int i=0;i<count;i++){
                TreeNode curr=q.poll();
                int heightleft=height(curr.left);
                int heightRight=height(curr.right);
                int x=heightleft-heightRight;
                if(Math.abs(x)>1){
                    return false;
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return true;
    }
}