class Solution {
    public int maxArea(int[] height) {
        if(height.length==1) return 0;
        int max=0,left=0,right=height.length-1;
        while(left<right){
            if(height[left]<height[right]){
                max=Math.max(max,height[left]*(right-left));
                left++;
            }
            else{
                max=Math.max(max,height[right]*(right-left));
                right--;
            }
            //System.out.println("left:"+height[left]+" right:"+height[right]+" max:"+max);
        }
        return max;
    }
}
