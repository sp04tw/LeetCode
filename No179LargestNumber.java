class Solution {
    public String largestNumber(int[] nums) {
        if(nums.length==1) return String.valueOf(nums[0]);
        int mid=nums.length/2;
        int[] left=divide(nums,0,mid);
        int[] right=divide(nums,mid,nums.length);
        int result[]=merge(left,right);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<result.length;i++){
            if(i==0 && result[i]==0) return new String("0");
            sb.append(result[i]);
        }
        return sb.toString();
    }
    
    private int[] divide(int[] inNums,int start,int end){
        if(end-start<=1) return new int[]{inNums[start]};       
        int[] result=new int[end-start];
        int index=0;
        while(index<end-start){
            result[index]=inNums[start+index];
            index++;
        }
        int mid=result.length/2;        
        int[] left=divide(result,0,mid);
        int[] right=divide(result,mid,result.length);
        return merge(left,right);
    }
    
    private int[] merge(int[] left,int[] right){
        int[] result=new int[left.length+right.length];
        int leftP=0,rightP=0,index=0;
        while(leftP<left.length && rightP<right.length){
            long leftS=(long)left[leftP]*(long)Math.pow(10,countLength(right[rightP]))+(long)right[rightP];
            long rightS=(long)right[rightP]*(long)Math.pow(10,countLength(left[leftP]))+(long)left[leftP];
            if(leftS>rightS){
                result[index]=left[leftP];
                leftP++;
            }
            else{//leftS<=rightS
                result[index]=right[rightP];
                rightP++;
            }
            index++;
        }
        if(leftP<left.length){
            while(index<result.length){
                result[index]=left[leftP];
                leftP++;
                index++;
            }
        }
        if(rightP<right.length){
            while(index<result.length){
                result[index]=right[rightP];
                rightP++;
                index++;
            }
        }
        
        return result;
    }
    
    private int countLength(int num){
        int count=1, divi=num/10;
        while(divi>=1){
            divi=divi/10;
            count++;
        }
        return count;
    }
}
