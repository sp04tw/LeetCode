class Solution {
    public int findKthLargest(int[] nums, int k) {
        int left=0,right=nums.length-1;
        QSort(nums,left,right,k-1);
        return nums[k-1];
    }
    
    private void QSort(int[] nums, int left, int right,int k){
        if(left<right){
            int q=partition(nums,left,right);
            if(q==k) return;
            else if(q>k) QSort(nums,left,q-1,k);
            else QSort(nums,q+1,right,k);
        }
    }
    
    private int partition(int[] nums, int left, int right){        
        int pivot=nums[right];
        int index=left-1;
        for(int i=left;i<=right-1;i++){
            if(nums[i]>=pivot){
                index++;
                swap(nums, i, index);
            }
        }
        swap(nums,index+1,right);
        return index+1;
    }
    
    private void swap(int[] nums, int left, int right){
        int tmp=nums[left];
        nums[left]=nums[right];
        nums[right]=tmp;
    }
}
