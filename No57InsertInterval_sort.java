class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] mergInterval=new int[intervals.length+1][2];
        for(int i=0;i<intervals.length;i++){
            mergInterval[i]=intervals[i];
        }
        mergInterval[intervals.length]=newInterval;
        Arrays.sort(mergInterval,(a,b)->a[0]-b[0]);
        int point=mergInterval[0][0];
        int max=mergInterval[0][1];
        int index=0;
        List<int[]> list=new ArrayList<>();
        list.add(new int[]{point,max});
        for(int i=1;i<mergInterval.length;i++){
            if(mergInterval[i][0]<=max){
                max=Math.max(max,mergInterval[i][1]);
                list.remove(index);
            }
            else{
                point=mergInterval[i][0];
                max=mergInterval[i][1];
                index++;
            }
            list.add(new int[]{point,max});
        }
        return list.toArray(new int[list.size()][2]);
    }
}
