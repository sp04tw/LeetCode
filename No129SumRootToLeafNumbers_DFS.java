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
    int sum=0;
    public int sumNumbers(TreeNode root) {
        //dfs
        if(root==null) return 0;
        dfs(root,0);
        return sum;
    }
    
    public void dfs(TreeNode node,int num){
        num= num*10+node.val;
        if(node.left==null && node.right==null) {
            sum +=num;
            return;
        }
        if(node.left!=null) dfs(node.left,num);
        if(node.right!=null) dfs(node.right,num);
    }
}
