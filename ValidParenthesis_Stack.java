// Program to check for Valid Parenthesis

public class Solution {
    public boolean isValid(String s) {
        
        if (s.length() == 0) return true;
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length(); ++i){
        char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else if (stack.empty()) return false;
            else{
                char c2 = stack.pop();
                if(c2 == '(' && c != ')' || c2 == '{' && c != '}' || c2 == '[' && c != ']') return false;
            }
        }

        return stack.empty();
    }
}