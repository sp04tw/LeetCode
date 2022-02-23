class Solution {
    public int titleToNumber(String columnTitle) {
        //BA
        //B: 2
        //BA: 2*26+1
        int sum=0;
        for(int i=0;i<columnTitle.length();i++){
            sum=(columnTitle.charAt(i)-'A'+1)+sum*26;
        }
        
        return sum;
    }
}
