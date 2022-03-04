class Solution {
    public int dominantIndex(int[] nums) {
        int index=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                index=i;
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]*2>max && i!=index) return -1;
        }
        return index;
    }
}
