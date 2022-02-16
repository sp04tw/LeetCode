class Solution {
    public void sortColors(int[] nums) {
        int left=0,right=nums.length-1,index=0;
        while(index<=right){
            if(nums[index]==0){
                int tmp=nums[left];
                nums[left]=nums[index];
                nums[index]=tmp;
                left++;
                index++;
            }
            else if(nums[index]==1){
                index++;
            }
            else{//nums[index]==2
                int tmp=nums[right];
                nums[right]=nums[index];
                nums[index]=tmp;
                right--;
            }
        }
    }
}
