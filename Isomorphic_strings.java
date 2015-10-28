// Function to check for isomorphic strings

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        if(s==null && t==null)
        {
            return true;
        }
        
        int[] S = new int[256];
        int[] T = new int[256];
        int i;
        for(i=0;i<256;i++)
        {
            S[i] = -1;
            T[i] = -1;
        }
       
        
        for(i=0;i<s.length();i++)
        {
            int s_char = (int)s.charAt(i);
            int t_char = (int)t.charAt(i);
            
            if(S[s_char] == -1 && T[t_char]== -1)
            {
                S[s_char] = t_char;
                T[t_char] = s_char;
            }
            else if(S[s_char] != t_char && T[t_char] != s_char)
            {
                return false;
            }
            
            
        }
        return true;
        
    }
}