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
    public int rob(TreeNode root) {
        int[] options = travel(root);
        return Math.max(options[0], options[1]);
    }
    public int[] travel(TreeNode root){
        if(root == null){
            return new int[2];
        }
        int[] leftoption = travel(root.left);
        int[] rightoption = travel(root.right);
        int[] options = new int[2];
        options[0] = root.val + leftoption[1] + rightoption[1];
        options[1] = Math.max(leftoption[0], leftoption[1]) + Math.max(rightoption[0], rightoption[1]);
        return options;
    }
}