class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        //build graph-->graph(List<String> wordList)
        //check beginWord in wordList
        if(!wordList.contains(beginWord)) wordList.add(beginWord);
        //check endWord
        if(!wordList.contains(endWord)) return 0;
        //invoke graph
        Map<String,List<String>> map=graph(wordList);
        
        //check wordList is in graph
        //create Queue and initialize with beginWord, queue is in order to keep word, check the endWord is in queue
        Queue<String> queue=new LinkedList<>();
        queue.offer(beginWord);
        //create Set to keep the word is visited
        Set<String> set=new HashSet<>();
        set.add(beginWord);
        //create a count to calculate, and initialize with 1
        int count=1;
        
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                String cur=queue.poll();
                if(cur.equals(endWord)) return count;
                List<String> list=map.getOrDefault(cur,new ArrayList<>());
                for(String subList:list){
                    if(!set.contains(subList)){
                        queue.offer(subList);
                        set.add(subList);
                    }
                }
            }
            count++;
        }
        
        return 0;
    }
    
    public Map<String,List<String>> graph(List<String> wordList){
        Map<String,List<String>> result=new HashMap<>();
        //compare two string each time to check do they just only one word different
        for(int i=0;i<wordList.size()-1;i++){
            for(int j=1;j<wordList.size();j++){
                String s1=wordList.get(i), s2=wordList.get(j);
                //compare two string
                if(compare(s1,s2)){
                    result.computeIfAbsent(s1,k->new ArrayList<>()).add(s2);
                    result.computeIfAbsent(s2,k->new ArrayList<>()).add(s1);
                }
            }
        }
        return result;
    }
    public boolean compare(String s1,String s2){
        int diff=0;
        //endWord.length==beginWord.length
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)) diff++;
        }
        return diff==1;
    }
}
