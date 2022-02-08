class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list=new ArrayList<>();
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }     
        for(int i=0;i<nums.length;i++){
            result[i]=list.get(i);
        }
        return result;
    }
    
}
