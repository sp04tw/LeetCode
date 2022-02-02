class Solution {
    public int mySqrt(int x) {
        if(x==0) return x;
       int r=x,l=1,mid=0,ava=0;
       while(l<=r){
           mid=l+(r-l)/2;
           ava=x/mid;
           if(mid==ava) return mid;
           else if(mid>ava) r=mid-1;
           else l=mid+1;
       } 
       return r;
    }
}
