class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=0,r=arr.length-1;
        while(l<r){ //model2-1
            int mid=l+(r-l)/2;
            //[1,2,3,5,6,4,1,0]
            //if arr[mid]<arr[mid-1] discrease
            //if arr[mid]>arr[mid+1] discrease
            //if arr[mid]>arr[mid-1] increase
            //if arr[mid]<arr[mid+1] increase
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
            else{
                if(arr[mid]>arr[mid-1]) l=mid;
                else r=mid+1;
            }
        }
        return l;
    }
}
