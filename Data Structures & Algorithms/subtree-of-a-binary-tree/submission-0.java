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
        if(root==null && subRoot!=null)
            return false;
        if(subRoot==null)
            return true;
        // sametree(root,subRoot);
        // sameTree(root.left,subRoot)
        if(sametree(root,subRoot))
        {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right,subRoot);
    }
    private boolean sametree(TreeNode root, TreeNode subRoot)
    {
        Queue <TreeNode> pQ = new LinkedList<>();
        Queue <TreeNode> qQ = new LinkedList<>();
        pQ.offer(root);
        qQ.offer(subRoot);
        while(!pQ.isEmpty() || !qQ.isEmpty())
        {
            int size=pQ.size();
            for(int i=0;i<size;i++)
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
        }
        return true;
    }
}
