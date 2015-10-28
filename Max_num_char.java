package geeks_prac;
import java.util.*;

// The program finds the maximum repeated character
public class Max_num_char {
    
		@SuppressWarnings("rawtypes")
		public static void main(String[] args) {
	        // TODO Auto-generated method stub

	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the string");
	        String input = scan.nextLine();
	        Hashtable<Character,Integer> countable = new Hashtable<Character,Integer>();
	        for(int i=0;i<input.length();i++)
	        {
	        char st = input.charAt(i);
	        if(countable.containsKey(st))
	        {
	            countable.put(st,countable.get(st)+1);
	        }
	        else
	        {
	            countable.put(st,1);
	        }
	        }
	        
	        	System.out.println(countable);
	        	int max =1;
	        	char maxchar = 0;
	        for(int i=0;i<input.length();i++)
	        {
	        	char st=input.charAt(i);
	        	if(countable.containsKey(st))
	        	{
	        		if(countable.get(st) > max)
	        		{
	        			max = countable.get(st);
	        			maxchar = st;      			
	        		}
	        	}
	        }
	        
	        System.out.println("Mostly repeated character");
	        System.out.println(maxchar);
	        
	           
	    }

	}

