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
class Pair {
    TreeNode node;
    int row;
    int hd;

    Pair(TreeNode node, int row, int hd) {
        this.node = node;
        this.row = row;
        this.hd = hd;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        Map<Integer, Map<Integer, PriorityQueue<Integer>>> mp = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0, 0));
        while(!q.isEmpty()) {

            Pair p = q.poll();
            TreeNode curr = p.node;
            int row = p.row;
            int data = p.hd;

            if(!mp.containsKey(data)) {
                mp.put(data, new TreeMap<>());
            }
            if(!mp.get(data).containsKey(row)) {
                mp.get(data).put(row, new PriorityQueue<>());
            }
            mp.get(data).get(row).add(curr.val);
            if(curr.left != null) {
                q.add(new Pair(curr.left, row + 1, data - 1));
            }
            if(curr.right != null) {
                q.add(new Pair(curr.right, row + 1, data + 1));
            }
        }

        for(Map<Integer, PriorityQueue<Integer>> rows : mp.values()) {
            List<Integer> list = new ArrayList<>();
            for(PriorityQueue<Integer> pq : rows.values()) {
                while(!pq.isEmpty()) {
                    list.add(pq.poll());
                }
            }
            ans.add(list);
        }
        return ans;
    }
}