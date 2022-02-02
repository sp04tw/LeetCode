class Solution {
    public boolean search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target) return true;
            if(nums[mid]==nums[l]) l++;
            else if(nums[mid]<=nums[r]){
                //right side
                if(nums[mid]<target && nums[r]>=target) l=mid+1;
                else r=mid-1;
            }
            else{
                //left side
                if(nums[mid]>target && nums[l]<=target) r=mid-1;
                else l=mid+1;
            }
        }
        return false;
    }
}
