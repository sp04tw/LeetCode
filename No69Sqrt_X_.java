class Solution {
    public int mySqrt_divide(int x) {
        int result=0;
        //binary search
        //approach  1~x
        //  x=n*n-->n=x/n
        //  product=mid*mid-->mid=product/mid;
        // if(x/mid==mid) return mid;
        // if(x/mid>mid) left=mid+1;
        // if(x/mid<mid) right=mid;
        //test case
        // sqrt && odd*
        // sqrt && even*
        // !sqrt && odd*
        // !sqrt && even*
        // larger
        // smaller
        
        if(x==0 || x==1) return x;
        int left=0,right=x;
        while(left<right){
            int mid=left+(right-left)/2;
            int quot=x/mid;
            //System.out.println("left:"+left+" right:"+right+" mid:"+mid+" quot:"+quot);
            if(quot==mid) return mid;
            else if(quot>mid) left=mid+1;
            else right=mid;
        }
        
        return left-1;
    }
    public int mySqrt_mutiply(int x){
        int result=0;
        //binary search
        //approach1  0~x/2<--X
        //approach2  0~x
        
        if(x==0 || x==1) return x;
        int left=0,right=x;
        while(left<right){
            int mid=left+(right-left)/2;
            long product=(long)mid*mid;
            //System.out.println("left:"+left+" right:"+right+" mid:"+mid+" prod:"+product);
            if(product==x) return mid;
            else if(product>x) right=mid;
            else left=mid+1;
        }
        
        return left-1;
    }
    
}
