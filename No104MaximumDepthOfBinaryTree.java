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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int result=0;
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode cur=queue.poll();
                if(cur.left!=null) queue.offer(cur.left);
                if(cur.right!=null) queue.offer(cur.right);
            }
            result++;
        }
        return result;
    }
    TreeNode testRightL=new TreeNode(15);
    TreeNode testRightR=new TreeNode(7);
    TreeNode testRight=new TreeNode(20,testRightL,testRightR);
    TreeNode testLeft=new TreeNode(9);
    TreeNode testRoot=new TreeNode(3,testLeft,testRight);
    int result=test(maxDepth(testRoot),3);
    public int test(int answer,int expected){
        if(answer==expected) System.out.println("successed");
        else System.out.println("failed");
        return 0;
    }
}
