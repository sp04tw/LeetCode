class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //create a hashmap to keep each element and its next greater element from nums2
        Map<Integer,Integer> map=new HashMap<>();
        //create a stack to keep the greatest element
        Deque<Integer> stack=new ArrayDeque<>();
        //traverse nums2 from last one forward to first one
        //4,1,2,5,3
        for(int i=nums2.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<nums2[i]){
                stack.pop();
            }
            if(!stack.isEmpty() && stack.peek()>nums2[i]){
                map.put(nums2[i],stack.peek());
            }
            stack.push(nums2[i]);
        }
        int[] result=new int[nums1.length];
        //traversal all element of nums1
        for(int i=0;i<nums1.length;i++){
            //put the value of key is elenemt of nums1
            result[i]=map.getOrDefault(nums1[i],-1);
        }
        
        //return the reuslt
        return result;
    }
    
    int[] input=nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2});
    int[] expect=new int[]{-1,3,-1};
    boolean isSameLength=testLength(input,expect);
    boolean isSameContent=testContent(input,expect);
    
    public boolean testContent(int[] input, int[] expect){
        for(int i=0;i<expect.length;i++){
            if(input[i]!=expect[i]){
                System.out.println("Failed");
                return false;
            }
        }
        System.out.println("Passed");
        return true;
    }
    
    public boolean testLength(int[] input, int[] expect){
        if(input.length!=expect.length){
            System.out.println("Failed");
            return false;
        }
        System.out.println("Passed");
        return true;
    }
}
