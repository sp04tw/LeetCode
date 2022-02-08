class Solution {
    public boolean judgeSquareSum(int c) {
        int sqrt=(int) Math.sqrt(c);
        int initial=0;
        while(initial<=sqrt){
            int sum=sqrt*sqrt+initial*initial;
            if(sum==c) return true;
            if(sum<c) initial++;
            if(sum>c) sqrt--;
        }
        return false;
    }
}
