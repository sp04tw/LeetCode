class Solution {
    public boolean divideArray_WihtIntegerArray(int[] nums) {
        //approach3 with int[]   92.41%
        int[] numI=new int[501];
        for(int i:nums){
            numI[i]++;
        }
        for(int i: numI ){
            if(i%2!=0) return false;
        }
        
        return true;
    }
    public boolean divideArray_WithMapEntrySet(int[] nums){     //14%
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue()%2!=0) return false;
        }
    }
    public boolean divideArray_WithMapValues(int[] nums){     //51%
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Integer i:map.values()){
            if(i%2!=0) return false;
        }
    }
}
