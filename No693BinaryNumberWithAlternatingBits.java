class Solution {
    public boolean hasAlternatingBits(int n) {
        return (n & n>>1)==0?true:false;
    }
}
