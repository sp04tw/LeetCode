class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //create a map to keep strings and key will be a string by restracture
        Map<String,List<String>> map=new HashMap<>();
        List<List<String>> result=new ArrayList<>();
        //traversal input strs
        for(String sub:strs){
            char[] subC=sub.toCharArray();
            Arrays.sort(subC);
            String str=String.valueOf(subC);
            List<String> subList=map.getOrDefault(str,new ArrayList<>());
            subList.add(sub);
            map.put(str,subList);
        }
        
        return new ArrayList<>(map.values());
    }
}
