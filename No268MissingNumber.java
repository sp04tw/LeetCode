class Solution {
    public int missingNumber_OneByOne(int[] nums) {
        //approach1. sort first, then I compare one by one, if the current element is not previous element +1, return the number
        // time complexity is o(n) and space is O(1)
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            System.out.println(nums[i]+" "+nums[i-1]);
            if(nums[i-1]!=nums[i]-1) return nums[i]-1;
        }
        return 0;
    }
    public int missingNumber_BinarySearch(int[] nums) {
        //approach2. sort first, then process binary search
        // time complexity is O(n) and spect  is O(1)
        Arrays.sort(nums);
        int left=0,right=nums.length-1;
        while(left<=right){
            //if(nums[mid]>mid)-->missing number is at right-->left forward to mid
            //if(nums[mid]=<mid)-->missing number is at left-->right forward to mid
            int mid=left+(right-left)/2;
            //System.out.println("left:"+left+"right:"+right+"mid:"+mid);
            if(nums[mid]>mid) right=mid-1;   //[0,1,3,4,5,6,7,8]
            else{                             //[0,1,2,3,4,5,6,7,9],[0,1,2,3,4,6,7,8]
                left=mid+1;
            }
        }
        return left;
    }
    public int missingNumber_Sumamtion(int[] nums){
        int top=1,base=nums.length,h=nums.length/2;
        int sum=(top+base)*h;
        if(nums.length%2>0) sum +=h+1;
        int fSum=0;
        for(int num:nums){
            fSum +=num;
        }
        return sum-fSum;
    }
}
