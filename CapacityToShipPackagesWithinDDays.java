class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=weights[0],right=0;
        for(int w:weights){
            right +=w;
            left=Math.max(left,w);
        }
        while(left<right){
            //如果true,表示大於days，表示可以提升capacity的容量，
            //把mid往右邊移動就可以提升capacity，所以要把left往右邊移動
            int mid=left+(right-left)/2;
            if(capacityFlag(weights, mid, days)){
                left=mid+1;
            }
            else right=mid;
        }
        return left; 
    }
    
    public boolean capacityFlag(int[] weights, int mid, int days){
        int sum=0,dayCount=1;
        for(int i=0;i<weights.length;i++){
            if((sum+weights[i])>mid){
                sum=0;
                dayCount++;
            }
            sum +=weights[i];
        }
        return dayCount>days?true:false;
    }
}