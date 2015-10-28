//Program computes the min stack

class MinStack {
    
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        
        
    public void push(int x) {
        
        if(x <= getMin())
        {
            
            s2.push(x);
        }
         s1.push(x);
    }

    public void pop() {
        
        int y = s1.pop();
        if(y == getMin())
        {
            s2.pop();
        }
       
        
    }

    public int top() {
        return s1.peek();
    }

    public int getMin() {
        if(s2.isEmpty())
        {
            return Integer.MAX_VALUE;
        }
        else
        {
            return s2.peek();
        }
    }
}
