class Solution {
    public int[] plusOne(int[] digits) {
        int num=digits[digits.length-1]+1;
        boolean carry=false;
        if(num>=10){
            carry=true;
            digits[digits.length-1]=num-10;
        }
        else digits[digits.length-1]=num;
        
        for(int i=digits.length-2;i>=0;i--){
            num=digits[i];
            if(carry){
                num++;
                carry=false;
                if(num>=10) {
                    carry=true;
                    digits[i]=num-10;
                }
                else digits[i]=num;
            }
        }
        
        if(!carry) return digits;
        int[] result=new int[digits.length+1];
        result[0]=1;
        for(int i=0;i<digits.length;i++){
            result[i+1]=digits[i];
        }
        return result;
    }
}
