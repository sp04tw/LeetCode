class Solution {
    public int[][] reconstructQueue(int[][] people) {
        int length=people.length;
        int[][] result=new int[length][2];
        Arrays.sort(people, (a,b)->a[0]==b[0]?a[1]-b[1]:b[0]-a[0]);
        List<int[]> list=new ArrayList<>();
        for(int i=0;i<length;i++){
            //System.out.println(people[i][0]+" "+people[i][1]);
            list.add(people[i][1],people[i]);
        }
        for(int i=0;i<people.length;i++){
            result[i]=list.get(i);
        }        
        return result;
    }
}
