class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        Collections.sort(dictionary);
        String result=new String();
        int index=0,max=0;
        char[] charS=s.toCharArray();
        for(String dict : dictionary){
            char[] charDict=dict.toCharArray();
            int dictPoint=0,sPoint=0,dicLength=charDict.length;
            while(dictPoint<charDict.length && sPoint<charS.length){                
                if(charDict[dictPoint]==charS[sPoint]) {
                    dictPoint++;
                    sPoint++;
                    dicLength--;
                }
                else sPoint++;
            }
            if(dicLength==0) {
                if(charDict.length>max){
                max=charDict.length;
                result=dictionary.get(index);}
            }
            index++;            
        }
        return result;
    }
}
