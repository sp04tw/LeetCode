class Solution {
    public void moveZeroes(int[] nums) {
        //同向
        int left=0,right=0;
        while(right<nums.length){
            if(nums[right]!=0){
                nums[left]=nums[right];
                left++;
            }
            right++;  
        }
        Arrays.fill(nums,left,nums.length,0);
    }
}
