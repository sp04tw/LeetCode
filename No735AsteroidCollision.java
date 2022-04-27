class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        /*test Case:
        [10,5,-10,11,12] expect: [11,12]
        [-10,11,12] expect: [-10,11,12]
        just only top of stack is positive and current element is negative, they will meet
        */
        //traversal elements of asteroids
        //stack LIFO
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<asteroids.length;i++){
            int cur=asteroids[i];
            boolean flag=true;
            while(!stack.isEmpty() && stack.peek()>0 && cur<0 && flag){
                int top=stack.peek();                
                //cur<top-->false
                //cur==top--> false + pop
                //cur>top --> pop
                if(Math.abs(cur)<Math.abs(top)) flag=false;
                else if(Math.abs(cur)==Math.abs(top))
                {
                    flag=false;
                    stack.pop();
                }
                else stack.pop();
            }
            if(flag) stack.push(cur);
        }
        int length=stack.size();
        int[] result=new int[length];
        for(int i=length-1;i>=0;i--){
            int top=stack.pop();
            result[i]=top;
        }
        
        return result;
    }
}
