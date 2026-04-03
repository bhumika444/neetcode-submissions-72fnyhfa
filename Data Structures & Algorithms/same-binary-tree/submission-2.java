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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue <TreeNode> pQ = new LinkedList<>();
        Queue <TreeNode> qQ = new LinkedList<>();
        pQ.offer(p);
        qQ.offer(q);
        while (!pQ.isEmpty() && !qQ.isEmpty())
        {
            // int i=0;
            int psize = pQ.size();
            // int qsize = qQ.size();
            for(int i=psize; i>0;i--)
            {
                TreeNode n1 = pQ.poll();
                TreeNode n2 = qQ.poll();
                if(n1==null && n2==null)
                    continue;
                if(n1==null || n2==null || n1.val!=n2.val)
                    return false;
                pQ.offer(n1.left);
                pQ.offer(n1.right);
                qQ.offer(n2.left);
                qQ.offer(n2.right);
                
            }
            // i++;
        }
        return true;
    }
}
