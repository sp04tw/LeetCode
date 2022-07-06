class Solution {
    public boolean canConstruct_IntegerArray(String ransomNote, String magazine) {  //26ms
        int[] count=new int[26];
        for(char subC:magazine.toCharArray()){
            count[subC-'a']++;
        }
        for(char subC:ransomNote.toCharArray()){
            if(count[subC-'a']==0) return false;
            count[subC-'a']--;
        }
        return true;
    }
  
  public boolean canConstruct_HashMap(String ransomNote, String magazine) { //4ms
        Map<Character,Integer> map=new HashMap<>();
        for(char subC:magazine.toCharArray()){
            map.put(subC, map.getOrDefault(subC,0)+1);
        }
        for(char subC:ransomNote.toCharArray()){
            if(map.containsKey(subC)){
                if(map.get(subC)>1){
                    map.put(subC,map.get(subC)-1);
                }
                else if(map.get(subC)==1){
                    map.remove(subC);
                }
            }
               else return false;
        }
        //System.out.println(map);
        return true;
    }
  
  public boolean canConstruct_TwoPoints(String ransomNote, String magazine) { //5ms
        char[] ransomArr=ransomNote.toCharArray();
        char[] magazineArr=magazine.toCharArray();
        Arrays.sort(ransomArr);
        Arrays.sort(magazineArr);
        int count=0;
        int point1=0,point2=0;
        while(point1<ransomArr.length && point2<magazineArr.length){
            if((ransomArr[point1]-'a')<(magazineArr[point2]-'a')){
                point1++;
            }
            else if ((ransomArr[point1]-'a')>(magazineArr[point2]-'a')){
                point2++;
            }
            else{
                count++;
                point1++;
                point2++;
            }
        }
        return count==ransomArr.length;
    }
}
