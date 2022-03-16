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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        boolean inOrder=true;
        while(!queue.isEmpty()){
            //System.out.println(inOrder);
            List<Integer> list=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode cur=queue.poll();
                //System.out.println(cur.val);
                list.add(cur.val);
                if(cur.left!=null) queue.offer(cur.left);
                if(cur.right!=null) queue.offer(cur.right);
            }
            
            if(inOrder) inOrder=false;
            else {
                swap(list);
                inOrder=true;
            }
            //System.out.println(list);
            result.add(list);
        }
        return result;
    }
    private void swap(List<Integer> list){
        int start=0,end=list.size()-1;
        while(start<end){
            int tmp=list.get(start);
            list.set(start,list.get(end));
            list.set(end,tmp);
            start++;
            end--;
        }
    }
    //Implement TreeNode root
    TreeNode rLB=new TreeNode(15);
    TreeNode rRB=new TreeNode(7);
    TreeNode r=new TreeNode(20,rLB,rRB);
    TreeNode l=new TreeNode(9);
    TreeNode root=new TreeNode(3,l,r);
    //create expect
    List<List<Integer>> testCase=inputList();
    //test
    String answer=test(testCase,zigzagLevelOrder(root));
    //Implement test suit
    private String test(List<List<Integer>> input,List<List<Integer>> output){
        if(input.equals(output)){
            System.out.println("Passed");
            return "Passed";
        }
        else{
            System.out.println("Failed");
            return "Failed";
        }
    }
    //Implement input List
    private List<List<Integer>> inputList(){
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        list.add(3);
        result.add(list);
        list=new ArrayList<>();
        list.add(20);
        list.add(9);
        result.add(list);
        list=new ArrayList<>();
        list.add(15);
        list.add(7);
        result.add(list);
        return result;
    }
}
