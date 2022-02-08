class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int rightPoint=0,leftPoint=numbers.length-1;
        boolean flag=true;
        while(rightPoint<leftPoint){
            int sum=numbers[rightPoint]+numbers[leftPoint];
            if(sum==target) break;
            else if(sum>target) leftPoint--;
            else rightPoint++;            
        }
        
        return new int[]{rightPoint+1, leftPoint+1};
    }
}
