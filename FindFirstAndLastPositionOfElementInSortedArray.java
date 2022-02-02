class Solution {
    public int[] searchRange(int[] nums, int target) {
        //[5,7,7,8,10]  target:8 result: [3,3]
        //[1]  target:1 result: [0,0]
        if(nums.length==0 || nums==null) return new int[]{-1,-1};
        int[] result=new int[]{-1,-1};
        int l=0,r=nums.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]<target) l=mid+1;
            else r=mid;
        }
        if(nums[l]==target) result[0]=l;
        l=0;
        r=nums.length-1;
        while(l<r){
            int mid=l+(r-l+1)/2;
            if(nums[mid]>target) r=mid-1;
            else l=mid;
        }
        if(nums[l]==target) result[1]=l;
        return result;
    }
}
