class Solution {
    public int titleToNumber(String columnTitle) {
        //subChar-'A'+1
        //('Z'-'A'+1)*26^N
        int sum=0;
        for(int i=0;i<columnTitle.length();i++){
            sum+=(columnTitle.charAt(i)-'A'+1)*(int)Math.pow(26,(columnTitle.length()-1-i));
        }
        
        return sum;
    }
}
