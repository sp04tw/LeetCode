class Solution {
    public int maxDepth(String s) {
        int count=0,depth=0;
        for(char subC:s.toCharArray()){
            if(subC=='('){
                depth++;
                count=Math.max(count,depth);
            }
            else if(subC==')'){
                depth--;
            }
        }
        return count;
    }
}

/* Stack
class Solution {
    public int maxDepth(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        int count=0;
        for(char subC:s.toCharArray()){
            if(subC=='('){
                stack.push(subC);
                count=Math.max(count,stack.size());
            }
            else if(subC==')' && !stack.isEmpty()){
                stack.pop();
            }
        }
        return count;
    }
}
*/
