class Solution {
    public int[][] reconstructQueue(int[][] people) {
        int length=people.length;
        int[][] result=new int[length][2];
        Arrays.sort(people, (a,b)->a[1]-b[1]);
        List<int[]> list=new ArrayList<>();
        for(int i=0;i<length;i++){
            int count=0;
            int index=0;
            for(int j=0;j<i;j++){
                if(people[j][0]>=people[i][0]) count++;
            }
            index=i+(people[i][1]-count);
            list.add(index,people[i]);
        }
        for(int i=0;i<people.length;i++){
            result[i]=list.get(i);
        }        
        return result;
    }
}
