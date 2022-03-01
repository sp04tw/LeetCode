class Solution {
    public int maxProfit(int[] prices) {
        //[1,2,3,4,5]
        int max=0,index=1,left=0;
        while(index<prices.length){
            if(prices[left]<prices[index]) max=Math.max(max,prices[index]-prices[left]);
            else left=index;
            index++;
        }
        return max;
    }
}
