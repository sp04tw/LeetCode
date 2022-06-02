class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        Map<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])) continue;
            int minLeng=map.getOrDefault(nums[i]-1,0);
            int maxLeng=map.getOrDefault(nums[i]+1,0);
            int length=maxLeng+minLeng+1;
            set.add(nums[i]);
            map.put(nums[i],length);
            map.put(nums[i]-minLeng,length);
            map.put(nums[i]+maxLeng,length);
            //System.out.println(map);
            max=Math.max(max,length);
        }
        //System.out.println(map);
        return max;
    }
}
