class Solution {
    public String removeOuterParentheses(String s) {
        //(()()) | (()) | (()(()))
        //()() | () | ()(())
        Deque<Character> stack=new ArrayDeque<>();
        String result="";
        for(char sub:s.toCharArray()){
            if(sub=='(' && stack.isEmpty()){
                stack.push(sub);
            }
            else if(sub=='(' && !stack.isEmpty()){
                stack.push(sub);
                result +=sub;
            }
            else if(sub==')'&& stack.size()>1){
                //System.out.println("stackSize:"+stack.size());
                stack.pop();
                result +=sub;
            }
            else{// if(sub==')' && stack.size()==1){
                stack.pop();
            }
        }
        return result;
    }
}
