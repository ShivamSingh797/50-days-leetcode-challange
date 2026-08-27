/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root.val==p.val || root.val==q.val){
            return root;
        }
        if((p.val>root.val && q.val<root.val) || (p.val<root.val && q.val>root.val)){
            return root;
        }
        if(p.val>root.val && q.val>root.val){
            TreeNode lca1=lowestCommonAncestor(root.right,p,q);
            if(lca1!=null){
                return lca1;
            }
        }
        if(p.val<root.val && q.val<root.val){
            TreeNode lca2=lowestCommonAncestor(root.left,p,q);
            if(lca2!=null){
                return lca2;
            }
        }
        return null;
    }
}