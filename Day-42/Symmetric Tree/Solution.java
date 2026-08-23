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
    public boolean levelSymm(ArrayList<Integer> li){
        int s=li.size();
        int l=0;
        int r=s-1;
        while(l<r){
            if(!Objects.equals(li.get(l), li.get(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(q.isEmpty()==false){
            int count=q.size();
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=0;i<count;i++){
                TreeNode curr=q.poll();
                if(curr == null){
                    arr.add(null);
                    continue;
                }
                arr.add(curr.val);
                q.add(curr.left);
                q.add(curr.right);
            }
            boolean b=levelSymm(arr);
            if(!b){
                return false;
            }
        }
        return true;
    }
}