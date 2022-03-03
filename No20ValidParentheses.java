class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(map.containsKey(c)){
                stack.push(map.get(c));
            }
            else{
                if(stack.size()==0 ||stack.pop()!=c) return false;
            }
        }
        return stack.size()==0;
    }
}
