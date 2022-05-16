class Solution {
    public String getHint(String secret, String guess) {
        //create a map to keep value and index , value is the key and index is the value
        Map<Character,Integer> secretMap=new HashMap<>();
        int numA=0,numB=0;
        char[] charS=secret.toCharArray(),charG=guess.toCharArray();
        for(int i=0;i<charS.length;i++){
            if(charS[i]==charG[i]) numA++;
            else{
                int count=secretMap.getOrDefault(charS[i],0);
                count++;
                secretMap.put(charS[i],count);
            }
            
        }
        //System.out.println(keepValue);
        //inquire gusee
        for(int i=0;i<charG.length;i++){
            if(secretMap.containsKey(charG[i]) && charG[i]!=charS[i]){
                int count=secretMap.get(charG[i]);
                count--;
                numB++;
                if(count>0) secretMap.put(charG[i],count);
                else secretMap.remove(charG[i]);
            }
        }
        
        return numA+"A"+numB+"B";
    }
}
