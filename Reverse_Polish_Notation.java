//Program to compute the reverse polish notation

public class Solution {
    public int evalRPN(String[] tokens) {
        
        String operators = "+-*/";
        Stack<String> stack = new Stack<String>();
        int returnval = 0;
        if(tokens == null)
        {
            return -1;
        }
        for(String t : tokens)
        {
            if(!operators.contains(t))
            {
                stack.push(t);
            }
            else
            {
                int n1 = Integer.valueOf(stack.pop());
                int n2 = Integer.valueOf(stack.pop());
                int index = operators.indexOf(t);
                switch(index)
                {
                    case 0 : stack.push(String.valueOf(n1+n2));
                    break;
                    
                    case 1: stack.push(String.valueOf(n2-n1));
                    break;
                    
                    case 2: stack.push(String.valueOf(n1*n2));
                    break;
                    
                    case 3: stack.push(String.valueOf(n2/n1));
                    break;
              }
                
                
            }
        }
        returnval = Integer.valueOf(stack.pop());
        return returnval;
        
        
        
    }
}