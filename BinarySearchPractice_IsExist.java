//int[] arr=new int[]{1,2,3,5,5,6,7};
//int k=5;
Class Solution{
  public boolean IsExist(int[] arr, int k){
    int left=0,right=arr.length-1;
    while(left<=right){
      int mid=left+(right-left)/2;
      if(arr[mid]==k) return true;
      else if(arr[mid]>k) right=mid-1;
      else left=mid+1;
    }
    return false;
  }
}
