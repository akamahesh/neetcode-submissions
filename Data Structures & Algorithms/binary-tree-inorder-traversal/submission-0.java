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
    
    private List<Integer> traversal;
    public List<Integer> inorderTraversal(TreeNode root) {
        traversal = new ArrayList<Integer>();
        inorderTraverse(root);
        return traversal;
    }

    public void inorderTraverse(TreeNode node){
        if(node == null){
            return;
        }
        inorderTraverse(node.left);
        traversal.add(node.val);
        inorderTraverse(node.right);
    }
}