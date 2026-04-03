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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot != null) return false;
        if(root != null && subRoot == null) return true;
        if(sametree(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

    }
    public boolean sametree(TreeNode root, TreeNode subRoot){
        Queue<TreeNode> p = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        p.offer(root);
        q.offer(subRoot);
        while(!p.isEmpty() || !q.isEmpty()){
            TreeNode n1 = p.poll();
            TreeNode n2 = q.poll();
            if(n1 == null && n2 == null) continue;
            if(n1 == null || n2 == null || n1.val != n2.val){
                return false;
            }
            p.offer(n1.left);
            p.offer(n1.right);
            q.offer(n2.left);
            q.offer(n2.right);
            
        }
        return true;
    }
}
