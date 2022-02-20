class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> list=new ArrayList<>();
        boolean flag=false;
        int point=intervals[0][1];
        int min=intervals[0][0],max=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=point){
                flag=true;
                max=Math.max(intervals[i][1],max);
            }
            else {
                if(flag) list.add(new int[]{min,max});
                else{
                    max=intervals[i-1][1];
                    min=intervals[i-1][0];
                    list.add(new int[]{min,max});
                }
                flag=false;
                max=intervals[i][1];
                min=intervals[i][0];
            }
            point=Math.max(intervals[i][1],point);
        }
        //last one
        list.add(new int[]{min,max});  
        
        return list.toArray(new int[list.size()][2]);
    }
}
