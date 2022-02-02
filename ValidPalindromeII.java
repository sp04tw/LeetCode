class Solution {
    public boolean validPalindrome(String s) {
        //"abcdkcba" true
        //"abcdpkcba"  false
        //"abcddkkcba" false
        //"abcddpkkcba"  false
        //deeee  true
        //"aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"  true
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) {
                return subPalindrome(s,left+1,right) || subPalindrome(s,left,right-1);
            }
            else{
                right--;
                left++;
            } 
        }
        return true;
    }
    private boolean subPalindrome(String s, int start, int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
