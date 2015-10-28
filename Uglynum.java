package geeks_prac;
import java.util.*;

//Program to identify ugly numbers
public class Uglynum {
	
	
	public static void main(String args[])
	{
		int ugly[] = new int[151];
	    int i2= 0;
	    int i3 = 0;
	    int i5 = 0;
	    ugly[0] = 1;
	    int next_ugly_number = 0;
	    int next_ugly_multiple_of_2,next_ugly_multiple_of_3,next_ugly_multiple_of_5;
	    next_ugly_multiple_of_2 = ugly[i2]*2;
	    next_ugly_multiple_of_3 = ugly[i3]*3;
	    next_ugly_multiple_of_5 = ugly[i5]*5;
	    int i;
	    for(i=1;i<9;i++)
	    {
	    next_ugly_number = Math.min(next_ugly_multiple_of_2,Math.min(next_ugly_multiple_of_3,next_ugly_multiple_of_5));
	   
	    ugly[i] = next_ugly_number;
	    
	    if(next_ugly_number == next_ugly_multiple_of_2)
	    {
	    i2 = i2+1;
	    next_ugly_multiple_of_2 = ugly[i2] * 2;
	    }
	    
	    if(next_ugly_number == next_ugly_multiple_of_3)
	    {
	    i3 = i3+1;
	    next_ugly_multiple_of_3 = ugly[i2] * 3;
	    }
	    
	    if(next_ugly_number == next_ugly_multiple_of_5)
	    {
	    i5 = i5+1;
	    next_ugly_multiple_of_5 = ugly[i2] * 5;
	    }
	    
	    } //End of for loop
	    
	    System.out.println(next_ugly_number);
	    
	}

}
