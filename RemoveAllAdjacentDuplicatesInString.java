class Solution {
    public String removeDuplicates(String s) {
        int left=0,right=0;
        char[] c=s.toCharArray();
        while(right<s.length()){
            if(left==0 || c[left-1]!=c[right] ){
                c[left]=c[right];
                left++;
                right++;
            }
            else{
                right++;
                left--;
            }
        }
        return new String(c,0,left);
    }
}