class Solution {
    public boolean checkPossibility(int[] nums) {
        /*[i-2]<=[i]  --> [i-1]=[i]
          [i-2]>[i]   --> [i]=[i-1]
          [4,2,3]
          [4,2,1]
          [3,4,2,3]
          [3,4,2,5]
        */
        int count=0;
        for(int i=1;i<nums.length;i++){ //check nums[i]>nums[i-1]? from i=1 start
            if(nums[i]<nums[i-1]) {
                count++;                
                if(count>1) return false;
                if(i>1 && nums[i-2]<=nums[i]) nums[i-1]=nums[i];
                if(i>1 && nums[i-2]>nums[i]) nums[i]=nums[i-1];
            }
        }
        return true;
    }
}
