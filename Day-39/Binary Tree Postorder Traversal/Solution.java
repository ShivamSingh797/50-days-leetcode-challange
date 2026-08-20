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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<Pair<TreeNode,Integer>> st=new Stack<>();
        List<Integer> pre=new ArrayList<>();
        List<Integer> in=new ArrayList<>();
        List<Integer> post=new ArrayList<>();
        if(root==null){
            return post;
        }
        st.push(new Pair<>(root,1));
        while(st.isEmpty()==false){
            Pair<TreeNode, Integer> p = st.pop();
            if(p.getValue()==1){
                pre.add(p.getKey().val);
                int state = p.getValue();
                state++;
                st.push(new Pair<>(p.getKey(),state));
                if(p.getKey().left!=null){
                    st.push(new Pair<>(p.getKey().left,1));
                }
            }else if(p.getValue()==2){
                in.add(p.getKey().val);
                int state = p.getValue();
                state++;
                st.push(new Pair<>(p.getKey(),state));
                if(p.getKey().right!=null){
                    st.push(new Pair<>(p.getKey().right,1));
                }
            }else{
                post.add(p.getKey().val);
            }
        }
        return post;
    }
}