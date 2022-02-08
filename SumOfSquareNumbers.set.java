class Solution {
    public boolean judgeSquareSum(int c) {
        int sqrt=(int) Math.sqrt(c);
        Set<Integer> set=new HashSet<>();
        int count=1;
        for(int i=sqrt;i>=0;i--){
            int pow=i*i;
            if(count==1 && (c-pow)==(i*i)) return true;
            if(set.contains(pow)) return true;
            else set.add(c-pow);
        }
        return false;
    }
}
