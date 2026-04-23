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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightSideList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode rightSide = null;
            int levelLength = queue.size();
            for(int i = 0; i < levelLength; i++){
                TreeNode curr = queue.poll();
                if(curr != null){
                    rightSide = curr;
                    queue.offer(curr.left);
                    queue.offer(curr.right);
                }
            }
            if(rightSide != null){
                rightSideList.add(rightSide.val);   
            }
        
        }
        return rightSideList;
    }
}
