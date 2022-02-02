class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=0,r=nums.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if((mid%2==0 && nums[mid]==nums[mid+1]) ||(mid%2==1 && nums[mid]==nums[mid-1])){
                //length of right side is odd,
                l=mid+1;
            }
            else{
                //lenght of left side is odd
                r=mid;
            }
        }
        return nums[l];
    }
}
