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
    public int sumNumbers(TreeNode root) {
        //bfs
        if(root==null) return 0;
        Queue<TreeNode> queue=new LinkedList<>();
        Queue<Integer> num=new LinkedList<>();
        queue.offer(root);
        num.offer(0);
        List<Integer> list=new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode cur=queue.poll();
            int curNum=num.poll()*10+cur.val;
            if(cur.left==null && cur.right==null){
                list.add(curNum);
            }
            if(cur.left!=null){
                queue.offer(cur.left);
                num.offer(curNum);
            }
            if(cur.right!=null){
                queue.offer(cur.right);
                num.offer(curNum);
            }
            
        }
        //System.out.println(list);
        int sum=0;
        for(int i:list){
            sum +=i;
        }
        return sum;
    }
}
