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
        if(root==null) return new ArrayList<>();
        List<Integer> result=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            int value=0;
            for(int i=0;i<size;i++){
                TreeNode cur=queue.poll();
                if(cur.left!=null) queue.offer(cur.left);
                if(cur.right!=null) queue.offer(cur.right);
                value=cur.val;
            }
            result.add(value);
        }
        return result;
    }
    
    TreeNode rRB=new TreeNode(4);
    TreeNode r=new TreeNode(3,null,rRB);
    TreeNode lRB=new TreeNode(5);
    TreeNode l=new TreeNode(2,null,lRB);
    TreeNode root=new TreeNode(1,l,r);
    List<Integer> expect=list();
    String testCase=test(expect,rightSideView(root));
    
    public List<Integer> list(){
        List<Integer> result=new ArrayList<>();
        result.add(1);
        result.add(3);
        result.add(4);
        return result;
    }
    public String test(List<Integer> input,List<Integer> output){
        if(input.equals(output)){
            System.out.println("Passed");
            return "Passed";
        }
        else{
            System.out.println("Failed");
            return "Failed";
        }
    }
}
